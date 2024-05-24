/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composicion1;

/**
 *
 * @author camper
 */
class computadora {
    // Componentes de la computadora
    private monitor monitor;
    private teclado teclado;
    private raton raton;

    // Constructor
    public computadora() {
        this.monitor = new monitor();
        this.teclado = new teclado();
        this.raton = new raton();
    }

    // Métodos que usan los componentes
    public void encenderComputadora() {
        monitor.encender();
        teclado.escribir();
        raton.hacerClick();
    }
}
