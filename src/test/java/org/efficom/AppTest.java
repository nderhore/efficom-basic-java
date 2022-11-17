package org.efficom;

import org.efficom.array.ArrayUtils;
import org.efficom.list.ListUtils;
import org.efficom.numberOperation.NumberUtils;
import org.junit.Assert;
import org.junit.FixMethodOrder;

import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.efficom.string.StringUtils;

import java.util.ArrayList;

@FixMethodOrder(MethodSorters.JVM)
public class AppTest
{

    @Test
    public void isPalindrome(){
        String prenom = "Leon";
        String nom = "Noel";
        //On peux adapter avec Robert et Trebot

        boolean palindrome = StringUtils.isPalindrome(prenom,nom);
        Assert.assertEquals(true,palindrome);
    }

    /**
     * Donnez le nombre d'occurrence dans la chaine de caractère pour la lettre donné
     *
     */
    @Test
    public void countOccurrenceOfLetter()
    {
        int countLetter = StringUtils.countOccurenceOfLetter("bonjour",'o');
        Assert.assertEquals(2,countLetter);
    }

    /**
     * Calculez la moyenne du tableau
     */
    @Test
    public void avgArrayNote()
    {
        double[] note = new double[10];
        //TODO : generer 10 double random et remplir votre tableau de notes

        double avg = ArrayUtils.avgArrayNote(note);

    }

    @Test
    public void isPair(){
        int nombre = 2;
        boolean pair = NumberUtils.isPair(nombre);

        Assert.assertEquals(true,pair);
    }
    @Test
    public void isPrime(){
        int nombre = 1;
        boolean prime = NumberUtils.isPrime(nombre);

        Assert.assertEquals(false,prime);
    }

    @Test
    public void isVoyelle(){
        char lettre = 'b';
        boolean result = StringUtils.isVoyelleOrNot(lettre);

        Assert.assertEquals(false,result);
    }

    /**
     * Effectuez une division. Si on tente une division par 0, renvoyez 0.
     * */
    @Test
    public void division(){
        int numerator = 1;
        int denumerator = 2;
        double result = NumberUtils.division(numerator,denumerator);
        Assert.assertEquals(0.5,result,0.0);
    }

    /**
     * Vous devez utiliser l'algorithme de lune.
     * Cela permet de determiner le numero de controle pour un nombre donné, c'est que ce qui est utilisé votre carte de sécu
     * Pour trouver cette clef, vous devez prendre un nombre, lui retirer 97 et effectuer le module 97.
     */
    @Test
    public void keyControlHealth(){
        long numeroSecu = 1921071123456L;
        int key = NumberUtils.keyControlHealth(numeroSecu);
        Assert.assertEquals(15,key);
    }

    /**
     * Vous avez une liste et devez trouvé le nombre le moins elevée
     * on peux varier cet exercice pour un nombre le plus elevé
     */
    @Test
    public void minListElement(){
        //On definit notre liste
        ArrayList<Integer> listInteger = new ArrayList<>();

        //On ajoute des elements
        listInteger.add(1);
        listInteger.add(-1);
        listInteger.add(-2);

        int result = ListUtils.minListElement(listInteger);
        Assert.assertEquals(-2,result);
    }



}
