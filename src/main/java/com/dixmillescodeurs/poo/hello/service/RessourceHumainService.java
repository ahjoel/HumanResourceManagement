package com.dixmillescodeurs.poo.hello.service;

import com.dixmillescodeurs.poo.hello.dao.DirecteurDao;
import com.dixmillescodeurs.poo.hello.model.Directeur;
import com.dixmillescodeurs.poo.hello.utils.Util;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class RessourceHumainService {

    private final DirecteurDao directeurDao;

    /*public RessourceHumainService(DirecteurDao directeurDao){

        this.directeurDao = directeurDao;
    }*/

    public List<Directeur> listeDesDirecteurs() {
        return directeurDao.getAll();
    }

    public double ageMoyenDesDirecteursMajeur(){
        var directeurs = directeurDao.getAll();

        var ageMoyen = directeurs.stream()
                .filter(directeur -> directeur.getAge() > Util.AGE_MAJEUR)
                .mapToInt(Directeur::getAge)
                .average()
                .getAsDouble();
        return ageMoyen;
    }


    public String nomPremierDirecteurMajeur(){
        var directeurs = directeurDao.getAll();
        var nom = directeurs.stream()
                .filter(directeur -> directeur.getAge() > Util.AGE_MAJEUR)
                .map(directeur -> directeur.getNom())
                .findFirst()
                .get();

        return nom;
    }
}
