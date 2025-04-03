/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import modelo.Chat;
import modelo.Mensaje;
import modelo.Receptor;
import modelo.Contacto;
import modelo.Sistema;
import modelo.Usuario;
import vista.Vista;
import vista.VistaLogIn;

/**
 *
 * @author Usuario
 */
public class Controlador implements ActionListener{

    private Vista vista;
    private VistaLogIn vistaLogIn;
    private Sistema sistema;
    private Receptor receptor;
    
    public Controlador(Vista vista, VistaLogIn vistaLogIn, Sistema sistema){
        this.vista = vista;
        this.vistaLogIn = vistaLogIn;
        this.sistema = sistema;        
    }
    
 

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("LogIn")){
            System.out.print("Entre al action command de Login!!");
            String nickUsuario = vistaLogIn.getNickUsuario();
            int puertoUsuario = vistaLogIn.getPuertoUsuario();
            // llenar campo nickUsuario
            this.iniciaSesion(nickUsuario,puertoUsuario);
            vista.setNickUsuario(nickUsuario);
            // llenar campo puertoUsuario
            vista.setPuertoUsuario(puertoUsuario);
            // ARRANCAR EL SERVER SOCKET en otro thread
            sistema.iniciaReceptor();
            
            //settear visible vistaChats
            this.vista.setVisible(true);
            this.vistaLogIn.setVisible(false);
            //settear invisible vistaLogin
        }
        if (e.getActionCommand().equals("Enviar")){

        }
        if (e.getActionCommand().equals("AgregarContacto")){
            System.out.print("Entre al action command de agregar contacto!!");
            //leer los campos de datos de contacto
            String nickname = vista.getNickContactoAgregado();
            String ip = vista.getIpContactoAgregado();
            int puerto = Integer.parseInt(vista.getPuertoContactoAgregado());
            //creamos un objeto contacto -> nickname, puerto, ip y arraylist vacio de chats
            sistema.nuevoContacto(nickname,puerto,ip);
        }

        
    }

    public void listaContactosMouseClicked(java.awt.event.MouseEvent evt){
        String nickSeleccionado = vista.getListaContactosSeleccionado();
        Contacto contacto = sistema.buscaContactoPorNick(nickSeleccionado);
        vista.setNickChatSeleccionado(nickSeleccionado);
        vista.setPuertoChatSeleccionado(contacto.getPuerto());
        if (contacto.getTieneChat()) {
            //TODO: sistema.cargaChat();
        } else {
            contacto.setTieneChat(true);
            sistema.getNicksChats().addElement(nickSeleccionado);
        }
        vista.cambiarAVentanaChat();
    }

    public void listaChatsMouseClicked(java.awt.event.MouseEvent evt){
        String nickSeleccionado = vista.getListaChatsSeleccionado();
        Contacto contacto = sistema.buscaContactoPorNick(nickSeleccionado);
        vista.setNickChatSeleccionado(nickSeleccionado);
        vista.setPuertoChatSeleccionado(contacto.getPuerto());
        //TODO: sistema.cargaChat();
    }

    public void iniciaSesion(String nickname, int puerto){
        sistema.setNickUsuario(nickname);
        sistema.setPuertoUsuario(puerto);
        this.receptor = new Receptor(sistema);
        receptor.start();  
    }

    public Sistema getSistema(){
        return this.sistema;
    }

}
