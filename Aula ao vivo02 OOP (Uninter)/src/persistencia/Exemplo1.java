package persistencia;

import java.io.File;
import java.util.Scanner;

public class Exemplo1 {

	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		
		System.out.printf("Informe o nome de um arquivo ou diretorio: \n");
		String nome = ler.nextLine();
		
		File objFile = new File(nome);
		
		if(objFile.exists())
		{
			if(objFile.isFile())
			{
				System.out.printf("\nArquivo (%s) existe - tamanho: %d bytes\n",
						objFile.getName(), objFile.length());
			}
			else 
			{
				System.out.printf("\nConte�do do diret�rio:\n");
				String diretorio[] = objFile.list();
				for (String item: diretorio) 
				{
					System.out.printf("%s\n", item);
				}
			}
		}
		else
		{
			System.out.printf("Erro: arquivo ou diret�rio informado n�o existe!\n");
		}
	}
}
