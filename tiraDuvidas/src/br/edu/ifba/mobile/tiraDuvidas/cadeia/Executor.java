package br.edu.ifba.mobile.tiraDuvidas.cadeia;


public class Executor {
	
	public static void main(String[] args) {
				
		Especialista especia = new EspeciCompeticao();
		especia.setProximoEspecialista(new EspeciGeometria());
		especia.setProximoEspecialista(new EspeciPecas());
		
		
		System.out.println("Resposta: " + especia.resolver(Categoria.COMPETICOES));

	}


}
