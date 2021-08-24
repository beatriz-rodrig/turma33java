programa
{
	/*
	Elabore um sistema que leia as variáveis C e N, respectivamente código e número de
horas trabalhadas de um operário. E calcule o salário sabendo-se que ele ganha R$ 10,00
por hora. Quando o número de horas exceder a 50 calcule o excesso de pagamento
armazenando-o na variável E, caso contrário zerar tal variável. A hora excedente de
trabalho vale R$ 20,00. No final do processamento imprimir o salário total e o salário
excedente. 

 */
	funcao inicio()
	{
		inteiro C
		real N, E, salario, salarioExcedente
		escreva ("Qual o seu codigo? ")
		leia (C)
		escreva ("Quantas horas voce trabalhou? ")
		leia (N)


         se (N <= 50){
         	salario = N * 10.00
         	escreva ("Funcionario "  , C , " seu salario sera de "  , salario,  " reais e voce não possui horas excedentes ")
         	

        
         }

		senao 
		{

		E = N -50
		salarioExcedente = E * 20.00
		salario = ( 50 * 10.00) + salarioExcedente

		escreva ("\n")
		escreva ("o seu codigo é: #" + C)
		escreva ("\nA quantidade de horas trabalhadas é: " , N , "horas\n")
		escreva ("\nA quantidade de horas excessivas trabalhadas é: " , E , "horas\n")
		escreva ("\nO salario total é: r$ " , salario, "reais")
		escreva ("\nO salario excedente é: r$", salarioExcedente, "reais")
		}
		
		

		
		
		}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 807; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */