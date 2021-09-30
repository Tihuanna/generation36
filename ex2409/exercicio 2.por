programa
{
	
	funcao inicio()
	{
		real codigo, horas, excedente, salariobase, salarioextra, hora
		horas = 10
		excedente = 20
		escreva(" Digite o numero de horas trabalhadas para calculo do salario ")
		leia(codigo)
		salariobase = horas * codigo
		limpa()
		se (codigo<=50)
		{
		escreva (" Seu salario este mês é reais :", salariobase)	
		}	
		senao se(codigo>50)
		{
		salarioextra = (codigo - 50)*excedente		
		escreva( "\nO seu salario este mês é: ", salarioextra, " reais em horas extras e ", salariobase, " reais de salario ")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 552; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */