package ListaEnlazada;

import java.util.Iterator;
import java.util.Random;

public class Main {
    public static void main(String[] str){
        ListaSimplementeEnlazada<Integer> miLista = new ListaSimplementeEnlazada<Integer>();
        miLista.addFirst(34);
        Random random = new Random();

        Iterator it= miLista.iterator();
        int el=0;
        while (el<10){
            el++;
            miLista.addAfter(miLista.first(),  random.nextInt(10,100));
        }
        System.out.println(miLista.toString());
    }
}
