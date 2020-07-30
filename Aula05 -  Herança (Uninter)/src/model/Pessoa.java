package model;

public class Pessoa {
	protected String nome;
	protected String endereco;
	protected String contato;
	
	public Pessoa(String nome, String endereco, String contato) {
		/*this.nome = nome;
		this.endereco = endereco;
		this.contato = contato;*/
		this.setNome(nome);
		this.setEndereco(endereco);
		this.setContato(contato);
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String getContato() {
		return contato;
	}
	
	public void setContato(String contato) {
		this.contato = contato;
	}
	
	
}
