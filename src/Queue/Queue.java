package Queue;

import java.util.NoSuchElementException;

public class Queue<E> implements  StackQueue<E>{

    private Nodo<E> inicio;
    private Nodo<E> fin;
    private int cantidad;

    public Queue() {
        this.inicio = null;
        this.fin=null;
        this.cantidad=0;
    }

    @Override
    public boolean isEmpty() {
        return cantidad==0;
    }

    @Override
    public void enqueue(E element) {
        if (isEmpty()){
            inicio=fin = new Nodo(element,null);
            cantidad++;
        }else{
            Nodo nuevo =new Nodo(element,null);
            fin.setSiguiente(nuevo);
            fin=nuevo;
            cantidad++;
        }
    }

    @Override
    public E dequeue() throws NoSuchElementException {
        E aux=null;
        if (isEmpty())throw new NullPointerException("La pila está vacia");
        else{
            if(inicio==fin) inicio=fin=null;
            else {
                aux=inicio.getDato();
                inicio =inicio.getSiguiente();
            }
            cantidad--;
        }


        return aux;
    }

    @Override
    public int size() {
        return cantidad;
    }

    @Override
    public E front() throws NoSuchElementException {
        return inicio.getDato();
    }

}