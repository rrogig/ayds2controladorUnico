/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import controlador.Controlador;
/**
 *
 * @author Usuario
 */
public class Receptor extends Thread{
    Controlador controlador;
    // esta clase instancia el server socket de cada usuario
    // y lo deja prendido (inicia un thread nuevo) para que
    // siempre pueda escuchar mensajes de otros usuarios
    
    public Receptor(Controlador controlador) {
        this.controlador = controlador;
    }
    //TODO: este metodo se debe llamar cuando instanciemos el thread()
    @Override
    public void run() {
        int puerto = controlador.getSistema().getPuertoUsuario();
        ServerSocket s;
        try {
            s = new ServerSocket(puerto);
            System.out.println("Server socket activo en puerto " + puerto);
            while (true) {
                Socket soc = s.accept();
                System.out.println("Se hizo una conexión de recepción");
                PrintWriter out = new PrintWriter(soc.getOutputStream(), true);
                BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
                String mensaje = in.readLine();
                controlador.nuevoMensajeRecibido(mensaje);
                //String[] mensaje = msg.split(":", 4);
                // sistema.recibeMensaje(mensaje[0], mensaje[1], Integer.parseInt(mensaje[2]), mensaje[3]);//godd
                System.out.println("Se recibio el mensaje: " + mensaje);
                //s.close();no se puede cerrar aca o de otra forma se cierra la recepción de mensajes cuando ya se recibio el primero y no se vuelve a abrir
                soc.close();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
