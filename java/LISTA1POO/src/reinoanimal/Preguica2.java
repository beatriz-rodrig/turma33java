package reinoanimal;

public class Preguica2 extends Animal2 {

	public Preguica2(String name, int age, boolean emiteSom, boolean correr) {
		super(name, age, emiteSom, correr);
		// TODO Auto-generated constructor stub
	}

	public void subirArvore() {
			System.out.println("Preguica subindo em arvores........");
		
	}

	@Override
	public void emiteSom() {
		if (super.isEmiteSom() == true) {
			System.out.println("AAAAAAAAAAAAAA‘‘‘IN..........");
		}
	}

}
