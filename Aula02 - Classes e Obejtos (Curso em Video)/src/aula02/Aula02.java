package aula02;
public class Aula02 {

	public static void main(String[] args) {
		Caneta c1 = new Caneta();
		c1.cor = "Azul";
		c1.ponta = 0.5f;
		c1.modelo = "Bic";
		c1.carga = 65;
		c1.tampar();
		c1.status();
		c1.rabiscar();
		
		System.out.println("");
		
		Caneta c2 = new Caneta();
		c2.cor = "preto";
		c2.ponta = 1.0f;
		c2.modelo = "Faber Castell";
		c2.carga = 30;
		c2.destampar();
		c2.status();
		c2.rabiscar();
	}
	
}
 