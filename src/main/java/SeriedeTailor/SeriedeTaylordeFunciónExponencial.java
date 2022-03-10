/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SeriedeTailor;

/**
 *
 * @author zujeily
 */
public class SeriedeTaylordeFunciónExponencial  {
    
      
      
      
    public static double Ejercicio1recursividad (int num){
        
     
     if (num==0){
         
     
         return 1;
         
         
         } else {
                 
                 
                 
         return (num*Ejercicio1recursividad(num-1));
     
     }

    }
            
            
        public static double calExponencial(int n, int x, int i){
            
            
           
          
        if (i>n){
            
            return 0;
            
            
        } else {
            
       
           return (Math.pow(x,i)/Ejercicio1recursividad(i))+ calExponencial(n,x, i+1);
        }  
        
            
            
            
        }    
            
            
        
        
        
}
