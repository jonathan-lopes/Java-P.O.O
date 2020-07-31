package pctVeiculo2;

public class Veiculo2 {
	private String modeloVeiculo;
	private String marcaVeiculo;
	private String tipoVeiculo;
	private int qtddeRodas;
	private int qtddePassageiros;
	
	public Veiculo2() {}
	
	public void incluiVeiculo(String modelo, String marca, String tipo, int rodas, int passageiros)
	{
		this.modeloVeiculo = modelo;
		this.marcaVeiculo = marca;
		this.tipoVeiculo = tipo;
		this.qtddeRodas = rodas;
		this.qtddePassageiros = passageiros;
	}
	
	public void mostraVeiculo()
	{
		System.out.println("Modelo          : " + this.marcaVeiculo);
		System.out.println("Marca           : " + this.modeloVeiculo);
		System.out.println("Tipo            : " + this.tipoVeiculo);
		System.out.println("Rodas           : " + this.qtddeRodas);
		System.out.println("Passageiros     : " + this.qtddePassageiros);
		System.out.println();
	}

	public String getModeloVeiculo() {
		return modeloVeiculo;
	}

	public void setModeloVeiculo(String modeloVeiculo) {
		this.modeloVeiculo = modeloVeiculo;
	}

	public String getMarcaVeiculo() {
		return marcaVeiculo;
	}

	public void setMarcaVeiculo(String marcaVeiculo) {
		this.marcaVeiculo = marcaVeiculo;
	}

	public String getTipoVeiculo() {
		return tipoVeiculo;
	}

	public void setTipoVeiculo(String tipoVeiculo) {
		this.tipoVeiculo = tipoVeiculo;
	}

	public int getQtddeRodas() {
		return qtddeRodas;
	}

	public void setQtddeRodas(int qtddeRodas) {
		this.qtddeRodas = qtddeRodas;
	}

	public int getQtddePassageiros() {
		return qtddePassageiros;
	}

	public void setQtddePassageiros(int qtddePassageiros) {
		this.qtddePassageiros = qtddePassageiros;
	}
	
	
}
