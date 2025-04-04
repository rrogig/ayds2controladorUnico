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
public class Contacto {
    private String nickname;
    private int puerto;
    private String ip;
    private boolean tieneChat;
    private ArrayList<String> mensajes = new ArrayList<String>();
    
    public Contacto(String nickname, int puerto, String ip) {
        super();
        this.nickname = nickname;
        this.puerto = puerto;
        this.ip = ip;
        this.tieneChat = false;
    }  
    public String getNickname() {
        return nickname;
    }

    public int getPuerto() {
        return puerto;
    }

    public String getIp() {
        return ip;
    }  
    
    public boolean getTieneChat(){
        return tieneChat;
    }
    
    public void setTieneChat(boolean tieneChat){
        this.tieneChat = tieneChat;
    }

    public ArrayList<String> getMensajes(){
        return this.mensajes;
    }
    
}
