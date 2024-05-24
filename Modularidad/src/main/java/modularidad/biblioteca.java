/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modularidad;

/**
 *
 * @author camper
 */
import java.util.ArrayList;

// Clase Biblioteca
public class biblioteca {
    private ArrayList<libro> libros;

    // Constructor
    public biblioteca() {
        this.libros = new ArrayList<>();
    }

    // Método para agregar un libro a la biblioteca
    public void agregarLibro(libro libro) {
        libros.add(libro);
    }

    // Método para mostrar todos los libros en la biblioteca
    public void mostrarLibros() {
        for (libro libro : libros) {
            System.out.println("Título: " + libro.getTitulo() + ", Autor: " + libro.getAutor());
        }
    }
}
