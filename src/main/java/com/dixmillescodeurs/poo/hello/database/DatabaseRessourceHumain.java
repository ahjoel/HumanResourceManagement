package com.dixmillescodeurs.poo.hello.database;

import com.dixmillescodeurs.poo.hello.model.Directeur;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

// Design Pattern Singleton
public final class DatabaseRessourceHumain {
    private static List<Directeur> directeurs;


    // Singleton : Constructeur private
    private DatabaseRessourceHumain() {

        this.directeurs = getListDirecteurFromDatabase();
        //Utilisation de Collection de type LISTE - similaire au panier
        //Best Practice est qu'il faut mettre s a la fin des variables de type List

    }

    public static List<Directeur> getInstance() {
        if (Optional.ofNullable(directeurs).isPresent()) {
            directeurs = getListDirecteurFromDatabase();
        }
        return directeurs;
    }

    public static List<Directeur> getListDirecteurFromDatabase() {
        var directeur1 = Directeur.builder().nom("SAWEGNON").prenom("Fabrice").age(13).build();
        var directeur2 = Directeur.builder().nom("ADIEL").prenom("Akp").age(45).build();
        var directeur3 = Directeur.builder().nom("BONKONGOU").prenom("Florent").age(41).build();

        //Ajout de directeur
        directeurs.add(directeur1);
        directeurs.add(directeur2);
        directeurs.add(directeur3);

        return directeurs;
    }

}
