package ListaEnlazada;

import java.util.EmptyStackException;
import java.util.Iterator;

public class ListaSimplementeEnlazada<E> implements PositionList<E> {

    private Nodo<E>cabeza;
    private int tamanio;
    public ListaSimplementeEnlazada(){
        cabeza=null;
        tamanio=0;
    }
    public int size(){return tamanio;}

    @Override
    public boolean isEmpty() {
        return cabeza==null;
    }


    @Override
    public void addFirst(E e) throws NullPointerException {
        cabeza = new Nodo<E>(e,cabeza);
        tamanio++;
    }

    @Override
    public void addLast(E e) {
        if(isEmpty()) addFirst(e);
        else{
            Nodo<E>p=cabeza;
            while (p.getSiguiente()!=null)
                p=p.getSiguiente();
            p.setSiguiente(new Nodo<E>(e));
            tamanio++;
        }
    }



    @Override
    public Position<E> first() throws NullPointerException {
        if (cabeza==null) throw new NullPointerException("first(): esta vacia");
        return cabeza;
    }

    @Override
    public Position<E> last() throws EmptyStackException {
        if (cabeza==null) throw new NullPointerException("first(): esta vacia");
        Nodo<E> p =cabeza;
        while (p.getSiguiente()!=null){
            p=p.getSiguiente();
        }
        return p;
    }

    @Override
    public Position<E> next(Position<E> p) throws NullPointerException {
        Nodo<E>n =checkPosition(p);
        if(n.getSiguiente()==null)
            throw new IndexOutOfBoundsException("Next::Siguiente de ultimo");
        return n.getSiguiente();

    }

    private Nodo<E>checkPosition(Position<E> p)throws NullPointerException{
        try {
            if (p==null)throw new NullPointerException("Position null");
            if(p.element()==null)throw new NullPointerException("p eliminada previamente");
            return (Nodo<E>) p;
        }catch (ClassCastException e){
            throw new NullPointerException("p no es un nodo de la lista");
        }
    }

    @Override
    public void addAfter(Position<E> p, E e) throws NullPointerException {
        Nodo<E>n =checkPosition(p);
        Nodo<E>nuevo =new Nodo<>(e);
        nuevo.setSiguiente(n.getSiguiente());
        n.setSiguiente(nuevo);
        tamanio++;
    }

    @Override
    public Position<E> prev(Position<E> p) throws NullPointerException, IndexOutOfBoundsException {
        checkPosition(p);
        if (p==first())throw new IndexOutOfBoundsException("Posicion primera");
        Nodo<E>aux =cabeza;
        while (aux.getSiguiente()!=p && aux.getSiguiente()!=null)
            aux=aux.getSiguiente();
        if (aux.getSiguiente()==null) throw new IndexOutOfBoundsException("Posicion no pertenece a la lista");
        return aux;
    }

    @Override
    public void addBefore(Position<E> p, E e) throws NullPointerException {
        checkPosition(p);
        if (p==first())addFirst(e);
        else addAfter(prev(p),e);
    }

    @Override
    public E remove(Position<E> p) throws NullPointerException {
        Nodo<E>n=checkPosition(p);
        if (p==first())cabeza =n.getSiguiente();
        else checkPosition(prev(p)).setSiguiente(n.getSiguiente());
        tamanio--;
        E aux=p.element();
        n.setElement(null);
        n.setSiguiente(null);
        return aux;
    }
    @Override
    public E set(Position<E> p, E e) throws NullPointerException {
        Nodo<E>n=checkPosition(p);
        n.setElement(e);
        return n.getElement();
    }

    static int hallarMaximo(PositionList<Integer>lista){
        int maximo=0;
        Iterator<Integer>it= lista.iterator();
        while (it.hasNext()){
            Integer elem=it.next();
            if (elem>maximo) maximo=elem;
        }
        return maximo;
    }

    public boolean buscar(PositionList<E>i, E x){
        for (E e:i)
            if (e.equals(x)) return true;
        return false;
    }
    public String toString(){
        Iterator<E>it =iterator();
        String s = "[";
        while (it.hasNext()){
            s+=it.next();
            if(it.hasNext())
                s+=",";
        }
        s+="]";
        return s;

    }

    public static <E> void eliminar(PositionList<E>l,E x) {
        for (Position<E> p : l.positions()) {
            if (p.element().equals(x))
                l.remove(p);

        }
    }

    @Override
    public Iterable<Position<E>> positions()
    {
        return (Iterable<Position<E>>) this;
    }

    @Override
    public Iterator<E> iterator() {
        return new ElementIterator<E>(this);
    }
}
