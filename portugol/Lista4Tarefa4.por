programa
{
/* 4- Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e em seguida, exiba a soma dos 
valores dela e a soma dos valores da primeira diagonal, ou seja, diagonal principal.
/*
 * 
 */

	
	funcao inicio()
	{
		inteiro m1 [3][3]
		inteiro total=0
		inteiro diagonal=0
		para (inteiro x=0;x<3;x++){
			para (inteiro y=0;y<3;y++){
				escreva ("Digite o valor da matriz M1 na linha ", x , " e na coluna " ,y, " \n")
				leia (m1 [x] [y])
				total=total+m1[x][y]
				se (x==y){
					diagonal=diagonal+m1[x][y]
				}
			}
			
		}
		escreva ("A somatoria total é: " , total)
		escreva ("\nA somatoria da diagonal principal é de: ", diagonal)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 627; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {m1, 12, 10, 2}-{x, 15, 16, 1};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */