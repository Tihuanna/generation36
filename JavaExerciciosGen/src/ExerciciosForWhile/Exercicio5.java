package ExerciciosForWhile;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
			int numero, soma=0;
			Scanner leia = new Scanner(System.in);
			do {
				System.out.println("\nPara encerrar, digite o numero 0");
				System.out.println("Digite um numero: ");
				numero = leia.nextInt();
				soma +=numero;
				} 
			while (numero !=0) ;
			{
				System.out.printf("A soma dos numeros digitados são: %d ", soma);
			}
			
				
			}
}
