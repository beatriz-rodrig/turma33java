package exemplos;

import java.util.Scanner;

public class exemplobase {
	public static void main(String[] args) {
	
	Scanner leia = new Scanner(System.in);	
	double base, altura, area;
	
	System.out.println ("Digite o valor da base: ");
	base = leia.nextDouble();
	
	System.out.println("Digite o valor da altura: ");
	altura = leia.nextDouble();
	
	area=((base*altura)/2);
	
	System.out.printf("O valor da �rea desse tri�ngulo � de: %.2f" ,area);


}
}
