/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaEnSimple;

/**
 *
 * @author zujeily
 */
public class main {
    
    
     public static void main(String [] args){
         
         List lista = new List();
         
        lista.insertar(new Persona("Marcelo"));
        lista.insertar(new Persona("Eduardo")); 
        lista.insertar(new Persona("Cain")); 
        lista.insertar(new Persona("Esteban")); 
         
       lista.imprimirLista();
         
       System.out.println("Prueba de metodo Busca");
         
       lista.Busca("Marcelo");
         
         
         
         
     }
    
    
}
