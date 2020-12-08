package com.camousse.camousse.bo;

/**
 * BO représentant un utilisateur
 * @author theom
 *
 */
public class Utilisateur {
	
	private String nom;
	private String prenom;
	
	public Utilisateur(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
}
