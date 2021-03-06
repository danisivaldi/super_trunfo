package super_trunfo;

import java.util.ArrayList;
import java.util.Collections;

/**
 * classe que representa o baralho do jogo, com as 32 cartas.
 * @author Daniel Sivaldi Feres 9912275
 */
public class Baralho {
	private ArrayList<Carta> baralho;
	
	/**
	 * construtor do baralho.
	 * inicia cada carta do baralho com seus atributos, de acordo com o Super Trunfo Dinossauros.
	 * a carta '4b' é marcada como Super Trunfo.
	 */
	public Baralho() {
		this.baralho = new ArrayList<Carta>();
		
		baralho.add(new Carta('a','1', new double[] {1.5, 4.5, 300, 231}));
		baralho.add(new Carta('b','1', new double[] {0.3, 1.2, 1, 222}));
		baralho.add(new Carta('c','1', new double[] {8.0, 18.0, 16000, 169}));
		baralho.add(new Carta('d','1', new double[] {2.0, 6.0, 1000, 156}));
		baralho.add(new Carta('a','2', new double[] {0.5, 1.0, 1, 150}));
		baralho.add(new Carta('b','2', new double[] {1.0, 1.8, 15, 80}));
		baralho.add(new Carta('c','2', new double[] {6.0, 9.0, 6000, 68}));
		baralho.add(new Carta('d','2', new double[] {0.8, 1.0, 7, 83}));
		baralho.add(new Carta('a','3', new double[] {2.0, 9.0, 4000, 221}));
		baralho.add(new Carta('b','3', new double[] {0.3, 0.6, 0.2, 210}));
		baralho.add(new Carta('c','3', new double[] {4.0, 9.0, 2000, 156}));
		baralho.add(new Carta('d','3', new double[] {5.2, 14.0, 3600, 156}));
		baralho.add(new Carta('a','4', new double[] {22.0, 38.0, 90000, 154}));
		Carta c = new Carta('b','4', new double[] {5.6, 14.0, 7000, 68});
		c.setTrunfo(); // carta '4b' é marcada como o Super Trunfo
		baralho.add(c);
		baralho.add(new Carta('c','4', new double[] {3.0, 7.5, 1000, 113}));
		baralho.add(new Carta('d','4', new double[] {0.2, 0.1, 0.03, 125}));
		baralho.add(new Carta('a','5', new double[] {1.8, 3.0, 30, 227}));
		baralho.add(new Carta('b','5', new double[] {12.0, 15.0, 8000, 228}));
		baralho.add(new Carta('c','5', new double[] {15.0, 28.0, 50000, 156}));
		baralho.add(new Carta('d','5', new double[] {2.5, 7.0, 450, 206}));
		baralho.add(new Carta('a','6', new double[] {1.1, 1.5, 40, 146}));
		baralho.add(new Carta('b','6', new double[] {5.8, 14, 8000, 113}));
		baralho.add(new Carta('c','6', new double[] {8.0, 12.0, 2000, 125}));
		baralho.add(new Carta('d','6', new double[] {1.8, 5.0, 1500, 130}));
		baralho.add(new Carta('a','7', new double[] {0.8, 1.0, 10, 231}));
		baralho.add(new Carta('b','7', new double[] {8.0, 9.0, 400, 220}));
		baralho.add(new Carta('c','7', new double[] {5.0, 27.0, 20000, 156}));
		baralho.add(new Carta('d','7', new double[] {0.7, 1.0, 2, 156}));
		baralho.add(new Carta('a','8', new double[] {1.3, 5.0, 3000, 165}));
		baralho.add(new Carta('b','8', new double[] {0.7, 2.0, 25, 125}));
		baralho.add(new Carta('c','8', new double[] {1.3, 2.5, 35, 80}));
		baralho.add(new Carta('d','8', new double[] {1.1, 6.0, 400, 150}));
	}
	
	/**
	 * método que embaralha o baralho: aleatoriza as cartas no array.
	 */
	public void shuffle() {
		Collections.shuffle(this.baralho);
	}
	
	/**
	 * @param index - posição da carta desejada.
	 * @return a carta na posição 'index' do baralho.
	 */
	public Carta get(int index) {
		return baralho.get(index);
	}
	
}
