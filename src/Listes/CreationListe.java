package Listes;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class CreationListe {
    public static void main(String[] args) {
        List list = new ArrayList();
        for (int i=0; i<100;i++){
            list.add(i+1);
        }
        System.out.println(list.size());
    }
}
