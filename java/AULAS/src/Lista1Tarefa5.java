import java.util.Scanner;

/*Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste aluno.
Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5, respectivamente. 
 */

public class Lista1Tarefa5 {
	public static void main (String [] args) {
		Scanner leia=new Scanner(System.in);
		
		//variaveis
		double nota1;
		double nota2;
		double nota3;
		double media;
		
		//entradas
		System.out.println("Insira a Nota 1: ");
		//leia nota1
		nota1=leia.nextDouble();
		
		System.out.println("Insira a Nota 2: ");
		//leia nota2
		nota2=leia.nextDouble();
		
		System.out.println("Insira a Nota 3: ");
		//leia nota3
		nota3=leia.nextDouble();
		
		//processamento
		media=((nota1*2)+(nota2*3)+(nota3*5))/10;
		
		//saidas
		System.out.println ("A média do aluno  é: " +media);
		
		
		
		
		
	
	
	}

}
