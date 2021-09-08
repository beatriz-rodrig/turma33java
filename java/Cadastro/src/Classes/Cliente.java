package Classes;

public class Cliente {
	//atributos
	
	public String CPF;
	public String nome;
	public int anoNascimento;
	boolean ativo;
	public char pronome;
	
	
	//metodos
	public int calculeIdade () {
		return (2021-this.anoNascimento);
	}
	public int calculeIdade (int anoAtual) {
		return (anoAtual-this.anoNascimento);
	}
	
	public void ativarCliente() {
		this.ativo = true;
		
	}
	
	public void desativarCliente() {
		this.ativo = false;
}
	
	
}