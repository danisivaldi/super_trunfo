package super_trunfo;

import java.util.ArrayList;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * classe que representa a mão do jogador.
 * no caso de dois jogadores, a mão incia com metade do baralho.
 * a estrutura 'fila' ou 'queue' é usada, pois as cartas saem do topo para serem jogadas
 * e entram no fim quando a rodada é vencida.
 *
 * @author Daniel Sivaldi Feres 9912275
 *
 */
public class Mao {
	Queue<Carta> mao = new ConcurrentLinkedQueue<Carta>();
	
	/**
	 * construtor da mão, que recebe as cartas entre 'start' até 'end'.
	 * @param baralho - baralho do jogo.
	 * @param start - primeira carta a ser recebida pela mão.
	 * @param end - ultima carta a ser recebida pela mão.
	 */
	public Mao(Baralho baralho, int start, int end) {

		for (int i = 0; i <= end-start; i++)
			mao.add(baralho.get(start+i));
		
	}
	
	/**
	 * método para jogar a carta da rodada.
	 * @return a carta no topo da mão do jogador, que vai ser usada na rodada.
	 */
	public Carta poll() {
		return this.mao.poll();
	}
	
	/**
	 * método para adicionar cartas na mão, quando o jogador vence uma rodada.
	 * @param cartas - array com as cartas a serem adicionadas.
	 */
	public void add(ArrayList<Carta> cartas) {
		int size = cartas.size();
		
		for (int i = 0; i < size; i++)
			this.mao.add(cartas.get(i));
	}
	
	/**
	 * método para saber o placar do jogo.
	 * @return quantas cartas o jogador possui em sua mão.
	 */
	public int size() {
		return this.mao.size();
	}
}
