/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstracción;

/**
 *
 * @author camper
 */
abstract class animal {
    // Método abstracto
    abstract void hacerSonido();
}

// Clase Perro que extiende de Animal
class Perro extends animal {
    // Implementación del método abstracto hacerSonido
    @Override
    void hacerSonido() {
        System.out.println("El perro hace: Guau Guau");
    }
}
