package Vistas;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import ArrayLists.AProdMedicos;
import ArrayLists.AProdComestible;
import ArrayLists.AProdCuidadoPersonal;
import LinkedLists.ProdCuidadoPersonalList;
import misCGenericas.Generico1;
import modelo.ProdMedicos;
import modelo.ProdComestibles;
import modelo.ProdCuidadoPersonal;

/**
 *
 * @author Omar Tc
 */
public class RegistroProductos extends javax.swing.JFrame {

    DefaultTableModel tmedico = new DefaultTableModel();
    AProdMedicos medicoArray = new AProdMedicos();
    ProdMedicos mdi;

    DefaultTableModel tcomes = new DefaultTableModel();
    AProdComestible comesArray = new AProdComestible();

    DefaultTableModel tcuid;
    ProdCuidadoPersonalList cuidList;

    public RegistroProductos() {
        initComponents();

        tmedico.addColumn("Codigo");
        tmedico.addColumn("Nombre");
        tmedico.addColumn("Tipo fabricado");
        tmedico.addColumn("Unidad de medida");
        tmedico.addColumn("Contenido");
        tmedico.addColumn("Precio");
        tmedico.addColumn("Stock");
        tmedico.addColumn("RUC Proveedor");
        tmedico.addColumn("Costo TOTAL");
        tblProdMedicos.setModel(tmedico);

        tcomes.addColumn("Código");
        tcomes.addColumn("Nombre");
        tcomes.addColumn("Tipo");
        tcomes.addColumn("Precio");
        tcomes.addColumn("Stock");
        tcomes.addColumn("Caducidad");
        tcomes.addColumn("RUC. Proveedor");
        tcomes.addColumn("COSTO TOTAL");
        tblProdComida.setModel(tcomes);

        tcuid = new DefaultTableModel();
        tcuid.addColumn("Código");
        tcuid.addColumn("Nombre");
        tcuid.addColumn("Tipo");
        tcuid.addColumn("unidad de medida");
        tcuid.addColumn("Contenido");
        tcuid.addColumn("Precio");
        tcuid.addColumn("Stock");
        tcuid.addColumn("RUC. Proveedor");
        tcuid.addColumn("COSTO TOTAL");
        tblCuidPer3.setModel(tcuid);
        cuidList = new ProdCuidadoPersonalList();
          setLocationRelativeTo(this);

        //Deshabilitamos los botones hata que los campos esten completos
        btn1AgregarProdMed.setEnabled(false);
        btn1LimpiarProdMed.setEnabled(false);

        btn2AgregarComes.setEnabled(false);
        btn2LimpiarComes.setEnabled(false);

        btn3AgregarProdCuidFin.setEnabled(false);
        btn3AgregarProdCuidIni.setEnabled(false);
        btn3AgregarProdCuidMed.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txt1Cod = new javax.swing.JTextField();
        txt1RUCPro = new javax.swing.JTextField();
        txt1NamePro = new javax.swing.JTextField();
        cmb1Tipo = new javax.swing.JComboBox<>();
        txt1Precio = new javax.swing.JTextField();
        btn1AgregarProdMed = new javax.swing.JButton();
        btn1LimpiarProdMed = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblProdMedicos = new javax.swing.JTable();
        btn1EliminarProdMed = new javax.swing.JButton();
        btn1OrdenarMergeNom = new javax.swing.JButton();
        SpinnerStock1 = new javax.swing.JSpinner();
        jLabel19 = new javax.swing.JLabel();
        txt1contenido = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        cmb1UMedida = new javax.swing.JComboBox<>();
        btn1OrdenarQuickMedCod = new javax.swing.JButton();
        btn1Volver = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txt2Cod = new javax.swing.JTextField();
        txt2RUCPro = new javax.swing.JTextField();
        txt2NamePro = new javax.swing.JTextField();
        cmb2Tipocomes = new javax.swing.JComboBox<>();
        txt2Precio = new javax.swing.JTextField();
        btn2AgregarComes = new javax.swing.JButton();
        btn2LimpiarComes = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProdComida = new javax.swing.JTable();
        btn2EliminarComes = new javax.swing.JButton();
        btn2OrdenarQuickComesNom = new javax.swing.JButton();
        SpinnerStock2 = new javax.swing.JSpinner();
        jLabel13 = new javax.swing.JLabel();
        txt2Caducidad = new javax.swing.JTextField();
        btn2OrdenarQuickComesCod = new javax.swing.JButton();
        btnVolver2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txt3Cod = new javax.swing.JTextField();
        txt3RUCPro = new javax.swing.JTextField();
        txt3NamePro = new javax.swing.JTextField();
        cmb3Tipo = new javax.swing.JComboBox<>();
        txt3Precio = new javax.swing.JTextField();
        btn3AgregarProdCuidIni = new javax.swing.JButton();
        btn3LimpiarCuidPer = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblCuidPer3 = new javax.swing.JTable();
        btn3EliminarCuidIni = new javax.swing.JButton();
        SpinnerStock3 = new javax.swing.JSpinner();
        jLabel25 = new javax.swing.JLabel();
        txt3contenido = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        cmb3UMedida3 = new javax.swing.JComboBox<>();
        btn3AgregarProdCuidFin = new javax.swing.JButton();
        btnVolver3 = new javax.swing.JButton();
        btn3EliminarFin = new javax.swing.JButton();
        btn3MostrarElementos = new javax.swing.JButton();
        btn3AgregarProdCuidMed = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel7.setBackground(new java.awt.Color(238, 238, 238));

        jPanel8.setBackground(new java.awt.Color(255, 102, 102));

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Registro de Productos Medicos");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel4)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel5.setText("Codigo:");

        jLabel14.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel14.setText("RUC Prov:");

        jLabel15.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel15.setText("Nombre Prod:");

        jLabel16.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel16.setText("Tipo:");

        jLabel17.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel17.setText("Precio:");

        jLabel18.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel18.setText("Cont:");

        txt1Cod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt1CodKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt1CodKeyTyped(evt);
            }
        });

        txt1RUCPro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt1RUCProKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt1RUCProKeyTyped(evt);
            }
        });

        txt1NamePro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt1NameProKeyReleased(evt);
            }
        });

        cmb1Tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccionar--", "Comprimidos", "Capsulas", "Liquidos", "Cremas", "Parches" }));

        txt1Precio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt1PrecioKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt1PrecioKeyTyped(evt);
            }
        });

        btn1AgregarProdMed.setBackground(new java.awt.Color(255, 102, 102));
        btn1AgregarProdMed.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btn1AgregarProdMed.setForeground(new java.awt.Color(255, 255, 255));
        btn1AgregarProdMed.setText("Agregar");
        btn1AgregarProdMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1AgregarProdMedActionPerformed(evt);
            }
        });

        btn1LimpiarProdMed.setBackground(new java.awt.Color(102, 102, 102));
        btn1LimpiarProdMed.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btn1LimpiarProdMed.setForeground(new java.awt.Color(255, 255, 255));
        btn1LimpiarProdMed.setText("Limpiar");
        btn1LimpiarProdMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1LimpiarProdMedActionPerformed(evt);
            }
        });

        tblProdMedicos.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        tblProdMedicos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Cod. Pro", "Nombre", "Tipo", "Contenido", "Precio", "Stock"
            }
        ));
        jScrollPane2.setViewportView(tblProdMedicos);

        btn1EliminarProdMed.setBackground(new java.awt.Color(102, 102, 102));
        btn1EliminarProdMed.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btn1EliminarProdMed.setForeground(new java.awt.Color(255, 255, 255));
        btn1EliminarProdMed.setText("Eliminar");
        btn1EliminarProdMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1EliminarProdMedActionPerformed(evt);
            }
        });

        btn1OrdenarMergeNom.setBackground(new java.awt.Color(255, 102, 102));
        btn1OrdenarMergeNom.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btn1OrdenarMergeNom.setForeground(new java.awt.Color(255, 255, 255));
        btn1OrdenarMergeNom.setText("Ordenar Nom.");
        btn1OrdenarMergeNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1OrdenarMergeNomActionPerformed(evt);
            }
        });

        SpinnerStock1.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        jLabel19.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel19.setText("Stock:");

        txt1contenido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt1contenidoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt1contenidoKeyTyped(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel26.setText("U.Med:");

        cmb1UMedida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selc.", "L", "ml", "Kg", "g" }));

        btn1OrdenarQuickMedCod.setBackground(new java.awt.Color(255, 102, 102));
        btn1OrdenarQuickMedCod.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btn1OrdenarQuickMedCod.setForeground(new java.awt.Color(255, 255, 255));
        btn1OrdenarQuickMedCod.setText("Ordenar Cod.");
        btn1OrdenarQuickMedCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1OrdenarQuickMedCodActionPerformed(evt);
            }
        });

        btn1Volver.setBackground(new java.awt.Color(102, 102, 102));
        btn1Volver.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btn1Volver.setForeground(new java.awt.Color(255, 255, 255));
        btn1Volver.setText("Volver");
        btn1Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1VolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(btn1EliminarProdMed, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn1Volver, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn1OrdenarQuickMedCod)
                        .addGap(36, 36, 36)
                        .addComponent(btn1OrdenarMergeNom))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(btn1LimpiarProdMed, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt1Cod)
                            .addComponent(txt1RUCPro)
                            .addComponent(txt1NamePro, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 190, Short.MAX_VALUE)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                        .addComponent(jLabel16)
                                        .addGap(15, 15, 15))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel17)
                                            .addComponent(jLabel26))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cmb1Tipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(cmb1UMedida, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt1Precio))
                                        .addGap(12, 12, 12)
                                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel7Layout.createSequentialGroup()
                                                .addComponent(jLabel19)
                                                .addGap(18, 18, 18)
                                                .addComponent(SpinnerStock1, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(jLabel18)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txt1contenido, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addComponent(btn1AgregarProdMed, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(33, 33, 33))
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt1Cod, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jLabel16)
                        .addComponent(cmb1Tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(SpinnerStock1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel19)
                        .addComponent(txt1Precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel17))
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel14)
                        .addComponent(txt1RUCPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel18)
                        .addComponent(txt1contenido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel26)
                        .addComponent(cmb1UMedida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel15)
                        .addComponent(txt1NamePro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn1AgregarProdMed)
                    .addComponent(btn1LimpiarProdMed))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn1EliminarProdMed, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn1Volver))
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn1OrdenarMergeNom)
                        .addComponent(btn1OrdenarQuickMedCod)))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 809, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 1, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 1, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 571, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Medicos", jPanel1);

        jPanel4.setBackground(new java.awt.Color(238, 238, 238));

        jPanel5.setBackground(new java.awt.Color(255, 102, 102));

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Registro de Productos Comestibles");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel3)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel2.setText("Codigo:");

        jLabel8.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel8.setText("RUC Prov:");

        jLabel9.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel9.setText("Nombre Prod:");

        jLabel10.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel10.setText("Tipo:");

        jLabel11.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel11.setText("Precio:");

        jLabel12.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel12.setText("Cad:");

        txt2Cod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt2CodKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt2CodKeyTyped(evt);
            }
        });

        txt2RUCPro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt2RUCProKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt2RUCProKeyTyped(evt);
            }
        });

        txt2NamePro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt2NameProKeyReleased(evt);
            }
        });

        cmb2Tipocomes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccionar--", "Fruta/Verdura", "Embutidos", "Otros", "Bebida", "Proteina" }));

        txt2Precio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt2PrecioKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt2PrecioKeyTyped(evt);
            }
        });

        btn2AgregarComes.setBackground(new java.awt.Color(255, 102, 102));
        btn2AgregarComes.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btn2AgregarComes.setForeground(new java.awt.Color(255, 255, 255));
        btn2AgregarComes.setText("Agregar");
        btn2AgregarComes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2AgregarComesActionPerformed(evt);
            }
        });

        btn2LimpiarComes.setBackground(new java.awt.Color(102, 102, 102));
        btn2LimpiarComes.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btn2LimpiarComes.setForeground(new java.awt.Color(255, 255, 255));
        btn2LimpiarComes.setText("Limpiar");
        btn2LimpiarComes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2LimpiarComesActionPerformed(evt);
            }
        });

        tblProdComida.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        tblProdComida.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Cod. Pro", "Nombre", "Tipo", "Precio", "Stock", "Caducidad"
            }
        ));
        jScrollPane1.setViewportView(tblProdComida);

        btn2EliminarComes.setBackground(new java.awt.Color(102, 102, 102));
        btn2EliminarComes.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btn2EliminarComes.setForeground(new java.awt.Color(255, 255, 255));
        btn2EliminarComes.setText("Eliminar");
        btn2EliminarComes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2EliminarComesActionPerformed(evt);
            }
        });

        btn2OrdenarQuickComesNom.setBackground(new java.awt.Color(255, 102, 102));
        btn2OrdenarQuickComesNom.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btn2OrdenarQuickComesNom.setForeground(new java.awt.Color(255, 255, 255));
        btn2OrdenarQuickComesNom.setText("Ordenar Nom.");
        btn2OrdenarQuickComesNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2OrdenarQuickComesNomActionPerformed(evt);
            }
        });

        SpinnerStock2.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        jLabel13.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel13.setText("Stock:");

        txt2Caducidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt2CaducidadKeyReleased(evt);
            }
        });

        btn2OrdenarQuickComesCod.setBackground(new java.awt.Color(255, 102, 102));
        btn2OrdenarQuickComesCod.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btn2OrdenarQuickComesCod.setForeground(new java.awt.Color(255, 255, 255));
        btn2OrdenarQuickComesCod.setText("Ordenar Cod.");
        btn2OrdenarQuickComesCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2OrdenarQuickComesCodActionPerformed(evt);
            }
        });

        btnVolver2.setBackground(new java.awt.Color(102, 102, 102));
        btnVolver2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnVolver2.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver2.setText("Volver");
        btnVolver2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolver2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btn2EliminarComes, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnVolver2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn2OrdenarQuickComesCod)
                        .addGap(18, 18, 18)
                        .addComponent(btn2OrdenarQuickComesNom))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 757, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(btn2LimpiarComes, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn2AgregarComes))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt2Cod)
                            .addComponent(txt2RUCPro)
                            .addComponent(txt2NamePro, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel10))
                                .addGap(15, 15, 15))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmb2Tipocomes, 0, 200, Short.MAX_VALUE)
                            .addComponent(txt2Precio)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(SpinnerStock2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt2Caducidad, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(33, 33, 33))
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt2Cod, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel10)
                        .addComponent(cmb2Tipocomes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel11)
                    .addComponent(txt2RUCPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt2Precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(SpinnerStock2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13)
                        .addComponent(txt2Caducidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(txt2NamePro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn2AgregarComes)
                    .addComponent(btn2LimpiarComes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn2EliminarComes)
                    .addComponent(btn2OrdenarQuickComesNom)
                    .addComponent(btn2OrdenarQuickComesCod)
                    .addComponent(btnVolver2))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Comestible", jPanel2);

        jPanel10.setBackground(new java.awt.Color(238, 238, 238));

        jPanel11.setBackground(new java.awt.Color(255, 102, 102));

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Registro de Productos de Cuidado Personal");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel6)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel7.setText("Codigo:");

        jLabel20.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel20.setText("RUC Prov:");

        jLabel21.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel21.setText("Nombre Prod:");

        jLabel22.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel22.setText("Tipo:");

        jLabel23.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel23.setText("Precio:");

        jLabel24.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel24.setText("Cont:");

        txt3Cod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt3CodKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt3CodKeyTyped(evt);
            }
        });

        txt3RUCPro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt3RUCProKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt3RUCProKeyTyped(evt);
            }
        });

        cmb3Tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccionar--", "Cabello", "Piel", "Higiene Bucal" }));

        txt3Precio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt3PrecioKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt3PrecioKeyTyped(evt);
            }
        });

        btn3AgregarProdCuidIni.setBackground(new java.awt.Color(255, 102, 102));
        btn3AgregarProdCuidIni.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btn3AgregarProdCuidIni.setForeground(new java.awt.Color(255, 255, 255));
        btn3AgregarProdCuidIni.setText("Agregar Inicio");
        btn3AgregarProdCuidIni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3AgregarProdCuidIniActionPerformed(evt);
            }
        });

        btn3LimpiarCuidPer.setBackground(new java.awt.Color(102, 102, 102));
        btn3LimpiarCuidPer.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btn3LimpiarCuidPer.setForeground(new java.awt.Color(255, 255, 255));
        btn3LimpiarCuidPer.setText("Limpiar");
        btn3LimpiarCuidPer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3LimpiarCuidPerActionPerformed(evt);
            }
        });

        tblCuidPer3.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        tblCuidPer3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Cod. Pro", "Nombre", "Tipo", "Contenido", "Precio", "Stock"
            }
        ));
        jScrollPane3.setViewportView(tblCuidPer3);

        btn3EliminarCuidIni.setBackground(new java.awt.Color(102, 102, 102));
        btn3EliminarCuidIni.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btn3EliminarCuidIni.setForeground(new java.awt.Color(255, 255, 255));
        btn3EliminarCuidIni.setText("Eliminar Inicio");
        btn3EliminarCuidIni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3EliminarCuidIniActionPerformed(evt);
            }
        });

        SpinnerStock3.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        jLabel25.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel25.setText("Stock:");

        txt3contenido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt3contenidoKeyTyped(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel27.setText("U.Med:");

        cmb3UMedida3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selc.", "Unidad", "Docena", "SixPack", "L", "ml", "Kg", "g", " " }));

        btn3AgregarProdCuidFin.setBackground(new java.awt.Color(255, 102, 102));
        btn3AgregarProdCuidFin.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btn3AgregarProdCuidFin.setForeground(new java.awt.Color(255, 255, 255));
        btn3AgregarProdCuidFin.setText("Agregar Fin");
        btn3AgregarProdCuidFin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3AgregarProdCuidFinActionPerformed(evt);
            }
        });

        btnVolver3.setBackground(new java.awt.Color(102, 102, 102));
        btnVolver3.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnVolver3.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver3.setText("Volver");
        btnVolver3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolver3ActionPerformed(evt);
            }
        });

        btn3EliminarFin.setBackground(new java.awt.Color(102, 102, 102));
        btn3EliminarFin.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btn3EliminarFin.setForeground(new java.awt.Color(255, 255, 255));
        btn3EliminarFin.setText("Eliminar Final");
        btn3EliminarFin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3EliminarFinActionPerformed(evt);
            }
        });

        btn3MostrarElementos.setBackground(new java.awt.Color(255, 102, 102));
        btn3MostrarElementos.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btn3MostrarElementos.setForeground(new java.awt.Color(255, 255, 255));
        btn3MostrarElementos.setText("Mostrar Elementos");
        btn3MostrarElementos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3MostrarElementosActionPerformed(evt);
            }
        });

        btn3AgregarProdCuidMed.setBackground(new java.awt.Color(255, 102, 102));
        btn3AgregarProdCuidMed.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btn3AgregarProdCuidMed.setForeground(new java.awt.Color(255, 255, 255));
        btn3AgregarProdCuidMed.setText("Agregar Med");
        btn3AgregarProdCuidMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3AgregarProdCuidMedActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(btn3EliminarCuidIni)
                        .addGap(18, 18, 18)
                        .addComponent(btn3EliminarFin)
                        .addGap(18, 18, 18)
                        .addComponent(btnVolver3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn3MostrarElementos, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addComponent(btn3LimpiarCuidPer, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn3AgregarProdCuidFin)
                        .addGap(18, 18, 18)
                        .addComponent(btn3AgregarProdCuidMed)
                        .addGap(18, 18, 18)
                        .addComponent(btn3AgregarProdCuidIni))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel20)
                            .addComponent(jLabel21))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt3Cod)
                            .addComponent(txt3RUCPro)
                            .addComponent(txt3NamePro, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(195, 195, 195)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel10Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(txt3Precio, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel25)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(SpinnerStock3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(cmb3Tipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel27)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmb3UMedida3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel24)
                                .addGap(12, 12, 12)
                                .addComponent(txt3contenido, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(24, 24, 24))
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt3Cod, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(jLabel22)
                        .addComponent(cmb3Tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jLabel23)
                    .addComponent(txt3RUCPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt3Precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SpinnerStock3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel24)
                        .addComponent(txt3contenido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel27)
                        .addComponent(cmb3UMedida3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel21)
                        .addComponent(txt3NamePro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn3AgregarProdCuidIni)
                    .addComponent(btn3LimpiarCuidPer)
                    .addComponent(btn3AgregarProdCuidFin)
                    .addComponent(btn3AgregarProdCuidMed))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn3EliminarCuidIni)
                    .addComponent(btnVolver3)
                    .addComponent(btn3EliminarFin)
                    .addComponent(btn3MostrarElementos))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 809, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 571, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Cuidado Personal", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Metodos para que si los datos estan vacios los botones no se habiliten
    public void habilitarbotones1() {
        if (txt1Cod.getText().length() < 6 || txt1NamePro.getText().isEmpty() || txt1Precio.getText().isEmpty() || txt1RUCPro.getText().length() < 11
                || txt1contenido.getText().isEmpty()) {
            btn1AgregarProdMed.setEnabled(false);
            btn1LimpiarProdMed.setEnabled(false);

        } else {
            btn1AgregarProdMed.setEnabled(true);
            btn1LimpiarProdMed.setEnabled(true);
        }
    }

    public void habilitarbotonoes2() {
        if (txt2Cod.getText().length() < 6 || txt2NamePro.getText().isEmpty() || txt2RUCPro.getText().length() < 11 || txt2Precio.getText().isEmpty()
                || txt2Caducidad.getText().isEmpty()) {

            btn2AgregarComes.setEnabled(false);
            btn2LimpiarComes.setEnabled(false);
        } else {
            btn2AgregarComes.setEnabled(true);
            btn2LimpiarComes.setEnabled(true);
        }
    }

    public void habilitarBotones3() {
        if (txt3Cod.getText().length() < 6 || txt3NamePro.getText().isEmpty() || txt3RUCPro.getText().length() < 11 || txt3Precio.getText().isEmpty()
                || txt3contenido.getText().isEmpty()) {
            btn3AgregarProdCuidFin.setEnabled(false);
            btn3AgregarProdCuidIni.setEnabled(false);
            btn3AgregarProdCuidMed.setEnabled(false);
        } else {
            btn3AgregarProdCuidIni.setEnabled(true);
            btn3AgregarProdCuidFin.setEnabled(true);
            btn3AgregarProdCuidMed.setEnabled(true);
        }
    }

    private void btn1AgregarProdMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1AgregarProdMedActionPerformed

        int codigo = Integer.parseInt(txt1Cod.getText());
        Long RUCProv = Long.parseLong(txt1RUCPro.getText());
        double precio = Double.parseDouble(txt1Precio.getText());
        int stock = (int) SpinnerStock1.getValue();
        double contenido = Double.parseDouble(txt1contenido.getText());
        String cmbtipo = cmb1Tipo.getSelectedItem().toString();
        String nombreproducto = txt1NamePro.getText();
        String UniMed = cmb1UMedida.getSelectedItem().toString();

        //Comprueba que se selcciono datos del Jcombo y Jspinner
        if (cmb1Tipo.getSelectedIndex() == 0 || cmb1UMedida.getSelectedIndex() == 0 || stock == 0) {
            JOptionPane.showMessageDialog(rootPane, "Compruebe si los datos estan seleccionados");
        } else {
            //Si todos los datos estan llenos agrega el producto

            mdi = new ProdMedicos(contenido, UniMed, nombreproducto, codigo, RUCProv, cmbtipo, precio, stock, 0);
            double desc = mdi.calcdescuentoRecursivo(precio, stock);

            tmedico.setRowCount(0);
            ProdMedicos md = new ProdMedicos(contenido, UniMed, nombreproducto, codigo, RUCProv, cmbtipo, precio, stock, desc);
            medicoArray.agregarProductoH(md);

            for (int o = 0; o < medicoArray.tamañoArreglo(); o++) {
                Object[] fila = {
                    medicoArray.obtener(o).getCodigo(),
                    medicoArray.obtener(o).getNombre_producto(),
                    medicoArray.obtener(o).getTipo(),
                    medicoArray.obtener(o).getUniMed(),
                    medicoArray.obtener(o).getContenido(),
                    medicoArray.obtener(o).getPrecio(),
                    medicoArray.obtener(o).getStock(),
                    medicoArray.obtener(o).getRucProveedor(),
                    medicoArray.obtener(o).getResult()
                };
                tmedico.addRow(fila);
            }
            tblProdMedicos.setModel(tmedico);
        }
    }//GEN-LAST:event_btn1AgregarProdMedActionPerformed

    private void btn1EliminarProdMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1EliminarProdMedActionPerformed
        int filaSeleccionada = tblProdMedicos.getSelectedRow();

        if (filaSeleccionada >= 0) {
            tmedico.removeRow(filaSeleccionada);
            medicoArray.eliminarProductoH(filaSeleccionada);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Selecciona una fila para eliminar.");
        }

    }//GEN-LAST:event_btn1EliminarProdMedActionPerformed

    private void btn1OrdenarMergeNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1OrdenarMergeNomActionPerformed
        //verificar que haya por lo menos 2 datos para ordenar
        if (tblProdMedicos.getRowCount() <= 1) {
            JOptionPane.showMessageDialog(rootPane, "Deben haber por lo menos 2 productos registrados");
        } else {
            tmedico.setRowCount(0);
            medicoArray.mergeSortNom();
            for (int o = 0; o < medicoArray.tamañoArreglo(); o++) {
                Object[] fila = {
                    medicoArray.obtener(o).getCodigo(),
                    medicoArray.obtener(o).getNombre_producto(),
                    medicoArray.obtener(o).getTipo(),
                    medicoArray.obtener(o).getUniMed(),
                    medicoArray.obtener(o).getContenido(),
                    medicoArray.obtener(o).getPrecio(),
                    medicoArray.obtener(o).getStock(),
                    medicoArray.obtener(o).getRucProveedor(),
                    medicoArray.obtener(o).getResult()
                };
                tmedico.addRow(fila);
            }
            tblProdMedicos.setModel(tmedico);
        }
    }//GEN-LAST:event_btn1OrdenarMergeNomActionPerformed

    private void btn1OrdenarQuickMedCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1OrdenarQuickMedCodActionPerformed
        //Verificar que haya 2 productos agregados para ordenar
        if (tblProdMedicos.getRowCount() <= 1) {
            JOptionPane.showMessageDialog(rootPane, "Deben haber por lo menos 2 productos registrados");
        } else {
            tmedico.setRowCount(0);
            medicoArray.mergeSortCod();
            for (int o = 0; o < medicoArray.tamañoArreglo(); o++) {
                Object[] fila = {
                    medicoArray.obtener(o).getCodigo(),
                    medicoArray.obtener(o).getNombre_producto(),
                    medicoArray.obtener(o).getTipo(),
                    medicoArray.obtener(o).getUniMed(),
                    medicoArray.obtener(o).getContenido(),
                    medicoArray.obtener(o).getPrecio(),
                    medicoArray.obtener(o).getStock(),
                    medicoArray.obtener(o).getRucProveedor(),
                    medicoArray.obtener(o).getResult()
                };
                tmedico.addRow(fila);
            }
            tblProdMedicos.setModel(tmedico);
        }
    }//GEN-LAST:event_btn1OrdenarQuickMedCodActionPerformed

    private void btn2AgregarComesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2AgregarComesActionPerformed
        int codigo = Integer.parseInt(txt2Cod.getText());
        Long RUCProv = Long.parseLong(txt2RUCPro.getText());
        double precio = Double.parseDouble(txt2Precio.getText());
        int stock = (int) SpinnerStock2.getValue();
        int caducidad = Integer.parseInt(txt2Caducidad.getText());
        String nombreproducto = txt2NamePro.getText();
        String cmbtipo = cmb2Tipocomes.getSelectedItem().toString();

        //Usamos la calse generica
        Generico1<Double, Integer> generico1 = new Generico1(precio, stock);
        double resultado = generico1.multiplicar();

        //Comprueba que el tipo de producto comestible este seleccionado y tenga stock, si no manda alerta
        if (cmb2Tipocomes.getSelectedIndex() == 0 || stock == 0) {
            JOptionPane.showMessageDialog(rootPane, "Compruebe si los datos estan seleccionados");
        } else {
            tcomes.setRowCount(0);
            ProdComestibles comes = new ProdComestibles(caducidad, nombreproducto, codigo, RUCProv, cmbtipo, precio, stock, resultado);
            comesArray.agregarProductoC(comes);
            for (int o = 0; o < comesArray.tamañoArreglo(); o++) {
                Object[] fila = {
                    comesArray.obtener(o).getCodigo(),
                    comesArray.obtener(o).getNombre_producto(),
                    comesArray.obtener(o).getTipo(),
                    comesArray.obtener(o).getPrecio(),
                    comesArray.obtener(o).getStock(),
                    comesArray.obtener(o).getCaducidad(),
                    comesArray.obtener(o).getRucProveedor(),
                    comesArray.obtener(o).getResult()
                };
                tcomes.addRow(fila);
            }
            tblProdComida.setModel(tcomes);
        }
    }//GEN-LAST:event_btn2AgregarComesActionPerformed

    private void btn2OrdenarQuickComesNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2OrdenarQuickComesNomActionPerformed

        if (tblProdComida.getRowCount() <= 1) {
            JOptionPane.showMessageDialog(rootPane, "Deben haber por lo menos 2 productos registrados");
        } else {
            tcomes.setRowCount(0);
            comesArray.mergeSortNom();
            for (int o = 0; o < comesArray.tamañoArreglo(); o++) {
                Object[] fila = {
                    comesArray.obtener(o).getCodigo(),
                    comesArray.obtener(o).getNombre_producto(),
                    comesArray.obtener(o).getTipo(),
                    comesArray.obtener(o).getPrecio(),
                    comesArray.obtener(o).getStock(),
                    comesArray.obtener(o).getCaducidad(),
                    comesArray.obtener(o).getRucProveedor(),
                    comesArray.obtener(o).getResult()
                };
                tcomes.addRow(fila);
            }
            tblProdComida.setModel(tcomes);
        }

    }//GEN-LAST:event_btn2OrdenarQuickComesNomActionPerformed

    private void btn2OrdenarQuickComesCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2OrdenarQuickComesCodActionPerformed

        if (tblProdComida.getRowCount() <= 1) {
            JOptionPane.showMessageDialog(rootPane, "Deben haber por lo menos 2 productos registrados");
        } else {
            tcomes.setRowCount(0);
            comesArray.mergeSortCod();
            for (int o = 0; o < comesArray.tamañoArreglo(); o++) {
                Object[] fila = {
                    comesArray.obtener(o).getCodigo(),
                    comesArray.obtener(o).getNombre_producto(),
                    comesArray.obtener(o).getTipo(),
                    comesArray.obtener(o).getPrecio(),
                    comesArray.obtener(o).getStock(),
                    comesArray.obtener(o).getCaducidad(),
                    comesArray.obtener(o).getRucProveedor(),
                    comesArray.obtener(o).getResult()
                };
                tcomes.addRow(fila);
            }
            tblProdComida.setModel(tcomes);
        }
    }//GEN-LAST:event_btn2OrdenarQuickComesCodActionPerformed

    private void btn2EliminarComesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2EliminarComesActionPerformed

        int filaseleccionada = tblProdComida.getSelectedRow();
        if (filaseleccionada >= 0) {
            tcomes.removeRow(filaseleccionada);
            comesArray.eliminarProductoC(filaseleccionada);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Seleccionar una fila para eliminar");
        }

    }//GEN-LAST:event_btn2EliminarComesActionPerformed

    private void btn1LimpiarProdMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1LimpiarProdMedActionPerformed
        txt1Cod.setText("");
        txt1RUCPro.setText("");
        txt1NamePro.setText("");
        cmb1Tipo.setSelectedIndex(0);
        txt1Precio.setText("");
        SpinnerStock1.setValue(0);
        cmb1UMedida.setSelectedIndex(0);
        txt1contenido.setText("");
    }//GEN-LAST:event_btn1LimpiarProdMedActionPerformed

    private void btn2LimpiarComesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2LimpiarComesActionPerformed
        txt2Cod.setText("");
        txt2RUCPro.setText("");
        txt2NamePro.setText("");
        cmb2Tipocomes.setSelectedIndex(0);
        txt2Precio.setText("");
        SpinnerStock2.setValue(0);
        txt2Caducidad.setText("");
    }//GEN-LAST:event_btn2LimpiarComesActionPerformed

    private void btn3AgregarProdCuidFinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3AgregarProdCuidFinActionPerformed
        int codigo = Integer.parseInt(txt3Cod.getText());
        Long RUCProv = Long.parseLong(txt3RUCPro.getText());
        double precio = Double.parseDouble(txt3Precio.getText());
        int stock = (int) SpinnerStock3.getValue();
        String cmbtipo = cmb3Tipo.getSelectedItem().toString();
        String nombreproducto = txt3NamePro.getText();
        String UniMed = cmb3UMedida3.getSelectedItem().toString();
        int contenido = Integer.parseInt(txt3contenido.getText());

        //Usamos la calse generica
        Generico1<Double, Integer> generico1 = new Generico1(precio, stock);
        double resultado = generico1.multiplicar();

        if (cmb3Tipo.getSelectedIndex() == 0 || cmb3UMedida3.getSelectedIndex() == 0 || stock == 0) {
            JOptionPane.showMessageDialog(rootPane, "Compruebe si los datos estan seleccionados");
        } else {
            ProdCuidadoPersonal cui = new ProdCuidadoPersonal(contenido, UniMed, nombreproducto, codigo, RUCProv, cmbtipo, precio, stock, resultado);
            cuidList.agregarFinal(cui);
            Object[] rowData = {
                cui.getCodigo(),
                cui.getNombre_producto(),
                cui.getTipo(),
                cui.getUnidadMed(),
                cui.getContenido(),
                cui.getPrecio(),
                cui.getStock(),
                cui.getRucProveedor(),
                cui.getResult()
            };
            tcuid.addRow(rowData);
        }

    }//GEN-LAST:event_btn3AgregarProdCuidFinActionPerformed

    private void btn3EliminarCuidIniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3EliminarCuidIniActionPerformed
        if (tblCuidPer3.getRowCount()==0) {
            JOptionPane.showMessageDialog(rootPane, "Lista vacia");
        }else{
        cuidList.eliminarPrimero();
        tcuid.removeRow(0);
        }
    }//GEN-LAST:event_btn3EliminarCuidIniActionPerformed

    private void btn3LimpiarCuidPerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3LimpiarCuidPerActionPerformed
        txt3Cod.setText("");
        txt3RUCPro.setText("");
        txt3NamePro.setText("");
        cmb3Tipo.setSelectedIndex(0);
        txt3Precio.setText("");
        SpinnerStock3.setValue(0);
        cmb3UMedida3.setSelectedIndex(0);
        txt3contenido.setText("");
    }//GEN-LAST:event_btn3LimpiarCuidPerActionPerformed

    private void btn3AgregarProdCuidIniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3AgregarProdCuidIniActionPerformed
        int codigo = Integer.parseInt(txt3Cod.getText());
        Long RUCProv = Long.parseLong(txt3RUCPro.getText());
        double precio = Double.parseDouble(txt3Precio.getText());
        int stock = (int) SpinnerStock3.getValue();
        String cmbtipo = cmb3Tipo.getSelectedItem().toString();
        String nombreproducto = txt3NamePro.getText();
        String UniMed = cmb3UMedida3.getSelectedItem().toString();
        int contenido = Integer.parseInt(txt3contenido.getText());

        //Usamos la calse generica
        Generico1<Double, Integer> generico1 = new Generico1(precio, stock);
        double resultado = generico1.multiplicar();

        if (cmb3Tipo.getSelectedIndex() == 0 || cmb3UMedida3.getSelectedIndex() == 0 || stock == 0) {
            JOptionPane.showMessageDialog(rootPane, "Compruebe si los datos estan seleccionados");
        } else {
            ProdCuidadoPersonal cui = new ProdCuidadoPersonal(contenido, UniMed, nombreproducto, codigo, RUCProv, cmbtipo, precio, stock, resultado);
            cuidList.agregarInicio(cui);
            Object[] rowData = {
                cui.getCodigo(),
                cui.getNombre_producto(),
                cui.getTipo(),
                cui.getUnidadMed(),
                cui.getContenido(),
                cui.getPrecio(),
                cui.getStock(),
                cui.getRucProveedor(),
                cui.getResult()
            };
            tcuid.insertRow(0, rowData);
        }

    }//GEN-LAST:event_btn3AgregarProdCuidIniActionPerformed

    private void btn3EliminarFinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3EliminarFinActionPerformed
        if (tblCuidPer3.getRowCount()==0) {
            JOptionPane.showMessageDialog(rootPane, "Lista Vacia");
        }else{
            tcuid.removeRow(tcuid.getRowCount()-1);
            cuidList.eliminarFin();
        
        }
    }//GEN-LAST:event_btn3EliminarFinActionPerformed

    private void btn3MostrarElementosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3MostrarElementosActionPerformed
        cuidList.mostrar();
    }//GEN-LAST:event_btn3MostrarElementosActionPerformed

    private void txt3CodKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt3CodKeyTyped
        //Método para solo permitir el ingreso de números
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;

        if (!numeros) {
            evt.consume();
        }

        //Permitir un máximo de 6 números
        if (txt3Cod.getText().length() >= 6) {
            evt.consume();
        }
    }//GEN-LAST:event_txt3CodKeyTyped

    private void txt3RUCProKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt3RUCProKeyTyped
        //Método para solo permitir el ingreso de números
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;

        if (!numeros) {
            evt.consume();
        }

        //Permitir un máximo de 11 números
        if (txt3RUCPro.getText().length() >= 11) {
            evt.consume();
        }
    }//GEN-LAST:event_txt3RUCProKeyTyped

    private void txt3contenidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt3contenidoKeyTyped
        //Método para solo permitir el ingreso de números
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;

        if (!numeros) {
            evt.consume();
        }

        //Permitir un máximo de 3 números
        if (txt3contenido.getText().length() >= 3) {
            evt.consume();
        }
    }//GEN-LAST:event_txt3contenidoKeyTyped

    private void btn3AgregarProdCuidMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3AgregarProdCuidMedActionPerformed

        int codigo = Integer.parseInt(txt3Cod.getText());
        Long RUCProv = Long.parseLong(txt3RUCPro.getText());
        double precio = Double.parseDouble(txt3Precio.getText());
        int stock = (int) SpinnerStock3.getValue();
        String cmbtipo = cmb3Tipo.getSelectedItem().toString();
        String nombreproducto = txt3NamePro.getText();
        String UniMed = cmb3UMedida3.getSelectedItem().toString();
        int contenido = Integer.parseInt(txt3contenido.getText());

        //Usamos la calse generica
        Generico1<Double, Integer> generico1 = new Generico1(precio, stock);
        double resultado = generico1.multiplicar();

        int tmdetabla = (tcuid.getRowCount() / 2);

        if (cmb3Tipo.getSelectedIndex() == 0 || cmb3UMedida3.getSelectedIndex() == 0 || stock == 0) {
            JOptionPane.showMessageDialog(rootPane, "Compruebe si los datos estan seleccionados");
        } else {
            ProdCuidadoPersonal cui = new ProdCuidadoPersonal(contenido, UniMed, nombreproducto, codigo, RUCProv, cmbtipo, precio, stock, resultado);
            cuidList.insertarmedio(cui, tmdetabla);
            Object[] rowData = {
                cui.getCodigo(),
                cui.getNombre_producto(),
                cui.getTipo(),
                cui.getUnidadMed(),
                cui.getContenido(),
                cui.getPrecio(),
                cui.getStock(),
                cui.getRucProveedor(),
                cui.getResult()
            };
            tcuid.insertRow(tmdetabla, rowData);
        }
    }//GEN-LAST:event_btn3AgregarProdCuidMedActionPerformed

    //------------------------- Productos Medicos -------------------------------------------------//
    private void txt1CodKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt1CodKeyTyped
        //metodo para solo permitir el ingreso de numeros
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        if (!numeros) {
            evt.consume();
        }

        //permitir un maximo de 8 numeros
        if (txt1Cod.getText().length() >= 6) {
            evt.consume();
        }

    }//GEN-LAST:event_txt1CodKeyTyped

    private void txt1RUCProKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt1RUCProKeyTyped
        //metodo para solo permitir el ingreso de numeros
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        if (!numeros) {
            evt.consume();
        }

        //permitir un maximo de 11 numeros
        if (txt1RUCPro.getText().length() >= 11) {
            evt.consume();
        }
    }//GEN-LAST:event_txt1RUCProKeyTyped

    private void txt1PrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt1PrecioKeyTyped
        //metodo para solo permitir el ingreso de numeros
        char key = evt.getKeyChar();
        boolean numeros = (key >= '0' && key <= '9') || key == '.';
        if (!numeros || (key == '.' && txt1Precio.getText().contains("."))) {
            evt.consume();
        }
    }//GEN-LAST:event_txt1PrecioKeyTyped

    private void txt1contenidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt1contenidoKeyTyped
        char key = evt.getKeyChar();
        boolean numeros = (key >= '0' && key <= '9') || key == '.';
        if (!numeros || (key == '.' && txt1contenido.getText().contains("."))) {
            evt.consume();
        }
    }//GEN-LAST:event_txt1contenidoKeyTyped

    private void txt1CodKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt1CodKeyReleased
        habilitarbotones1();
    }//GEN-LAST:event_txt1CodKeyReleased

    private void txt1RUCProKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt1RUCProKeyReleased
        habilitarbotones1();
    }//GEN-LAST:event_txt1RUCProKeyReleased

    private void txt1NameProKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt1NameProKeyReleased
        habilitarbotones1();
    }//GEN-LAST:event_txt1NameProKeyReleased

    private void txt1PrecioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt1PrecioKeyReleased
        habilitarbotones1();
    }//GEN-LAST:event_txt1PrecioKeyReleased

    private void txt1contenidoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt1contenidoKeyReleased
        habilitarbotones1();
    }//GEN-LAST:event_txt1contenidoKeyReleased

    //------------------------- Productos Comestibles -------------------------------------------------//
    private void txt2CodKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt2CodKeyTyped
        //metodo para solo permitir el ingreso de numeros
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        if (!numeros) {
            evt.consume();
        }

        //permitir un maximo de 6 numeros
        if (txt2Cod.getText().length() >= 6) {
            evt.consume();
        }
    }//GEN-LAST:event_txt2CodKeyTyped

    private void txt2RUCProKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt2RUCProKeyTyped
        //metodo para solo permitir el ingreso de numeros
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        if (!numeros) {
            evt.consume();
        }

        //permitir un maximo de 11 numeros
        if (txt2RUCPro.getText().length() >= 11) {
            evt.consume();
        }
    }//GEN-LAST:event_txt2RUCProKeyTyped

    private void txt2PrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt2PrecioKeyTyped
        //metodo para solo permitir el ingreso de numeros
        char key = evt.getKeyChar();
        boolean numeros = (key >= '0' && key <= '9') || key == '.';
        if (!numeros || (key == '.' && txt2Precio.getText().contains("."))) {
            evt.consume();
        }
    }//GEN-LAST:event_txt2PrecioKeyTyped

    private void txt2CodKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt2CodKeyReleased
        habilitarbotonoes2();
    }//GEN-LAST:event_txt2CodKeyReleased

    private void txt2RUCProKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt2RUCProKeyReleased
        habilitarbotonoes2();
    }//GEN-LAST:event_txt2RUCProKeyReleased

    private void txt2NameProKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt2NameProKeyReleased
        habilitarbotonoes2();
    }//GEN-LAST:event_txt2NameProKeyReleased

    private void txt2PrecioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt2PrecioKeyReleased
        habilitarbotonoes2();
    }//GEN-LAST:event_txt2PrecioKeyReleased

    private void txt2CaducidadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt2CaducidadKeyReleased
        habilitarbotonoes2();
    }//GEN-LAST:event_txt2CaducidadKeyReleased

    //------------------------- Productos Cuidado P. -------------------------------------------------//
    private void txt3PrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt3PrecioKeyTyped
        //metodo para solo permitir el ingreso de numeros
        char key = evt.getKeyChar();
        boolean numeros = (key >= '0' && key <= '9') || key == '.';
        if (!numeros || (key == '.' && txt3Precio.getText().contains("."))) {
            evt.consume();
        }
    }//GEN-LAST:event_txt3PrecioKeyTyped

    private void txt3CodKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt3CodKeyReleased
        habilitarBotones3();
    }//GEN-LAST:event_txt3CodKeyReleased

    private void txt3RUCProKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt3RUCProKeyReleased
        habilitarBotones3();
    }//GEN-LAST:event_txt3RUCProKeyReleased

    private void txt3PrecioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt3PrecioKeyReleased
        char key = evt.getKeyChar();
        boolean numeros = (key >= '0' && key <= '9') || key == '.';
        if (!numeros || (key == '.' && txt3Precio.getText().contains("."))) {
            evt.consume();
        }
    }//GEN-LAST:event_txt3PrecioKeyReleased

    private void btn1VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1VolverActionPerformed
        FramePrincipal reg = new FramePrincipal();
        reg.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn1VolverActionPerformed

    private void btnVolver2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolver2ActionPerformed
        FramePrincipal reg = new FramePrincipal();
        reg.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnVolver2ActionPerformed

    private void btnVolver3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolver3ActionPerformed
        FramePrincipal reg = new FramePrincipal();
        reg.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnVolver3ActionPerformed

    public static boolean validarLetras(String datos) {
        return datos.matches("[a-zA-Z ]*");
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroProductos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner SpinnerStock1;
    private javax.swing.JSpinner SpinnerStock2;
    private javax.swing.JSpinner SpinnerStock3;
    private javax.swing.JButton btn1AgregarProdMed;
    private javax.swing.JButton btn1EliminarProdMed;
    private javax.swing.JButton btn1LimpiarProdMed;
    private javax.swing.JButton btn1OrdenarMergeNom;
    private javax.swing.JButton btn1OrdenarQuickMedCod;
    private javax.swing.JButton btn1Volver;
    private javax.swing.JButton btn2AgregarComes;
    private javax.swing.JButton btn2EliminarComes;
    private javax.swing.JButton btn2LimpiarComes;
    private javax.swing.JButton btn2OrdenarQuickComesCod;
    private javax.swing.JButton btn2OrdenarQuickComesNom;
    private javax.swing.JButton btn3AgregarProdCuidFin;
    private javax.swing.JButton btn3AgregarProdCuidIni;
    private javax.swing.JButton btn3AgregarProdCuidMed;
    private javax.swing.JButton btn3EliminarCuidIni;
    private javax.swing.JButton btn3EliminarFin;
    private javax.swing.JButton btn3LimpiarCuidPer;
    private javax.swing.JButton btn3MostrarElementos;
    private javax.swing.JButton btnVolver2;
    private javax.swing.JButton btnVolver3;
    private javax.swing.JComboBox<String> cmb1Tipo;
    private javax.swing.JComboBox<String> cmb1UMedida;
    private javax.swing.JComboBox<String> cmb2Tipocomes;
    private javax.swing.JComboBox<String> cmb3Tipo;
    private javax.swing.JComboBox<String> cmb3UMedida3;
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
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tblCuidPer3;
    private javax.swing.JTable tblProdComida;
    private javax.swing.JTable tblProdMedicos;
    private javax.swing.JTextField txt1Cod;
    private javax.swing.JTextField txt1NamePro;
    private javax.swing.JTextField txt1Precio;
    private javax.swing.JTextField txt1RUCPro;
    private javax.swing.JTextField txt1contenido;
    private javax.swing.JTextField txt2Caducidad;
    private javax.swing.JTextField txt2Cod;
    private javax.swing.JTextField txt2NamePro;
    private javax.swing.JTextField txt2Precio;
    private javax.swing.JTextField txt2RUCPro;
    private javax.swing.JTextField txt3Cod;
    private javax.swing.JTextField txt3NamePro;
    private javax.swing.JTextField txt3Precio;
    private javax.swing.JTextField txt3RUCPro;
    private javax.swing.JTextField txt3contenido;
    // End of variables declaration//GEN-END:variables
}
