package com.camousse.camousse.bo;

import javax.persistence.*;

@Entity
public class Caracteristique {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	private String libelle;

	public Caracteristique() {
		super();
	}

	public Caracteristique(String libelle) {
		super();
		this.libelle = libelle;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

}
