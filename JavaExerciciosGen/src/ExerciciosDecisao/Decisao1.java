package ExerciciosDecisao;

import java.util.Scanner;

public class Decisao1 {

	public static void main(String[] args) {
		float n1,n2,n3, media;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("\nEntre com a nota 1: ");
		n1 = leia.nextFloat();
		System.out.println("\nEntre com a nota 2: ");
		n2 = leia.nextFloat();
		System.out.println("\nEntre com a nota 3: ");
		n3 = leia.nextFloat();
		
		media = (n1 + n2 + n3) / 3;
		System.out.printf("\nA sua média é: %2.2f", media);
		
		if (media >= 7 && media <=10) {
			System.out.println("\nParabéns, você foi aprovadoo!! ");
			}
		else if (media >= 5 && media <7) {
			System.out.println("\nVocê ficou de exame :( ");
		}
		else 
			System.out.println("\nVocê foi reprovado");
		}
	}


