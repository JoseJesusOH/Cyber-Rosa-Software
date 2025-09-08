package GUIs;

import GUIs.utils.JTextFieldLimit;
import entidades.Categoria;
import entidades.Producto;
import fachada.FachadaControl;
import interfaces.IFachadaControl;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public final class AdmiProductoForm extends javax.swing.JFrame {

    private List<Producto> productos;
    private static AdmiProductoForm admiProductoForm;
    private List<Categoria> categorias;
    private final IFachadaControl logica;

    private AdmiProductoForm() {
        initComponents();
        this.logica = new FachadaControl();
        jTableProductos.getTableHeader().setReorderingAllowed(false);
        jTextFieldNombre.setDocument(new JTextFieldLimit(100));
        jTextFieldDescripcion.setDocument(new JTextFieldLimit(200));
        jTextFieldPrecioCompra.setDocument(new JTextFieldLimit(12));
        jTextFieldPrecioVenta.setDocument(new JTextFieldLimit(12));
        jTextFieldStock.setDocument(new JTextFieldLimit(12));
        jTextFieldCodigo.setDocument(new JTextFieldLimit(13));
        setDefaultCloseOperation(AdmiProductoForm.DISPOSE_ON_CLOSE);
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

        datePicker1 = new com.github.lgooddatepicker.components.DatePicker();
        jPanel1 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldUtilidad = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jTextFieldMarca = new javax.swing.JTextField();
        jTextFieldCodigo = new javax.swing.JTextField();
        jTextFieldDescripcion = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldPrecioCompra = new javax.swing.JTextField();
        jTextFieldPrecioVenta = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProductos = new javax.swing.JTable();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldStock = new javax.swing.JTextField();
        jComboBoxCategorias = new javax.swing.JComboBox<>();
        lblRectangulo4 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Administración Productos");
        setName("frameAdminProductos"); // NOI18N
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1100, 650));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setText("Utilidad");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 460, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("PRODUCTOS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 1100, 10));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("REGISTROS");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(724, 114, -1, -1));

        jTextFieldUtilidad.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(jTextFieldUtilidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 460, 300, -1));

        jLabel3.setText("Producto");
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, -1, -1));

        jLabel4.setText("ID");
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, -1, -1));

        jLabel5.setText("Descripción");
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, -1, -1));

        jLabel9.setText("Stock");
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 420, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Costo");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, -1, -1));

        jLabel7.setText("Precio");
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, -1, -1));

        jTextFieldNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(jTextFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 300, -1));

        jLabel10.setText("Codigo");
        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, -1, -1));

        txtID.setEditable(false);
        txtID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 300, -1));

        jTextFieldMarca.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(jTextFieldMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 300, -1));

        jTextFieldCodigo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldCodigoKeyTyped(evt);
            }
        });
        jPanel1.add(jTextFieldCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 300, -1));

        jTextFieldDescripcion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(jTextFieldDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 300, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("Nombre");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("Marca");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, -1, -1));

        jTextFieldPrecioCompra.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldPrecioCompra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldPrecioCompraKeyTyped(evt);
            }
        });
        jPanel1.add(jTextFieldPrecioCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, 300, -1));

        jTextFieldPrecioVenta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldPrecioVenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldPrecioVentaKeyTyped(evt);
            }
        });
        jPanel1.add(jTextFieldPrecioVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, 300, -1));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, 10, 540));

        jScrollPane1.setBackground(new java.awt.Color(204, 204, 255));
        jScrollPane1.setBorder(null);

        jTableProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Marca", "Descripción", "Codigo", "Costo", "Precio Venta", "Stock", "Utilidad", "Categoria"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableProductos.setBackground(new java.awt.Color(204, 204, 255));
        jTableProductos.setToolTipText("1 click Actualizar, 2 click Eliminar");
        jTableProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableProductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableProductos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 160, 598, 440));

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/guardar.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setBackground(new java.awt.Color(0, 0, 255));
        btnGuardar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, new java.awt.Color(0, 153, 255), java.awt.Color.white, java.awt.Color.white));
        btnGuardar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 560, 140, -1));

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancelar.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setBackground(new java.awt.Color(0, 0, 255));
        btnCancelar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, new java.awt.Color(0, 153, 255), java.awt.Color.white, java.awt.Color.white));
        btnCancelar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 560, 140, -1));

        jLabel8.setText("Categoria");
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 500, -1, -1));

        jTextFieldStock.setEditable(false);
        jTextFieldStock.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldStock.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldStockKeyTyped(evt);
            }
        });
        jPanel1.add(jTextFieldStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 420, 300, -1));

        jPanel1.add(jComboBoxCategorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 500, 300, 30));

        lblRectangulo4.setBackground(new java.awt.Color(204, 204, 255));
        lblRectangulo4.setOpaque(true);
        jPanel1.add(lblRectangulo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 470, 410));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setText("Stock");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 420, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1112, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, 627, 627, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                String descripcion = jTextFieldDescripcion.getText();
                String precioCompra = jTextFieldPrecioCompra.getText();
                String precioVenta = jTextFieldPrecioVenta.getText();
                String stock = jTextFieldStock.getText();
                Categoria categoria = categorias.get(jComboBoxCategorias.getSelectedIndex());
                String marca = jTextFieldMarca.getText();
                String utilidad = this.jTextFieldUtilidad.getText();
                long codigo = Long.parseLong(jTextFieldCodigo.getText());
                Producto producto = new Producto(nombre, descripcion, marca, codigo, Float.parseFloat(stock), Float.parseFloat(precioVenta),
                        Float.parseFloat(precioCompra), categoria, Float.parseFloat(utilidad));
                boolean seAgrego = logica.agregarProducto(producto);

                if (seAgrego) {
                    JOptionPane.showMessageDialog(this, "Se agregó el nuevo producto", "Información", JOptionPane.INFORMATION_MESSAGE);
                    this.limpiarFormulario();
                    this.llenarTabla();
                } else {
                    JOptionPane.showMessageDialog(this, "No fue posible agregar el producto", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }

        }
        if (this.btnGuardar.getText().equalsIgnoreCase("Editar")) {

            if (validarCamposLlenos()) {
                if (validarDatos()) {
                    return;
                }
                int id = Integer.parseInt(this.txtID.getText());
                String nombre = jTextFieldNombre.getText();
                String descripcion = jTextFieldDescripcion.getText();
                String precioCompra = jTextFieldPrecioCompra.getText();
                String precioVenta = jTextFieldPrecioVenta.getText();
                String stock = jTextFieldStock.getText();
                Categoria categoria = categorias.get(jComboBoxCategorias.getSelectedIndex());
                String marca = jTextFieldMarca.getText();
                String utilidad = this.jTextFieldUtilidad.getText();

                long codigo = Long.parseLong(jTextFieldCodigo.getText());
                Producto producto = new Producto(nombre, descripcion, marca, codigo,
                        Float.parseFloat(stock), Float.parseFloat(precioVenta),
                        Float.parseFloat(precioCompra), categoria,
                        Float.parseFloat(utilidad)
                );
                producto.setId(id);
                boolean seActualizo = logica.actualizarProducto(producto);
                if (seActualizo) {
                    this.limpiarFormulario();
                    JOptionPane.showMessageDialog(this, "Se actualizó el producto", "Información", JOptionPane.INFORMATION_MESSAGE);
                    this.llenarTabla();
                } else {
                    JOptionPane.showMessageDialog(this, "No fue posible actualizar el producto", "Información", JOptionPane.ERROR_MESSAGE);
                }
            }

        }
        if (this.btnGuardar.getText().equalsIgnoreCase("Eliminar")) {
            int id = Integer.parseInt(this.txtID.getText());
            int opcionSeleccionada = JOptionPane.showConfirmDialog(null, "¿Seguro que deseas eliminar el producto seleccionado?", "Confirmación", JOptionPane.YES_NO_OPTION);
            if (opcionSeleccionada == JOptionPane.YES_OPTION) {
                boolean seElimino = this.logica.eliminarProducto(id);
                if (seElimino) {
                    this.limpiarFormulario();
                    JOptionPane.showMessageDialog(null, "Se eliminó el producto", "Información", JOptionPane.INFORMATION_MESSAGE);
                    this.llenarTabla();
                } else {
                    JOptionPane.showMessageDialog(null, "No fue posible eliminar al producto", "Información", JOptionPane.ERROR_MESSAGE);
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

    private void jTextFieldPrecioCompraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPrecioCompraKeyTyped
        numeroDecimal(evt);
    }//GEN-LAST:event_jTextFieldPrecioCompraKeyTyped

    private void jTextFieldPrecioVentaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPrecioVentaKeyTyped
        numeroDecimal(evt);
    }//GEN-LAST:event_jTextFieldPrecioVentaKeyTyped

    private void jTextFieldStockKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldStockKeyTyped
        adminitirSoloNumeros(evt);
    }//GEN-LAST:event_jTextFieldStockKeyTyped

    private void jTextFieldCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCodigoKeyTyped
        adminitirSoloNumeros(evt);
    }//GEN-LAST:event_jTextFieldCodigoKeyTyped

    private void jTableProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableProductosMouseClicked
        int filaSeleccionada = jTableProductos.getSelectedRow();
        if (filaSeleccionada != -1) {
            Object id = jTableProductos.getValueAt(filaSeleccionada, 0);
            Producto produto = this.productos.get(this.productos.indexOf(new Producto((int) id)));
            this.llenarFormulario(produto);
            if (evt.getClickCount() == 1) {
                this.editarBoton();
            } else if (evt.getClickCount() == 2) {
                this.eliminarBoton();
            }
        }
        jTableProductos.clearSelection(); // Esto limpia la selección
    }//GEN-LAST:event_jTableProductosMouseClicked

   
        public void adminitirSoloNumeros(java.awt.event.KeyEvent evt) {
        char car = evt.getKeyChar();
        if (Character.isDigit(car)) {

        } else {
            evt.consume();
            getToolkit().beep();
        }
    }

    public void numeroDecimal(java.awt.event.KeyEvent evt) {
        char car = evt.getKeyChar();
        if (Character.isDigit(car) || car == '.') {

        } else {
            evt.consume();
            getToolkit().beep();
        }
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

    public void llenarCategorias() {
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        categorias = logica.consultarTodasCategorias();
        for (int i = 0; i < categorias.size(); i++) {
            Categoria get = categorias.get(i);
            model.addElement(get.getNombre());
        }
        jComboBoxCategorias.setModel(model);
    }

    public static AdmiProductoForm getInstance() {
        if (admiProductoForm == null) {
            admiProductoForm = new AdmiProductoForm();
        }
        return admiProductoForm;
    }

    private void llenarFormulario(Producto producto) {
        txtID.setText(""+producto.getId());
        jTextFieldNombre.setText(producto.getNombre());
        jTextFieldDescripcion.setText(producto.getDescripcion());
        jTextFieldPrecioCompra.setText(String.valueOf(producto.getCosto()));
        jTextFieldPrecioVenta.setText(String.valueOf(producto.getPrecio()));
        jTextFieldMarca.setText(String.valueOf(producto.getMarca()));
        jTextFieldCodigo.setText(String.valueOf(producto.getCodigo()));
        int valor = (int) producto.getStock();
        jTextFieldStock.setText(String.valueOf(valor));
        int indic2e = categorias.indexOf(producto.getCategoria());
        jComboBoxCategorias.setSelectedIndex(indic2e);
    }

    private boolean validarCamposLlenos() {

        if (jTextFieldNombre.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Se requiere que ingrese el nombre del producto");
            return false;
        }
        if (jTextFieldCodigo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Se requiere que ingrese el codigo del producto");
            return false;
        }

        if (jTextFieldMarca.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Se requiere que ingrese la marca del producto");
            return false;
        }
        if (jTextFieldDescripcion.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Se requiere que ingrese la descripcion del producto");
            return false;
        }
        if (jTextFieldPrecioCompra.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Se requiere que ingrese el precioCompra del producto");
            return false;
        }
        if (jTextFieldPrecioVenta.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Se requiere que ingrese el precio de venta del producto");
            return false;
        }
        if (jTextFieldStock.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Se requiere que ingrese el stock del producto");
            return false;
        }
        if (jTextFieldUtilidad.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Se requiere que ingrese la utilidad del producto");
            return false;
        }
        return true;
    }

    public boolean validarDatos() {
        String regexNumeros = "\\d+";
        String regexFloat = "\\d+(\\.\\d+)?";

        if (!jTextFieldPrecioCompra.getText().matches(regexFloat) || Float.parseFloat(jTextFieldPrecioCompra.getText()) <= 0 || Float.parseFloat(jTextFieldPrecioCompra.getText()) > 999999999) {
            JOptionPane.showMessageDialog(null, "Se requiere que ingrese un numero mayor a 0 y no mayor a 9999999910, en el precio de compra");
            return true;
        }

        if (!jTextFieldPrecioVenta.getText().matches(regexFloat) || Float.parseFloat(jTextFieldPrecioVenta.getText()) <= 0 || Float.parseFloat(jTextFieldPrecioVenta.getText()) > 999999999) {
            JOptionPane.showMessageDialog(null, "Se requiere que ingrese un numero mayor a 0 y no mayor a 9999999910, en el precio de venta");
            return true;
        }

        if (!jTextFieldStock.getText().matches(regexNumeros) || Integer.parseInt(jTextFieldStock.getText()) <= 0 || Integer.parseInt(jTextFieldStock.getText()) > 999999999) {
            JOptionPane.showMessageDialog(null, "Se requiere que ingrese un numero entero en el stock  mayor a 0 y no mayor a 999999999");
            return true;
        }
        if (!jTextFieldCodigo.getText().matches(regexNumeros) || Integer.parseInt(jTextFieldCodigo.getText()) <= 0) { //|| Integer.parseInt(jTextFieldCodigo.getText()) > 999999999) {
            JOptionPane.showMessageDialog(null, "Se requiere que ingrese un numero entero de 10 digitos maximo");
            return true;
        }
        if (!jTextFieldUtilidad.getText().matches(regexFloat) || Float.parseFloat(jTextFieldUtilidad.getText()) <= 0 || Float.parseFloat(jTextFieldUtilidad.getText()) > 999999999) {
            JOptionPane.showMessageDialog(null, "Se requiere que ingrese un numero mayor a 0 y no mayor a 9999999910, en el precio de venta");
            return true;
        }
        return false;
    }

    public void llenarTabla() {
        productos = this.logica.consultarTodosProductos();
        if (productos != null) {
            DefaultTableModel modeloTabla = (DefaultTableModel) this.jTableProductos.getModel();
            this.jTableProductos.setRowHeight(30);
            modeloTabla.setRowCount(0);
            productos.forEach(producto -> {
                Object[] fila = new Object[10];
                fila[0] = producto.getId();
                fila[1] = producto.getNombre();
                fila[2] = producto.getMarca();
                fila[3] = producto.getDescripcion();
                fila[4] = producto.getCodigo();
                fila[5] = producto.getCosto();
                fila[6] = producto.getPrecio();
                fila[7] = producto.getStock();
                fila[8] = producto.getUtilidad();
                fila[9] = producto.getCategoria().getNombre();
                modeloTabla.addRow(fila);
            });
        }

    }

    private void limpiarFormulario() {
        jTextFieldNombre.setText("");
        jTextFieldDescripcion.setText("");
        jTextFieldPrecioCompra.setText("");
        jTextFieldPrecioVenta.setText("");
        jTextFieldStock.setText("");
        jTextFieldCodigo.setText("");
        jTextFieldMarca.setText("");
        txtID.setText("");
        jComboBoxCategorias.setSelectedIndex(0);
        this.guardarBoton();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private com.github.lgooddatepicker.components.DatePicker datePicker1;
    private javax.swing.JComboBox<String> jComboBoxCategorias;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTableProductos;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldDescripcion;
    private javax.swing.JTextField jTextFieldMarca;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldPrecioCompra;
    private javax.swing.JTextField jTextFieldPrecioVenta;
    private javax.swing.JTextField jTextFieldStock;
    private javax.swing.JTextField jTextFieldUtilidad;
    private javax.swing.JLabel lblRectangulo4;
    private javax.swing.JTextField txtID;
    // End of variables declaration//GEN-END:variables

}
