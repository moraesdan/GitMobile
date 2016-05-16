package br.edu.ifba.mobile.tiraDuvidas.cadeia;

public class EspeciGeometria extends Especialista {
	
	@Override
	public String resolver(SubCategorias subcategorias) {
		if(subcategorias == SubCategorias.GEOMETRIA ){
			return "O especialista Marcos resolve essa duvida";
		}
		return proximo.resolver(subcategorias);
	
	}

}
