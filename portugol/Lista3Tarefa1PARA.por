programa
{

/*1- A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, coletando dados 
 sobre o salário e número de filhos. A prefeitura deseja saber:   
a) média do salário da população; 
b) média do número de filhos; 
c) maior salário; 
d) percentual de pessoas com salário até R$100,00.  

 */
	
	funcao inicio()
	{
		inteiro nfilhos
		real salario, medSalario, maiorSalario= 0.00, mfilhos,percSalario, totalSalario=00.00, salarioMenor=00.00, totalFilhos=00.00 
		 
		 

	

		para (inteiro x=1; x<=20; x++){
		escreva (" Digite o salario do participante: " ,x, "\n")
		leia (salario)

			escreva (" Digite o numero de filhos do participante: " ,x, "\n")
			leia (nfilhos)
			totalFilhos=totalFilhos+nfilhos

			se (salario > maiorSalario){
			maiorSalario=salario
			}

		totalSalario=totalSalario+salario
		se (salario<=100){
			salarioMenor=salarioMenor+1
			
		}
		}
		medSalario=totalSalario/20.00
		escreva ("\nA media de salario da população é de:" ,medSalario)

		mfilhos=totalFilhos/20.00
		escreva ("\nA media de filhos da população é de:" ,mfilhos)

		escreva ("\nO maior salario é de ", totalSalario)

		percSalario= (salarioMenor/20)*100
		escreva( "\nA quantidade de pessoas com salario menor que 100,00 é de: ", percSalario, "%")

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 528; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */