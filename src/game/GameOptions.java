package game;

import java.util.Scanner;

public class GameOptions {
	public static boolean sairJogo(Scanner input) {
		System.out.println("------------------------------");
		System.out.println("Você tem certeza que deseja sair do jogo?");
		System.out.println("------------------------------");
		System.out.println("Opção\t Descrição");
		System.out.println("1\t Sim");
		System.out.println("2\t Não");
		System.out.println("-------------------");
		System.out.println("Escolha uma opção:");
		
		int opcao = input.nextInt();
		input.nextLine();

		switch (opcao) {
		case 1:
			Main.gameLoop = false;
			return true;
		case 2:
			return false;
		default:
			return false;
		}
	}
}
