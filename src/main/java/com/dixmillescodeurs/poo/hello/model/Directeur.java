package com.dixmillescodeurs.poo.hello.model;

import com.dixmillescodeurs.poo.hello.utils.Util;
import lombok.Builder;
import lombok.experimental.SuperBuilder;

@SuperBuilder
public class Directeur extends Employe{
    @Override
    public double calculSalaire() {
        return (double) (this.getAnciennete() * Util.SALAIRE_BASE);
    }
}
