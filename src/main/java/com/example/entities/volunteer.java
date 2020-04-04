package com.example.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "volunteer")
public class volunteer {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
	
	@Lob
	private String name;
	
	
	@Lob
	private String adresse;
	
	@Lob
	private String corps;
	
	public volunteer() {}
	
	
	
	public volunteer(long id, String name, String adresse, String corps, String numero) {
		
		this.id = id;
		this.name = name;
		this.adresse = adresse;
		this.corps = corps;
		this.numero = numero;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAdresse() {
		return adresse;
	}


	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}


	public String getCorps() {
		return corps;
	}


	public void setCorps(String corps) {
		this.corps = corps;
	}


	public String getNumero() {
		return numero;
	}


	public void setNumero(String numero) {
		this.numero = numero;
	}


	@Lob
	private String numero;

}
