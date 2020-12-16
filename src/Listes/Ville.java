package Listes;

import java.util.ArrayList;
import java.util.List;

public class Ville {
    String name;
    double pop;

    public Ville (String name, double pop) {
        this.name = name;
        this.pop = pop;
    }

    public double getPop() {
        return this.pop;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


