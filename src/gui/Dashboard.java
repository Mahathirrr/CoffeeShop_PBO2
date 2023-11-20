package gui;/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import app.CoffeeShopCalculator;
import menu.CoffeeShopItem;

import javax.swing.*;
import java.awt.*;
import java.awt.print.PrinterException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;

/**
 *
 * @author Muhammad Mahathir
 */
public class Dashboard extends javax.swing.JFrame {

    private double total = 0.0;
    private int x = 0;
    private double tax = 0.0;
    private CoffeeShopItem[] items;
    private final CoffeeShopCalculator calculator = new CoffeeShopCalculator();

    public Dashboard() {
        initComponents();
        init();
        setImage();
    }

    public void init() {
        setTime();
        items = new CoffeeShopItem[]{
                new CoffeeShopItem("Affogato", 20.0, "/images2/affogato.jpg", jLabelImage1),
                new CoffeeShopItem("Americano", 26.0, "/images2/americano.jpg", jLabelImage2),
                new CoffeeShopItem("Cappuccino", 22.0, "/images2/cappucino.jpg", jLabelImage3),
                new CoffeeShopItem("Cheesecake", 24.0, "/images2/cheesecake.jpg", jLabelImage4),
                new CoffeeShopItem("Croissant", 20.0, "/images2/croissant.jpg", jLabelImage5),
                new CoffeeShopItem("Egg Toast", 20.0, "/images2/eggtoast.jpg", jLabelImage6),
                new CoffeeShopItem("Espresso", 18.0, "/images2/espresso.JPG", jLabelImage7),
                new CoffeeShopItem("Iced Tea", 20.0, "/images2/icedtea.JPG", jLabelImage8),
                new CoffeeShopItem("Latte", 16.0, "/images2/latte.JPG", jLabelImage9),
                new CoffeeShopItem("Lemon Tea", 16.0, "/images2/lemontea.jpg", jLabelImage10),
                new CoffeeShopItem("Macchiato", 22.0, "/images2/macchiato.jpg", jLabelImage11),
                new CoffeeShopItem("Matcha", 20.0, "/images2/matcha.jpg", jLabelImage12),
                new CoffeeShopItem("Mineral Water", 8.0, "/images2/mineralwater.jpg", jLabelImage13),
                new CoffeeShopItem("Mocha", 24.0, "/images2/mocha.jpg", jLabelImage14),
                new CoffeeShopItem("Red Velvet Cake", 24.0, "/images2/redvelvetcake.jpg", jLabelImage15)
        };
    }
    public void setImage() {
        for (CoffeeShopItem item : items) {
            ImageIcon icon = item.getIcon();
            Image img = icon.getImage().getScaledInstance(item.getLabel().getWidth(), item.getLabel().getHeight(), Image.SCALE_SMOOTH);
            item.getLabel().setIcon(new ImageIcon(img));
        }
    }

    // Variables declaration - do not modify
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnReceipt;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnTotal;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JCheckBox jCheckBox11;
    private javax.swing.JCheckBox jCheckBox12;
    private javax.swing.JCheckBox jCheckBox13;
    private javax.swing.JCheckBox jCheckBox14;
    private javax.swing.JCheckBox jCheckBox15;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox9;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabelImage1;
    private javax.swing.JLabel jLabelImage10;
    private javax.swing.JLabel jLabelImage11;
    private javax.swing.JLabel jLabelImage12;
    private javax.swing.JLabel jLabelImage13;
    private javax.swing.JLabel jLabelImage14;
    private javax.swing.JLabel jLabelImage15;
    private javax.swing.JLabel jLabelImage2;
    private javax.swing.JLabel jLabelImage3;
    private javax.swing.JLabel jLabelImage4;
    private javax.swing.JLabel jLabelImage5;
    private javax.swing.JLabel jLabelImage6;
    private javax.swing.JLabel jLabelImage7;
    private javax.swing.JLabel jLabelImage8;
    private javax.swing.JLabel jLabelImage9;
    private javax.swing.JLabel jLabelProduk1;
    private javax.swing.JLabel jLabelProduk10;
    private javax.swing.JLabel jLabelProduk11;
    private javax.swing.JLabel jLabelProduk12;
    private javax.swing.JLabel jLabelProduk13;
    private javax.swing.JLabel jLabelProduk14;
    private javax.swing.JLabel jLabelProduk15;
    private javax.swing.JLabel jLabelProduk2;
    private javax.swing.JLabel jLabelProduk3;
    private javax.swing.JLabel jLabelProduk4;
    private javax.swing.JLabel jLabelProduk5;
    private javax.swing.JLabel jLabelProduk6;
    private javax.swing.JLabel jLabelProduk7;
    private javax.swing.JLabel jLabelProduk8;
    private javax.swing.JLabel jLabelProduk9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner10;
    private javax.swing.JSpinner jSpinner11;
    private javax.swing.JSpinner jSpinner12;
    private javax.swing.JSpinner jSpinner13;
    private javax.swing.JSpinner jSpinner14;
    private javax.swing.JSpinner jSpinner15;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JSpinner jSpinner3;
    private javax.swing.JSpinner jSpinner4;
    private javax.swing.JSpinner jSpinner5;
    private javax.swing.JSpinner jSpinner6;
    private javax.swing.JSpinner jSpinner7;
    private javax.swing.JSpinner jSpinner8;
    private javax.swing.JSpinner jSpinner9;
    private javax.swing.JTextArea jTextArea;
    private javax.swing.JTextField jTextFieldSubTotal;
    private javax.swing.JTextField jTextFieldTax;
    private javax.swing.JTextField jTextFieldTotal;
    private javax.swing.JLabel jTxtDate;
    private javax.swing.JLabel jTxtTime;
    // End of variables declaration

