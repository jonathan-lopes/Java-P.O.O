package pratica02;
public class Pratica02 
{
	public static void main(String[] args)
	{
		Cadeira cadeiraMadeira = new Cadeira();
		cadeiraMadeira.altura = 1.0f;
		cadeiraMadeira.largura = 80f;
		cadeiraMadeira.material = "Madeira";
		cadeiraMadeira.braco = false;
		cadeiraMadeira.status();
		cadeiraMadeira.braço();
		
		System.out.println(" ");
		
		Cadeira cadeiraPlastico = new Cadeira();
		cadeiraPlastico.altura = 1.5f;
		cadeiraPlastico.largura = 70f;
		cadeiraPlastico.material = "Plastico";
		cadeiraPlastico.braco = true;
		cadeiraPlastico.status();
		cadeiraPlastico.braço();
		
		System.out.println(" ");
		
		Cadeira cadeiraMetal = new Cadeira();
		cadeiraMetal.altura = 1.2f;
		cadeiraMetal.largura = 90f;
		cadeiraMetal.material = "Matal";
		cadeiraMetal.braco = true;
		cadeiraMetal.status();
		cadeiraMetal.braço();
		
		Monitor mon1 = new Monitor();
			mon1.tamanho = 21.5f;
			mon1.modelo = "Samsung";
			mon1.espessura = 3f;
			mon1.ligada = true;
			mon1.imagem();
			mon1.status();
	}
}  
	
	

