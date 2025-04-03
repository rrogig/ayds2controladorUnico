/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Chat {
    private ArrayList<Mensaje> mensajes = new ArrayList<Mensaje>() ;
    private Contacto contacto;
    
    public Chat(Contacto contacto) {
        super();
        this.contacto = contacto;
    }
    
    // getters directos
    public ArrayList<Mensaje> getMensajes() {
        return mensajes;
    }
    
    public Contacto getContacto() {
        return contacto;
    }
    
    public int getPuerto(){
        return contacto.getPuerto();
    }
    
    // agrega mensajes a la lista de mensajes
    public void addMensaje(Mensaje mensajeNew){
        this.mensajes.add(mensajeNew);
    }
    
    public String getUltimoMensaje() {
    // TODO Auto-generated method stub
        return mensajes.getLast().getTexto();
    }
    
    public String getNombre() {	
        return contacto.getNickname();
    }
    
    @Override
    public String toString() {
            return contacto.getNickname();
    }   
}
