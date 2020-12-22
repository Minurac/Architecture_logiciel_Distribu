package com.camousse.camousse.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.camousse.camousse.bo.Nomenclature;
import com.camousse.camousse.bo.Produit;
import com.camousse.camousse.repository.ProduitRepository;

/**
 * Controlleur Produit
 * @author theom
 *
 */
@RestController
@RequestMapping("/produit")
public class ProduitController {
	
	@Autowired
	private ProduitRepository produitRepository;
	
	/**
	 * Méthode qui retourne l'ensemble des produits
	 * @return
	 */
	@GetMapping("/")
	public Iterable<Produit> getAll() {
		return produitRepository.findAll();
	}
	
	/**
	 * Méthode qui retourne un produit
	 * @param id
	 * @return
	 */
	@GetMapping("/{id}")
	public Optional<Produit> get(@PathVariable int id) {
		return produitRepository.findById(id);
	}
	
	/**
	 * Méthode qui supprime un produit
	 * @param id
	 */
	@DeleteMapping("/{id}")
	public void delete(@PathVariable int id) {
		produitRepository.deleteById(id);
	}
	
	/**
	 * Méthode qui crée/met à jour un produit
	 * @param p
	 * @return
	 */
	@PostMapping("/")
	public Produit add(@RequestBody Produit p) {
		return produitRepository.save(p);
	}
}
