package org.iut.nantes.calcul;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Classe de test de la classe {@link Calculette}.
 *
 * @author Thibaut PICHON
 * @version 0.1
 */
public class CalculetteTest {
    /**
     * Objet calculette pour les tests.
     */
    private static Calculette calculette;

    /**
     * Méthode de configuration des données nécessaires pour les tests.
     */
    @BeforeClass
    public static void setUp() {
        // Création d'un objet Calculette avant de débuter les tests.
        calculette = new Calculette();
    }

    /**
     * Test de l'addition de deux nombres entier.
     */
    @Test
    public void testAddition() {
        assertEquals(1 + 2, calculette.add(1, 2));
    }
}