package presentacion;

import businessobject.CorreosGuardadosControl;
import businessobject.UsuarioControl;
import javax.swing.JOptionPane;

public class FrmLogin extends javax.swing.JFrame {

    private final CorreosGuardadosControl CONTROL;

    public FrmLogin () {
        initComponents();
        CONTROL = new CorreosGuardadosControl();
        CONTROL.listarCorreos(jtxtCorreo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTitle1 = new javax.swing.JLabel();
        jTitle = new javax.swing.JLabel();
        jVetXRay = new javax.swing.JLabel();
        jClock = new javax.swing.JLabel();
        jAstronautDog = new javax.swing.JLabel();
        jDog = new javax.swing.JLabel();
        jBrownBottonWave = new javax.swing.JLabel();
        jGreenTopWave = new javax.swing.JLabel();
        jTitle4 = new javax.swing.JLabel();
        jtxtPass = new javax.swing.JTextField();
        jtxtCorreo = new presentacion.files.componentes.TextFieldSuggestionCustom();
        jchRecordar = new presentacion.files.componentes.CheckBoxCustom();
        jCorreo = new javax.swing.JLabel();
        jPassword = new javax.swing.JLabel();
        jbtnOlvidasePass = new javax.swing.JButton();
        jtgPassword = new javax.swing.JToggleButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        labelError = new javax.swing.JLabel();
        jCat = new javax.swing.JLabel();
        jbtnIniciarSesion = new presentacion.files.componentes.ButtonCustom();
        panelCustom2 = new presentacion.files.componentes.PanelCustom();
        jGreenBackForm1 = new javax.swing.JLabel();
        jGreenBackForm2 = new javax.swing.JLabel();
        jbtnRegistrarse = new presentacion.files.componentes.ButtonCustom();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(232, 245, 254));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTitle1.setFont(new java.awt.Font("Gilroy-ExtraBold", 0, 48)); // NOI18N
        jTitle1.setForeground(new java.awt.Color(82, 183, 136));
        jTitle1.setText("<html>\nSistema de la\n<p>Veterinaria Pet Care</p>\n</html>");
        jPanel1.add(jTitle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, -1, -1));

