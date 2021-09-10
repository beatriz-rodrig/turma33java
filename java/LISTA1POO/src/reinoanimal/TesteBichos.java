package reinoanimal;

public class TesteBichos {

	public static void main(String[] args) {
		
		
		Cachorro cao1 = new Cachorro("Caramelo", 15);
		Cavalo cav1 = new Cavalo("Pé de Pano" , 7);
		Preguica preg1 = new Preguica ("Flash ", 4);
		
		
		cao1.correr();
		cao1.emitirSom();
		
		cav1.correr();
		cav1.emitirSom();
		
		preg1.emitirSom();
	
		 System.out.println(cao1.toString());
		 System.out.println( cav1.toString());
	
	}
}
