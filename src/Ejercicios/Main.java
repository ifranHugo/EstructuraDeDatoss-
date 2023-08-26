package Ejercicios;

import java.util.ArrayList;

public class Main {

    public static void main(String[] str){
        ArrayList<Tarea> listaDeTareas= new ArrayList<Tarea>();
        Tarea tarea1 = new Tarea("labar ropa","completa","tranka","31/31");
        listaDeTareas.add(tarea1);
        listaDeTareas.add(new Tarea("Ir al supermercado mañana","incompleta","alta","31/31"));
        listaDeTareas.add(new Tarea("Ir al cine a ver la nueva película de Marvel","completa","baja","31/31"));

        System.out.println(tarea1.getPrioridad());

    }
}
