/*Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a expressa 
 em anos, meses e dias. 
 */


import java.util.Scanner;

public class Lista1Tarefa2 {
	public static void main (String [] args) {
	Scanner leia=new Scanner(System.in);
	
	//VARIAVEIS
	String nome;
	int idade;
	int mes;
	int dia;
	int diasNasc;
	
	//entradas
	
	System.out.println("Qual o seu nome? ");
	//leia nome
	nome=leia.next();
	
	System.out.println("Quantos dias de vida voce tem? ");
	//leia diasNasc
	diasNasc=leia.nextInt();
	
	//processamentos
	idade=diasNasc/365;
	mes= (diasNasc%365)/30;
	dia= (diasNasc%365)%30;
	
	//saidas
	System.out.println("Ola " +nome+ " sua idade é " +idade+ " anos, voce nasceu no mes " +mes+ " no dia " +dia);
			
	
	
	
	
	
	}
	
}
