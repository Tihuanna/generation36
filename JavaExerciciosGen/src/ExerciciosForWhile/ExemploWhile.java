package ExerciciosForWhile;

import java.util.Scanner;

public class ExemploWhile {
	public static void main (String[] args) {
		
		int numero, somanumero=0, cont=0;
		float medianumero = 0;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nEntre com um numero: ");
		numero = leia.nextInt();
		
		while(numero!=0) 
		{
			somanumero+=numero;
			cont++;
			System.out.println("\nEntre com um proximo numero: ");
			numero = leia.nextInt();
		}
		if(cont==0)
		{
			System.out.println("\nN�o � possivel fazer divis�o por zero");
		}
		else
		medianumero = somanumero / cont;
		System.out.printf("\nA m�dia dos numeros �: %2.2f",medianumero);
		
	}
}
