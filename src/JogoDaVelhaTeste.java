/*********************************************************************/
/** FIAP **/
/** TADS - 2o semestre de 2021 **/
/** Fernando **/
/** **/
/** Checkpoint DDD **/
/** Arquivo: CP4DDD **/
/** **/
/** Enzo Bense Pagliacci – RM: 87203 **/
/** Gabriel Jesus Dantas – RM: 88737 **/
/** Guilherme Beck Lobo – RM: 87531  **/
/** Gustavo Lopes Carlin – RM: 87339 **/
/** Jhoctan de Deus Teixera – RM: 88206**/
/****/
/** 19/9/2021 **/
/*********************************************************************/

import java.util.Scanner;

public class JogoDaVelhaTeste {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Tabuleiro tab = new Tabuleiro();
		Menu op = new Menu();
		
		int vet[][] = tab.inicializarTabuleiro();	
		tab.imprimirTabuleiro(vet);
		
		int contador = 1;
		while(contador > 0) {
			contador = 0;
			int posi = op.escolhaPosicao();
			int x = tab.leiaCoordenadaLinha(posi);
			int y = tab.leiaCoordenadaColuna(posi);
			tab.jogar(x, y, vet);
			tab.imprimirTabuleiro(vet);
			for (int i=0; i<vet.length; i++) {
				for (int j=0; j<vet[i].length; j++) {
					if (vet[i][j] == 0) {
						contador++;
					}
				}
			}
			
			
		
		}
		
		
		
	}

}
