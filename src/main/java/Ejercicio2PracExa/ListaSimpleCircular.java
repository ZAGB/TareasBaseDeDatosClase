/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2PracExa;

/**
 *
 * @author zujeily
 */
public class ListaSimpleCircular {
    
    
    private Nodo head;
    private Nodo tail;
    
    
     public void inserta (Dato valor){
         
         if(head ==null){
         
             head = new Nodo(valor);
             tail = head;
             head.setNext(head);
             
         }else if(valor.getValor()<head.getValorAl().getValor()){
             
             Nodo temp = new Nodo(valor);
             temp.setNext(head);
             tail.setNext(temp);
             head=temp;
             
             
         }else if(valor.getValor()>head.getValorAl().getValor()){
             
             Nodo aux = new Nodo(valor);
             tail.setNext(aux);
             aux.setNext(head);
             tail=aux;
             
             
         }else{
             
             Nodo aux = new Nodo(valor);
             Nodo temp = head;
             
             while(temp.getNext().getValorAl().getValor()<valor.getValor()){
                 
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
    
    
  public void remove (Dato valor){
      
      Nodo aux = new Nodo(valor);
      Nodo temp = head;
      Nodo temp2 = null;
      
      
      if(head.getNext()==head){


             head = new Nodo(null);
             tail = head;
             head.setNext(head);
             System.out.println("No se inserta nada porque el valor es null");
                     
      
      }else if (head.getNext()!=head){
      
          
          
      while (temp.getNext()!=tail){
          
          
         temp= temp.getNext();
          
      }

    
      Nodo aux2 = temp.getNext();
      temp.setNext(aux2.getNext());
      tail= temp;
      aux2.setNext(null);
      
      tail.setNext(aux);
      aux.setNext(head);
      tail=aux;
    
      
      } 
    
    
    
    
}
}
