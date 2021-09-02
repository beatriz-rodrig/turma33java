package Lista3;

import java.util.Scanner;

/*3-Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos. 
Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99. (WHILE)
 */


public class Tarefa3While {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		//variaves
		
		int idade=0, totalMenor21=0, totalMaior50=0;
		
		System.out.println("Digite a idade: ");
		idade=leia.nextInt();
		
		 while (idade !=- 99) {
			 System.out.println("Digite a idade: ");
				idade=leia.nextInt();
				
				if (idade < 21) totalMenor21++;
				
				
				if (idade > 50)  totalMaior50++;
						 }
		
		 System.out.printf("Total de idades menores que 21 é %d.\n", totalMenor21);
		 System.out.printf("Total de idades maiores que 50 é %d.\n", totalMaior50);
		
	
	
	
	}

}
