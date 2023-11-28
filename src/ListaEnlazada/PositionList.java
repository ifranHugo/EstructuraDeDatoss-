package ListaEnlazada;
import java.util.EmptyStackException;
import java.util.Iterator;


public interface PositionList<E> extends java.lang.Iterable<E>{

    public int size();
    public boolean isEmpty();

    public Position<E> first()throws NullPointerException;

    public Position<E>last()throws EmptyStackException;

    public Position<E>prev(Position<E> p)throws NullPointerException,IndexOutOfBoundsException;

    public Position<E>next(Position<E> p)throws NullPointerException,IndexOutOfBoundsException;


    public void addAfter(Position<E>p,E e)throws NullPointerException;
    public void addBefore(Position<E>p,E e)throws NullPointerException;

    public void addFirst(E e)throws NullPointerException;
    public void addLast(E e)throws NullPointerException;

    public E remove(Position<E>p) throws NullPointerException;
    public E set(Position<E> p, E e)throws NullPointerException;

    @Override
    public Iterator<E> iterator();


    public Iterable<Position<E>>positions();
}