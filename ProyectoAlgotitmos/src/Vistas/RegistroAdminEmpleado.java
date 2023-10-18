
package Vistas;

import ArrayLists.AEmpleAdmin;
import LinkedLists.AdminList;
import javax.swing.table.DefaultTableModel;
import modelo.Admin;
public class RegistroAdminEmpleado extends javax.swing.JFrame {
private final AdminList nuevoAdmin;
    DefaultTableModel model;


    public RegistroAdminEmpleado() {
        initComponents();
        nuevoAdmin = new AdminList();
        model = new DefaultTableModel();
        setLocationRelativeTo(this);
        model.addColumn("Nombre");
        model.addColumn("Apellido");
        model.addColumn("DNI");
        model.addColumn("Afiliación");
        model.addColumn("Año de ingreso");
        model.addColumn("Sueldo");
        model.addColumn("Sueldo Bruto");
        tblAdmin.setModel(model);

    }
    
    // --------------------------------------------------------------------------------------------Métodos -----------------------------------------------------------------------------------------------------------------------------
    
    //Método para limpiar los campos de la pestaña Administradores (reutilizar y cambiar nombres para los demás frames)
    public void limpiarCamposAdmin() {
        txtApellidosAdmin.setText(null);
        txtAñoAdmin.setText(null);
        txtDNIAdmin.setText(null);
        txtNombreAdmin.setText(null);
        cmbAfilAdmin.setSelectedIndex(0);
        cmbSueldoAdmin.setSelectedIndex(0);
    }

    public static boolean validarLetras(String datos){
        return datos.matches("[a-zA-Z ]+");
    }
    
     //Método que devuelve el click del mouse al textfield NombreAdmin (reutilizar y cambiar nombre para los demás frames)
    public void clickOnTextfield() {
        txtNombreAdmin.requestFocusInWindow();
    }
    
  

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtNombreAdmin = new javax.swing.JTextField();
        txtApellidosAdmin = new javax.swing.JTextField();
        txtDNIAdmin = new javax.swing.JTextField();
        cmbAfilAdmin = new javax.swing.JComboBox<>();
        cmbSueldoAdmin = new javax.swing.JComboBox<>();
        txtAñoAdmin = new javax.swing.JTextField();
        btnAgregarAlFinalAdmin = new javax.swing.JButton();
        btnLimpiarAdmin = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAdmin = new javax.swing.JTable();
        btnEliminarInicioAdmin = new javax.swing.JButton();
        btnAgregarAlInicioAdmin = new javax.swing.JButton();
        btnMostrarElementos = new javax.swing.JButton();
        btnEliminarFinalAdmin = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtNombreEmpleado = new javax.swing.JTextField();
        txtApellidosEmpleado = new javax.swing.JTextField();
        txtDNI1 = new javax.swing.JTextField();
        cmbTipoEmpleado = new javax.swing.JComboBox<>();
        btnAgregarEmpleado = new javax.swing.JButton();
        btnLimpEmpleado = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblEmpleado = new javax.swing.JTable();
        btnEliminarEmpleado = new javax.swing.JButton();
        OrdenarQuickEmpleado = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(238, 238, 238));

        jPanel5.setBackground(new java.awt.Color(255, 102, 102));

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Registro de Administradores");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(234, 234, 234)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(200, 200, 200))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel3)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nombre:");

        jLabel8.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Apellido:");

        jLabel9.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("DNI:");

        jLabel10.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Afiliación:");

        jLabel11.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Año de ingreso:");

        jLabel12.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Sueldo:");

        cmbAfilAdmin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Seleccionar -", "AFP", "ONP" }));
        cmbAfilAdmin.setToolTipText("");

        cmbSueldoAdmin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Seleccionar -", "2000", "3000", "4000", "5000", "6000", "7000", "8000" }));

        btnAgregarAlFinalAdmin.setBackground(new java.awt.Color(255, 102, 102));
        btnAgregarAlFinalAdmin.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnAgregarAlFinalAdmin.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarAlFinalAdmin.setText("Agregar al final");
        btnAgregarAlFinalAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarAlFinalAdminActionPerformed(evt);
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

        tblAdmin.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        tblAdmin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Nombres", "Apellidos", "DNI", "Afiliación", "Año de ingreso", "Sueldo", "Sueldo bruto"
            }
        ));
        jScrollPane1.setViewportView(tblAdmin);

        btnEliminarInicioAdmin.setBackground(new java.awt.Color(102, 102, 102));
        btnEliminarInicioAdmin.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnEliminarInicioAdmin.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarInicioAdmin.setText("Eliminar al inicio");

        btnAgregarAlInicioAdmin.setBackground(new java.awt.Color(255, 102, 102));
        btnAgregarAlInicioAdmin.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnAgregarAlInicioAdmin.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarAlInicioAdmin.setText("Agregar al inicio");
        btnAgregarAlInicioAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarAlInicioAdminActionPerformed(evt);
            }
        });

        btnMostrarElementos.setBackground(new java.awt.Color(255, 102, 102));
        btnMostrarElementos.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnMostrarElementos.setForeground(new java.awt.Color(255, 255, 255));
        btnMostrarElementos.setText("Mostrar Elementos");
        btnMostrarElementos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarElementosActionPerformed(evt);
            }
        });

        btnEliminarFinalAdmin.setBackground(new java.awt.Color(102, 102, 102));
        btnEliminarFinalAdmin.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnEliminarFinalAdmin.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarFinalAdmin.setText("Eliminar al final");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addGap(38, 38, 38)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNombreAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(txtApellidosAdmin)
                                    .addComponent(txtDNIAdmin)))
                            .addComponent(btnLimpiarAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(btnAgregarAlInicioAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(btnAgregarAlFinalAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cmbAfilAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbSueldoAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAñoAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btnMostrarElementos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(btnEliminarInicioAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminarFinalAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(33, 33, 33))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombreAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(cmbAfilAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtApellidosAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txtAñoAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(cmbSueldoAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtDNIAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiarAdmin)
                    .addComponent(btnAgregarAlFinalAdmin)
                    .addComponent(btnAgregarAlInicioAdmin))
                .addGap(18, 18, 18)
                .addComponent(btnMostrarElementos)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminarInicioAdmin)
                    .addComponent(btnEliminarFinalAdmin))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Administradores", jPanel2);

        jPanel6.setBackground(new java.awt.Color(238, 238, 238));

        jPanel7.setBackground(new java.awt.Color(255, 102, 102));

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Registro de Empleados");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(219, 219, 219))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel4)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Nombres:");

        jLabel13.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Apellidos:");

        jLabel14.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("DNI:");

        jLabel15.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Tipo de trabajador");

        btnAgregarEmpleado.setBackground(new java.awt.Color(255, 102, 102));
        btnAgregarEmpleado.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnAgregarEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarEmpleado.setText("Agregar");

        btnLimpEmpleado.setBackground(new java.awt.Color(102, 102, 102));
        btnLimpEmpleado.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnLimpEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpEmpleado.setText("Limpiar");

        tblEmpleado.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        tblEmpleado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nombres", "Apellidos", "DNI", "Tipo de trabajador", "Sueldo", "Sueldo bruto"
            }
        ));
        jScrollPane2.setViewportView(tblEmpleado);

        btnEliminarEmpleado.setBackground(new java.awt.Color(102, 102, 102));
        btnEliminarEmpleado.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnEliminarEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarEmpleado.setText("Eliminar");

        OrdenarQuickEmpleado.setBackground(new java.awt.Color(255, 102, 102));
        OrdenarQuickEmpleado.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        OrdenarQuickEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        OrdenarQuickEmpleado.setText("Ordenar");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(btnEliminarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(OrdenarQuickEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 688, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(btnLimpEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAgregarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNombreEmpleado)
                            .addComponent(txtApellidosEmpleado)
                            .addComponent(txtDNI1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel15)
                        .addGap(18, 18, 18)
                        .addComponent(cmbTipoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33))
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel15)
                    .addComponent(txtNombreEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbTipoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtApellidosEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtDNI1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarEmpleado)
                    .addComponent(btnLimpEmpleado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminarEmpleado)
                    .addComponent(OrdenarQuickEmpleado))
                .addContainerGap(89, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Empleados", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void btnLimpiarAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarAdminActionPerformed
        limpiarCamposAdmin();
        clickOnTextfield();
    }//GEN-LAST:event_btnLimpiarAdminActionPerformed

    private void btnAgregarAlFinalAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarAlFinalAdminActionPerformed
         
         String nombre = txtNombreAdmin.getText();
         String apellido = txtApellidosAdmin.getText();
         int dni = Integer.parseInt(txtDNIAdmin.getText());
         int año =  Integer.parseInt(txtAñoAdmin.getText());
         int sueldo = Integer.parseInt(cmbSueldoAdmin.getSelectedItem().toString());
         String afiliacion = cmbAfilAdmin.getSelectedItem().toString();
         
         Admin sueldoAdmin = new Admin(sueldo, afiliacion);
         double sueldoBruto = sueldoAdmin.sueldoBruto();
         
         Admin admin = new Admin(nombre, apellido, dni, año, sueldo, afiliacion, sueldoBruto);
         nuevoAdmin.agregarFinal(admin);
         
         Object [] datos = new Object[7];
         datos[0] = nombre;
         datos[1] = apellido;
         datos[2] = dni;
         datos[3] = afiliacion;
         datos[4] = año;
         datos[5] = sueldo;
         datos[6] = sueldoBruto;
         model.addRow(datos);
         
         limpiarCamposAdmin();
         clickOnTextfield();
          
         System.out.println("Objeto añadido al final ----> "+admin.getNombre()+" - "+admin.getDNI());
         
    }//GEN-LAST:event_btnAgregarAlFinalAdminActionPerformed

    private void btnAgregarAlInicioAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarAlInicioAdminActionPerformed
        
        String nombre = txtNombreAdmin.getText();
         String apellido = txtApellidosAdmin.getText();
         int dni = Integer.parseInt(txtDNIAdmin.getText());
         int año =  Integer.parseInt(txtAñoAdmin.getText());
         int sueldo = Integer.parseInt(cmbSueldoAdmin.getSelectedItem().toString());
         String afiliacion = cmbAfilAdmin.getSelectedItem().toString();
         
         Admin sueldoAdmin = new Admin(sueldo, afiliacion);
         double sueldoBruto = sueldoAdmin.sueldoBruto();
         
         Admin admin = new Admin(nombre, apellido, dni, año, sueldo, afiliacion, sueldoBruto);
         nuevoAdmin.agregarInicio(admin);
         
         Object [] datos = new Object[7];
         datos[0] = nombre;
         datos[1] = apellido;
         datos[2] = dni;
         datos[3] = afiliacion;
         datos[4] = año;
         datos[5] = sueldo;
         datos[6] = sueldoBruto;
         model.insertRow(0, datos);
         
         limpiarCamposAdmin();
         clickOnTextfield();
    
         System.out.println("Objeto añadido al inicio ----> "+admin.getNombre()+" - "+admin.getDNI());
    }//GEN-LAST:event_btnAgregarAlInicioAdminActionPerformed

    private void btnMostrarElementosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarElementosActionPerformed
        nuevoAdmin.mostrarElementos();
    }//GEN-LAST:event_btnMostrarElementosActionPerformed


    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(RegistroAdminEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroAdminEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroAdminEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroAdminEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroAdminEmpleado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton OrdenarQuickEmpleado;
    private javax.swing.JButton btnAgregarAlFinalAdmin;
    private javax.swing.JButton btnAgregarAlInicioAdmin;
    private javax.swing.JButton btnAgregarEmpleado;
    private javax.swing.JButton btnEliminarEmpleado;
    private javax.swing.JButton btnEliminarFinalAdmin;
    private javax.swing.JButton btnEliminarInicioAdmin;
    private javax.swing.JButton btnLimpEmpleado;
    private javax.swing.JButton btnLimpiarAdmin;
    private javax.swing.JButton btnMostrarElementos;
    private javax.swing.JComboBox<String> cmbAfilAdmin;
    private javax.swing.JComboBox<String> cmbSueldoAdmin;
    private javax.swing.JComboBox<String> cmbTipoEmpleado;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tblAdmin;
    private javax.swing.JTable tblEmpleado;
    private javax.swing.JTextField txtApellidosAdmin;
    private javax.swing.JTextField txtApellidosEmpleado;
    private javax.swing.JTextField txtAñoAdmin;
    private javax.swing.JTextField txtDNI1;
    private javax.swing.JTextField txtDNIAdmin;
    private javax.swing.JTextField txtNombreAdmin;
    private javax.swing.JTextField txtNombreEmpleado;
    // End of variables declaration//GEN-END:variables
}
