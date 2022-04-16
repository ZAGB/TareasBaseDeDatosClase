/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaElaCircular;

/**
 *
 * @author zujeily
 */
public class list {
    
    
    
    private Nodo head;
    private Nodo tail;
    
    
     public void inserta (Dato numero){
         
         if(head ==null){
         
             head = new Nodo(numero);
             tail = head;
             head.setNext(head);

             
             
         }else if(numero.getNumero()<head.getDato().getNumero()){
             
             Nodo temp = new Nodo(numero);
             temp.setNext(head);
             tail.setNext(temp);
             head=temp;
             
  
             
             
         }else if(numero.getNumero()>tail.getDato().getNumero()){
             
             Nodo aux = new Nodo(numero);
             tail.setNext(aux);
             aux.setNext(head);
             tail=aux;
             
 
             
             
         }else{
             
             Nodo aux = new Nodo(numero);
             Nodo temp = head;
             
             while(temp.getNext().getDato().getNumero()<numero.getNumero()){
                 
                 temp = temp.getNext();
                 
             }
             
             aux.setNext(temp.getNext());
             temp.setNext(aux);
             
        
             
         }
         
          
     }

  
    @Override
    public String toString() {
        Nodo aux =head;
        String contenido = "Lista: ";
        
        
        if(aux==null){
            
            contenido+="esta vacia";
            
        }
        else{
           //Para imprimir la cabeza 
           contenido+= aux +" , \n";
           aux = aux.getNext();
           
           //Imprime todos los demas
           
         while (aux!= head){
            
              contenido+= aux +" ,\n";
              aux = aux.getNext();
             
         }   
            
            
        }
       return contenido; 
        
    }
    
    
  public void remove (int numero){

      Nodo temp = head;
       
      while (temp.getNext()!=tail){
          
          
         temp= temp.getNext();
          
      }

     
      
      if(tail.getDato().getNumero()==numero){
          
          System.out.println("Dato encontrado al final, suprimiendo");

      Nodo aux2 = temp.getNext();  
      temp.setNext(aux2.getNext());
      tail= temp;

      aux2.setNext(null);
      

      
      }else{
              
               System.out.println("Dato no encontrado en el nodo final");
              
              
              
              }
      
    
    
    
}
    
    
    
    
}

