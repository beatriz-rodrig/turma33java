package Classes;

public class Aviao {

	//Atributos
	public boolean ligado=false;
	public String modelo;
	public String cor;
	

	public void ligarAviao() {
		System.out.println("Ligando o avião...");
		ligado=true;
	}
	public void desligarAviao() {
		System.out.println("Desligando o avião...");
		ligado=false;
	}
	public void estadoAviao() {
		if(ligado) {
			System.out.println("O avião esta ligado");
		}
		else {
			System.out.println("O avião esta desligado");
		}
}
	
}
