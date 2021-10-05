package ExerciciosLacoCondi;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		int n1,n2,n3;
		int maiorNumero;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("\nEscreva o primeiro numero: ");
		n1 = leia.nextInt();
		System.out.println("\nEscreva o segundo numero: ");
		n2 = leia.nextInt();
		System.out.println("\nEscreva o terceiro numero: ");
		n3 = leia.nextInt();
		
		if(n1<n2) {
			maiorNumero = n2;
			if (n2<n3) {
				maiorNumero = n3;
				
			System.out.println("\nO maior numero digitado é: "+ maiorNumero);
			}			
		}
		else 
			System.out.println("\nOmaior numero digitado é: " + n1);
	}

	}


