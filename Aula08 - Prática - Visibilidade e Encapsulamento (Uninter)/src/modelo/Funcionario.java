package modelo;

public class Funcionario
{
	protected String matricula;
	protected String nome;
	protected Endereco endereco;
	protected Departamento setor;
	protected double salario;

	public Funcionario(String matricula, String nome, Endereco endereco, Departamento setor, double salario)
	{
		this.matricula = matricula;
		this.nome = nome;
		this.endereco = endereco;
		this.setor = setor;
		this.salario = salario;
	}

	public Funcionario() {}

	public String getMatricula()
	{
		return this.matricula;
	}

	public void setMatricula(String matricula)
	{
		this.matricula = matricula;
	}

	public String getNome()
	{
		return this.nome;
	}

	public void setNome(String nome)
	{
		this.nome = nome;
	}

	public Endereco getEndereco()
	{
		return this.endereco;
	} 

	public void setEndereco(Endereco endereco)
	{
		this.endereco = endereco;
	}

	public Departamento getDepartamento()
	{
		return this.setor;
	}

	public void setDepartemento(Departamento setor)
	{
		this.setor = setor;
	}
	
	public double getSalario() 
	{
		return this.salario;
	}
	
	public void setSalario(double salario)
	{
		this.salario = salario;
	}
	
	public double calculaComissao() 
	{
		return salario * 0.1;
	}
}