package com.dixmillescodeurs.poo.hello.service;

public class CalculatriceService {

    public int somme(int nombre1, int nombre2){
        return nombre1 + nombre2;
    }

    public int soustraction(int nombre1, int nombre2){
        return nombre1 - nombre2;
    }

    public int multiplication(int nombre1, int nombre2){
        return nombre1 * nombre2;
    }

    public double division(int nombre1, int nombre2){
        double resultat = 0.0;
        try {
            resultat = nombre1 / nombre2;
        }catch (Exception var8){
            System.out.println("Division par 0 impossible");
        }
        return resultat;
    }


}
