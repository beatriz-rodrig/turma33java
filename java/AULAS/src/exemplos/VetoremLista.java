package exemplos;

import java.util.Arrays;
import java.util.List;

public class VetoremLista {
	public static void main (String[] args) {
	String nomeProduto[]= {"T�nis Nike \n", "T�nis Adidas\n", "T�nis Puma", "Camisa Nike","Camisa Lacoste", "Camisa Supreme", "Meia Nike", "Meia Adidas", "Bola de futebol", "Blusa moleton Nike"};
	List listaNomeProduto = Arrays.asList(nomeProduto);
	System.out.println(listaNomeProduto);
	
	}
}
