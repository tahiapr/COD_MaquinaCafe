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
 *
 * @author sherlyn
 */
public class Display {

    public float dDinero() {
        float respuestaDinero = Float.parseFloat(JOptionPane.showInputDialog(null, "¿Cuánto dinero quiere ingresar?"));
        return respuestaDinero;
    }
    
    public void dDSaldo(){
        JOptionPane.showMessageDialog(null, "Su saldo ha sido devuelto correctamente");
       
    }
    
     public int dComprobarProducto(){
         String[] opciones2 = {"Chocolate", 
            "Té", "Café"};
        int op2 = JOptionPane.showOptionDialog(null, "¿De qué producto quiere ver el precio?", "Productos", 
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, 
                null , opciones2, opciones2);
         return op2;
     }
     
         public void cPrecioTe(){
       JOptionPane.showMessageDialog(null, "El precio del té es 1,15 centímos");
    }
    
    public void cPrecioChocolate(){
           JOptionPane.showMessageDialog(null, "El precio del chocolate es 1,25 centímos");
    }
    
    public void cPrecioCafe(){
        
           JOptionPane.showMessageDialog(null, "El precio del café es 1,05 centímos");
    }
    
     public int dEscogerProducto(){
         String[] opciones3 = {"Chocolate", 
            "Té", "Café"};
        int op3 = JOptionPane.showOptionDialog(null, "¿Qué producto quieres comprar?", "Escoge un producto", 
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, 
                null , opciones3, opciones3);
         return op3;
     }
     
     public int dAzucar(){
         String[] opciones4 = {"Añadir azúcar", 
            "Sacar Azúcar", "Dejar el azúcar así"};
         int op4 = JOptionPane.showOptionDialog(null, "¿Quiere añadir o sacar azúcar a su bebida?", "Añadir o sacar azaúcar", 
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, 
                null , opciones4, opciones4);
       
     return op4;}
     
     public void menosAzucar(){
         JOptionPane.showMessageDialog(null, "Usted ha sacado azúcar");
     }
     
     public void masAzucar(){
         JOptionPane.showMessageDialog(null, "Usted ha dejado el azúcar como está");
     }
     
     public void igualAzucar(){
         JOptionPane.showMessageDialog(null, "Usted ha sacado azúcar");
     }
     
     public void elaborandoProducto(){
         JOptionPane.showMessageDialog(null, "Se está elaborando el producto, en nada recibirá su cambio");
     }
}
