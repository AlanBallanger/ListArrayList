package Listes;
import Listes.Ville;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestVille {
    public static void main(String[] args) {
        List<Ville> cities = new ArrayList<Ville>();

        Ville Nice = new Ville("Nice", 343000);
        Ville Carcassonne = new Ville("Carcassonne", 47800);
        Ville Narbonne = new Ville("Narbonne", 53400);
        Ville Lyon = new Ville("Lyon", 484000);
        Ville Foix = new Ville("Foix", 9700);
        Ville Pau = new Ville("Pau", 77200);
        Ville Marseille = new Ville("Marseille", 850700);
        Ville Tarbes = new Ville("Tarbes", 40600);

        cities.add(Nice);
        cities.add(Carcassonne);
        cities.add(Narbonne);
        cities.add(Lyon);
        cities.add(Foix);
        cities.add(Pau);
        cities.add(Marseille);
        cities.add(Tarbes);

        double mostPopulated = 0;
        double lessPopulated = 99999999;
        String cityPopulation = "";
        String cityPopulation2 = "";
        Iterator itr = cities.iterator();
        while (itr.hasNext())
        {
            Ville x = (Ville)itr.next();
            if (x.getPop() > mostPopulated){
                mostPopulated = x.getPop();
                cityPopulation = x.getName();
            }

            if (x.getPop() < lessPopulated){
                lessPopulated = x.getPop();
                cityPopulation2 = x.getName();
            }

            if (x.getPop() > 100000){
                x.setName(x.getName().toUpperCase());
            }
            System.out.println("ville : " + x.getName());
        }

        System.out.println("ville la plus peuplée : " + cityPopulation);
        System.out.println("ville la moins peuplée : " + cityPopulation2);
    }

}
