/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase1;

/**
 *
 * @author zujeily
 */
public class queue {
    
    //Declaracion de las variables
    
    private node head;
    private node tail;
    
    //Constructor sin paramentros
    
    public queue(){
        
        // estan nulos porque no apuntan a nadie
        
        head = null;
        tail = null;
        
    }
    
    //Metodo para insertar datos
    
    public void insertar (int dato){
        
        node newNode = new node();
        newNode.setValue(dato);
        newNode.setNext(null);
        
        //Porque es nuestro primer elemento en la cola 
        
        if(head == null & tail == null){
            
            head = newNode;
            tail = newNode;
            
            
        }
        
        System.out.println("El valor anterior del tail es:");
        System.out.println(tail.getValue());

        
        // aca hago referencia que va a cambiar a newNode
        tail.setNext(newNode);
        
        // aca hizo el cambio de la cola 
        tail = newNode;
        
        System.out.println("El valor actual del tail es:");
        System.out.println(tail.getValue());

        
    }
    
    
    //Metodo extraer dato
    
    public void extraer (){
        
        System.out.println("El valor actual del head es:");
        System.out.println(head.getValue());

        int dato= head.getValue();
        
        //aca dice reafirmo que mi cabeza va a cambiar una vez que termine con la primera
        head = head.getNext();
        
        System.out.println("El valor actual del head es:");
        System.out.println(head.getValue());
        
       
        
    }
   
    
    //Metodo para comprobar que la cola no esta vacia 
    public boolean isEmpty(){
        boolean cola = false;
        
        if(head == null & tail == null ){
            
            
            
        // COLA es una variable aca que dice cuanto queda pendiente en el queue
            cola = true;
            
            System.out.println("La cola esta vacia:");
            
        }else{
            
            System.out.println("La no cola esta vacia:");
            
          cola = false;  
            
        }
        
        return cola;
    }
   
    
    public int lenght (){
           
   int resultado = 0;        
           
   
   node c= this.head;
   
   if(isEmpty()){
      return resultado;
               
               
   }
   
    while (c != null){
    
        resultado++;
        c = head.getNext();
    
    }
    
    return resultado;
}        
            
    
}
