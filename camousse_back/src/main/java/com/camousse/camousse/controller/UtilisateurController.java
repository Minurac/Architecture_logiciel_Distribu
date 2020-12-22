package com.camousse.camousse.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.camousse.camousse.bo.Profil;
import com.camousse.camousse.bo.Taxe;
import com.camousse.camousse.bo.Utilisateur;
import com.camousse.camousse.repository.UtilisateurRepository;

/**
 * Controlleur Utilisateur (chemin /user)
 * @author theom
 *
 */

@RestController
@RequestMapping("/user")
public class UtilisateurController {
	
	@Autowired
	private UtilisateurRepository utilisateurRepository;
	
	/**
	 * Méthode qui retourne l'ensemble des utilisateurs
	 * @return
	 */
	@GetMapping("/")
	public Iterable<Utilisateur> getAll() {
		return utilisateurRepository.findAll();
	}
	
	/**
	 * Méthode qui retourne un utilisateur
	 * @param id
	 * @return
	 */
	@GetMapping("/{id}")
	public Optional<Utilisateur> get(@PathVariable int id) {
		return utilisateurRepository.findById(id);
	}
	
	/**
	 * Méthode qui supprime un utilisateur
	 * @param id
	 */
	@DeleteMapping("/{id}")
	public void delete(@PathVariable int id) {
		utilisateurRepository.deleteById(id);
	}
	
	/**
	 * Méthode qui crée/met à jour un utilisateur
	 * @param u
	 * @return
	 */
	@PostMapping("/")
	public Utilisateur add(@RequestBody Utilisateur u) {
		return utilisateurRepository.save(u);
	}
}