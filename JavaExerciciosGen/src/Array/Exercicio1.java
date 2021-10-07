package Array;

public class Exercicio1 {

	public static void main(String[] args) {
		int a[] = { 1, 0, 5, -2, -5, 7};
		int soma,x;
		
		soma = (a[0]+a[1]+a[5]);
		System.out.println("\nA soma dos vetorez indicados é: "+soma);
		a[3] = 100;
		for (x=0;x<6;x++)
		{
		System.out.println("\n"+a[x]);

	}

}
}





















//1- Faça um programa que possua um vetor denominado A que armazene 6 números inteiros. O programa deve executar os seguintes passos: 
//(a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7. 
//(b) Armazene em uma variável inteira (simples) a soma entre os valores das posições A[0], A[1] e A[5] do vetor e mostre na tela esta soma. 
//(c) Modifique o vetor na posição 4, atribuindo a esta posição o valor 100. 
//(d) Mostre na tela cada valor do vetor A, um em cada linha.
