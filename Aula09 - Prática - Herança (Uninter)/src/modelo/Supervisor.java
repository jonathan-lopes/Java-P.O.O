package modelo;    // O projeto (Aula08 - Pr�tica - visiblidade e encapsulamento (Uninter)) foi incluido nesse projeto.

public class Supervisor extends Funcionario {
	public Supervisor() {
		super();
	}

	public Supervisor(String matricula, String nome, Endereco endereco, Departamento setor, double salario) {
		super(matricula, nome, endereco, setor, salario);
		
	}
	
	@Override
	public double calculaComissao()
	{
		return salario * 0.15;
	}
}
