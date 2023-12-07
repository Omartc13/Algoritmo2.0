
package Vistas;

import LinkedLists.SucursalesList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Sucursales;

public class RegistrosSucursales extends javax.swing.JFrame {
    private final SucursalesList nuevaSucursal;
    DefaultTableModel model;


    public RegistrosSucursales() {
        initComponents();
        nuevaSucursal = new SucursalesList();
        model = new DefaultTableModel();
        setLocationRelativeTo(this);
        model.addColumn("Número de Sucursal");
        model.addColumn("Distrito");
        model.addColumn("Encargado");
        model.addColumn("Telefono");
        model.addColumn("Direccion");
        model.addColumn("DNI");
        tblSucursalesPrincipal.setModel(model);
        btnPush.setEnabled(false);
    }
    
    public void limpiarCamposSucursalPrincipal() {
        txtDireccionPrincipal.setText(null);
        txtDistritoPrincipal.setText(null);
        txtEncargadoPrincipal.setText(null);
        txtNumPrincipal.setText(null);
        txtDniPrincipal.setText(null);
        txtTlfPrincipal.setText(null);
    }

    public void clickOnTextfield() {
        txtNumPrincipal.requestFocusInWindow();
    }
    
    public void habilitarBotones() {
        if (txtNumPrincipal.getText().isEmpty() || txtTlfPrincipal.getText().length() <9 || txtEncargadoPrincipal.getText().isEmpty() || txtDireccionPrincipal.getText().isEmpty() || txtDniPrincipal.getText().length()<8 || txtDistritoPrincipal.getText().isEmpty()) {
            btnPush.setEnabled(false);
        } else {
            btnPush.setEnabled(true);
        }
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane5 = new javax.swing.JTabbedPane();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtNumPrincipal = new javax.swing.JTextField();
        txtDistritoPrincipal = new javax.swing.JTextField();
        txtEncargadoPrincipal = new javax.swing.JTextField();
        txtDireccionPrincipal = new javax.swing.JTextField();
        btnPush = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSucursalesPrincipal = new javax.swing.JTable();
        btnPop = new javax.swing.JButton();
        txtDniPrincipal = new javax.swing.JTextField();
        txtTlfPrincipal = new javax.swing.JTextField();
        btnVolver = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtnumsuc2 = new javax.swing.JTextField();
        txtcodprovi2 = new javax.swing.JTextField();
        txtciudad2 = new javax.swing.JTextField();
        botonIngProv = new javax.swing.JButton();
        botonLimProv = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblprovin = new javax.swing.JTable();
        btnEliminarAd1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        txtnombreenc2 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txtprovi2 = new javax.swing.JTextField();
        txttelef2 = new javax.swing.JTextField();
        txtdni2 = new javax.swing.JTextField();
        txtdirec2 = new javax.swing.JTextField();
        btnVolver1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel15.setBackground(new java.awt.Color(238, 238, 238));

        jPanel16.setBackground(new java.awt.Color(255, 102, 102));

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Registro de Sucursales en Lima");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel7)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Número Sucursal :");

        jLabel8.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Distrito:");

        jLabel9.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Nombre del encargado :");

        jLabel10.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Telefono :");

        jLabel11.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Dirección :");

        jLabel12.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("DNI :");

