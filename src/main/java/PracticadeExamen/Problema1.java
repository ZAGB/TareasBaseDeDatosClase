/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticadeExamen;

/**
 *
 * @author zujeily
 */
public class Problema1 {
    
  
    
    public static int  invertir (int num, int i){
        
 
       if(num< 10){
           
           return num;
           
       }else{
           
      
       return (num % 10) * (int) Math.pow(10, i) + (invertir(num/10, i-1));
        
        
    }
    
    
    
}
}