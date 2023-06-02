package com.dixmillescodeurs.poo.hello.model;


import com.dixmillescodeurs.poo.hello.utils.Util;

public class Ouvrier extends Employe {

    public double calculSalaire() {
        return (double)this.getAnciennete() * Util.SALAIRE_BASE;
    }
}
