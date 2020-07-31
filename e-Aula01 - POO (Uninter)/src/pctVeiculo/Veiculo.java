package pctVeiculo;

public class Veiculo 
{
	String modeloVeiculo;
	String marcaVeiculo;
	String tipoVeiculo;
	int qtddeRodas;
	int qtddePassageiros;
	
	public Veiculo() {}
	
	void incluiVeiculo(String modelo, String marca, String tipo, int rodas, int passageiros)
	{
		this.modeloVeiculo = modelo;
		this.marcaVeiculo = marca;
		this.tipoVeiculo = tipo;
		this.qtddeRodas = rodas;
		this.qtddePassageiros = passageiros;
	}
	
	void mostraVeiculo()
	{
		System.out.println("Modelo          : " + this.marcaVeiculo);
		System.out.println("Marca           : " + this.modeloVeiculo);
		System.out.println("Tipo            : " + this.tipoVeiculo);
		System.out.println("Rodas           : " + this.qtddeRodas);
		System.out.println("Passageiros     : " + this.qtddePassageiros);
		System.out.println();
	}
	
}
