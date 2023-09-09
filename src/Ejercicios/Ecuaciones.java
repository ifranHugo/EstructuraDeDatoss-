package Ejercicios;

import java.util.ArrayList;
import java.util.List;

public class Ecuaciones {
    private double raizCuadrada,raiz1,raiz2,discriminante,constante,coeficiente1,coeficiente2,valorenY;
    String devolver;

    public Ecuaciones(double coeficiente1, double coeficiente2, double constante) {
        this.constante = constante;
        this.coeficiente1 = coeficiente1;
        this.coeficiente2 = coeficiente2;
    }

    public String resolvente(){
        this.discriminante= Math.pow(this.coeficiente2, 2) - 4 * this.coeficiente1 * this.constante;
        if(this.discriminante==0){
            raiz1=-this.coeficiente2/(2*this.coeficiente1);
            devolver="la raiz corta en:"+this.raiz1;
        }else if(this.discriminante>0){
            raizCuadrada = Math.sqrt(discriminante);
            raiz1=((-this.coeficiente2)+raizCuadrada)/(2*this.coeficiente1);
            raiz2=((-this.coeficiente2)-raizCuadrada)/ (2*this.coeficiente1);
            devolver="la raiz corta en : "+this.raiz1+" y en : "+this.raiz2;
        }else{
            devolver ="no corta en eje x";
        }
        return devolver;
    }
    public String funcionenx(double x){
        this.valorenY=this.coeficiente1*(Math.pow(x,2))+((this.coeficiente2*x)+this.constante);
        this.devolver ="el valor de Y en funcion de"+ x
                +"es : "+this.valorenY;
        return this.devolver;
    }
    public String ejeSimetria(){
        double ejex=-this.coeficiente2/(2*this.coeficiente1);
        this.funcionenx(ejex);

        return this.devolver="El eje de simetria corta en x: "+ejex+" y en Y: "+this.valorenY;
    }
}
