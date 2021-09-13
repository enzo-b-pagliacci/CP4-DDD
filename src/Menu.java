import java.util.Scanner;

public class Menu {
	Scanner input = new Scanner(System.in);
	
	public int imprimeMenuPrincipal() {
		System.out.println("*--MENU--*");
		System.out.println("Opções de jogo (digite o número da opção):");
		System.out.println("1 - O jogador-usuário contra outro jogador-usuário.");
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
