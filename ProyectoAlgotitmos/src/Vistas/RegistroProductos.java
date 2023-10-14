package Vistas;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import misArrays.AProdMedicos;
import misArrays.AProdComestible;
import misArrays.AProdCuidadoPersonal;
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
    AProdMedicos medicoArray= new AProdMedicos();
    
    DefaultTableModel tcomes= new DefaultTableModel();
    AProdComestible comesArray= new AProdComestible();
    
    DefaultTableModel tcuid= new DefaultTableModel();
    AProdCuidadoPersonal cuidArray= new AProdCuidadoPersonal();
    
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
        
        tcuid.addColumn("Código");
        tcuid.addColumn("Nombre");
        tcuid.addColumn("Tipo");
        tcuid.addColumn("unidad de medida");
        tcuid.addColumn("Contenido");
        tcuid.addColumn("Precio");
        tcuid.addColumn("Stock");
        tcuid.addColumn("Dirigido para:");
        tcuid.addColumn("RUC. Proveedor");
        tcuid.addColumn("COSTO TOTAL");
        tblCuidPer3.setModel(tcuid);
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
        btnAgregarProdMed = new javax.swing.JButton();
        btnLimpiarProdMed1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblProdMedicos = new javax.swing.JTable();
        btnEliminarProdMed1 = new javax.swing.JButton();
        OrdenarQuickMedNom = new javax.swing.JButton();
        SpinnerStock1 = new javax.swing.JSpinner();
        jLabel19 = new javax.swing.JLabel();
        txt1contenido = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        cmb1UMedida = new javax.swing.JComboBox<>();
        OrdenarQuickMedCod = new javax.swing.JButton();
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
        btnAgregarComes = new javax.swing.JButton();
        btnLimpiarAdmin = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProdComida = new javax.swing.JTable();
        btnEliminarAdmin = new javax.swing.JButton();
        OrdenarQuickComesNom = new javax.swing.JButton();
        SpinnerStock2 = new javax.swing.JSpinner();
        jLabel13 = new javax.swing.JLabel();
        txt2Caducidad = new javax.swing.JTextField();
        OrdenarQuickComesCod = new javax.swing.JButton();
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
        btnAgregarProdCuid = new javax.swing.JButton();
        btnLimpiarAdmin2 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblCuidPer3 = new javax.swing.JTable();
        btnEliminarCuid3 = new javax.swing.JButton();
        OrdenarQuickCuidCod = new javax.swing.JButton();
        SpinnerStock3 = new javax.swing.JSpinner();
        jLabel25 = new javax.swing.JLabel();
        txt3contenido = new javax.swing.JTextField();
        OrdenarQuickCuidNom = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        cmb3UMedida3 = new javax.swing.JComboBox<>();

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
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Codigo:");

        jLabel14.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("RUC Prov:");

        jLabel15.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Nombre Prod:");

        jLabel16.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Tipo:");

        jLabel17.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Precio:");

        jLabel18.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("Cont:");

        cmb1Tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccionar--", "Comprimidos", "Capsulas", "Liquidos", "Cremas", "Parches" }));

        btnAgregarProdMed.setBackground(new java.awt.Color(255, 102, 102));
        btnAgregarProdMed.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnAgregarProdMed.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarProdMed.setText("Agregar");
        btnAgregarProdMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarProdMedActionPerformed(evt);
            }
        });

        btnLimpiarProdMed1.setBackground(new java.awt.Color(102, 102, 102));
        btnLimpiarProdMed1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnLimpiarProdMed1.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiarProdMed1.setText("Limpiar");
        btnLimpiarProdMed1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarProdMed1ActionPerformed(evt);
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

        btnEliminarProdMed1.setBackground(new java.awt.Color(102, 102, 102));
        btnEliminarProdMed1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnEliminarProdMed1.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarProdMed1.setText("Eliminar");
        btnEliminarProdMed1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarProdMed1ActionPerformed(evt);
            }
        });

        OrdenarQuickMedNom.setBackground(new java.awt.Color(255, 102, 102));
        OrdenarQuickMedNom.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        OrdenarQuickMedNom.setForeground(new java.awt.Color(255, 255, 255));
        OrdenarQuickMedNom.setText("Ordenar Nom.");
        OrdenarQuickMedNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrdenarQuickMedNomActionPerformed(evt);
            }
        });

        SpinnerStock1.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        jLabel19.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("Stock:");

        jLabel26.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 0, 0));
        jLabel26.setText("U.Med:");

        cmb1UMedida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selc.", "L", "ml", "Kg", "g", " " }));

        OrdenarQuickMedCod.setBackground(new java.awt.Color(255, 102, 102));
        OrdenarQuickMedCod.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        OrdenarQuickMedCod.setForeground(new java.awt.Color(255, 255, 255));
        OrdenarQuickMedCod.setText("Ordenar Cod.");
        OrdenarQuickMedCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrdenarQuickMedCodActionPerformed(evt);
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
                        .addComponent(btnEliminarProdMed1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(OrdenarQuickMedCod)
                        .addGap(36, 36, 36)
                        .addComponent(OrdenarQuickMedNom))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(btnLimpiarProdMed1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAgregarProdMed, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel18)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txt1contenido, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addComponent(jLabel19)
                                        .addGap(18, 18, 18)
                                        .addComponent(SpinnerStock1, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)))))))
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
                    .addComponent(btnAgregarProdMed)
                    .addComponent(btnLimpiarProdMed1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEliminarProdMed1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(OrdenarQuickMedNom)
                        .addComponent(OrdenarQuickMedCod)))
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
            .addGap(0, 807, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
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
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Codigo:");

        jLabel8.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("RUC Prov:");

        jLabel9.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Nombre Prod:");

        jLabel10.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Tipo:");

        jLabel11.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Precio:");

        jLabel12.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Cad:");

        cmb2Tipocomes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccionar--", "Fruta/Verdura", "Embutidos", "Otros", "Bebida", "Proteina" }));

        btnAgregarComes.setBackground(new java.awt.Color(255, 102, 102));
        btnAgregarComes.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnAgregarComes.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarComes.setText("Agregar");
        btnAgregarComes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarComesActionPerformed(evt);
            }
        });

        btnLimpiarAdmin.setBackground(new java.awt.Color(102, 102, 102));
        btnLimpiarAdmin.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnLimpiarAdmin.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiarAdmin.setText("Limpiar");
        btnLimpiarAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarAdminActionPerformed(evt);
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

        btnEliminarAdmin.setBackground(new java.awt.Color(102, 102, 102));
        btnEliminarAdmin.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnEliminarAdmin.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarAdmin.setText("Eliminar");
        btnEliminarAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarAdminActionPerformed(evt);
            }
        });

        OrdenarQuickComesNom.setBackground(new java.awt.Color(255, 102, 102));
        OrdenarQuickComesNom.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        OrdenarQuickComesNom.setForeground(new java.awt.Color(255, 255, 255));
        OrdenarQuickComesNom.setText("Ordenar Nom.");
        OrdenarQuickComesNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrdenarQuickComesNomActionPerformed(evt);
            }
        });

        SpinnerStock2.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        jLabel13.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Stock:");

        OrdenarQuickComesCod.setBackground(new java.awt.Color(255, 102, 102));
        OrdenarQuickComesCod.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        OrdenarQuickComesCod.setForeground(new java.awt.Color(255, 255, 255));
        OrdenarQuickComesCod.setText("Ordenar Cod.");
        OrdenarQuickComesCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrdenarQuickComesCodActionPerformed(evt);
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
                        .addComponent(btnEliminarAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(OrdenarQuickComesCod)
                        .addGap(18, 18, 18)
                        .addComponent(OrdenarQuickComesNom))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 755, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(btnLimpiarAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAgregarComes, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(btnAgregarComes)
                    .addComponent(btnLimpiarAdmin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminarAdmin)
                    .addComponent(OrdenarQuickComesNom)
                    .addComponent(OrdenarQuickComesCod))
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
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Codigo:");

        jLabel20.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("RUC Prov:");

        jLabel21.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("Nombre Prod:");

        jLabel22.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setText("Tipo:");

        jLabel23.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 0, 0));
        jLabel23.setText("Precio:");

        jLabel24.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 0, 0));
        jLabel24.setText("Cont:");

        cmb3Tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccionar--", "tfc" }));

        btnAgregarProdCuid.setBackground(new java.awt.Color(255, 102, 102));
        btnAgregarProdCuid.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnAgregarProdCuid.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarProdCuid.setText("Agregar");
        btnAgregarProdCuid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarProdCuidActionPerformed(evt);
            }
        });

        btnLimpiarAdmin2.setBackground(new java.awt.Color(102, 102, 102));
        btnLimpiarAdmin2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnLimpiarAdmin2.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiarAdmin2.setText("Limpiar");
        btnLimpiarAdmin2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarAdmin2ActionPerformed(evt);
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

        btnEliminarCuid3.setBackground(new java.awt.Color(102, 102, 102));
        btnEliminarCuid3.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnEliminarCuid3.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarCuid3.setText("Eliminar");
        btnEliminarCuid3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarCuid3ActionPerformed(evt);
            }
        });

        OrdenarQuickCuidCod.setBackground(new java.awt.Color(255, 102, 102));
        OrdenarQuickCuidCod.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        OrdenarQuickCuidCod.setForeground(new java.awt.Color(255, 255, 255));
        OrdenarQuickCuidCod.setText("Ordenar Cod.");
        OrdenarQuickCuidCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrdenarQuickCuidCodActionPerformed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 0, 0));
        jLabel25.setText("Stock:");

        OrdenarQuickCuidNom.setBackground(new java.awt.Color(255, 102, 102));
        OrdenarQuickCuidNom.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        OrdenarQuickCuidNom.setForeground(new java.awt.Color(255, 255, 255));
        OrdenarQuickCuidNom.setText("Ordenar Nom.");
        OrdenarQuickCuidNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrdenarQuickCuidNomActionPerformed(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 0, 0));
        jLabel27.setText("U.Med:");

        cmb3UMedida3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selc.", "Unidad", "Docena", "SixPack", "L", "ml", "Kg", "g", " " }));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(btnEliminarCuid3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(OrdenarQuickCuidNom)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(OrdenarQuickCuidCod))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addComponent(btnLimpiarAdmin2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAgregarProdCuid, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel22)
                                    .addComponent(jLabel23))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel10Layout.createSequentialGroup()
                                        .addComponent(txt3Precio)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel25)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(SpinnerStock3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(cmb3Tipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel27)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmb3UMedida3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel24)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt3contenido)))))
                .addGap(33, 33, 33))
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
                    .addComponent(btnAgregarProdCuid)
                    .addComponent(btnLimpiarAdmin2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminarCuid3)
                    .addComponent(OrdenarQuickCuidCod)
                    .addComponent(OrdenarQuickCuidNom))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 807, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 571, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
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

    private void btnAgregarProdMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarProdMedActionPerformed
        int codigo = 0;
        Long RUCProv = 0L;
        double precio = 0;
        int stock = 0;
        double contenido = 0;
        
        boolean valdat=true;
        if (valdatosmed(valdat)==false) {
            JOptionPane.showMessageDialog(rootPane, "Complete todos los campos");
        }else{
            String cmbtipo=cmb1Tipo.getSelectedItem().toString();
            String nombreproducto=txt1NamePro.getText();
            String UniMed=cmb1UMedida.getSelectedItem().toString();
            //Condicional para validar letras de nombre producto
            if (!validarLetras(txt1NamePro.getText())) {
                JOptionPane.showMessageDialog(rootPane, "Error al ingresar Nombre producto");
                valdat=false;
            }
            
            //Controla Si el usuario digita 6 digitos 
            try{
                codigo=Integer.parseInt(txt1Cod.getText());
                if (String.valueOf(codigo).length()!=6) {
                    JOptionPane.showMessageDialog(rootPane, "El codigo debe tener 6 digitos");
                    valdat=false;
                }
                //Asegura que el valor ingresado en cod sea un numero
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(rootPane, "Solo se permiten numeros para el código");
                valdat=false;
            }
            
            //Asegura que el codigo de RucProv tenga 11 digitos
            try {
                RUCProv=Long.parseLong(txt1RUCPro.getText());
                if (String.valueOf(RUCProv).length()!=11) {
                    JOptionPane.showMessageDialog(rootPane, "El RUC del Proveedor debe tener 11 digitos");
                    valdat=false;
                }
            } catch (NumberFormatException e) {
                //Asegura que el RUCProv solo contenga numeros
                JOptionPane.showMessageDialog(rootPane, "Ingrese un numero valido para el codigo de proveedor");
                valdat=false;
            }
            
            //No es necesario limitar cantidad de digitos
            try {
                precio=Double.parseDouble(txt1Precio.getText());
              //Asegura que el precio contenga solo valores numericos  
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(rootPane, "Ingrese solo datos numericos");
                valdat=false;
            }
            
            //No es necesario limitar cantidad de digitos
            try {
                stock=(int) SpinnerStock1.getValue();
              //Asegura que el precio contenga solo valores numericos  
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(rootPane, "Ingrese solo datos numericos");
                valdat=false;
            }
            
            //No es necesario limirar cantidad de digitos
            try {
                contenido=Double.parseDouble(txt1contenido.getText());
              //Asegura que los datos sean solo numericos  
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(rootPane, "Ingrese solo datos numericos");
            }
            
            //Usamos la calse generica
            Generico1<Double, Integer> generico1 = new Generico1(precio,stock);
            double resultado=generico1.multiplicar();
            
            if (valdat) {
                tmedico.setRowCount(0);
                ProdMedicos md= new ProdMedicos(contenido, UniMed, nombreproducto, codigo, RUCProv, cmbtipo, precio, stock, resultado);
                medicoArray.agregarProductoH(md);
                for (int o = 0; o < medicoArray.tamañoArreglo(); o++) {
                    Object[] fila={
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
                }tblProdMedicos.setModel(tmedico);
            }
        }
    }//GEN-LAST:event_btnAgregarProdMedActionPerformed
    
    private void btnEliminarProdMed1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProdMed1ActionPerformed
        int filaSeleccionada= tblProdMedicos.getSelectedRow();
        
        if (filaSeleccionada>=0) {
            tmedico.removeRow(filaSeleccionada);
            medicoArray.eliminarProductoH(filaSeleccionada);
        }else{
            JOptionPane.showMessageDialog(rootPane, "Selecciona una fila para eliminar.");
        }
        
    }//GEN-LAST:event_btnEliminarProdMed1ActionPerformed

    private void OrdenarQuickMedNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrdenarQuickMedNomActionPerformed
        tmedico.setRowCount(0);
        medicoArray.mergeSortNom();
        for (int o = 0; o < medicoArray.tamañoArreglo(); o++) {
                    Object[] fila={
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
                }tblProdMedicos.setModel(tmedico);
    }//GEN-LAST:event_OrdenarQuickMedNomActionPerformed

    private void OrdenarQuickMedCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrdenarQuickMedCodActionPerformed
        
        tmedico.setRowCount(0);
        medicoArray.mergeSortCod();
        for (int o = 0; o < medicoArray.tamañoArreglo(); o++) {
                    Object[] fila={
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
                }tblProdMedicos.setModel(tmedico);
    }//GEN-LAST:event_OrdenarQuickMedCodActionPerformed

    private void btnAgregarComesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarComesActionPerformed
        int codigo = 0;
        Long RUCProv = 0L;
        double precio = 0;
        int stock = 0;
        int caducidad = 0;
        
        boolean valdat=true;
        if (valdatosCome(valdat)==false) {
            JOptionPane.showMessageDialog(rootPane, "Complete todos los campos");
        }else{
            String cmbtipo=cmb2Tipocomes.getSelectedItem().toString();
            String nombreproducto=txt2NamePro.getText();
            //Condicional para validar letras de nombre producto
            if (!validarLetras(txt2NamePro.getText())) {
                JOptionPane.showMessageDialog(rootPane, "Error al ingresar Nombre producto");
                valdat=false;
            }
            
            //Controla Si el usuario digita 6 digitos 
            try{
                codigo=Integer.parseInt(txt2Cod.getText());
                if (String.valueOf(codigo).length()!=6) {
                    JOptionPane.showMessageDialog(rootPane, "El codigo debe tener 6 digitos");
                    valdat=false;
                }
                //Asegura que el valor ingresado en cod sea un numero
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(rootPane, "Solo se permiten numeros para el código");
                valdat=false;
            }
            
            //Asegura que el codigo de RucProv tenga 11 digitos
            try {
                RUCProv=Long.parseLong(txt2RUCPro.getText());
                if (String.valueOf(RUCProv).length()!=11) {
                    JOptionPane.showMessageDialog(rootPane, "El RUC del Proveedor debe tener 11 digitos");
                    valdat=false;
                }
            } catch (NumberFormatException e) {
                //Asegura que el RUCProv solo contenga numeros
                JOptionPane.showMessageDialog(rootPane, "Ingrese un numero valido para el codigo de proveedor");
                valdat=false;
            }
            
            //No es necesario limitar cantidad de digitos
            try {
                precio=Double.parseDouble(txt2Precio.getText());
              //Asegura que el precio contenga solo valores numericos  
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(rootPane, "Ingrese solo datos numericos");
                valdat=false;
            }
            
            //No es necesario limitar cantidad de digitos
            try {
                stock=(int) SpinnerStock2.getValue();
              //Asegura que el precio contenga solo valores numericos  
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(rootPane, "Ingrese solo datos numericos");
                valdat=false;
            }
            
            //No es necesario limirar cantidad de digitos
            try {
                caducidad=Integer.parseInt(txt2Caducidad.getText());
              //Asegura que los datos sean solo numericos  
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(rootPane, "Ingrese solo datos numericos");
            }
            
            //Usamos la calse generica
            Generico1<Double, Integer> generico1 = new Generico1(precio,stock);
            double resultado=generico1.multiplicar();
            
            if (valdat) {
                tcomes.setRowCount(0);
                ProdComestibles comes = new ProdComestibles(caducidad, nombreproducto, codigo, RUCProv, cmbtipo, precio, stock, resultado);
                comesArray.agregarProductoC(comes);
                for (int o = 0; o < comesArray.tamañoArreglo(); o++) {
                    Object[] fila={
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
                }tblProdComida.setModel(tcomes);
            }
        }
        
        
        
    }//GEN-LAST:event_btnAgregarComesActionPerformed

    private void OrdenarQuickComesNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrdenarQuickComesNomActionPerformed
        
        tcomes.setRowCount(0);
        comesArray.mergeSortNom();
        for (int o = 0; o < comesArray.tamañoArreglo(); o++) {
            Object[] fila={
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
        }tblProdComida.setModel(tcomes);
        
    }//GEN-LAST:event_OrdenarQuickComesNomActionPerformed

    private void OrdenarQuickComesCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrdenarQuickComesCodActionPerformed
        
        tcomes.setRowCount(0);
        comesArray.mergeSortCod();
        for (int o = 0; o < comesArray.tamañoArreglo(); o++) {
            Object[] fila={
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
        }tblProdComida.setModel(tcomes);
        
    }//GEN-LAST:event_OrdenarQuickComesCodActionPerformed

    private void btnEliminarAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarAdminActionPerformed
        
        int filaseleccionada= tblProdComida.getSelectedRow();
        if (filaseleccionada>=0) {
            tcomes.removeRow(filaseleccionada);
            comesArray.eliminarProductoC(filaseleccionada);
        }else{
            JOptionPane.showMessageDialog(rootPane, "Seleccionar una fila para eliminar");
        }
        
    }//GEN-LAST:event_btnEliminarAdminActionPerformed

    private void btnAgregarProdCuidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarProdCuidActionPerformed
        
        int codigo = 0;
        Long RUCProv = 0L;
        double precio = 0;
        int stock = 0;
        double contenido = 0;
        
        boolean valdat=true;
        if (valdatoscuid(valdat)==false) {
            JOptionPane.showMessageDialog(rootPane, "Complete todos los campos");
        }else{
            String cmbtipo=cmb3Tipo.getSelectedItem().toString();
            String nombreproducto=txt3NamePro.getText();
            String UniMed=cmb3UMedida3.getSelectedItem().toString();
            //Condicional para validar letras de nombre producto
            if (!validarLetras(txt3NamePro.getText())) {
                JOptionPane.showMessageDialog(rootPane, "Error al ingresar Nombre producto");
                valdat=false;
            }
            
            //Controla Si el usuario digita 6 digitos 
            try{
                codigo=Integer.parseInt(txt3Cod.getText());
                if (String.valueOf(codigo).length()!=6) {
                    JOptionPane.showMessageDialog(rootPane, "El codigo debe tener 6 digitos");
                    valdat=false;
                }
                //Asegura que el valor ingresado en cod sea un numero
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(rootPane, "Solo se permiten numeros para el código");
                valdat=false;
            }
            
            //Asegura que el codigo de RucProv tenga 11 digitos
            try {
                RUCProv=Long.parseLong(txt3RUCPro.getText());
                if (String.valueOf(RUCProv).length()!=11) {
                    JOptionPane.showMessageDialog(rootPane, "El RUC del Proveedor debe tener 11 digitos");
                    valdat=false;
                }
            } catch (NumberFormatException e) {
                //Asegura que el RUCProv solo contenga numeros
                JOptionPane.showMessageDialog(rootPane, "Ingrese un numero valido para el codigo de proveedor");
                valdat=false;
            }
            
            //No es necesario limitar cantidad de digitos
            try {
                precio=Double.parseDouble(txt3Precio.getText());
              //Asegura que el precio contenga solo valores numericos  
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(rootPane, "Ingrese solo datos numericos");
                valdat=false;
            }
            
            //No es necesario limitar cantidad de digitos
            try {
                stock=(int) SpinnerStock3.getValue();
              //Asegura que el precio contenga solo valores numericos  
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(rootPane, "Ingrese solo datos numericos");
                valdat=false;
            }
            
            //No es necesario limirar cantidad de digitos
            try {
                contenido=Double.parseDouble(txt3contenido.getText());
              //Asegura que los datos sean solo numericos  
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(rootPane, "Ingrese solo datos numericos");
            }
            
            //Usamos la calse generica
            Generico1<Double, Integer> generico1 = new Generico1(precio,stock);
            double resultado=generico1.multiplicar();
            
            if (valdat) {
                tcuid.setRowCount(0);
                ProdCuidadoPersonal cui= new ProdCuidadoPersonal(contenido, UniMed, nombreproducto, codigo, RUCProv, cmbtipo, precio, stock, resultado);
                cuidArray.agregarProductoM(cui);
                for (int o = 0; o < cuidArray.tamañoArreglo(); o++) {
                    Object[] fila={
                      cuidArray.obtener(o).getCodigo(),
                      cuidArray.obtener(o).getNombre_producto(),
                      cuidArray.obtener(o).getTipo(),
                      cuidArray.obtener(o).getUnidadMed(),
                      cuidArray.obtener(o).getContenido(),
                      cuidArray.obtener(o).getPrecio(),
                      cuidArray.obtener(o).getStock(),
                      cuidArray.obtener(o).getRucProveedor(),
                      cuidArray.obtener(o).getResult()                   
                    };
                    tcuid.addRow(fila);
                }tblCuidPer3.setModel(tcuid);
            }
        }
    }//GEN-LAST:event_btnAgregarProdCuidActionPerformed

    private void OrdenarQuickCuidCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrdenarQuickCuidCodActionPerformed
        
        tcuid.setRowCount(0);
        cuidArray.mergeSortCod();
        for (int o = 0; o < cuidArray.tamañoArreglo(); o++) {
                    Object[] fila={
                      cuidArray.obtener(o).getCodigo(),
                      cuidArray.obtener(o).getNombre_producto(),
                      cuidArray.obtener(o).getTipo(),
                      cuidArray.obtener(o).getUnidadMed(),
                      cuidArray.obtener(o).getContenido(),
                      cuidArray.obtener(o).getPrecio(),
                      cuidArray.obtener(o).getStock(),
                      cuidArray.obtener(o).getRucProveedor(),
                      cuidArray.obtener(o).getResult()                   
                    };
                    tcuid.addRow(fila);
                }tblCuidPer3.setModel(tcuid);
        
    }//GEN-LAST:event_OrdenarQuickCuidCodActionPerformed

    private void OrdenarQuickCuidNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrdenarQuickCuidNomActionPerformed
        
        tcuid.setRowCount(0);
        cuidArray.mergeSortCod();
        for (int o = 0; o < cuidArray.tamañoArreglo(); o++) {
                    Object[] fila={
                      cuidArray.obtener(o).getCodigo(),
                      cuidArray.obtener(o).getNombre_producto(),
                      cuidArray.obtener(o).getTipo(),
                      cuidArray.obtener(o).getUnidadMed(),
                      cuidArray.obtener(o).getContenido(),
                      cuidArray.obtener(o).getPrecio(),
                      cuidArray.obtener(o).getStock(),
                      cuidArray.obtener(o).getRucProveedor(),
                      cuidArray.obtener(o).getResult()                   
                    };
                    tcuid.addRow(fila);
                }tblCuidPer3.setModel(tcuid);
    }//GEN-LAST:event_OrdenarQuickCuidNomActionPerformed

    private void btnEliminarCuid3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarCuid3ActionPerformed
        
        int filaseleccionada=tblCuidPer3.getSelectedRow();
        if (filaseleccionada>=0) {
            tcuid.removeRow(filaseleccionada);
            cuidArray.eliminarProductoM(filaseleccionada);
        }else{
            JOptionPane.showMessageDialog(rootPane, "Selecciona una fila para eliminar ");
        }
    }//GEN-LAST:event_btnEliminarCuid3ActionPerformed

    private void btnLimpiarProdMed1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarProdMed1ActionPerformed
        txt1Cod.setText("");
        txt1RUCPro.setText("");
        txt1NamePro.setText("");
        cmb1Tipo.setSelectedIndex(0);
        txt1Precio.setText("");
        SpinnerStock1.setValue(0);
        cmb1UMedida.setSelectedIndex(0);
        txt1contenido.setText("");
    }//GEN-LAST:event_btnLimpiarProdMed1ActionPerformed

    private void btnLimpiarAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarAdminActionPerformed
        txt2Cod.setText("");
        txt2RUCPro.setText("");
        txt2NamePro.setText("");
        cmb2Tipocomes.setSelectedIndex(0);
        txt2Precio.setText("");
        SpinnerStock2.setValue(0);
        txt2Caducidad.setText("");
    }//GEN-LAST:event_btnLimpiarAdminActionPerformed

    private void btnLimpiarAdmin2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarAdmin2ActionPerformed
        txt3Cod.setText("");
        txt3RUCPro.setText("");
        txt3NamePro.setText("");
        cmb3Tipo.setSelectedIndex(0);
        txt3Precio.setText("");
        SpinnerStock3.setValue(0);
        cmb3UMedida3.setSelectedIndex(0);
        txt3contenido.setText("");
    }//GEN-LAST:event_btnLimpiarAdmin2ActionPerformed
    
    public boolean valdatosmed(boolean valdat){
        
        int nroSpin=(int) SpinnerStock1.getValue();
        if(cmb1Tipo.getSelectedIndex()==0||txt1Cod.getText().trim().isEmpty()||txt1RUCPro.getText().trim().isEmpty()||txt1NamePro.getText().trim().isEmpty()||
                txt1contenido.getText().trim().isEmpty()||txt1Precio.getText().trim().isEmpty()||nroSpin==0||cmb1UMedida.getSelectedIndex()==0){
            valdat=false;
        }
        return valdat;
    }
    
    public boolean valdatosCome(boolean valdat){
        int nroSpin=(int) SpinnerStock2.getValue();
        if (cmb2Tipocomes.getSelectedIndex()==0|| txt2Cod.getText().trim().isEmpty()|| txt2RUCPro.getText().trim().isEmpty()||txt2NamePro.getText().trim().isEmpty()||
                txt2Caducidad.getText().trim().isEmpty()||txt2Precio.getText().trim().isEmpty()|| nroSpin==0) {
            valdat=false;
        }
        return valdat;
    }
    
    public boolean valdatoscuid(boolean valdat){
        
        int nroSpin=(int) SpinnerStock3.getValue();
        if(cmb3Tipo.getSelectedIndex()==0||txt3Cod.getText().trim().isEmpty()||txt3RUCPro.getText().trim().isEmpty()||txt3NamePro.getText().trim().isEmpty()||
                txt3contenido.getText().trim().isEmpty()||txt3Precio.getText().trim().isEmpty()||nroSpin==0||cmb3UMedida3.getSelectedIndex()==0){
            valdat=false;
        }
        return valdat;
    }
     
    public static boolean validarLetras(String datos){
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
    private javax.swing.JButton OrdenarQuickComesCod;
    private javax.swing.JButton OrdenarQuickComesNom;
    private javax.swing.JButton OrdenarQuickCuidCod;
    private javax.swing.JButton OrdenarQuickCuidNom;
    private javax.swing.JButton OrdenarQuickMedCod;
    private javax.swing.JButton OrdenarQuickMedNom;
    private javax.swing.JSpinner SpinnerStock1;
    private javax.swing.JSpinner SpinnerStock2;
    private javax.swing.JSpinner SpinnerStock3;
    private javax.swing.JButton btnAgregarComes;
    private javax.swing.JButton btnAgregarProdCuid;
    private javax.swing.JButton btnAgregarProdMed;
    private javax.swing.JButton btnEliminarAdmin;
    private javax.swing.JButton btnEliminarCuid3;
    private javax.swing.JButton btnEliminarProdMed1;
    private javax.swing.JButton btnLimpiarAdmin;
    private javax.swing.JButton btnLimpiarAdmin2;
    private javax.swing.JButton btnLimpiarProdMed1;
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
