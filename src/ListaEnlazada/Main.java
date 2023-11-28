package ListaEnlazada;

import java.util.*;

public class Main {
    public static void main(String[] str){
        ListaSimplementeEnlazada<Integer> miLista = new ListaSimplementeEnlazada<Integer>();
        Random random = new Random();
        int el=0;
        while (el<10){
            el++;
            miLista.addFirst(random.nextInt(10,100));
        }
        miLista.addAfter(miLista.first(),10);
        Iterator it= miLista.iterator();
        System.out.println(miLista.toString());
        Position<Integer>p= miLista.first();
        Position<Integer>u=miLista.last();

        while (p!=null){
            System.out.println(p.element());
            if (p==u)
                p=null;

            else {
                miLista.set(p,random.nextInt(10,100));
                p= miLista.next(p);
            }
        }

        System.out.println(miLista.toString());


    }
}
