package vista;


/* 
this.btnLogIn = new JButton("Log In");
this.btnLogIn.setActionCommand("LogIn");


public void setControlador(ControladorLogin c){
		this.btnLogIn.addActionListener(c);
		this.btnRegistrarse.addActionListener(c);
	}


*/


import modelo.Contacto;
import controlador.Controlador;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import java.util.ArrayList;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Usuario
 */

public class Vista extends javax.swing.JFrame {

    /**
     * Creates new form Vista
     */
    public Vista() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tabbedPane = new javax.swing.JTabbedPane();
        panelChats = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaChats = new javax.swing.JList<>();
        jPanel3 = new javax.swing.JPanel();
        nombreChatSeleccionado = new javax.swing.JLabel();
        puertoChatSeleccionado = new javax.swing.JLabel();
        textoMensaje = new javax.swing.JTextField();
        bEnviar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        chat = new javax.swing.JTextArea();
        panelContactos = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        listaContactos = new javax.swing.JList<>();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        nickContactoAgregado = new javax.swing.JTextField();
        ipContactoAgregado = new javax.swing.JTextField();
        puertoContactoAgregado = new javax.swing.JTextField();
        bAgregarContacto = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        nicknameUsuario = new javax.swing.JLabel();
        puertoUsuario = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        tabbedPane.setBackground(new java.awt.Color(255, 255, 255));
        tabbedPane.setForeground(new java.awt.Color(245, 85, 132));
        tabbedPane.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        tabbedPane.setFont(new java.awt.Font("Meiryo", 0, 14)); // NOI18N

