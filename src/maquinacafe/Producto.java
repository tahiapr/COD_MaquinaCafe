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

    public Producto() {
    }

    public Producto(String tipo, float precio) {
        this.precio = precio;
    }


    public float getPrecio() {
        return precio;
    }

    public static int getAzucar() {
        return azucar;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public static void setAzucar(int azucar) {
        Producto.azucar = azucar;
    }

    @Override
    public String toString() {
        return " su precio es " + precio +" €";
    }

    
}
