package grafosCodigoPatito;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

/**
 *
 * @author Codigo Patito
 */
public class Vertice extends javax.swing.JPanel
        implements MouseListener, MouseMotionListener {

    private int pos = -1;

    public Vertice() {
        initComponents();
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
        setVisible(true);
    }

    public void dibuja(Graphics g) {
        Font fuenteV = getFont();
        Font nuevaFuente = new Font("Monospaced", Font.BOLD, 16);
        g.setColor(Color.blue);
        g.drawOval(0, 0, 30, 30);
        g.setColor(Color.black);
        g.setFont(nuevaFuente);
        if (Vista.c == Vista.maxN) {
            Vista.c = 0;
        }
        g.drawString(Vista.nombreN[Vista.c], 12, 19);
        g.setFont(fuenteV);
        this.setName(Vista.nombreN[Vista.c]);
        pos = Vista.c;
        Vista.c++;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

    @Override
    public void mouseClicked(MouseEvent e) {
        Point p;
        if (Vista.L) {
            p = MouseInfo.getPointerInfo().getLocation();
            if (Vista.eligioP) {
                p = this.getLocation();
                Vista.x1 = p.x;
                Vista.y1 = p.y;
                Vista.eligioP = false;
                Vista.i = this.pos;
            } else {
                p = this.getLocation();
                Vista.x2 = p.x;
                Vista.y2 = p.y;
                Vista.linea(Vista.x1, Vista.y1,
                        Vista.x2, Vista.y2);
                Vista.eligioP = true;
                Vista.j = this.pos;
                Vista.MAdyacencia[Vista.i][Vista.j] = true;
                Vista.MAdyacencia[Vista.j][Vista.i] = true;
                Vista.MIncidencia[Vista.i][Vista.j] = true;
                Vista.MIncidencia[Vista.j][Vista.i] = true;
            }
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet.");
    }
}
