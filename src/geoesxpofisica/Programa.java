/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package geoesxpofisica;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author aaron
 */
public class Programa extends javax.swing.JFrame {

    boolean resize = false;
    boolean rewrite = true;
    int xm, ym;
    int tamf = 15;
    int zoom = 100;
    int or = 50;
    int radio = 1;
    carga pos[] = new carga[1000];
    int tope = 0;
    int sliderX = 180;
    Timer timer = new Timer();

    public Programa() {
        initComponents();
        jPSlider.setSize(0, 700);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPSlider = new javax.swing.JPanel();
        sliderIn = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        X_label = new javax.swing.JLabel();
        Y_label = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        campo_label = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        x_text = new javax.swing.JTextField();
        y_text = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        carga = new javax.swing.JTextField();
        radio_text = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        upPanel = new javax.swing.JPanel();
        exit = new javax.swing.JLabel();
        sliderOut = new javax.swing.JLabel();
        jPlano = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        signo_box = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        sensor_box = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        addWindowStateListener(new java.awt.event.WindowStateListener() {
            public void windowStateChanged(java.awt.event.WindowEvent evt) {
                formWindowStateChanged(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPSlider.setBackground(new java.awt.Color(44, 51, 51));
        jPSlider.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPSliderMouseClicked(evt);
            }
        });

        sliderIn.setForeground(new java.awt.Color(255, 255, 255));
        sliderIn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sliderIn.setText("---");
        sliderIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sliderInMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Info del campo, carga, etc");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Posicion:");

        X_label.setForeground(new java.awt.Color(255, 255, 255));
        X_label.setText("X: ---");

        Y_label.setForeground(new java.awt.Color(255, 255, 255));
        Y_label.setText("Y: ---");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Campo:");

        campo_label.setForeground(new java.awt.Color(255, 255, 255));
        campo_label.setText("Intensidad: ---");

        javax.swing.GroupLayout jPSliderLayout = new javax.swing.GroupLayout(jPSlider);
        jPSlider.setLayout(jPSliderLayout);
        jPSliderLayout.setHorizontalGroup(
            jPSliderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPSliderLayout.createSequentialGroup()
                .addGroup(jPSliderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sliderIn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPSliderLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPSliderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPSliderLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPSliderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(X_label)
                                    .addComponent(Y_label)
                                    .addComponent(jLabel7)
                                    .addComponent(campo_label))))))
                .addGap(83, 83, 83))
        );
        jPSliderLayout.setVerticalGroup(
            jPSliderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPSliderLayout.createSequentialGroup()
                .addComponent(sliderIn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(X_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Y_label)
                .addGap(24, 24, 24)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campo_label)
                .addGap(126, 126, 126)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPSlider, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 700));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 630, 112, -1));

        jButton1.setText("Zoom");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 630, 80, -1));
        getContentPane().add(x_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 630, 70, -1));
        getContentPane().add(y_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 660, 70, -1));

        jButton2.setText("Add");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 630, -1, 50));
        getContentPane().add(carga, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 660, 80, -1));
        getContentPane().add(radio_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 660, 110, -1));

        jButton3.setText("Resize");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 660, 80, -1));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(57, 91, 100));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel2MouseMoved(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });

        upPanel.setBackground(new java.awt.Color(57, 91, 100));
        upPanel.setPreferredSize(new java.awt.Dimension(35, 35));

        exit.setForeground(new java.awt.Color(255, 255, 255));
        exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exit.setText("X");
        exit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        exit.setName(""); // NOI18N
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                exitMousePressed(evt);
            }
        });

        javax.swing.GroupLayout upPanelLayout = new javax.swing.GroupLayout(upPanel);
        upPanel.setLayout(upPanelLayout);
        upPanelLayout.setHorizontalGroup(
            upPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exit, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );
        upPanelLayout.setVerticalGroup(
            upPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exit, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        sliderOut.setForeground(new java.awt.Color(255, 255, 255));
        sliderOut.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sliderOut.setText("---");
        sliderOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sliderOutMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(sliderOut, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1180, Short.MAX_VALUE)
                .addComponent(upPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(upPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(sliderOut, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1250, -1));

        jPlano.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jPlano.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jPlano.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                jPlanoAncestorMoved(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(2500, 2500));
        jPanel1.setPreferredSize(new java.awt.Dimension(2500, 2500));
        jPanel1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                jPanel1AncestorMoved(evt);
            }
        });
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel1MouseMoved(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel1MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2500, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2500, Short.MAX_VALUE)
        );

        jPlano.setViewportView(jPanel1);

        jPanel3.add(jPlano, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 34, 1070, 580));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1250, 620));

        signo_box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Negativa", "Positiva" }));
        getContentPane().add(signo_box, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 630, 80, -1));

        jLabel3.setText("X");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 630, 20, -1));

        jLabel4.setText("Y");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 660, 20, -1));

        jLabel5.setText("Signo");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 630, -1, -1));

        jLabel6.setText("Valor");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 660, -1, -1));

        sensor_box.setText("Sensor");
        getContentPane().add(sensor_box, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 630, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowStateChanged(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowStateChanged

    }//GEN-LAST:event_formWindowStateChanged

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

    }//GEN-LAST:event_formWindowOpened

    private void jPlanoAncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jPlanoAncestorMoved

    }//GEN-LAST:event_jPlanoAncestorMoved

    private void jPanel1AncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jPanel1AncestorMoved
        if (resize == false) {
            dibujarL(2500, 2500, 0, zoom);
            for (int i = 0; i < tope; i++) {
                dibujarC(or + pos[i].x, or + pos[i].y, i);
            }
            if (tope > 0) {
                dibujarCampo();
            }
        }
    }//GEN-LAST:event_jPanel1AncestorMoved

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jPanel1.repaint();
        zoom = Integer.parseInt(jTextField1.getText());
        or = zoom / 2;
        timer.schedule(new RepeatedTask(), 5);
    }//GEN-LAST:event_jButton1ActionPerformed

    public class RepeatedTask extends TimerTask {

        @Override
        public void run() {
            dibujarL(2500, 2500, 0, zoom);
            for (int i = 0; i < tope; i++) {
                dibujarC(or + pos[i].x, or + pos[i].y, i);
            }
        }
    }

    public class RepeatedTask1 extends TimerTask {

        int x, y;

        public RepeatedTask1(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public void run() {
            Graphics g = jPanel1.getGraphics();
            g.drawLine(or * 2500 / zoom, or * 2500 / zoom, x, y);
        }
    }

    public class RepeatedTaskRe extends TimerTask {

        @Override
        public void run() {
            resize = !resize;
            timer.schedule(new RepeatedTask(), 1);
        }
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int x = Integer.parseInt(x_text.getText());
        int y = Integer.parseInt(y_text.getText());
        double charge = Double.parseDouble(carga.getText());
        carga q = new carga(x, -1 * y, charge, signo_box.getItemAt(signo_box.getSelectedIndex()));
        pos[tope] = q;
        tope++;
        for (int i = 0; i < tope; i++) {
            dibujarC(or + pos[i].x, or + pos[i].y, i);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        radio = Integer.parseInt(radio_text.getText());
        jPanel1.repaint();
        timer.schedule(new RepeatedTask(), 5);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        xm = evt.getX();
        ym = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel2MouseMoved

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xm, y - ym);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitMouseClicked

    private void exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseEntered
        upPanel.setBackground(new Color(36, 71, 71));
    }//GEN-LAST:event_exitMouseEntered

    private void exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseExited
        upPanel.setBackground(new Color(57, 91, 100));
    }//GEN-LAST:event_exitMouseExited

    private void exitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMousePressed
        upPanel.setBackground(new Color(32, 64, 66));
    }//GEN-LAST:event_exitMousePressed

    private void jPanel1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseMoved
        if (rewrite) {
            double x = (evt.getX() / (float) (2500 / zoom)) - (float) or, y = -1 * ((evt.getY() / (float) (2500 / zoom)) - (float) or);
            X_label.setText("X: " + String.valueOf(x));
            Y_label.setText("Y: " + String.valueOf(y));
            double campop = campo_m(x, y);
            campo_label.setText("Intensidad: " + String.valueOf(campop));
        }
    }//GEN-LAST:event_jPanel1MouseMoved

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked

    }//GEN-LAST:event_jPanel1MouseClicked

    public double campo_m(double x, double y) {
        double campop = 0;
        for (int i = 0; i < tope; i++) {
            campoP aux = new campoP(x, y, pos[i].x, -1 * pos[i].y, pos[i].charge, pos[i].positive, or, false);
            campop = campop + aux.campoe;
        }
        return campop;
    }

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        //jPanel1.repaint();
        Graphics draw = jPanel1.getGraphics();
        double x = (evt.getX() / (float) (2500 / zoom)) - (float) or, y = -1 * ((evt.getY() / (float) (2500 / zoom)) - (float) or);
        if (sensor_box.isSelected()) {
            double iv = 0, jv = 0;
            for (int i = 0; i < tope; i++) {
                campoP aux = new campoP(x, y, pos[i].x, -1 * pos[i].y, pos[i].charge, pos[i].positive, or, false);
                System.out.println(aux.campoe);
                iv = iv + aux.i;
                jv = jv + aux.j;
            }
            System.out.println("iv: " + iv + "\njv: " + jv);
            draw.drawLine(evt.getX(), evt.getY(), (int) ((iv + or + x) * (2500 / zoom)), -1 * (int) ((jv - or + y) * (2500 / zoom)));
        }
    }//GEN-LAST:event_jPanel1MousePressed

    private void sliderInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sliderInMouseClicked
        if (sliderX == 180) {
            jPSlider.setSize(180, 700);
            resize = true;
            rewrite = !rewrite;
            Thread th = new Thread() {
                @Override
                public void run() {
                    try {
                        jPlano.setSize(jPlano.getWidth() + 180, 580);
                        jPlano.updateUI();
                        for (int i = 180; i >= 0; i--) {
                            Thread.sleep(1);
                            jPSlider.setSize(i, 700);
                            jPlano.setLocation(i, 34);
                        }
                    } catch (InterruptedException e) {
                        System.out.println(e);
                    }
                }
            };
            th.start();
            sliderX = 0;
            timer.schedule(new RepeatedTaskRe(), 600);
        }
    }//GEN-LAST:event_sliderInMouseClicked

    private void jPSliderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPSliderMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPSliderMouseClicked

    private void sliderOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sliderOutMouseClicked
        if (sliderX == 0) {
            jPSlider.setSize(0, 700);
            resize = true;
            Thread th = new Thread() {
                @Override
                public void run() {
                    try {
                        for (int i = 0; i <= 180; i++) {
                            Thread.sleep(1);
                            jPlano.repaint();
                            jPSlider.setSize(i, 700);
                            jPlano.setLocation(i, 34);
                        }
                        jPlano.setSize(jPlano.getWidth() - 180, 580);
                        jPlano.updateUI();
                    } catch (InterruptedException e) {
                        System.out.println(e);
                    }
                }
            };
            th.start();
            sliderX = 180;
            timer.schedule(new RepeatedTaskRe(), 600);
            rewrite = !rewrite;
        }
    }//GEN-LAST:event_sliderOutMouseClicked

    private void jPanel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseEntered

    }//GEN-LAST:event_jPanel1MouseEntered

    private void jPanel1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseReleased

    }//GEN-LAST:event_jPanel1MouseReleased

    private void jPanel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseExited
        if (rewrite) {
            X_label.setText("X: ---");
            Y_label.setText("Y: ---");
            campo_label.setText("Intensidad: ---");
        }
    }//GEN-LAST:event_jPanel1MouseExited

    public void dibujarC(int x, int y, int i) {
        Graphics draw = jPanel1.getGraphics();
        draw.drawOval(((2500 / zoom) * x) - ((2500 / zoom) / 2) * radio, ((2500 / zoom) * y) - ((2500 / zoom) / 2) * radio, (2500 / zoom) * radio, (2500 / zoom) * radio);
        draw.setFont(new Font("Tahoma", Font.ITALIC, 20));
        draw.setColor(Color.BLUE);
        draw.drawString("Q" + String.valueOf(i), ((2500 / zoom) * x) + (2500 / zoom) / 2 * radio, ((2500 / zoom) * y) - (2500 / zoom) / 2 * radio);
    }

    public void dibujarL(int height, int width, int proporcion, int div) {
        Graphics draw = jPanel1.getGraphics();
        int x = height / div;
        int y = width / div;
        for (int i = 1; i <= div; i++) {
            draw.setColor(Color.GRAY);
            draw.drawLine(0, i * y, 2500, i * y);
        }
        for (int i = 1; i <= div; i++) {
            draw.setColor(Color.GRAY);
            draw.drawLine(i * x, 0, i * x, 2500);
        }
        draw.setColor(Color.BLACK);
        Graphics2D draw2d = (Graphics2D) draw;
        draw2d.setStroke(new BasicStroke(2));
        draw.drawLine(div / 2 * x, 0, div / 2 * x, 2500);
        draw.drawLine(0, div / 2 * y, 2500, div / 2 * y);
    }

    public void dibujarCampo() {
        Graphics draw = jPanel1.getGraphics();
        for (int i = 1; i <= zoom; i++) {
            for (int j = 1; j <= zoom; j++) {
                double it = 0, jt = 0;
                int z = 0;
                while (z != tope) {
                    campoP aux = new campoP(i * (2500 / zoom), j * (2500 / zoom), (pos[z].x + or) * (2500 / zoom), (pos[z].y + or) * (2500 / zoom), pos[z].charge, pos[z].positive, or, false);
                    it = it + aux.i;
                    jt = jt + aux.j;
                    z++;
                }
                vectorU vc = new vectorU(it, jt);
                int posi = i * (2500 / zoom), posj = j * (2500 / zoom);
                draw.setColor(new Color(131, 0, 234));
                draw.drawLine(posi, posj, (int) ((vc.iu) * (2500 / zoom)) + posi, (int) ((vc.ju * (2500 / zoom)) + posj));
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Programa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel X_label;
    private javax.swing.JLabel Y_label;
    private javax.swing.JLabel campo_label;
    private javax.swing.JTextField carga;
    private javax.swing.JLabel exit;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPSlider;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jPlano;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField radio_text;
    private javax.swing.JCheckBox sensor_box;
    private javax.swing.JComboBox<String> signo_box;
    private javax.swing.JLabel sliderIn;
    private javax.swing.JLabel sliderOut;
    private javax.swing.JPanel upPanel;
    private javax.swing.JTextField x_text;
    private javax.swing.JTextField y_text;
    // End of variables declaration//GEN-END:variables
}
