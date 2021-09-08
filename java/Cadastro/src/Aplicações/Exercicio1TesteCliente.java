package Aplicações;

/*
 * 1) Crie uma classe cliente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informações deste objeto no console.
 */
import Classes.Cliente;



public class Exercicio1TesteCliente {
	
	public static void main (String [] args) {
	
	Cliente cli1= new Cliente ();
	cli1.anoNascimento = 1993;
	cli1.nome = "Beatriz";
	cli1.CPF = "000.000.000-00";
	cli1.ativarCliente ();
	System.out.printf("Bom dia %s! ", cli1.nome);
	System.out.println("\nIdade do cliente é " +cli1.calculeIdade(2021));
	System.out.println("CPF da cliente: " +cli1.CPF);
	

	}
}