/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sobrecarga;

public class SobreCarga {

    public static void main(String[] args) {
        perro miPerro = new perro();

        animal miAnimal = miPerro;  // Polimorfismo, miAnimal es de tipo animal pero referencia un perro
        miAnimal.hacerSonido();  // Llama al método sobrescrito en la clase perro
        
        // Ejemplos de sobrecarga de métodos en la clase base animal
        miAnimal.hacerSonido("Perro");
        miAnimal.hacerSonido("Perro", "ladrido");
    }
}
