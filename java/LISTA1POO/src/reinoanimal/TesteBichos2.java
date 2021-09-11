package reinoanimal;


public class TesteBichos2 {
	

		public static void main(String[] args) {
			
			Cachorro2 cao2 = new Cachorro2("Caramelo", 5, true, true);
			Cavalo2 cavalo2 = new Cavalo2("PÉ-DE-PANO", 8, true, true);
			Preguica2 preguica2 = new Preguica2("THE FLASH", 6, true, true);
			
		    cavalo2.emiteSom();
		    cavalo2.correr();
		    cao2.emiteSom();
		    cao2.correr();
		    preguica2.emiteSom();
		    preguica2.subirArvore();
			
		}

	}
