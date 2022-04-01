/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase8;

/**
 *
 * @author zujeily
 * practica en clase de listas circulares
 */
public class Lista {
    
    private Nodo cabeza;
    private Nodo ultimo;
    
    
    
    public void inserta (Persona persona){
        //Cuando la lista esta vacia inserta lo primero
        
       if(cabeza== null){
           cabeza = new Nodo(persona);
           ultimo = cabeza;
           cabeza.setNext(cabeza);
           
       }
        //Inserta segun el orden del ID
       
       else if(persona.getId() < cabeza.getDato().getId()){
           
           Nodo aux= new Nodo(persona);
           aux.setNext(cabeza);
           ultimo.setNext(aux);
           cabeza=aux;
       }
       
       //Evalua si es mayor que el ultimo
       else if(ultimo.getDato().getId()<=persona.getId()){
           Nodo aux= new Nodo(persona);
           ultimo.setNext(aux);
           aux.setNext(cabeza);
           ultimo=aux;
           
           //version presentacion 
           //ultimo.setNext(new Node(persona));
           //ultimo  = ultimo.getNext();
           //ultimo.setNext(cabeza);
       }
       //Insertar en el medio
       else{
           
           Nodo aux= new Nodo(persona);
           Nodo temp= cabeza;
           
           while(temp.getNext().getDato().getId()<= persona.getId()){
           //Moverse al siguiente nodo
               temp=temp.getNext();
               
           }
               
           aux.setNext(temp.getNext());
           temp.setNext(aux);
           
           
           
       }
     ultimo.setNext(cabeza);   
       
    }
    
    
    public Persona extrae(int id){
        
       if(cabeza == null){
           
           return null;
           
       } 
       
          Nodo temp = cabeza;
         // Escenario si solo hay un elemento en la lista 
         
         if(cabeza.getNext()==cabeza){
             if(cabeza.getDato().getId()==id){
                 cabeza = null;
                 ultimo = null;
                 return temp.getDato();
                 
                 
             }
             
         }
         
         
         
        //Escenario si el id es la cabeza
        if(cabeza.getDato().getId()== id){
            cabeza = cabeza.getNext();
            temp.setNext(null);
            return temp.getDato();
        }
        
        while(temp.getNext().getDato().getId()!=id && temp.getNext()!=cabeza){
            temp=temp.getNext();
            
            
        }
        
        //sino encontro el id y llego a la cabeza
        //otra vez 
        
        if(temp.getNext()==cabeza){
            return null;
            
            
        }
        
        
        Nodo aux = temp.getNext();
        temp.setNext(aux.getNext());
        aux.setNext(null);
        
        //si estoy eliminando al ultimo elemento 
        //hay que mantener la referencia del "ultimo"
        if(aux==ultimo){
            
            ultimo=temp;
            
            
        }
        
        
        
        
        return aux.getDato();
        
        
    }
    
    

    @Override
    public String toString() {
        Nodo aux =cabeza;
        String contenido = "Lista: ";
        
        
        if(aux==null){
            
            contenido+="esta vacia";
            
        }
        else{
           //Para imprimir la cabeza 
           contenido+= aux +" , \n";
           aux = aux.getNext();
           
           //Imprime todos los demas
           
         while (aux!= cabeza){
            
              contenido+= aux +" ,\n";
              aux = aux.getNext();
             
         }   
            
            
        }
       return contenido; 
        
    }
            
            
           
    
    
}
