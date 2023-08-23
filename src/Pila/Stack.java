package Pila;

import java.util.EmptyStackException;

public interface Stack <E>{


    /*
    * @param element Elemento a insertar
    * */
    public void push (E element);

    /*
     * @return Elemento removido
     * @throws EmptyStackException si la pila esta vacia
     * */
    public E pop() throws  EmptyStackException;

    /*
     * @return Elemento en el tope
     * @throws EmptyStackException si la pila esta vacia
     * */
    public E top () throws EmptyStackException;

    /*
     * @return true si la fila esta vacia
     * */
    public boolean isEmpyt();

    /*
     * @return cantidad de elementos de la pila
     * */
    public int size();


}
