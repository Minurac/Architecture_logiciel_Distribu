package com.camousse.camousse.bo;

import javax.persistence.*;

/**
 * Classe représentant la liaison Produit et Commande
 * @author theom
 *
 */
@Entity
public class ProduitCommande {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@ManyToOne
	Produit produit;

	@ManyToOne
	Commande commande;

	private int quantite;

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
}
