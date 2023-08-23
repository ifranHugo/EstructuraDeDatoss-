package Sort;

import java.util.Random;
import java.util.Scanner;

public class selectionSort {
    public static int[] Sort(int[]arreglo,int nElementos){
        //a =[4,1,2]
        int auxiliar;
        int min;
        for (int i=0;i<nElementos;i++){
            //Hallar el minimo de a[min] de a[i]
            min=i;//min=0
            for(int j=i+1;j<nElementos;j++){
                //j=1
                if(arreglo[j]<arreglo[min]){
                    min=j;
                }
                //arreglo[j]=1 arrgelo[min=0]=4
                //min =1
            }

            auxiliar =arreglo[i];
            //auxiliar=arreglo[i] =4
            arreglo[i]=arreglo[min];
            //arrglo[i=0]=arrgelo[min=1]=1
            arreglo[min]=auxiliar;
            //arreglo[1]=auxiliar=4

            //arreglo =[1,4,2]

        }
        return arreglo;
    }
}
