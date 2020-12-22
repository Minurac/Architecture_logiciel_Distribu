package com.camousse.camousse.bo;

import java.util.Date;
import java.util.Set;

import javax.persistence.*;

@Entity
public class Commande {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@OneToMany(mappedBy = "commande")
    Set<ProduitCommande> produitCommande;
	
	@ManyToOne
    @JoinColumn(name="utilisateur_id")
	private Utilisateur utilisateur;
	
	public Commande() {
		super();
	}

	private Date dateCommande;

	public Date getDateCommande() {
		return dateCommande;
	}

	public void setDateCommande(Date dateCommande) {
		this.dateCommande = dateCommande;
	}

}
