/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismo;

/**
 *
 * @author camper
 */
public class consultor extends persona{
    
    String nombre_consultora;
    int num_consultor;
    
    public consultor(){
    }

    @Override
    public String toString() {
        return "consultor{" + "nombre de la consultora=" + nombre_consultora + ", numero del consultor=" + num_consultor + '}';
    }
    
    public consultor(String nombre_consultora, int num_consultor, int id, String dni, String nombre, String apellido, String domicilio, int telefono){
        super(id,dni, nombre, apellido, domicilio, telefono);
        this.nombre_consultora = nombre_consultora;
        this.num_consultor = num_consultor;
    }
    
    public String getNombre_consultora(){
        return nombre_consultora;
    }

    public void setNombre_consultora(String nombre_consultora){
        this.nombre_consultora = nombre_consultora;
    }
    
    public int getNum_consultor(){
        return num_consultor;
    }

    public void setNum_consultor(int num_consultor){
        this.num_consultor = num_consultor;
    }
    
}
