package Sort;

import java.lang.reflect.AnnotatedElement;

public class quickSort {

    public static int[] Sort(int ini, int fin, int[] arreglo){
        int i=ini;
        int j=fin;
        int pivote =arreglo[(i +j)/2];
        do{
            while(pivote>arreglo[i]){
                i++;
            }

            while(pivote<arreglo[j]){
                j--;
            }

            if(ini<=fin){
                int aux=arreglo[i];
                arreglo[i]=arreglo[j];
                arreglo[j]=aux;
                i++;
                j--;
            }
        } while (i<=j);

        if(ini<j)Sort(ini,j,arreglo);

        if(fin>ini)Sort(i,fin,arreglo);

        return arreglo;
    }
}
