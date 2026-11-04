package javaapplication2;

import javax.swing.JOptionPane;


public class JavaApplication2 {

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
    JOptionPane.showMessageDialog(null,"La cantidad de  numeros pares es: "+cantidadNumero);
    }
  
    }
     
    
    
    
    

