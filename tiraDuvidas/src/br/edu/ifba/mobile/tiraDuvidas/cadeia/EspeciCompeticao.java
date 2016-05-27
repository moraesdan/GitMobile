package br.edu.ifba.mobile.tiraDuvidas.cadeia;

public class EspeciCompeticao extends Especialista  {
	
	@Override
	public String resolver(Categoria categoria) {
		if(categoria == Categoria.COMPETICOES ){
			
			return "Pedro Goveia - Professor Ed.Fisica";
		}
		return proximo.resolver(categoria);
	
	}

}
