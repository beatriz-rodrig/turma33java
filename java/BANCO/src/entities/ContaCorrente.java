package entities;

public class ContaCorrente extends Conta{
        //atributos
        private int contadorTalao;


        //construtor
        	public ContaCorrente(int numero, String cpf, int contadorTalao) {
			super(numero, cpf);
			this.contadorTalao = contadorTalao;
		}

        //encapsulamento
        public int getcontadorTalao() {
            return contadorTalao;
        }

        
		public void setcontadorTalao(int contadorTalao) {
            this.contadorTalao = contadorTalao;
        }


        //metodos



		public void contadorTalao() {
			if(this.contadorTalao <= 10) {
    			contadorTalao = this.contadorTalao + 30;
    			System.out.println("voce tem mais um talão de cheques disponivel em sua conta.");
    		}
    		else {
    			System.out.println(" voce ainda não possui novos talões dispon�veis");
    		}
			
		}


		


}

