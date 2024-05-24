/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polimorfismo;


/**
 *
 * @author camper
 */
public class Polimorfismo {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args){
       // en una clase padre permire guardar informacion de clases hijas ejemplo: perso = consul;
       
       persona vector [] = new persona [5];
       vector [0] = new persona ();
       vector [1] = new empleado ();
       vector [2] = new consultor ();
       vector [3] = new jefe ();

       persona perso = new persona();
       consultor consul = new consultor();
       
       perso = consul;
       //consul = perso;
    }
    
}

