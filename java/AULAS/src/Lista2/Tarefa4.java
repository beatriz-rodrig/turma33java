package Lista2;

/*
4- Faça um programa em que permita a entrada de um número qualquer e exiba se este número é par ou ímpar.
 Se for par exiba também a raiz quadrada do mesmo; se for ímpar exiba o número elevado ao quadrado.
 */


import java.util.Scanner;
public class Tarefa4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		//variaveis
		double numero, raizQuadrada, elevadoQuadrado;
		
		//entradas
		
		System.out.println("Ola digite um numero:");
		numero=leia.nextDouble();
		//processamentos
		
		raizQuadrada = Math.sqrt(numero);
		elevadoQuadrado = (numero * numero);
		
		//saidas
		
		if (numero==0) {
			System.out.println("Numero Neutro.");
		}
		
		else if (numero%2!=0) {
			System.out.println("Numero impar e esse numero elevado ao quadrado é: " +elevadoQuadrado);
		}
		
		else if (numero%2==0) {
			System.out.println("Numero par e a raiz quadrada é: " +raizQuadrada);
		}
	}

}
