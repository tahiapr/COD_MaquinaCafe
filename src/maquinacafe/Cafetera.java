/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maquinacafe;

import javax.swing.JOptionPane;

/**
 *
 * @author sherlyn
 */
public class Cafetera {
    
     public float Te(){
    float dineroTe = 1.15f;
    Producto.getAzucar();
    return dineroTe;
     }
    
    public float Chocolate(){
           float dineroCho = 1.25f;
           Producto.getAzucar();
    return dineroCho;
    }
    
    public float Cafe(){
      float dineroCa = 1.05f;
      Producto.getAzucar();
    return dineroCa;
    }
}
