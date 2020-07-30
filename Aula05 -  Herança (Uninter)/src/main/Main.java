package main;

import model.Funcionario;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Funcionario func = new Funcionario("Claudio", "Garcia", "claudio.jose@java.com", 1234, 5487, "Enfermeiro");
		System.out.println("Nome: " + func.getNome());
		System.out.println("Bairro: " + func.getEndereco());
		System.out.println("Contato: " + func.getContato());
		System.out.println("CPF: " + func.getCpf());
		System.out.println("Matricula: " + func.getMatricula());
		System.out.println("Cargo: " + func.getCargo());
	}

}
