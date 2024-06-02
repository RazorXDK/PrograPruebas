/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gt.edu.umg.Ventanas;

import java.awt.BorderLayout;
import java.awt.Color;

/**
 *
 * @author rober
 */
public class ventanaMenu extends javax.swing.JFrame {

    /**
     * Creates new form ventanaMenu
     */
    int xMouse, yMouse;

    int ventaH = 660;
    int ventaV = 480;

    public ventanaMenu() {
        initComponents();

        content.setBackground(new Color(239, 244, 249));

        Home pl = new Home();
        pl.setSize(ventaH, ventaV);
        pl.setLocation(0, 0);

        content.removeAll();
        content.add(pl, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        menu = new javax.swing.JPanel();
        buttonArbolesB = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        Ico1 = new javax.swing.JLabel();
        buton2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        Ico2 = new javax.swing.JLabel();
        buton3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        Ico3 = new javax.swing.JLabel();
        buton4 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        Ico4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Home = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        Ico9 = new javax.swing.JLabel();
        Home2 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        Ico11 = new javax.swing.JLabel();
        Header = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        SizeY = new javax.swing.JPanel();
        content = new javax.swing.JPanel();
        Info = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        InfoB = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        Ico6 = new javax.swing.JLabel();
        Ico5 = new javax.swing.JLabel();
        Ico7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(720, 720));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Background.setBackground(new java.awt.Color(239, 244, 249));
        Background.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        Background.setPreferredSize(new java.awt.Dimension(720, 720));
        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Roboto", 0, 8)); // NOI18N
        jLabel13.setText("V 1.0");
        Background.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 540, -1, -1));

        menu.setBackground(new java.awt.Color(250, 252, 253));
        menu.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        buttonArbolesB.setBackground(new java.awt.Color(250, 252, 253));
        buttonArbolesB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonArbolesBMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonArbolesBMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonArbolesBMouseExited(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel7.setText("Arboles Binarios");

        Ico1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/tree.png"))); // NOI18N

        javax.swing.GroupLayout buttonArbolesBLayout = new javax.swing.GroupLayout(buttonArbolesB);
        buttonArbolesB.setLayout(buttonArbolesBLayout);
        buttonArbolesBLayout.setHorizontalGroup(
            buttonArbolesBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonArbolesBLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Ico1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
        );
        buttonArbolesBLayout.setVerticalGroup(
            buttonArbolesBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonArbolesBLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(buttonArbolesBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(Ico1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addContainerGap())
        );

        buton2.setBackground(new java.awt.Color(250, 252, 253));
        buton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buton2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buton2MouseExited(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel9.setText("Arbol AVL");

        Ico2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/nodo.png"))); // NOI18N

        javax.swing.GroupLayout buton2Layout = new javax.swing.GroupLayout(buton2);
        buton2.setLayout(buton2Layout);
        buton2Layout.setHorizontalGroup(
            buton2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buton2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(Ico2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        buton2Layout.setVerticalGroup(
            buton2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buton2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(buton2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Ico2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        buton3.setBackground(new java.awt.Color(250, 252, 253));
        buton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buton3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buton3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buton3MouseExited(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel10.setText("Administracion de Memoria");

        Ico3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/terminal.png"))); // NOI18N
        Ico3.setToolTipText("");

        javax.swing.GroupLayout buton3Layout = new javax.swing.GroupLayout(buton3);
        buton3.setLayout(buton3Layout);
        buton3Layout.setHorizontalGroup(
            buton3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buton3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(Ico3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        buton3Layout.setVerticalGroup(
            buton3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Ico3, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buton3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        buton4.setBackground(new java.awt.Color(250, 252, 253));
        buton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buton4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buton4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buton4MouseExited(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel14.setText("Salir");

        Ico4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/exit.png"))); // NOI18N

        javax.swing.GroupLayout buton4Layout = new javax.swing.GroupLayout(buton4);
        buton4.setLayout(buton4Layout);
        buton4Layout.setHorizontalGroup(
            buton4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buton4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(Ico4, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );
        buton4Layout.setVerticalGroup(
            buton4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buton4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(buton4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Ico4, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel1.setText("Entregable 2");

        Home.setBackground(new java.awt.Color(250, 252, 253));
        Home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HomeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                HomeMouseExited(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel12.setText("Home");

        Ico9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/home.png"))); // NOI18N

        javax.swing.GroupLayout HomeLayout = new javax.swing.GroupLayout(Home);
        Home.setLayout(HomeLayout);
        HomeLayout.setHorizontalGroup(
            HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Ico9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
        );
        HomeLayout.setVerticalGroup(
            HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(Ico9, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addContainerGap())
        );

        Home2.setBackground(new java.awt.Color(250, 252, 253));
        Home2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Home2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Home2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Home2MouseExited(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel16.setText("PG4 Admin");

        Ico11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/database.png"))); // NOI18N

        javax.swing.GroupLayout Home2Layout = new javax.swing.GroupLayout(Home2);
        Home2.setLayout(Home2Layout);
        Home2Layout.setHorizontalGroup(
            Home2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Home2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Ico11, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
        );
        Home2Layout.setVerticalGroup(
            Home2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Home2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Home2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(Ico11, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buttonArbolesB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(buton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(buton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(buton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(Home, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Home2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Home, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Home2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(buttonArbolesB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Background.add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 250, 350));

        Header.setBackground(new java.awt.Color(239, 244, 249));
        Header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                HeaderMouseDragged(evt);
            }
        });
        Header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                HeaderMousePressed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/close.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderLayout.createSequentialGroup()
                .addContainerGap(996, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(20, 20, 20))
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        Background.add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1040, 40));

        SizeY.setBackground(new java.awt.Color(239, 244, 249));

        javax.swing.GroupLayout SizeYLayout = new javax.swing.GroupLayout(SizeY);
        SizeY.setLayout(SizeYLayout);
        SizeYLayout.setHorizontalGroup(
            SizeYLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        SizeYLayout.setVerticalGroup(
            SizeYLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
        );

        Background.add(SizeY, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 30, 560));

        content.setBackground(new java.awt.Color(255, 153, 153));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 660, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );

        Background.add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, 660, 480));

        Info.setBackground(new java.awt.Color(250, 252, 253));
        Info.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel2.setText("Grupo 2");

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel3.setText("Programacion 3");

        InfoB.setBackground(new java.awt.Color(250, 252, 253));
        InfoB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        InfoB.setForeground(new java.awt.Color(244, 247, 249));
        InfoB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InfoBMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                InfoBMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                InfoBMouseExited(evt);
            }
        });

        jLabel11.setText("Informacion");

        javax.swing.GroupLayout InfoBLayout = new javax.swing.GroupLayout(InfoB);
        InfoB.setLayout(InfoBLayout);
        InfoBLayout.setHorizontalGroup(
            InfoBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InfoBLayout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(26, 26, 26))
        );
        InfoBLayout.setVerticalGroup(
            InfoBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InfoBLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                .addContainerGap())
        );

        Ico6.setBackground(new java.awt.Color(153, 255, 255));
        Ico6.setForeground(new java.awt.Color(204, 204, 204));
        Ico6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/database.png"))); // NOI18N

        Ico5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/deployed.png"))); // NOI18N

        Ico7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/javascript.png"))); // NOI18N

        javax.swing.GroupLayout InfoLayout = new javax.swing.GroupLayout(Info);
        Info.setLayout(InfoLayout);
        InfoLayout.setHorizontalGroup(
            InfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InfoLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(InfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(InfoLayout.createSequentialGroup()
                        .addGroup(InfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(InfoLayout.createSequentialGroup()
                                .addComponent(Ico5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Ico6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Ico7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(InfoB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 75, Short.MAX_VALUE)))
                .addContainerGap())
        );
        InfoLayout.setVerticalGroup(
            InfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InfoLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(InfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Ico7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Ico5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Ico6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(InfoB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Background.add(Info, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, 250, -1));

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel6.setText("PROGRAMACIÓN III - 12024-6691-022-A");
        Background.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 60, 240, -1));

        jLabel8.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel8.setText("Curso");
        Background.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, -1));

        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void InfoBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InfoBMouseClicked
        Page1 pl = new Page1();
        pl.setSize(ventaH, ventaV);
        pl.setLocation(0, 0);

        content.removeAll();
        content.add(pl, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();

// TODO add your handling code here:
    }//GEN-LAST:event_InfoBMouseClicked

    private void InfoBMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InfoBMouseEntered
        InfoB.setBackground(new Color(194, 231, 255));   // TODO add your handling code here:
    }//GEN-LAST:event_InfoBMouseEntered

    private void InfoBMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InfoBMouseExited
        InfoB.setBackground(new Color(250, 252, 253));
        // TODO add your handling code here:
    }//GEN-LAST:event_InfoBMouseExited

    private void buton3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buton3MouseExited
        buton3.setBackground(new Color(250, 252, 253));
    }//GEN-LAST:event_buton3MouseExited

    private void buton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buton3MouseEntered
        buton3.setBackground(new Color(194, 231, 255));
    }//GEN-LAST:event_buton3MouseEntered

    private void buton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buton2MouseExited
        buton2.setBackground(new Color(250, 252, 253));
    }//GEN-LAST:event_buton2MouseExited

    private void buton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buton2MouseEntered
        buton2.setBackground(new Color(194, 231, 255));
    }//GEN-LAST:event_buton2MouseEntered

    private void buttonArbolesBMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonArbolesBMouseExited
        buttonArbolesB.setBackground(new Color(250, 252, 253));
    }//GEN-LAST:event_buttonArbolesBMouseExited

    private void buttonArbolesBMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonArbolesBMouseEntered
        buttonArbolesB.setBackground(new Color(194, 231, 255));
    }//GEN-LAST:event_buttonArbolesBMouseEntered

    private void buttonArbolesBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonArbolesBMouseClicked
        ArbolBinario pl = new ArbolBinario();
        pl.setSize(ventaH, ventaV);
        pl.setLocation(0, 0);

        content.removeAll();
        content.add(pl, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();

        // TODO add your handling code here:
    }//GEN-LAST:event_buttonArbolesBMouseClicked

    private void buton4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buton4MouseEntered
        // TODO add your handling code here:
        buton4.setBackground(new Color(194, 231, 255));
    }//GEN-LAST:event_buton4MouseEntered

    private void buton4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buton4MouseExited
        // TODO add your handling code here:
        buton4.setBackground(new Color(250, 252, 253));

    }//GEN-LAST:event_buton4MouseExited

    private void buton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buton4MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_buton4MouseClicked

    private void buton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buton2MouseClicked
        // TODO add your handling code here:
        Page2 pl = new Page2();
        pl.setSize(ventaH, ventaV);
        pl.setLocation(0, 0);

        content.removeAll();
        content.add(pl, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();


    }//GEN-LAST:event_buton2MouseClicked

    private void buton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buton3MouseClicked
        // TODO add your handling code here:

        Page3 pl = new Page3();
        pl.setSize(ventaH, ventaV);
        pl.setLocation(0, 0);

        content.removeAll();
        content.add(pl, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_buton3MouseClicked

    private void HeaderMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderMousePressed
        // TODO add your handling code here:
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_HeaderMousePressed

    private void HeaderMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderMouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_HeaderMouseDragged

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseClicked
        // TODO add your handling code here:
        Home pl = new Home();
        pl.setSize(560, 480);
        pl.setLocation(0, 0);

        content.removeAll();
        content.add(pl, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_HomeMouseClicked

    private void HomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseEntered
        // TODO add your handling code here:

        Home.setBackground(new Color(194, 231, 255));

    }//GEN-LAST:event_HomeMouseEntered

    private void HomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseExited
        // TODO add your handling code here:
        Home.setBackground(new Color(250, 252, 253));

    }//GEN-LAST:event_HomeMouseExited

    private void Home2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Home2MouseClicked
        // TODO add your handling code here:
                Page4 pl = new Page4();
        pl.setSize(ventaH, ventaV);
        pl.setLocation(0, 0);

        content.removeAll();
        content.add(pl, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_Home2MouseClicked

    private void Home2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Home2MouseEntered
        // TODO add your handling code here:
        Home2.setBackground(new Color(194, 231, 255));
    }//GEN-LAST:event_Home2MouseEntered

    private void Home2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Home2MouseExited
        // TODO add your handling code here:
         Home2.setBackground(new Color(250, 252, 253));
    }//GEN-LAST:event_Home2MouseExited

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
            java.util.logging.Logger.getLogger(ventanaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JPanel Header;
    private javax.swing.JPanel Home;
    private javax.swing.JPanel Home2;
    private javax.swing.JLabel Ico1;
    private javax.swing.JLabel Ico11;
    private javax.swing.JLabel Ico2;
    private javax.swing.JLabel Ico3;
    public javax.swing.JLabel Ico4;
    private javax.swing.JLabel Ico5;
    private javax.swing.JLabel Ico6;
    private javax.swing.JLabel Ico7;
    private javax.swing.JLabel Ico9;
    private javax.swing.JPanel Info;
    private javax.swing.JPanel InfoB;
    private javax.swing.JPanel SizeY;
    private javax.swing.JPanel buton2;
    private javax.swing.JPanel buton3;
    private javax.swing.JPanel buton4;
    private javax.swing.JPanel buttonArbolesB;
    private javax.swing.JPanel content;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel menu;
    // End of variables declaration//GEN-END:variables
}
