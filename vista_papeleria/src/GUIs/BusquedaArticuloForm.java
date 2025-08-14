package GUIs;

import interfaces.*;
import entidades.*;
import fachada.FachadaControl;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class BusquedaArticuloForm extends javax.swing.JFrame {

    private List<Producto> productosCoinicidentes;
    private IFachadaControl logica;
    private List<Categoria> categorias;
    private IBusqueda busqueda;

    public BusquedaArticuloForm(IBusqueda busqueda) {
        initComponents();
        this.logica = new FachadaControl();
        this.categorias = new ArrayList<>();
        this.busqueda = busqueda;
        this.productosCoinicidentes = new ArrayList<>();
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                setVisible(false);
                busqueda.establecerVisibilidad(true);
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        txtMarca = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductos = new javax.swing.JTable();
        btnSeleccionar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        categoriasC = new javax.swing.JComboBox<>();
        lblRectangulo4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Busqueda Articulos");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1100, 650));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("BUSQUEDA ARTICULO");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(266, 27, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Descripcion");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 260, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Marca");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 190, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Nombre");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));

        txtDescripcion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 260, 210, -1));

        txtMarca.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(txtMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 190, 210, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Categoria");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, -1));

        txtNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 190, -1));

        jScrollPane1.setBackground(new java.awt.Color(204, 204, 255));
        jScrollPane1.setBorder(null);

        tblProductos.setBackground(new java.awt.Color(204, 204, 255));
        tblProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Articulo", "Descripción", "Precio", "Disponible", "Categoria"
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
        tblProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblProductos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 401, 878, 194));

        btnSeleccionar.setBackground(new java.awt.Color(0, 0, 255));
        btnSeleccionar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSeleccionar.setForeground(new java.awt.Color(255, 255, 255));
        btnSeleccionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/click.png"))); // NOI18N
        btnSeleccionar.setText("Seleccionar");
        btnSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarActionPerformed(evt);
            }
        });
        jPanel1.add(btnSeleccionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 260, 180, 40));

        btnBuscar.setBackground(new java.awt.Color(0, 0, 255));
        btnBuscar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lupa.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 170, 160, 40));

        categoriasC.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        categoriasC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-----------" }));
        categoriasC.setSelectedIndex(-1);
        jPanel1.add(categoriasC, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 190, -1));

        lblRectangulo4.setBackground(new java.awt.Color(204, 204, 255));
        lblRectangulo4.setOpaque(true);
        jPanel1.add(lblRectangulo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 900, 180));

        jLabel7.setText("Nombre");
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 177, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 919, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 627, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String nombre = txtNombre.getText();
        String marca = txtMarca.getText();
        String descripcion = txtDescripcion.getText();
        Object[] objetos = new Object[4];
        objetos[0] = "".equals(nombre) ? null : nombre;
        objetos[1] = "".equals(marca) ? null : marca;
        objetos[2] = "".equals(descripcion) ? null : descripcion;
        if (categoriasC.getSelectedIndex() == 0) {
            objetos[3] = null;
        } else {
            int categoriaID = categorias.get(categoriasC.getSelectedIndex() - 1).getId();
            objetos[3] = categoriaID;
        }
        if (objetos[3] == null && objetos[0] == null && objetos[1] == null && objetos[2] == null) {
            JOptionPane.showMessageDialog(null, "Es requerido al menos seleccionar un metodo de busqueda", "Advertencia Busqueda", JOptionPane.ERROR_MESSAGE);
        } else {
            buscarCoincidencias(objetos);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarActionPerformed
        int indice = tblProductos.getSelectedRow();
        if (indice != -1) {
            setVisible(false);
            busqueda.cargarBusqueda(productosCoinicidentes.get(indice));
            busqueda.establecerVisibilidad(true);
        } else {
            JOptionPane.showMessageDialog(null, "Selecciona un artículo, o inicie una busqueda", "Busqueda de articulo", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSeleccionarActionPerformed

    private void tblProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProductosMouseClicked

        if (evt.getClickCount() == 2) {
            int indice = tblProductos.getSelectedRow();
            if (indice != -1) {
                setVisible(false);
                busqueda.cargarBusqueda(productosCoinicidentes.get(indice));
                busqueda.establecerVisibilidad(true);
            } else {
                JOptionPane.showMessageDialog(null, "Selecciona un artículo, o inicie una busqueda", "Busqueda de articulo", JOptionPane.ERROR_MESSAGE);
            }
        }

    }//GEN-LAST:event_tblProductosMouseClicked

    public void llenarCategorias() {
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        categorias = logica.consultarTodasCategorias();
        model.addElement("Ninguno");
        for (int i = 0; i < categorias.size(); i++) {
            Categoria get = categorias.get(i);
            model.addElement(get.getNombre());
        }
        categoriasC.setModel(model);
    }

    public void cargarCoincidencias() {
        if (productosCoinicidentes != null) {
            DefaultTableModel modeloTabla = (DefaultTableModel) this.tblProductos.getModel();
            modeloTabla.setRowCount(0);
            productosCoinicidentes.forEach(producto -> {
                Object[] fila = new Object[5];
                fila[0] = producto.getNombre();
                fila[1] = producto.getDescripcion();
                fila[2] = producto.getPrecio();
                fila[3] = producto.getStock();
                fila[4] = producto.getCategoria().getNombre();
                modeloTabla.addRow(fila);
            });
        }

    }

    public void resetBusquedas() {
        DefaultTableModel modeloTabla = (DefaultTableModel) this.tblProductos.getModel();
        modeloTabla.setRowCount(0);
        productosCoinicidentes = new ArrayList<>();
        categorias = new ArrayList<>();
    }

    public void buscarCoincidencias(Object[] parametros) {
        productosCoinicidentes = logica.consultarProductosCoincidencias(parametros);
        if (!productosCoinicidentes.isEmpty()) {
            cargarCoincidencias();
        } else {
            JOptionPane.showMessageDialog(null, "No se encontraron coincidencias", "Busqueda de articulo", JOptionPane.ERROR_MESSAGE);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnSeleccionar;
    private javax.swing.JComboBox<String> categoriasC;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblRectangulo4;
    private javax.swing.JTable tblProductos;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
