/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticadeExamen;

/**
 *
 * @author zujeily
 */
public class Problema2 {
    
    
    
    public static String imprimir(String palabra, int i){
        
        
        
        
        if(palabra.length()==i){
            
            return "";            
            
        }else{
        
        
        return palabra.charAt(i) + imprimir (palabra, i+1);
        
       
        
    }
    
    
}
  
     
     
     
     
}