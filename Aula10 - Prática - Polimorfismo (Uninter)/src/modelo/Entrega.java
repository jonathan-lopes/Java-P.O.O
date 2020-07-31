package modelo;

public class Entrega {
	private Pedido pedido;
	private Pessoa cliente;
	
	
	public Entrega(Pedido pedido, Pessoa cliente) {
		this.pedido = pedido;
		this.cliente = cliente;
	}
	
	public Entrega() {}
	
	public Pedido getPedido() {
		return pedido;
	}
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	public Pessoa getCliente() {
		return cliente;
	}
	public void setCliente(Pessoa cliente) {
		this.cliente = cliente;
	}
	
	public void emitirNFE(PessoaJuridica pj)
	{
		
	}
	
	public void emitirNFE(PessoaFisica pf)
	{
		
	}
}
