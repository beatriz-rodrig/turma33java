package Classes;

public class Aviao {

	//Atributos
	public boolean ligado=false;
	public String modelo;
	public String cor;
	

	public void ligarAviao() {
		System.out.println("Ligando o avi�o...");
		ligado=true;
	}
	public void desligarAviao() {
		System.out.println("Desligando o avi�o...");
		ligado=false;
	}
	public void estadoAviao() {
		if(ligado) {
			System.out.println("O avi�o esta ligado");
		}
		else {
			System.out.println("O avi�o esta desligado");
		}
}
	
}
