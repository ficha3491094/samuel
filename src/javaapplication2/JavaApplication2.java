//Solicitar un número entero N y generar su tabla de multiplicar del 1 al 10 utilizando un ciclo fijo.
//Al finalizar, mostrar cuántos de los resultados obtenidos son números pares.
package javaapplication2;

import javax.swing.JOptionPane;


public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
    int numero;
    int resultado,cantidadNumero=0;
    
    numero=Integer.parseInt(JOptionPane.showInputDialog("Digite el numero: "));
    
    for (int i = 1; i <= 10 ; i++){
        
     resultado=i*numero; 
        System.out.println(numero+"x"+i+"="+resultado);
        
        if (resultado % 2 == 0) {
            
         cantidadNumero++;   
         
         
        } 
        
             
    }
    JOptionPane.showMessageDialog(null,"cantidad de  numeros pares: "+cantidadNumero);
    }
  
    }
     
    
    
    
    

