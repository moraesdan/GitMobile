package br.edu.ifba.mobile.tiraDuvidas.cadeia;

public class EspeciPecas extends Especialista {
	
	@Override
	public String resolver(Categoria categoria) {
		if(categoria == Categoria.PECAS ){
			return "João Moreira - Mecânico";
		}
		return proximo.resolver(categoria);
		
	
	}

}
