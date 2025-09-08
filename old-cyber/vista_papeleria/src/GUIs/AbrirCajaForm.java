package GUIs;

import entidades.*;
import enumeradores.Estado;
import fachada.FachadaControl;
import interfaces.IFachadaControl;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class AbrirCajaForm extends javax.swing.JFrame {

    private static AbrirCajaForm abrirCaja;
    private IFachadaControl logica;

    private AbrirCajaForm() {
        initComponents();
        txtFecha.setEditable(false);
        this.logica = new FachadaControl();
        this.setLocationRelativeTo(null);
        llenarCampos();
        llenarCBoxUsuarios();
    }

    public void mostrarFormulario() {
        abrirCaja.setLocationRelativeTo(null);
        abrirCaja.setVisible(true);

    }

    public void cerrarCajaForm() {
        abrirCaja.dispose();
        PrincipalForm.getInstance().setVisible(true);
    }

    public static AbrirCajaForm instanciaAbrirCaja() {
        if (abrirCaja == null) {
            abrirCaja = new AbrirCajaForm();
        }
        return abrirCaja;
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtSaldoInicial = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        btnAbrir1 = new javax.swing.JButton();
        comboBoxUsuarios = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblRectangulo4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Administración Caja");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("APERTURA DE CAJA");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Operador:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Fecha:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Saldo Inicial:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, -1, -1));

        txtSaldoInicial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSaldoInicialKeyTyped(evt);
            }
        });
        jPanel1.add(txtSaldoInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 140, 30));

        txtFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaActionPerformed(evt);
            }
        });
        jPanel1.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 260, 30));

        btnCancelar.setBackground(new java.awt.Color(0, 0, 255));
        btnCancelar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancelar.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, new java.awt.Color(0, 153, 255), java.awt.Color.white, java.awt.Color.white));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 330, 120, 40));

        btnAbrir1.setBackground(new java.awt.Color(0, 0, 255));
        btnAbrir1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAbrir1.setForeground(new java.awt.Color(255, 255, 255));
        btnAbrir1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/abrir.png"))); // NOI18N
        btnAbrir1.setText("Abrir");
        btnAbrir1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, new java.awt.Color(0, 153, 255), java.awt.Color.white, java.awt.Color.white));
        btnAbrir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrir1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnAbrir1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 120, 40));

        jPanel1.add(comboBoxUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 260, 30));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 200, -1, -1));
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 240, 80, 50));
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 240, 80, 50));
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 240, 80, 50));
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 300, 80, 50));
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 380, 150, 30));

        lblRectangulo4.setBackground(new java.awt.Color(204, 204, 255));
        lblRectangulo4.setOpaque(true);
        jPanel1.add(lblRectangulo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 500, 220));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limpiarCampos();
        cerrarCajaForm();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAbrir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrir1ActionPerformed
        if (validarDatos()) {
            return;
        }
        Caja c = new Caja();
        c.setEstado(Estado.ABIERTA);
        c.setFechaApertura(Calendar.getInstance());
        c.setSaldoInicial(Float.parseFloat(this.txtSaldoInicial.getText()));
        int seleccionado = comboBoxUsuarios.getSelectedIndex();
        c.setUsuario(usuarios.get(seleccionado));
        if (logica.consultarCajaAbierta() == null) {
            logica.agregarCaja(c);
            this.cerrarCajaForm();
        }
    }//GEN-LAST:event_btnAbrir1ActionPerformed

    private void txtSaldoInicialKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSaldoInicialKeyTyped
        numeroDecimal(evt);
    }//GEN-LAST:event_txtSaldoInicialKeyTyped

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        limpiarCampos();   
        setVisible(false);
        dispose();
        PrincipalForm.getInstance().setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void txtFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaActionPerformed
        
    }//GEN-LAST:event_txtFechaActionPerformed
    private List<Usuario> usuarios;

    private void llenarCBoxUsuarios() {
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        this.usuarios = logica.consultarTodosUsuarios();
        for (int i = 0; i < usuarios.size(); i++) {
            Usuario get = usuarios.get(i);
            model.addElement(get.getNombre());
        }
        comboBoxUsuarios.setModel(model);
    }

    public void llenarCampos() {
        Calendar fechaC = Calendar.getInstance();
        Date fecha = fechaC.getTime();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd-MM-yyyy");
        String fechaFormateada = formatoFecha.format(fecha);
        this.txtFecha.setText(fechaFormateada);
    }

    public void limpiarCampos() {
        abrirCaja.txtSaldoInicial.setText("");
        comboBoxUsuarios.setSelectedIndex(0);
    }

    public boolean validarDatos() {
        String regexFloat = "\\d+(\\.\\d+)?";
        if (!txtSaldoInicial.getText().matches(regexFloat) || Float.parseFloat(txtSaldoInicial.getText()) <= 0 || Float.parseFloat(txtSaldoInicial.getText()) > 999999999) {
            JOptionPane.showMessageDialog(null, "Se requiere que ingrese un numero mayor a 0 y no mayor a 9999999910");
            return true;
        }
        return false;
    }

    public void numeroDecimal(java.awt.event.KeyEvent evt) {
        char car = evt.getKeyChar();
        if (Character.isDigit(car) || car == '.') {

        } else {
            evt.consume();
            getToolkit().beep();
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbrir1;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JComboBox<String> comboBoxUsuarios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblRectangulo4;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtSaldoInicial;
    // End of variables declaration//GEN-END:variables
}
