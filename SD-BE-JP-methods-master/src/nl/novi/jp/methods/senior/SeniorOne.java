package nl.novi.jp.methods.senior;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


import static java.lang.String.valueOf;


/**
 * Gegeven: een lijst met namen zonder hoofdletters van klanten.
 * Opdracht: Een luie stagiair heeft alle klanten in het systeem gezet, maar deze kon de Shift-knop niet vinden.
 * Het is aan jou om alle namen van een hoofdletter aan het begin te voorzien. Maak een methode die een List als
 * parameter ontvangt en de inhoud vervolgens van hoofdletters voorziet.
 * <p>
 * Bonus 1: Zorg ervoor dat tussenvoegsels geen hoofdletter krijgen.
 * Bonus 2: Zorg ervoor dat de eerste letter na een '-' wel een hoofdletter krijgt.
 */

public class SeniorOne {


    public static void main(String[] args) {
        List<String> curstomerNames = new ArrayList<>();

        curstomerNames.add("nick piraat");
        curstomerNames.add("michael jackson");
        curstomerNames.add("glennis grace");
        curstomerNames.add("dreetje hazes");
        curstomerNames.add("robbie williams");
        curstomerNames.add("michiel de ruyter");
        curstomerNames.add("sjaak polak");
        curstomerNames.add("jan van jansen");
        curstomerNames.add("henk den hartog");
        curstomerNames.add("mo el-mecky");
        curstomerNames.add("fredje kadetje");

        System.out.println(curstomerNames); //zelf toegevoegd
        // String str = curstomerNames.get(0);
        // System.out.println(str);

//        for (String str : curstomerNames) {
//            String newCurstomerNames = str.split(" ");
//            System.out.println(newCurstomerNames);
//        }

//        String stri = "nick piraat";
//        String reg = "[- ]";
//        String[] str = stri.split(reg);
//        System.out.println("str: " + Arrays.toString(str));
//        for (int i = 0; i < str.length; i++) {
//            System.out.println(capitalize(str[i]));
//        }
//
//    }


        for (String name : curstomerNames) {
            String reg = "[- ]";
            String[] naamInArray = name.split(reg);
            System.out.println("str: " + Arrays.toString(naamInArray));
            //capitalizeren
            for (int i = 0; i < naamInArray.length; i++) {
            System.out.println(capitalize(naamInArray[i]));


        }
    }

    //methode om eerste letter van woord te capitalizeren
    public static final String capitalize(String[] str) {
        if (str == null || str.length() == 0) return str;
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }
}

/*public static void main(String[] args) {
    String str = "a + b - c * d / e < f > g >= h <= i == j";
    String reg = "((?<=[<=|>=|==|\\+|\\*|\\-|<|>|/|=])|(?=[<=|>=|==|\\+|\\*|\\-|<|>|/|=]))";

    String[] res = str.split(reg);
    System.out.println(Arrays.toString(res));

    String s = String.join(",", stringArray);
}*/