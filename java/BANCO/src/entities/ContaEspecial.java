package entities;

import java.util.Scanner;

public class ContaEspecial extends Conta {
    Scanner leia = new Scanner(System.in);

	//atributos
	private double limite=1000.00;

	
	
	
	//construtor


	public ContaEspecial(int numero, String cpf, int contadorTalao, double limite) {
		super(numero, cpf);
		this.limite = limite;
	}

	

	//encapsulamento
	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	//metodos
	@Override
	public void debito(double valor) {
		if (valor <= 0) {
			System.out.println("Valor invalido");
		} else if (valor <= saldo) {
			System.out.println("");

			double saldo;
			saldo = super.getSaldo();

			saldo -= valor;
			super.debito(valor);

		} else if (valor <= getSaldo() + getLimite()) {
			System.out.println("Saldo em conta insuficiente para realizar a opera��o.");
			System.out.println("Utilizando " + (valor - getSaldo()) + " do limite.");
			if (valor > 0) {
				limite -= (valor - getSaldo());
				if (getSaldo() > 0) {
					super.debito(getSaldo());
				}
			} else {
				System.out.println("Seu limite é insuficiente");
			}
		}
		System.out.println("Seu limite atual R$: " + getLimite());
		
	}

	 }



	
	