        jTitle.setFont(new java.awt.Font("Gilroy-Regular", 0, 20)); // NOI18N
        jTitle.setForeground(new java.awt.Color(43, 45, 66));
        jTitle.setText("<html>\nMantén el control de tus mascotas\n<p>Conoce cuando será su próximo control</p>\n<p>Revisa nuestros productos disponibles</p>\n<p>Registrarte para tener acceso</p>\n</html>");
        jPanel1.add(jTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 245, -1, -1));

        jVetXRay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/files/iniciosesion/vetXRay.png"))); // NOI18N
        jPanel1.add(jVetXRay, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 482, -1, -1));

        jClock.setFont(new java.awt.Font("Gilroy-ExtraBold", 0, 48)); // NOI18N
        jClock.setForeground(new java.awt.Color(82, 183, 136));
        jClock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/files/iniciosesion/clockCalendar.png"))); // NOI18N
        jPanel1.add(jClock, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 253, -1, -1));

        jAstronautDog.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/files/iniciosesion/astronautDog.png"))); // NOI18N
        jPanel1.add(jAstronautDog, new org.netbeans.lib.awtextra.AbsoluteConstraints(507, 467, -1, -1));

        jDog.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/files/iniciosesion/dog.png"))); // NOI18N
        jPanel1.add(jDog, new org.netbeans.lib.awtextra.AbsoluteConstraints(568, 657, -1, -1));

        jBrownBottonWave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/files/iniciosesion/brownBottomWave.png"))); // NOI18N
        jPanel1.add(jBrownBottonWave, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 700, -1, -1));

        jGreenTopWave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/files/iniciosesion/greenTopWave.png"))); // NOI18N
        jPanel1.add(jGreenTopWave, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jTitle4.setFont(new java.awt.Font("Gilroy-ExtraBold", 0, 24)); // NOI18N
        jTitle4.setForeground(new java.awt.Color(82, 183, 136));
        jTitle4.setText("Completa tus datos");
        jPanel1.add(jTitle4, new org.netbeans.lib.awtextra.AbsoluteConstraints(816, 234, -1, -1));

        jtxtPass.setBackground(new java.awt.Color(255, 255, 255));
        jtxtPass.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        jtxtPass.setBorder(null);
        jPanel1.add(jtxtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 390, 150, 30));

        jtxtCorreo.setBorder(null);
        jtxtCorreo.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        jtxtCorreo.setSelectionColor(new java.awt.Color(82, 183, 136));
        jPanel1.add(jtxtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 310, 190, 30));

        jchRecordar.setBackground(new java.awt.Color(82, 183, 136));
        jchRecordar.setForeground(new java.awt.Color(43, 45, 66));
        jchRecordar.setText("Recordar correo electrónico");
        jchRecordar.setContentAreaFilled(false);
        jchRecordar.setFocusPainted(false);
        jchRecordar.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        jPanel1.add(jchRecordar, new org.netbeans.lib.awtextra.AbsoluteConstraints(816, 440, -1, -1));

        jCorreo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/files/textfield/txtCorreoElectronico.png"))); // NOI18N
        jPanel1.add(jCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(816, 304, -1, -1));

        jPassword.setBackground(new java.awt.Color(255, 255, 255));
        jPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/files/textfield/txtPassword.png"))); // NOI18N
        jPanel1.add(jPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(816, 385, -1, -1));

        jbtnOlvidasePass.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        jbtnOlvidasePass.setForeground(new java.awt.Color(82, 183, 136));
        jbtnOlvidasePass.setText("¿Olvidaste tu contraseña?");
        jbtnOlvidasePass.setBorderPainted(false);
        jbtnOlvidasePass.setContentAreaFilled(false);
        jbtnOlvidasePass.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnOlvidasePass.setFocusPainted(false);
        jbtnOlvidasePass.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jbtnOlvidasePass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnOlvidasePassActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnOlvidasePass, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 560, 180, -1));

        jtgPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/files/buttons/iconHidePassword.png"))); // NOI18N
        jtgPassword.setBorderPainted(false);
        jtgPassword.setContentAreaFilled(false);
        jtgPassword.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jtgPassword.setFocusPainted(false);
        jtgPassword.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/files/buttons/iconShowPassword.png"))); // NOI18N
        jtgPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtgPasswordActionPerformed(evt);
            }
        });
        jPanel1.add(jtgPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 393, 25, 25));

        jLabel4.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(43, 45, 66));
        jLabel4.setText("Correo electrónico");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(816, 277, -1, -1));

        jLabel8.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(43, 45, 66));
        jLabel8.setText("Contraseña");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(816, 358, -1, -1));

        labelError.setFont(new java.awt.Font("Gilroy-Regular", 0, 14)); // NOI18N
        labelError.setForeground(new java.awt.Color(228, 49, 49));
        jPanel1.add(labelError, new org.netbeans.lib.awtextra.AbsoluteConstraints(816, 470, 270, 20));

        jCat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/files/iniciosesion/catTopForm.png"))); // NOI18N
        jPanel1.add(jCat, new org.netbeans.lib.awtextra.AbsoluteConstraints(969, 132, -1, -1));

        jbtnIniciarSesion.setText("Iniciar sesión");
        jbtnIniciarSesion.setFocusPainted(false);
        jbtnIniciarSesion.setFont(new java.awt.Font("Gilroy-Regular", 0, 16)); // NOI18N
        jbtnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnIniciarSesionActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(815, 500, 280, 40));

        panelCustom2.setBackground(new java.awt.Color(255, 255, 255));
        panelCustom2.setRoundBottomLeft(20);
        panelCustom2.setRoundBottomRight(20);
        panelCustom2.setRoundTopLeft(20);
        panelCustom2.setRoundTopRight(20);

        javax.swing.GroupLayout panelCustom2Layout = new javax.swing.GroupLayout(panelCustom2);
        panelCustom2.setLayout(panelCustom2Layout);
        panelCustom2Layout.setHorizontalGroup(
            panelCustom2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );
        panelCustom2Layout.setVerticalGroup(
            panelCustom2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        jPanel1.add(panelCustom2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 200, 350, 400));

        jGreenBackForm1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/files/iniciosesion/greenBackForm.png"))); // NOI18N
        jPanel1.add(jGreenBackForm1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 405, -1, -1));

        jGreenBackForm2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/files/iniciosesion/greenBackForm.png"))); // NOI18N
        jPanel1.add(jGreenBackForm2, new org.netbeans.lib.awtextra.AbsoluteConstraints(755, 180, -1, -1));

        jbtnRegistrarse.setText("Registrarse");
        jbtnRegistrarse.setFocusPainted(false);
        jbtnRegistrarse.setFont(new java.awt.Font("Gilroy-Regular", 0, 16)); // NOI18N
        jbtnRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRegistrarseActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnRegistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 390, 240, 40));

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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRegistrarseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnRegistrarseActionPerformed

    private void jtgPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtgPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtgPasswordActionPerformed

    private void jbtnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnIniciarSesionActionPerformed
        UsuarioControl control = new UsuarioControl();
        String resp = control.login(jtxtCorreo.getText(), jtxtPass.getText());

        if (UsuarioControl.sonTextfieldsVacios(jtxtCorreo, jtxtPass)) {
            labelError.setText("Error, debe completar todos los campos.");
            return;
        }

        switch (resp) {
            case "0":
                JOptionPane.showMessageDialog(this, "Los datos de acceso son incorrectos.", "Sistema", JOptionPane.ERROR_MESSAGE);
                break;
            case "1":
                if (jchRecordar.isSelected()) {
                    CONTROL.guardarCorreo(jtxtCorreo.getText());
                }
                this.dispose();
                FrmPrincipal frm = new FrmPrincipal();
                frm.toFront();
                frm.setVisible(true);
                break;
            case "2":
                JOptionPane.showMessageDialog(this, "El usuario está inactivo", "Sistema", JOptionPane.ERROR_MESSAGE);
                break;
        }
    }//GEN-LAST:event_jbtnIniciarSesionActionPerformed

    private void jbtnOlvidasePassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnOlvidasePassActionPerformed
        DialogRecuperarPassword dialog = new DialogRecuperarPassword();
        dialog.setVisible(true);
    }//GEN-LAST:event_jbtnOlvidasePassActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main (String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DialogRecuperarPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DialogRecuperarPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DialogRecuperarPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DialogRecuperarPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run () {
                new FrmLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jAstronautDog;
    private javax.swing.JLabel jBrownBottonWave;
    private javax.swing.JLabel jCat;
    private javax.swing.JLabel jClock;
    private javax.swing.JLabel jCorreo;
    private javax.swing.JLabel jDog;
    private javax.swing.JLabel jGreenBackForm1;
    private javax.swing.JLabel jGreenBackForm2;
    private javax.swing.JLabel jGreenTopWave;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jPassword;
    private javax.swing.JLabel jTitle;
    private javax.swing.JLabel jTitle1;
    private javax.swing.JLabel jTitle4;
    private javax.swing.JLabel jVetXRay;
    private presentacion.files.componentes.ButtonCustom jbtnIniciarSesion;
    private javax.swing.JButton jbtnOlvidasePass;
    private presentacion.files.componentes.ButtonCustom jbtnRegistrarse;
    private presentacion.files.componentes.CheckBoxCustom jchRecordar;
    private javax.swing.JToggleButton jtgPassword;
    private presentacion.files.componentes.TextFieldSuggestionCustom jtxtCorreo;
    private javax.swing.JTextField jtxtPass;
    private javax.swing.JLabel labelError;
    private presentacion.files.componentes.PanelCustom panelCustom2;
    // End of variables declaration//GEN-END:variables
}
