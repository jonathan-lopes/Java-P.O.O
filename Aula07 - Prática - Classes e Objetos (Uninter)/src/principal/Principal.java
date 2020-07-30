package principal;

import modelo.Cliente;
import modelo.Agenda;
import modelo.Animal;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Agenda ag = new Agenda("13:00", "21/07/2020", "Rua Aquino");
		Cliente c1 = new Cliente("Norma", "Aqui", "555-1234", ag);
		Animal a1 = new Animal("Kita", "Cachorro", "SRD", c1);
		
		System.out.println("Nome: " + a1.getTutor().getNome() + " Animal: " + a1.getNome());
		System.out.println("Data: " + c1.getAgenda().getData() + " Hora: " + c1.getAgenda().getHora() + " Local: " + c1.getAgenda().getLocal());
	}

}
