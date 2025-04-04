/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import controlador.Controlador;
import java.util.List;
import java.util.stream.Stream;
import javax.swing.DefaultListModel;
import java.time.LocalDateTime;


/**
 *
 * @author Usuario
 */
public class Sistema {
    private Receptor receptor;
    private String ipUsuario = "localhost";
    private int puertoUsuario;
    private String nickUsuario;
    private DefaultListModel<Contacto> contactos = new DefaultListModel<Contacto>();
    private DefaultListModel<String> nicksContactos = new DefaultListModel<String>();
    private DefaultListModel<String> nicksChats = new DefaultListModel<String>();
    
    /*
    private Usuario usuario;
    private Controlador controlador;
    private Receptor receptor;
    private DefaultListModel<String> chats= new DefaultListModel<Chat>();
    private DefaultListModel<Contacto> contactos = new DefaultListModel<Contacto>();

    public Sistema(Usuario usuarioRegistrado) {
        super();
        this.usuario = usuarioRegistrado;      
    }
    */


    public void setNickUsuario(String nickUsuario){
        this.nickUsuario = nickUsuario;
    }

    public void setPuertoUsuario(int puertoUsuario){
        this.puertoUsuario = puertoUsuario;
    }
    public int getPuertoUsuario(){
        return this.puertoUsuario;
    }
    public String getNickUsuario(){
        return this.nickUsuario;
    }
    public String getIpUsuario(){
        return this.ipUsuario;
    }
    public DefaultListModel<Contacto> getContactos(){
        return this.contactos;
    }
    public DefaultListModel<String> getNicksContactos(){
        return this.nicksContactos;
    }
    public DefaultListModel<String> getNicksChats(){
        return this.nicksChats;
    }

    public void agregaNickChat(String nick){
        
    }
    
    public void nuevoContacto(String nickname, int puerto, String ip){
        //TODO: chequear que el nickname sea univoco antes de instanciar
        Contacto contacto = new Contacto(nickname, puerto, "localhost");
        this.contactos.addElement(contacto);
        this.nicksContactos.addElement(contacto.getNickname());
    }

    public Contacto buscaContactoPorNick(String nick){
        //busca en la lista de contactos
        int i, n;
        i=0;
        Contacto aux = null;
        n=this.getContactos().size();
        while (i<n && !this.getContactos().get(i).getNickname().equals(nick))
            i++;
        if (i<n){//siempre deberia encontrarlo
            aux = this.getContactos().get(i);
        }
        else{
            System.out.println("el Contacto buscado por nick NO existe");
        }
        return aux;
    }

    public Contacto buscaContactoPorPuerto(int puerto){
         //busca en la lista de contactos
        int i, n;
        i=0;
        Contacto aux = null;
        n=this.getContactos().size();
        while (i<n && this.getContactos().get(i).getPuerto()!=puerto)
            i++;
        if (i<n){//siempre deberia encontrarlo
            aux = this.getContactos().get(i);
        }
        else{
            System.out.println("el Contacto buscado por puerto NO existe");
        }
        return aux;
    }

    public String creaStringMensaje(String texto, String nicknameUsuario, int puerto){
        String mensaje,hora = LocalDateTime.now().toString();
        mensaje = nicknameUsuario + "#" + String.valueOf(puerto) + "#" + hora + "#" + texto;
        return mensaje;
    }

    public void enviaMensaje(String mensaje, String ipContacto, int puertoContacto){
        Emisor emisor = new Emisor(mensaje, ipContacto, puertoContacto);
        emisor.clienteInstantaneo();       
    }

