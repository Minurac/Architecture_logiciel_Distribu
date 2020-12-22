package com.camousse.camousse.bo;

import javax.persistence.*;

/**
 * Classe représentant la liaison Produit et Caracteristique
 * @author theom
 *
 */
@Entity
public class ProduitCaracteristique {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@ManyToOne
	@JoinColumn(name = "produit_id")
	Produit produit;

	@ManyToOne
	@JoinColumn(name = "caracteristique_id")
	Caracteristique caracteristique;

	private String valeur;

	public String getValeur() {
		return valeur;
	}

	public void setValeur(String valeur) {
		this.valeur = valeur;
	}
}
