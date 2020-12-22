package com.camousse.camousse.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.camousse.camousse.bo.Caracteristique;
import com.camousse.camousse.bo.Utilisateur;
import com.camousse.camousse.repository.CaracteristiqueRepository;

/**
 * Controlleur Caracteristique
 * @author theom
 *
 */
@RestController
@RequestMapping("/carac")
public class CaracteristiqueController {

	@Autowired
	private CaracteristiqueRepository caracteristiqueRepository;
	
	/**
	 * Méthode qui retourne l'ensemble des caracs
	 * @return
	 */
	@GetMapping("/")
	public Iterable<Caracteristique> getAll() {
		return caracteristiqueRepository.findAll();
	}
	
	/**
	 * Méthode qui retourne une carac
	 * @param id
	 * @return
	 */
	@GetMapping("/{id}")
	public Optional<Caracteristique> get(@PathVariable int id) {
		return caracteristiqueRepository.findById(id);
	}
	
	/**
	 * Méthode qui supprime une carac
	 * @param id
	 */
	@DeleteMapping("/{id}")
	public void delete(@PathVariable int id) {
		caracteristiqueRepository.deleteById(id);
	}
	
	/**
	 * Méthode qui crée/met à jour une carac
	 * @param c
	 * @return
	 */
	@PostMapping("/")
	public Caracteristique add(@RequestBody Caracteristique c) {
		return caracteristiqueRepository.save(c);
	}

}
