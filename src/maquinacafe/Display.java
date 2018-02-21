/*
 * Ejercicio para clase de contornos.
 * Simulación de una máquina de café.
 * Segunda evaluación, primero de DAM.
 */
package maquinacafe;

import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.NO_OPTION;
import static javax.swing.JOptionPane.YES_NO_OPTION;
import static maquinacafe.Producto.azucar;

/**
 * Clase que alberga todas las pantallas que lee el usuario.
 *
 * @author sherlyn
 */
public class Display {

    private int posicionProducto = 0;

    /**
     * Pantalla para preguntar cuánto dinero quiere ingresar el usuario.
     *
     * @return respuestaDinero es el dinero que ingresa el usuario
     */
    public float dDinero() {
        float respuestaDinero = Float.parseFloat(JOptionPane.showInputDialog(null, "¿Cuánto dinero quiere ingresar?"));
        return respuestaDinero;
    }

    /**
     * Pantalla para preguntar el producto por el que quiere ver el precio.
     *
     * @return op2 es el producto del que el usuario quiere ver el precio
     */
    public int dComprobarProducto() {
        String[] opciones2 = {"Chocolate",
            "Té", "Café"};
        int op2 = JOptionPane.showOptionDialog(null, "¿De qué producto quiere ver el precio?", "Productos",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
                null, opciones2, opciones2);
        return op2;
    }

    /**
     * Pantalla que te dice le precio del té.
     */
    public void cPrecioTe() {
        JOptionPane.showMessageDialog(null, "El precio del té es 1,15 centímos");
    }

    /**
     * Pantalla que te dice el precio del chocolate.
     */
    public void cPrecioChocolate() {
        JOptionPane.showMessageDialog(null, "El precio del chocolate es 1,25 centímos");
    }

    /**
     * Pantalla que te dice el precio del café.
     */
    public void cPrecioCafe() {

        JOptionPane.showMessageDialog(null, "El precio del café es 1,05 centímos");
    }

    /**
     * Pantalla que te pregunta el producto que quieres escoger.
     *
     * @return op3 es el producto que escogió el usuario.
     */
    public int dEscogerProducto() {
        String[] opciones3 = {"Chocolate",
            "Té", "Café"};
        int op3 = JOptionPane.showOptionDialog(null, "¿Qué producto quieres comprar?", "Escoge un producto",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
                null, opciones3, opciones3);
        posicionProducto = op3;
        return op3;
    }

    /**
     * Método para guardar el producto escogido por el usuario.
     *
     * @return posicionProducto es el producto escogido por el usuario.
     */
    public int recogerProducto() {
        return posicionProducto;
    }

    /**
     * Pantalla que te pregunta si quieres interactuar con el azúcar.
     *
     * @return op4 es la opción escogida por el usuario.
     */
    public int dAzucar() {
        String[] opciones4 = {"Añadir azúcar",
            "Sacar Azúcar", "Dejar el azúcar así"};
        int op4 = JOptionPane.showOptionDialog(null, "¿Quiere añadir o sacar azúcar a su bebida?", "Añadir o sacar azaúcar",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
                null, opciones4, opciones4[0]);
        return op4;
    }

    /**
     * Pantalla que te dice que le sacaste azúcar a la bebida.
     */
    public void menosAzucar() {
        JOptionPane.showMessageDialog(null, "Usted ha sacado azúcar");
    }

    /**
     * Pantalla que te dice que le echaste más azúcar a la bebida.
     */
    public void masAzucar() {
        JOptionPane.showMessageDialog(null, "Usted ha echado más azúcar");
    }

    /**
     * Pantalla que te dice que dejaste el azúcar como está.
     */
    public void igualAzucar() {
        JOptionPane.showMessageDialog(null, "Usted ha dejado el azúcar como está");
    }

    /**
     * Pantalla que te dice que se está elaborando el producto.
     */
    public void elaborandoProducto() {
        JOptionPane.showMessageDialog(null, "Se está elaborando el producto, en nada recibirá su cambio");
    }

    /**
     * Pantalla que te dice el cambio que se devolvió.
     */
    public void dDevolverCambio() {
        float elCambio = Monedero.cambio;
        JOptionPane.showMessageDialog(null, "Su cambio es de " + elCambio);
    }
}
