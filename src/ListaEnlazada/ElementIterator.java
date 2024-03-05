package ListaEnlazada;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ElementIterator<E> implements Iterator<E> {
    private PositionList<E>list;
    protected Position<E> cursor;

    public ElementIterator(PositionList<E>l){
        list=l;
        if (list.isEmpty())cursor=null;
        else cursor=list.first();
    }

    public boolean hasNext(){return cursor!=null;};

    public E next()throws NoSuchElementException{
        if (cursor==null)
            throw new NoSuchElementException("Error: No hay siguiente");
        E toReturn = cursor.element();
        cursor =(cursor==list.last() ?null:list.next(cursor));
        return toReturn;
    }
    public void remove(){
    }
}
