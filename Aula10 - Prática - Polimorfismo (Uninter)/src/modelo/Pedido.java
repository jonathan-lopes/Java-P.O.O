package modelo;

import java.util.List;

public class Pedido {
	private int numero;
	private List<ItemPedido> itens;
	
	public Pedido(int numero, List<ItemPedido> itens) {
		this.numero = numero;
		this.itens = itens;
	}
	
	public Pedido() {}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public List<ItemPedido> getItens() {
		return itens;
	}
	public void setItens(List<ItemPedido> itens) {
		this.itens = itens;
	}
	

}
