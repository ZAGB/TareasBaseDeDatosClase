/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticadeExamen;

/**
 *
 * @author zujeily
 */
public class main {
    
   // static int arr []= {12,34,64,2,3};
    
    public static void main(String [] args){
     
        linkedList list= new linkedList ();
        
       //System.out.println(Problema1.invertir(125, 2));
        
       //System.out.println(Problema2.imprimir(palabra, 0));
       
     list.insertar(new dato("tulio",4),4);
      list.insertar(new dato("pollito",3),3);
      list.insertar(new dato("helena",2),2);
      list.insertar(new dato("Eve",1),1);
      list.insertar(new dato("Jose",5),5);
      list.imprimirLista();
      
      System.out.println("Buscar resultados");
      
    list.BuscaNombre(5);
    
     
     
     
     
     
     
    }
    
}
