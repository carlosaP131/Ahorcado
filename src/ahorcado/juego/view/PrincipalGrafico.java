/** **************************************************************************************************
 *Autor:Carlos Aurelio Alcántara Pérez
 *Fecha de creación: 07-04-2022 ***
 *Fecha de actualización:07-04-2022
 *Descripción: Pestaña principal
 **
 * ************************************************************************************************ */
package ahorcado.juego.view;


import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javazoom.jlgui.basicplayer.BasicPlayer;
import javazoom.jlgui.basicplayer.BasicPlayerException;

/**
 *
 * @author unsis
 */
public final class PrincipalGrafico extends javax.swing.JFrame  {

    BasicPlayer player = new BasicPlayer();
    Juego jugar;
    Puntajes_altos PA = new Puntajes_altos(this);

    
    public PrincipalGrafico() {

        initComponents();
        this.setLocationRelativeTo(null);
        sonido();
 
    }
    public PrincipalGrafico(BasicPlayer audio) {
        this.player = audio;
        initComponents();
        this.setLocationRelativeTo(null);
        
 
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PantallaPricipal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(645, 528));
        setPreferredSize(new java.awt.Dimension(645, 528));

        PantallaPricipal.setBackground(new java.awt.Color(159, 197, 248));
        PantallaPricipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/AHORCADO.png"))); // NOI18N
        PantallaPricipal.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/JUGARBOTON.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setDefaultCapable(false);
        jButton1.setFocusPainted(false);
        jButton1.setFocusable(false);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        PantallaPricipal.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 127, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/PUNTAJESALTOSBOTON.png"))); // NOI18N
        jButton2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setFocusPainted(false);
        jButton2.setFocusable(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        PantallaPricipal.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, -1, -1));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/SALIRBOTON.png"))); // NOI18N
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setFocusPainted(false);
        jButton3.setFocusable(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        PantallaPricipal.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, 140, -1));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/SILENCIAR.png"))); // NOI18N
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.setFocusPainted(false);
        jButton4.setFocusable(false);
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        PantallaPricipal.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 450, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/FONDO.jpg"))); // NOI18N
        jLabel2.setMinimumSize(new java.awt.Dimension(645, 510));
        jLabel2.setPreferredSize(new java.awt.Dimension(645, 510));
        PantallaPricipal.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 510));

        getContentPane().add(PantallaPricipal, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new Juego(player).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       

        PA.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        mute();
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
      
    }//GEN-LAST:event_jButton1MouseEntered

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalGrafico().setVisible(true);
            }
        });
    }

    public void sonido() {
        try {
          player.open(new File("/home/unsis/NetBeansProjects/proyecto funcional"
                  + "/src/ahorcado/juego/view/tetrisgameboy1-gameboy.mp3"));
            player.play();
        } catch (Exception e) {
        }
    }
    
    

    public void mute() {
        if (player.getStatus() == BasicPlayer.PAUSED) {
            
            try {
                player.resume();
            } catch (BasicPlayerException ex) {
                Logger.getLogger(PrincipalGrafico.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }else if (player.getStatus() == BasicPlayer.PLAYING){
            try {
            player.pause();
        } catch (BasicPlayerException e) {
        }
            
        }
        

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PantallaPricipal;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables

   

}
