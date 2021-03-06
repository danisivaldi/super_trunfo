package super_trunfo;

import java.util.ArrayList;

/**
 * classe que representa o monte no jogo.
 * usado para jogadas em que há empate: nesse caso, as cartas vão para o monte
 * e aguardam a próxima rodada (quem ganhar leva o monte).
 * 
 * @author Daniel Sivaldi Feres 9912275
 *
 */
public class Monte {
	private ArrayList<Carta> monte;
	
	/**
	 * construtor do monte.
	 * inicialmente vazio.
	 */
	public Monte() {
		monte = new ArrayList<Carta>();
	}
	
	/**
	 * adiciona ao monte as cartas que empataram na rodada.
	 * @param c1 - carta do primeiro jogador.
	 * @param c2 - carta do segundo jogador.
	 */
	public void add(Carta c1, Carta c2) {
		monte.add(c1);
		monte.add(c2);
	}
	
	/**
	 * zera o monte.
	 */
	public void clear() {
		monte.clear(); 
	}
	
	/**
	 * quando o jogador ganhar a rodada e tiverem cartas no monte, ele leva tudo.
	 * @return o conteúdo do monte.
	 */
	public ArrayList<Carta> getMonte() {
		return monte;
	}
}
