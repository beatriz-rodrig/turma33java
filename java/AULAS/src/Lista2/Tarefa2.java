package Lista2;

//Faça um programa que entre com três números e coloque em ordem crescente.

import java.util.Scanner;

public class Tarefa2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		
		// Variáveis
		int numero1, numero2, numero3; 

		// Entrada de dados
		System.out.println("Digite o primeiro numero inteiro:");
		numero1 = leia.nextInt();
		
		System.out.println("Digite o segundo numero inteiro:");
		numero2 = leia.nextInt();
		
		System.out.println("Digite o terceiro numero inteiro:");
		numero3 = leia.nextInt();
		
		//processamentos
		
		if (numero1==numero2 & numero2==numero3) {
			System.out.println("A ordem crescente é: "+ numero1 + "," + numero2 + "," + numero3);
			}
		
		else if (numero1 <= numero2 && numero2 <= numero3)
		    {
			  System.out.println("A ordem crescente é: "+ numero1 + "," + numero2 + "," + numero3 );
		    }
		  else if (numero1 <= numero3 && numero3 <= numero2)
		    {
			  System.out.println("A ordem crescente é: "+ numero1 + "," + numero2 + "," + numero3 );
		    }
		  else if (numero2 <= numero1 && numero1 <= numero3)
		    {
			  System.out.println("A ordem crescente é: "+ numero1 + "," + numero3 + "," + numero2 );
		    }
		  else if (numero2 <= numero3 && numero3 <= numero1) 
		    {
			  System.out.println("A ordem crescente é: "+ numero2 + "," + numero1 + "," + numero3 );
		    }
		  else if (numero3 <= numero1 && numero1 <= numero2) 
		    {
			  System.out.println("A ordem crescente é: "+ numero3 + "," + numero1 + "," + numero2 );
		    }
		  else /* n3 <= n2 && n2 < n1 */
		    {
			  System.out.println("A ordem crescente é: "+ numero3 + "," + numero2 + "," + numero1 );
		    }

		  
		}
		

	}


