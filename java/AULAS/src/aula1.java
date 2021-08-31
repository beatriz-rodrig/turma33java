import java.util.Scanner;

public class aula1 {
	public static void main (String [] args) {
		Scanner leia=new Scanner(System.in);
		
		       //variaveis
				String nome;
				double temperatura; 
				double conversao;
				
				
				
				//entradas
				System.out.println("Digite o nome: ");
				//leia nome
				nome=leia.next();
				
				System.out.println("Digite a temperatura em Celsius: ");
				//leia temperatura
				temperatura=leia.nextDouble();
				
				conversao=((temperatura * 9 )/5) + 32;
				System.out.println("Ola "+nome+ " a temperatura em fahrenheit é "+conversao+ "º");
	}

}
