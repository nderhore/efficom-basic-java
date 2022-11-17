package org.efficom;

import org.efficom.array.ArrayUtils;
import org.efficom.list.ListUtils;
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
    public void isVoyelle(){
        char lettre = 'b';
        boolean result = StringUtils.isVoyelleOrNot(lettre);

        Assert.assertEquals(false,result);
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
