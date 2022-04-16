/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListEnlaCircularDoble;

/**
 *
 * @author zujeily
 */
public class list {
    
    
     public Nodo head;
     public Nodo tail;
    
    
    
    public void inserta (Dato nombre){
     
     // no existe ningun otro elemento
     if(tail==null){
     
         tail = new Nodo(nombre);
         head=tail;
         tail.setNext(head);
         head.setBack(tail );
         
       
         
     }else if (tail.getNombre().getNombre()==head.getNombre().getNombre()){
         
         Nodo aux = tail;
         tail = new Nodo(nombre);
         aux.setNext(tail);
         tail.setNext(head);
         head.setBack(tail );
       
  
         
     }else{
         
         Nodo aux = new Nodo (nombre);
         aux.setBack(tail);
         tail.setNext(aux);
         tail = tail.getNext();
         tail.setNext(head);
         head.setBack(tail);
         
                   System.out.println("ultimo " +tail.getNombre().getNombre().toString());
         
         
     }
     
 }
    
    
    
     @Override
    public String toString() {
        Nodo aux =tail.getBack();
       
        
        String contenido = "Lista: ";
        
        
        if(aux==null){
            
            contenido+="esta vacia";
            
        }
        else{
           //Para imprimir el rabo 
           contenido+= aux +" , \n";
           aux = aux.getBack();
           
           //Imprime todos los demas
           
         while (aux!= head){
            
              contenido+= aux +" ,\n";
              aux = aux.getNext();
             
         }   
            
            
        }
       return contenido; 
        
    }
    
    
    
    
    
    
    
    
}
