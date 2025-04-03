/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba;
import modelo.Sistema;
import vista.Vista;
import vista.VistaLogIn;
import controlador.Controlador;

/**
 *
 * @author Usuario
 */
public class Prueba {
    // esta clase es un main para probar el funcionamiento de todo
    public static void main(String[] args){
        Sistema sistema = new Sistema();
        
        VistaLogIn vistaLogIn = new VistaLogIn();
        Vista vista = new Vista();
        Controlador controlador = new Controlador(vista, vistaLogIn, sistema);

        vista.setControlador(controlador);
        vistaLogIn.setControlador(controlador);

        vistaLogIn.setVisible(true);

        
    }
}
