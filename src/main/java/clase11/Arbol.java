/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase11;

/**
 *
 * @author zujeily
 */
public class Arbol {
    
   private Nodo raiz;
   int count;
   
   public void insertar(int value){
      
       if (raiz==null){
           
           raiz= new Nodo(value);
       }else{
       
       insertar(raiz,value);
       
       
       }   
}
 
   
   public void insertar (Nodo nodo, int value){
       
       
   
       if(value<nodo.getId()){
       if(nodo.getHijoIzq()==null){
          nodo.setHijoIzq(new Nodo (value));
           
           
       }else{
           
           insertar(nodo.getHijoIzq(), value);
       }     
       }else {
    
    if(nodo.getHijoDer()==null){
        nodo.setHijoDer(new Nodo(value));
        
        
    }else{
        insertar(nodo.getHijoDer(),value);
        
        
    }
    
    
    
    
}
   
}
   
 public void inOrden(){
     
     if(raiz!=null){
         
         inOrdenRecorrer (raiz);
         
     }else{
         
         
         System.out.println("Arbol esta vacio");
         
     }
     
     
 }  
   
 private void inOrdenRecorrer(Nodo nodo){
     
    
     
     if(nodo != null){
         System.out.println("mi nodo recursivo es "+nodo.getId());
         inOrdenRecorrer(nodo.getHijoIzq());
         System.out.println(nodo.getId());
         
         System.out.println("mi nodo recursivo derecha "+nodo.getId());
         inOrdenRecorrer(nodo.getHijoDer());
     }
     
 }
 
 
  public void ImprimeMenor(){
     
     if(raiz!=null){
         
         ImprimeMenor (raiz);
         
     }else{
         
         
         System.out.println("Arbol esta vacio");
         
     }
     
     
 }  
private void ImprimeMenor(Nodo nodo){
 
  if(nodo.getHijoIzq() != null){  

    ImprimeMenor(nodo.getHijoIzq());
    

 
}else{
    
    System.out.println("Dato "+nodo.getId()); 
    
}
}

 public void ImprimeHojas(){
     
     if(raiz!=null){
         
         ImprimeHojas (raiz);
         
     }else{
         
         
         System.out.println("Arbol esta vacio");
         
     }
     
     
 }

  //Revisar esto
  public void ImprimeHojas (Nodo nodo){
      
      if(nodo!=null){
        
        ImprimeMenor(nodo.getHijoIzq());  
        ImprimeMenor(nodo.getHijoDer()); 
          
         if(nodo.getHijoDer()==null|| nodo.getHijoIzq()==null)  
          
        System.out.println("Arbol hoja izquierdo"  + nodo.getHijoIzq().getId());
        System.out.println("Arbol hoja izquierdo"  + nodo.getHijoDer().getId());
          
      }
      
      
  }
  public void ImprimeAltura(){
     
     if(raiz!=null){
         
         ImprimeAltura (raiz);
         
     }else{
         
         
         System.out.println("No hay altura");
         
     }
     
     
 }
  
  
  
  private void ImprimeAltura(Nodo nodo){

      
      
     if(nodo!= null){
         
         ImprimeAltura(nodo.getHijoIzq());
         
         ImprimeAltura(nodo.getHijoDer());
         
         count++;
    
     }else {
      
       System.out.println("Nivel "+count);  
       
         
     }
  
  
 
}
}