package ExerciciosLacoCondi;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		int idade;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("\nInsira a sua idade: ");
		idade = leia.nextInt();
		
		if (idade>=10&&idade<=14) 
		{
			System.out.println("\nVocê pertence a categoria Infantil. ");
		}
		if(idade <10){
			System.out.println("\nVocê não pode participar :( ");
		}
		if(idade >=15&&idade <=17)
		{
			System.out.println("\nVocê pertence a categoria Juvenil. ");
		}
		if(idade >=18&&idade<=24){
			System.out.println("\nVocê pertence a categoria Adulto. ");
		}
		if(idade>=25)
		{
			System.out.println("\nVocê não pode participar :( ");
		}
		
	}

}
