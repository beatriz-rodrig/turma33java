package exemplos;
import java.util.Scanner;
/*
1- Fa�a um programa que mostre uma contagem na tela de 233 a 456, s� que contando de 3 em 3 quando quando
est�o entre 300 e 400 e de 5 em 5 quando n�o est�o.
/*

 */
public class FacaEnquanto {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		//variaveis
		int x=233;
		
		do {
			if (x >=400 && x <=500) {
				x=x+5;
				
			}
			 else {
				 x=x+3;
				
			}
		
			System.out.println ("\n" +x);		
		
		}
		
		while (x<456);

	}

}
