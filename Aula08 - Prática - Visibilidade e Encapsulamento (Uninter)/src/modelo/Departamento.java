package modelo;

public class Departamento
{
	protected String nome;
	protected String id;

	public Departamento(String nome, String id)
	{
		this.nome = nome;
		this.id =id;
	}

	public Departamento() {}

	public String getNome()
	{
		return this.nome;
	}

	public void setNome(String nome)
	{
		this.nome = nome;
	}

	public String getId()
	{
		return this.id;
	}

	public void setId(String id)
	{
		this.id = id;
	}
}	