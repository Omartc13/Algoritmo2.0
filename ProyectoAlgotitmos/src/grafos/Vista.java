package grafos;

import Vistas.FramePrincipal;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Codigo Patito
 */
public class Vista extends javax.swing.JFrame {

    public static ArrayList<Vertice> panel = new ArrayList<>();
    public static int c = 0;
    public static int cl = 0;
    public static int maxN = 10;
    public static boolean N = false;
    public static boolean L = false;
    public static Graphics h;
    public static String nombreN[] = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
    public static String nombreL[] = {"A1", "A2", "A3", "A4", "A5", "A6", "A7", "A8", "A9", "A10",
        "A11", "A12", "A13", "A14", "A15", "A16", "A17", "A18", "A19", "A20"};
    public static int maxL = nombreL.length;
    public static boolean eligioP = true;
    public Point punto;
    public static int x1, x2, y1, y2;
    public static int i = -1, j = -1;
    public static boolean MAdyacencia[][] = new boolean[maxN][maxN];
    public static boolean MIncidencia[][] = new boolean[maxN][maxL];
    private String matrizAdyacente = "", matrizIncedencia = "";
    int contador;

    public Vista() {
        initComponents();
        h = this.getGraphics();
        setTitle("Grafos");
        setResizable(false);
        inicializa();
        Matriz.setEditable(false);
        btnLinea.setEnabled(false);
        btnAyacente.setEnabled(false);
        contador = 0;
          setLocationRelativeTo(this);
    }

    public void inicializa() {
        for (int r = 0; r < maxN; r++) {
            for (int s = 0; s < maxN; s++) {
                MAdyacencia[r][s] = false;
            }
        }
        for (int e = 0; e < maxN; e++) {
            for (int f = 0; f < maxL; f++) {
                MIncidencia[e][f] = false;
            }
        }
    }

    public static void linea(int x, int y, int w, int z) {
        h.setColor(Color.RED);
        if (x == w && y == z) {
            h.drawArc(x + 10, y + 5, 20, 30, 320, 290);
            x = x + 15;
            y = y + 20;
        } else {
            h.drawLine(x + 20, y + 45, w + 20, z + 45);
            x = ((x + 20 - w + 20) / 2) + w;
            y = ((y + 45 - z + 45) / 2) + z;
        }
        h.setColor(Color.BLACK);
        h.drawString(nombreL[cl], x, y);
//        h.drawString(nombreL[cl], ((x + 20 - w + 20) / 2) + w, ((y + 45 - z + 45) / 2) + z);
        cl++;
    }

    public void muestraAdyacencia() {
        matrizAdyacente = "Matriz de Adyacencia  \n\n";
        int tNodos = panel.size();
        int bit = 0;
        String Nom = "";
        matrizAdyacente += "   ";
        matrizAdyacente += "  ";
        for (int k = 0; k < tNodos; k++) {
            matrizAdyacente += "  " + nombreN[k];
        }
        for (int k = 0; k < tNodos; k++) {
            matrizAdyacente += "  \n";
            for (int l = 0; l < tNodos; l++) {
                if (MAdyacencia[k][l]) {
                    bit = 1;
                } else {
                    bit = 0;
                }
                if (l == 0) {
                    Nom = nombreN[k] + "  ";
                } else {
                    Nom = "";
                }
                matrizAdyacente += Nom + bit + "   ";
            }
        }
        setMatriz(matrizAdyacente, matrizIncedencia);
    }

    public void Incidencia() {
        matrizIncedencia = "Matriz de Incidencia  \n\n";
        int tNodos = panel.size();
        int bit = 0;
        String Nom = "";
        matrizIncedencia += "  ";
        matrizIncedencia += "  ";
        for (int k = 0; k < tNodos; k++) {
            matrizIncedencia += "   " + nombreN[k];
        }
        for (int k = 0; k < tNodos; k++) {
            matrizIncedencia += "   \n";
            for (int l = 0; l < tNodos; l++) {
                if (MIncidencia[k][l]) {
                    bit = 0;
                } else {
                    bit = 1;
                }
                if (l == 0) {
                    Nom = nombreL[k] + "  ";
                } else {
                    Nom = "";
                }
                matrizIncedencia += Nom + bit + "   ";
            }
        }
        setMatriz(matrizIncedencia, matrizAdyacente);
    }

    private void setMatriz(String matriz1, String matriz2) {
        Matriz.setText(matriz1 + "\n\n" + matriz2);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btnAyacente = new javax.swing.JButton();
        btnSalir1 = new javax.swing.JButton();
        btnVertice = new javax.swing.JButton();
        btnLinea = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Matriz = new javax.swing.JTextArea();
        panelView = new javax.swing.JPanel();
        lblEstado = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaProducto = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(187, 187, 187));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Menu"));

