/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import javax.swing.DefaultListModel;

/**
 *
 * @author Usuario
 */
public class Usuario {
    private String nickname;
    private int puerto;
    private String IP;
    private DefaultListModel<Chat> chats= new DefaultListModel<Chat>();
    private DefaultListModel<Contacto> contactos = new DefaultListModel<Contacto>();
    
    public Usuario(String nickname, int puerto, String IP) {
        super();
        this.nickname = nickname;
        this.puerto = puerto;
        this.IP = IP;
    }
    
    // getters
    public String getNickname() {
        return nickname;
    }

    public int getPuerto() {
        return puerto;
    }

    public String getIP() {
        return IP;
    }

    public DefaultListModel<Chat> getChats() {
        return chats;
    }

    public DefaultListModel<Contacto> getContactos() {
        return contactos;
    }
        
    public Contacto buscarContactoPorNombre(String nombreContacto) {
    for (int i = 0; i < this.contactos.getSize(); i++) {
        Contacto contacto = this.contactos.getElementAt(i);
        if (contacto.getNickname().equals(nombreContacto)) {
            return contacto;
        }
    }
    return null; // Retorna null si no se encuentra el contacto
}
  
}
