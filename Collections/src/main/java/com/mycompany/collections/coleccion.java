
package com.mycompany.collections;


import java.util.*;
import newComisiones.clscomisiones;

/**
 *
 * @author PC
 */
public class coleccion {
    public static void main(String[] args) {
        
        
        clscomisiones comi =  new clscomisiones();
        comi.menu();
        
        
}

    public static void imprimir(Collection coleccion){
        for(Object elemento: coleccion){
            System.out.println("Elemento = "+ elemento);
        }
    } 
}
