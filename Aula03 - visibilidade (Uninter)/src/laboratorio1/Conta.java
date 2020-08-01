package laboratorio1;

 public abstract class Conta {

	protected double saldo;
	protected double limite;

	public Conta(double saldo)
	{
		this.saldo = saldo;
	}

	public double saldo()
	{
		return saldo;
	}

	public void criarLimite(double limite)
	{
		this.limite = limite;
	}

	public double deposito(double valor)
	{
		saldo += valor;
		return saldo;
	}

	 public abstract double saque(double valor);
}
