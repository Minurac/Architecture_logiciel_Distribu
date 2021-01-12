package com.camousse.camousse.bo;

import javax.persistence.*;

@Entity
public class Nomenclature {
	
	public Nomenclature() {
		super();
	}

	public Nomenclature(String libelle) {
		super();
		this.libelle = libelle;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	private String libelle;

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

}