    public boolean qtyIsZero(int qty) {
        if (qty == 0) {
            JOptionPane.showMessageDialog(null, "Please increase the item quantity");
            return false;
        }
        return true;
    }

    public void reset() {
        total = 0.0;
        x = 0;
        tax = 0.0;
        btnTotal.setEnabled(false);
        jSpinner1.setValue(0);
        jSpinner2.setValue(0);
        jSpinner3.setValue(0);
        jSpinner4.setValue(0);
        jSpinner5.setValue(0);
        jSpinner6.setValue(0);
        jSpinner7.setValue(0);
        jSpinner8.setValue(0);
        jSpinner9.setValue(0);
        jSpinner10.setValue(0);
        jSpinner11.setValue(0);
        jSpinner12.setValue(0);
        jSpinner13.setValue(0);
        jSpinner14.setValue(0);
        jSpinner15.setValue(0);
        jTextFieldTax.setText("0.0");
        jTextFieldSubTotal.setText("0.0");
        jTextFieldTotal.setText("0.0");
        jTextArea.setText("");
        jCheckBox1.setSelected(false);
        jCheckBox2.setSelected(false);
        jCheckBox3.setSelected(false);
        jCheckBox4.setSelected(false);
        jCheckBox5.setSelected(false);
        jCheckBox6.setSelected(false);
        jCheckBox7.setSelected(false);
        jCheckBox8.setSelected(false);
        jCheckBox9.setSelected(false);
        jCheckBox10.setSelected(false);
        jCheckBox11.setSelected(false);
        jCheckBox12.setSelected(false);
        jCheckBox13.setSelected(false);
        jCheckBox14.setSelected(false);
        jCheckBox15.setSelected(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabelImage2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabelProduk2 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jSpinner2 = new javax.swing.JSpinner();
        jCheckBox2 = new javax.swing.JCheckBox();
        jPanel7 = new javax.swing.JPanel();
        jLabelImage1 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabelProduk1 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jCheckBox1 = new javax.swing.JCheckBox();
        jPanel9 = new javax.swing.JPanel();
        jLabelImage3 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabelProduk3 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jSpinner3 = new javax.swing.JSpinner();
        jCheckBox3 = new javax.swing.JCheckBox();
        jPanel10 = new javax.swing.JPanel();
        jLabelImage4 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabelProduk4 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jSpinner4 = new javax.swing.JSpinner();
        jCheckBox4 = new javax.swing.JCheckBox();
        jPanel11 = new javax.swing.JPanel();
        jLabelImage5 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabelProduk5 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jSpinner5 = new javax.swing.JSpinner();
        jCheckBox5 = new javax.swing.JCheckBox();
        jPanel12 = new javax.swing.JPanel();
        jLabelImage6 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabelProduk6 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jSpinner6 = new javax.swing.JSpinner();
        jCheckBox6 = new javax.swing.JCheckBox();
        jPanel13 = new javax.swing.JPanel();
        jLabelImage12 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabelProduk12 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jSpinner12 = new javax.swing.JSpinner();
        jCheckBox12 = new javax.swing.JCheckBox();
        jPanel14 = new javax.swing.JPanel();
        jLabelImage7 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabelProduk7 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jSpinner7 = new javax.swing.JSpinner();
        jCheckBox7 = new javax.swing.JCheckBox();
        jPanel15 = new javax.swing.JPanel();
        jLabelImage9 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabelProduk9 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jSpinner9 = new javax.swing.JSpinner();
        jCheckBox9 = new javax.swing.JCheckBox();
        jPanel16 = new javax.swing.JPanel();
        jLabelImage8 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jLabelProduk8 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jSpinner8 = new javax.swing.JSpinner();
        jCheckBox8 = new javax.swing.JCheckBox();
        jPanel17 = new javax.swing.JPanel();
        jLabelImage10 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jLabelProduk10 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jSpinner10 = new javax.swing.JSpinner();
        jCheckBox10 = new javax.swing.JCheckBox();
        jPanel18 = new javax.swing.JPanel();
        jLabelImage11 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        jLabelProduk11 = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        jSpinner11 = new javax.swing.JSpinner();
        jCheckBox11 = new javax.swing.JCheckBox();
        jPanel19 = new javax.swing.JPanel();
        jLabelImage13 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        jLabel111 = new javax.swing.JLabel();
        jLabel112 = new javax.swing.JLabel();
        jLabelProduk13 = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();
        jSpinner13 = new javax.swing.JSpinner();
        jCheckBox13 = new javax.swing.JCheckBox();
        jPanel20 = new javax.swing.JPanel();
        jLabelImage14 = new javax.swing.JLabel();
        jLabel117 = new javax.swing.JLabel();
        jLabel118 = new javax.swing.JLabel();
        jLabel119 = new javax.swing.JLabel();
        jLabelProduk14 = new javax.swing.JLabel();
        jLabel121 = new javax.swing.JLabel();
        jSpinner14 = new javax.swing.JSpinner();
        jCheckBox14 = new javax.swing.JCheckBox();
        jPanel21 = new javax.swing.JPanel();
        jLabelImage15 = new javax.swing.JLabel();
        jLabel124 = new javax.swing.JLabel();
        jLabel125 = new javax.swing.JLabel();
        jLabel126 = new javax.swing.JLabel();
        jLabelProduk15 = new javax.swing.JLabel();
        jLabel128 = new javax.swing.JLabel();
        jSpinner15 = new javax.swing.JSpinner();
        jCheckBox15 = new javax.swing.JCheckBox();
        jPanel4 = new javax.swing.JPanel();
        btnTotal = new javax.swing.JButton();
        btnReceipt = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea = new javax.swing.JTextArea();
        jTextFieldTax = new javax.swing.JTextField();
        jTextFieldSubTotal = new javax.swing.JTextField();
        jTextFieldTotal = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTxtDate = new javax.swing.JLabel();
        jTxtTime = new javax.swing.JLabel();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
                jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
                jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));

