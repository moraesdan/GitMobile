package br.edu.ifba.mobile.tiraDuvidas.cadeia;

public abstract class Especialista {
	
protected Especialista proximo=null;
	
	public void setProximoEspecialista(Especialista proximo){
		if(this.proximo!=null){
			this.proximo.setProximoEspecialista(proximo);		
		}else{
		this.proximo=proximo;
		}
	}
	public abstract String resolver(Categoria Categoria);

}
