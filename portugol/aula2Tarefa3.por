programa
{
	inclua biblioteca Matematica
	/*3) Desenvolva um sistema em que:
Leia 4 (quatro) números;
Calcule o quadrado de cada um;
Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
Caso contrário, imprima os valores lidos e seus respectivos quadrados.

/*
 * 
 */
	funcao inicio()
	{
		//Variaveis
	real n1, n2, n3, n4
	real quad1, quad2, quad3, quad4

	escreva ("Digite um número")
	leia (n1)

	escreva ("Digite um número ")
	leia (n2)

	escreva ("Digite um número")
	leia (n3)

	escreva ("Digite um número")
	leia (n4)

	quad1 = Matematica.potencia(n1, 2.0)
	quad2 = Matematica.potencia(n2, 2.0)
	quad3 = Matematica.potencia(n3, 2.0)
	quad4 = Matematica.potencia(n4, 2.0)
	
	se (quad3 >= 1000) {
		
		escreva ("Programa finalizado")
		
	

	}
     senao {
	escreva ("\nValor do n1 é: " + n1 + ", seu quadrado é: " , quad1, "")
	escreva ("\nValor do n2 é: " + n2 + ", seu quadrado é: " , quad2, "")
	escreva ("\nValor do n3 é: " + n3 + ", seu quadrado é: " , quad3, "")
	escreva ("\nValor do n4 é: " + n4 + ", seu quadrado é: " , quad4, "")
	
     }
	

	
	

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 761; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */