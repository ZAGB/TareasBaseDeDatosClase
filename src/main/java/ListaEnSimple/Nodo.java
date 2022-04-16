/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaEnSimple;

/**
 *
 * @author zujeily
 */
public class Nodo {
    
    private Persona NombreN;
    private Nodo next;

    public Nodo(Persona NombreN) {
        this.NombreN = NombreN;
        
    }

    public Persona getNombreN() {
        return NombreN;
    }

    public void setNombreN(Persona NombreN) {
        this.NombreN = NombreN;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Nodo{" + "NombreN=" + NombreN + ", next=" + next + '}';
    }

   
    
    
    
    
}
