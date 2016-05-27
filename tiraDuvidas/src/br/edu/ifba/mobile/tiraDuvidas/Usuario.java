package br.edu.ifba.mobile.tiraDuvidas;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class Usuario {

	private String nome = "";
	private String email = "";
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
		System.out.println(nome);
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	

}
