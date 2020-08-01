package gravaobj;

import java.util.Arrays;
import java.util.EnumSet;

public class SalvaObejetoTest {

	public static void main(String[] args) {
		// Criar o obejeto
		Cidade cidade = new Cidade("Curitiba", -25.2547, -49.1619, 1893997, false, Arrays.asList("Parques",
				"Teatro Guaíra", "Ópera de Arame", "Capital Ecológica do Brasil"),
				new Bairro[]{
				new Bairro("Batel", false, EnumSet.of(Bairro.Qualidade.RESIDENCIAL,
				Bairro.Qualidade.COMERCIAL, Bairro.Qualidade.TURISMO)),
				new Bairro("Atuba", true, EnumSet.of(Bairro.Qualidade.RESIDENCIAL,
				Bairro.Qualidade.COMERCIAL)),
				new Bairro("Centro", true, EnumSet.of(Bairro.Qualidade.RESIDENCIAL,
				Bairro.Qualidade.COMERCIAL, Bairro.Qualidade.TURISMO)),
				new Bairro("Tingui", true, EnumSet.of(Bairro.Qualidade.TURISMO,
				Bairro.Qualidade.RESIDENCIAL)),
				new Bairro("Barigui", true, EnumSet.of(Bairro.Qualidade.TURISMO,
				Bairro.Qualidade.RESIDENCIAL))
				});
				// Salva o objeto
				SalvaObjeto.salvar(cidade, "C:\\Users\\Jonathan\\Desktop\\Cidade.sav");
	}

}
