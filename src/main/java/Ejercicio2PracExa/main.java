/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2PracExa;

/**
 *
 * @author zujeily
 */
public class main {
    
    public static void main(String [] args){
    
    ListaSimpleCircular list = new ListaSimpleCircular();
    
    
    list.inserta(new Dato(1));
    list.inserta(new Dato(7));
    list.inserta(new Dato(8));
    list.inserta(new Dato(3));

    System.out.println(list);
    
    
     System.out.println("test remover ");
    
    
    list.remove(new Dato (6));
    
    
     System.out.println(list);
    
    
}
        
}
