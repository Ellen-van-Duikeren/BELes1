package nl.novi.jp.methods.junior;


/**
 * Deze klasse bevat al de methode met de naam doubleIt. Deze methode ontvangt een integer, verdubbelt deze en print
 * deze vervolgens uit.
 *
 * Maak deze klasse af door de methode squareTheNumber af te maken. Deze methode ontvangt een integer en moet deze
 * kwadrateren en uitprinten.
 */
public class JuniorTwo {

    public static void main(String[] args) {
        doubleIt(33);
        squareTheNumber(4);
    }

    public static void doubleIt(int number) {
        int doubledNumber = number + number;
        System.out.println("Het getal " + number + " is verdubbeld: " + doubledNumber);
    }

    public static void squareTheNumber(int number2) {
        System.out.println("Het getal " + number2 + " is gekwadratteerd: " + number2*number2);
    }
}
