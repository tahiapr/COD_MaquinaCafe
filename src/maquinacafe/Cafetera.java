/*
 * Ejercicio para clase de contornos.
 * Simulación de una máquina de café.
 * Segunda evaluación, primero de DAM.
 */
package maquinacafe;

import javax.swing.JOptionPane;

/**
 * Esta clase define las bebidas que tiene la máquina de café. Les asigna un
 * precio y un azúcar determinado.
 *
 * @author sherlyn
 */
public class Cafetera {

    /**
     * Método que crea la bebida té.
     *
     * @return dineroTe es el precio del té.
     */
    public float Te() {
        float dineroTe = 1.15f;
        Producto.getAzucar();
        return dineroTe;
    }

    /**
     * Método que crea la bebida chocolate.
     *
     * @return dineroCho es el precio del chocolate.
     */
    public float Chocolate() {
        float dineroCho = 1.25f;
        Producto.getAzucar();
        return dineroCho;
    }

    /**
     * Método que crea la bebida café.
     *
     * @return dineroCa es el precio del café.
     */
    public float Cafe() {
        float dineroCa = 1.05f;
        Producto.getAzucar();
        return dineroCa;
    }
}
