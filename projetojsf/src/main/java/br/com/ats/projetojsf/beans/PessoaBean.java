package br.com.ats.projetojsf.beans;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "pessoaBean") // a partir de agora, faz a chamada do controlador de uma página jsf
public class PessoaBean {

	private String nome;
	private String sobrenome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

}
