/*
 * Ejercicio para clase de contornos.
 * Simulación de una máquina de café.
 * Segunda evaluación, primero de DAM.
 */
package maquinacafe;

import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.YES_NO_OPTION;
import static javax.swing.JOptionPane.YES_OPTION;
import static maquinacafe.Producto.azucar;

/**
 * Esta clase alberga los botones que tiene la máquina de café. Es la manera que
 * tiene el usuario de interactuar con el programa.
 *
 * @author sherlyn
 */
public class Botonera {

    Display d = new Display();
    Cafetera c = new Cafetera();

    /**
     * Método para comprobar los precios de cada uno de los productos que tiene
     * la máquina.
     *
     * @param op2 es el producto sobre el cual el usuario quiere ver el precio
     */
    public void comprobarPrecios(int op2) {

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
        int resp = JOptionPane.showConfirmDialog(null, "¿Quiere comprobar el precio de otro producto", "Precios productos", YES_NO_OPTION);
        if (resp == YES_OPTION) {
            this.comprobarPrecios(d.dComprobarProducto());
        }
    }

    /**
     * Método que asigna al producto que escogió el usuario el precio de la
     * bebida.
     *
     * @param op3 es el producto que escogió el usuario
     * @return no devuelve nada.
     */
    public float escogerProducto(int op3) {
        switch (op3) {
            case 0:
                return c.Chocolate();

            case 1:
                return c.Te();

            case 2:
                return c.Cafe();
        }
        return 0f;
    }

    /**
     * Método para añadir, sacar o dejar el azúcar que está de forma
     * predeterminada.
     *
     * @param op4 es la opción que escoge el usuario sobre si quiere más o menos
     * azúcar o dejarlo así.
     */
    public void añadirAzucar(int op4) {
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
                azucar = 3;
                d.igualAzucar();
                break;
        }

        int resp = JOptionPane.showConfirmDialog(null, "¿Quiere añadir o sacar más azúcar?", "Azúcar", YES_NO_OPTION);
        if (resp == YES_OPTION) {
            this.añadirAzucar(d.dAzucar());
        }
    }
}
