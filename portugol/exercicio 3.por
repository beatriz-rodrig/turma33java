programa
{

	funcao inicio()
	{

 //variaveis
	inteiro tempoEmSegundos
	inteiro horas
	inteiro minutos
	inteiro segundos

 //entradas
 escreva("Informe o tempo expresso em segundos ")
	leia(tempoEmSegundos)

 //processamentos
	horas = tempoEmSegundos / 3600
	minutos = (tempoEmSegundos % 3600)/60
	segundos =  (tempoEmSegundos % 3600)%60
 //saidas
	escreva("\nhoras  : "+horas)
	escreva("\nminutos : "+minutos)
	escreva("\nsegundos  : "+segundos)


	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 427; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */