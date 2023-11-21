package Vistas;

import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
import javax.swing.JInternalFrame;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.SimuladorArbolBinario;

/**
 *
 * @author Omar Tc
 */
public class Gui extends javax.swing.JFrame {

    private SimuladorArbolBinario simulador = new SimuladorArbolBinario();

    DefaultTableModel tem;
    
    /**
     * Creates new form Gui
     */
    public Gui() {
        initComponents();
        this.inicializar(false);
        PanelFondo F = new PanelFondo();
        this.add(F, BorderLayout.CENTER);
        this.pack();
        //Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagenes/LogoMB.png"));
        //setIconImage(icon);
        tem= new DefaultTableModel();
        tem.addColumn("Codigo");
        tem.addColumn("Nombre");
        jTable1.setModel(tem);

    }

    private void inicializar(boolean enable) {
        this.opciones.setEnabled(enable);
        this.cmdDarHojas.setEnabled(enable);
        this.cmdBuscar.setEnabled(enable);
        this.cmdBuscarPadre.setEnabled(enable);
        this.botonBorrar.setEnabled(enable);
        this.botonPodar.setEnabled(enable);
        this.botonBMayor.setEnabled(enable);
        this.botonBMenor.setEnabled(enable);
        this.botonCambiarValores.setEnabled(enable);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        impresion = new javax.swing.JTextArea();
        jPanel7 = new javax.swing.JPanel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jInternalFrame2 = new javax.swing.JInternalFrame();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblCnodos = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        lblChojas = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        lblVmenor = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        lblVmayor = new javax.swing.JTextField();
        botonBMayor = new javax.swing.JButton();
        botonBMenor = new javax.swing.JButton();
        botonCambiarValores = new javax.swing.JButton();
        botonInsertar = new javax.swing.JButton();
        opciones = new javax.swing.JComboBox();
        cmdDarHojas = new javax.swing.JButton();
        cmdBuscar = new javax.swing.JButton();
        cmdBuscarPadre = new javax.swing.JButton();
        botonBorrar = new javax.swing.JButton();
        botonPodar = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 10))); // NOI18N
        jPanel2.setOpaque(false);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Operaciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 10), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel3.setOpaque(false);

        jScrollPane1.setOpaque(false);

        impresion.setEditable(false);
        impresion.setColumns(20);
        impresion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        impresion.setRows(5);
        impresion.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultados de operaciones"));
        impresion.setOpaque(false);
        jScrollPane1.setViewportView(impresion);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Mejores Empleados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 10), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel7.setOpaque(false);

        jDesktopPane1.setBackground(new java.awt.Color(255, 255, 255));
        jDesktopPane1.setOpaque(false);

        jInternalFrame2.setIconifiable(true);
        jInternalFrame2.setMaximizable(true);
        jInternalFrame2.setResizable(true);
        jInternalFrame2.setEnabled(false);
        jInternalFrame2.setFocusCycleRoot(false);
        jInternalFrame2.setVisible(true);

        javax.swing.GroupLayout jInternalFrame2Layout = new javax.swing.GroupLayout(jInternalFrame2.getContentPane());
        jInternalFrame2.getContentPane().setLayout(jInternalFrame2Layout);
        jInternalFrame2Layout.setHorizontalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 408, Short.MAX_VALUE)
        );
        jInternalFrame2Layout.setVerticalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 304, Short.MAX_VALUE)
        );

        jDesktopPane1.add(jInternalFrame2);
        jInternalFrame2.setBounds(10, 0, 420, 340);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane1)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jPanel4.setOpaque(false);
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cantidad Nodos");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, -1, -1));

        lblCnodos.setEditable(false);
        jPanel4.add(lblCnodos, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 60, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Cantidad Hojas");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 90, -1));

        lblChojas.setEditable(false);
        jPanel4.add(lblChojas, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, 60, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Valor Menor");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, 90, -1));

        lblVmenor.setEditable(false);
        lblVmenor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblVmenorActionPerformed(evt);
            }
        });
        jPanel4.add(lblVmenor, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, 60, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Valor Mayor");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 90, 20));

        lblVmayor.setEditable(false);
        jPanel4.add(lblVmayor, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, 60, -1));

        botonBMayor.setBackground(new java.awt.Color(255, 255, 255));
        botonBMayor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botonBMayor.setText("Borrar mayor");
        botonBMayor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBMayorActionPerformed(evt);
            }
        });
        jPanel4.add(botonBMayor, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 122, -1));

        botonBMenor.setBackground(new java.awt.Color(255, 255, 255));
        botonBMenor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botonBMenor.setText("Borrar menor");
        botonBMenor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBMenorActionPerformed(evt);
            }
        });
        jPanel4.add(botonBMenor, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 122, -1));

        botonCambiarValores.setBackground(new java.awt.Color(255, 255, 255));
        botonCambiarValores.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botonCambiarValores.setText("Rama(s) Mayor");
        botonCambiarValores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCambiarValoresActionPerformed(evt);
            }
        });
        jPanel4.add(botonCambiarValores, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, -1, -1));

        botonInsertar.setBackground(new java.awt.Color(255, 255, 255));
        botonInsertar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botonInsertar.setText("Insertar");
        botonInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInsertarActionPerformed(evt);
            }
        });
        jPanel4.add(botonInsertar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        opciones.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        opciones.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ORDENAMIENTOS", "InOrden", "PreOrden", "PosOrden", "PorNiveles", "NivelOrdenado" }));
        opciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionesActionPerformed(evt);
            }
        });
        jPanel4.add(opciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        cmdDarHojas.setBackground(new java.awt.Color(255, 255, 255));
        cmdDarHojas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmdDarHojas.setText("Hojas");
        cmdDarHojas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdDarHojasActionPerformed(evt);
            }
        });
        jPanel4.add(cmdDarHojas, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 80, -1));

        cmdBuscar.setBackground(new java.awt.Color(255, 255, 255));
        cmdBuscar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmdBuscar.setText("Buscar");
        cmdBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBuscarActionPerformed(evt);
            }
        });
        jPanel4.add(cmdBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 80, -1));

        cmdBuscarPadre.setBackground(new java.awt.Color(255, 255, 255));
        cmdBuscarPadre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmdBuscarPadre.setText("Buscar Padre");
        cmdBuscarPadre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBuscarPadreActionPerformed(evt);
            }
        });
        jPanel4.add(cmdBuscarPadre, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 122, -1));

        botonBorrar.setBackground(new java.awt.Color(255, 255, 255));
        botonBorrar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botonBorrar.setText("Borrar");
        botonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBorrarActionPerformed(evt);
            }
        });
        jPanel4.add(botonBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 80, -1));

        botonPodar.setBackground(new java.awt.Color(255, 255, 255));
        botonPodar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botonPodar.setText("Podar");
        botonPodar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPodarActionPerformed(evt);
            }
        });
        jPanel4.add(botonPodar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 80, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInsertarActionPerformed
        try {
            int dato = Integer.parseInt(JOptionPane.showInputDialog("Digite dato entero para insertar:"));
            String name=JOptionPane.showInputDialog("Digite el nombre");
            if (this.simulador.insertar(dato)) {
                JOptionPane.showMessageDialog(null, "El dato fue insertado correctamente", " ...", 1);
                this.inicializar(true);
                Object[] rowdata={dato,name};
                tem.addRow(rowdata);
                jTable1.setModel(tem);
                
                complementos();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo insertar el dato", "Intenta de nuevo...", 0);

        }
    }//GEN-LAST:event_botonInsertarActionPerformed

    private void opcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionesActionPerformed
        Object opcion = this.opciones.getSelectedItem();
        String recorrido = null;
        if (opcion.equals("InOrden")) {
            recorrido = this.simulador.inOrden();
        }
        if (opcion.equals("PreOrden")) {
            recorrido = this.simulador.preOrden();
        }
        if (opcion.equals("PosOrden")) {
            recorrido = this.simulador.posOrden();
        }
        if (opcion.equals("PorNiveles")) {
            recorrido = this.simulador.imprimirPorNiveles();
        }
        if (opcion.equals("NivelOrdenado")) {
            recorrido = this.simulador.porNivel();
        }
        this.impresion.setText("");
        this.impresion.setText(recorrido);
    }//GEN-LAST:event_opcionesActionPerformed

    private void cmdDarHojasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdDarHojasActionPerformed
        String salida = this.simulador.darHojas();
        this.impresion.setText("");
        this.impresion.setText(salida);
    }//GEN-LAST:event_cmdDarHojasActionPerformed

    private void cmdBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBuscarActionPerformed
        int dato_a_buscar = Integer.parseInt(JOptionPane.showInputDialog("Por favor digite un dato a buscar en el arbol:"));
        String salida = this.simulador.esta(dato_a_buscar);
        this.impresion.setText("");
        this.impresion.setText(salida);
    }//GEN-LAST:event_cmdBuscarActionPerformed

    private void cmdBuscarPadreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBuscarPadreActionPerformed
        int dato_a_buscar = Integer.parseInt(JOptionPane.showInputDialog("Por favor digite un dato para buscarle su Padre: "));
        String salida = this.simulador.darPadre(dato_a_buscar);
        this.impresion.setText("");
        this.impresion.setText(salida);
    }//GEN-LAST:event_cmdBuscarPadreActionPerformed

    private void botonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBorrarActionPerformed
        try {
            int dato = Integer.parseInt(JOptionPane.showInputDialog("Digite dato entero para borrar: "));
            this.impresion.setText(this.simulador.borrar(dato));
            
            complementos();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_botonBorrarActionPerformed

    private void botonPodarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPodarActionPerformed
        this.impresion.setText("Arbol Borrado");
        this.simulador.borrartodo();
        //this.simulador.podarArbol();
        borrarAll();
        //complementos();
    }//GEN-LAST:event_botonPodarActionPerformed

    private void botonBMayorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBMayorActionPerformed
        try {
            this.impresion.setText("");
            this.impresion.setText(simulador.borrarMayor());
            
            complementos();
        } catch (Exception e) {
            complementos();
        }
    }//GEN-LAST:event_botonBMayorActionPerformed

    private void botonBMenorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBMenorActionPerformed

        try {
            this.impresion.setText("");
            this.impresion.setText(simulador.borrarMenor());           

            complementos();
        } catch (Exception e) {
            
            complementos();
        }
    }//GEN-LAST:event_botonBMenorActionPerformed

    public void borrarAll(){
        this.repintarArbol();
        this.lblChojas.setText("");
        this.lblCnodos.setText("");
        this.lblVmayor.setText("");
        this.lblVmenor.setText("");
        int fila = jTable1.getRowCount();
        for (int i = fila-1; i >=0; i--) {
            tem.removeRow(i);
        }
    }
    public void complementos(){
        this.repintarArbol();
        this.lblCnodos.setText("");
        this.lblCnodos.setText(this.simulador.CantidadNodos());

        this.lblChojas.setText("");
        this.lblChojas.setText(this.simulador.CantidadHojas());

        this.lblVmenor.setText("");
        this.lblVmenor.setText(this.simulador.menorValor());

        this.lblVmayor.setText("");
        this.lblVmayor.setText(this.simulador.mayorValor());
    }
    private void botonCambiarValoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCambiarValoresActionPerformed
        String recorrido = null;
        recorrido = this.simulador.ramaMayor();

        this.impresion.setText("");
        this.impresion.setText(recorrido);
    }//GEN-LAST:event_botonCambiarValoresActionPerformed

    private void lblVmenorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblVmenorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblVmenorActionPerformed

    private void repintarArbol() {
        this.jDesktopPane1.removeAll();
        Rectangle tamaño = this.jInternalFrame2.getBounds();
        this.jInternalFrame2 = null;
        this.jInternalFrame2 = new JInternalFrame("Representación gráfica", true);
        this.jDesktopPane1.add(this.jInternalFrame2, JLayeredPane.DEFAULT_LAYER);
        this.jInternalFrame2.setVisible(true);
        this.jInternalFrame2.setBounds(tamaño);
        this.jInternalFrame2.setEnabled(false);
        this.jInternalFrame2.add(this.simulador.getDibujo(), BorderLayout.CENTER);
    }

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gui().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBMayor;
    private javax.swing.JButton botonBMenor;
    private javax.swing.JButton botonBorrar;
    private javax.swing.JButton botonCambiarValores;
    private javax.swing.JButton botonInsertar;
    private javax.swing.JButton botonPodar;
    private javax.swing.JButton cmdBuscar;
    private javax.swing.JButton cmdBuscarPadre;
    private javax.swing.JButton cmdDarHojas;
    private javax.swing.JTextArea impresion;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JInternalFrame jInternalFrame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField lblChojas;
    private javax.swing.JTextField lblCnodos;
    private javax.swing.JTextField lblVmayor;
    private javax.swing.JTextField lblVmenor;
    private javax.swing.JComboBox opciones;
    // End of variables declaration//GEN-END:variables
}