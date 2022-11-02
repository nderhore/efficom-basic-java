package org.efficom.numberOperation;

import java.sql.PreparedStatement;

public class NumberUtils {

    /**
     * Methode qui renvoie True si c'est pair
     * @param nombre
     * @return
     */
    public static boolean isPair(int nombre) {
        boolean result;
        if(nombre %2 == 0){
            result = true;
        }
        else {
            result = false;
        }
        return  result;
    }

    /**
     * Methode qui renvoie True si c'est premier
     * Un nombre premier, est premier que s'il est divisible par lui-même ou 1
     * exception : 1 n'est pas premier
     * @param nombre
     * @return
     */
    public static boolean isPrime(int nombre) {
        if (nombre <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(nombre); i++) {
            if (nombre % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Methode qui effectue une division et retourne tout simplement le resultat
     * @param numerator
     * @param denumerator
     * @return
     */
    public static double division(int numerator, int denumerator) {
        double result = 0.0;
        if(denumerator == 0){
            result = 0.0;
        }
        else{
            result = (double) numerator/denumerator;
        }
        return result;
    }

    /**
     * Méthode qui renvoie la clef de controle pour un numéro donné
     * @param numeroSecu
     * @return
     */
    public static int keyControlHealth(long numeroSecu) {
        return 97 - (int) (numeroSecu % 97);
    }
}
