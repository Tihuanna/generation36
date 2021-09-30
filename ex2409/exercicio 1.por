programa
{
	inclua biblioteca Matematica -->mat	
	
	funcao inicio()
	{
		real p, ex, plimite, m
	
		plimite = 50 

		escreva(" Insira o peso ")
		leia(p)

		limpa()
		se (p<=plimite)
		{
			escreva(" Está tudo certo, sem custos adicionais ")
		}
		senao se (p>50) 
	
		{
			ex = (p - 50) *4	 
			escreva("\nO peso está acima, a multa sera de ", ex , " reais\n")
		}
		
		
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 186; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */