package ExerciciosDecisao;

import java.util.Scanner;

public class Decisao2 {

	public static void main(String[] args) {
		int op;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nMenu de op��es: ");
		System.out.println("\n1- Voc� � muito gentil :) ");
		System.out.println("\n2- Voc� � muito persistente ");
		System.out.println("\n3- Voc� � resiliente ");
		System.out.println("\n4- Voc� � muito dedicada ");
		System.out.println("\nDigite uma op��o: ");
		op = leia.nextInt();
		
		switch(op) {
		case 1:
			System.out.println("\n1- Voc� � muito gentil :) ");
			break;
		case 2:
			System.out.println("\n2- Voc� � muito persistente ");
			break;
		case 3:
			System.out.println("\n3- Voc� � resiliente ");
			break;
		case 4:
			System.out.println("\n4- Voc� � muito dedicada ");
			break;
			default:
				System.out.println("\nOp��o inv�lida ");
		}

	}

}
