package com.camousse.camousse.bo;

import javax.persistence.*;

/**
 * Classe représentant la liaison Produit et Taxe
 * @author theom
 *
 */
@Entity
public class ProduitTaxe {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@ManyToOne
	@JoinColumn(name = "produit_id")
	Produit produit;

	@ManyToOne
	@JoinColumn(name = "taxe_id")
	Taxe taxe;
}
