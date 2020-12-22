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

import com.camousse.camousse.bo.Profil;
import com.camousse.camousse.repository.ProfilRepository;

/**
 * Controlleur Profil
 * @author theom
 *
 */
@RestController
@RequestMapping("/profil")
public class ProfilController {
	
	@Autowired
	private ProfilRepository profilRepository;

	/**
	 * Méthode qui retourne l'ensemble des profils
	 * @return
	 */
	@GetMapping("/")
	public Iterable<Profil> getAll() {
		return profilRepository.findAll();
	}
	
	/**
	 * Méthode qui retourne un profil
	 * @param id
	 * @return
	 */
	@GetMapping("/{id}")
	public Optional<Profil> get(@PathVariable int id) {
		return profilRepository.findById(id);
	}
	
	/**
	 * Méthode qui supprime un profil
	 * @param id
	 */
	@DeleteMapping("/{id}")
	public void delete(@PathVariable int id) {
		profilRepository.deleteById(id);
	}
	
	/**
	 * Méthode qui crée/met à jour un profil
	 * @param p
	 * @return
	 */
	@PostMapping("/")
	public Profil add(@RequestBody Profil p) {
		return profilRepository.save(p);
	}
}
