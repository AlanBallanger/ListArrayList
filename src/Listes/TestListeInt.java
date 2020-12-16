package Listes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class TestListeInt {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(-1);
        list.add(5);
        list.add(7);
        list.add(3);
        list.add(-2);
        list.add(4);
        list.add(8);
        list.add(5);

        System.out.println("liste: " + list);
        System.out.println("longueur : " + list.size());


        int max = (int) Collections.max(list);
        System.out.println("max : " + max);
        int min = (int) Collections.min(list);
        list.removeIf(Predicate.isEqual(min));

        list.forEach(liste -> System.out.println("avec valeurs absolues : " + Math.abs((Integer) liste)));


    }
}
