package ExerciciosDecisao;

import java.util.Scanner;

public class Decisao2 {

	public static void main(String[] args) {
		int op;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nMenu de opções: ");
		System.out.println("\n1- Você é muito gentil :) ");
		System.out.println("\n2- Você é muito persistente ");
		System.out.println("\n3- Você é resiliente ");
		System.out.println("\n4- Você é muito dedicada ");
		System.out.println("\nDigite uma opção: ");
		op = leia.nextInt();
		
		switch(op) {
		case 1:
			System.out.println("\n1- Você é muito gentil :) ");
			break;
		case 2:
			System.out.println("\n2- Você é muito persistente ");
			break;
		case 3:
			System.out.println("\n3- Você é resiliente ");
			break;
		case 4:
			System.out.println("\n4- Você é muito dedicada ");
			break;
			default:
				System.out.println("\nOpção inválida ");
		}

	}

}
