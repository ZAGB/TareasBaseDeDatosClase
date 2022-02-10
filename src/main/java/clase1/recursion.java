/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase1;

/**
 *
 * @author zujeily
 */
public class recursion {
    
     static int arr []= {12,34,64,2,3};
             
    public static int  factorial (int n) {
    
        
  if(n==0){
      return 1;
      
  } else{
          
         return(n*factorial(n-1));
                 
      /*el metodo recursivo debe tener 
      *Condicion de parada /base, que nos permita devolver un valor
      *Una llamada a si misma 
       */     
        
    }
}
    
    /*
    El primer If no sirve
    tiene que detener el metodo y hacer una comparacion entre i y f
    
    */
    
    
 public static int  BuscarElemento (int arr [], int i, int n, int f) {
     
     if(f<1){
         
         return -1;
             
         
     } if(arr[i]==n){

         return n;
         
         
     } if(arr[f]==n){

         return n;
     }
     
     else {
      
         return BuscarElemento (arr, 1+i,n,f-1);
         
     }
         
 }
    
    
}
