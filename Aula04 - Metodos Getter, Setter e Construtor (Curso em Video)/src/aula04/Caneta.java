package aula04;
public class Caneta {
	public String modelo;
	private float ponta;
	private String cor;
	private boolean tampada; 
	
	public Caneta(String m, String c, float p)	//Metado construtor
	{
		this.tampar();
		this.setModelo(m);
		this.setCor(c);
		this.setPonta(p);
	}
	
	public String getCor() {
		return this.cor;
	}

	public void setCor(String c) 
	{
		this.cor = c;
	}

	public boolean isTampada() 
	{
		return tampada;
	}

	public void setTampada(boolean t) 
	{
		this.tampada = t;
	}

	public String getModelo()
	{
		return this.modelo;
	}
	public void setModelo(String m)
	{
		this.modelo = m;
	}
	
	public float getPonta() 
	{
		return ponta;
	}
	public void setPonta(float p)
	{
		this.ponta = p;
	}
	
	public void tampar()
	{
		this.tampada = true;
	}
	
	public void destampar()
	{
		this.tampada = false;
	}
	
	public void status()
	{
		System.out.println("SOBRE A CANETA");
		System.out.println("");
		System.out.println("Modelo: " + this.getModelo());
		System.out.println("Ponta: " + this.getPonta());
		System.out.println("Cor: " + this.getCor());
		System.out .println("Tampada: " + this.isTampada());
		System.out.println("");
	}
}
