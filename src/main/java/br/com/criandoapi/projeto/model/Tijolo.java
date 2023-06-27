package br.com.criandoapi.projeto.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tijolo")
public class Tijolo {
	
	 @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "tipo_tijolo", length = 200, nullable = true)
	private String tipo_tijolo;
	
	@Column(name = "unidade_produziada", nullable = true)
	private int unidade_produziada;
	
	@Column(name = "unidade_vendida", nullable = true)
	private int unidade_vendida;
	
	@Column(name = "cidades_vendidas", length = 200, nullable = true)
	private String cidades_vendidas;
	

	
	
	
	
	
	
	public String getCidades_vendidas() {
		return cidades_vendidas;
	}

	public void setCidades_vendidas(String cidades_vendidas) {
		this.cidades_vendidas = cidades_vendidas;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTipo_tijolo() {
		return tipo_tijolo;
	}

	public void setTipo_tijolo(String tipo_tijolo) {
		this.tipo_tijolo = tipo_tijolo;
	}

	public int getUnidade_produzida() {
		return unidade_produziada;
	}

	public void setUnidade_produzida(int unidade_produzida) {
		this.unidade_produziada = unidade_produzida;
	}

	public int getUnidade_vendidas() {
		return unidade_vendida;
	}

	public void setUnidade_vendidas(int unidade_vendidas) {
		this.unidade_vendida = unidade_vendidas;
	}

}