        btnAyacente.setBackground(new java.awt.Color(255, 238, 238));
        btnAyacente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/resources/imagenes/matriz.png"))); // NOI18N
        btnAyacente.setText("Matriz");
        btnAyacente.setFocusPainted(false);
        btnAyacente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAyacente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAyacente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAyacenteActionPerformed(evt);
            }
        });

        btnSalir1.setBackground(new java.awt.Color(255, 102, 102));
        btnSalir1.setText("Salir");
        btnSalir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalir1ActionPerformed(evt);
            }
        });

        btnVertice.setBackground(new java.awt.Color(255, 238, 238));
        btnVertice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/resources/imagenes/circulo.png"))); // NOI18N
        btnVertice.setText("Vertice");
        btnVertice.setToolTipText("");
        btnVertice.setFocusPainted(false);
        btnVertice.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnVertice.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnVertice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerticeActionPerformed(evt);
            }
        });

        btnLinea.setBackground(new java.awt.Color(255, 238, 238));
        btnLinea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/resources/imagenes/linea.png"))); // NOI18N
        btnLinea.setText("Arista");
        btnLinea.setFocusPainted(false);
        btnLinea.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLinea.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnLinea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLineaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSalir1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnVertice, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLinea, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAyacente, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnVertice, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(btnLinea, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAyacente, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)))
                .addComponent(btnSalir1)
                .addContainerGap())
        );

        Matriz.setColumns(20);
        Matriz.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        Matriz.setRows(5);
        Matriz.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Matriz", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto", 1, 12))); // NOI18N
        jScrollPane1.setViewportView(Matriz);
        Matriz.getAccessibleContext().setAccessibleName("Matrices");

        panelView.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 255)));
        panelView.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelViewMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelViewLayout = new javax.swing.GroupLayout(panelView);
        panelView.setLayout(panelViewLayout);
        panelViewLayout.setHorizontalGroup(
            panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 702, Short.MAX_VALUE)
        );
        panelViewLayout.setVerticalGroup(
            panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        lblEstado.setBorder(javax.swing.BorderFactory.createTitledBorder("Estado"));

        txtAreaProducto.setColumns(20);
        txtAreaProducto.setRows(5);
        jScrollPane2.setViewportView(txtAreaProducto);

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel1.setText("Productos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addComponent(lblEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVerticeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerticeActionPerformed
        if (N) {
            N = false;
            L = false;
            lblEstado.setText("Vertice y Arista Desactivado");
            btnVertice.setBackground(null);
            btnLinea.setBackground(null);
        } else {
            L = false;
            N = true;
            btnVertice.setBackground(Color.decode("#79f966"));
            btnLinea.setBackground(null);
            lblEstado.setText("Vertice Activo");
        }
    }//GEN-LAST:event_btnVerticeActionPerformed

    private void btnLineaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLineaActionPerformed
        if (L) {
            L = false;
            N = false;
            lblEstado.setText("Vertice y Arista Desactivado");
            btnVertice.setBackground(null);
            btnLinea.setBackground(null);
        } else {
            N = false;
            L = true;
            btnLinea.setBackground(Color.decode("#79f966"));
            btnVertice.setBackground(null);
            lblEstado.setText("Arista Activo");
        }
    }//GEN-LAST:event_btnLineaActionPerformed

    private void btnAyacenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAyacenteActionPerformed
        muestraAdyacencia();
    }//GEN-LAST:event_btnAyacenteActionPerformed

    private void btnSalir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalir1ActionPerformed
        FramePrincipal reg = new FramePrincipal();
        reg.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnSalir1ActionPerformed

    private void panelViewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelViewMouseClicked

        if (panelView.getMousePosition() != null) {
            Point p = panelView.getMousePosition().getLocation();
            if (!L) {
                if (N) {
                    btnLinea.setEnabled(true);
                    btnAyacente.setEnabled(true);
                    String producto = JOptionPane.showInputDialog("Introduce el nombre del producto");
                    txtAreaProducto.append(nombreN[contador] + " ----> " + producto + "\n");
                    Vertice prueba = new Vertice();
                    prueba.setBounds(p.x - 15, p.y - 10, 31, 31);
                    panelView.add(prueba);
                    panel.add(prueba);
                    prueba.dibuja(prueba.getGraphics());
                    contador = contador + 1;
                }
            }
        }


    }//GEN-LAST:event_panelViewMouseClicked

    public static void main(String args[]) {

        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Matriz;
    private javax.swing.JButton btnAyacente;
    private javax.swing.JButton btnLinea;
    private javax.swing.JButton btnSalir1;
    private javax.swing.JButton btnVertice;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JPanel panelView;
    private javax.swing.JTextArea txtAreaProducto;
    // End of variables declaration//GEN-END:variables
}
