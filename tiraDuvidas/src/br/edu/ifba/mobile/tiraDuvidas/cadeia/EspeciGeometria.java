package br.edu.ifba.mobile.tiraDuvidas.cadeia;

public class EspeciGeometria extends Especialista {
	
	@Override
	public String resolver(Categoria categoria) {
		if(categoria == Categoria.GEOMETRIA ){
			return "Isabel Fonseca - Fisioterapeuta";
		}
		return "N�o existem professores para a sua d�vida";
	
	}

}
