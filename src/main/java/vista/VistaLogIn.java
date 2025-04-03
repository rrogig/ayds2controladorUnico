/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import controlador.Controlador;

/**
 *
 * @author Usuario
 */
public class VistaLogIn extends javax.swing.JFrame {

    /**
     * Creates new form VistaLogIn
     */
    public VistaLogIn() {
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

        jTextField2 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        nickUsuario = new javax.swing.JTextField();
        ipUsuario = new javax.swing.JTextField();
        puertoUsuario = new javax.swing.JTextField();
        bLogIn = new javax.swing.JButton();

        jTextField2.setText("jTextField1");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTextField4.setText("jTextField1");
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        nickUsuario.setFont(new java.awt.Font("Meiryo UI", 0, 12)); // NOI18N
        nickUsuario.setForeground(new java.awt.Color(255, 204, 204));
        nickUsuario.setText(" nickname");
        nickUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nickUsuarioMouseClicked(evt);
            }
        });
        nickUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nickUsuarioActionPerformed(evt);
            }
        });

        ipUsuario.setFont(new java.awt.Font("Meiryo UI", 0, 12)); // NOI18N
        ipUsuario.setForeground(new java.awt.Color(255, 204, 204));
        ipUsuario.setText(" ip");
        ipUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ipUsuarioActionPerformed(evt);
            }
        });

        puertoUsuario.setFont(new java.awt.Font("Meiryo UI", 0, 12)); // NOI18N
        puertoUsuario.setForeground(new java.awt.Color(255, 204, 204));
        puertoUsuario.setText(" puerto");
        puertoUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                puertoUsuarioMouseClicked(evt);
            }
        });
        puertoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                puertoUsuarioActionPerformed(evt);
            }
        });

        bLogIn.setBackground(new java.awt.Color(255, 204, 204));
        bLogIn.setFont(new java.awt.Font("Meiryo UI", 0, 12)); // NOI18N
        bLogIn.setForeground(new java.awt.Color(255, 255, 255));
        bLogIn.setText("log");
        bLogIn.setActionCommand("LogIn");
        //bLogIn.addActionListener(new java.awt.event.ActionListener() {
         //   public void actionPerformed(java.awt.event.ActionEvent evt) {
         //       bLogInClicked(evt);
         //   }
        //});

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(131, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(puertoUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(ipUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(nickUsuario))
                        .addGap(131, 131, 131))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(bLogIn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(231, 231, 231))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(nickUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ipUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(puertoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bLogIn)
                .addContainerGap(88, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(256, 256, 256)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(256, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(153, Short.MAX_VALUE))
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

    private void nickUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nickUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nickUsuarioActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void ipUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ipUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ipUsuarioActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void puertoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_puertoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_puertoUsuarioActionPerformed

    private void bLogInClicked(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLogInClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_bLogInClicked

    private void nickUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nickUsuarioMouseClicked
        // TODO add your handling code here:
        nickUsuario.setText("");
    }//GEN-LAST:event_nickUsuarioMouseClicked

    private void puertoUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_puertoUsuarioMouseClicked
        // TODO add your handling code here:
        puertoUsuario.setText("");
    }//GEN-LAST:event_puertoUsuarioMouseClicked
    
    
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
            java.util.logging.Logger.getLogger(VistaLogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaLogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaLogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaLogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaLogIn().setVisible(true);
            }
        });
    }

    public void setControlador(Controlador c){
		this.bLogIn.addActionListener(c);
	}
    
    public String getNickUsuario() {
		String aux = this.nickUsuario.getText();
		if (!aux.equals(""))
			return aux;
		JOptionPane.showMessageDialog(null,"Debe Introducir nombre de usuario");
		return null;
	}
    
    public int getPuertoUsuario(){
        String puertoString = this.puertoUsuario.getText();
        int puerto = Integer.parseInt(puertoString);
        
        if (puerto < 1000 || puerto > 60000){
			JOptionPane.showMessageDialog(null, "Puerto en rango Invalido");//abre ventana errorr
			return -1;
		} else
			return puerto;
    }
    
    public void setNicknameUsuario(String nickUsuario){
        
    }

	
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bLogIn;
    private javax.swing.JTextField ipUsuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField nickUsuario;
    private javax.swing.JTextField puertoUsuario;
    // End of variables declaration//GEN-END:variables
}