    public boolean esContactoExistente(int puerto, String ip){
        Boolean aux=false;
        Contacto contacto = buscaContactoPorPuerto(puerto);
        if (contacto!=null)
            aux=true; 
        return aux;
    }

}
    
    
    /* 
    
    // agregar contactos (automatico cuando me hablan o manual cuando agrego)
    public void agregarContacto(Contacto contactoNew) {
    	this.usuario.getContactos().addElement(contactoNew);
    	System.out.println("Agregue al contacto");
    }
    
    // nuevaConversacion tiene dos funciones:
    // a. devuelve la conversacion con un contacto si tenemos
    // b. si no la tenemos la crea
    public Chat nuevaConversacion(Contacto contactoNew) {
    	int n, i = 0;
        n = this.usuario.getChats().size();
        while (i < n && this.usuario.getChats().get(i).getContacto() != contactoNew){
            i++;
        } 
        System.out.println("i: " + i + "y n: " + n);
        if (i < n)//ya tiene una conversacion con ese contacto
            return this.usuario.getChats().get(i);    	
        else{
            System.out.println("Hago una nueva conversaacion");
            Chat nuevoChat = new Chat(contactoNew);
                this.usuario.getChats().addElement(nuevoChat);
                return nuevoChat;
            }
            
    }
    
    // este metodo se llama cuando el controlador 
    // recibe una solicitud de enviar nuevo mensaje
    // (cuando el usuario toca el boton send)
    public void enviaMensaje(Mensaje mensajeNew, Chat chatVista) {
    	System.out.println("Voy a enviar un mensaje p2p!!");
    	this.usuario.getChats().get(this.usuario.getChats().indexOf(chatVista)).addMensaje(mensajeNew);
            Emisor emisor = new Emisor(); 
            emisor.clienteInstantaneo(mensajeNew);
    }
    
    // este metodo se usa para cuando recibo un mensaje
    // si ya tengo al contacto 
    
    public void recibeMensaje(String nickname, String ip, int puertoEmisor, String textmensaje) {
    // Crear el mensaje recibido
    Mensaje mensaje = new Mensaje(nickname, ip, puertoEmisor, 
                                  this.usuario.getNickname(), 
                                  this.usuario.getIP(), 
                                  this.usuario.getPuerto(), 
                                  textmensaje);

    // Buscar si el remitente está en la lista de contactos
    int i = 0, n = this.usuario.getChats().size();
    while (i < n && (this.usuario.getContactos().get(i).getPuerto() != puertoEmisor 
                   && !this.usuario.getContactos().get(i).getIp().equals(ip))) {
        i++;
    }

    if (i < n) { // El remitente está en la lista de contactos
        Contacto contactoAct = this.usuario.getContactos().get(i);

        // Buscar si ya existe un chat con el remitente
        i = 0;
        n = this.usuario.getChats().size();
        while (i < n && nickname.equals(this.usuario.getChats().get(i).getContacto().getNickname())) {
            i++;
        }

        if (i == n) { // No existe un chat, crear uno nuevo
            Chat nuevoChat = this.nuevaConversacion(contactoAct);
            nuevoChat.getMensajes().add(mensaje);
        } else { // Ya existe un chat, agregar el mensaje
            this.usuario.getChats().get(i).getMensajes().add(mensaje);
        }
    } else { // El remitente no está en la lista de contactos, agregarlo automáticamente
        Contacto contactoAct = new Contacto(mensaje.getEmisor(), mensaje.getPuertoEmisor(), mensaje.getIpEmisor());
        this.agregarContacto(contactoAct);
        
        Chat nuevoChat = this.nuevaConversacion(contactoAct);
        nuevoChat.getMensajes().add(mensaje);
    }

    // Notificar al controlador sobre el nuevo mensaje recibido
    controlador.nuevoMensaje(mensaje);
}


    // agregar un chat a la lista de chats del usuario
    public void agregarNuevoChat(Chat chat){
        this.usuario.getChats().addElement(chat);
    }

    // setters y getters
    
    public void setControlador(Controlador controlador) {
        this.controlador = controlador;
    }
    
    public void setUsuarioRegistrado(Usuario usuarioRegistrado) {
        if (this.usuario == null)
            this.usuario = usuarioRegistrado;
    }
    
    public Usuario getUsuarioRegistrado() {
        return usuario;
    }
        */
  

