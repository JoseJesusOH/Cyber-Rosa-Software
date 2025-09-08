package GUIs;

import GUIs.utils.JTextFieldLimit;
import entidades.Cliente;
import fachada.FachadaControl;
import interfaces.IFachadaControl;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AdmiClienteForm extends javax.swing.JFrame {
    private List<Cliente> clientes;
    private static AdmiClienteForm admiClienteForm;
    private final IFachadaControl logica;

    private AdmiClienteForm() {
        initComponents();
        this.logica = new FachadaControl();
        tbClientes.getTableHeader().setReorderingAllowed(false);
        jTextFieldNombre.setDocument(new JTextFieldLimit(45));
        jTextFieldEmail.setDocument(new JTextFieldLimit(100));
        jTextFieldTelefono.setDocument(new JTextFieldLimit(15));
        jTextFieldRFC.setDocument(new JTextFieldLimit(13));
        setDefaultCloseOperation(AdmiClienteForm.DISPOSE_ON_CLOSE);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldRFC = new javax.swing.JTextField();
        jTextFieldEmail = new javax.swing.JTextField();
        jTextFieldTelefono = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbClientes = new javax.swing.JTable();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        lblRectangulo4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Administracion Clientes");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1100, 650));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("CLIENTES");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 1110, 10));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("REGISTROS");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(724, 114, -1, -1));

        jLabel3.setText("Cliente");
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 114, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("ID");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, -1, -1));

        txtID.setEditable(false);
        txtID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 300, -1));

        jLabel4.setText("Nombre");
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        jLabel5.setText("RFC");
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, -1, -1));

        jLabel6.setText("Email");
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Telefono");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, -1, -1));

        jTextFieldNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(jTextFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 300, -1));

        jTextFieldRFC.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(jTextFieldRFC, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 300, -1));

        jTextFieldEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(jTextFieldEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 380, 300, -1));

        jTextFieldTelefono.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(jTextFieldTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 450, 300, -1));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator2.setToolTipText("");
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 82, 10, 540));

        jScrollPane1.setBackground(new java.awt.Color(204, 204, 255));
        jScrollPane1.setBorder(null);

        tbClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "RFC", "Email", "Teléfono"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbClientes.setBackground(new java.awt.Color(204, 204, 255));
        tbClientes.setToolTipText("1 click Actualizar, 2 click Eliminar");
        tbClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbClientes);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 180, 655, 440));

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/guardar.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setBackground(new java.awt.Color(0, 0, 255));
        btnGuardar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, new java.awt.Color(0, 153, 255), new java.awt.Color(255, 255, 255), new java.awt.Color(0, 153, 255)));
        btnGuardar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 540, 140, -1));

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancelar.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setBackground(new java.awt.Color(0, 0, 255));
        btnCancelar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, new java.awt.Color(0, 153, 255), java.awt.Color.white, null));
        btnCancelar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 540, 140, -1));

        lblRectangulo4.setBackground(new java.awt.Color(204, 204, 255));
        lblRectangulo4.setOpaque(true);
        jPanel1.add(lblRectangulo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 420, 360));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1112, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 633, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (this.btnGuardar.getText().equalsIgnoreCase("Guardar")) {
            if (validarCamposLlenos()) {
                if (validarDatos()) {
                    return;
                }
                String nombre = jTextFieldNombre.getText();
                String rfc = jTextFieldRFC.getText();
                String email = jTextFieldEmail.getText();
                String telefono = jTextFieldTelefono.getText();
                Cliente cliente = new Cliente(nombre, rfc, email, telefono);

                boolean seAgrego = logica.agregarCliente(cliente);

                if (seAgrego) {
                                        this.limpiarFormulario();
                    JOptionPane.showMessageDialog(this, "Se agregó el nuevo cliente", "Información", JOptionPane.INFORMATION_MESSAGE);
                    this.llenarTabla();
                } else {
                    JOptionPane.showMessageDialog(this, "No fue posible agregar el cliente", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }

        }
        if (this.btnGuardar.getText().equalsIgnoreCase("Editar")) {

            if (validarCamposLlenos()) {
                if (validarDatos()) {
                    return;
                }
                int id = Integer.parseInt(txtID.getText());
                String nombre = jTextFieldNombre.getText();
                String rfc = jTextFieldRFC.getText();
                String email = jTextFieldEmail.getText();
                String telefono = jTextFieldTelefono.getText();
                Cliente cliente = new Cliente(id, nombre, rfc, email, telefono);
                boolean seActualizo = logica.actualizarCliente(cliente);
                if (seActualizo) {
                                        this.limpiarFormulario();
                    JOptionPane.showMessageDialog(this, "Se actualizó el cliente", "Información", JOptionPane.INFORMATION_MESSAGE);
                    this.llenarTabla();
                } else {
                    JOptionPane.showMessageDialog(this, "No fue posible actualizar el cliente", "Información", JOptionPane.ERROR_MESSAGE);
                }
            }

        }
        if (this.btnGuardar.getText().equalsIgnoreCase("Eliminar")) {
            int id = Integer.parseInt(txtID.getText());

            int opcionSeleccionada = JOptionPane.showConfirmDialog(null, "¿Seguro que deseas eliminar el cliente seleccionado?", "Confirmación", JOptionPane.YES_NO_OPTION);

            if (opcionSeleccionada == JOptionPane.YES_OPTION) {
                boolean seElimino = logica.eliminarCliente(id);
                if (seElimino) {
                                        this.limpiarFormulario();
                    JOptionPane.showMessageDialog(null, "Se eliminó el cliente", "Información", JOptionPane.INFORMATION_MESSAGE);
                    this.llenarTabla();
                } else {
                    JOptionPane.showMessageDialog(null, "No fue posible eliminar al cliente", "Información", JOptionPane.ERROR_MESSAGE);
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

    private void tbClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbClientesMouseClicked
        int filaSeleccionada = tbClientes.getSelectedRow();
        if (filaSeleccionada != -1) {
            Object id = tbClientes.getValueAt(filaSeleccionada, 0);
            Cliente cliente = this.clientes.get(this.clientes.indexOf(new Cliente((int)id)));
            this.llenarFormulario(cliente);
            if (evt.getClickCount() == 1) {
                this.editarBoton();
            } else if (evt.getClickCount() == 2) {
                this.eliminarBoton();
            }
        }
        tbClientes.clearSelection(); // Esto limpia la selección
    }//GEN-LAST:event_tbClientesMouseClicked

  public static AdmiClienteForm getInstance() {
        if (admiClienteForm == null) {
            admiClienteForm = new AdmiClienteForm();
        }
        return admiClienteForm;
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

    private void llenarFormulario(Cliente cliente) {
        jTextFieldNombre.setText(cliente.getNombre());
        jTextFieldTelefono.setText(cliente.getTelefono());
        jTextFieldEmail.setText(cliente.getEmail());
        jTextFieldRFC.setText(cliente.getRfc());
        txtID.setText("" + cliente.getId());
    }

    public boolean validarDatos() {

        if (!jTextFieldNombre.getText().matches("^([A-Za-z]+\\s?)+$")) {
            JOptionPane.showMessageDialog(null, "El nombre solo puede contener letras mayúsculas y minúsculas, incluyendo espacios entre nombres");
            return true;
        }

        if (!jTextFieldRFC.getText().matches("[A-Z]{4}\\d{6}[A-Z0-9]{3}")) {
            JOptionPane.showMessageDialog(null, "El RFC tiene un formato invalido");

            return true;
        }
        if (!jTextFieldEmail.getText().matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) {
            JOptionPane.showMessageDialog(null, "El correo tiene un formato invalido");
            return true;
        }
        if (!jTextFieldTelefono.getText().matches("\\d{10}")) {
            JOptionPane.showMessageDialog(null, "Se requiere que ingrese un numero de 10 digitos, no ingrese caracteres extraños");
            return true;
        }
        return false;
    }

    private boolean validarCamposLlenos() {

        if (jTextFieldNombre.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Se requiere que ingrese el nombre del cliente");
            return false;
        }
        if (jTextFieldEmail.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Se requiere que ingrese el email del cliente");
            return false;
        }
        if (jTextFieldRFC.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Se requiere que ingrese el RFC del cliente");
            return false;
        }
        if (jTextFieldTelefono.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Se requiere que ingrese el telefono del cliente");
            return false;
        }
        return true;
    }

    public  void llenarTabla() {
        clientes = this.logica.consultarTodosClientes();
        if (clientes != null ) {
            DefaultTableModel modeloTabla = (DefaultTableModel) this.tbClientes.getModel();
            this.tbClientes.setRowHeight(30);
            modeloTabla.setRowCount(0);
            clientes.forEach(cliente -> {
                Object[] fila = new Object[5];
                fila[0] = cliente.getId();
                fila[1] = cliente.getNombre();
                fila[2] = cliente.getRfc();
                fila[3] = cliente.getEmail();
                fila[4] = cliente.getTelefono();
                modeloTabla.addRow(fila);
            });
        }

    }

    private void limpiarFormulario() {
        jTextFieldNombre.setText("");
        jTextFieldEmail.setText("");
        jTextFieldTelefono.setText("");
        jTextFieldRFC.setText("");
        txtID.setText("");
        this.guardarBoton();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldRFC;
    private javax.swing.JTextField jTextFieldTelefono;
    private javax.swing.JLabel lblRectangulo4;
    private javax.swing.JTable tbClientes;
    private javax.swing.JTextField txtID;
    // End of variables declaration//GEN-END:variables
}
