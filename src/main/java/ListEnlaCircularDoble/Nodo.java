/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListEnlaCircularDoble;

/**
 *
 * @author zujeily
 */
public class Nodo {
    
    private Dato nombre;
    private Nodo next;
    private Nodo back;

    public Nodo(Dato nombre) {
        this.nombre = nombre;
    }

    public Dato getNombre() {
        return nombre;
    }

    public void setNombre(Dato nombre) {
        this.nombre = nombre;
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
        return "Nodo{" + "nombre=" + nombre + '}';
    }
    
    
    
    
    
}
