package org.efficom.string;

public class StringUtils {

    /**
     * Méthode qui retourne le nombre de fois où letter apparait dans sentence
     *
     * @param sentence phrase à inspecter
     * @param letter   à trouver dans la phrase
     * @return nombre de letter dans sentence
     */
    public static int countOccurenceOfLetter(String sentence, char letter) {
        int cpt = 0;
        for(int i = 0; i< sentence.length(); i++){
            if(sentence.charAt(i) == letter) cpt++;
        }
        return cpt;
    }

    /**
     * Méthodes qui permet de connaitre si la lettre est oui ou non, une voyelle.
     * Pour rappel, les voyelles sont : a,e,i,o,u,y
     *
     * @param lettre
     * @return true if is voyelle
     */
    public static boolean isVoyelleOrNot(char lettre) {
        boolean result = false;
        char[] voyelles = new char[]{'a','e','i','o','u','y'};
        for (char data : voyelles){
            if (data == lettre){
                result = true;
                break;
            }
        }
        return result;
    }

    /**
     * Méthode qui renvoie si les deux elements sont palindrome.
     * Un palindrome est un mot qui écris à l'envers, correspond à un autre mot.
     *
     * @param prenom
     * @param nom
     * @return
     */
    public static boolean isPalindrome(String prenom, String nom) {
        boolean result = true;
        String reverse = "";
        for (int i = prenom.length() - 1; i >= 0; i--) {
            reverse = reverse + prenom.toLowerCase().charAt(i);
        }

        if (nom.toLowerCase().equals(reverse.toLowerCase()))
            result = true;
        else
            result = false;

        /* seconde ecriture
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(prenom.toLowerCase());
        nom = nom.toLowerCase();


        stringBuilder = stringBuilder.reverse();
        ;
        if(stringBuilder.toString().equals(nom)){
            return true;
        }
        else {
            return false;
        }*/
        return result;
    }
}
