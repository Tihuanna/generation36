package exerciciosSequenciais;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		int segundos, minutos, horas, seg;
		
		
		Scanner leia = new Scanner(System.in);
		System.out.println("\nDigite a dura��o do evento em segundos: ");
		segundos = leia.nextInt();
				
		horas = segundos/3600;
		minutos = ((segundos%3600)%60);
		seg = ((segundos%3600)%60);
		
		System.out.println("\nA dura��o do evento foi de " + horas+" horas, "+ minutos+" minutos "+" e "+ seg+" segundos ");
		
	}

}
