package gravaobj;

import java.io.Serializable;
import java.util.List;



public class Cidade implements Serializable {
	
	private static final long serialVersionUID = -793204712285897162L;
	
	static class Ponto implements Serializable
	{
		private static final long serialVersionUID = 2651887979907L;
		
		double x, y;
		public Ponto(double x, double y)
		{
			this.x = x;
			this.y = y;
		}
	}
	
	String nome;
	Ponto coordenadas;
	int populacao;
	boolean cidadePortuaria;
	List<String> palavras_chave;
	
	Bairro[] bairros;

	public Cidade(String nome, double geox, double geoy, int populacao, boolean cidadePortuaria, List<String> palavras_chave,
			Bairro[] bairros) {
		this.nome = nome;
		this.coordenadas = new Ponto(geox, geoy);
		this.populacao = populacao;
		this.cidadePortuaria = cidadePortuaria;
		this.palavras_chave = palavras_chave;
		this.bairros = bairros;
	}
	
	public Cidade () {}
	
	@Override
	public String toString()
	{
		StringBuilder strUtil = new StringBuilder();
		strUtil.append("Cidade: " + this.nome + "\n");
		strUtil.append("\n\tCoordenadas: " + this.coordenadas.x + "," + this.coordenadas.y);
		strUtil.append("\n\tPopula��o: " + this.populacao);
		strUtil.append("\n\tCidade Portu�ria: " + (this.cidadePortuaria ? "Sim" : "N�o"));
		strUtil.append("\n\tPalavras-Chave: " + this.palavras_chave);
		
		strUtil.append("\n\tBairros");
		for(Bairro bairro: this.bairros)
		{
			strUtil.append("\n\tNome do Bairro: " + bairro.nome);
			strUtil.append("\n\t\tTem rio?: " + (bairro.temRio ? "Sim" : "N�o"));
			strUtil.append("\n\t\t\tCaracter�sticas: " + bairro.qualidades);
		}
		return strUtil.toString();
	}
	
}
