/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase1;

/**
 *
 * @author zujeily
 */
public class stack {
        
 /// nodo inicial 
        private node top; 
        private int lenght;
        
        public void Pilas(){
            
            
            top= null;
            lenght=0;
           
            
        }
        
        
       public boolean isEmpty(){
           
           if(top==null){
                System.out.println("La pila se encuentra vacia");
               return true;
               
           }else{
             
                return false;
               
           } 
           
       } 
       
       public int getLenght(){
           
           return lenght;
           
       }
    
       /**
        * Metodo ingresa un valor al inicio/top de nuestro stack o pila 
        * @param value = valor a agregar a nuestra pila  
        */
       
       public void push(int value){
           
         node newNode = new node (); 
         
           newNode.setValue(value);
           
              // verifica si la lista esta vacia
           if (isEmpty()){    
               //Inizializa la pila con el newNode
               
               top=newNode;
              System.out.println("Se agrego nuestro nuevo nodo a la pila");
              System.out.println(top.getValue());
               
           } else{
               //si no esta vacia, nuestro nuevo nodo, hace referencia al que este en 
               //el top en ese momento
              //setNext es un puntero a el nodo anterior 
              System.out.println("El top anterior fue :");
              System.out.println(top.getValue());
              newNode.setNext(top);
              
              
              //hacer referencia que start ahora es newNode 
              //nuestro start/top ahora es el nuevo nodo
               
              top=newNode;
              System.out.println("Se agrego nuestro nuevo nodo a la pila");
              System.out.println(top.getValue());
           }

            //lenght++ == lenght=lenght+1
           lenght++;
           
       }
  
       public void pop(){
           
if(isEmpty()){
    
    System.out.println("Para continuar agrega un nuevo nodo");
    
}           
else{
    System.out.println("Se quito el top de la pila en ese momento que es:");         
    System.out.println(top.getValue());
    
    //Asigna como primer elemento, al siguiente de la pila
    top= top.getNext();
    
    
    
    System.out.println("El nuevo Top es: ");  
    System.out.println(top.getValue());  
    lenght--; 
    
}
               
       
}



}
       
    

