package ultraemojicombat;

import java.util.Random;

public class Luta {
	// Atributos
	private Lutador desafiante;
	private Lutador desafiado;
	private int rounds;
	private boolean aprovado;
	
	// M�todos Especias
	public Lutador getDesafiante() {
		return desafiante;
	}



	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}



	public Lutador getDesafiado() {
		return desafiado;
	}



	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}



	public int getRounds() {
		return rounds;
	}

	

	public void setRounds(int rounds) {
		this.rounds = rounds;
	}



	public boolean isAprovado() {
		return aprovado;
	}



	public void setAprovado(boolean aprovado) {
		this.aprovado = aprovado;
	}
	
	// M�todos P�blicos
	


	public void marcarLuta(Lutador l1, Lutador l2)
	{
		if(l1.getCategoria().equals(l2.getCategoria()) && l1 != l2)
		{
			this.setAprovado(true);
			this.setDesafiado(l1);
			this.setDesafiante(l2);
		}
		else
		{
			this.setAprovado(false);
			this.setDesafiado(null);
			this.setDesafiante(null);
		}
	}
	
	
	public void lutar()
	{
		if(isAprovado())
		{
			System.out.println("### DESAFIADO ###");
			this.getDesafiado().apresentar();
			System.out.println("### DESAFIANTE ###");
			this.getDesafiante().apresentar();
			
			Random aleatorio = new Random();
			int vencedor = aleatorio.nextInt(3); // 0 1 2
			System.out.println("====== RESULTADO DA LUTA ======");
			switch(vencedor)
			{
			case 0:		// Empate
				System.out.println("Empatou");
				this.desafiado.empatarLuta();
				this.desafiante.empatarLuta();
				break;
				
			case 1:		// Desafiado vence
				System.out.println("Vit�ria do " + this.desafiado.getNome());
				this.desafiado.ganharLuta();
				this.desafiante.perderLuta();
				break;
				
			case 2:		// Desafiante vence
				System.out.println("Vit�ria do " + this.desafiante.getNome());
				this.desafiante.ganharLuta();
				this.desafiado.perderLuta();
				break;
			}
			System.out.println("===============================");
		}
		else
		{
			System.out.println("A luta nao pode acontecer!");
		}
	}
}
