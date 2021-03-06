package Principal;

import modelo.Funcionario;
import modelo.Gerente;
import modelo.Supervisor;

public class Principal {

	public void mostraSalarioComComissao(Funcionario f)
	{
		System.out.println("Salario do funcionario " + f.getNome() + " com comissao: " + (f.getSalario() + f.calculaComissao()));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Funcionario funcionario = new Funcionario("3584", "Maria Victoria", null, null, 1045);
		Supervisor supervisor = new Supervisor("4596", "Ingride Dias", null, null, 1600);
		Gerente gerente = new Gerente("3533", "Jonathan Oliveira", null, null, 3000);
		Principal p = new Principal();
		
		p.mostraSalarioComComissao(funcionario);
		p.mostraSalarioComComissao(gerente);
		p.mostraSalarioComComissao(supervisor);
	}

}
