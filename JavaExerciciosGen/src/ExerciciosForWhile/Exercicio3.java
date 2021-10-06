package ExerciciosForWhile;

import java.util.Scanner;

public class Exercicio3 {
	
	/*Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99. (WHILE)*/

	public static void main(String[] args) {
		int menos21=0, mais50=0,idade;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("\nInsira a sua idade: " + "\nPara encerrar, digite -99");
		idade = leia.nextInt();
		while (idade != -99) 
		{
		if (idade<21) 
		{
			menos21++;
		}
		else if (idade>50) 
			{
				mais50++;
			}
		System.out.println("\nInsira a sua idade: " + "\nPara encerrar, digite -99");
		idade = leia.nextInt();
		
		}
		System.out.printf("\nVocê informou um total de %d idades menores de 21." + "%nE %d idades ascima de 50 anos.", menos21,mais50);
		
		
	}	
}
