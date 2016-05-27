package br.edu.ifba.mobile.tiraDuvidas;



import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.edu.ifba.mobile.tiraDuvidas.cadeia.Categoria;
import br.edu.ifba.mobile.tiraDuvidas.cadeia.EspeciCompeticao;
import br.edu.ifba.mobile.tiraDuvidas.cadeia.EspeciGeometria;
import br.edu.ifba.mobile.tiraDuvidas.cadeia.EspeciPecas;
import br.edu.ifba.mobile.tiraDuvidas.cadeia.Especialista;

@ManagedBean(name = "duvi")
@SessionScoped
public class Duvida {

	private String escolha = "";
	private String resultado = "";
	private String imagem ="";

	public String getEscolha() {
		
		return escolha;
	}

	public void setEscolha(String escolha) {
		setTipoDuvida(escolha);
		this.escolha = escolha;
	}
	
	

	public void setTipoDuvida(String escolha) {
		Categoria tipo = Categoria.SEM_DUVIDA;
		if (escolha.equals("Peças")) {
			tipo = Categoria.PECAS;		
			setImagem("images/pecas.png");
		} else if (escolha.equals("Competições")) {
			tipo = Categoria.COMPETICOES;
			setImagem("images/competicoes.png");
		} else if (escolha.equals("Geometria")) {
			tipo = Categoria.GEOMETRIA;
			setImagem("images/geometria.png");
		}
		Especialista especia = new EspeciPecas();
		especia.setProximoEspecialista(new EspeciCompeticao());
		especia.setProximoEspecialista(new EspeciGeometria());
		
		resultado = especia.resolver(tipo);
		System.out.println(resultado); 
	}

	public String getResultado() {
		return resultado;
	}

	public String getImagem() {
		return imagem;
	}

	public void setImagem(String imagem) {
		this.imagem = imagem;
	}
	
}
