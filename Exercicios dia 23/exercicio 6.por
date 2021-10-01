programa
{
	
	funcao inicio()
	{
		inteiro  idade // i= infantil j=juvenil 
			escreva("\nInsira a sua idade para definir a categoria ")
			leia(idade)
			limpa()
		se (idade < 5){
			escreva ("\nSem categoria, aguarde completar 5 anos ")
			}
		senao se (idade<=7) {
			escreva (" \nSua categoria é Infantil A: ")	
			}
		senao se (idade<=11) {
			escreva( " \nSua categoria é Infantil B: ")
		}
		senao se (idade<=13) {
			escreva(" \nSua categoria é Juvenil A: ")
		}
		senao se(idade<=17) {
			escreva(" \nSua categoria é Juvenil B: ")
		}
		senao se (idade>17) {
			 escreva(" \nSua categoria é adulto. ")

		}
					
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 626; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */