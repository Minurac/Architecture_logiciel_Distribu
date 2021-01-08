package com.camousse.camousse.repository;

import org.springframework.data.repository.CrudRepository;
import com.camousse.camousse.bo.Produit;

public interface ProduitRepository extends CrudRepository<Produit, Integer> {
	
	public Iterable<Produit> findByLibelleContains(String libelle);
	
	public Iterable<Produit> findByNomenclature_Id(Integer id);
	
   //
}
