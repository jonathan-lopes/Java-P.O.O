package pctVeiculo;

public class InstanciaVeiculo {

	public static void main(String[] args) {
		Veiculo carro = new Veiculo();
		carro.incluiVeiculo("Peugeot 208", "Peugeot", "Passageiro", 4, 5);
		carro.mostraVeiculo();
		
		Veiculo moto = new Veiculo();
		moto.incluiVeiculo("Iron 808", "Harley Davidson", "Passageiro", 2, 2);
		moto.mostraVeiculo();
		
		Veiculo onibus = new Veiculo();
		onibus.incluiVeiculo("9700 Grand L", "Volvo", "Passageiro", 4, 42);
		onibus.mostraVeiculo();
	}

}
