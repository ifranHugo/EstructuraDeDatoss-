package Sort;

public class bubbleSort {

    public static int[] Sort(int arreglo[], int nElementos){
        int actual;
        int siguiente;
        //arreglo=[4,2,1]
        for (int i=nElementos-1; i>=0;i--){
            for(int j=0;j<i;j++){
                actual=arreglo[j];
                siguiente=arreglo[j+1];
                if(actual>siguiente){
                    arreglo[j+1]=actual;
                    arreglo[j]=siguiente;
                }
            }
        }
        return arreglo;
    }
}
