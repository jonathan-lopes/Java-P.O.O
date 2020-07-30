package modelo;

public class Endereco
{
	protected String logradouro;
	protected int numero;
	protected String bairro;
	protected String cidade;
	protected String estado;
	protected long cep;

	public Endereco(String logradouro, int numero, String bairro, String cidade, String estado, long cep)
	{
		this.logradouro = logradouro;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
	}

	public Endereco() {}

	public String getLogradouro()
	{
		return this.logradouro;
	}

	public void setLogradouro(String logradouro)
	{
		this.logradouro = logradouro;
	}

	public int getNumero()
	{
		return this.numero;
	}

	public void setNumero(int numero)
	{
		this.numero = numero;
	}

	public String getBairro()
	{
		return this.bairro;
	}

	public void setBairro(String bairro)
	{
		this.bairro = bairro;
	}

	public String getCidade()
	{
		return this.cidade;
	}

	public void setCidade(String cidade)
	{
		this.cidade = cidade;
	}

	public String getEstado()
	{
		return this.estado;
	}

	public void setEstado(String estado)
	{
		this.estado = estado;
	}

	public long getCep()
	{
		return this.cep;
	}

	public void setCep(long cep)
	{
		if(this.cep > 0)
			this.cep = cep;
	}
}