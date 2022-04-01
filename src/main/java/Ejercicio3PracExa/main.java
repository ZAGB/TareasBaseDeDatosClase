/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3PracExa;

/**
 *
 * @author zujeily
 */
public class main {
    
    public static void main(String [] args){
        
        
        
        ListaCircularDoble list = new ListaCircularDoble();
        
        list.inserta(new Carro("Mazda","viejo"));
        list.inserta(new Carro("Toyota","nuevo"));
        list.inserta(new Carro("Ferrari","viejo"));
        list.inserta(new Carro("Mercedes","nuevo"));
        list.inserta(new Carro("Toyota","viejo"));
        
        System.out.println(list);
        
        
}
    
    
    
}
