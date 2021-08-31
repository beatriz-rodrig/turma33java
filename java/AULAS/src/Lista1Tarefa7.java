import java.util.Scanner;

/*7- Um sistema de equações lineares do tipo: ax+by=c / dx+ey=f, pode ser resolvido
segundo mostrado abaixo : 
x=ce-bf/ae-bd y=af-cd/ae-bd
Escreva um sistema que lê os coeficientes a,b,c,d,e e f e calcula e mostra os valores
de x e y. 
 
 */
public class Lista1Tarefa7 {
	public static void main (String [] args) {
		
		Scanner leia=new Scanner(System.in);
		
		//variaveis
		
		double a,b,c,d,e,f,x,y;
		
		//entradas
		
		System.out.println("Valor de a: ");
		//leia a
		a=leia.nextDouble();

		System.out.println("Valor de b: ");
		//leia b
		b=leia.nextDouble();
		
		System.out.println("Valor de c: ");
		//leia c
		c=leia.nextDouble();
		
		System.out.println("Valor de d: ");
		//leia d
		d=leia.nextDouble();
		
		System.out.println("Valor de e: ");
		//leia e
		e=leia.nextDouble();
		
		System.out.println("Valor de f: ");
		//leia f
		f=leia.nextDouble();
		
		//processamentos
	 	x = ((c*e)-(b*f)) / ((a*e) - (b*d));
	 	y = ((a*f)-(c*d)) / ((a*e) - (b*d));
	 	
	 	System.out.println("Valor de x: " +x);
	 	System.out.println("Valor de y: " +y);
	 	
	 	
	}	 	
}