package nl.novi.jp.methods.medior;

import java.util.ArrayList;
import java.util.List;

/**
 * Uitdagend!
 * Gegeven: Een methode die string per character in een List stopt (numberStringToArrayList).
 * Gegeven: Een methode die een getal ontvangt en deze vertaalt naar een String (numberListToStringList).
 * Gegeven: Twee methodes die afgemaakt moeten worden door jou!
 * <p>
 * Deze applicatie heeft als doel om een string van nummer in zijn geheel uit te schrijven:
 * "123" wordt "one-two-three"
 * <p>
 * Twee methodes zijn al gegeven, twee moet je zelf maken en je dient ze vervolgens in de juiste volgorde aan te roepen
 * vanuit de main-methode.
 * Pas numberListToStringList() zo aan dat de getallen uit de list worden omgezet naar text en worden toegevoegd aan:
 * wordNumbers
 * <p>
 * Pas printNumbers() zo aan dat de List wordt geprint met een "-" tussen de Strings.
 */

public class MediorFour {

    public static void main(String[] args) {
        List<Integer> result = numberStringToArrayList("153793046");
        System.out.println("Tussenresultaten om te begrijpen wat er gebeurt:");
        System.out.println(result); // zelf toegevoegd om te kijken wat ie nu heeft, mag weg
        System.out.println(numberToWord(5)); // zelf toegevoegd om te kijken wat ie nu heeft, mag weg
        List<String> stringList = numberListToStringList(result); // zelf toegevoegd om te kijken wat ie nu heeft, mag weg
        System.out.println(stringList); // zelf toegevoegd om te kijken wat ie nu heeft, mag weg
        printNumbers(stringList);
    }

    // methode neemt string 1232345231 in en maakt er losse cijfers van in een array list > "result"
    public static List<Integer> numberStringToArrayList(String numbers) { // volledig gegeven in opdracht
        List<Integer> numberList = new ArrayList<>();

        for (char character : numbers.toCharArray()) {
            numberList.add(Integer.parseInt(String.valueOf(character)));
        }
        return numberList;
    }

    //TODO: Maak deze methode af.
    // methode neemt een lijst losse int nummers (bijv 1,2,1,3,4) in en zet deze om naar lijst met String nummers (bijv een, twee, een,..)
    public static List<String> numberListToStringList(List<Integer> numbers) {
        List<String> wordNumbers = new ArrayList<>(); //gegeven in opdracht
        for (int newNumber : numbers) {
            wordNumbers.add(numberToWord(newNumber));
        }
        return wordNumbers; // gegeven in opdracht
    }

    // methode neemt een enkel nummer in (bijv 2) en geeft stringnaam (bijv "twee")
    public static String numberToWord(int number) { //volledig gegeven in opdracht
        switch (number) {
            case 0:
                return "zero";
            case 1:
                return "one";
            case 2:
                return "two";
            case 3:
                return "three";
            case 4:
                return "four";
            case 5:
                return "five";
            case 6:
                return "six";
            case 7:
                return "seven";
            case 8:
                return "eight";
            case 9:
                return "nine";
            default:
                return "Unknown number";
        }
    }

    //TODO Maak deze methode af.
    public static void printNumbers(List<String> stringList) { // gegeven in opdracht
        int counter = 0;
        System.out.println("\nGevraagd eindresultaat:");
        for (int i = 0; i < stringList.size(); i++) {
            if (i < stringList.size() - 1) {
                System.out.print(stringList.get(i) + " - ");
            } else {
                System.out.print(stringList.get(i));
            }
        }
    } // gegeven in opdracht

}
