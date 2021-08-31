import java.util.Scanner;

//1. Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e dias e 
//mostre-a expressa apenas em dias. 


public class LIsta1Tarefa1 {
	public static void main (String [] args) {
		Scanner leia=new Scanner(System.in);
		
		//variaveis
		String nome;
		int anos;
		int meses;
		int dias;
		int idade;
		
		//entradas
		System.out.println("Qual o seu nome? ");
		//leia nome
		nome=leia.next();
		
		System.out.println("Quantos anos voce tem? ");
		//leia anos
		anos=leia.nextInt();
	
		System.out.println("Voce tem " +anos+ " anos, e quantos meses? ");
		//leia meses
		meses=leia.nextInt();
		
		System.out.println("Voce tem " +anos+ " anos " +meses+ " meses e quantos dias? " );
		//leia dias
		dias=leia.nextInt();
		
		//processamentos
		idade= ((anos*365)+(meses*30)+dias);
		
		//saidas
		System.out.println("Ola "+nome+ ", voce tem aproximadamente " +idade+ " dias de idade.");
		
		
		
	
	
	}

}
