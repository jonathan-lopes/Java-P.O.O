package pratica02;
public class Cadeira {

	float altura;
	float largura;
	String modelo;
	String material;
	boolean braco;
	String fabricante;
	
	public void bra�o()
	{
		if(this.braco == true)
		{
			System.out.println("Repousando o bra�o");
		}
		else
		{
			System.out.println("ERRO, cadeira sem bra�o ");
		}
	}
	
	public void status() 
	{
		System.out.println("Fabricante: " + this.fabricante);
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Altura: " + this.altura);
		System.out.println("Largura: " + this.largura);
		System.out.println("Material: " + this.material);
		System.out.println("Tem bra�o? " + this.braco);
		System.out.println(" ");

	}
	
}
