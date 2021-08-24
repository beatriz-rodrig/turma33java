programa
{ /*
6) Elabore um sistema que dada a idade de um nadador classifique-o em uma das seguintes
categorias:
Infantil A = 5 a 7 anos
Infantil B = 8 a 11 anos
Juvenil A = 12 a 13 anos
Juvenil B = 14 a 17 anos
Adultos = Maiores de 18 anos
/*
 * 
 * 
 */
	
	funcao inicio()
	{
		inteiro idadeNadador 
		escreva (" Ola, qual a sua idade? ")
		leia (idadeNadador)
		

		se (idadeNadador >=5 e idadeNadador <=7){
		escreva ("\nSua categoria é: infantil A")
			
		}

		se (idadeNadador >=8 e idadeNadador <=11){
		escreva ("\nSua categoria é: infantil B") }


		se (idadeNadador >=12 e idadeNadador <=13){
		escreva ("\nSua categoria é: é Juvenil A") }

		se (idadeNadador >=14 e idadeNadador <=17){
		escreva ("\nSua categoria é: é Juvenil B") }


		senao se (idadeNadador >=18) {
		escreva ("\nSua categoria é: Adultos")
		
		}

		
	
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 733; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */