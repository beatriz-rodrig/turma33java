package app;

import java.util.Scanner;

import entities.Conta;
import entities.ContaEspecial;

public class TesteContaEspecial {

    public static void main(String[] args) {
        int tipoConta = 3;
        String nome, cpf="";
        
        
        Scanner leia = new Scanner(System.in);

        System.out.print("Qual seu nome");
        nome = leia.next();
        System.out.print("Qual seu cpf");
        cpf = leia.next();
        //
        
        //ContaEstudantil cest1 = new ContaEstudantil(123, cpf, 1000);
        //ContaPoupanca cp1 = new ContaPoupanca(123, cpf, 5);
        //ContaCorrente cc1 = new ContaCorrente(123, cpf, 3);
        // cesp1 = new ContaEspecial(123, cpf, 3, 1000);
        ContaEspecial cesp1 = new ContaEspecial(tipoConta, cpf, tipoConta, tipoConta);
        cesp1.credito(100);
        System.out.println(cesp1.getSaldo());
        cesp1.debito(200);
        System.out.println(cesp1.getSaldo());
        cesp1.getLimite();
        


    }

}
