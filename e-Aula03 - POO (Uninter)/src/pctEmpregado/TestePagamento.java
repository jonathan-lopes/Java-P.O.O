package pctEmpregado;

public class TestePagamento {

	public static void main(String[] args) {
		
		Salario sal = new Salario("Joao", "123456789", 0, 2500);
		
		System.out.println("*** Rendimentos de Mensalistas ***");
		System.out.println("Nome               : " + sal.getNome());
		System.out.println("Documento:         : " + sal.getNrDocto());
		System.out.println("Salario Mensal     : " + sal.getSalarioMensal());
		
		System.out.println();
		sal.rendimentos();
		
		System.out.println("Redimentos: " + sal.getRendimento());
		System.out.println();
		System.out.println();
		
		Horario hor = new Horario("Maria", "987654321", 0, 30.00, 12.00);
		
		System.out.println("*** Rendimnetos de Horistas ***");
		System.out.println("Nome               : " + hor.getNome());
		System.out.println("Documento:         : " + hor.getNrDocto());
		System.out.println("Salario            : " + hor.getSalario());
		System.out.println("Número de Horas    : " + hor.getHoras());
		
		System.out.println();
		hor.rendimentos();
		
		System.out.println("Redimentos: " + hor.getRendimento());
		System.out.println();
		System.out.println();
		
		Comissao com = new Comissao("Jose", "45678987", 0, 20000.00, 0.45);
		

		System.out.println("*** Rendimentos de Comissionados ***");
		System.out.println("Nome                   : " + com.getNome());
		System.out.println("Documento:             : " + com.getNrDocto());
		System.out.println("Venda Bruta            : " + com.getVendaBruta());
		System.out.println("Taxa de Comissao       : " + com.getTaxaComissao());
		
		System.out.println();
		com.rendimentos();
		
		System.out.println("Redimentos: " + com.getRendimento());
		System.out.println();
		System.out.println();
	}

}
