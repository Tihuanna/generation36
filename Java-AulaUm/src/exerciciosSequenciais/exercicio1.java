package exerciciosSequenciais;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		int totalanos, res, meses, dias;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("\nEntre com quantos anos você tem: ");
		totalanos = leia.nextInt();
		
		System.out.println("\nEntre com quantos meses: ");
		meses = leia.nextInt();
		
		System.out.println("\nEntre com quantos dias: ");
		dias = leia.nextInt();
		
		res = ((totalanos*365) + (meses*30) + dias);
		
		System.out.println("\nSua idade em dias é: "+res);
		
		
		
		
	}

}
