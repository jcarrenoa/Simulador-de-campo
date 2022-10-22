package geoesxpofisica;

import com.sun.java.swing.plaf.windows.WindowsLookAndFeel;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JScrollBar;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Programa extends javax.swing.JFrame {

    public class Imagenes extends javax.swing.JPanel {

        public Imagenes() {
            this.setSize(1250, 90);
        }

        @Override
        public void paint(Graphics grafico) {
            Dimension height = getSize();
            ImageIcon Img = new ImageIcon(getClass().getResource("/Images/Panel-02.png"));
            grafico.drawImage(Img.getImage(), 0, 0, height.width, height.height, null);
            setOpaque(false);
            super.paintComponent(grafico);
        }
    }

    int pospx = 0, pospy = 0;
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
    boolean Sensoronoff = false;
    Help helpv = new Help();

    public Programa() {
        initComponents();
        setIconImage(getIconImage());
        Imagenes Imagenes = new Imagenes();
        PanelControl.add(Imagenes);
        jPSlider.setSize(0, 700);
        ScrollBarModificado spv = new ScrollBarModificado();
        spv.setForeground(new Color(84, 132, 144));
        spv.setOrientation(JScrollBar.VERTICAL);
        jPlano.setVerticalScrollBar(spv);
        ScrollBarModificado sph = new ScrollBarModificado();
        sph.setForeground(new Color(84, 132, 144));
        sph.setOrientation(JScrollBar.HORIZONTAL);
        jPlano.setHorizontalScrollBar(sph);
        this.setLocation(60, 30);
        this.timer.schedule(new RepeatedTask(), 203);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPSlider = new javax.swing.JPanel();
        sliderIn = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        X_label = new javax.swing.JLabel();
        Y_label = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        campo_label = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        XC_label = new javax.swing.JLabel();
        YC_label = new javax.swing.JLabel();
        V_label = new javax.swing.JLabel();
        eliminar_b = new javax.swing.JComboBox<>();
        eliminar_bu = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        sliderOut = new javax.swing.JLabel();
        Exit = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPlano = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        PanelControl = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        signo_box = new javax.swing.JComboBox<>();
        carga = new javax.swing.JTextField();
        x_text = new javax.swing.JTextField();
        y_text = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        radio_text = new javax.swing.JTextField();
        OnOff = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMaximumSize(new java.awt.Dimension(1250, 700));
        setMinimumSize(new java.awt.Dimension(1250, 700));
        setUndecorated(true);
        setResizable(false);
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
        sliderIn.setText("•••");
        sliderIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sliderInMouseClicked(evt);
            }
        });

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

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Carga:");

        XC_label.setForeground(new java.awt.Color(255, 255, 255));
        XC_label.setText("X: ---");

        YC_label.setForeground(new java.awt.Color(255, 255, 255));
        YC_label.setText("Y: ---");

        V_label.setForeground(new java.awt.Color(255, 255, 255));
        V_label.setText("Valor: ---");

        eliminar_b.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        eliminar_bu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/del-29.png"))); // NOI18N
        eliminar_bu.setBorderPainted(false);
        eliminar_bu.setContentAreaFilled(false);
        eliminar_bu.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/del-31.png"))); // NOI18N
        eliminar_bu.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/del-30.png"))); // NOI18N
        eliminar_bu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminar_buActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPSliderLayout = new javax.swing.GroupLayout(jPSlider);
        jPSlider.setLayout(jPSliderLayout);
        jPSliderLayout.setHorizontalGroup(
            jPSliderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPSliderLayout.createSequentialGroup()
                .addGroup(jPSliderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sliderIn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPSliderLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPSliderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(X_label)
                            .addComponent(Y_label)
                            .addComponent(jLabel7)
                            .addComponent(campo_label)
                            .addComponent(jLabel3)
                            .addComponent(XC_label)
                            .addComponent(YC_label)
                            .addComponent(V_label)))
                    .addGroup(jPSliderLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(eliminar_b, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPSliderLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(eliminar_bu, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addGap(27, 27, 27)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(XC_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(YC_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(V_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 243, Short.MAX_VALUE)
                .addComponent(eliminar_b, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(eliminar_bu, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84))
        );

        getContentPane().add(jPSlider, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 705));

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

        sliderOut.setForeground(new java.awt.Color(255, 255, 255));
        sliderOut.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sliderOut.setText("•••");
        sliderOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sliderOutMouseClicked(evt);
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

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Help-16.png"))); // NOI18N
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Help-17.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(sliderOut, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1145, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(sliderOut, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1250, -1));

        jPlano.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jPlano.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jPlano.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                jPlanoAncestorMoved(evt);
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(2500, 2500));
        jPanel1.setPreferredSize(new java.awt.Dimension(2500, 2500));
        jPanel1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                jPanel1AncestorMoved(evt);
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
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

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1250, 610));

        PanelControl.setBackground(new java.awt.Color(255, 255, 255));

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Exp-06.png"))); // NOI18N
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Exp-08.png"))); // NOI18N
        jButton3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Exp-07.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Add-09.png"))); // NOI18N
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Add-11.png"))); // NOI18N
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Add-10.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        signo_box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Negativa", "Positiva" }));

        carga.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cargaKeyTyped(evt);
            }
        });

        x_text.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                x_textKeyTyped(evt);
            }
        });

        y_text.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                y_textKeyTyped(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Zoom-03.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Zoom-05.png"))); // NOI18N
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Zoom-04.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        radio_text.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                radio_textKeyTyped(evt);
            }
        });

        OnOff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Botones-off12-on13-12.png"))); // NOI18N
        OnOff.setBorderPainted(false);
        OnOff.setContentAreaFilled(false);
        OnOff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OnOffActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelControlLayout = new javax.swing.GroupLayout(PanelControl);
        PanelControl.setLayout(PanelControlLayout);
        PanelControlLayout.setHorizontalGroup(
            PanelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelControlLayout.createSequentialGroup()
                .addGap(191, 191, 191)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(radio_text, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(x_text, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(y_text, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(signo_box, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(carga, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(OnOff, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        PanelControlLayout.setVerticalGroup(
            PanelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelControlLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(PanelControlLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(PanelControlLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(radio_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(PanelControlLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(PanelControlLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(x_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(PanelControlLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(y_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(PanelControlLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(signo_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(PanelControlLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(carga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(PanelControlLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(PanelControlLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(OnOff, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(PanelControl, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, 615, 1250, 90));

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
            if (tope > 0) {
                dibujarCampo();
            }
            for (int i = 0; i < tope; i++) {
                if (pos[i] != null) {
                    dibujarC(or + pos[i].x, or + pos[i].y, i, pos[i].positive);
                }
            }
        }
    }//GEN-LAST:event_jPanel1AncestorMoved

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (!jTextField1.getText().equals("")) {
            if (!jTextField1.getText().contains("-")) {
                jPanel1.repaint();
                zoom = Integer.parseInt(jTextField1.getText());
                or = zoom / 2;
                timer.schedule(new RepeatedTask(), 5);
            } else {
                JOptionPane.showMessageDialog(null, "No estan permitidos los valores negativos en este apartado. Por favor ingresar un valor valido", "VALOR INVALIDO", 0);
            }
            jTextField1.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "Por favor ingresar un valor valido", "VALOR INVALIDO", 0);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public class RepeatedTask extends TimerTask {

        @Override
        public void run() {
            dibujarL(2500, 2500, 0, zoom);
            if (tope > 0) {
                dibujarCampo();
            }
            for (int i = 0; i < tope; i++) {
                if (pos[i] != null) {
                    dibujarC(or + pos[i].x, or + pos[i].y, i, pos[i].positive);
                }
            }
        }
    }

    public class RepeatedTaskSensor extends TimerTask {

        @Override
        public void run() {
            dibujarL(2500, 2500, 0, zoom);
            if (tope > 0) {
                dibujarCampo();
                dibujarSensor();
            }
            for (int i = 0; i < tope; i++) {
                if (pos[i] != null) {
                    dibujarC(or + pos[i].x, or + pos[i].y, i, pos[i].positive);
                }
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
        if (!x_text.getText().equals("") && !y_text.getText().equals("") && !carga.getText().equals("") && signo_box.getSelectedIndex() != 0) {
            if (!carga.getText().contains("-")) {
                int x = Integer.parseInt(x_text.getText());
                int y = Integer.parseInt(y_text.getText());
                double charge = Double.parseDouble(carga.getText());
                carga q = new carga(x, -1 * y, charge, signo_box.getItemAt(signo_box.getSelectedIndex()));
                pos[tope] = q;
                if (tope == 0) {
                    eliminar_b.addItem("Todas las cargas");
                }
                eliminar_b.addItem("Carga #" + String.valueOf(tope));
                /*if (tope > 2) {
                    eliminar_b.addItem("Carga #" + String.valueOf(tope));
                } else {
                    eliminar_b.addItem("Carga #" + String.valueOf(tope));
                }*/
                tope++;
                jPanel1.repaint();
                timer.schedule(new RepeatedTask(), 30);
            } else {
                JOptionPane.showMessageDialog(null, "El signo de la carga se le asigna en el aparado signo. Por favor ingresar un valor valido", "VALOR INVALIDO", 0);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por favor ingresar un valor valido", "VALOR INVALIDO", 0);
        }
        x_text.setText("");
        y_text.setText("");
        signo_box.setSelectedIndex(0);
        carga.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (!radio_text.getText().equals("")) {
            if (!radio_text.getText().contains("-")) {
                radio = Integer.parseInt(radio_text.getText());
                jPanel1.repaint();
                timer.schedule(new RepeatedTask(), 5);
            } else {
                JOptionPane.showMessageDialog(null, "No estan permitidos los valores negativos en este apartado. Por favor ingresar un valor valido", "VALOR INVALIDO", 0);
            }
            radio_text.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "Por favor ingresar un valor valido", "VALOR INVALIDO", 0);
        }
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

    private void jPanel1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseMoved
        if (rewrite) {
            boolean hcarga = false;
            int i = 0;
            double x = (evt.getX() / (float) (2500 / zoom)) - (float) or, y = -1 * ((evt.getY() / (float) (2500 / zoom)) - (float) or);
            if (String.valueOf(x).contains("-")) {
                if (String.valueOf(x).length() > 5) {
                    X_label.setText("X: " + String.valueOf(x).substring(0, 5) + " m");
                } else {
                    X_label.setText("X: " + String.valueOf(x) + " m");
                }
            } else {
                if (String.valueOf(x).length() > 4) {
                    X_label.setText("X: " + String.valueOf(x).substring(0, 4) + " m");
                } else {
                    X_label.setText("X: " + String.valueOf(x) + " m");
                }
            }
            if (String.valueOf(y).contains("-")) {
                if (String.valueOf(y).length() > 5) {
                    Y_label.setText("Y: " + String.valueOf(y).substring(0, 5) + " m");
                } else {
                    Y_label.setText("Y: " + String.valueOf(y) + " m");
                }
            } else {
                if (String.valueOf(y).length() > 4) {
                    Y_label.setText("Y: " + String.valueOf(y).substring(0, 4) + " m");
                } else {
                    Y_label.setText("Y: " + String.valueOf(y) + " m");
                }
            }
            double campop = campo_m(x, y);
            if (String.valueOf(campop).length() > 4) {
                if (String.valueOf(campop).substring(3, 4).equals(".")) {
                    campo_label.setText("Intensidad: " + String.valueOf(campop).substring(0, 3) + " N/C");
                } else if (String.valueOf(campop).equals("Infinity")) {
                    campo_label.setText("Intensidad: " + String.valueOf(campop));
                } else {
                    campo_label.setText("Intensidad: " + String.valueOf(campop).substring(0, 4) + " N/C");
                }
            } else {
                campo_label.setText("Intensidad: " + String.valueOf(campop) + " N/C");
            }
            while (!hcarga && i < tope) {
                if (pos[i] != null) {
                    if ((pos[i].x + (double) radio / 2) > x && (pos[i].x - (double) radio / 2) < x) {
                        if ((-1 * pos[i].y + (double) radio / 2) > y && (-1 * pos[i].y - (double) radio / 2) < y) {
                            hcarga = true;
                        }
                    }
                }
                i++;
            }
            if (hcarga) {
                XC_label.setText("X: " + String.valueOf(pos[i - 1].x) + " m");
                YC_label.setText("Y: " + String.valueOf(-1 * pos[i - 1].y) + " m");
                V_label.setText("Valor: " + String.valueOf(pos[i - 1].charge) + " nC");
            } else {
                XC_label.setText("X: ---");
                YC_label.setText("Y: ---");
                V_label.setText("Valor: ---");
            }
        }
    }//GEN-LAST:event_jPanel1MouseMoved

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked

    }//GEN-LAST:event_jPanel1MouseClicked

    public double campo_m(double x, double y) {
        double campop = 0;
        for (int i = 0; i < tope; i++) {
            if (pos[i] != null) {
                campoP aux = new campoP(x, y, pos[i].x, -1 * pos[i].y, pos[i].charge, pos[i].positive, or, false);
                if (x < pos[i].x && y < -1 * pos[i].y) {
                    campop = campop - aux.campoe;
                } else {
                    campop = campop + aux.campoe;
                }
            }
        }
        if (campop < 0) {
            return -1 * campop;
        } else {
            return campop;
        }
    }

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        //jPanel1.repaint();
        pospx = evt.getX();
        pospy = evt.getY();
        if (tope > 0) {
            jPanel1.repaint();
            timer.schedule(new RepeatedTaskSensor(), 3);
        }
        //dibujarFlechas(iv, jv, unit, x, y);

    }//GEN-LAST:event_jPanel1MousePressed

    public void dibujarSensor() {
        if (Sensoronoff) {
            double x = (pospx / (float) (2500 / zoom)) - (float) or, y = -1 * ((pospy / (float) (2500 / zoom)) - (float) or);
            Graphics draw = jPanel1.getGraphics();
            Graphics2D draw2d = (Graphics2D) draw;
            double iv = 0, jv = 0;
            for (int i = 0; i < tope; i++) {
                campoP aux = new campoP(x, y, pos[i].x, -1 * pos[i].y, pos[i].charge, pos[i].positive, or, false);
                iv = iv + aux.i;
                jv = jv + aux.j;
            }
            draw2d.setStroke(new BasicStroke((float) 1.8));
            draw2d.drawLine(pospx, pospy, (int) ((iv + or + x) * (2500 / zoom)), -1 * (int) ((jv - or + y) * (2500 / zoom)));
            vectorU auxv = new vectorU(iv, jv);
            double unit = Math.sqrt(Math.pow(auxv.iu, 2) + Math.pow(auxv.ju, 2));
            //dibujarFlechas(iv, jv, unit, x, y);
        }
    }

    private void sliderInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sliderInMouseClicked
        if (sliderX == 180) {
            //jPSlider.setSize(180, 700);
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
                            jPSlider.setSize(i, 705);
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
            //jPSlider.setSize(0, 700);
            resize = true;
            Thread th = new Thread() {
                @Override
                public void run() {
                    try {
                        for (int i = 0; i <= 180; i++) {
                            Thread.sleep(1);
                            jPlano.repaint();
                            jPSlider.setSize(i, 705);
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
            XC_label.setText("X: ---");
            YC_label.setText("Y: ---");
            V_label.setText("Valor: ---");
        }
    }//GEN-LAST:event_jPanel1MouseExited

    private void OnOffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OnOffActionPerformed
        Sensoronoff = !Sensoronoff;
        if (Sensoronoff) {
            OnOff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Botones-off12-on13-13.png")));
        } else {
            OnOff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Botones-off12-on13-12.png")));
        }
    }//GEN-LAST:event_OnOffActionPerformed

    private void radio_textKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_radio_textKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_radio_textKeyTyped

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        helpv.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_jTextField1KeyTyped

    private void x_textKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_x_textKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_x_textKeyTyped

    private void y_textKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_y_textKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_y_textKeyTyped

    private void cargaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cargaKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_cargaKeyTyped

    private void eliminar_buActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminar_buActionPerformed
        if (eliminar_b.getItemAt(eliminar_b.getSelectedIndex()).equals("Todas las cargas")) {
            for (int i = 0; i < tope; i++) {
                pos[i] = null;
            }
            tope = 0;
            jPanel1.repaint();
            timer.schedule(new RepeatedTask(), 2);
            eliminar_b.removeAllItems();
            eliminar_b.addItem(" ");
        } else if (!eliminar_b.getItemAt(eliminar_b.getSelectedIndex()).equals(" ")) {
            int numCarga = Integer.parseInt(eliminar_b.getItemAt(eliminar_b.getSelectedIndex()).substring(7, eliminar_b.getItemAt(eliminar_b.getSelectedIndex()).length()));
            pos[numCarga] = null;
            eliminar_b.removeItemAt(eliminar_b.getSelectedIndex());
            jPanel1.repaint();
            timer.schedule(new RepeatedTask(), 30);
        }
    }//GEN-LAST:event_eliminar_buActionPerformed

    public void dibujarC(int x, int y, int i, boolean signo) {
        Graphics draw = jPanel1.getGraphics();
        if (signo) {
            draw.setColor(Color.RED);
        } else {
            draw.setColor(Color.BLUE);
        }
        draw.fillOval(((2500 / zoom) * x) - ((2500 / zoom) / 2) * radio, ((2500 / zoom) * y) - ((2500 / zoom) / 2) * radio, (2500 / zoom) * radio, (2500 / zoom) * radio);
        draw.setColor(Color.BLACK);
        draw.drawOval(((2500 / zoom) * x) - ((2500 / zoom) / 2) * radio, ((2500 / zoom) * y) - ((2500 / zoom) / 2) * radio, (2500 / zoom) * radio, (2500 / zoom) * radio);
        draw.setFont(new Font("Tahoma", Font.BOLD, 15));
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
        Graphics2D draw2d = (Graphics2D) draw;
        for (int i = 1; i <= zoom; i++) {
            for (int j = 1; j <= zoom; j++) {
                double it = 0, jt = 0;
                int z = 0;
                while (z != tope) {
                    if (pos[z] != null) {
                        campoP aux = new campoP(i * (2500 / zoom), j * (2500 / zoom), (pos[z].x + or) * (2500 / zoom), (pos[z].y + or) * (2500 / zoom), pos[z].charge, pos[z].positive, or, false);
                        it = it + aux.i;
                        jt = jt + aux.j;
                    }
                    z++;
                }
                vectorU vc = new vectorU(it, jt);
                int posi = i * (2500 / zoom), posj = j * (2500 / zoom);
                //draw2d.setStroke(new BasicStroke((float) 1.3));
                draw2d.setColor(new Color(131, 0, 234));
                draw2d.drawLine(posi, posj, (int) ((vc.iu) * (2500 / zoom)) + posi, (int) ((vc.ju * (2500 / zoom)) + posj));
            }
        }
    }

    public void dibujarFlechas(double x, double y, double h, double xi, double yi) {
        Graphics g = jPanel1.getGraphics();
        Graphics2D g2d = (Graphics2D) g;
        double angulo = Math.atan(y / x);
        double delta = Math.PI / 4;
        double norma = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        double k = 1 / h;
        //double a = x / norma;
        //double b = y / norma;
        //double a = Math.sin(angulo) * h;
        //double b = Math.cos(angulo) * h;
        double a = Math.sqrt(Math.pow(h, 2) / (1 + Math.pow(Math.tan(angulo), 2)));
        double b = Math.sqrt(Math.pow(h, 2) - Math.pow(a, 2));
        //double a = (x / h);
        //double b = (y / h);
        double xph = a * Math.cos(delta) + b * Math.sin(delta);
        double yph = (-1 * (a * Math.sin(delta))) + b * Math.cos(delta);
        double xpa = a * Math.cos(delta) + (-1 * (b * Math.sin(delta)));
        double ypa = a * Math.sin(delta) + b * Math.cos(delta);
        double xf = ((x + or + xi) * (2500 / zoom));
        double yf = -1 * ((y - or + yi) * (2500 / zoom));
        //double x1 = (((xph + or + xi) + ((x + or) - (xph + or + xi))) * (2500 / zoom));
        //double y1 = (-1 * ((yph - or + yi) + (yph - or + yi) + (or + y - yi)) * (2500 / zoom));
        double x1 = ((xph + or + xi) * (2500 / zoom));
        double y1 = (-1 * (yph - or + yi) * (2500 / zoom));
        //g2d.drawLine((int)((x + or + xi) * (2500 / zoom)), -1 * (int)((y - or + yi) * (2500 / zoom)), (int) ((xph + or + xi) * (2500 / zoom)), -1  * (int) ((yph - or + yi) * (2500 / zoom)));
        g2d.drawLine((int) ((x + or + xi) * (2500 / zoom)), -1 * (int) ((y - or + yi) * (2500 / zoom)), (int) ((xpa + or + xi) * (2500 / zoom)), -1 * (int) ((ypa - or + yi) * (2500 / zoom)));
        //g2d.drawLine((int) xf, (int) yf, (int) ((xpa + or + xi) * (2500 / zoom)), -1  * (int) ((ypa - or + yi) * (2500 / zoom)));
        g2d.drawLine((int) xf, (int) yf, (int) (x1), (int) (y1));
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel(new WindowsLookAndFeel());
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(Programa.class.getName()).log(Level.SEVERE, null, ex);
                }
                new Programa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Exit;
    private javax.swing.JButton OnOff;
    private javax.swing.JPanel PanelControl;
    private javax.swing.JLabel V_label;
    private javax.swing.JLabel XC_label;
    private javax.swing.JLabel X_label;
    private javax.swing.JLabel YC_label;
    private javax.swing.JLabel Y_label;
    private javax.swing.JLabel campo_label;
    private javax.swing.JTextField carga;
    private javax.swing.JComboBox<String> eliminar_b;
    private javax.swing.JButton eliminar_bu;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPSlider;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jPlano;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField radio_text;
    private javax.swing.JComboBox<String> signo_box;
    private javax.swing.JLabel sliderIn;
    private javax.swing.JLabel sliderOut;
    private javax.swing.JTextField x_text;
    private javax.swing.JTextField y_text;
    // End of variables declaration//GEN-END:variables
}
