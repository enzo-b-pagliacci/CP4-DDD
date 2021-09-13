import java.util.Scanner;

public class Tabuleiro {
	Scanner input = new Scanner(System.in);
	
	public int[][] inicializarTabuleiro() {
		int tabule[][] = new int[3][3]; 
		
		return tabule;
		
	}
	
	public void imprimirTabuleiro(int[][] matriz) {
		System.out.println("----Jogo da velha----");
		System.out.printf("  0   1   2 %n");
		System.out.printf("0 %c | %c | %c %n", matriz[0][0], matriz[0][1], matriz[0][2]);
		System.out.printf(" ----------- %n");
		System.out.printf("1 %c | %c | %c %n", matriz[1][0], matriz[1][1], matriz[1][2]);
		System.out.printf(" ----------- %n");
		System.out.printf("2 %c | %c | %c %n", matriz[2][0], matriz[2][1], matriz[2][2]);
		System.out.println("Escolha a posição de 1 a 9: ");
	}
	
	public int leiaCoordenadaLinha(int posi) {
		if (posi > 0 && posi < 4 ) {
			System.out.println("Linha: 0");
			return 0;
		}
		else if (posi > 3 && posi < 7 ) {
			System.out.println("Linha: 1");
			return 1;
		}
		else if (posi > 6 && posi < 10 ) {
			System.out.println("Linha: 2");
			return 2;
		}
		else {
			return (Integer) null;
		}
		
	}
	
	public int leiaCoordenadaColuna(int posi) {
		if (posi == 1 || posi == 4 || posi == 7 ) {
			System.out.println("Coluna: 0");
			return 0;
		}
		else if (posi == 2 || posi == 5 || posi == 8 ) {
			System.out.println("Coluna: 1");
			return 1;
		}
		else if (posi == 3 || posi == 6 || posi == 9 ) {
			System.out.println("Coluna: 2");
			return 2;
		}
		else {
			return (Integer) null;
		}
	}
	
	public void jogar(int i, int j, int tabuleiro[][]) {
		tabuleiro[i][j] = 'Y';
		
	}
	
	
}
