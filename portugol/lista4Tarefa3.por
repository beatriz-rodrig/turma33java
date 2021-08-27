programa
{
/* 3- Escreva um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição das matrizes N1 e N2;
b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma posição das matrizes N1 e N2.
 */

	
	funcao inicio()
	{
		inteiro n1[4][6] //
		inteiro n2[4][6]
		inteiro M1[4][6] //
		inteiro M2[4][6]

  	para(inteiro linha=0;linha<4; linha++){
 	para(inteiro coluna=0; coluna<6; coluna++){

                    n1[linha][coluna]=sorteia(1,9)
				n2[linha][coluna]=sorteia(1,9)
				n1[linha][coluna]=sorteia(1,9)
				n2[linha][coluna]=sorteia(1,9)
				M1[linha][coluna] = n1[linha][coluna] + n2[linha][coluna]
				M2[linha][coluna] = n1[linha][coluna] - n2[linha][coluna]

				}
		}
          escreva ("N1\n")
          para(inteiro linha=0;linha<2; linha++){
          para(inteiro coluna=0; coluna<3; coluna++){
					escreva (n1[linha][coluna]+"\t")
					
			}
			escreva ("\n")
               
		}
			escreva ("\n")
 			escreva ("N2\n")
   			para(inteiro linha=0;linha<2; linha++){
 			para(inteiro coluna=0; coluna<3; coluna++){
					escreva(n2[linha][coluna]+"\t")
					
			}
			
   		escreva ("\n")
   	
		}
		escreva ("\n")
 		escreva ("M1\n")
 		
 		para(inteiro linha=0;linha<2; linha++){
 		para(inteiro coluna=0; coluna<3; coluna++){
			escreva(M1[linha][coluna]+"\t")
			}
		escreva ("\n")
 		
 		
		}
		escreva ("\n")
 		escreva ("M2\n")
 		
 		para(inteiro linha=0;linha<2; linha++){
 		para(inteiro coluna=0; coluna<3; coluna++){
					escreva(M2[linha][coluna]+"\t")
			}
			
 			escreva ("\n")
 			
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 399; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {n1, 11, 10, 2}-{n2, 12, 10, 2}-{M1, 13, 10, 2}-{M2, 14, 10, 2};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */