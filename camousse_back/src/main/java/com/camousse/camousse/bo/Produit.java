package com.camousse.camousse.bo;

import java.util.Set;

import javax.persistence.*;

@Entity
public class Produit {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	private String libelle;
	
	private String description;
	
	private String image;
	
	@OneToMany(mappedBy = "produit")
    Set<ProduitCaracteristique> produitCaracteristique;
	
	@OneToMany(mappedBy = "produit")
    Set<ProduitTaxe> produitTaxe;
	
	public Produit() {
		super();
	}

	public Produit(String libelle, String description, String image, double prix) {
		super();
		this.libelle = libelle;
		this.description = description;
		this.image = image;
		this.prix = prix;
	}

	private double prix;
	
	@ManyToOne
    @JoinColumn(name="nomenclature_id")
	private Nomenclature nomenclature;
	
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
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public double getPrix() {
		return prix;
	}
	
	public void setPrix(double prix) {
		this.prix = prix;
	}
	
	public Nomenclature getNomenclature() {
		return nomenclature;
	}
	
	public void setNomenclature(Nomenclature nomenclature) {
		this.nomenclature = nomenclature;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

}
