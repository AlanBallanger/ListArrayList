package Listes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestListeString {
    public static void main(String[] args) {
        List<String> liste1 = new ArrayList<String>();
        liste1.add("Nice");
        liste1.add("Carcassonne");
        liste1.add("Narbonne");
        liste1.add("Lyon");
        liste1.add("Foix");
        liste1.add("Pau");
        liste1.add("Marseille");
        liste1.add("Tarbes");

        int maxLetters = 0;
        String longestCity = "";
        for (String value: liste1){
            if (maxLetters<value.length()){
                maxLetters = value.length();
                longestCity = value;
            }
        }

        System.out.println("Ville la plus longue : " + longestCity);

        for (String value: liste1) {
            System.out.println("en majuscule : " + value.toUpperCase());
            }

        Iterator itr = liste1.iterator();
        while (itr.hasNext())
        {
            String x = (String)itr.next();
            if (x.charAt(0) == 'N')
                itr.remove();
        }

        System.out.println("sans les villes en N : " + liste1);

    }
}
