package GUIs;

import entidades.Caja;
import entidades.Usuario;
import entidades.Venta;
import enumeradores.Rol;
import fachada.FachadaControl;
import interfaces.IFachadaControl;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;

import javax.swing.JOptionPane;

public class PrincipalForm extends javax.swing.JFrame {

    private IFachadaControl fachadaControl;
    private static PrincipalForm principalForm;
    private Usuario usuarioSesion;
    private List<IBusqueda> ventasForms;
    private DefaultListModel<String> model;

    private PrincipalForm() {
        initComponents();
        this.ventasForms = new ArrayList<>();
        this.fachadaControl = new FachadaControl();
        jButtonProductos.setPreferredSize(new Dimension(40, 40));
        model = new DefaultListModel<>();
        ventasList.setModel(model);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MenuTecnico = new javax.swing.JMenu();
        MenuAdminCategoriaTecnico = new javax.swing.JMenuItem();
        MenuAdminClientesTecnico = new javax.swing.JMenuItem();
        MenuAdminProductosTecnico = new javax.swing.JMenuItem();
        MenuAdminProveedoresTecnico = new javax.swing.JMenuItem();
        MenuVendedor = new javax.swing.JMenu();
        MenuAdminCategoriaVendedor = new javax.swing.JMenuItem();
        MenuAdminClientesVendedor = new javax.swing.JMenuItem();
        MenuAdminProductosVendedor = new javax.swing.JMenuItem();
        MenuAdminProveedoresVendedor = new javax.swing.JMenuItem();
        pnlPrincipal = new javax.swing.JPanel();
        panelRound5 = new GUIs.PanelRound();
        panelRound1 = new GUIs.PanelRound();
        jButtonCatehorias = new javax.swing.JButton();
        jButtonClientes = new javax.swing.JButton();
        jButtonProductos = new javax.swing.JButton();
        jButtonProveedores = new javax.swing.JButton();
        jButtonRealizarVenta = new javax.swing.JButton();
        jButtonUsuarios = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        contadorVentas = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        panelRound6 = new GUIs.PanelRound();
        jLabelTitulo = new javax.swing.JLabel();
        panelRound7 = new GUIs.PanelRound();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ventasList = new javax.swing.JList<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuCaja1 = new javax.swing.JMenu();
        menuCajaNuevoTicket1 = new javax.swing.JMenuItem();
        menuCajaAbrirCaja1 = new javax.swing.JMenuItem();
        menuCajaCierreCaja1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        MenuAdmin = new javax.swing.JMenu();
        MenuAdminCategoria = new javax.swing.JMenuItem();
        MenuAdminClientes = new javax.swing.JMenuItem();
        MenuAdminProductos = new javax.swing.JMenuItem();
        MenuAdminProveedores = new javax.swing.JMenuItem();
        MenuAdminUsuario = new javax.swing.JMenuItem();
        MenuAdminMermas = new javax.swing.JMenuItem();

        MenuTecnico.setText("Tecnico");
        MenuTecnico.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N

        MenuAdminCategoriaTecnico.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        MenuAdminCategoriaTecnico.setText("Categorias");
        MenuAdminCategoriaTecnico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuAdminCategoriaTecnicoActionPerformed(evt);
            }
        });
        MenuTecnico.add(MenuAdminCategoriaTecnico);

        MenuAdminClientesTecnico.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        MenuAdminClientesTecnico.setText("Clientes");
        MenuAdminClientesTecnico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuAdminClientesTecnicoActionPerformed(evt);
            }
        });
        MenuTecnico.add(MenuAdminClientesTecnico);

        MenuAdminProductosTecnico.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        MenuAdminProductosTecnico.setText("Productos");
        MenuAdminProductosTecnico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuAdminProductosTecnicoActionPerformed(evt);
            }
        });
        MenuTecnico.add(MenuAdminProductosTecnico);

        MenuAdminProveedoresTecnico.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        MenuAdminProveedoresTecnico.setText("Proveedores");
        MenuAdminProveedoresTecnico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuAdminProveedoresTecnicoActionPerformed(evt);
            }
        });
        MenuTecnico.add(MenuAdminProveedoresTecnico);

        MenuVendedor.setText("Vendedor");
        MenuVendedor.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N

        MenuAdminCategoriaVendedor.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        MenuAdminCategoriaVendedor.setText("Categorias");
        MenuAdminCategoriaVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuAdminCategoriaVendedorActionPerformed(evt);
            }
        });
        MenuVendedor.add(MenuAdminCategoriaVendedor);

        MenuAdminClientesVendedor.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        MenuAdminClientesVendedor.setText("Clientes");
        MenuAdminClientesVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuAdminClientesVendedorActionPerformed(evt);
            }
        });
        MenuVendedor.add(MenuAdminClientesVendedor);

        MenuAdminProductosVendedor.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        MenuAdminProductosVendedor.setText("Productos");
        MenuAdminProductosVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuAdminProductosVendedorActionPerformed(evt);
            }
        });
        MenuVendedor.add(MenuAdminProductosVendedor);

        MenuAdminProveedoresVendedor.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        MenuAdminProveedoresVendedor.setText("Proveedores");
        MenuAdminProveedoresVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuAdminProveedoresVendedorActionPerformed(evt);
            }
        });
        MenuVendedor.add(MenuAdminProveedoresVendedor);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Administración");
        setResizable(false);

        pnlPrincipal.setBackground(new java.awt.Color(239, 237, 237));
        pnlPrincipal.setPreferredSize(new java.awt.Dimension(1000, 750));
        pnlPrincipal.setLayout(null);

        panelRound5.setBackground(new java.awt.Color(70, 4, 129));
        panelRound5.setRoundBottomLeft(70);
        panelRound5.setRoundBottomRight(70);
        panelRound5.setRoundTopLeft(70);
        panelRound5.setRoundTopRight(70);
        panelRound5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound1.setBackground(new java.awt.Color(204, 204, 255));
        panelRound1.setRoundBottomLeft(90);
        panelRound1.setRoundBottomRight(90);
        panelRound1.setRoundTopLeft(50);
        panelRound1.setRoundTopRight(50);
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonCatehorias.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jButtonCatehorias.setText("Categorias");
        jButtonCatehorias.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonCatehorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCatehoriasActionPerformed(evt);
            }
        });
        panelRound1.add(jButtonCatehorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 220, 84));

        jButtonClientes.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jButtonClientes.setText("Clientes");
        jButtonClientes.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClientesActionPerformed(evt);
            }
        });
        panelRound1.add(jButtonClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 410, 220, 84));

        jButtonProductos.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jButtonProductos.setText("Productos");
        jButtonProductos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProductosActionPerformed(evt);
            }
        });
        panelRound1.add(jButtonProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 220, 80));

        jButtonProveedores.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jButtonProveedores.setText("Proveedores");
        jButtonProveedores.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProveedoresActionPerformed(evt);
            }
        });
        panelRound1.add(jButtonProveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 80, 220, 80));

        jButtonRealizarVenta.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jButtonRealizarVenta.setText("Realizar Venta");
        jButtonRealizarVenta.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonRealizarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRealizarVentaActionPerformed(evt);
            }
        });
        panelRound1.add(jButtonRealizarVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 220, 84));

        jButtonUsuarios.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jButtonUsuarios.setText("Usuarios");
        jButtonUsuarios.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUsuariosActionPerformed(evt);
            }
        });
        panelRound1.add(jButtonUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 240, 220, 84));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-proveedor-48.png"))); // NOI18N
        panelRound1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 30, 50, 48));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-recibo-48.png"))); // NOI18N
        jLabel3.setText("jLabel2");
        panelRound1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 62, 48));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-usuarios-48.png"))); // NOI18N
        jLabel4.setText("jLabel2");
        panelRound1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 200, 62, 48));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-categorizar-48.png"))); // NOI18N
        jLabel5.setText("jLabel2");
        panelRound1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, 62, 48));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-clientes-48.png"))); // NOI18N
        jLabel6.setText("jLabel2");
        panelRound1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 370, 62, 48));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-agregar-a-carrito-de-compras-48.png"))); // NOI18N
        jLabel7.setText("jLabel2");
        panelRound1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 62, -1));

        jLabel8.setText("jLabel2");
        panelRound1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 76, 62, 48));

        jLabel9.setText("jLabel2");
        panelRound1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 86, 62, 48));

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        panelRound1.add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 80, -1, -1));

        contadorVentas.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        contadorVentas.setForeground(new java.awt.Color(0, 0, 0));
        panelRound1.add(contadorVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, 40, -1));

        panelRound5.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 700, 580));

        pnlPrincipal.add(panelRound5);
        panelRound5.setBounds(160, 120, 700, 620);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sinfondochica.png"))); // NOI18N
        pnlPrincipal.add(jLabel1);
        jLabel1.setBounds(850, -50, 240, 250);

        panelRound6.setBackground(new java.awt.Color(70, 4, 129));
        panelRound6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTitulo.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        panelRound6.add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 850, 60));

        panelRound7.setBackground(new java.awt.Color(204, 204, 255));
        panelRound7.setRoundBottomLeft(60);
        panelRound7.setRoundBottomRight(60);
        panelRound7.setRoundTopLeft(60);
        panelRound7.setRoundTopRight(60);

        javax.swing.GroupLayout panelRound7Layout = new javax.swing.GroupLayout(panelRound7);
        panelRound7.setLayout(panelRound7Layout);
        panelRound7Layout.setHorizontalGroup(
            panelRound7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );
        panelRound7Layout.setVerticalGroup(
            panelRound7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        panelRound6.add(panelRound7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 520, 80));

        pnlPrincipal.add(panelRound6);
        panelRound6.setBounds(0, 0, 1000, 160);

        jButton1.setBackground(new java.awt.Color(153, 153, 153));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Cerrar Sesión");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        pnlPrincipal.add(jButton1);
        jButton1.setBounds(870, 710, 120, 30);

        ventasList.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        ventasList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        ventasList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ventasListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ventasList);

        pnlPrincipal.add(jScrollPane1);
        jScrollPane1.setBounds(20, 250, 120, 320);

        jLabel11.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Ventas en");
        pnlPrincipal.add(jLabel11);
        jLabel11.setBounds(40, 160, 163, 50);

        jLabel12.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("ejecucion");
        pnlPrincipal.add(jLabel12);
        jLabel12.setBounds(40, 200, 100, 50);

        jLabel35.setText("jLabel35");

        jMenuBar1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N

        MenuCaja1.setText("Venta");
        MenuCaja1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N

        menuCajaNuevoTicket1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        menuCajaNuevoTicket1.setText("Nueva Venta");
        menuCajaNuevoTicket1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCajaNuevoTicket1ActionPerformed(evt);
            }
        });
        MenuCaja1.add(menuCajaNuevoTicket1);

        menuCajaAbrirCaja1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        menuCajaAbrirCaja1.setText("Abrir Nueva Caja");
        menuCajaAbrirCaja1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCajaAbrirCaja1ActionPerformed(evt);
            }
        });
        MenuCaja1.add(menuCajaAbrirCaja1);

        menuCajaCierreCaja1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        menuCajaCierreCaja1.setText("Cierre de Caja");
        menuCajaCierreCaja1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCajaCierreCaja1ActionPerformed(evt);
            }
        });
        MenuCaja1.add(menuCajaCierreCaja1);

        jMenuItem2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem2.setText("Reporte Venta");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        MenuCaja1.add(jMenuItem2);

        jMenuBar1.add(MenuCaja1);

        MenuAdmin.setText("Administrador");
        MenuAdmin.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N

        MenuAdminCategoria.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        MenuAdminCategoria.setText("Categorias");
        MenuAdminCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuAdminCategoriaActionPerformed(evt);
            }
        });
        MenuAdmin.add(MenuAdminCategoria);

        MenuAdminClientes.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        MenuAdminClientes.setText("Clientes");
        MenuAdminClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuAdminClientesActionPerformed(evt);
            }
        });
        MenuAdmin.add(MenuAdminClientes);

        MenuAdminProductos.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        MenuAdminProductos.setText("Productos");
        MenuAdminProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuAdminProductosActionPerformed(evt);
            }
        });
        MenuAdmin.add(MenuAdminProductos);

        MenuAdminProveedores.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        MenuAdminProveedores.setText("Proveedores");
        MenuAdminProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuAdminProveedoresActionPerformed(evt);
            }
        });
        MenuAdmin.add(MenuAdminProveedores);

        MenuAdminUsuario.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        MenuAdminUsuario.setText("Usuario");
        MenuAdminUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuAdminUsuarioActionPerformed(evt);
            }
        });
        MenuAdmin.add(MenuAdminUsuario);

        MenuAdminMermas.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        MenuAdminMermas.setText("Mermas");
        MenuAdminMermas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuAdminMermasActionPerformed(evt);
            }
        });
        MenuAdmin.add(MenuAdminMermas);

        jMenuBar1.add(MenuAdmin);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(pnlPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(pnlPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void MenuAdminUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuAdminUsuarioActionPerformed
        this.setVisible(false);
        Utilidad.getInstance().usuario();
    }//GEN-LAST:event_MenuAdminUsuarioActionPerformed

    private void MenuAdminCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuAdminCategoriaActionPerformed
        this.setVisible(false);
        Utilidad.getInstance().categoria();
    }//GEN-LAST:event_MenuAdminCategoriaActionPerformed

    private void MenuAdminClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuAdminClientesActionPerformed
        this.setVisible(false);
        Utilidad.getInstance().cliente();
    }//GEN-LAST:event_MenuAdminClientesActionPerformed

    private void MenuAdminProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuAdminProductosActionPerformed
        this.setVisible(false);
        Utilidad.getInstance().producto();
    }//GEN-LAST:event_MenuAdminProductosActionPerformed

    private void MenuAdminProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuAdminProveedoresActionPerformed
        this.setVisible(false);
        Utilidad.getInstance().proveedor();
    }//GEN-LAST:event_MenuAdminProveedoresActionPerformed

    private void menuCajaNuevoTicket1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCajaNuevoTicket1ActionPerformed
        Caja caja = fachadaControl.cajaAbierta();
        if (caja != null) {
            //  caja.setUsuario(new Usuario(usuarioSesion.getId()));
            // fachadaControl.actualizarCaja(caja);
            if (ventasForms.size() == 10) {
                JOptionPane.showMessageDialog(null, "Se pueden abrir como maximo 10 ventas simultaneas");
            } else {
                this.setVisible(false);
                VentasForm venta = new VentasForm();
                ventasForms.add(venta);
                model.addElement("Venta " + ventasForms.size());
                venta.llenarCBoxClientes();
                venta.setVisible(true);
                venta.establecerCaja(caja);
            }

        } else {
            JOptionPane.showMessageDialog(null, "No se ha registrado alguna caja se requiere que abra alguna");
        }
    }//GEN-LAST:event_menuCajaNuevoTicket1ActionPerformed

    private void menuCajaAbrirCaja1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCajaAbrirCaja1ActionPerformed
        //Aqui habra una validacion con el fin de que validamos el usario actual, el metodo de consultar caja abierta
        //verifica si el usuario corresponde a la sesions

        Caja caja = fachadaControl.cajaAbierta();
        if (caja != null) {

            JOptionPane.showMessageDialog(null, "No se ha cerrado la caja actual, requiere cerrarla");

        } else {
            this.setVisible(false);
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    AbrirCajaForm.instanciaAbrirCaja().setVisible(true);
                }
            });
        }


    }//GEN-LAST:event_menuCajaAbrirCaja1ActionPerformed

    private void menuCajaCierreCaja1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCajaCierreCaja1ActionPerformed
        Caja caja =fachadaControl.cajaAbierta();
        if (caja == null) {
            JOptionPane.showMessageDialog(this, "No hay caja abierta");
        } else {
            this.setVisible(false);
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    CerrarCajaForm.instanciaCerrarCaja().mostrarFormulario();
                }
            });
        }
    }//GEN-LAST:event_menuCajaCierreCaja1ActionPerformed

    private void jButtonRealizarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRealizarVentaActionPerformed

        Caja caja = fachadaControl.cajaAbierta();
        if (caja != null) {
            //   caja.setUsuario(usuarioSesion);
            //  fachadaControl.actualizarCaja(caja);
            if (ventasForms.size() == 10) {
                JOptionPane.showMessageDialog(null, "Se pueden abrir como maximo 10 ventas simultaneas");
            } else {
                this.setVisible(false);
                VentasForm venta = new VentasForm();
                ventasForms.add(venta);
                model.addElement("Venta " + ventasForms.size());
                venta.llenarCBoxClientes();
                venta.setVisible(true);
                venta.establecerCaja(caja);
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se ha registrado alguna caja se requiere que abra alguna");
        }
    }//GEN-LAST:event_jButtonRealizarVentaActionPerformed

    private void jButtonProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProveedoresActionPerformed
        this.setVisible(false);
        Utilidad.getInstance().proveedor();
    }//GEN-LAST:event_jButtonProveedoresActionPerformed

    private void jButtonUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUsuariosActionPerformed
        this.setVisible(false);
        Utilidad.getInstance().usuario();
    }//GEN-LAST:event_jButtonUsuariosActionPerformed

    private void MenuAdminMermasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuAdminMermasActionPerformed
        // TODO add your handling code here:

        this.setVisible(false);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                     AdminMermas.getInstance().establecerCaja(caj);
               AdminMermas.getInstance().establecerSesion(usuarioSesion);
                 AdminMermas.getInstance().limpiarCamposTodo();
                  AdminMermas.getInstance().cargarTabla();
                     AdminMermas.getInstance().setVisible(true);

            }
        });

    }//GEN-LAST:event_MenuAdminMermasActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        InicioSesion.getInstance().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        this.setVisible(false);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                                ReporteVentaForm.getInstance().limpiarTablas();
                ReporteVentaForm.getInstance().setVisible(true);
            }
        });
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jButtonCatehoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCatehoriasActionPerformed
        this.setVisible(false);
        Utilidad.getInstance().categoria();
    }//GEN-LAST:event_jButtonCatehoriasActionPerformed

    private void jButtonProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProductosActionPerformed
        this.setVisible(false);
        Utilidad.getInstance().producto();
    }//GEN-LAST:event_jButtonProductosActionPerformed

    private void jButtonClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClientesActionPerformed
        this.setVisible(false);
        Utilidad.getInstance().cliente();
    }//GEN-LAST:event_jButtonClientesActionPerformed

    private void MenuAdminCategoriaTecnicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuAdminCategoriaTecnicoActionPerformed
        this.setVisible(false);
        Utilidad.getInstance().categoria();
    }//GEN-LAST:event_MenuAdminCategoriaTecnicoActionPerformed

    private void MenuAdminClientesTecnicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuAdminClientesTecnicoActionPerformed
        this.setVisible(false);
        Utilidad.getInstance().cliente();
    }//GEN-LAST:event_MenuAdminClientesTecnicoActionPerformed

    private void MenuAdminProductosTecnicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuAdminProductosTecnicoActionPerformed
        this.setVisible(false);
        Utilidad.getInstance().producto();
    }//GEN-LAST:event_MenuAdminProductosTecnicoActionPerformed

    private void MenuAdminProveedoresTecnicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuAdminProveedoresTecnicoActionPerformed
        this.setVisible(false);
        Utilidad.getInstance().proveedor();
    }//GEN-LAST:event_MenuAdminProveedoresTecnicoActionPerformed

    private void MenuAdminCategoriaVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuAdminCategoriaVendedorActionPerformed
        this.setVisible(false);
        Utilidad.getInstance().categoria();
    }//GEN-LAST:event_MenuAdminCategoriaVendedorActionPerformed

    private void MenuAdminClientesVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuAdminClientesVendedorActionPerformed
        this.setVisible(false);
        Utilidad.getInstance().cliente();
    }//GEN-LAST:event_MenuAdminClientesVendedorActionPerformed

    private void MenuAdminProveedoresVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuAdminProveedoresVendedorActionPerformed
        this.setVisible(false);
        Utilidad.getInstance().proveedor();
    }//GEN-LAST:event_MenuAdminProveedoresVendedorActionPerformed

    private void MenuAdminProductosVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuAdminProductosVendedorActionPerformed
        this.setVisible(false);
        Utilidad.getInstance().producto();
    }//GEN-LAST:event_MenuAdminProductosVendedorActionPerformed

    private void ventasListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ventasListMouseClicked
        int filaSeleccionada = ventasList.getSelectedIndex();
        if (filaSeleccionada != -1) {
            if (evt.getClickCount() == 2) {
                Caja caja = fachadaControl.cajaAbierta();
                if (caja != null) {
                    this.setVisible(false);
                    VentasForm ventas = (VentasForm) ventasForms.get(filaSeleccionada);
                    ventas.llenarCBoxClientes();
                    ventas.fechaVenta();
                    ventas.setVisible(true);
                    ventas.establecerCaja(caja);
                } else {
                    JOptionPane.showMessageDialog(null, "No se ha registrado alguna caja se requiere que abra alguna");
                }
            }
        }
        ventasList.clearSelection();

    }//GEN-LAST:event_ventasListMouseClicked

    public void eliminarVenta(VentasForm venta) {
        ventasForms.remove(ventasForms.indexOf(venta));
        model = new DefaultListModel<>();
        ventasList.setModel(model);
        if (!ventasForms.isEmpty()) {
            for (int i = 0; i < ventasForms.size(); i++) {
                model.addElement("Venta " + (i + 1));
            }
        }
    }

    public static PrincipalForm getInstance() {
        if (principalForm == null) {
            principalForm = new PrincipalForm();
        }
        return principalForm;
    }

    public void establecerSession(Usuario usuario) {
        this.usuarioSesion = usuario;
        this.jLabelTitulo.setText("Usuario: " + this.usuarioSesion.getNombre() + "\n Rol: " + this.usuarioSesion.getRol());

        if (usuario.getRol() == Rol.ADMINISTRADOR) {
            this.MenuTecnico.setEnabled(false);
            this.jButtonUsuarios.setEnabled(true);
            this.MenuVendedor.setEnabled(false);
            this.MenuAdmin.setEnabled(true);
        }
//        if (usuario.getRol() == Rol.TECNICO) {
//            this.jButtonUsuarios.setEnabled(false);
//            this.MenuAdmin.setEnabled(false);
//            this.MenuVendedor.setEnabled(false);
//            this.MenuTecnico.setEnabled(true);
//        }
        if (usuario.getRol() == Rol.VENDEDOR) {
            this.jButtonUsuarios.setEnabled(false);
            this.MenuAdmin.setEnabled(false);
            this.MenuTecnico.setEnabled(false);
            this.MenuVendedor.setEnabled(true);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MenuAdmin;
    private javax.swing.JMenuItem MenuAdminCategoria;
    private javax.swing.JMenuItem MenuAdminCategoriaTecnico;
    private javax.swing.JMenuItem MenuAdminCategoriaVendedor;
    private javax.swing.JMenuItem MenuAdminClientes;
    private javax.swing.JMenuItem MenuAdminClientesTecnico;
    private javax.swing.JMenuItem MenuAdminClientesVendedor;
    private javax.swing.JMenuItem MenuAdminMermas;
    private javax.swing.JMenuItem MenuAdminProductos;
    private javax.swing.JMenuItem MenuAdminProductosTecnico;
    private javax.swing.JMenuItem MenuAdminProductosVendedor;
    private javax.swing.JMenuItem MenuAdminProveedores;
    private javax.swing.JMenuItem MenuAdminProveedoresTecnico;
    private javax.swing.JMenuItem MenuAdminProveedoresVendedor;
    private javax.swing.JMenuItem MenuAdminUsuario;
    private javax.swing.JMenu MenuCaja1;
    private javax.swing.JMenu MenuTecnico;
    private javax.swing.JMenu MenuVendedor;
    private javax.swing.JLabel contadorVentas;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonCatehorias;
    private javax.swing.JButton jButtonClientes;
    private javax.swing.JButton jButtonProductos;
    private javax.swing.JButton jButtonProveedores;
    private javax.swing.JButton jButtonRealizarVenta;
    private javax.swing.JButton jButtonUsuarios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem menuCajaAbrirCaja1;
    private javax.swing.JMenuItem menuCajaCierreCaja1;
    private javax.swing.JMenuItem menuCajaNuevoTicket1;
    private GUIs.PanelRound panelRound1;
    private GUIs.PanelRound panelRound5;
    private GUIs.PanelRound panelRound6;
    private GUIs.PanelRound panelRound7;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JList<String> ventasList;
    // End of variables declaration//GEN-END:variables
}
