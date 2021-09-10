package entities;

public class ContaEspecial extends ContaCorrente {
	
	//atributos
	private double limite =1000.00;
	
	
	//construtor

	public ContaEspecial(int numero, String cpf, int contadorTalao, double limite) {
		super(numero, cpf, contadorTalao);
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
	
	public double debitar(double valor)
    {
    	double saldoComLimite=getSaldo()+limite;
    	if((saldoComLimite+valor)>=-0)
    	{
    		
    		limite = getSaldo()-valor;
    		System.out.println("SALDO DISPONIVEL: R$"+limite);
    		return limite;
    	}
    	else
    	{
    		System.out.println("Você ultrapassou o seu limite!");
    		return limite;
    	}
 
    }
    }
	
	
	
	
	


