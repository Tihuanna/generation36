package Array;

import java.util.Scanner;
//2- Fa�a um programa que receba 6 n�meros inteiros e mostre: 
//� Os n�meros pares digitados;  
//� A soma dos n�meros pares digitados; 
//	� Os n�meros �mpares digitados; 
//	� A quantidade de n�meros �mpares digitados.
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
					System.out.println("\n" + a[x] + "<-- Este numero � Par");
					contpar++;
					somapar+=a[x];
					
				} else {
					System.out.println("\n" + a[x] + "<-- Este numero � Impar");
					contimpar++;
					somaimpar+=a[x];
					
				}
				
			}
		System.out.printf("\nA soma dos numeros pares �: "+ somapar);
		System.out.printf("\nA soma dos numeros impares �: "+ somaimpar);
		}
}
	
	


