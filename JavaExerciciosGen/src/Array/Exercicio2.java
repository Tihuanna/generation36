package Array;

import java.util.Scanner;
//2- Faça um programa que receba 6 números inteiros e mostre: 
//• Os números pares digitados;  
//• A soma dos números pares digitados; 
//	• Os números ímpares digitados; 
//	• A quantidade de números ímpares digitados.
public class Exercicio2 {

	public static void main(String[] args) {
		
		int a []= new int [6];
		int x;
		float somapar=0,somaimpar=0,contpar=0,contimpar=0;
		
		Scanner leia = new Scanner(System.in);

		for (x=0; x<6; x++)
		{
				System.out.println("\nEntre com um numero: ");
				a[x] = leia.nextInt();
			}
		
		for (x = 0; x < 6; x++) {
				if (a[x] % 2 == 0) {
					System.out.println("\n" + a[x] + "<-- Este numero é Par");
					contpar++;
					somapar+=a[x];
					
				} else {
					System.out.println("\n" + a[x] + "<-- Este numero é Impar");
					contimpar++;
					somaimpar+=a[x];
					
				}
				
			}
		System.out.printf("\nA soma dos numeros pares é: "+ somapar);
		System.out.printf("\nA soma dos numeros impares é: "+ somaimpar);
		}
}
	
	


