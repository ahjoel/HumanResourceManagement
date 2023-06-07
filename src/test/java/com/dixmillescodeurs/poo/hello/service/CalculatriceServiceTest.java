package com.dixmillescodeurs.poo.hello.service;

import org.junit.BeforeClass;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

class CalculatriceServiceTest {

    private CalculatriceService calculatriceService;

    @BeforeEach
    public void initCalculatrice(){
        System.out.println("Avant chaque méthode");
        calculatriceService = new CalculatriceService();
    }

    @Test
    void somme() {
        int resultat = calculatriceService.somme(5,2);
        assertThat(resultat).isEqualTo(7);
    }

    @Test
    void soustraction() {
        int resultat = calculatriceService.soustraction(5,2);

        assertThat(resultat).isEqualTo(3);
    }

    @Test
    void multiplication() {
        int resultat = calculatriceService.multiplication(5,2);

        assertThat(resultat).isEqualTo(10);
    }

    @Test
    void division() {
        double resultat = calculatriceService.division(5,2);

        assertThat(resultat).isEqualTo(2.0);
    }

    @BeforeAll
    static void beforeAll() {

    }
}