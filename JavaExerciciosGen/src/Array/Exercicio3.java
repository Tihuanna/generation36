package Array;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		//  Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.
			
		int linha, coluna, numeros1,cont10=0,contmenos10=0;
		int x=10;
		Scanner leia = new Scanner(System.in);
		int numeros[][] = new int[3][3];
		
		
		
		for (linha = 0; linha < 3; linha++) {
			for (coluna = 0; coluna < 3; coluna++) {
				System.out.println("\nEntre com um numero: ");
				numeros[linha][coluna] = leia.nextInt();
			}
		}
		for (linha = 0; linha < 3; linha++) {
			for (coluna = 0; coluna < 3; coluna++) {
				if (numeros[linha][coluna]>10) {
					
					cont10++;
				} else {
					contmenos10++;
				}
			}

		}
		System.out.println("\nTemos: "+cont10+" maiores que 10");
		System.out.println("\nTemos: "+contmenos10+" menores que 10");
	}

}
