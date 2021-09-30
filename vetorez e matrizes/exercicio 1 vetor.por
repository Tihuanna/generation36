programa
{
	
	funcao inicio()
	{
		inteiro numero[5], maiorValor=0, x
		para (x=0; x<=4 ;x++) 
		{
			escreva("\nInsira o numero ", x+1,":   ") 
			leia(numero[x])
			limpa()
		}
		para (x=0;x<=4;x++) 
		{
			escreva(numero[x],"\t")
		}
		para (x=0;x<=4;x++)
		{
			se(maiorValor < numero[x])
			maiorValor = numero[x]
			limpa()
			escreva("\nO maior numero é : ", maiorValor)
		}		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 388; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {numero, 6, 10, 6}-{maiorValor, 6, 21, 10}-{x, 6, 35, 1};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */