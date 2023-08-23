package Sort;

import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);
            int arreglo[], arregloQuick[];
            int nElementos=40000;
            int nElementosQuick=100000;

           // nElementos=Integer.parseInt(JOptionPane.showInputDialog("de que tamaño es el arreglo"));


            arreglo= new int[nElementos];
            arregloQuick= new int[nElementosQuick];
            int element;
            Random random = new Random();
            int min = 1;
            int max = 1000000;
            for(int i =0; i<nElementos-1;i++){
                //element=Integer.parseInt(JOptionPane.showInputDialog("numero en la posicion : "+i+" = "))
                element = random.nextInt(max - min + 1) + min;
                arreglo[i]=element;
            }
            for(int i =0; i<nElementosQuick-1;i++){
                element = random.nextInt(max - min + 1) + min;
                arregloQuick[i]=element;
            }

        // Medir el tiempo de ejecución del primer método
        long startTime = System.nanoTime();
        System.out.println("arreglo primero= ");
        printArray(arreglo);
        int arregloOrdenado[]= selectionSort.Sort(arreglo,nElementos);
        System.out.println("arreglo ordenado= ");
        printArray(arregloOrdenado);
        //Sort.insertionSort.selectionSort.Sort(arreglo,nElementos);
        long endTime = System.nanoTime();
        long tiempoMetodoUno = (endTime - startTime)/ 1000000;

        // Medir el tiempo de ejecución del segundo método
        startTime = System.nanoTime();
        int arregloOrdenadoSort[]= quickSort.Sort(0,nElementosQuick-1,arregloQuick);
        System.out.println("arreglo ordenado QuickSort= ");
        printArray(arregloOrdenadoSort);
        endTime = System.nanoTime();
        long tiempoMetodoDos =( endTime - startTime) / 1000000;

        // Comparar los tiempos de ejecución
        if (tiempoMetodoUno < tiempoMetodoDos) {
            System.out.println("El método uno se ejecuta más rápido que el método dos.");
        } else if (tiempoMetodoUno > tiempoMetodoDos) {
            System.out.println("El método dos se ejecuta más rápido que el método uno");
        } else {
            System.out.println("Ambos métodos se ejecutan en el mismo tiempo.");
        }

        System.out.println("tiempo de ejecucion de metodo uno: "+tiempoMetodoUno +" \n tiempo de ejecucion de metodo dos: "+tiempoMetodoDos);

    }
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " => ");
        }
        System.out.println();
    }
}