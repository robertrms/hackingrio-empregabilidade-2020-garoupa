package br.com.talentosrj.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Anuncio implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer id;
	
	private String titulo;
	
	private String autonomo;
	
	private String beneficio;
	
	private String tipoAnuncio;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutonomo() {
		return autonomo;
	}

	public void setAutonomo(String autonomo) {
		this.autonomo = autonomo;
	}

	public String getBeneficio() {
		return beneficio;
	}

	public void setBeneficio(String beneficio) {
		this.beneficio = beneficio;
	}
	
	public String getTipoAnuncio() {
		return tipoAnuncio;
	}
	
	public void setTipoAnuncio(String tipoAnuncio) {
		this.tipoAnuncio = tipoAnuncio;
	}
	
}
