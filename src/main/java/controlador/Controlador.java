/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import modelo.Chat;
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
            sistema.setNickUsuario(nickUsuario);
            sistema.setPuertoUsuario(puertoUsuario);
            vista.setNickUsuario(nickUsuario);
            // llenar campo puertoUsuario
            vista.setPuertoUsuario(puertoUsuario);
            // ARRANCAR EL SERVER SOCKET en otro thread
            this.iniciaReceptor();
            
            //settear visible vistaChats
            this.vista.setVisible(true);
            this.vistaLogIn.setVisible(false);
            //settear invisible vistaLogin
        }
        if (e.getActionCommand().equals("Enviar")){
            System.out.print("Entre al action command de enviar mensaje!!");
            // 
            // Crear el string mensaje agarrando = lo que esta en el textField, nickUsuario, puertoUsuario, y hora de envio
            String mensaje;
            mensaje = sistema.creaStringMensaje(vista.getTextoMensaje(), vista.getNicknameUsuario(), vista.getPuertoUsuario());
              
            // instanciar server socket y enviar
            System.out.println("Se creo el string para mensaje. El string creado es: " + mensaje + "\n");
            int puertoContacto = vista.getPuertoChatSeleccionado();
            Contacto contacto = sistema.buscaContactoPorPuerto(puertoContacto);

            contacto.getMensajes().add(mensaje);
            vista.limpiaChat();
            vista.cargaChat(contacto.getMensajes());

            sistema.enviaMensaje(mensaje,"localhost",puertoContacto);
            
            

                // sacar datos del contacto al que le estamos enviando desde la vista
            // agregarlo a la lista de mensajes para el usuario que envia
                // mostrar en pantalla dichos mensajes
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
        vista.limpiaChat();
        String nickSeleccionado = vista.getListaContactosSeleccionado();
        Contacto contacto = sistema.buscaContactoPorNick(nickSeleccionado);
        vista.setNickChatSeleccionado(nickSeleccionado);
        vista.setPuertoChatSeleccionado(contacto.getPuerto());
        if (contacto.getTieneChat()) {
            vista.cargaChat(contacto.getMensajes());
        } else {
            contacto.setTieneChat(true);
            sistema.getNicksChats().addElement(nickSeleccionado);
        }
        vista.cambiarAVentanaChat();
    }

    public void listaChatsMouseClicked(java.awt.event.MouseEvent evt){
        vista.limpiaChat();
        String nickSeleccionado = vista.getListaChatsSeleccionado();
        Contacto contacto = sistema.buscaContactoPorNick(nickSeleccionado);
        vista.setNickChatSeleccionado(nickSeleccionado);
        vista.setPuertoChatSeleccionado(contacto.getPuerto());
        vista.cargaChat(contacto.getMensajes());
    }

    public Sistema getSistema(){
        return this.sistema;
    }

    // inicia el thread receptor que siempre debe estar abierta
    public void iniciaReceptor() {
        System.out.println("Se inicio el server socket");
        this.receptor = new Receptor(this);
        this.receptor.start();    
    }

    public void nuevoMensajeRecibido(String mensaje){
        // fijarse si ya tiene a esa persona en contactos; sino agregar a contactos y crear chat
        String[] mensajeFormateado = mensaje.split("#", 4);
        String nickEmisor = mensajeFormateado[0];
        int puertoEmisor = Integer.parseInt(mensajeFormateado[1]);
        String ipEmisor = "localhost";
        
        if (!sistema.esContactoExistente(puertoEmisor,ipEmisor)){
            System.out.println("me llego un mensaje de una persona que no tengo agendada... puertoEmisor = " + puertoEmisor);
            sistema.nuevoContacto(nickEmisor, puertoEmisor, ipEmisor);
            System.out.println("ya agende a la persona = " + puertoEmisor);
            //sistema.getNicksChats().addElement(nickEmisor);
        }
        // fijarse si ya tiene un chat con esa persona; sino agregar chat
        Contacto contacto = sistema.buscaContactoPorPuerto(puertoEmisor);
        if (contacto.getTieneChat() == false){
            contacto.setTieneChat(true);
            sistema.getNicksChats().addElement(contacto.getNickname());
        }

        // agregar el mensaje al arraylist de mensajes del contacto    
        contacto.getMensajes().add(mensaje);  
        System.out.println("ya agregue el mensaje a la lista de mensajes de ese contacto");
        
        // lo muestra
        if (vista.getNicknameChatSeleccionado().equals(contacto.getNickname())){
            vista.limpiaChat();
            vista.cargaChat(contacto.getMensajes());
        }
    }
}
