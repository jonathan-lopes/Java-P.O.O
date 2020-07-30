package model;

public class PessoaFisica extends Pessoa {
	protected  long cpf;
	
	public PessoaFisica(String nome, String endereco, String contato, long cpf)
	{
		super(nome, endereco, contato);
		this.setCpf(cpf);
	}

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
}
