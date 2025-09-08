package GUIs;

import GUIs.utils.JTextFieldLimit;
import entidades.Usuario;
import enumeradores.Rol;
import fachada.FachadaControl;
import interfaces.IFachadaControl;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class InicioSesion extends javax.swing.JFrame {

    private IFachadaControl control;
    private static InicioSesion instance;
    private boolean contraseñaVisible = false;

    
    private InicioSesion() {
        initComponents();
        this.control = new FachadaControl();
        this.jTextFieldUsuario.setDocument(new JTextFieldLimit(45));
        this.jTextFieldUsuario.setDocument(new JTextFieldLimit(20));
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldUsuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPasswordFieldContraseña = new javax.swing.JPasswordField();
        jButtonIniciarSesion = new javax.swing.JButton();
        cmbRoles = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        visibilidad = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Inicio Sesion");
        setMinimumSize(new java.awt.Dimension(730, 510));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(39, 18, 48));
        jPanel1.setPreferredSize(new java.awt.Dimension(750, 590));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Iniciar Sesión");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(440, 20, 240, 50);

        jTextFieldUsuario.setBackground(new java.awt.Color(39, 18, 48));
        jTextFieldUsuario.setColumns(10);
        jTextFieldUsuario.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jTextFieldUsuario.setForeground(new java.awt.Color(153, 153, 255));
        jTextFieldUsuario.setBorder(null);
        jPanel1.add(jTextFieldUsuario);
        jTextFieldUsuario.setBounds(450, 130, 240, 40);

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Usuario");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(410, 90, 90, 40);

        jPasswordFieldContraseña.setBackground(new java.awt.Color(39, 18, 48));
        jPasswordFieldContraseña.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jPasswordFieldContraseña.setForeground(new java.awt.Color(153, 153, 255));
        jPasswordFieldContraseña.setBorder(null);
        jPanel1.add(jPasswordFieldContraseña);
        jPasswordFieldContraseña.setBounds(450, 240, 240, 40);

        jButtonIniciarSesion.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jButtonIniciarSesion.setText("Iniciar");
        jButtonIniciarSesion.setBorder(null);
        jButtonIniciarSesion.setFocusPainted(false);
        jButtonIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIniciarSesionActionPerformed(evt);
            }
        });
        jButtonIniciarSesion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonIniciarSesionKeyPressed(evt);
            }
        });
        jPanel1.add(jButtonIniciarSesion);
        jButtonIniciarSesion.setBounds(480, 420, 140, 40);

        cmbRoles.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbRoles.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ADMINISTRADOR", "VENDEDOR" }));
        cmbRoles.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmbRolesKeyPressed(evt);
            }
        });
        jPanel1.add(cmbRoles);
        cmbRoles.setBounds(410, 330, 260, 40);

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Contraseña");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(410, 190, 130, 40);

        jSeparator3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator3);
        jSeparator3.setBounds(410, 280, 280, 10);

        jSeparator4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator4);
        jSeparator4.setBounds(410, 170, 270, 10);

        visibilidad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/contra4.png"))); // NOI18N
        visibilidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                visibilidadMouseClicked(evt);
            }
        });
        jPanel1.add(visibilidad);
        visibilidad.setBounds(410, 250, 40, 30);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/usuariolila.png"))); // NOI18N
        jPanel1.add(jLabel9);
        jLabel9.setBounds(410, 140, 30, 30);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/inicio3.jpg"))); // NOI18N
        jLabel7.setText("jLabel7");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(-10, 0, 360, 480);

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Rol");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(410, 290, 130, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 730, 570);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonIniciarSesionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonIniciarSesionKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            this.iniciar();
        }
    }//GEN-LAST:event_jButtonIniciarSesionKeyPressed

    private void cmbRolesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbRolesKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_UP) {
            int indiceCombo = this.cmbRoles.getSelectedIndex();
            if (indiceCombo == 2) {
                this.cmbRoles.setSelectedIndex(0);
            } else {
                this.cmbRoles.setSelectedIndex(indiceCombo + 1);
            }
        }
        if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
            int indiceCombo = this.cmbRoles.getSelectedIndex();
            if (indiceCombo == 0) {
                this.cmbRoles.setSelectedIndex(2);
            } else {
                this.cmbRoles.setSelectedIndex(indiceCombo - 1);
            }
        }
    }//GEN-LAST:event_cmbRolesKeyPressed

    private void jButtonIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIniciarSesionActionPerformed
        this.iniciar();
    }//GEN-LAST:event_jButtonIniciarSesionActionPerformed

    private void visibilidadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_visibilidadMouseClicked
        if (!jPasswordFieldContraseña.getText().isEmpty()) {
            contraseñaVisible = !contraseñaVisible;
            char[] contraseña = jPasswordFieldContraseña.getPassword();
            if (contraseñaVisible) {
                visibilidad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/desbloquear.png")));
            } else {
                jPasswordFieldContraseña.setEchoChar('*'); // Ocultar la contraseña con *
                visibilidad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/contra4.png")));
            }
            jPasswordFieldContraseña.setText(new String(contraseña));
        }
    }//GEN-LAST:event_visibilidadMouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        //Metodo para cerrar la caja y todos sus derivados
    }//GEN-LAST:event_formWindowClosing
    
    public static InicioSesion getInstance() {
        if (instance == null) {
            instance = new InicioSesion();
        }
        return instance;
    }
    public void iniciar() {
        if (validarCamposVacios()) {
            return;
        }
        String usuarioNombre = this.jTextFieldUsuario.getText().trim();
        String contrasena = this.jPasswordFieldContraseña.getText().trim();
        int indice = this.cmbRoles.getSelectedIndex();
        Rol rol = Rol.valueOf(this.cmbRoles.getItemAt(indice));
        Usuario usuario = new Usuario(usuarioNombre, contrasena, rol);
        boolean esta = this.control.iniciarSesion(usuario);
        if (esta) {
            this.limpiarCampos();
            this.setVisible(false);
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    PrincipalForm.getInstance().establecerSession(usuario);
                    PrincipalForm.getInstance().setVisible(true);
                }
            });
        } else {
            JOptionPane.showMessageDialog(null, "No se ha determinado la existencia de un usuario");
        }
    }

    public void limpiarCampos() {
        this.jLabel2.setText("Iniciar sesión");
        this.jTextFieldUsuario.setText("");
        this.jPasswordFieldContraseña.setText("");
        this.cmbRoles.setSelectedIndex(0);
        this.cmbRoles.setEnabled(true);
    }

    public boolean validarCamposVacios() {
        if (this.jTextFieldUsuario.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Se requiere que ingrese el usuario");
            return true;
        }
        if (this.jPasswordFieldContraseña.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Se requiere que ingrese el password");
            return true;
        }
        return false;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbRoles;
    private javax.swing.JButton jButtonIniciarSesion;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordFieldContraseña;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField jTextFieldUsuario;
    private javax.swing.JLabel visibilidad;
    // End of variables declaration//GEN-END:variables
}
