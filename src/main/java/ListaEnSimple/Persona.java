/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaEnSimple;

/**
 *
 * @author zujeily
 */
public class Persona {
    
    private String Nombre;

    @Override
    public String toString() {
        return "Persona{" + "Nombre=" + Nombre + '}';
    }

    public Persona() {
    }

    public Persona(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    
    
    
    
    
    
    
}
