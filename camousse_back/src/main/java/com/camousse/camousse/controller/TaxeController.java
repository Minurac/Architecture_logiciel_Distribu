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

import com.camousse.camousse.bo.Taxe;
import com.camousse.camousse.repository.TaxeRepository;

/**
 * Controlleur Taxe
 * @author theom
 *
 */
@RestController
@RequestMapping("/taxe")
public class TaxeController {
	
	@Autowired
	private TaxeRepository taxeRepository;
	
	/**
	 * Méthode qui retourne l'ensemble des taxes
	 * @return
	 */
	@GetMapping("/")
	public Iterable<Taxe> getAll() {
		return taxeRepository.findAll();
	}
	
	/**
	 * Méthode qui retourne une taxe
	 * @param id
	 * @return
	 */
	@GetMapping("/{id}")
	public Optional<Taxe> get(@PathVariable int id) {
		return taxeRepository.findById(id);
	}
	
	/**
	 * Méthode qui supprime une taxe
	 * @param id
	 */
	@DeleteMapping("/{id}")
	public void delete(@PathVariable int id) {
		taxeRepository.deleteById(id);
	}
	
	/**
	 * Méthode qui crée/met à jour une taxe
	 * @param t
	 * @return
	 */
	@PostMapping("/")
	public Taxe add(@RequestBody Taxe t) {
		return taxeRepository.save(t);
	}

}
