package sets;

public class Pays {
    String nom;
    double population;
    double pibHab;

    public Pays (String nom, double population, double pibHab) {
        this.nom = nom;
        this.population = population;
        this.pibHab = pibHab;
    }

    public double getPibHab() {
        return pibHab;
    }

    public double getPopulation() {
        return population;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
