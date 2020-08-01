package pratica02;
public class Monitor {

	float tamanho;
	String modelo;
	float espessura;
	boolean ligada;
	
	public void imagem()
	{
		if(this.ligada == true)
		{
			System.out.println("Ligada");
		}
		else
		{
			System.out.println("Desligada");
		}
	}
	
	void status() 
	{
		System.out.println("Tamanho: " + this.tamanho);
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Espessura: " + this.espessura);
		System.out.println("Esta ligada? " + this.ligada);
		System.out.println(" ");
	}
}
