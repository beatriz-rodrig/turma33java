package Lista2;

/*Fa�a um programa que receba a idade de uma pessoa e mostre na sa�da em qual categoria ela se encontra:
10-14 infantil
15-17 juvenil
18-25 adulto
 */

import java.util.Scanner;
public class Tarefa3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		//Variaveis
		int idade;
		
		//entrada
		System.out.println("Digite a sua idade:");
		idade = leia.nextInt();
		
		//processamentos
		
		if(idade>=10 && idade<=14) {
			System.out.println("Voce tem " +idade+ " anos, e sua categoria � infantil.");
		}
		else if (idade>=15 && idade<=17 ) {
			System.out.println("Voce tem " +idade+ " anos, e sua categoria � juvenil.");
			}
		else if (idade>=18 && idade<=25 ) {
			System.out.println("Voce tem " +idade+ " anos, e sua categoria � adulto.");}
		
		else {
			System.out.println("Voce tem " +idade+ " anos, e voce n�o se encaixa em nenhuma categoria!!!");
		}
			

	}

}
