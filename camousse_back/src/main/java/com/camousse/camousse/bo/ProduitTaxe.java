package com.camousse.camousse.bo;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;

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

	@JsonBackReference
	@ManyToOne
	private Produit produit;

	@ManyToOne
	private Taxe taxe;
}
