package org.iut.nantes.calcul;

/**
 * Classe représentant une calculette permettant de faire l'addition de
 * deux nombres.
 *
 * @author Thibaut PICHON
 * @version 0.1
 */
public class Calculette {
    /**
     * Réalise l'addition de deux nombres peu importe leur type.
     *
     * @param a   Le premier nombre.
     * @param b   Le deuxième nombre.
     * @param <T> Le type des paramètres correspondants à un type étendant
     *            la classe Number.
     * @return Un {@link Number} correspondant au résultat.
     */
    public final <T extends Number> Number add(final T a, final T b) {
        if (a instanceof Double || b instanceof Double) {
            // Si au moins un des nombre est un double alors on fait
            // l'addition de double.
            return a.doubleValue() + b.doubleValue();
        } else if (a instanceof Float || b instanceof Float) {
            // Sinon si au moins un des nombres est un float on fait
            // l'addition de deux float.
            return a.floatValue() + b.floatValue();
        } else {
            // Sinon les deux sont des entiers on fait donc la somme d'entier.
            return a.intValue() + b.intValue();
        }
    }
}
