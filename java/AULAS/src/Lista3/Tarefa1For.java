package Lista3;

import java.util.Scanner;

/* 1- Informar todos os números de 1000 a 1999 que quando divididos por 11 obtemos resto = 5. (FOR)
 
 */
public class Tarefa1For {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int numero=0;
		
		for (int x=1000; x<=1999; x++) {
		if (x%11==5) {
			System.out.println(x);
			}
		}
		
		
		
	}

}
