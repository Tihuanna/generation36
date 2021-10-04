programa
{
	inclua biblioteca Matematica	-->mat
	
	funcao inicio()

	{
		inteiro dias, mes, ano, dia
		escreva("\nInsira quantos dias de vida você tem: \n")
		leia(dias)
		ano=(dias/365)
		mes=((dias%365)/30)
		dias=((dias%365)%30)
		escreva("\n você tem ", ano, " anos ", mes, " meses e ", " dias " )
	}
		
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 316; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */