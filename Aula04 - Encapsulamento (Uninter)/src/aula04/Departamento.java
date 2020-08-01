package aula04;

public class Departamento {
	private String nome;
	private int id;
	
	public Departamento(String nome, int id) {
		super();
		this.nome = nome;
		this.id = id;
	}
	
	public Departamento() {
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNomeString(String nome) {
		if(nome.isEmpty())
			this.nome = nome;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
}
