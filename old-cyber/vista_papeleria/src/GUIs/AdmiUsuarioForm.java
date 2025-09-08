package GUIs;

import GUIs.utils.JTextFieldLimit;
import entidades.Usuario;
import enumeradores.Rol;
import fachada.FachadaControl;
import interfaces.IFachadaControl;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AdmiUsuarioForm extends javax.swing.JFrame {

    private static AdmiUsuarioForm admiUsuarioForm;
    private IFachadaControl logica;
    private List<Usuario> usuarios;

    private AdmiUsuarioForm() {
        initComponents();
        logica = new FachadaControl();
        tblUsuarios.getTableHeader().setReorderingAllowed(false);
        txtNombre.setDocument(new JTextFieldLimit(45));
        txtPassword.setDocument(new JTextFieldLimit(20));

        setDefaultCloseOperation(AdmiUsuarioForm.DISPOSE_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                limpiarFormulario();
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        spdH = new javax.swing.JPanel();
        lblusuarios = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        lblNombre1 = new javax.swing.JLabel();
        spdV = new javax.swing.JSeparator();
        lblRegistros = new javax.swing.JLabel();
        lblRegistrar = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        spnlTablaUsuarios = new javax.swing.JScrollPane();
        tblUsuarios = new javax.swing.JTable();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        cmbRoles = new javax.swing.JComboBox<>();
        lblRectangulo4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Administracion Usuario");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        spdH.setBackground(new java.awt.Color(255, 255, 255));
        spdH.setPreferredSize(new java.awt.Dimension(1100, 650));
        spdH.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblusuarios.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblusuarios.setText("USUARIOS");
        spdH.add(lblusuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, -1, -1));

        txtID.setEditable(false);
        txtID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        spdH.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 300, -1));

        lblNombre1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblNombre1.setText("ID");
        spdH.add(lblNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));
        spdH.add(spdV, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 80, 1120, 10));

        lblRegistros.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblRegistros.setText("REGISTROS");
        spdH.add(lblRegistros, new org.netbeans.lib.awtextra.AbsoluteConstraints(724, 114, -1, -1));

        lblRegistrar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblRegistrar.setText("REGISTRAR");
        spdH.add(lblRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, -1, -1));

        lblNombre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblNombre.setText("Nombre");
        spdH.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Password");
        spdH.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("ROL");
        spdH.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, -1, -1));

        txtNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        spdH.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 300, -1));

        txtPassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        spdH.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 300, -1));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        spdH.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, 10, 540));

        spnlTablaUsuarios.setBackground(new java.awt.Color(204, 204, 255));
        spnlTablaUsuarios.setBorder(null);

        tblUsuarios.setBackground(new java.awt.Color(204, 204, 255));
        tblUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Password", "Rol"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblUsuarios.setToolTipText("1 click Actualizar, 2 click Eliminar");
        tblUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblUsuariosMouseClicked(evt);
            }
        });
        spnlTablaUsuarios.setViewportView(tblUsuarios);

        spdH.add(spnlTablaUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 160, 649, 440));

        btnGuardar.setBackground(new java.awt.Color(0, 0, 255));
        btnGuardar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/guardar.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, new java.awt.Color(0, 153, 255), java.awt.Color.white, java.awt.Color.white));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        spdH.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 150, -1));

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
        spdH.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 470, 150, -1));

        cmbRoles.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbRoles.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ADMINISTRADOR", "VENDEDOR", "TECNICO" }));
        spdH.add(cmbRoles, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, 300, -1));

        lblRectangulo4.setBackground(new java.awt.Color(204, 204, 255));
        lblRectangulo4.setOpaque(true);
        spdH.add(lblRectangulo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 420, 300));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(spdH, javax.swing.GroupLayout.DEFAULT_SIZE, 1115, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(spdH, javax.swing.GroupLayout.Alignment.TRAILING, 627, 627, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        if (this.btnGuardar.getText().equalsIgnoreCase("Guardar")) {

            if (validarCamposLlenos()) {
                if (validarFormulario() == false) {
                    return;
                }
                String nombre = this.txtNombre.getText();
                String password = this.txtPassword.getText();
                Rol rol = Rol.valueOf(cmbRoles.getItemAt(cmbRoles.getSelectedIndex()));
                Usuario usuario = new Usuario(nombre, password, rol);
                boolean seAgregoProdcuto = logica.agregarUsuario(usuario);
                if (seAgregoProdcuto) {
                    JOptionPane.showMessageDialog(this, "Se agregó el nuevo usuario", "Información", JOptionPane.INFORMATION_MESSAGE);
                    this.limpiarFormulario();
                    this.llenarTabla();
                } else {
                    JOptionPane.showMessageDialog(this, "No fue posible agregar al usuario", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }

        }
        if (this.btnGuardar.getText().equalsIgnoreCase("Editar")) {
            if (validarCamposLlenos()) {
                if (validarFormulario() == false) {
                    return;
                }
                int id = Integer.parseInt(this.txtID.getText());
                String nombre = this.txtNombre.getText();
                String password = this.txtPassword.getText();
                Rol rol = Rol.valueOf(cmbRoles.getSelectedItem().toString());
                Usuario usuario = new Usuario(id, nombre, password, rol);
                boolean seActualizo = logica.actualizarUsuario(usuario);
                if (seActualizo) {
                    JOptionPane.showMessageDialog(this, "Se actualizó al usuario", "Información", JOptionPane.INFORMATION_MESSAGE);
                    this.limpiarFormulario();
                    this.llenarTabla();
                } else {
                    JOptionPane.showMessageDialog(this, "No fue posible actualizar al usuario", "Información", JOptionPane.ERROR_MESSAGE);
                }
            }

        }
        if (this.btnGuardar.getText().equalsIgnoreCase("Eliminar")) {
            int id = Integer.parseInt(this.txtID.getText());

            int opcionSeleccionada = JOptionPane.showConfirmDialog(this, "¿Seguro que deseas eliminar al usuario seleccionado?", "Confirmación", JOptionPane.YES_NO_OPTION);
            if (opcionSeleccionada == JOptionPane.YES_OPTION) {
                boolean seElimino = logica.eliminarUsuario(id);

                if (seElimino) {
                    JOptionPane.showMessageDialog(this, "Se eliminó al usuario", "Información", JOptionPane.INFORMATION_MESSAGE);
                    this.llenarTabla();
                } else {
                    JOptionPane.showMessageDialog(this, "No fue posible eliminar al usuario", "Información", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.limpiarFormulario();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        setVisible(false);
        dispose();
        PrincipalForm.getInstance().setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void tblUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblUsuariosMouseClicked
        int filaSeleccionada = tblUsuarios.getSelectedRow();
        if (filaSeleccionada != -1) {
            Object id = tblUsuarios.getValueAt(filaSeleccionada, 0);
            Usuario categoria = this.usuarios.get(this.usuarios.indexOf(new Usuario((int) id)));
            this.llenarFormulario(categoria);
            if (evt.getClickCount() == 1) {
                this.editarBoton();
            } else if (evt.getClickCount() == 2) {
                this.eliminarBoton();
            }
        }
        tblUsuarios.clearSelection(); // Esto limpia la selección
    }//GEN-LAST:event_tblUsuariosMouseClicked

    public static AdmiUsuarioForm getInstance() {
        if (admiUsuarioForm == null) {
            admiUsuarioForm = new AdmiUsuarioForm();
        }
        return admiUsuarioForm;
    }

    public void llenarTabla() {
        usuarios = logica.consultarTodosUsuarios();
        if (usuarios != null ) {
            DefaultTableModel modeloTabla = (DefaultTableModel) this.tblUsuarios.getModel();
            this.tblUsuarios.setRowHeight(30);
            modeloTabla.setRowCount(0);
            usuarios.forEach(usuario -> {
                Object[] fila = new Object[4];
                fila[0] = usuario.getId();
                fila[1] = usuario.getNombre();
                fila[2] = usuario.getPassword();
                fila[3] = usuario.getRol();
                modeloTabla.addRow(fila);
            });
        }

    }

    private void limpiarFormulario() {
        txtNombre.setText("");
        txtPassword.setText("");
        cmbRoles.setSelectedIndex(0);
        this.txtID.setText("");
        this.guardarBoton();
    }

    private void llenarFormulario(Usuario usuario) {
        txtID.setText(""+usuario.getId());
        txtNombre.setText(usuario.getNombre());
        txtPassword.setText(usuario.getPassword());
        cmbRoles.setSelectedItem(usuario.getRol().toString());
    }

    private boolean validarCamposLlenos() {
        if (txtNombre.getText().isEmpty()) {
            return false;
        }
        if (txtPassword.getText().isEmpty()) {
            return false;
        }

        return true;
    }

    private boolean validarFormulario() {
        String mensajeError = "";
        mensajeError = (validarSoloLetras(txtNombre.getText())) ? mensajeError : mensajeError + "El nombre debe contener solo letras\n";
        mensajeError = (txtPassword.getText().length() >= 8) ? mensajeError : mensajeError + "El password debe de ser de mínimo 8 caracteres";
        if ("".equals(mensajeError)) {
            return true;
        } else {
            JOptionPane.showMessageDialog(this, mensajeError, "Información", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
    }

    private boolean validarSoloLetras(String string) {
        Pattern pattern = Pattern.compile("[\\d\\p{Punct}]");
        Matcher matcher = pattern.matcher(string);
        return !matcher.find();
    }

    private void editarBoton() {
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/editar.png")));
        btnGuardar.setText("Editar");
    }

    private void eliminarBoton() {
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/eliminar.png")));
        btnGuardar.setText("Eliminar");
    }

    private void guardarBoton() {
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/guardar.png")));
        btnGuardar.setText("Guardar");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> cmbRoles;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombre1;
    private javax.swing.JLabel lblRectangulo4;
    private javax.swing.JLabel lblRegistrar;
    private javax.swing.JLabel lblRegistros;
    private javax.swing.JLabel lblusuarios;
    private javax.swing.JPanel spdH;
    private javax.swing.JSeparator spdV;
    private javax.swing.JScrollPane spnlTablaUsuarios;
    private javax.swing.JTable tblUsuarios;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPassword;
    // End of variables declaration//GEN-END:variables

}
