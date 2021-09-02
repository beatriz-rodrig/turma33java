package Lista3;
/*Escrever um programa que receba vários números inteiros no teclado
  E no final imprimir a média dos números múltiplos de 3. Para sair digitar 0(zero).(DO...WHILE)
 */

import java.util.Scanner;

public class Tarefa6DoWhile {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		
		int numero=0, cont=0;
		double media=0.0, soma=0.0;
		
		
		do  {
			System.out.println("Digite um numero inteiro: ");
			numero=leia.nextInt();
			if (numero>0 && (numero%3)==0) {
			soma+=numero;
			 cont++;}
			 
		}
		
		while(numero>0);
		if (cont>0) {
			media=soma/cont;
			
		}
		
		
		System.out.printf("\n\n Soma dos numeros %.0f, total de numeros digitados multiplos de 3: %d e: media %.2f ",soma,cont,media);
	}

}
