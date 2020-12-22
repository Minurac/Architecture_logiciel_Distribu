package com.camousse.camousse.bo;

import javax.persistence.*;

@Entity
public class Profil {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	public Profil() {
		super();
	}
	
	public Profil(String libelle) {
		super();
		this.libelle = libelle;
	}
	private String libelle;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

}
