package exemplos;
/*
/* Tarefa 2 (PARA)-Desenvolver um sistema que efetue a soma de todos os números ímpares 
 * que são múltiplos de três e que se encontram no conjunto dos números de 1 até 500.
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
		System.out.println("A soma é:" +soma);	
	}

}
