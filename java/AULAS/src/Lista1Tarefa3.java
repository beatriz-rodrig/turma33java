import java.util.Scanner;

/*Fa�a um sistema que leia o tempo de dura��o de um evento em uma f�brica expressa 
em segundos e mostre-o expresso em horas, minutos e segundos. 
 */
public class Lista1Tarefa3 {
	public static void main (String [] args) {
		Scanner leia=new Scanner(System.in);
		
		//VARIAVEIS
		int tempoEmSegundos;
		int horas;
		int minutos;
		int segundos;
		
		//entradas
		
		System.out.println("Informe o tempo expresso em segundos: ");
		//leia tempoEmSegundos
		tempoEmSegundos=leia.nextInt();
		
		//processamentos 
		
		horas = tempoEmSegundos / 3600;
		minutos = (tempoEmSegundos % 3600)/60;
		segundos =  (tempoEmSegundos % 3600)%60;
		
		
		//saidas
		System.out.println("A dura��o do evento foi de: " +horas+ " horas, " +minutos+ " minutos e "+segundos+ " segundos.");
		
		
		
		

	
	}

}
