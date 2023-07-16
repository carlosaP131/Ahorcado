/** ***************************************************************************
 *Autor:Carlos Aurelio Alcántara Pérez
 *Fecha de creación: 07-04-2022 ***
 *Fecha de actualización:07-04-2022
 *Descripción: Puntajes altos
 **
 * ************************************************************************** */
package ahorcado.juego.view;

import ahorcado.juego.controller.JugadorController;
import ahorcado.juego.pojo.Jugador;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author unsis
 */
public class Puntajes_altos extends javax.swing.JFrame {

    public List<Jugador> listajugador = new ArrayList<>();
    private Jugador jugador;
    private PrincipalGrafico pg;

    private DefaultTableModel modelo;
    private int puntaje=1000;
   

    public Puntajes_altos(PrincipalGrafico pg) {
        this.pg = pg;

        initComponents();
        this.setLocationRelativeTo(null);
        modelo = (DefaultTableModel) tabla.getModel();

    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollBar1 = new javax.swing.JScrollBar();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        Atras = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Nombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Apodo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Edad = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Agregar = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(900, 490));

        jPanel1.setBackground(new java.awt.Color(159, 197, 248));
        jPanel1.setMinimumSize(new java.awt.Dimension(900, 490));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 490));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Nombre", "Apodo", "Edad", "Puntaje"
            }
        ));
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabla);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 260, 370, 200));

        Atras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/ATRAS.png"))); // NOI18N
        Atras.setBorderPainted(false);
        Atras.setContentAreaFilled(false);
        Atras.setFocusPainted(false);
        Atras.setFocusable(false);
        Atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtrasActionPerformed(evt);
            }
        });
        jPanel1.add(Atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 10, -1, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/NOMBRE.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 90, 50));

        Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreActionPerformed(evt);
            }
        });
        Nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NombreKeyTyped(evt);
            }
        });
        jPanel1.add(Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 125, 165, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/APODO.png"))); // NOI18N
        jLabel3.setText("Apodo");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 50, -1));

        Apodo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ApodoKeyTyped(evt);
            }
        });
        jPanel1.add(Apodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 161, 165, -1));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/EDAD.png"))); // NOI18N
        jLabel1.setText("Edad");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 60, -1));

        Edad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EdadActionPerformed(evt);
            }
        });
        Edad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                EdadKeyTyped(evt);
            }
        });
        jPanel1.add(Edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 197, 165, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/PUNTAJES ALTOS.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 50, 380, 200));

        Agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/AGREGARBOTON.png"))); // NOI18N
        Agregar.setBorderPainted(false);
        Agregar.setContentAreaFilled(false);
        Agregar.setDefaultCapable(false);
        Agregar.setFocusPainted(false);
        Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarActionPerformed(evt);
            }
        });
        jPanel1.add(Agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, 200, -1));

        Eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/ELIMINARBOTON.png"))); // NOI18N
        Eliminar.setBorderPainted(false);
        Eliminar.setContentAreaFilled(false);
        Eliminar.setDefaultCapable(false);
        Eliminar.setFocusPainted(false);
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });
        jPanel1.add(Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 380, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/FONDO.jpg"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 508));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtrasActionPerformed
        this.pg.setVisible(true);
        this.hide();
    }//GEN-LAST:event_AtrasActionPerformed

    private void EdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EdadActionPerformed

    private void AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarActionPerformed
            
        if (Apodo.getText().isEmpty() && Edad.getText().isEmpty() && Nombre.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "No se permiten campos vacios ");
        } else {
            Apodo.setEditable(true);
            Jugador jug = new Jugador();
            jug.setNombre(Nombre.getText());
            jug.setApodo(Apodo.getText());
            jug.setEdad(Edad.getText());
            jug.setPuntaje(puntaje);
                

            listajugador.add(jug);

            Nombre.setText("");
            Apodo.setText("");
            Edad.setText("");
            insertarjug();
            puntaje = puntaje;
        }


    }//GEN-LAST:event_AgregarActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        Apodo.setText(tabla.getValueAt(tabla.getSelectedRow(), 1).toString());
        Nombre.setText(tabla.getValueAt(tabla.getSelectedRow(), 0).toString());
        Edad.setText(tabla.getValueAt(tabla.getSelectedRow(), 2).toString());
        Apodo.setEditable(false);
    }//GEN-LAST:event_tablaMouseClicked

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed

        String apodo = tabla.getValueAt(tabla.getSelectedRow(), 1).toString();

        for (int i = 0; i < listajugador.size(); i++) {
            if (listajugador.get(i).getApodo().compareTo(apodo) == 0) {
                listajugador.remove(i);
                insertarjug();
                break;

            }
        }
        Apodo.setEditable(true);
        Nombre.setText("");
        Apodo.setText("");
        Edad.setText("");
    }//GEN-LAST:event_EliminarActionPerformed

    private void NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreActionPerformed

    private void NombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NombreKeyTyped
        char caracter = evt.getKeyChar();
        if (Character.isDigit(caracter)){
            evt.consume();
            JOptionPane.showMessageDialog(this,"solo se permiten letras");
        }
    }//GEN-LAST:event_NombreKeyTyped

    private void ApodoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ApodoKeyTyped
         char caracter = evt.getKeyChar();
        if (Character.isDigit(caracter)){
            evt.consume();
            JOptionPane.showMessageDialog(this,"solo se permiten letras");
        }
    }//GEN-LAST:event_ApodoKeyTyped

    private void EdadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EdadKeyTyped
       char letra = evt.getKeyChar();
       if(Character.isLetter(letra)){
           evt.consume();
           JOptionPane.showMessageDialog(this, "solo se permiten numeros");
       }
    }//GEN-LAST:event_EdadKeyTyped

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
            java.util.logging.Logger.getLogger(Puntajes_altos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Puntajes_altos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Puntajes_altos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Puntajes_altos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new Puntajes_altos().setVisible(true);
            }
        });
    }

    public void insertarjug() {

        modelo.setRowCount(0);

        for (int i = 0; i < listajugador.size(); i++) {

            Object[] fila = new Object[4];

            fila[0] = listajugador.get(i).getNombre();
            fila[1] = listajugador.get(i).getApodo();
            fila[2] = listajugador.get(i).getEdad();
            fila[3] = listajugador.get(i).getPuntaje();

            modelo.addRow(fila);

        }

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agregar;
    private javax.swing.JTextField Apodo;
    private javax.swing.JButton Atras;
    private javax.swing.JTextField Edad;
    private javax.swing.JButton Eliminar;
    private javax.swing.JTextField Nombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