        txtNumPrincipal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNumPrincipalKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumPrincipalKeyTyped(evt);
            }
        });

        txtDistritoPrincipal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDistritoPrincipalKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDistritoPrincipalKeyTyped(evt);
            }
        });

        txtEncargadoPrincipal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEncargadoPrincipalKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEncargadoPrincipalKeyTyped(evt);
            }
        });

        txtDireccionPrincipal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDireccionPrincipalKeyReleased(evt);
            }
        });

        btnPush.setBackground(new java.awt.Color(255, 102, 102));
        btnPush.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnPush.setForeground(new java.awt.Color(255, 255, 255));
        btnPush.setText("Push");
        btnPush.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPushActionPerformed(evt);
            }
        });

        btnLimpiar.setBackground(new java.awt.Color(102, 102, 102));
        btnLimpiar.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setText("Limpiar");

        tblSucursalesPrincipal.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        tblSucursalesPrincipal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "Numero Sucursal", "Telefono", "Distrito", "Direccion", "Encargado", "DNI"
            }
        ));
        jScrollPane1.setViewportView(tblSucursalesPrincipal);

        btnPop.setBackground(new java.awt.Color(102, 102, 102));
        btnPop.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnPop.setForeground(new java.awt.Color(255, 255, 255));
        btnPop.setText("Pop");
        btnPop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPopActionPerformed(evt);
            }
        });

        txtDniPrincipal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDniPrincipalKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDniPrincipalKeyTyped(evt);
            }
        });

        txtTlfPrincipal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTlfPrincipalKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTlfPrincipalKeyTyped(evt);
            }
        });

        btnVolver.setBackground(new java.awt.Color(102, 102, 102));
        btnVolver.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(btnVolver)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPop, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addGap(165, 165, 165)
                                .addComponent(txtNumPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel2)
                                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDistritoPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEncargadoPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 153, Short.MAX_VALUE)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel10))
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel15Layout.createSequentialGroup()
                                        .addGap(35, 35, 35)
                                        .addComponent(txtTlfPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtDireccionPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(txtDniPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPush, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(14, 14, 14))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNumPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txtTlfPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtDistritoPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txtDireccionPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDniPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel9)
                    .addComponent(txtEncargadoPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiar)
                    .addComponent(btnPush))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPop)
                    .addComponent(btnVolver))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane5.addTab("Principal", jPanel14);

        jPanel18.setBackground(new java.awt.Color(238, 238, 238));

        jPanel19.setBackground(new java.awt.Color(255, 102, 102));

        jLabel13.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("REGISTROS DE SUCURSALES DE PROVINCIAS");

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel13)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jLabel14.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Número Sucursal:");

        jLabel15.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Código de Provincia:");

        jLabel16.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Ciudad:");

        jLabel17.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Telefono:");

        botonIngProv.setBackground(new java.awt.Color(255, 102, 102));
        botonIngProv.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        botonIngProv.setForeground(new java.awt.Color(255, 255, 255));
        botonIngProv.setText("Agregar");

        botonLimProv.setBackground(new java.awt.Color(102, 102, 102));
        botonLimProv.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        botonLimProv.setForeground(new java.awt.Color(255, 255, 255));
        botonLimProv.setText("Limpiar");

        tblprovin.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        tblprovin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Numero Sucursal", "Telefono", "Cod.Provincia", "Provincia", "Ciudad", "Direccion", "Encargado", "DNI"
            }
        ));
        jScrollPane2.setViewportView(tblprovin);

        btnEliminarAd1.setBackground(new java.awt.Color(102, 102, 102));
        btnEliminarAd1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnEliminarAd1.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarAd1.setText("Eliminar");

        jButton3.setBackground(new java.awt.Color(255, 102, 102));
        jButton3.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Or.DNI");

        jLabel18.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("Nombre del encargado:");

        jLabel19.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("Provincia:");

        jLabel20.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("Dirección:");

        jLabel21.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("DNI:");

        btnVolver1.setBackground(new java.awt.Color(102, 102, 102));
        btnVolver1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnVolver1.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver1.setText("Volver");
        btnVolver1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolver1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16)
                            .addComponent(jLabel18))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtnumsuc2)
                                .addComponent(txtcodprovi2)
                                .addComponent(txtciudad2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtnombreenc2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(87, 87, 87)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel21))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtdni2, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
                                    .addComponent(txtdirec2)))
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel17))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txttelef2)
                                    .addComponent(txtprovi2, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)))))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addComponent(btnEliminarAd1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnVolver1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addComponent(botonLimProv, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botonIngProv, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(9, 9, 9)))
                .addGap(24, 24, 24))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel17)
                    .addComponent(txtnumsuc2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txttelef2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(txtcodprovi2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtprovi2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19))))
                .addGap(18, 18, 18)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(txtciudad2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(txtdirec2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtnombreenc2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(txtdni2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonLimProv)
                    .addComponent(botonIngProv))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminarAd1)
                    .addComponent(jButton3)
                    .addComponent(btnVolver1))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane5.addTab("Provincia", jPanel17);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane5))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane5)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPushActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPushActionPerformed
        int numSucursal = Integer.parseInt(txtNumPrincipal.getText());
        String distrito =txtDistritoPrincipal.getText();
        String encargado = txtEncargadoPrincipal.getText();
        int telefono =  Integer.parseInt(txtTlfPrincipal.getText());
        String direccion = txtDireccionPrincipal.getText();
        int  dni = Integer.parseInt(txtDniPrincipal.getText());

        Sucursales sucursal = new Sucursales(numSucursal, distrito, encargado, telefono, direccion, dni);
        nuevaSucursal.insertarPila(sucursal);

        Object[] datos = new Object[6];
        datos[0] = numSucursal;
        datos[1] = distrito;
        datos[2] = encargado;
        datos[3] = telefono;
        datos[4] = direccion;
        datos[5] = dni;
        model.addRow(datos);
        
        JOptionPane.showMessageDialog(null, "Objeto añadido a la pila.");

        limpiarCamposSucursalPrincipal();
        clickOnTextfield();

        System.out.println("Objeto añadido a la pila ----> " + sucursal.getNumSucursal()+ " - " + sucursal.getEncargado());
        System.out.println();
    }//GEN-LAST:event_btnPushActionPerformed

    private void btnPopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPopActionPerformed
        nuevaSucursal.eliminarPila();
        
        if (model.getRowCount() > 0) {
            model.removeRow(model.getRowCount() - 1);
        } else
            JOptionPane.showMessageDialog(null, "No hay filas para eliminar");
    }//GEN-LAST:event_btnPopActionPerformed

    private void txtNumPrincipalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumPrincipalKeyReleased
        habilitarBotones();
    }//GEN-LAST:event_txtNumPrincipalKeyReleased

    private void txtDistritoPrincipalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDistritoPrincipalKeyReleased
        habilitarBotones();
    }//GEN-LAST:event_txtDistritoPrincipalKeyReleased

    private void txtEncargadoPrincipalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEncargadoPrincipalKeyReleased
        habilitarBotones();
    }//GEN-LAST:event_txtEncargadoPrincipalKeyReleased

    private void txtTlfPrincipalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTlfPrincipalKeyReleased
        habilitarBotones();
    }//GEN-LAST:event_txtTlfPrincipalKeyReleased

    private void txtDireccionPrincipalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionPrincipalKeyReleased
        habilitarBotones();
    }//GEN-LAST:event_txtDireccionPrincipalKeyReleased

    private void txtDniPrincipalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniPrincipalKeyReleased
        habilitarBotones();
    }//GEN-LAST:event_txtDniPrincipalKeyReleased

    private void txtNumPrincipalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumPrincipalKeyTyped
        //Método para solo permitir el ingreso de números
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;

        if (!numeros) {
            evt.consume();
        }

        //Permitir un máximo de 4 números
        if (txtNumPrincipal.getText().length() >= 4) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNumPrincipalKeyTyped

    private void txtDniPrincipalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniPrincipalKeyTyped
        //Método para solo permitir el ingreso de números
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;

        if (!numeros) {
            evt.consume();
        }

        //Permitir un máximo de 8 números
        if (txtDniPrincipal.getText().length() >= 8) {
            evt.consume();
        }
    }//GEN-LAST:event_txtDniPrincipalKeyTyped

    private void txtDistritoPrincipalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDistritoPrincipalKeyTyped
        //Método para solo permitir el ingreso de letras
        int key = evt.getKeyChar();
        boolean minusculas = key >= 97 && key <= 122;
        boolean mayusculas  = key >= 65 && key <= 90;

        if (!(minusculas || mayusculas)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtDistritoPrincipalKeyTyped

    private void txtEncargadoPrincipalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEncargadoPrincipalKeyTyped
       //Método para solo permitir el ingreso de letras
        int key = evt.getKeyChar();
        boolean minusculas = key >= 97 && key <= 122;
        boolean mayusculas  = key >= 65 && key <= 90;

        if (!(minusculas || mayusculas)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtEncargadoPrincipalKeyTyped

    private void txtTlfPrincipalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTlfPrincipalKeyTyped
       //Método para solo permitir el ingreso de números
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;

        if (!numeros) {
            evt.consume();
        }

        //Permitir un máximo de 9 números
        if (txtTlfPrincipal.getText().length() >= 9) {
            evt.consume();
        }
    }//GEN-LAST:event_txtTlfPrincipalKeyTyped

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        FramePrincipal reg = new FramePrincipal();
        reg.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnVolver1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolver1ActionPerformed
       FramePrincipal reg = new FramePrincipal();
        reg.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnVolver1ActionPerformed

 
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
            java.util.logging.Logger.getLogger(RegistrosSucursales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrosSucursales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrosSucursales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrosSucursales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrosSucursales().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonIngProv;
    private javax.swing.JButton botonLimProv;
    private javax.swing.JButton btnEliminarAd1;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnPop;
    private javax.swing.JButton btnPush;
    private javax.swing.JButton btnVolver;
    private javax.swing.JButton btnVolver1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane5;
    private javax.swing.JTable tblSucursalesPrincipal;
    private javax.swing.JTable tblprovin;
    private javax.swing.JTextField txtDireccionPrincipal;
    private javax.swing.JTextField txtDistritoPrincipal;
    private javax.swing.JTextField txtDniPrincipal;
    private javax.swing.JTextField txtEncargadoPrincipal;
    private javax.swing.JTextField txtNumPrincipal;
    private javax.swing.JTextField txtTlfPrincipal;
    private javax.swing.JTextField txtciudad2;
    private javax.swing.JTextField txtcodprovi2;
    private javax.swing.JTextField txtdirec2;
    private javax.swing.JTextField txtdni2;
    private javax.swing.JTextField txtnombreenc2;
    private javax.swing.JTextField txtnumsuc2;
    private javax.swing.JTextField txtprovi2;
    private javax.swing.JTextField txttelef2;
    // End of variables declaration//GEN-END:variables
}
