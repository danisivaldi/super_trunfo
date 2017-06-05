package workspace;

import java.io.IOException;

/**
 * classe que contém apenas o método main, para rodar o jogo.
 * 
 * @author Daniel Sivaldi Feres 9912275
 */
public class SuperTrunfo {

	/**
	 * método main do jogo.
	 * @throws IOException
	 */
	public static void main() throws IOException {
		Baralho baralho = new Baralho();
		Monte monte = new Monte();
		Mao player1, player2;
		Carta c1, c2;
		int score1, score2, turn, attribute;
		
		System.out.println("Bem Vindo ao Super Trunfo!");
		System.out.println("");
		
		//baralho.shuffle(); // embaralha o baralho, que inicialmente está ordenado
		player1 = new Mao(baralho, 1, 15); // player 1 recebe as 16 primeiras cartas do baralho
		player2 = new Mao(baralho, 16, 31); // player 2 recebe as 16 ultimas cartas do baralho
		
		score1 = 16; 
		score2 = 16; // variaveis pra marcar quantas cartas o jogador tem (inicialmente com 16)
		
		turn = 1; // variavel pra saber de quem é o turno; player 1 começa a jogar
		
		while (score1 != 0 && score2 != 0) { // roda o jogo até acabarem as cartas de um dos dois jogadores
			c1 = player1.poll(); 
			c2 = player2.poll(); // cartas no topo da mão do jogador
			
			monte.add(c1, c2); // já coloca as cartas no monte, caso dê empate
			
			if (turn == 1) { // rodada do player 1
				
				if (c1.getTrunfo()) { // player 1 tem o Super Trunfo
					System.out.println("player 1 tem o Super Trunfo..");
					if (c2.getId() == 'a') {// player 2 tem uma carta 'A', então ganhou do Super Trunfo
						System.out.println("... mas a carta do player 2 é " + c2.getNum() + "A! player 2 ganhou a rodada!");
						turn = 2;
					} else System.out.println("... e ganhou a rodada automaticamente!");
				} 
				
				else {
					System.out.println("player 1, escolha um atributo:");
					System.out.println("0 - altura " + c1.getAttribute(0) + " m");
					System.out.println("1 - comprimento " + c1.getAttribute(1) + " m");
					System.out.println("2 - peso " + c1.getAttribute(2) + " kg");
					System.out.println("3 - viveu há " + c1.getAttribute(3) + " milhões de anos");
					attribute = EntradaTeclado.leInt(); // escolha do atributo 
					
					System.out.println("player 1: " + c1.getAttribute(attribute));
					System.out.println("player 2: " + c2.getAttribute(attribute)); // mostra o atributo escolhido das duas cartas
					System.out.println("");
					
					if (c1.getAttribute(attribute) > c2.getAttribute(attribute)) {
						System.out.println("player 1 venceu a rodada!");
						player1.add(monte.getMonte()); // player 1 recebe as cartas (que ja estavam no monte)
						monte.clear();
					} else if (c1.getAttribute(attribute) < c2.getAttribute(attribute)) { 
						System.out.println("player 2 venceu a rodada!");
						player2.add(monte.getMonte()); // player 2 recebe as cartas (que ja estavam no monte)
						monte.clear();
						turn = 2;
					} else {
						System.out.println("empatou! as cartas vão para o monte!");
						// cartas já estão no monte
					}
				}
			}
			
			else if (turn == 2) { // rodada do player 2
				
				if (c2.getTrunfo()) { // player 2 tem o Super Trunfo
					System.out.println("player 2 tem o Super Trunfo..");
					if (c1.getId() == 'a')  { // player 1 tem uma carta 'A', então ganhou do Super Trunfo
						System.out.println("... mas a carta do player 1 é " + c1.getNum() + "A! player 1 ganhou a rodada!");
						turn = 1;
					} else System.out.println("... e ganhou a rodada automaticamente!");
				}
				
				else {
					
					System.out.println("player 2, escolha um atributo:");
					System.out.println("0 - altura " + c2.getAttribute(0) + " m");
					System.out.println("1 - comprimento " + c2.getAttribute(1) + " m");
					System.out.println("2 - peso " + c2.getAttribute(2) + " kg");
					System.out.println("3 - viveu há " + c2.getAttribute(3) + " milhões de anos");
					attribute = EntradaTeclado.leInt(); // escolha do atributo 
					
					System.out.println("player 1: " + c1.getAttribute(attribute));
					System.out.println("player 2: " + c2.getAttribute(attribute)); // mostra o atributo escolhido das duas cartas
					System.out.println("");
					
					if (c1.getAttribute(attribute) > c2.getAttribute(attribute)) {
						System.out.println("player 1 venceu a rodada!");
						player1.add(monte.getMonte()); // player 1 recebe as cartas (que ja estavam no monte)
						monte.clear();
						turn = 1;
					} else if (c1.getAttribute(attribute) < c2.getAttribute(attribute)) { 
						System.out.println("player 2 venceu a rodada!");
						player2.add(monte.getMonte()); // player 2 recebe as cartas (que ja estavam no monte)
						monte.clear();
					} else {
						System.out.println("empatou! as cartas vão para o monte!");
						// cartas já estão no monte
					}
				}
			}
			
			score1 = player1.size(); 
			score2 = player2.size(); // atualiza o número de cartas na mão de cada jogador
			System.out.println("placar:" + score1 + "x" + score2);
			System.out.println("");
		}
		
		if (score2 == 0) System.out.println("player 1 é o campeão! parabéns!");
		else System.out.println("player 2 é o campeão! parabéns!");
	}
}
