/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import java.util.GregorianCalendar;

/**
 *
 * @author Usuario
 */
public class Mensaje {

    private String texto;
    private GregorianCalendar fechaHora;
    
    public Mensaje(String nickname, String ipEmisor, int puertoEmisor, String Receptor, String ipReceptor, int puertoReceptor, String texto) {
        super();
        this.texto = texto;
        this.fechaHora = new GregorianCalendar();
    }

    public void setTexto(String texto) {
            this.texto = texto;
    }

    public String getTexto() {
            return texto;
    }

    public GregorianCalendar getFechaHora() {
            return fechaHora;
    }

}
