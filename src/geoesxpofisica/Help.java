package geoesxpofisica;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;

/**
 *
 * @author aaron
 */
public class Help extends javax.swing.JFrame {
      
    int xm = 0, ym = 0;
    
    public Help() {
        initComponents();
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contener_p = new javax.swing.JPanel();
        desplazamiento_p = new javax.swing.JPanel();
        Exit = new javax.swing.JButton();
        jPSlider = new javax.swing.JPanel();
        UWindow = new javax.swing.JButton();
        BWindow = new javax.swing.JButton();
        RWindow = new javax.swing.JButton();
        ayuda_tp = new javax.swing.JTabbedPane();
        unidades_p = new javax.swing.JPanel();
        botones_p = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        recomendaciones_p = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(1160, 626));

        contener_p.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        desplazamiento_p.setBackground(new java.awt.Color(57, 91, 100));
        desplazamiento_p.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                desplazamiento_pMouseDragged(evt);
            }
        });
        desplazamiento_p.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                desplazamiento_pMousePressed(evt);
            }
        });

        Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Salir-14.png"))); // NOI18N
        Exit.setBorderPainted(false);
        Exit.setContentAreaFilled(false);
        Exit.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Salir-15.png"))); // NOI18N
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout desplazamiento_pLayout = new javax.swing.GroupLayout(desplazamiento_p);
        desplazamiento_p.setLayout(desplazamiento_pLayout);
        desplazamiento_pLayout.setHorizontalGroup(
            desplazamiento_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, desplazamiento_pLayout.createSequentialGroup()
                .addGap(0, 795, Short.MAX_VALUE)
                .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        desplazamiento_pLayout.setVerticalGroup(
            desplazamiento_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desplazamiento_pLayout.createSequentialGroup()
                .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, Short.MAX_VALUE)
                .addContainerGap())
        );

        contener_p.add(desplazamiento_p, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 35));

        jPSlider.setBackground(new java.awt.Color(44, 51, 51));
        jPSlider.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPSliderMouseClicked(evt);
            }
        });

        UWindow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Hints-20.png"))); // NOI18N
        UWindow.setBorderPainted(false);
        UWindow.setContentAreaFilled(false);
        UWindow.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/HintsRI-23.png"))); // NOI18N
        UWindow.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/HintsSI-26.png"))); // NOI18N
        UWindow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UWindowActionPerformed(evt);
            }
        });

        BWindow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Hints-18.png"))); // NOI18N
        BWindow.setBorderPainted(false);
        BWindow.setContentAreaFilled(false);
        BWindow.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/HintsRI-21.png"))); // NOI18N
        BWindow.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/HintsSI-24.png"))); // NOI18N
        BWindow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BWindowActionPerformed(evt);
            }
        });

        RWindow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Hints-19.png"))); // NOI18N
        RWindow.setBorderPainted(false);
        RWindow.setContentAreaFilled(false);
        RWindow.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/HintsRI-22.png"))); // NOI18N
        RWindow.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/HintsSI-25.png"))); // NOI18N
        RWindow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RWindowActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPSliderLayout = new javax.swing.GroupLayout(jPSlider);
        jPSlider.setLayout(jPSliderLayout);
        jPSliderLayout.setHorizontalGroup(
            jPSliderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPSliderLayout.createSequentialGroup()
                .addGroup(jPSliderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(UWindow, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BWindow, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RWindow, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPSliderLayout.setVerticalGroup(
            jPSliderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPSliderLayout.createSequentialGroup()
                .addComponent(UWindow, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(BWindow, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(RWindow, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        contener_p.add(jPSlider, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 35, 180, 591));

        ayuda_tp.setEnabled(false);

        javax.swing.GroupLayout unidades_pLayout = new javax.swing.GroupLayout(unidades_p);
        unidades_p.setLayout(unidades_pLayout);
        unidades_pLayout.setHorizontalGroup(
            unidades_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 645, Short.MAX_VALUE)
        );
        unidades_pLayout.setVerticalGroup(
            unidades_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 592, Short.MAX_VALUE)
        );

        ayuda_tp.addTab("Unidades de medidas", unidades_p);

        botones_p.setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BWindow-27.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setFocusable(false);

        javax.swing.GroupLayout botones_pLayout = new javax.swing.GroupLayout(botones_p);
        botones_p.setLayout(botones_pLayout);
        botones_pLayout.setHorizontalGroup(
            botones_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 645, Short.MAX_VALUE)
        );
        botones_pLayout.setVerticalGroup(
            botones_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botones_pLayout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 602, Short.MAX_VALUE)
                .addContainerGap())
        );

        ayuda_tp.addTab("Botones", botones_p);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/RWindow-28.png"))); // NOI18N
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setFocusable(false);

        javax.swing.GroupLayout recomendaciones_pLayout = new javax.swing.GroupLayout(recomendaciones_p);
        recomendaciones_p.setLayout(recomendaciones_pLayout);
        recomendaciones_pLayout.setHorizontalGroup(
            recomendaciones_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 645, Short.MAX_VALUE)
        );
        recomendaciones_pLayout.setVerticalGroup(
            recomendaciones_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        ayuda_tp.addTab("Consejos", recomendaciones_p);

        contener_p.add(ayuda_tp, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 650, 620));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contener_p, javax.swing.GroupLayout.PREFERRED_SIZE, 830, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contener_p, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPSliderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPSliderMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPSliderMouseClicked

    private void desplazamiento_pMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_desplazamiento_pMousePressed
        xm = evt.getX();
        ym = evt.getY();
    }//GEN-LAST:event_desplazamiento_pMousePressed

    private void desplazamiento_pMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_desplazamiento_pMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xm, y - ym);
    }//GEN-LAST:event_desplazamiento_pMouseDragged

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_ExitActionPerformed

    private void UWindowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UWindowActionPerformed
        UWindow.setSelected(true);
        //Cambio de botón//
        BWindow.setSelected(false);
        RWindow.setSelected(false);
        ayuda_tp.setSelectedIndex(0);
    }//GEN-LAST:event_UWindowActionPerformed

    private void BWindowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BWindowActionPerformed
        BWindow.setSelected(true);
        //Cambio de botón//
        UWindow.setSelected(false);
        RWindow.setSelected(false);
        ayuda_tp.setSelectedIndex(1);
    }//GEN-LAST:event_BWindowActionPerformed

    private void RWindowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RWindowActionPerformed
        RWindow.setSelected(true);
        //Cambio de botón//
        BWindow.setSelected(false);
        UWindow.setSelected(false);
        ayuda_tp.setSelectedIndex(2);
    }//GEN-LAST:event_RWindowActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BWindow;
    private javax.swing.JButton Exit;
    private javax.swing.JButton RWindow;
    private javax.swing.JButton UWindow;
    private javax.swing.JTabbedPane ayuda_tp;
    private javax.swing.JPanel botones_p;
    private javax.swing.JPanel contener_p;
    private javax.swing.JPanel desplazamiento_p;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPSlider;
    private javax.swing.JPanel recomendaciones_p;
    private javax.swing.JPanel unidades_p;
    // End of variables declaration//GEN-END:variables
}
