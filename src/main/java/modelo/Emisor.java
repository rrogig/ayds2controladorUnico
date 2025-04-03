/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 *
 * @author Usuario
 */
public class Emisor {
    // esta clase se encarga de enviar mensajes
    // creando client sockets 
    // que elimina instantaneamente luego de enviar el mensaje
    public Emisor() {
    }
    /*
    public void clienteInstantaneo(Mensaje mensaje){
        try {
            // lo llama el controlador cuando se clickea send
            // se abre
            Socket socket = new Socket(mensaje.getIpReceptor(), mensaje.getPuertoReceptor());    
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String textMensaje = mensaje.getEmisor() + ":" + mensaje.getIpEmisor() + ":" + mensaje.getPuertoEmisor() + ":" + mensaje.getTexto();
            
            out.println(textMensaje);
            System.out.println("Se envio el mensaje :" + textMensaje);
            out.close();
            socket.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    */
    
    
}
