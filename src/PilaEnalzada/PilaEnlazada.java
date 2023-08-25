package PilaEnalzada;

import Pila.Stack;
import java.util.EmptyStackException;

public class PilaEnlazada<E> implements Stack<E> {
    protected  Nodo<E>head;
    private int tamanio;

    public PilaEnlazada() {
        head = null;
        tamanio = 0;
    }

    @Override
    public void push(E element) {
        head= new Nodo<E>(element,head);
        tamanio = tamanio+1;
    }

    @Override
    public E top() throws EmptyStackException {
        return head.getSiguiente().getElement();
    }

    @Override
    public int size() {
        return tamanio;
    }
    @Override
    public boolean isEmpyt() {
        return head==null;
    }
    @Override
    public E pop() throws EmptyStackException {

        if (isEmpyt()){
            throw new NullPointerException("La pila está vacia");
        }else {
            E aux= head.getElement();
            head=head.getSiguiente();
            tamanio =tamanio-1;
            return aux;
        }

    }
}
