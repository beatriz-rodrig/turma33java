package Lista3;
/*
 2- Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)

 */

import java.util.Scanner;
public class Tarefa2For {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		//variaveis
		int numero,quantiaPares=0,quantiaImpares=0,x=0;
		
		
		for (x=1; x<=10; x++) {
			System.out.println("Digite o " +x+ "� numero");
			numero=leia.nextInt();
			
			
			if ((numero % 2) == 0) {
				quantiaPares++;}
			
			else  {
				quantiaImpares++;}
			
		}
		
		System.out.printf("%d numeros pares.\n", quantiaPares);
		System.out.printf("%d numeros impares.\n", quantiaImpares);
			
		
	}

}
