package ExerciciosSequenciais;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		int a, b, c, r, s, d, sab,sbc;

		Scanner ler =	new Scanner(System.in);
		System.out.println("\nInsira o valor de A");
		a = ler.nextInt();
		
		System.out.println("\nInsira o valor de B");
		b = ler.nextInt();
		
		System.out.println("\nInsira o valor de C");
		c = ler.nextInt();
		
		sab = (a+b);
		sbc = (b+c);
		
		d= sab+sbc / 2;
		
		
		System.out.printf("O valor de D é: "+ d);
	}
}
