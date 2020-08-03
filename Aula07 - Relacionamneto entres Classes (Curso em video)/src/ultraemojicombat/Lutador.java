package ultraemojicombat;

public class Lutador 
{
	// Atributos
	private String nome, nacionalide, categoria;
	private int idade, vitorias, derrotas, empates;
	private float altura, peso;
	
	// M�todos P�blicos
	public void apresentar()
	{
		System.out.println("------------------------------------------");
		System.out.println("CHEGOU A HORA! Apresentamos o lutador " + this.getNome());
		System.out.println("Diretamente de " + this.getNacionalide());
		System.out.println("Com " + this.getIdade() + " anos e " + this.getAltura() + " de altura");
		System.out.println("Pesando " + this.getPeso() + "Kg");
		System.out.println(this.getVitorias() + " Vitorias");
		System.out.println(this.getDerrotas() + " Derrotas e");
		System.out.println(this.getEmpates() + " Empates");
	}
	
	public void status()
	{
		System.out.println();
		System.out.println(this.getNome() + " eh um peso " + this.getCategoria());
		System.out.println("Ganhou " + this.getVitorias() + " Vezes");
		System.out.println("Perdeu " + this.getDerrotas() + " vezes");
		System.out.println("Empatou " + this.getEmpates() + " vezes");
		System.out.println();
	}
	
	public void ganharLuta()
	{
		this.setVitorias(this.getVitorias() + 1);
	}
	
	public void perderLuta()
	{
		this.setDerrotas(this.getDerrotas() + 1);
	}
	
	public void empatarLuta() 
	{
		this.setEmpates(this.getEmpates() + 1);
	}


	// M�todos Especias
	
	public Lutador(String nome, String nacionalide, int idade, int vitorias, int derrotas, int empates, float altura,
			float peso) {
		this.nome = nome;
		this.nacionalide = nacionalide;
		this.idade = idade;
		this.vitorias = vitorias;
		this.derrotas = derrotas;
		this.empates = empates;
		this.altura = altura;
		this.setPeso(peso);
	}
	
	public Lutador() {}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNacionalide() {
		return nacionalide;
	}

	public void setNacionalide(String nacionalide) {
		this.nacionalide = nacionalide;
	}

	public String getCategoria() {
		return categoria;
	}

	private void setCategoria() {
		if(this.peso < 52.2)
		{
			this.categoria = "Invalido";
		}
		else
		{
			if(this.peso <= 70.4)
			{
				this.categoria = "Leve";
			}
			else
			{
				if(this.peso <= 83.9)
				{
					this.categoria = "Medio";
				}
				else
				{
					if(this.peso <= 120.2)
					{
						this.categoria = "Pesado";
					}
					else 
					{
						this.categoria = "Invalido";
					}
				}
			}
		}	
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getVitorias() {
		return vitorias;
	}

	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}

	public int getDerrotas() {
		return derrotas;
	}

	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}

	public int getEmpates() {
		return empates;
	}

	public void setEmpates(int empates) {
		this.empates = empates;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
		this.setCategoria();
	}
	
}
