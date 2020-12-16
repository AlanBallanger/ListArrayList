package sets;
import sets.Pays;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestPays {
    public static void main(String[] args) {

        Set<Pays> countries = new HashSet<Pays>();

        Pays USA = new Pays("USA", 90000000, 500);
        Pays France = new Pays("France", 50000000, 700);
        Pays Allemagne = new Pays("Allemagne", 45000000, 750);
        Pays Uk = new Pays("UK", 9000000, 900);
        Pays Italie = new Pays("Italie", 15000000, 350);
        Pays Japon = new Pays("Japon", 60000000, 400);
        Pays Chine = new Pays("Chine", 190000000, 200);
        Pays Russie = new Pays("Russie", 75000000, 100);
        Pays Inde = new Pays("Inde", 1900000000, 100);

        countries.add(USA);
        countries.add(France);
        countries.add(Allemagne);
        countries.add(Uk);
        countries.add(Italie);
        countries.add(Japon);
        countries.add(Chine);
        countries.add(Russie);
        countries.add(Inde);

        double pibHab = 0;
        double pop = 0;
        double minPop = 0;
        Iterator itr = countries.iterator();
        while (itr.hasNext())
        {
            Pays x = (Pays) itr.next();
            if (x.getPibHab() > pibHab){
                pibHab = x.getPibHab();
            }

            if (x.getPopulation() > pop){
                pop = x.getPopulation();
            }

            if (x.getPopulation() < minPop){
                minPop = x.getPopulation();
                x.setNom(x.getNom().toUpperCase());
            }
            System.out.println("liste des pays : " + x.getNom() + " avec la population : " + x.getPopulation() + " et le pibhab : " + x.getPibHab());
        }
        System.out.println("plus haut pibhab : " + pibHab);
        System.out.println("plus haut pib : " + pop);
    }
}
