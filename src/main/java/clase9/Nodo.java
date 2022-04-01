/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase9;

/**
 *
 * @author zujeily
 */
public class Nodo {
    
    
    private Persona persona;
    private Nodo next;
    private Nodo back;

    public Nodo(Persona persona) {
        this.persona = persona;
      
    }
    

    @Override
    public String toString() {
        return "Nodo{" + "persona=" + persona + ", next=" + next + ", back=" + back + '}';
    }


    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
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
    
    
    
    
}
