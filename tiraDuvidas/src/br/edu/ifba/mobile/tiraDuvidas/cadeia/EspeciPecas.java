package br.edu.ifba.mobile.tiraDuvidas.cadeia;

public class EspeciPecas extends Especialista {
	

	@Override
	public String resolver(SubCategorias subcategorias) {
		if(subcategorias == SubCategorias.PECAS ){
			return "O especialista Joao resolve essa duvida";
		}
		return "N�o existem professores para a sua d�vida";
	
	}

}
