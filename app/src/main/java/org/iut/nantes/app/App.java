package org.iut.nantes.app;

import org.iut.nantes.calcul.Calculette;

/**
 * Classe principale de l'application.
 *
 * @author Thibaut PICHON
 * @version 0.1
 */
public final class App {
    /**
     * Premier nombre pour la somme.
     */
    private static final float A = 1.7f;
    /**
     * Deuxième nombre pour la somme.
     */
    private static final double B = 1.2;

    /**
     * Constructeur par défaut.
     */
    private App() {
        // On fait rien.
    }

    /**
     * Fonction principale exécuté au lancement.
     * de l'application.
     *
     * @param args La liste des arguments passés
     *             au programme.
     */
    public static void main(final String[] args) {
        // Création d'une calculette.
        Calculette calculette = new Calculette();

        // Exécution de deux calcul.
        System.out.println(calculette.add(A, B));
    }
}
