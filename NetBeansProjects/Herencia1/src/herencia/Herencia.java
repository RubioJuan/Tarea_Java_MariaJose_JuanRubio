/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herencia;

/**
 *
 * @author camper
 */
public class Herencia {

    public static void main(String[] args){
        
        persona pedrosky = new persona(123, "Pedro Forever", "felipe", "rubio", "juan", 1234);
        System.out.println(pedrosky);
        
        empleado emple = new empleado(1146334004, "Gerente", 50.000, 123, "sapa", "felipe", "rubio", "juan", 1234);
        System.out.println(emple);
        
        consultor consul = new consultor("Aleja", 123, 123, "sapa", "felipe", "rubio", "juan", 1234);
        System.out.println(consul);

    }
    
}
