/*
 * Ejercicio para clase de contornos.
 * Simulación de una máquina de café.
 * Segunda evaluación, primero de DAM.
 */
package maquinacafe;

import javax.swing.JOptionPane;

/**
 * Programa de una cafetera que tendrá cuatro clases. 
 * Botonera: que se corresponde a los botones que puede pulsar el usuario. 
 * Display: los mensajes que se mandan desde pantalla. 
 * Monedero: que contendrá las operaciones lógicas. 
 * Producto: vendrán definidos los productos que tendrá la cafetera.
 *
 * @author tperezrodriguez
 */
public class MaquinaCafe {

    /**
     * Clase principal del programa. Contendrá un menú con las primeras 
     * opciones que tiene la cafetera.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Display d = new Display();
        Monedero m = new Monedero();
        Botonera b = new Botonera();

        /**
         * Instanciamos un icono de una máquina de café para usar en el
         * JOptionPane y después creamos un Array con las opciones que contendrá
         * el JOptionPane. Después configuramos el JOptionPane con las opciones
         * que queremos y por último creamos un swith que llamará a los métodos
         * que inician la cafetera.
         */
        
        String[] opciones = {"Salir de la máquina de café", 
            "Comprobar producto", "Ingresar dinero", "Devolver saldo"};
        int op = JOptionPane.showOptionDialog(null, "¿Qué es lo que desea hacer"
                + " con la máquina de café?", "Máquina de café", 
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, 
                null, opciones, opciones[1]);

        switch (op) {
            case 0:
                System.exit(0);
                break;
            case 1:
                b.comprobarPrecios(d.dComprobarProducto());
                m.ingresarDinero(d.dDinero());
                b.escogerProducto(d.dEscogerProducto());
                  //validar saldo
                b.añadirAzucar(d.dAzucar());
                d.elaborandoProducto();
                m.devolverCambio();
                break;
            case 2:
                m.ingresarDinero(d.dDinero());
                b.escogerProducto(d.dEscogerProducto());
                //validar saldo
               b.añadirAzucar(d.dAzucar());
               d.elaborandoProducto();
                m.devolverCambio();
                break;
            case 3:
                m.devolverSaldo();
                d.dDSaldo();
                break;

        }
    }

}
