package br.edu.ifba.mobile.tiraDuvidas.cadeia;

public class EspeciGeometria extends Especialista {
	
	@Override
	public String resolver(Categoria categoria) {
		if(categoria == Categoria.GEOMETRIA ){
			return "O especialista Marcos resolve essa duvida";
		}
		return "N�o existem professores para a sua d�vida";
	
	}

}
