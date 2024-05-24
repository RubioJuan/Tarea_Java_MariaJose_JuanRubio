/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modularidad;

/**
 *
 * @author camper
 */
// Clase Libro
public class libro {
    private String titulo;
    private String autor;

    // Constructor
    public libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    // Métodos para obtener información del libro
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }
}

