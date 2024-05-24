/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package modularidad;

/**
 *
 * @author camper
 */
public class Modularidad {

     public static void main(String[] args) {
        // Crear instancia de Biblioteca
        biblioteca miBiblioteca = new biblioteca();

        // Crear algunos libros
        libro libro1 = new libro("Cien Años de Soledad", "Gabriel García Márquez");
        libro libro2 = new libro("Don Quijote de la Mancha", "Miguel de Cervantes");

        // Agregar libros a la biblioteca
        miBiblioteca.agregarLibro(libro1);
        miBiblioteca.agregarLibro(libro2);

        // Mostrar todos los libros en la biblioteca
        miBiblioteca.mostrarLibros();
    }
}
