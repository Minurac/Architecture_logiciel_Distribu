package com.camousse.camousse.repository;
import org.springframework.data.repository.CrudRepository;
import com.camousse.camousse.bo.Utilisateur;


public interface UtilisateurRepository extends CrudRepository<Utilisateur, Integer> {

}