package persistencia;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Exemplo2 {

	public static void main(String[] args) throws FileNotFoundException, IOException
	{
		Scanner ler = new Scanner(System.in);
		String nome;
		char sexo;
		int idade, altura;
		double pc;  // Peso Corporal
		
		FileOutputStream arq = new FileOutputStream("C:\\Users\\Jonathan\\Desktop\\arquivo.dat");
		DataOutputStream gravarArq = new DataOutputStream(arq);
		
		System.out.printf("Informe o seu nome: ");
		nome = ler.nextLine();
		System.out.printf("\nInforme o seu sexo (M/F)...........: ");
		sexo = (char)System.in.read();
		System.out.printf("Informe a sua idade................: ");
		idade = ler.nextInt();
		System.out.printf("Informe o seu peso corporal (em kg): ");
		pc = ler.nextDouble();
		System.out.printf("Informe a sua altura (em cm).......: ");
		altura = ler.nextInt();
		
		gravarArq.writeUTF(nome);
		gravarArq.writeChar(sexo);
		gravarArq.writeInt(idade);
		gravarArq.writeDouble(pc);
		gravarArq.writeInt(altura);
		arq.close();
		System.out.printf("\nDados gravados com sucesso em \"C:\\Users\\Jonathan\\Desktop\\arquivo.dat\".\n");
		
	}

}
