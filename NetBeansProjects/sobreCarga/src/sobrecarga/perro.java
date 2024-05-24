/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sobrecarga;

public class perro extends animal {
    
    private String nombrePerro;
    private double peso;
    private String raza;  // Corregido tipo de datos a String
    private String sexo;  // Corregido tipo de datos a String

    @Override
    public void hacerSonido() {
        System.out.println("Soy un perro y me gustan las galletas");
    }
}
