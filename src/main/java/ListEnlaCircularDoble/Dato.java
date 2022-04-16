/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListEnlaCircularDoble;

/**
 *
 * @author zujeily
 */
public class Dato {
    
    private String Nombre; 

    public Dato(String Nombre) {
        this.Nombre = Nombre;
    }

    public Dato() {
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    @Override
    public String toString() {
        return "Dato{" + "Nombre=" + Nombre + '}';
    }
  
        
}
