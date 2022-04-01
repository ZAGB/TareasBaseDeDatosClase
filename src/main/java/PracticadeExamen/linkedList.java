/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticadeExamen;

/**
 *
 * @author zujeily
 */
public class linkedList {
    
  
    private nodeExamen2 start;

    public linkedList() {
        
    }

 public void insertar (dato p, int index){
        
       if(start==null){
           
           start = new nodeExamen2(p);
          
           
       }
 
       else if (start.getInfo().getIndex()>=index){
            nodeExamen2 aux = new nodeExamen2(p);
            aux.setNext(start);
            start=aux;
			
			
        }else if(start.getInfo().getIndex()<p.getIndex()&& start.getNext()==null){
            nodeExamen2 aux = new nodeExamen2(p);
            start.setNext(aux);
        }else{
            nodeExamen2 aux=start;
            while(aux.getNext()!=null && aux.getNext().getInfo().getIndex()<p.getIndex()){
                    aux=aux.getNext();
                }
                nodeExamen2 Temp = new nodeExamen2(p);
                Temp.setNext(aux.getNext());
                aux.setNext(Temp);
        }
    }

     
 public void imprimirLista(){
        
        nodeExamen2 aux=start;
        
        while(aux!=null){
              System.out.println(aux.getInfo().toString());
              
              aux=aux.getNext();
            
        }
        
    }
 
 
 
 /*public void  Busca(String Nombre){
   
       
        nodeExamen2 temp =start;
         nodeExamen2 aux =start;
        
        
        while(temp.getNext()!=null){
 
            if (temp.getNext().getInfo().getInform()==Nombre && Nombre != start.getInfo().getInform()){

            
              System.out.println(temp.getInfo().toString());
              
              temp=temp.getNext();
            
        }else{ 
            
            

                System.out.println("No hay nada detras de"  +temp.getInfo().toString());
                
                 temp=temp.getNext();
            
            
        }
        

}
 

}*/
 
 
 
 public String BuscaNombre (int index){
     
         nodeExamen2 temp =start;
         nodeExamen2 aux =start;
         nodeExamen2 aux2 =start;
         aux=temp;

     while ( temp!=null){
         
         
     if(index!=temp.getInfo().getIndex()){
         
          

         
         aux2=temp;
         temp=temp.getNext();
         
         


         }else if(aux.getInfo().getIndex()==index){
         
         
         
          System.out.println("no hay datos atras");
         
         System.out.println("Adelante   "  +temp.getNext().getInfo().toString());
         
         aux2=temp;
         temp=temp.getNext();
         
        

          }else if(temp.getNext()==null&& temp.getInfo().getIndex()==index ){
              
              
           System.out.println("Adelante no hay nada");
         
           System.out.println("Atras  "  +aux2.getInfo().toString()); 
            
         temp=temp.getNext();   
     
 
      
         }else if (temp.getInfo().getIndex()==index || temp.getNext().getInfo().getIndex()==index &&temp.getNext()!=null){
         
       
         
         System.out.println("Atras  "  +aux2.getInfo().toString());
         
         System.out.println("Adelante  "  +temp.getNext().getInfo().toString());
         
         aux2=temp;
         temp=temp.getNext();
 
        
  
     
          }
     }
     
     String valor= String.valueOf(index);    
      return valor;  
     
}
}