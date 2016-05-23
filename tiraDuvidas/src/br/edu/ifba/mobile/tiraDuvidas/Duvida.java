package br.edu.ifba.mobile.tiraDuvidas;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean(name = "duvi")
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

	

	public String getResultado() {
		return resultado;
	}
	
	
}
