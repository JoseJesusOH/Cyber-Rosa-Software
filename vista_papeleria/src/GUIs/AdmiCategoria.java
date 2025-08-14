package GUIs;

import GUIs.utils.JTextFieldLimit;
import entidades.Categoria;
import fachada.FachadaControl;
import interfaces.IFachadaControl;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AdmiCategoria extends javax.swing.JFrame {

    private final IFachadaControl logica;
    private List<Categoria> categorias;
    private static AdmiCategoria admiCategoria;

    private AdmiCategoria() {
        initComponents();
        tblCategorias.getTableHeader().setReorderingAllowed(false);
        txtNombre.setDocument(new JTextFieldLimit(50));
        logica = new FachadaControl();
        setDefaultCloseOperation(AdmiCategoria.DISPOSE_ON_CLOSE);
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

        pnlCategorias = new javax.swing.JPanel();
        lblCategorias = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblRegistros = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        lblNombre1 = new javax.swing.JLabel();
        lblRegistrar = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        splnRegistros = new javax.swing.JScrollPane();
        tblCategorias = new javax.swing.JTable();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        lblRectangulo4 = new javax.swing.JLabel();
        lblNombre2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Administracion Categoria");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        pnlCategorias.setBackground(new java.awt.Color(255, 255, 255));
        pnlCategorias.setPreferredSize(new java.awt.Dimension(1100, 650));
        pnlCategorias.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCategorias.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblCategorias.setText("Categorias");
        pnlCategorias.add(lblCategorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, -1, -1));
        pnlCategorias.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1000, 10));

        lblRegistros.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblRegistros.setText("REGISTROS");
        pnlCategorias.add(lblRegistros, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 110, -1, -1));

        txtID.setEditable(false);
        txtID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pnlCategorias.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 300, -1));

        lblNombre1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblNombre1.setText("ID");
        pnlCategorias.add(lblNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, -1, -1));

        lblRegistrar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblRegistrar.setText("Categoria");
        pnlCategorias.add(lblRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 114, -1, -1));

        lblNombre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblNombre.setText("Nombre");
        pnlCategorias.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        txtNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pnlCategorias.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 300, -1));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        pnlCategorias.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, 10, 424));

        splnRegistros.setBackground(new java.awt.Color(204, 204, 255));
        splnRegistros.setBorder(null);

        tblCategorias.setBackground(new java.awt.Color(204, 204, 255));
        tblCategorias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCategorias.setToolTipText("1 click Actualizar, 2 click Eliminar");
        tblCategorias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCategoriasMouseClicked(evt);
            }
        });
        splnRegistros.setViewportView(tblCategorias);

        pnlCategorias.add(splnRegistros, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 170, 561, 279));

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
        pnlCategorias.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 132, -1));

        btnCancelar.setBackground(new java.awt.Color(0, 0, 255));
        btnCancelar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancelar.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setToolTipText("");
        btnCancelar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, new java.awt.Color(0, 153, 255), java.awt.Color.white, java.awt.Color.white));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        pnlCategorias.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, -1, -1));

        lblRectangulo4.setBackground(new java.awt.Color(204, 204, 255));
        lblRectangulo4.setOpaque(true);
        pnlCategorias.add(lblRectangulo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 420, 110));

        lblNombre2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblNombre2.setText("Nombre");
        pnlCategorias.add(lblNombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlCategorias, javax.swing.GroupLayout.DEFAULT_SIZE, 1022, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlCategorias, javax.swing.GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (this.btnGuardar.getText().equalsIgnoreCase("Guardar")) {
            if (validarCamposLlenos()) {
                String nombre = this.txtNombre.getText();
                Categoria categoria = new Categoria(nombre);
                boolean seAgregoProdcuto = logica.agregarCategoria(categoria);
                if (seAgregoProdcuto) {
                                        this.limpiarFormulario();
                    JOptionPane.showMessageDialog(this, "Se agregó la nueva categoria", "Información", JOptionPane.INFORMATION_MESSAGE);
                    this.llenarTabla();
                } else {
                    JOptionPane.showMessageDialog(this, "No fue posible agregar la categoria", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        if (this.btnGuardar.getText().equalsIgnoreCase("Editar")) {

            if (validarCamposLlenos()) {
                int id = Integer.parseInt(this.txtID.getText());
                String nombre = txtNombre.getText();
                Categoria categoria = new Categoria(id, nombre);
                boolean seActualizo = logica.actualizarCategoria(categoria);
                if (seActualizo) {
                                        this.limpiarFormulario();
                    JOptionPane.showMessageDialog(this, "Se actualizó la categoria", "Información", JOptionPane.INFORMATION_MESSAGE);
                    this.llenarTabla();
                } else {
                    JOptionPane.showMessageDialog(this, "No fue posible actualizar la categoria", "Información", JOptionPane.ERROR_MESSAGE);
                }
            } 
        }
        if (this.btnGuardar.getText().equalsIgnoreCase("Eliminar")) {
            int id = Integer.parseInt(this.txtID.getText());
            int opcionSeleccionada = JOptionPane.showConfirmDialog(null, "¿Seguro que deseas eliminar la categoria seleccionada?", "Confirmación", JOptionPane.YES_NO_OPTION);
            if (opcionSeleccionada == JOptionPane.YES_OPTION) {
                boolean seElimino = logica.eliminarCategoria(id);
                if (seElimino) {
                                        this.limpiarFormulario();
                    JOptionPane.showMessageDialog(null, "Se eliminó la categoria", "Información", JOptionPane.INFORMATION_MESSAGE);
                    this.llenarTabla();
                } else {
                    JOptionPane.showMessageDialog(null, "No fue posible eliminar la categoria", "Información", JOptionPane.ERROR_MESSAGE);
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

    private void tblCategoriasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCategoriasMouseClicked
        int filaSeleccionada = tblCategorias.getSelectedRow();
        if (filaSeleccionada != -1) {
            Object id = tblCategorias.getValueAt(filaSeleccionada, 0);
            Categoria categoria = this.categorias.get(this.categorias.indexOf(new Categoria((int)id)));
            this.llenarFormulario(categoria);
            if (evt.getClickCount() == 1) {
                this.editarBoton();
            } else if (evt.getClickCount() == 2) {
                this.eliminarBoton();
            }
        }
        tblCategorias.clearSelection(); 
    }//GEN-LAST:event_tblCategoriasMouseClicked
    
    public static AdmiCategoria getInstance() {
        if (admiCategoria == null) {
            admiCategoria = new AdmiCategoria();
        }
        return admiCategoria;
    }

    private void llenarFormulario(Categoria categoria) {
        txtNombre.setText(categoria.getNombre());
        txtID.setText("" + categoria.getId());

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

    private boolean validarCamposLlenos() {
        if (txtNombre.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Se requiere que ingrese el nombre de la categoria");
            return false;
        }
        return true;
    }

    public void llenarTabla() {
        categorias = this.logica.consultarTodasCategorias();
        if (categorias != null) {
            DefaultTableModel modeloTabla = (DefaultTableModel) this.tblCategorias.getModel();
            this.tblCategorias.setRowHeight(30);
            modeloTabla.setRowCount(0);
            categorias.forEach(categoria -> {
                Object[] fila = new Object[2];
                fila[0] = categoria.getId();
                fila[1] = categoria.getNombre();
                modeloTabla.addRow(fila);
            });
        }

    }

    private void limpiarFormulario() {
        txtNombre.setText("");
        txtID.setText("");
        this.guardarBoton();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblCategorias;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombre1;
    private javax.swing.JLabel lblNombre2;
    private javax.swing.JLabel lblRectangulo4;
    private javax.swing.JLabel lblRegistrar;
    private javax.swing.JLabel lblRegistros;
    private javax.swing.JPanel pnlCategorias;
    private javax.swing.JScrollPane splnRegistros;
    private javax.swing.JTable tblCategorias;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables

}
