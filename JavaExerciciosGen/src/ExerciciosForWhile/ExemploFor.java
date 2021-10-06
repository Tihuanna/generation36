package ExerciciosForWhile;

import java.util.Scanner;

public class ExemploFor {

	public static void main(String[] args) {
		float n1,n2,n3,media,mg,somamedia=0;
		int x;
		Scanner leia = new Scanner(System.in);
				
		for(x=1; x<=4;x++) 
		{
			System.out.println("\nEntre com a primeira nota: ");
			n1 = leia.nextFloat();
			System.out.println("\nEntre com a segunda nota: ");
			n2 = leia.nextFloat();
			System.out.println("\nEntre com a terceira nota: ");
			n3 = leia.nextFloat();
			
			media = (n1+n2+n3)/3;
			System.out.printf("\nMedia do aluno: %d " ,x, "%2.2f",media);
			
			somamedia= somamedia + media;		
		}
		mg = somamedia / 4;
		System.out.println("\nMédia geral: "+mg);
		}

}
