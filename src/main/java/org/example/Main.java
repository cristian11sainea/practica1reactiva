package org.example;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("Primera practica curso reactividad.");
        List<Integer> lista = List.of(1,2,3,4,6,7,8,9);
        System.out.println("El numero mayor es: "+ mayor(lista).toString());
        System.out.println("El numero menor es: "+ menor(lista).toString());

         //punto 2
        System.out.println("venta 100000, descuento 10%");
        System.out.println("valor venta: " + descuento(100000,10) );
        //punto 3
        System.out.println("valor compra 100000 IVA: 15 ");
        System.out.println("IVA: " + iva(100000, 15));

        System.out.println("valor compra 100000");
        System.out.println("IVA: " + iva(100000));

    }

    /**
     * Haciendo uso de lo aprendido(Expresiones lambda, referencias a métodos y funciones puras) resuelva:
     * */

    /**
     * 1. Con la intención de encontrar el número mayor en una lista y a su vez el número menor, cree un método que le permita
     * estas dos funciones, siguiendo los principios de las funciones puras.
     * */




    /**
     * 2. En una tienda de ropa necesitamos aplicar un descuento a las ventas que se hacen, este descuento
     * es variable por lo que necesitamos que usted cree un método que reciba el total de la venta y el porcentaje a descontar
     * y devuelva el nuevo precio total.
     * */

    /**
     * 3. Necesitamos calcular el iva de una venta, para esto es necesario que usted cree un método
     * Tendremos dos escenarios posibles, en el primero se le pasará únicamente el valor al cual se le debe
     * aplicar el iva, sin especificar el porcentaje, en este caso se debe aplicar un 21% siempre.
     * En el segundo escenario se le pasará tanto el precio de la venta como el porcentaje de iva.
     * Cree una sola función que pueda lograr estos dos propósitos
     * */

    public static Integer mayor(List<Integer> lista){
        return lista.stream().max(Integer::compareTo).get();
    }
    public static Integer menor(List<Integer> lista) {
        return lista.stream().min(Integer::compareTo).get();
    }

    public static double descuento(double venta, double porcentaje){
        return venta - (venta*(porcentaje/100));
    }
    public static double iva(double valor, double porcentaje){
        return (valor * porcentaje) / 100;
    }
    public static double iva(double valor){
        return (valor * 21) / 100;
    }
}