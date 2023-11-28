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
}
