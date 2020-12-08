package com.camousse.camousse.controller;

import org.springframework.web.bind.annotation.*;

import com.camousse.camousse.bo.Utilisateur;

/**
 * Controlleur Utilisateur (chemin /user)
 * @author theom
 *
 */

@RestController
@RequestMapping("/user")
public class UtilisateurController {
	
	@GetMapping("/{id}")
	public Utilisateur getUtilisateur(@PathVariable String id) {
		return new Utilisateur("yolo", id);
	}
	
}