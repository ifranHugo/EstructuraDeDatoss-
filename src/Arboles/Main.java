package Arboles;

import java.io.Console;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArbolBinario ab = new ArbolBinario();
        ab.insertarNodo(10);
        ab.insertarNodo(8);
        ab.insertarNodo(13);
        ab.insertarNodo(20);
        ab.insertarNodo(25);
        ab.buscarElemento(13);


        System.out.println("Arbol inorder");
        ab.inOrder();
        System.out.println("Arbol preoder");
        ab.preOrder();
        System.out.println("Arbol posOrder");
        ab.posOrder();


    }
}
