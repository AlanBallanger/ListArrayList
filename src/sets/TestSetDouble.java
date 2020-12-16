package sets;

import Listes.Ville;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestSetDouble {
    public static void main(String[] args) {
        Set<Double> set = new HashSet<Double>();
        set.add(1.5);
        set.add(8.25);
        set.add(-7.32);
        set.add(13.3);
        set.add(-12.45);
        set.add(48.5);
        set.add(0.01);

        Iterator itr = set.iterator();
        while (itr.hasNext())
        {
            Double x = (Double) itr.next();
            System.out.println(x);
        }

        double max = (double) Collections.max(set);
        System.out.println("Nombre max : " + max);
        double min = (double) Collections.min(set);
        set.remove(min);
        System.out.println("en enlevant la valeur minimale : " + set);

    }

}
