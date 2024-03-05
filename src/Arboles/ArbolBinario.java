package Arboles;

public class ArbolBinario {
    Nodo raiz;

    public ArbolBinario (){
        this.raiz=null;
    }

    public Nodo getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }
    public void  inOrder (){
        inOrder(this.raiz);
    }

    private void inOrder(Nodo auxiliar){
        if (auxiliar != null){
            inOrder(auxiliar.hijoIzquierdo);
            System.out.println("Elemento " + auxiliar.dato);
            inOrder(auxiliar.hijoDerecho);
        }
    }

    public void preOrder(){
        preOrder(this.raiz);
    }
    private void preOrder(Nodo auxiliar){
        if (auxiliar != null){
            System.out.println("Elemento " + auxiliar.dato);
            preOrder(auxiliar.hijoIzquierdo);
            preOrder(auxiliar.hijoDerecho);
        }
    }

    public void posOrder(){
        posOrder(this.raiz);
    }

    private void posOrder(Nodo auxiliar){
        if (auxiliar!=null){
            posOrder(auxiliar.hijoIzquierdo);
            posOrder(auxiliar.hijoDerecho);
            System.out.println("Elemento "+ auxiliar.dato);
        }
    }
    public boolean arbolVacio (){
        return raiz ==null;
    }
    public void buscarElemento (int numeroABuscar){
        boolean elementoEncontrado =false;
        if (!arbolVacio()){
            Nodo auxiliar = raiz;
            while (auxiliar!=null && !elementoEncontrado){
                if (auxiliar.dato== numeroABuscar){
                    elementoEncontrado = true;
                }else {
                    if (auxiliar.dato <numeroABuscar)
                        auxiliar = auxiliar.hijoDerecho;
                    else
                        auxiliar = auxiliar.hijoIzquierdo;

                }
            }
            if (elementoEncontrado)
                System.out.println("El elemento "+ numeroABuscar +" si existe");
            else
                System.out.println("El elemento "+ numeroABuscar +" no existe");

        }
    }

    public  void  insertarNodo (int numeroAInsertar){
        Nodo auxiliar = new Nodo(numeroAInsertar);
        if (arbolVacio())
            raiz = auxiliar;
        else {
            Nodo actual = raiz;
            Nodo anterior = raiz;
            while (actual !=null){
                if (numeroAInsertar< actual.dato){
                    anterior = actual;
                    actual = actual.hijoIzquierdo;

                }else{
                    anterior = actual;
                    actual = actual.hijoDerecho;
                }
            }
            if (numeroAInsertar < anterior.dato)
                anterior.hijoIzquierdo= auxiliar;
            else
                anterior.hijoDerecho=auxiliar;
        }
    }



    public void eliminarDelArbol (int numeroAEliminar){
        if (!arbolVacio()){
            Nodo nodoActual = raiz;
            Nodo nodoAnterior = raiz;
            boolean elementoFueEncontrado  = false;
            if (nodoActual.dato == numeroAEliminar) elementoFueEncontrado =true;
            while ( nodoActual != null && !elementoFueEncontrado){

                if (nodoActual.dato < numeroAEliminar){
                    nodoAnterior = nodoActual;
                    nodoActual = nodoActual.hijoDerecho;
                }else {
                    nodoAnterior = nodoActual;
                    nodoActual = nodoActual.hijoIzquierdo;
                }
                if (nodoActual.dato == numeroAEliminar) elementoFueEncontrado =true;
            }
            if (elementoFueEncontrado){
                if (nodoActual.hijoDerecho==null && nodoActual.hijoIzquierdo ==null){
                    if (nodoActual == nodoAnterior) raiz = null;
                    else {
                        if (nodoAnterior.hijoIzquierdo == nodoActual) nodoAnterior.hijoIzquierdo = null;
                        else nodoAnterior.hijoDerecho = nodoActual.hijoDerecho;
                    }
                }else if (nodoAnterior.hijoDerecho !=null && nodoAnterior.hijoIzquierdo ==null){

                    if (nodoActual == nodoAnterior)
                        raiz =nodoActual.hijoDerecho;
                    else nodoAnterior.hijoDerecho = nodoActual.hijoDerecho;
                }else if (nodoAnterior.hijoIzquierdo !=null && nodoAnterior.hijoDerecho ==null){
                    System.out.println("Hola");
                    if (nodoActual == nodoAnterior)
                        raiz =nodoActual.hijoIzquierdo;
                    else nodoAnterior.hijoIzquierdo = nodoActual.hijoIzquierdo;
                }else if (nodoActual.hijoDerecho !=null && nodoActual.hijoIzquierdo != null){

                    Nodo origen = nodoActual;
                    nodoAnterior= nodoActual;
                    nodoActual = nodoActual.hijoIzquierdo;
                    if (nodoActual.hijoDerecho==null){
                        nodoAnterior.dato =nodoActual.dato;
                        nodoAnterior.hijoIzquierdo = nodoActual.hijoIzquierdo;
                    }else {
                        while (nodoActual.hijoDerecho!=null){
                            nodoAnterior = nodoActual;
                            nodoActual = nodoActual.hijoDerecho;
                        }
                        if (nodoActual.hijoIzquierdo!=null){
                            origen.dato = nodoActual.dato;
                            nodoAnterior.hijoDerecho=nodoActual.hijoIzquierdo;
                        }
                        else {

                            Nodo auxiliar = nodoActual;
                            Nodo auxiliarAnterior = nodoAnterior;
                            while (auxiliar.hijoDerecho != null) {
                                auxiliarAnterior = auxiliar;
                                auxiliar = auxiliar.hijoDerecho;
                            }
                            auxiliar.hijoDerecho = nodoActual.hijoDerecho;
                            auxiliar.hijoIzquierdo = nodoActual.hijoIzquierdo;
                            auxiliarAnterior.hijoDerecho = null;
                            nodoAnterior.hijoIzquierdo = auxiliar;
                            System.out.println("hola" + nodoAnterior.hijoDerecho.dato);
                        }

                    }
                }
            }

        }
    }
}
