package ExerciciosForWhile;

import java.util.Scanner;

public class Exercicio6 {

	/*
	 * Escrever um programa que receba vários números inteiros no teclado. E no
	 * final imprimir a média dos números múltiplos de 3. Para sair digitar
	 * 0(zero).(DO...WHILE)
	 */

	public static void main(String[] args) {

		int numero, soma = 0, cont = 0;
		float media;
		Scanner leia = new Scanner(System.in);
		do {
			System.out.println("\nPara encerrar, digite o numero 0");
			System.out.println("Digite um numero: ");
			numero = leia.nextInt();
			if (numero % 3 == 0) {
				soma += numero;
				cont++;
			}
		} while (numero != 0);
		if (cont == 0) {
			System.out.println("\nValores invalidos.");
		} else {
			media = soma / cont;

			System.out.printf("A média dos numeros digitados são: %.2f ", media);
		}

	}
}
