/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase1;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author zujeily
 */


public class PracticaRecursividad {
    
    //static int array[]={12,24,5,7,9}; 
    static int sum=0; 

    
    public static int pedir (int array [], int tamaño, int i){
        
        
        // EL i SE COMPARA POR APARTE DEL ARRAY 
        
        if (i == tamaño) {
              
           return sum;
      
              
          }

        
        if (i< tamaño) {
        
        // array[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del primer numero natural "+(i+1)));
         

        sum += array [i]; 
        
        
        //si se cumple la condicion entra por lo tanto necesita devolver algo, tons ocupa un RETURN
        
        return pedir (array,tamaño,1+i);
        
        
        
        
        }
        
          
           
         
    else{ 
            
            return pedir (array,tamaño,1+i);
            
            
        } 
            

    
}
}