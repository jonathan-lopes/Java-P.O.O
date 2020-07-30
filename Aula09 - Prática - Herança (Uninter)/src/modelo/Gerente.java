package modelo;		 // O projeto (Aula08 - Prática - visiblidade e encapsulamento (Uninter)) foi incluido nesse projeto.

public class Gerente extends Funcionario {

	public Gerente() {
		super();
	}

	public Gerente(String matricula, String nome, Endereco endereco, Departamento setor, double salario) {
		super(matricula, nome, endereco, setor, salario);
	}
	
	@Override
	public double calculaComissao() 
	{
		return salario * 0.2;
	}
}
