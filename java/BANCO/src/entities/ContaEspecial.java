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
	
	public void usarLimite(double valor) {
		this.limite = this.limite - valor;
		super.credito(valor);
	}	

	 }



	
	


