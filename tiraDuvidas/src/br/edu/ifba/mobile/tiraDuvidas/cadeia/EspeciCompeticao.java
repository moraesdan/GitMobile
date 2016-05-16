package br.edu.ifba.mobile.tiraDuvidas.cadeia;

public class EspeciCompeticao extends Especialista  {
	
	@Override
	public String resolver(SubCategorias subcategorias) {
		if(subcategorias == SubCategorias.COMPETICOES ){
			return "O especialista Pedro resolve essa duvida";
		}
		return proximo.resolver(subcategorias);
	
	}

}
