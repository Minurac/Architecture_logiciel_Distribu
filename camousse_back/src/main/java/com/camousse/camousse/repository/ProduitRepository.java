package com.camousse.camousse.repository;

import org.springframework.data.repository.CrudRepository;

import com.camousse.camousse.bo.Produit;

public interface ProduitRepository extends CrudRepository<Produit, Integer> {

}
