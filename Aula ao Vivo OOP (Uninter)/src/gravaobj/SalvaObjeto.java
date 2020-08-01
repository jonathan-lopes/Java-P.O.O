package gravaobj;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SalvaObjeto {
	
	public static void salvar(Object objeto, String caminho) {
		
		try {
			FileOutputStream saveFile = new FileOutputStream(caminho);
			ObjectOutputStream stream = new ObjectOutputStream(saveFile);
			
			//salva o objeto
			stream.writeObject(objeto);
			
			stream.close();
		} 
		
		catch (Exception exc) {
			exc.printStackTrace();
		}
	}
}
