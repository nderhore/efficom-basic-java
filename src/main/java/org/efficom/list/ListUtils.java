package org.efficom.list;

import java.util.ArrayList;

public class ListUtils {

    /**
     * Methode qui renvoi le plus petit element de la liste
     * @param listInteger
     * @return
     */
    public static int minListElement(ArrayList<Integer> listInteger) {

        int min = 15;
        for(Integer i : listInteger){
            if (i < min){
                min = i;
            }
        }
        return min;

        //deuxieme ecriture
        // return listInteger.stream().min(Integer::compare).get();
    }
}
