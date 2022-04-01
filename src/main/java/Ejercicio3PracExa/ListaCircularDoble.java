/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3PracExa;

/**
 *
 * @author zujeily
 */
public class ListaCircularDoble {
    
    
     public Nodo head;
     public Nodo tail;
    
    
    
    public void inserta (Carro estado){
     
     // no existe ningun otro elemento
     if(head==null && estado.getEstadoUs()=="nuevo"){
     
         head = new Nodo(estado);
         tail =head;
         tail.setNext(head);
         head.setBack(tail );
         
         
     }else if(head==null && estado.getEstadoUs()=="viejo"){
     
         tail = new Nodo(estado);
         head=tail;
         tail.setNext(head);
         head.setBack(tail );     
         
      
     // Si existe un elemento al menos y se desea 
     //insetar un elemento al nodo
     }else if (estado.getEstadoUs()=="nuevo"){
         Nodo aux = new Nodo (estado);
         aux.setNext(head);
         head.setBack(aux);
         head=aux;
         tail.setNext(head);
         head.setBack(tail);
         
         
         
     }else if(estado.getEstadoUs()=="viejo"){
         Nodo aux = new Nodo (estado);
         aux.setBack(tail);
         tail.setNext(aux);
         tail = tail.getNext();
         tail.setNext(head);
         head.setBack(tail);
         
     }
     else{
       Nodo aux = head;
       while(aux.getNext().getEstado().getEstadoUs()=="nuevo"){
           
           aux=aux.getNext();
           
           
       }
         
       
       Nodo temp = new Nodo (estado);
       temp.setNext(aux.getNext());
       temp.setBack(aux);
       temp.getNext().setBack(temp);
       aux.setNext(temp);
       
       
       
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
    
    
    
    
    
}
