package modelo;

public class Cliente {
	private String nome;
	private String endereco;
	private  String telefone;
	private Agenda agenda;
	
	public Cliente(String nome, String endereco, String telefone, Agenda agenda) {
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.agenda = agenda;
	}
	
	public Cliente() {}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Agenda getAgenda() {
		return agenda;
	}

	public void setAgenda(Agenda agenda) {
		this.agenda = agenda;
	}

	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
}
