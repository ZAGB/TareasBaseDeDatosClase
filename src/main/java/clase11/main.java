/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase11;

/**
 *
 * @author zujeily
 */
public class main {
    
    public static void main(String [] args) {
        
        
        Arbol AB =new Arbol();
        AB.insertar(50);
        AB.insertar(20);
        AB.insertar(80);
        AB.insertar(15);
        AB.insertar(30);
        AB.insertar(60);
        AB.insertar(40);
        AB.insertar(90);
        AB.insertar(75);
        AB.insertar(33);
        AB.insertar(82);
        //AB.inOrden();
       //AB.ImprimeMenor();
      //AB.ImprimeHojas();
      AB.ImprimeAltura();
}
}