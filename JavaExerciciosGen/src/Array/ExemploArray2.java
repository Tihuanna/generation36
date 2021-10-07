package Array;

import java.util.Scanner;

public class ExemploArray2 {

	public static void main(String[] args) {
		int numeros[][] = new int[2][3], contpar = 0, contimpar = 0;
		int linha, coluna;
		Scanner leia = new Scanner(System.in);

		for (linha = 0; linha < 2; linha++) {
			for (coluna = 0; coluna < 3; coluna++) {
				System.out.println("\nEntre com um numero: ");
				numeros[linha][coluna] = leia.nextInt();
			}
		}
		for (linha = 0; linha < 2; linha++) {
			for (coluna = 0; coluna < 3; coluna++) {
				if (numeros[linha][coluna] % 2 == 0) {
					System.out.println("\n" + numeros[linha][coluna] + "<-- Este numero é Par");
					contpar++;
				} else {
					System.out.println("\n" + numeros[linha][coluna] + "<-- Este numero é Impar");
					contimpar++;
				}
			}

		}
		System.out.println("\nTemos: "+contpar+" Numeros pares");
		System.out.println("\nTemos: "+contimpar+" Numeros impares");
	}
}
