package main;

import aula04.Departamento;
import aula04.Funcionario;

public class Main {

	public static void main(String[] args) {
		Departamento departamento = new Departamento("Financeiro", 5941);
		Funcionario funcionario = new Funcionario(2314, "Rosana", 7380, departamento);
		
		System.out.println("Nome: " + funcionario.getNome());
		System.out.println("Matricula: "+  funcionario.getMatricula());
		System.out.println("Ramal: " + funcionario.getRamal());
		System.out.println("Departamento - Nome: " + funcionario.getDepartamento().getNome());
	}
}
