package br.edu.ifba.mobile.tiraDuvidas.cadeia;

public class EspeciCompeticao extends Especialista  {
	
	@Override
	public String resolver(Categoria categoria) {
		if(categoria == Categoria.COMPETICOES ){
			return "O especialista Pedro resolve essa duvida";
		}
		return proximo.resolver(categoria);
	
	}

}