        panelChats.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Meiryo UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(245, 85, 132));
        jLabel1.setText("chats activos");

        listaChats.setFont(new java.awt.Font("Meiryo UI", 0, 14)); // NOI18N
        listaChats.setForeground(new java.awt.Color(245, 85, 132));
        listaChats.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listaChats.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        //listaChats.addMouseListener(new java.awt.event.MouseAdapter() {
        //    public void mouseClicked(java.awt.event.MouseEvent evt) {
        //        listaChatsMouseClicked(evt);
        //    }
        //});
        jScrollPane1.setViewportView(listaChats);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        nombreChatSeleccionado.setBackground(new java.awt.Color(255, 255, 255));
        nombreChatSeleccionado.setFont(new java.awt.Font("Meiryo UI", 0, 14)); // NOI18N
        nombreChatSeleccionado.setForeground(new java.awt.Color(245, 85, 132));

        puertoChatSeleccionado.setBackground(new java.awt.Color(255, 255, 255));
        puertoChatSeleccionado.setFont(new java.awt.Font("Meiryo UI", 0, 12)); // NOI18N
        puertoChatSeleccionado.setForeground(new java.awt.Color(245, 85, 132));

        textoMensaje.setFont(new java.awt.Font("Meiryo UI", 0, 12)); // NOI18N
        textoMensaje.setForeground(new java.awt.Color(245, 85, 132));
        textoMensaje.setText("ingrese su texto aqui ...");
        textoMensaje.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textoMensajeMouseClicked(evt);
            }
        });
        textoMensaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoMensajeActionPerformed(evt);
            }
        });

        bEnviar.setFont(new java.awt.Font("Meiryo UI", 0, 12)); // NOI18N
        bEnviar.setForeground(new java.awt.Color(245, 85, 132));
        bEnviar.setText("enviar");
        bEnviar.setActionCommand("Enviar");
        //bEnviar.addActionListener(new java.awt.event.ActionListener() {
        //    public void actionPerformed(java.awt.event.ActionEvent evt) {
        //        bEnviarActionPerformed(evt);
        //    }
        //});

        chat.setColumns(20);
        chat.setFont(new java.awt.Font("Meiryo UI", 0, 12)); // NOI18N
        chat.setForeground(new java.awt.Color(245, 85, 132));
        chat.setRows(5);
        jScrollPane2.setViewportView(chat);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(textoMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bEnviar, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(nombreChatSeleccionado, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(puertoChatSeleccionado, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nombreChatSeleccionado, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(puertoChatSeleccionado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textoMensaje)
                    .addComponent(bEnviar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout panelChatsLayout = new javax.swing.GroupLayout(panelChats);
        panelChats.setLayout(panelChatsLayout);
        panelChatsLayout.setHorizontalGroup(
            panelChatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelChatsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelChatsLayout.setVerticalGroup(
            panelChatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelChatsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelChatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        tabbedPane.addTab("chats", panelChats);

        panelContactos.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Meiryo UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(245, 85, 132));
        jLabel4.setText("lista de contactos");

        listaContactos.setFont(new java.awt.Font("Meiryo UI", 0, 14)); // NOI18N
        listaContactos.setForeground(new java.awt.Color(245, 85, 132));
        listaContactos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listaContactos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        //listaContactos.addMouseListener(new java.awt.event.MouseAdapter() {
        //    public void mouseClicked(java.awt.event.MouseEvent evt) {
        //        listaContactosMouseClicked(evt);
        //    }
        //});
        jScrollPane3.setViewportView(listaContactos);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                    .addComponent(jScrollPane3))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 419, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Meiryo UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(245, 85, 132));
        jLabel5.setText("agregar contacto");

        nickContactoAgregado.setForeground(new java.awt.Color(245, 85, 132));
        nickContactoAgregado.setText("nickname");
        nickContactoAgregado.setCaretColor(new java.awt.Color(255, 204, 204));
        nickContactoAgregado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nickContactoAgregadoMouseClicked(evt);
            }
        });
        nickContactoAgregado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nickContactoAgregadoActionPerformed(evt);
            }
        });

        ipContactoAgregado.setForeground(new java.awt.Color(245, 85, 132));
        ipContactoAgregado.setText("IP");
        ipContactoAgregado.setCaretColor(new java.awt.Color(255, 204, 204));
        ipContactoAgregado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ipContactoAgregadoActionPerformed(evt);
            }
        });

        puertoContactoAgregado.setForeground(new java.awt.Color(245, 85, 132));
        puertoContactoAgregado.setText("puerto");
        puertoContactoAgregado.setCaretColor(new java.awt.Color(255, 204, 204));
        puertoContactoAgregado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                puertoContactoAgregadoMouseClicked(evt);
            }
        });
        puertoContactoAgregado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                puertoContactoAgregadoActionPerformed(evt);
            }
        });

        bAgregarContacto.setForeground(new java.awt.Color(245, 85, 132));
        bAgregarContacto.setText("agregar");
        bAgregarContacto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bAgregarContactoMouseClicked(evt);
            }
        });
        bAgregarContacto.setActionCommand("AgregarContacto");
        //bAgregarContacto.addActionListener(new java.awt.event.ActionListener() {
        //    public void actionPerformed(java.awt.event.ActionEvent evt) {
        //        bAgregarContactoActionPerformed(evt);
        //    }
        //});

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nickContactoAgregado)
                            .addComponent(ipContactoAgregado)
                            .addComponent(puertoContactoAgregado)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(bAgregarContacto)))
                .addContainerGap(179, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel5)
                .addGap(28, 28, 28)
                .addComponent(nickContactoAgregado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(ipContactoAgregado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(puertoContactoAgregado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(bAgregarContacto)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelContactosLayout = new javax.swing.GroupLayout(panelContactos);
        panelContactos.setLayout(panelContactosLayout);
        panelContactosLayout.setHorizontalGroup(
            panelContactosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContactosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(122, Short.MAX_VALUE))
        );
        panelContactosLayout.setVerticalGroup(
            panelContactosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelContactosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(panelContactosLayout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabbedPane.addTab("contactos", panelContactos);

        jPanel6.setBackground(new java.awt.Color(255, 204, 204));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel7.setBackground(new java.awt.Color(255, 204, 204));

        nicknameUsuario.setFont(new java.awt.Font("Meiryo UI", 1, 18)); // NOI18N
        nicknameUsuario.setForeground(new java.awt.Color(255, 255, 255));
        nicknameUsuario.setText("usuario");

        puertoUsuario.setBackground(new java.awt.Color(255, 204, 204));
        puertoUsuario.setFont(new java.awt.Font("Meiryo UI", 0, 12)); // NOI18N
        puertoUsuario.setForeground(new java.awt.Color(255, 255, 255));
        puertoUsuario.setText("puerto");
        puertoUsuario.setToolTipText("");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nicknameUsuario)
                    .addComponent(puertoUsuario))
                .addContainerGap(165, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(nicknameUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(puertoUsuario)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tabbedPane)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabbedPane)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nickContactoAgregadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nickContactoAgregadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nickContactoAgregadoActionPerformed

    private void ipContactoAgregadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ipContactoAgregadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ipContactoAgregadoActionPerformed

    private void puertoContactoAgregadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_puertoContactoAgregadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_puertoContactoAgregadoActionPerformed

    private void bEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEnviarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bEnviarActionPerformed

    private void bAgregarContactoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bAgregarContactoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_bAgregarContactoMouseClicked

    private void bAgregarContactoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAgregarContactoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bAgregarContactoActionPerformed

    private void nickContactoAgregadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nickContactoAgregadoMouseClicked
        nickContactoAgregado.setText("");
    }//GEN-LAST:event_nickContactoAgregadoMouseClicked

    private void puertoContactoAgregadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_puertoContactoAgregadoMouseClicked
        puertoContactoAgregado.setText("");
    }//GEN-LAST:event_puertoContactoAgregadoMouseClicked

    private void textoMensajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoMensajeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoMensajeActionPerformed

    private void textoMensajeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textoMensajeMouseClicked
        // TODO add your handling code here:
        textoMensaje.setText("");
    }//GEN-LAST:event_textoMensajeMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista().setVisible(true);
            }
        });

  
    }

    public void setNickUsuario(String nickUsuario){
        this.nicknameUsuario.setText(nickUsuario);
    }

    public void setPuertoUsuario(int puertoUsuario){
        String aux = Integer.toString(puertoUsuario);
        this.puertoUsuario.setText(aux);
    }

    public String getNicknameUsuario(){
        return this.nicknameUsuario.getText();
    }

    public int getPuertoUsuario(){
        return Integer.parseInt(this.puertoUsuario.getText());
    }
    
    public String getNickContactoAgregado() {
        String aux = this.nickContactoAgregado.getText();
        if (!aux.equals(""))
                return aux;
        JOptionPane.showMessageDialog(null,"Debe introducir nombre de usuario");
        return null;
    }

    public String getIpContactoAgregado(){
        return ipContactoAgregado.getText();
    }

    public String getPuertoContactoAgregado(){
        return puertoContactoAgregado.getText();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAgregarContacto;
    private javax.swing.JButton bEnviar;
    private javax.swing.JTextArea chat;
    private javax.swing.JTextField ipContactoAgregado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList<String> listaChats;
    private javax.swing.JList<String> listaContactos;
    private javax.swing.JTextField nickContactoAgregado;
    private javax.swing.JLabel nicknameUsuario;
    private javax.swing.JLabel nombreChatSeleccionado;
    private javax.swing.JPanel panelChats;
    private javax.swing.JPanel panelContactos;
    private javax.swing.JLabel puertoChatSeleccionado;
    private javax.swing.JTextField puertoContactoAgregado;
    private javax.swing.JLabel puertoUsuario;
    private javax.swing.JTabbedPane tabbedPane;
    private javax.swing.JTextField textoMensaje;
    // End of variables declaration//GEN-END:variables
    
    public void setControlador(Controlador c){
		this.bEnviar.addActionListener(c);
		this.bAgregarContacto.addActionListener(c);
        listaContactos.setModel(c.getSistema().getNicksContactos());
        listaChats.setModel(c.getSistema().getNicksChats()); 
        
        listaContactos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt){
                c.listaContactosMouseClicked(evt);
            }
        });
        listaChats.addMouseListener(new java.awt.event.MouseAdapter(){
            public void mouseClicked(java.awt.event.MouseEvent evt){
                c.listaChatsMouseClicked(evt);
            }
        });
    
    }
    public void limpiaChat(){
        this.chat.setText("");
    }
    
     public void cargaChat(ArrayList<String> mensajes) {
        for (String mensaje : mensajes){
            String[] mensajeFormateado = mensaje.split("#", 4);
            String hora = mensajeFormateado[2].substring(11,16);
            
                this.chat.append(mensajeFormateado[0] + " ["+ hora +"]: " +mensajeFormateado[3] + "\n");
        }
    }
        /*listContactos.setModel(controlador.getContactos());
		this.listContactos.addListSelectionListener(new ListSelectionListener(){

			@Override
			public void valueChanged(ListSelectionEvent e) {
				Contacto contactoElegido;
				if (!e.getValueIsAdjusting()) { // Evita eventos duplicados
		            contactoElegido = (Contacto) listContactos.getSelectedValue(); // Obtiene el objeto Chat directamente
		            if (contactoElegido != null) {
						controlador.cambiaVistaChats(contactoElegido);
		            }
				}
			}
		}); */
	
    
    private void textoMensajeKeyReleased(java.awt.event.KeyEvent evt) {
        if (textoMensaje.getText().length() != 0) {
            bEnviar.setEnabled(true);
        } else {
            bEnviar.setEnabled(false);
        }
    }
    public String getMensaje(){
    try{
        String aux = this.textoMensaje.getText();
        if (aux != null && !aux.equals(""))
                return aux;
    } catch (NullPointerException e){
    }
    return null;
    }
    /*
    
    public void agregarMensaje(Mensaje mensaje) {		
        this.chat.append(mensaje.getEmisor() + ":" + mensaje.getTexto() + "\n");	  
    }
    
    public void cargaChat (Chat chatSeleccionado){
        //chat.setText(""); 
        if (chatSeleccionado != null){
            nombreChatSeleccionado.setText(chatSeleccionado.getNombre());
            puertoChatSeleccionado.setText(String.valueOf(chatSeleccionado.getPuerto()));
            for (Mensaje mensaje : chatSeleccionado.getMensajes())
                this.chat.append( mensaje.getEmisor() + ":" + mensaje.getTexto() + "\n");
        }
    }
    */
    
    public int getPuerto() {
        String puertoString = this.puertoContactoAgregado.getText();
        int puerto = Integer.parseInt(puertoString);
        if (puerto < 1000 || puerto > 60000){
            JOptionPane.showMessageDialog(null, "Puerto en rango Invalido");//abre ventana errorr
            return -1;
        } else
            return puerto;
    }
    
    public void setNickChatSeleccionado(String nickname) {
        this.nombreChatSeleccionado.setText(nickname);
    }

    public void setPuertoChatSeleccionado(int puerto) {       
        this.puertoChatSeleccionado.setText(String.valueOf(puerto));
    }

    public void cambiarAVentanaChat() {
        this.tabbedPane.setSelectedIndex(0); // Cambia al tab donde están los chats
    }

    public String getListaContactosSeleccionado(){
        return listaContactos.getSelectedValue();
    }

    public String getListaChatsSeleccionado(){
        return listaChats.getSelectedValue();
    }

    public String getTextoMensaje(){
        return textoMensaje.getText();
    }

    public void setTextoMensaje(String string){
        textoMensaje.setText(string);
    }

    public int getPuertoChatSeleccionado(){
        return Integer.parseInt(this.puertoChatSeleccionado.getText());
    }

    public String getNicknameChatSeleccionado(){
        return this.nombreChatSeleccionado.getText();
    }

    public void muestraVentanaEmergente(String mensaje){
        JOptionPane.showMessageDialog(this, mensaje);
    }





    
    
    /* 
    public void setControlador (Controlador c){
        nicknameUsuario.setText(c.getNickUsuario());
        puertoUsuario.setText(String.valueOf(c.getUsuario().getPuerto()));
        bEnviar.addActionListener(c);
	textoMensaje.addActionListener(c);
        
        listaChats.setModel(c.getChats());
        //DefaultListModel<String> modeloLista = new DefaultListModel<>();
        //DefaultListModel<Chat> chats = c.getChats();

        for (int i = 0; i < chats.getSize(); i++) {
            modeloLista.addElement(chats.getElementAt(i).getContacto().getNickname());
        }

        listaChats.setModel(modeloLista);
	
	this.listaChats.addListSelectionListener(new ListSelectionListener(){    
            
            @Override
            public void valueChanged(ListSelectionEvent e) {
                String valor;
                Chat chatElegido;	
                chat.setText(""); // tiene que borrar la ventana de chats
                if (!e.getValueIsAdjusting()) { // Evita eventos duplicados    
                    chatElegido = (Chat) listaChats.getSelectedValue();
                    if (chatElegido != null) {
                        cargaChat(chatElegido); // cargar
                        c.setChatActual(chatElegido);
                    }
                }
                    //chatElegido = controlador.buscaChatSeleccionado(valor);
                    //cargaChat(chatElegido); // cargar el chat seleccionado
            }
        
        });
        
        this.listaContactos.addListSelectionListener(new ListSelectionListener() {    
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) { // Evita eventos duplicados
                    String nombreContacto = listaContactos.getSelectedValue(); // Obtener el nombre del contacto seleccionado

                    if (nombreContacto != null) {
                        // Buscar si ya existe un chat con este contacto
                        Chat chatExistente = null;
                        for (int i = 0; i < c.getChats().getSize(); i++) {
                            Chat chat = c.getChats().getElementAt(i);
                            if (chat.getContacto().getNickname().equals(nombreContacto)) {
                                chatExistente = chat;
                                break;
                            }
                        }

                        if (chatExistente == null) {
                            Contacto contacto = c.getUsuario().buscarContactoPorNombre(nombreContacto);
                            chatExistente = c.nuevaConversacion(contacto);
                        }

                        if (chatExistente != null) {
                            // Seleccionar el chat en la lista de chats y cambiar a la pestaña de chats
                            listaChats.setSelectedValue(chatExistente, true);
                            tabbedPane.setSelectedIndex(0); // Cambia a la pestaña de chats
                        }
                    }
                }
            }
        });
        
    }
        */
}

