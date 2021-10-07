package Array;

import java.util.Scanner;

public class ExemploArray1 {

	public static void main(String[] args) {
		float media [] = new float [4];
		float somamedia=0,n1,n2,n3,mediageral;
		int x;
		
		Scanner leia = new Scanner(System.in);
		
		for(x=0;x<4;x++) 
		{
			System.out.println("\nInsira a primeira nota: ");
			n1 = leia.nextFloat();
			System.out.println("\nInsira a segunda nota: ");
			n2 = leia.nextFloat();
			System.out.println("\nInsira a terceira nota: ");
			n3 = leia.nextFloat();
			
			media[x] = (n1+n2+n3)/3;
			somamedia+= media[x];
			System.out.printf("\nMedia do aluno %d: %2.2f", x+1,media[x]);
 		}
		
		mediageral = somamedia/ 4;
		System.out.printf("\nMédia geral: %2.2f", mediageral);
	}

}
