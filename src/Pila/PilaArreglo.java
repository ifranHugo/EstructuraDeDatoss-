package Pila;

import java.util.EmptyStackException;

public class PilaArreglo <E> implements Stack<E>{
    protected int tamanio;
    protected E[] datos;

    PilaArreglo(int MAX){
        tamanio=0;
        datos=(E[]) new Object[MAX];
    }
    PilaArreglo(){this(20);}


    @Override
    public void push(E element) throws NullPointerException{
        if (tamanio == datos.length) {
            throw new NullPointerException("La pila está llena");
        }else {
            datos[tamanio]=element;
            tamanio++;
        }
    }
    @Override
    public E pop() throws EmptyStackException {
        if (tamanio==0){
            throw new NullPointerException("La pila está vacia");
        }else{
            E aux = datos[tamanio-1];
            datos[tamanio-1]=null;
            tamanio--;
            return aux;
        }
    }

    @Override
    public E top() throws EmptyStackException {
        return datos[tamanio-1];
    }

    @Override
    public boolean isEmpyt() {
        return tamanio ==0;
    }

    @Override
    public int size() {
        return tamanio;
    }
}
