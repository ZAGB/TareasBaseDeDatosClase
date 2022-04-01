/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2PracExa;

/**
 *
 * @author zujeily
 */
public class Nodo {
    
    
    private Dato valorAl;
    private Nodo next;

    @Override
    public String toString() {
        return "Nodo{" + "valorAl=" + valorAl + '}';
    }

    public Nodo(Dato valorAl) {
        this.valorAl = valorAl;
       
    }

    public Dato getValorAl() {
        return valorAl;
    }

    public void setValorAl(Dato valorAl) {
        this.valorAl = valorAl;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
}
