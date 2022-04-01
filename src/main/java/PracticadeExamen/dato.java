/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticadeExamen;

/**
 *
 * @author zujeily
 */
public class dato {

    
    private String inform;
    private int index;
    
    
    public dato() {
    } 

    public dato(String inform,int index) {
        this.inform = inform;
        this.index = index;
        
    }

    public String getInform() {
        return inform;
    }

    public void setInform(String inform) {
        this.inform = inform;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public String toString() {
        return "dato{" + "inform=" + inform + ", index=" + index + '}';
    }

    
   

  
   

  
    
}
