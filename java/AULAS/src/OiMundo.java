import java.util.Scanner;

public class OiMundo {
	
	public static void main (String [] args) {
		
		Scanner leia=new Scanner(System.in);
		
		//variaveis
		String nome;
		int anoNascimento=1993;
		int anoAtual=2021;
		
		//entradas
		System.out.println("Digite o nome: ");
		//leia nome
		nome=leia.next();
		
		System.out.println("Digite o ano de nascimento: ");
		anoNascimento = leia.nextInt();
		
		//saida
		System.out.println(nome.toUpperCase() + " sua idade é: "+(anoAtual-anoNascimento)+ " anos.");
		System.out.println("O nome da pessoa digitada tem o total de "+nome.length()+" letras");
		
		System.out.print("Oi mundo, turma 33\n");
		System.out.println("Oi mundo, tudo bem?\n");
	}

}
