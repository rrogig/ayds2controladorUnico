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
    String mensaje;
    String ipReceptor;
    int puertoReceptor;
    // esta clase se encarga de enviar mensajes
    // creando client sockets 
    // que elimina instantaneamente luego de enviar el mensaje
    public Emisor(String mensaje, String ipReceptor, int puertoReceptor) {
        this.mensaje = mensaje;
        this.ipReceptor = ipReceptor;
        this.puertoReceptor = puertoReceptor;
    }
    public void clienteInstantaneo(){
        try {
            // lo llama el controlador cuando se clickea send
            // se abre
            Socket socket = new Socket(ipReceptor, puertoReceptor);   
            System.out.println("Se abrio el socket cliente") ;
            System.out.println("Se esta enviando al socket "+ puertoReceptor) ;
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            
            out.println(mensaje);
            System.out.println("Se envio el mensaje :" + mensaje);
            out.close();
            socket.close();
            System.out.println("Se cerro el socket cliente") ;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }  
}

