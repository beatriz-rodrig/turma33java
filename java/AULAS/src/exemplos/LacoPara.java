package exemplos;
/*
/* Tarefa 2 (PARA)-Desenvolver um sistema que efetue a soma de todos os n�meros �mpares 
 * que s�o m�ltiplos de tr�s e que se encontram no conjunto dos n�meros de 1 at� 500.
 */

import java.util.Scanner;
public class LacoPara {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double soma=0.0;
		double x;
		
		for (x=0; x<=500; x++) {
		if((x%2)==1 && (x%3) ==0){
		soma =soma+x;
		System.out.println("\n Numero " +x);}
		
		
		
				
		
		}
		System.out.println("A soma �:" +soma);	
	}

}
