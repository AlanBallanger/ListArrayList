package sets;

import java.util.HashSet;
import java.util.Set;

public class TestSetString {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();

        set.add("USA");
        set.add("France");
        set.add("Allemagne");
        set.add("UK");
        set.add("Italie");
        set.add("Japon");
        set.add("Chine");
        set.add("Russie");
        set.add("Inde");

        int letters = 0;
        String country = "";

        System.out.println("Avant : " + set);

        for (String sets : set){
            if (sets.length() > letters){
                letters = sets.length();
                country = sets;
            }
        }
        System.out.println("pays le plus long : " + country);

        set.remove(country);

        System.out.println("et on l'enleve : " + set);
    }
}
