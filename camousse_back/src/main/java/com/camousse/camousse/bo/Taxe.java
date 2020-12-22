package com.camousse.camousse.bo;

import javax.persistence.*;

@Entity
public class Taxe {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	private double valeur;

	public double getValeur() {
		return valeur;
	}

	public Taxe() {
		super();
	}

	public Taxe(double valeur) {
		super();
		this.valeur = valeur;
	}

	public void setValeur(double valeur) {
		this.valeur = valeur;
	}
}
