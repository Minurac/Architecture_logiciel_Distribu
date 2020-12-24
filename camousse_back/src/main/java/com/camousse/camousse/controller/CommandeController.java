package com.camousse.camousse.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.camousse.camousse.bo.Commande;
import com.camousse.camousse.repository.CommandeRepository;


/**
 * Controlleur Commande
 * @author theom
 *
 */
@CrossOrigin
@RestController
@RequestMapping("/commande")
public class CommandeController {

	@Autowired
	private CommandeRepository commandeRepository;
	
	/**
	 * Méthode qui retourne l'ensemble des commandes
	 * @return
	 */
	@GetMapping("/")
	public Iterable<Commande> getAll() {
		return commandeRepository.findAll();
	}
	
	/**
	 * Méthode qui retourne une commande
	 * @param id
	 * @return
	 */
	@GetMapping("/{id}")
	public Optional<Commande> get(@PathVariable int id) {
		return commandeRepository.findById(id);
	}
	
	/**
	 * Méthode qui supprime une commande
	 * @param id
	 */
	@DeleteMapping("/{id}")
	public void delete(@PathVariable int id) {
		commandeRepository.deleteById(id);
	}
	
	/**
	 * Méthode qui crée/met à jour une commande
	 * @param c
	 * @return
	 */
	@PostMapping("/")
	public Commande add(@RequestBody Commande c) {
		return commandeRepository.save(c);
	}

}
