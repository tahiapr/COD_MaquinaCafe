/*
 * Ejercicio para clase de contornos.
 * Simulación de una máquina de café.
 * Segunda evaluación, primero de DAM.
 */
package maquinacafe;

import javax.swing.JOptionPane;

/**
 * Esta es la clase monedero que contendrá todas las operaciones lógicas de
 * nuestra máquina de café.
 *
 * @author sherlyn
 */
public class Monedero {

    public static float dinero;
    public static float cambio;

    /**
     * Método que recibe el dinero que ha ingresado el usuario.
     *
     * @param respuestaDinero es la variable que recogemos a través del
     * JOptionPane de ingresar dinero.
     */
    public void ingresarDinero(float respuestaDinero) {
        dinero += respuestaDinero;
    }

    /**
     * Método para devolver el dinero que se ha ingresado en la máquina de café
     *
     * @return dinero que ingresó el usuario en la máquina
     */
    public float verdineroingresado() {
        return dinero;
    }

    /**
     * Método para saber si el saldo que ha ingresado el usuario es suficiente.
     * Sino es suficiente le avisa de que tiene que ingresar más dinero.
     *
     * @param respuestaDinero dinero que ingresó el usuario
     * @param dineroCa precio del café
     * @param dineroTe precio del té
     * @param dineroCho precio del chocolate
     */
    public void validarSaldo(float respuestaDinero, float dineroCa, float dineroTe, float dineroCho) {
        if (respuestaDinero < dineroCa) {
            JOptionPane.showInputDialog(null, "Saldo insuficiente, ingrese más dinero");

        } else if (respuestaDinero < dineroCho) {
            JOptionPane.showInputDialog(null, "Saldo insuficiente, ingrese más dinero");
        } else {
            JOptionPane.showInputDialog(null, "Saldo insuficiente, ingrese más dinero");
        }
    }

    /**
     * Método para devolver el dinero que le sobra al usuario.
     *
     * @param producto es la bebida que seleccionó el usuario
     * @param dinero es el dinero que ingresó
     */
    public void devolverCambio(float producto, float dinero) {
        cambio = producto - dinero;
    }
}
