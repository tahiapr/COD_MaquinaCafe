/*
 * Ejercicio para clase de contornos.
 * Simulación de una máquina de café.
 * Segunda evaluación, primero de DAM.
 */
package maquinacafe;

import javax.swing.JOptionPane;
import static maquinacafe.Producto.azucar;

/**
 *
 * @author sherlyn
 */
public class Botonera {
    
Display d = new Display(); 
Cafetera c = new Cafetera();
Producto p = new Producto();
Monedero m = new Monedero();

    public void comprobarPrecios(int op2){
        switch (op2) {
            case 0:
                d.cPrecioChocolate();
                break;
            case 1:
                d.cPrecioTe();
                break;
            case 2:
                d.cPrecioCafe();
                break;
        }
    }
    
     public void añadirAzucar(int op4){
        switch (op4) {
            case 0:
                 azucar++;
                d.masAzucar();
                
                break;
            case 1:
               azucar--;
                d.menosAzucar();
                break;
            case 2:
                azucar=3;
                d.igualAzucar();
                break;
        }
     }
     
     public void escogerProducto(int op3){
           switch (op3) {
            case 0:
                c.Chocolate();
                break;
            case 1:
                c.Te();
                break;
            case 2:
                c.Cafe();
                break;
        }
       }
     
    
}
