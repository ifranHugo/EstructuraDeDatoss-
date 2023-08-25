package PilaEnalzada;

import java.util.Random;

public class Main {
    public static void main(String[] str){

        PilaEnlazada<Integer> Pila = new PilaEnlazada<>();

        Random random = new Random();
        int element;
        for (int i=0;i<10;i++){
            element=random.nextInt(20 - 10 + 1) + 10;
            Pila.push(element);
        }
        System.out.println(Pila.top());

    }

}
