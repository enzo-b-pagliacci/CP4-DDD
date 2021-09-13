import java.util.Scanner;

public class Menu {
	Scanner input = new Scanner(System.in);
	
	public int imprimeMenuPrincipal() {
		System.out.println("*--MENU--*");
		System.out.println("Op��es de jogo (digite o n�mero da op��o):");
		System.out.println("1 - O jogador-usu�rio contra outro jogador-usu�rio.");
		int opcao = input.nextInt();
		while(opcao < 1 && opcao > 1) {
			System.out.println("Insira um valor valido");
			opcao = input.nextInt();
		}
		return opcao;
	}
	
	public int escolhaPosicao() {
		int posi = input.nextInt();
		while(posi > 9 && posi < 1) {
			System.out.println("Insira um valor de 1 a 9");
			posi = input.nextInt();
		}
		System.out.println("Coordenada: ");
		return posi;
		
	}
}
