package org.efficom.array;

import java.util.ArrayList;

public class ArrayUtils {

    /**
     * calcul d'une moyenne sur un tableau.
     * @param notes
     * @return
     */
    public static double avgArrayNote(double[] notes){
        double somme = 0;
        for(double i : notes){
            somme +=i;
        }
        double result = somme / notes.length;
        return result;
    }


}
