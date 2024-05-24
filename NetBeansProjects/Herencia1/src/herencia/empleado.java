/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

/**
 *
 * @author camper
 */
public class empleado extends persona{
 
    int num_documento;
    String cargo;
    Double sueldo;
    
    public empleado(){
    }

    @Override
    public String toString() {
        return "empleado{" + "numero de documento=" + num_documento + ", cargo=" + cargo + ", sueldo=" + sueldo + '}';
    }
    
        
    public empleado(int num_documento, String cargo, Double sueldo, int id, String dni, String nombre, String apellido, String domicilio, int telefono){
        // Super lo que hace es que recibe los datos que hay y llama a la clase madre 
        super (id, dni, nombre, apellido, domicilio, telefono);
        this.num_documento = num_documento;
        this. cargo = cargo;
        this.sueldo = sueldo;
    }
    
    public int getNum_documento(){
        return num_documento;
    }

    public void setNum_documento(int num_documento){
        this.num_documento = num_documento;
    }
    
    public String getCargo(){
        return cargo;
    }

    public void setCargo(String cargo){
        this.cargo = cargo;
    }
    
     public Double getSueldo(){
        return sueldo;
    }

    public void setSueldo(Double sueldo){
        this.sueldo = sueldo;
    }
}
