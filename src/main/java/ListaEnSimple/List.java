/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaEnSimple;

/**
 *
 * @author zujeily
 */
public class List {
    
    
    
     private Nodo start;

    public List() {
        
    }

 public void insertar (Persona Nombre){
        
       if(start==null){
           
           start = new Nodo(Nombre);
          
           
       }
 
       else {
            Nodo aux = new Nodo(Nombre);
            aux.setNext(start);
            start=aux;

		
            
            //Codigo para pasar todo a la derecha o abajo 
            /*Nodo aux = new Nodo(Nombre);
            aux.setNext(start);
            start=aux;*/
            
            
            
            
        }
    }

     
 public void imprimirLista(){
        
        Nodo aux=start;
        
        while(aux!=null){
              System.out.println(aux.getNombreN().toString());
              
              aux=aux.getNext();
            
        }
        
    }
 
 
 
 public String Busca(String Nombre){
   
       
        Nodo temp =start;
         Nodo aux =start;
        
        
        while(temp.getNext()!=null){
            
            
 
            
            if (temp.getNext().getNombreN().getNombre()== Nombre && Nombre != aux.getNombreN().getNombre()){

              System.out.println("Prueba1");
              
              System.out.println(temp.getNombreN().toString());
              
              temp=temp.getNext();
            
        }else if (temp.getNombreN().getNombre()== Nombre&& Nombre == aux.getNombreN().getNombre()){ 
            
            System.out.println("Prueba2");

                System.out.println("No hay nada detras de"  +temp.getNombreN().toString());
                
                 temp=temp.getNext();
            
            
        }else{
        
temp=temp.getNext();
}
 

}
   
 return Nombre;   
}
 
}
