package Queue;

import java.util.Random;

public class Main {

    public static void main(String[] Str){
        Queue miQueue = new Queue<>();

        Random random = new Random();
        int element;
        for ( int i =0;i<10;i++){
            element=random.nextInt(10,50);
            miQueue.enqueue(element);
            System.out.print(element+"=>");

        }
        int tam= miQueue.size();

        int primerElemento;
        System.out.print("\nsolo con pares:");
        Queue nuevaQueue= new Queue<>();
        for (int i=0; i< tam-1;i++){
            primerElemento= (int) miQueue.dequeue();
            if(primerElemento%2 == 0){
                nuevaQueue.enqueue(primerElemento);
                System.out.print("=>"+primerElemento);
            }

        }
        System.out.println("\n"+miQueue.size());

    }


}