        jPanel2.setBackground(new java.awt.Color(240, 240, 240));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Potti Sreeramulu", 1, 25)); // NOI18N
        jLabel1.setText("Mahathir CoffeeShop");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(250, 250, 250));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));

        jLabel2.setFont(new java.awt.Font("Potti Sreeramulu", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Menu Items");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2));

        jLabel12.setFont(new java.awt.Font("Potti Sreeramulu", 0, 17)); // NOI18N
        jLabel12.setText("Price:");

        jLabel13.setFont(new java.awt.Font("Potti Sreeramulu", 0, 17)); // NOI18N
        jLabel13.setText("Quantity:");

        jLabel14.setFont(new java.awt.Font("Potti Sreeramulu", 0, 17)); // NOI18N
        jLabel14.setText("Purchase:");

        jLabelProduk2.setFont(new java.awt.Font("Potti Sreeramulu", 1, 20)); // NOI18N
        jLabelProduk2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelProduk2.setText("Americano");

        jLabel16.setFont(new java.awt.Font("Potti Sreeramulu", 0, 17)); // NOI18N
        jLabel16.setText("Rp.20K");

        jSpinner2.setFont(new java.awt.Font("Rasa Medium", 1, 16)); // NOI18N
        jSpinner2.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));

        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabelImage2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel14)
                                        .addComponent(jLabel13)
                                        .addComponent(jLabel12))
                                .addGap(47, 47, 47)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jCheckBox2)
                                        .addComponent(jLabel16)))
                        .addComponent(jLabelProduk2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabelImage2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelProduk2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel12)
                                        .addComponent(jLabel16))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel13)
                                        .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel14)
                                        .addComponent(jCheckBox2))
                                .addContainerGap())
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2));

        jLabel26.setFont(new java.awt.Font("Potti Sreeramulu", 0, 17)); // NOI18N
        jLabel26.setText("Price:");

        jLabel27.setFont(new java.awt.Font("Potti Sreeramulu", 0, 17)); // NOI18N
        jLabel27.setText("Quantity:");

        jLabel28.setFont(new java.awt.Font("Potti Sreeramulu", 0, 17)); // NOI18N
        jLabel28.setText("Purchase:");

        jLabelProduk1.setFont(new java.awt.Font("Potti Sreeramulu", 1, 20)); // NOI18N
        jLabelProduk1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelProduk1.setText("Affogato");

        jLabel30.setFont(new java.awt.Font("Potti Sreeramulu", 0, 17)); // NOI18N
        jLabel30.setText("Rp.26K");

        jSpinner1.setFont(new java.awt.Font("Rasa Medium", 1, 16)); // NOI18N
        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));

        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
                jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabelImage1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel7Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel28)
                                        .addComponent(jLabel27)
                                        .addComponent(jLabel26))
                                .addGap(47, 47, 47)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jCheckBox1)
                                        .addComponent(jLabel30)))
                        .addComponent(jLabelProduk1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
                jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabelImage1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelProduk1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel26)
                                        .addComponent(jLabel30))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel27)
                                        .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel28)
                                        .addComponent(jCheckBox1))
                                .addContainerGap())
        );

        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2));

        jLabel40.setFont(new java.awt.Font("Potti Sreeramulu", 0, 17)); // NOI18N
        jLabel40.setText("Price:");

        jLabel41.setFont(new java.awt.Font("Potti Sreeramulu", 0, 17)); // NOI18N
        jLabel41.setText("Quantity:");

        jLabel42.setFont(new java.awt.Font("Potti Sreeramulu", 0, 17)); // NOI18N
        jLabel42.setText("Purchase:");

        jLabelProduk3.setFont(new java.awt.Font("Potti Sreeramulu", 1, 20)); // NOI18N
        jLabelProduk3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelProduk3.setText("Cappucino");

        jLabel44.setFont(new java.awt.Font("Potti Sreeramulu", 0, 17)); // NOI18N
        jLabel44.setText("Rp.22K");

        jSpinner3.setFont(new java.awt.Font("Rasa Medium", 1, 16)); // NOI18N
        jSpinner3.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));

        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
                jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabelImage3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel9Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel42)
                                        .addComponent(jLabel41)
                                        .addComponent(jLabel40))
                                .addGap(47, 47, 47)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jCheckBox3)
                                        .addComponent(jLabel44)))
                        .addComponent(jLabelProduk3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
                jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabelImage3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelProduk3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel40)
                                        .addComponent(jLabel44))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel41)
                                        .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel42)
                                        .addComponent(jCheckBox3))
                                .addContainerGap())
        );

        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2));

        jLabel47.setFont(new java.awt.Font("Potti Sreeramulu", 0, 17)); // NOI18N
        jLabel47.setText("Price:");

        jLabel48.setFont(new java.awt.Font("Potti Sreeramulu", 0, 17)); // NOI18N
        jLabel48.setText("Quantity:");

        jLabel49.setFont(new java.awt.Font("Potti Sreeramulu", 0, 17)); // NOI18N
        jLabel49.setText("Purchase:");

        jLabelProduk4.setFont(new java.awt.Font("Potti Sreeramulu", 1, 20)); // NOI18N
        jLabelProduk4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelProduk4.setText("Cheese Cake");

        jLabel51.setFont(new java.awt.Font("Potti Sreeramulu", 0, 17)); // NOI18N
        jLabel51.setText("Rp.24K");

        jSpinner4.setFont(new java.awt.Font("Rasa Medium", 1, 16)); // NOI18N
        jSpinner4.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));

        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
                jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabelImage4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel10Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel49)
                                        .addComponent(jLabel48)
                                        .addComponent(jLabel47))
                                .addGap(47, 47, 47)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jSpinner4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jCheckBox4)
                                        .addComponent(jLabel51)))
                        .addComponent(jLabelProduk4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
                jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(jLabelImage4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelProduk4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel47)
                                        .addComponent(jLabel51))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel48)
                                        .addComponent(jSpinner4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel49)
                                        .addComponent(jCheckBox4))
                                .addContainerGap())
        );

        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2));

        jLabel54.setFont(new java.awt.Font("Potti Sreeramulu", 0, 17)); // NOI18N
        jLabel54.setText("Price:");

        jLabel55.setFont(new java.awt.Font("Potti Sreeramulu", 0, 17)); // NOI18N
        jLabel55.setText("Quantity:");

        jLabel56.setFont(new java.awt.Font("Potti Sreeramulu", 0, 17)); // NOI18N
        jLabel56.setText("Purchase:");

        jLabelProduk5.setFont(new java.awt.Font("Potti Sreeramulu", 1, 20)); // NOI18N
        jLabelProduk5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelProduk5.setText("Croissant");

        jLabel58.setFont(new java.awt.Font("Potti Sreeramulu", 0, 17)); // NOI18N
        jLabel58.setText("Rp.20K");

        jSpinner5.setFont(new java.awt.Font("Rasa Medium", 1, 16)); // NOI18N
        jSpinner5.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));

        jCheckBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
                jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabelImage5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel11Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel56)
                                        .addComponent(jLabel55)
                                        .addComponent(jLabel54))
                                .addGap(47, 47, 47)
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jSpinner5, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jCheckBox5)
                                        .addComponent(jLabel58)))
                        .addComponent(jLabelProduk5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
                jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(jLabelImage5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelProduk5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel54)
                                        .addComponent(jLabel58))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel55)
                                        .addComponent(jSpinner5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel56)
                                        .addComponent(jCheckBox5))
                                .addContainerGap())
        );

        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2));

        jLabel61.setFont(new java.awt.Font("Potti Sreeramulu", 0, 17)); // NOI18N
        jLabel61.setText("Price:");

        jLabel62.setFont(new java.awt.Font("Potti Sreeramulu", 0, 17)); // NOI18N
        jLabel62.setText("Quantity:");

        jLabel63.setFont(new java.awt.Font("Potti Sreeramulu", 0, 17)); // NOI18N
        jLabel63.setText("Purchase:");

        jLabelProduk6.setFont(new java.awt.Font("Potti Sreeramulu", 1, 20)); // NOI18N
        jLabelProduk6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelProduk6.setText("Egg Toast");

        jLabel65.setFont(new java.awt.Font("Potti Sreeramulu", 0, 17)); // NOI18N
        jLabel65.setText("Rp.20K");

        jSpinner6.setFont(new java.awt.Font("Rasa Medium", 1, 16)); // NOI18N
        jSpinner6.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));

        jCheckBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
                jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabelImage6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel12Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel63)
                                        .addComponent(jLabel62)
                                        .addComponent(jLabel61))
                                .addGap(47, 47, 47)
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jSpinner6, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jCheckBox6)
                                        .addComponent(jLabel65)))
                        .addComponent(jLabelProduk6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
                jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(jLabelImage6, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelProduk6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel61)
                                        .addComponent(jLabel65))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel62)
                                        .addComponent(jSpinner6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel63)
                                        .addComponent(jCheckBox6))
                                .addContainerGap())
        );

        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2));

        jLabel68.setFont(new java.awt.Font("Potti Sreeramulu", 0, 17)); // NOI18N
        jLabel68.setText("Price:");

        jLabel69.setFont(new java.awt.Font("Potti Sreeramulu", 0, 17)); // NOI18N
        jLabel69.setText("Quantity:");

        jLabel70.setFont(new java.awt.Font("Potti Sreeramulu", 0, 17)); // NOI18N
        jLabel70.setText("Purchase:");

        jLabelProduk12.setFont(new java.awt.Font("Potti Sreeramulu", 1, 20)); // NOI18N
        jLabelProduk12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelProduk12.setText("Matcha");

        jLabel72.setFont(new java.awt.Font("Potti Sreeramulu", 0, 17)); // NOI18N
        jLabel72.setText("Rp.22K");

        jSpinner12.setFont(new java.awt.Font("Rasa Medium", 1, 16)); // NOI18N
        jSpinner12.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));

        jCheckBox12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
                jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabelImage12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel13Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel70)
                                        .addComponent(jLabel69)
                                        .addComponent(jLabel68))
                                .addGap(47, 47, 47)
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jSpinner12, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jCheckBox12)
                                        .addComponent(jLabel72)))
                        .addComponent(jLabelProduk12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(    // <editor-fold defaultstate="collapsed" desc="Generated Code">

                jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel13Layout.createSequentialGroup()
                                .addComponent(jLabelImage12, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelProduk12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel68)
                                        .addComponent(jLabel72))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel69)
                                        .addComponent(jSpinner12, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel70)
                                        .addComponent(jCheckBox12))
                                .addContainerGap())
        );

        jPanel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2));

        jLabel75.setFont(new java.awt.Font("Potti Sreeramulu", 0, 17)); // NOI18N
        jLabel75.setText("Price:");

        jLabel76.setFont(new java.awt.Font("Potti Sreeramulu", 0, 17)); // NOI18N
        jLabel76.setText("Quantity:");

        jLabel77.setFont(new java.awt.Font("Potti Sreeramulu", 0, 17)); // NOI18N
        jLabel77.setText("Purchase:");

        jLabelProduk7.setFont(new java.awt.Font("Potti Sreeramulu", 1, 20)); // NOI18N
        jLabelProduk7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelProduk7.setText("Espresso");

        jLabel79.setFont(new java.awt.Font("Potti Sreeramulu", 0, 17)); // NOI18N
        jLabel79.setText("Rp.18K");

        jSpinner7.setFont(new java.awt.Font("Rasa Medium", 1, 16)); // NOI18N
        jSpinner7.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));

        jCheckBox7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
                jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabelImage7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel14Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel77)
                                        .addComponent(jLabel76)
                                        .addComponent(jLabel75))
                                .addGap(47, 47, 47)
                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jSpinner7, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jCheckBox7)
                                        .addComponent(jLabel79)))
                        .addComponent(jLabelProduk7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
                jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel14Layout.createSequentialGroup()
                                .addComponent(jLabelImage7, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelProduk7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel75)
                                        .addComponent(jLabel79))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel76)
                                        .addComponent(jSpinner7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel77)
                                        .addComponent(jCheckBox7))
                                .addContainerGap())
        );

        jPanel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2));

        jLabel82.setFont(new java.awt.Font("Potti Sreeramulu", 0, 17)); // NOI18N
        jLabel82.setText("Price:");

        jLabel83.setFont(new java.awt.Font("Potti Sreeramulu", 0, 17)); // NOI18N
        jLabel83.setText("Quantity:");

        jLabel84.setFont(new java.awt.Font("Potti Sreeramulu", 0, 17)); // NOI18N
        jLabel84.setText("Purchase:");

        jLabelProduk9.setFont(new java.awt.Font("Potti Sreeramulu", 1, 20)); // NOI18N
        jLabelProduk9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelProduk9.setText("Latte");

        jLabel86.setFont(new java.awt.Font("Potti Sreeramulu", 0, 17)); // NOI18N
        jLabel86.setText("Rp.20K");

        jSpinner9.setFont(new java.awt.Font("Rasa Medium", 1, 16)); // NOI18N
        jSpinner9.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));

        jCheckBox9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
                jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabelImage9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel15Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel84)
                                        .addComponent(jLabel83)
                                        .addComponent(jLabel82))
                                .addGap(47, 47, 47)
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jSpinner9, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jCheckBox9)
                                        .addComponent(jLabel86)))
                        .addComponent(jLabelProduk9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
                jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel15Layout.createSequentialGroup()
                                .addComponent(jLabelImage9, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelProduk9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel82)
                                        .addComponent(jLabel86))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel83)
                                        .addComponent(jSpinner9, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel84)
                                        .addComponent(jCheckBox9))
                                .addContainerGap())
        );

        jPanel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2));

        jLabel89.setFont(new java.awt.Font("Potti Sreeramulu", 0, 17)); // NOI18N
        jLabel89.setText("Price:");

        jLabel90.setFont(new java.awt.Font("Potti Sreeramulu", 0, 17)); // NOI18N
        jLabel90.setText("Quantity:");

        jLabel91.setFont(new java.awt.Font("Potti Sreeramulu", 0, 17)); // NOI18N
        jLabel91.setText("Purchase:");

        jLabelProduk8.setFont(new java.awt.Font("Potti Sreeramulu", 1, 20)); // NOI18N
        jLabelProduk8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelProduk8.setText("Iced Tea");

        jLabel93.setFont(new java.awt.Font("Potti Sreeramulu", 0, 17)); // NOI18N
        jLabel93.setText("Rp.16K");

        jSpinner8.setFont(new java.awt.Font("Rasa Medium", 1, 16)); // NOI18N
        jSpinner8.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));

        jCheckBox8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
                jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabelImage8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel16Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel91)
                                        .addComponent(jLabel90)
                                        .addComponent(jLabel89))
                                .addGap(47, 47, 47)
                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jSpinner8, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jCheckBox8)
                                        .addComponent(jLabel93)))
                        .addComponent(jLabelProduk8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
                jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel16Layout.createSequentialGroup()
                                .addComponent(jLabelImage8, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelProduk8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel89)
                                        .addComponent(jLabel93))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel90)
                                        .addComponent(jSpinner8, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel91)
                                        .addComponent(jCheckBox8))
                                .addContainerGap())
        );

        jPanel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2));

        jLabel96.setFont(new java.awt.Font("Potti Sreeramulu", 0, 17)); // NOI18N
        jLabel96.setText("Price:");

        jLabel97.setFont(new java.awt.Font("Potti Sreeramulu", 0, 17)); // NOI18N
        jLabel97.setText("Quantity:");

        jLabel98.setFont(new java.awt.Font("Potti Sreeramulu", 0, 17)); // NOI18N
        jLabel98.setText("Purchase:");

        jLabelProduk10.setFont(new java.awt.Font("Potti Sreeramulu", 1, 20)); // NOI18N
        jLabelProduk10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelProduk10.setText("Lemon Tea");

        jLabel100.setFont(new java.awt.Font("Potti Sreeramulu", 0, 17)); // NOI18N
        jLabel100.setText("Rp.16K");

        jSpinner10.setFont(new java.awt.Font("Rasa Medium", 1, 16)); // NOI18N
        jSpinner10.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));

        jCheckBox10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
                jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabelImage10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel17Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel98)
                                        .addComponent(jLabel97)
                                        .addComponent(jLabel96))
                                .addGap(47, 47, 47)
                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jSpinner10, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jCheckBox10)
                                        .addComponent(jLabel100)))
                        .addComponent(jLabelProduk10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
                jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel17Layout.createSequentialGroup()
                                .addComponent(jLabelImage10, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelProduk10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel96)
                                        .addComponent(jLabel100))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel97)
                                        .addComponent(jSpinner10, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel98)
                                        .addComponent(jCheckBox10))
                                .addContainerGap())
        );

        jPanel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2));

        jLabel103.setFont(new java.awt.Font("Potti Sreeramulu", 0, 17)); // NOI18N
        jLabel103.setText("Price:");

        jLabel104.setFont(new java.awt.Font("Potti Sreeramulu", 0, 17)); // NOI18N
        jLabel104.setText("Quantity:");

        jLabel105.setFont(new java.awt.Font("Potti Sreeramulu", 0, 17)); // NOI18N
        jLabel105.setText("Purchase:");

        jLabelProduk11.setFont(new java.awt.Font("Potti Sreeramulu", 1, 20)); // NOI18N
        jLabelProduk11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelProduk11.setText("Macchiato");

        jLabel107.setFont(new java.awt.Font("Potti Sreeramulu", 0, 17)); // NOI18N
        jLabel107.setText("Rp.20K");

        jSpinner11.setFont(new java.awt.Font("Rasa Medium", 1, 16)); // NOI18N
        jSpinner11.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));

        jCheckBox11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
                jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabelImage11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel18Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel105)
                                        .addComponent(jLabel104)
                                        .addComponent(jLabel103))
                                .addGap(47, 47, 47)
                                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jSpinner11, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jCheckBox11)
                                        .addComponent(jLabel107)))
                        .addComponent(jLabelProduk11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel18Layout.setVerticalGroup(
                jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel18Layout.createSequentialGroup()
                                .addComponent(jLabelImage11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelProduk11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel103)
                                        .addComponent(jLabel107))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel104)
                                        .addComponent(jSpinner11, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel105)
                                        .addComponent(jCheckBox11))
                                .addContainerGap())
        );

        jPanel19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2));

        jLabel110.setFont(new java.awt.Font("Potti Sreeramulu", 0, 17)); // NOI18N
        jLabel110.setText("Price:");

        jLabel111.setFont(new java.awt.Font("Potti Sreeramulu", 0, 17)); // NOI18N
        jLabel111.setText("Quantity:");

        jLabel112.setFont(new java.awt.Font("Potti Sreeramulu", 0, 17)); // NOI18N
        jLabel112.setText("Purchase:");

        jLabelProduk13.setFont(new java.awt.Font("Potti Sreeramulu", 1, 20)); // NOI18N
        jLabelProduk13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelProduk13.setText("Mineral Water");

        jLabel114.setFont(new java.awt.Font("Potti Sreeramulu", 0, 17)); // NOI18N
        jLabel114.setText("Rp.8K");

        jSpinner13.setFont(new java.awt.Font("Rasa Medium", 1, 16)); // NOI18N
        jSpinner13.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));

        jCheckBox13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox13ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
                jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabelImage13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel19Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel112)
                                        .addComponent(jLabel111)
                                        .addComponent(jLabel110))
                                .addGap(47, 47, 47)
                                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jSpinner13, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jCheckBox13)
                                        .addComponent(jLabel114)))
                        .addComponent(jLabelProduk13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel19Layout.setVerticalGroup(
                jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel19Layout.createSequentialGroup()
                                .addComponent(jLabelImage13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelProduk13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel110)
                                        .addComponent(jLabel114))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel111)
                                        .addComponent(jSpinner13, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel112)
                                        .addComponent(jCheckBox13))
                                .addContainerGap())
        );

        jPanel20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2));

        jLabel117.setFont(new java.awt.Font("Potti Sreeramulu", 0, 17)); // NOI18N
        jLabel117.setText("Price:");

        jLabel118.setFont(new java.awt.Font("Potti Sreeramulu", 0, 17)); // NOI18N
        jLabel118.setText("Quantity:");

        jLabel119.setFont(new java.awt.Font("Potti Sreeramulu", 0, 17)); // NOI18N
        jLabel119.setText("Purchase:");

        jLabelProduk14.setFont(new java.awt.Font("Potti Sreeramulu", 1, 20)); // NOI18N
        jLabelProduk14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelProduk14.setText("Mocha");

        jLabel121.setFont(new java.awt.Font("Potti Sreeramulu", 0, 17)); // NOI18N
        jLabel121.setText("Rp.24K");

        jSpinner14.setFont(new java.awt.Font("Rasa Medium", 1, 16)); // NOI18N
        jSpinner14.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));

        jCheckBox14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox14ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
                jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabelImage14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel20Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel119)
                                        .addComponent(jLabel118)
                                        .addComponent(jLabel117))
                                .addGap(47, 47, 47)
                                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jSpinner14, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jCheckBox14)
                                        .addComponent(jLabel121)))
                        .addComponent(jLabelProduk14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel20Layout.setVerticalGroup(
                jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel20Layout.createSequentialGroup()
                                .addComponent(jLabelImage14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelProduk14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel117)
                                        .addComponent(jLabel121))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel118)
                                        .addComponent(jSpinner14, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel119)
                                        .addComponent(jCheckBox14))
                                .addContainerGap())
        );

        jPanel21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2));

        jLabel124.setFont(new java.awt.Font("Potti Sreeramulu", 0, 17)); // NOI18N
        jLabel124.setText("Price:");

        jLabel125.setFont(new java.awt.Font("Potti Sreeramulu", 0, 17)); // NOI18N
        jLabel125.setText("Quantity:");

        jLabel126.setFont(new java.awt.Font("Potti Sreeramulu", 0, 17)); // NOI18N
        jLabel126.setText("Purchase:");

        jLabelProduk15.setFont(new java.awt.Font("Potti Sreeramulu", 1, 20)); // NOI18N
        jLabelProduk15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelProduk15.setText("RedVelvet Cake");

        jLabel128.setFont(new java.awt.Font("Potti Sreeramulu", 0, 17)); // NOI18N
        jLabel128.setText("Rp.24K");

        jSpinner15.setFont(new java.awt.Font("Rasa Medium", 1, 16)); // NOI18N
        jSpinner15.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));

        jCheckBox15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox15ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
                jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabelImage15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel21Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel126)
                                        .addComponent(jLabel125)
                                        .addComponent(jLabel124))
                                .addGap(47, 47, 47)
                                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jSpinner15, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jCheckBox15)
                                        .addComponent(jLabel128)))
                        .addComponent(jLabelProduk15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel21Layout.setVerticalGroup(
                jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel21Layout.createSequentialGroup()
                                .addComponent(jLabelImage15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelProduk15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel124)
                                        .addComponent(jLabel128))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel125)
                                        .addComponent(jSpinner15, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel126)
                                        .addComponent(jCheckBox15))
                                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(2, 2, 2)
                                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(12, 12, 12)
                                                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(12, 12, 12)
                                                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(8, 8, 8)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18))
        );

        jPanel4.setBackground(new java.awt.Color(250, 250, 250));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));

        btnTotal.setFont(new java.awt.Font("Potti Sreeramulu", 1, 24)); // NOI18N
        btnTotal.setText("Total");
        btnTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTotalActionPerformed(evt);
            }
        });

        btnReceipt.setFont(new java.awt.Font("Potti Sreeramulu", 1, 24)); // NOI18N
        btnReceipt.setText("Receipt");
        btnReceipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReceiptActionPerformed(evt);
            }
        });

        btnReset.setFont(new java.awt.Font("Potti Sreeramulu", 1, 24)); // NOI18N
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnExit.setFont(new java.awt.Font("Potti Sreeramulu", 1, 24)); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(btnTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnReceipt, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                                        .addComponent(btnReceipt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));

        jTextArea.setColumns(20);
        jTextArea.setRows(5);
        jScrollPane1.setViewportView(jTextArea);

        jTextFieldTax.setEditable(false);
        jTextFieldTax.setFont(new java.awt.Font("Rasa Medium", 1, 22)); // NOI18N
        jTextFieldTax.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldTax.setText("0.0");
        jTextFieldTax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTaxActionPerformed(evt);
            }
        });

        jTextFieldSubTotal.setEditable(false);
        jTextFieldSubTotal.setFont(new java.awt.Font("Rasa Medium", 1, 22)); // NOI18N
        jTextFieldSubTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldSubTotal.setText("0.0");

        jTextFieldTotal.setEditable(false);
        jTextFieldTotal.setFont(new java.awt.Font("Rasa Medium", 1, 22)); // NOI18N
        jTextFieldTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldTotal.setText("0.0");
        jTextFieldTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTotalActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Potti Sreeramulu", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Tax (K)");

        jLabel4.setFont(new java.awt.Font("Potti Sreeramulu", 1, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Sub Total (K)");

        jLabel5.setFont(new java.awt.Font("Potti Sreeramulu", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Total (K)");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
                jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextFieldTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextFieldSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextFieldTax, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(34, 34, 34))
        );
        jPanel6Layout.setVerticalGroup(
                jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextFieldTax, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextFieldSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextFieldTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTxtDate.setFont(new java.awt.Font("Potti Sreeramulu", 1, 21)); // NOI18N

        jTxtTime.setFont(new java.awt.Font("Potti Sreeramulu", 1, 21)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTxtTime, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTxtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTxtDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTxtTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>

    private void handleCheckBoxAction(javax.swing.JCheckBox checkBox, javax.swing.JSpinner spinner, javax.swing.JLabel label, int index) {
        int qty = Integer.parseInt(spinner.getValue().toString());
        if (qtyIsZero(qty) && checkBox.isSelected()) {
            x++;
            if (x == 1) {
                Mahathir_CoffeeShop();
            }
            double price = qty * items[index].getPrice();
            total += price;
            tax = calculator.calculateTax(total);
            jTextArea.setText(jTextArea.getText() + x + ". " + label.getText() + "\t\t\t" + String.format("%.2f", price) + "\n");
            dudate();
        } else {
            checkBox.setSelected(false);
        }
    }
    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {
        handleCheckBoxAction(jCheckBox1, jSpinner1, jLabelProduk1, 0);
    }
    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {
        handleCheckBoxAction(jCheckBox2, jSpinner2, jLabelProduk2, 1);
    }
    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {
        handleCheckBoxAction(jCheckBox3, jSpinner3, jLabelProduk3, 2);
    }

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {
        handleCheckBoxAction(jCheckBox4, jSpinner4, jLabelProduk4, 3);
    }

    private void jCheckBox5ActionPerformed(java.awt.event.ActionEvent evt) {
        handleCheckBoxAction(jCheckBox5, jSpinner5, jLabelProduk5, 4);
    }

    private void jCheckBox6ActionPerformed(java.awt.event.ActionEvent evt) {
        handleCheckBoxAction(jCheckBox6, jSpinner6, jLabelProduk6, 5);
    }

    private void jCheckBox7ActionPerformed(java.awt.event.ActionEvent evt) {
        handleCheckBoxAction(jCheckBox7, jSpinner7, jLabelProduk7, 6);
    }

    private void jCheckBox8ActionPerformed(java.awt.event.ActionEvent evt) {
        handleCheckBoxAction(jCheckBox8, jSpinner8, jLabelProduk8, 7);
    }

    private void jCheckBox9ActionPerformed(java.awt.event.ActionEvent evt) {
        handleCheckBoxAction(jCheckBox9, jSpinner9, jLabelProduk9, 8);
    }

    private void jCheckBox10ActionPerformed(java.awt.event.ActionEvent evt) {
        handleCheckBoxAction(jCheckBox10, jSpinner10, jLabelProduk10, 9);
    }

    private void jCheckBox11ActionPerformed(java.awt.event.ActionEvent evt) {
        handleCheckBoxAction(jCheckBox11, jSpinner11, jLabelProduk11, 10);
    }

    private void jCheckBox12ActionPerformed(java.awt.event.ActionEvent evt) {
        handleCheckBoxAction(jCheckBox12, jSpinner12, jLabelProduk12, 11);
    }

    private void jCheckBox13ActionPerformed(java.awt.event.ActionEvent evt) {
        handleCheckBoxAction(jCheckBox13, jSpinner13, jLabelProduk13, 12);
    }

    private void jCheckBox14ActionPerformed(java.awt.event.ActionEvent evt) {
        handleCheckBoxAction(jCheckBox14, jSpinner14, jLabelProduk14, 13);
    }

    private void jCheckBox15ActionPerformed(java.awt.event.ActionEvent evt) {
        handleCheckBoxAction(jCheckBox15, jSpinner15, jLabelProduk15, 14);
    }

    private void btnTotalActionPerformed(java.awt.event.ActionEvent evt) {
        if (total == 0.0) {
            JOptionPane.showMessageDialog(null, "You haven't selected any item");
        } else {
            jTextArea.setText(jTextArea.getText()
                    + "\n**********************************************************************\n"
                    + "Tax: \t\t\t" + tax + "\n"
                    + "Sub Total: \t\t\t" + total + "\n"
                    + "Total: \t\t\t" + (total + tax) + "\n\n"
                    + "\"**********************************************************************\n"
            );
            btnTotal.setEnabled(false);
        }
    }

    private void btnReceiptActionPerformed(java.awt.event.ActionEvent evt) {
        if (total != 0) {
            if (!btnTotal.isEnabled()) {
                try {
                    jTextArea.print();
                } catch (PrinterException ex) {
                    java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                JOptionPane.showMessageDialog(null, "First, you should calculate the total price");
            }

        } else {
            JOptionPane.showMessageDialog(null, "You haven't purchased any product");
        }
    }

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }

    private void jTextFieldTaxActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jTextFieldTotalActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {
        reset();
    }

    int xx, xy;
    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {
        xx = evt.getX();
        xy = evt.getY();
    }

    public void setTime() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    Date date = new Date();
                    SimpleDateFormat tf = new SimpleDateFormat("h:mm:ss aa");
                    SimpleDateFormat df = new SimpleDateFormat("EEEE, dd-MM-yyyy");
                    String time = tf.format(date);
                    jTxtTime.setText(time.split(" ")[0] + " " + time.split(" ")[1]);
                    jTxtDate.setText(df.format(date));
                }
            }
        }).start();
    }

    public void Mahathir_CoffeeShop() {
        int purchaseId = 15020 + (int) (Math.random() * 80800);
        jTextArea.setText("***************Mahathir CoffeeShop***************\n"
                + "Time: " + jTxtTime.getText() + " Date: " + jTxtDate.getText() + "\n"
                + "Purchase Id: " + purchaseId + "\n"
                + "****************************************************\n"
                + "Item Name:\t\t\t" + "Price(K)\n");
    }

    public void dudate() {
        jTextFieldTax.setText(String.valueOf(String.format("%.2f", tax)));
        jTextFieldSubTotal.setText(String.valueOf(String.format("%.2f", total)));
        jTextFieldTotal.setText(String.valueOf(String.format("%.2f", total + tax)));
    }

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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }
}
