package Arboles;

import java.io.Console;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArbolBinario ab = new ArbolBinario();
        ab.insertarNodo(30);
        ab.insertarNodo(15);
        ab.insertarNodo(35);
        ab.insertarNodo(10);


        ab.eliminarDelArbol(15);
        System.out.println("Arbol inorder");
        ab.inOrder();
        System.out.println("Arbol preoder");
        ab.preOrder();
        System.out.println("Arbol posOrder");
        ab.posOrder();


    }
}
