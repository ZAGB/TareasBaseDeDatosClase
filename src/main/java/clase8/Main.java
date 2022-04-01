/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase8;

/**
 *
 * @author zujeily
 */
public class Main {
    
  public static void main (String[] args) {
      
      Lista lista = new Lista();
      
      lista.inserta(new Persona (10, "Pedro"));
      lista.inserta(new Persona (5, "Ana"));
      lista.inserta(new Persona (20, "Catalina"));
      lista.inserta(new Persona (30, "Juan"));
      
      System.out.println(lista.toString());
      
  }
    
}
