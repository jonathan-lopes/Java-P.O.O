package laboratorio2;

import laboratorio1.Conta;

public class ContaCorrente extends Conta{
	public ContaCorrente()
	{
		super(10000);
	}

	public double saque(double valor)
	{
		if(valor > saldo + limite)
		{
			saldo = saldo + limite - valor;
		}
		
		return saldo;
	}

	public static void main(String[] args) 
	{
		ContaCorrente cc = new ContaCorrente();

		System.out.println(cc.saldo());
		cc.deposito(1000);
		System.out.println(cc.saldo());
		cc.saque(6000);
		System.out.println(cc.saldo());
	}	
}
