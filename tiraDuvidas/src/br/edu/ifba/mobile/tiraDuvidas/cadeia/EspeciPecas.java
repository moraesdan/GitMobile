package br.edu.ifba.mobile.tiraDuvidas.cadeia;

public class EspeciPecas extends Especialista {
	
	@Override
	public String resolver(Categoria categoria) {
		if(categoria == Categoria.PECAS ){
			return "Jo�o Moreira - Mec�nico";
		}
		return proximo.resolver(categoria);
		
	
	}

}
