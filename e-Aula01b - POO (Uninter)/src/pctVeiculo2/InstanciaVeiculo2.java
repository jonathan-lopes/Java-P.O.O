package pctVeiculo2;

public class InstanciaVeiculo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Veiculo2 carro = new Veiculo2();
		carro.incluiVeiculo("Peugeot 208", "Peugeot", "Passageiro", 4, 5);
		carro.mostraVeiculo();
		
		carro.setModeloVeiculo("Peugeot 308");
		System.out.println("**** Modelo Alterado: " + carro.getModeloVeiculo());
		System.out.println();
		
		Veiculo2 moto = new Veiculo2();
		moto.incluiVeiculo("Iron 808", "Harley Davidson", "Passageiro", 2, 2);
		moto.mostraVeiculo();
		
		Veiculo2 onibus = new Veiculo2();
		onibus.incluiVeiculo("9700 Grand L", "Volvo", "Passageiro", 4, 42);
		onibus.mostraVeiculo();
	}

}
