package Hash;

import java.util.HashMap;
import java.util.Hashtable;

public class MapeoDatos {
    public static void main(String[] args){
        HashMap<Integer,String>personas = new HashMap<>();
        personas.put(12345,"edward ortiz");
        personas.put(12142,"Sonia Garcia");
        personas.put(32942,"Daniela Ortiz");

        for (Integer cedula:personas.keySet()) {
            System.out.printf("%s -> %s\n", cedula,personas.get(cedula));
        }

        //hashtable

        System.out.println("hashtable");
        Hashtable<Integer,String>personas2 = new Hashtable<>();
        personas2.put(12345,"edward ortiz");
        personas2.put(12142,"Sonia Garcia");
        personas2.put(32942,"Daniela Ortiz");

        for (Integer cedula:personas2.keySet()) {
            System.out.printf("%s -> %s\n", cedula,personas2.get(cedula));
        }

    }
}
