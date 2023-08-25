package Pila;

import java.util.Random;

public class Main {
    public static void main(String[] str){
        int tamanio = 10;
        PilaArreglo arreglo = new PilaArreglo<>(tamanio);
        Random random = new Random();
        int min = 1;
        int max = 59;
        int element;
        for (int i =0; i<tamanio;i++){
            element = random.nextInt(max - min + 1) + min;
            arreglo.push(element);
        }

        System.out.print(arreglo.isEmpyt());

    }

}
