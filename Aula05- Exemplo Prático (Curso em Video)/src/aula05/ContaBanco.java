package aula05;

public class ContaBanco 
{
	//Atributos
	public int numConta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;
	
	// Metodos Especias
	public ContaBanco () 
	{
		this.setSaldo(0f);
		this.setStatus(false);
	}
	
	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	// Metados Persolizados
	public void estadoAtual()
	{
		System.out.println("---------------------------");
		System.out.println("Conta:" + this.getNumConta());
		System.out.println("Tipo: " + this.getTipo());
		System.out.println("Dono: " + this.getDono());
		System.out.println("Saldo " + this.getSaldo());
		System.out.println("Status: "+ this.isStatus());
	}
	
	public void abrirConta(String tipo)
	{
		this.setTipo(tipo);
		this.setStatus(true);
		
		if(this.getTipo() == "CC") 
		{
			System.out.println("Sua conta ja começou com R$50 reais.");
			this.setSaldo(50f);
		}
		else
		{
			if(this.getTipo() == "CP")
			{
				System.out.println("Sua conta ja começou com R$150 reais.");
				this.setSaldo(150f);
			}
		}
	}  
	
	public void fecharConta()
	{
		if(this.getSaldo() < 0)
		{
			System.out.println("Nao foi possivel fechar sua conta, conta em debito");
		}
		else
		{
			if(this.getSaldo() > 0)
			{
				System.out.println("Conta com dinheiro.");
			}
			else
			{
				this.setStatus(false);
				System.out.println("Conta fechada com sucesso.");
			}
		}
	}

	public void depositar(float saldo)
	{
		if(this.isStatus())
		{
			this.setSaldo(getSaldo() + saldo); 
			System.out.println("Deposito realizado na conta de " + this.getDono());
		}
		else
		{
			System.out.println("Impossivel depositar");
		}
	}

	public void sacar(float saldo)
	{
		if(this.getSaldo() >= saldo && this.isStatus())
		{
			this.setSaldo(this.getSaldo() - saldo);
			System.out.println("Dinheiro sacado na conta " + this.getDono());
		}
		else
		{
			System.out.println("Dinheiro insuficiente na conta.");
		}
	}
	
	public void pagarMensal()
	{ 
		int v = 0; 
		
		if(this.getTipo() == "CC")
		{
			System.out.println("Descontando mensalidade de R$12 reais");
			v = 12;
		}
		else
		{
			if(this.getTipo() == "CP")
			{
				System.out.println("Descontando mensalidade de R$20 reais");
				v = 20;
			}
			
			if(this.isStatus())
			{
				if(saldo > v)
				{
					this.setSaldo(this.getSaldo() - v);
					System.out.println("Mensalidade paga com sucesso.");
				}
				else
				{
					System.out.println("Nao foi possivel pagar.");
				}
			}
		}
	}
}
