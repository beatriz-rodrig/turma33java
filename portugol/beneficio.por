programa
{
	
	funcao inicio()
	{
	//VALOR EMERGENCIAL = 600 REAIS
          //A CHEFA DA FAMILIA: VALOR DOBRAR
		//NOME DA PESSOA
          //PERGUNTE SE ELA É A CHEFA DA FAMILIA
		//QUAL O VALOR QUE ELA VAI RECEBER
		//OLÁ, [NOME], VC É O/A DA FAMILIA E VAI RECEBER [XXX] REAIS


          cadeia nome 
		real valorBeneficio, chefe
		caracter resposta

		escreva (" Digite seu nome:")
		leia (nome)

		escreva ("Você é a chefe da familia? responda com S-sim ou N-nao: ")
		leia (resposta)
		valorBeneficio = 600,00
		chefe = (600,00*2)

        se (resposta == "S" ou "sim"){
	 		escreva(" ola " , nome ," voce é a chefe da familia e vai receber" , chefe, "reais") 
        }

        senao (resposta == "N" ou "nao"){
        		escreva (" ola" , nome , " voce vai receber" , valorBeneficio, "reais")
        }
        
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 724; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */