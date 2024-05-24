/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sobrecarga;

public abstract class animal {
    private int idAnimal;
    private String descripcion;

    public abstract void hacerSonido();

    // Ejemplos de sobrecarga de métodos hacerSonido
    public void hacerSonido(String nombreAnimal) {
        System.out.println("Mi " + nombreAnimal + " hace un sonido");
    }

    public void hacerSonido(String nombreAnimal, String tipoSonido) {
        System.out.println("Mi " + nombreAnimal + " hace un sonido: " + tipoSonido);
    }
}
