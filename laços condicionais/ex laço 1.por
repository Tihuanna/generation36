programa
{
	inclua biblioteca Matematica -->Mat
	funcao inicio()
	{
		real salario = 0.00, mediaSalarios=0.00, mediaFilhos = 0.00, maiorSalario = 0.00, pessoaAte100 = 0.00, totalSalarios= 0.00, totalFilhos = 0.00, totalP100 = 0.00
		inteiro filhos = 0
		const inteiro HABITANTES = 3
		
		para(inteiro x=1; x<=HABITANTES; x++)
		{
		escreva ("\nInsira aqui o seu salário: ")
		leia(salario)
		escreva ("\nInsira aqui o numero de filhos: ")
		leia(filhos)
		totalSalarios = totalSalarios + salario
		totalFilhos = totalFilhos + filhos
		limpa()
		
		se (salario > maiorSalario) 
		{
			maiorSalario = salario		
		}
		se (salario <= 100 ) 
		{ 
		 totalP100++
		}

		
		}
		mediaSalarios= totalSalarios / HABITANTES
		mediaFilhos= totalFilhos / HABITANTES
		pessoaAte100 = totalP100 / HABITANTES *100
		escreva("\nMedia salarial : R$ ", Mat.arredondar(mediaSalarios, 3))
		escreva("\nMedia de filhos é: ", Mat.arredondar(mediaFilhos, 3))
		escreva("\nMaior salario informado :", maiorSalario)
		escreva("\nPessoas com salario acima de 100: " , Mat.arredondar(pessoaAte100, 2))
	
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1073; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */