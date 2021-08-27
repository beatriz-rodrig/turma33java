programa
{
/*
 * 2- Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa que gere um vetor 
 com os lançamentos, escreva esse vetor. A seguir determine e imprima a média aritmética dos lançamentos, 
 contabilize e apresente também quantas foram as ocorrências da maior pontuação.

 */
	
	funcao inicio()
	{
		inteiro lancamento [10] 
		inteiro maior= 0
		inteiro quantidade=0
		real total=0.0
		real media = 0.0

		escreva ("Lançamento de dados\n")
		para (inteiro x=0; x<10; x++){
			escreva ("Qual o " ,x+1, "º valor do dado lançado? ")
			leia (lancamento [x])
			enquanto (lancamento[x]>6){
				escreva ("Digite um valor de 1 a 6\n")
				leia (lancamento [x])
				
			}
			
			total = total + lancamento [x]
			se (lancamento [x] > maior ) {
				maior=lancamento[x]
				quantidade=1
			}
			senao se (lancamento[x]==maior){
				quantidade ++
			}
		}
		media= total/10.00
		escreva ("\nNos lançamentos foram: ")
		para (inteiro x=0; x<10; x++){
		escreva (" " ,lancamento [x], ",")
		}
		escreva ("\nA media foi de:" , media)
		escreva ("\nO maior numero lançado do dado foi o " , maior , " e ele foi lançado " , quantidade , "x")
		 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 590; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */