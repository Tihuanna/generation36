package exerciciosSequenciais;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		int totaldias, anos, meses, dias;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("\nEntre com o total de dias vividos: ");
		totaldias = leia.nextInt();
		
		anos= totaldias / 365;
		meses = (totaldias % 365) / 30;
		dias = (totaldias %365)%30;
		
		System.out.println("\nEu tenho " + anos+ " ano(s)" + " e " + meses + " meses ");

	}

}
