/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase9;

/**
 *
 * @author zujeily
 */
public class Lista {
    
    
 public Nodo cabeza;
 public Nodo ultimo;
 
 
 
    
 public void inserta (Persona persona){
     
     // no existe ningun otro elemento
     if(cabeza==null){
     
         cabeza = new Nodo(persona);
         ultimo =cabeza;
         ultimo.setNext(cabeza);
         cabeza.setBack(ultimo);
      
     // Si existe un elemento al menos y se desea 
     //insetar un elemento al nodo
     }else if (persona.getId()< cabeza.getPersona().getId()){
         Nodo aux = new Nodo (persona);
         aux.setNext(cabeza);
         cabeza.setBack(aux);
         cabeza=aux;
         ultimo.setNext(cabeza);
         cabeza.setBack(ultimo);
         
         
         
     }else if(persona.getId()<=cabeza.getPersona().getId()){
         Nodo aux = new Nodo (persona);
         aux.setBack(ultimo);
         ultimo.setNext(aux);
         ultimo = ultimo.getNext();
         ultimo.setNext(cabeza);
         cabeza.setBack(ultimo);
         
     }
     else{
       Nodo aux = cabeza;
       while(aux.getNext().getPersona().getId()<persona.getId()){
           
           aux=aux.getNext();
           
           
       }
         
       
       Nodo temp = new Nodo (persona);
       temp.setNext(aux.getNext());
       temp.setBack(aux);
       temp.getNext().setBack(temp);
       aux.setNext(temp);
       
       
       
     }
     
 }
 
 
 public boolean existe (int id){
     
     
     boolean esta = false;
     
     if(cabeza==null){
         return false;
         
     }else  if (id== cabeza.getPersona().getId()){
         
      return true;
         
     }else if (id==ultimo.getPersona().getId()){
         
      return true;
         
      
     }
     
    return esta; 
 }
 
    
}
