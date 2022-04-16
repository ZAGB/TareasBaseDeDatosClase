/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaElaCircular;

/**
 *
 * @author zujeily
 */
public class main {
    
    public static void main(String [] args){
        
        
        list l = new list();
        
        l.inserta(new Dato(1));
        l.inserta(new Dato(2));
        l.inserta(new Dato(6));
        l.inserta(new Dato(5));
        l.inserta(new Dato(8));
        l.inserta(new Dato(7));
        
        
        System.out.println(l);

        l.remove(8);
        
        System.out.println(l);

        
        
    }
    
    
    
    
}
