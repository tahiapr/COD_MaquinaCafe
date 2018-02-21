/*
 * Ejercicio para clase de contornos.
 * Simulación de una máquina de café.
 * Segunda evaluación, primero de DAM.
 */
package maquinacafe;

/**
 *
 * @author sherlyn
 */
public class Producto {

    private float precio;
    public static int azucar = 3;

    /**
     * Constructor por defecto
     */
    public Producto() {
    }

    /**
     * Constructor con parámetros
     *
     * @param precio precio de la bebida
     */
    public Producto(float precio) {
        this.precio = precio;
    }

    /**
     * Para ver el precio de la bebida
     *
     * @return precio
     */
    public float getPrecio() {
        return precio;
    }

    /**
     * Para ver el precio del azúcar
     *
     * @return azucar
     */
    public static int getAzucar() {
        return azucar;
    }

    /**
     * Cambiar el precio de las bebidas
     *
     * @param precio
     */
    public void setPrecio(float precio) {
        this.precio = precio;
    }

    /**
     * Cambiar la cantidad del azúcar
     *
     * @param azucar
     */
    public static void setAzucar(int azucar) {
        Producto.azucar = azucar;
    }

    /**
     * Método toString para mostrar el precio
     *
     * @return un String con el precio
     */
    @Override
    public String toString() {
        return " su precio es " + precio + " €";
    }

}
