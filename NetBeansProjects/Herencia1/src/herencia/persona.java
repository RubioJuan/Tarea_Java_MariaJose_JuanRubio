/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

/**
 *
 * @author camper
 */
public class persona {
    
    int id;
    String dni;
    String nombre;
    String apellido;
    String domicilio;
    int telefono;
    
    public persona(){
    }

    @Override
    public String toString() {
        return "persona{" + "id=" + id + ", dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", domicilio=" + domicilio + ", telefono=" + telefono + '}';
    }
    
    // Constructor con parametro
    public persona(int id, String dni,String nombre, String apellido, String domicilio, int telefono){
        this.id = id;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido; 
        this.domicilio = domicilio;
        this.telefono = telefono;
    }

    // Metodos
    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getDni(){
        return dni;
    }

    public void setDni(String dni){
        this.dni = dni;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getApellido(){
        return apellido;
    }

    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    
     public String getDomicilio(){
        return domicilio;
    }

    public void set(String domicilio){
        this.domicilio = domicilio;
    }
    
     public int getTelefono(){
        return telefono;
    }

    public void set(int telefono){
        this.telefono = telefono;
    }
}