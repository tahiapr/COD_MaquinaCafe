/*
 * Ejercicio para clase de contornos.
 * Simulación de una máquina de café.
 * Segunda evaluación, primero de DAM.
 */
package maquinacafe;

import javax.swing.JOptionPane;

/**
 *
 * @author sherlyn
 */
public class Monedero {
    private float dinero;
    float dineroCa,  dineroTe,  dineroCho;
Producto p = new Producto();
    
    public float ingresarDinero(float respuestaDinero){
     dinero=dinero+respuestaDinero;
        return dinero;
        
    }
    
//    public void verdineroingresado(){
//        System.out.println(dinero);
//    }
    
    public void devolverSaldo(){
        dinero=0;
    }
    
    public void validarSaldo(float respuestaDinero, float dineroCa, float dineroTe, float dineroCho){
        if (respuestaDinero<dineroCa){
          JOptionPane.showInputDialog(null, "Saldo insuficiente, ingrese más dinero");
        } else if (respuestaDinero<dineroCho){
          JOptionPane.showInputDialog(null, "Saldo insuficiente, ingrese más dinero");
        } else if (respuestaDinero<dineroTe){
          JOptionPane.showInputDialog(null, "Saldo insuficiente, ingrese más dinero");
        } else {
            this.devolverCambio();
        }
        
    }
    
    public void devolverCambio(){
    }
}

