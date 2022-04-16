/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaElaCircular;

/**
 *
 * @author zujeily
 */
public class Dato {
    
    
    private int numero;

    @Override
    public String toString() {
        return "Dato{" + "numero=" + numero + '}';
    }

    public Dato() {
    }
    
    public Dato(int numero) {
        this.numero = numero;
    }
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    
    
    
    
}
