package Lista2;

//Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.

import java.util.Scanner;

public class Tarefa1 {

	public static void main(String[] args) {
		// Scanner
				Scanner leia = new Scanner(System.in);

				// Vari�veis
				int numero1, numero2, numero3, menor, maior; 

				// Entrada de dados
				System.out.println("Digite o primeiro numero inteiro:");
				numero1 = leia.nextInt();
				
				System.out.println("Digite o segundo numero inteiro:");
				numero2 = leia.nextInt();
				
				System.out.println("Digite o terceiro numero inteiro:");
				numero3 = leia.nextInt();
				
				
					if (numero1>numero2) {
						if (numero1>numero3)
							maior=numero1;
						else 
							maior=numero3;
					}
					else {
						if (numero2>numero3)
							maior=numero2;
						else 
							maior=numero3;
					}
					
					System.out.println("O numero maior �: " +maior); 
					
	
		}


	}


