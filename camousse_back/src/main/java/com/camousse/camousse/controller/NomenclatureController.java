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
import com.camousse.camousse.repository.NomenclatureRepository;

/**
 * Controlleur Nomenclature
 * @author theom
 *
 */
@RestController
@RequestMapping("/nomenclature")
public class NomenclatureController {
	
	@Autowired
	private NomenclatureRepository nomenclatureRepository;
	
	/**
	 * Méthode qui retourne l'ensemble des nomenclatures
	 * @return
	 */
	@GetMapping("/")
	public Iterable<Nomenclature> getAll() {
		return nomenclatureRepository.findAll();
	}
	
	/**
	 * Méthode qui retourne une nomenclature
	 * @param id
	 * @return
	 */
	@GetMapping("/{id}")
	public Optional<Nomenclature> get(@PathVariable int id) {
		return nomenclatureRepository.findById(id);
	}
	
	/**
	 * Méthode qui supprime une nomenclature
	 * @param id
	 */
	@DeleteMapping("/{id}")
	public void delete(@PathVariable int id) {
		nomenclatureRepository.deleteById(id);
	}
	
	/**
	 * Méthode qui crée/met à jour une nomenclature
	 * @param n
	 * @return
	 */
	@PostMapping("/")
	public Nomenclature add(@RequestBody Nomenclature n) {
		return nomenclatureRepository.save(n);
	}
}
