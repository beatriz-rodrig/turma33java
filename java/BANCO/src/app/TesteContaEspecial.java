package app;

import java.util.Scanner;

import entities.Conta;
import entities.ContaEspecial;

public class TesteContaEspecial {
	
	
    public static void main(String[] args) {
    	
		Scanner leia = new Scanner(System.in);
	
		char resposta;
		double valorEspecial;
		char opcao;
		ContaEspecial cesp1 = new ContaEspecial(03, "123.456.789-10", 3, 1000);


    	// Conta Especial
		
		System.out.println("\n\tSaldo atual: R$ " + cesp1.getSaldo());
		if(cesp1.getSaldo() <= 0) {
		System.out.print("\n\tSeu saldo se encontra no valor de: R$ "+cesp1.getSaldo());
		System.out.print("\n\n\tVocê possui limite especial disponivel.");
		System.out.print("\n\tDeseja utilizar? (S/N): ");
		resposta = leia.next().toUpperCase().charAt(0);
		if(resposta == 'S') {
		System.out.print("\n\tDigite o valor desejado (Limite de R$ 1000,00): ");
		valorEspecial = leia.nextDouble();
		cesp1.usarLimite(valorEspecial);
			}
		}
		else {
			System.out.print("\n\tContinuar? (S/N): ");
		opcao = leia.next().toUpperCase().charAt(0);
		if (opcao == 'N') {
		
			}
		}
		
		System.out.println("\n\tSaldo atual: R$ " + cesp1.getSaldo());
		
}


    }



