/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3PracExa;

/**
 *
 * @author zujeily
 */
public class Carro {
    
    private String marca; 
    private String estadoUs;

    public Carro(String marca, String estadoUs) {
        this.marca = marca;
        this.estadoUs = estadoUs;
    }

    public Carro() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getEstadoUs() {
        return estadoUs;
    }

    public void setEstadoUs(String estadoUs) {
        this.estadoUs = estadoUs;
    }

    @Override
    public String toString() {
        return "Carro{" + "marca=" + marca + ", estadoUs=" + estadoUs + '}';
    }
    
  
    
    
    
}
