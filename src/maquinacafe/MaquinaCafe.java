/*
 * Ejercicio para clase de contornos.
 * Simulación de una máquina de café.
 * Segunda evaluación, primero de DAM.
 */
package maquinacafe;

import javax.swing.JOptionPane;

/**
 * Programa de una cafetera que tendrá cuatro clases. Botonera: que se
 * corresponde a los botones que puede pulsar el usuario. Display: los mensajes
 * que se mandan desde pantalla. Monedero: que contendrá las operaciones
 * lógicas. Producto: vendrán definidos los productos que tendrá la cafetera.
 *
 * @author tperezrodriguez
 */
public class MaquinaCafe {

    /**
     * Clase principal del programa. Contendrá un menú con las primeras opciones
     * que tiene la cafetera.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Display d = new Display();
        Monedero m = new Monedero();
        Botonera b = new Botonera();
        Cafetera c = new Cafetera();

        /**
         * Creamos un Array con opciones de String para crear los botones del
         * JOptionPane.
         *
         */
        String[] opciones = {"Salir de la máquina de café", "Comprobar producto", "Ingresar dinero"};
        int op = JOptionPane.showOptionDialog(null, "¿Qué es lo que desea hacer con la máquina de café?", "Máquina de café", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[1]);

        /**
         * Ahora hacemos un switch que contendrá los métodos que constituyen el
         * programa. Este switch recibe op, que es la variable que nos devuelve
         * el JOptionPane.
         */
        switch (op) {
            case 0:
                System.exit(0);
                break;
            case 1:
                b.comprobarPrecios(d.dComprobarProducto());
                m.ingresarDinero(d.dDinero());
                b.escogerProducto(d.dEscogerProducto());
                m.validarSaldo(m.verdineroingresado(), c.Cafe(), c.Te(), c.Chocolate());
                b.añadirAzucar(d.dAzucar());
                d.elaborandoProducto();
                m.devolverCambio(b.escogerProducto(d.recogerProducto()), m.verdineroingresado());
                d.dDevolverCambio();
                break;
            case 2:
                m.ingresarDinero(d.dDinero());
                b.escogerProducto(d.dEscogerProducto());
                m.validarSaldo(m.verdineroingresado(), c.Cafe(), c.Te(), c.Chocolate());
                b.añadirAzucar(d.dAzucar());
                d.elaborandoProducto();
                m.devolverCambio(b.escogerProducto(d.recogerProducto()), m.verdineroingresado());
                d.dDevolverCambio();
                break;

        }
    }

}
