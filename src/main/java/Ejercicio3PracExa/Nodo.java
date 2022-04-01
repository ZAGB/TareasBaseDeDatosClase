/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3PracExa;

/**
 *
 * @author zujeily
 */
public class Nodo {
    
    private Carro estado;
    private Nodo next;
    private Nodo back;

    public Nodo(Carro estado) {
        this.estado = estado;
    }
    
   
    public Carro getEstado() {
        return estado;
    }

    public void setEstado(Carro estado) {
        this.estado = estado;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }

    public Nodo getBack() {
        return back;
    }

    public void setBack(Nodo back) {
        this.back = back;
    }
    
 

    @Override
    public String toString() {
        return "Nodo{" + "estado=" + estado + '}';
    }

    

   
    
    
    
    
    
    
    
}
