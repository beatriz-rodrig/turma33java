programa
{
	/*
	Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma atividade e o escreva
	em seguida. Encontre após a maior pontuação e a apresente. 
	 */

	funcao inicio()
	{
		real valores [5]
		real maior=0.0

		escreva (" Verificando a maior nota:\n")

		para (inteiro x=0; x<5; x++){
		escreva ("Digite o valor da: ", (x+1), "ªnota ")
		leia (valores [x])
		}
		
		escreva ("\nPontuação é: ")
		para (inteiro x=0; x<5; x++){
		escreva (" ", valores[x], ",")
		}

		para (inteiro x=0; x<5; x++){
		se (maior<valores[x]){
			maior=valores[x]
		}

		
		
		}
		
			escreva ("\nA maior nota é: " ,maior)
			
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 500; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {valores, 10, 7, 7};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */