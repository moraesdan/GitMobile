package br.edu.ifba.mobile.tiraDuvidas;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.edu.ifba.mobile.tiraDuvidas.cadeia.EspeciCompeticao;
import br.edu.ifba.mobile.tiraDuvidas.cadeia.EspeciGeometria;
import br.edu.ifba.mobile.tiraDuvidas.cadeia.EspeciPecas;
import br.edu.ifba.mobile.tiraDuvidas.cadeia.Especialista;
import br.edu.ifba.mobile.tiraDuvidas.cadeia.SubCategorias;

@ManagedBean(name = "duvida")
@SessionScoped
public class Duvida {

	private String email = "";
	private String resultado = "";

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<String> getTiposDuvida() {
		List<String> tipos = new ArrayList<String>();
		tipos.add("Peças");
		tipos.add("Competiçoes");
		tipos.add("Geometria");

		return tipos;
	}

	public void setSubCategorias(String subCategorias) {
		SubCategorias tipo = SubCategorias.SEM_DUVIDA;
		if (subCategorias.equals("Competições")) {
			tipo = SubCategorias.COMPETICOES;
		} else if (subCategorias.equals("Geometria")) {
			tipo = SubCategorias.GEOMETRIA;
		} else if (subCategorias.equals("Peças")) {
			tipo = SubCategorias.PECAS;
		}
		Especialista especia = new EspeciCompeticao();
		especia.setProximoEspecialista(new EspeciGeometria());
		especia.setProximoEspecialista(new EspeciPecas());

		System.out.println("Agendado atendimento para bsteles@gmail.com");
		resultado = especia.resolver(tipo);
	}

	public String getResultado() {
		return resultado;
	}

}
