/*          Develob By : Bushra Aboubida Ahmed          */ 
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import java.awt.Image;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO; 

public class ResturandWindow extends javax.swing.JFrame {
    
    int chickenNum , meatNum , waterNum , juiceNum;
    double chickenPrice , meatPrice , waterPrice , juicePrice;
    final double CHICKEN_COST = 20.0 , MEAT_COST = 10.0 , WATER_COST = 2.0 , JUICE_COST = 5.0 ;
    double subtotal , total , vat;
    int customerCounter;
    
    PrintWriter output;
   
    public ResturandWindow() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        chickenPriceLable = new javax.swing.JLabel();
        meatPriceLable = new javax.swing.JLabel();
        chickenCounter = new javax.swing.JSpinner();
        meatCounter = new javax.swing.JSpinner();
        chickenChees = new javax.swing.JCheckBox();
        meatChees = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        waterPriceLable = new javax.swing.JLabel();
        juicePriceLable = new javax.swing.JLabel();
        waterCounter = new javax.swing.JSpinner();
        juiceCounter = new javax.swing.JSpinner();
        jPanel3 = new javax.swing.JPanel();
        subtotalLable = new javax.swing.JLabel();
        vatLable = new javax.swing.JLabel();
        totalLable = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        calculateBill = new javax.swing.JButton();
        newBill = new javax.swing.JButton();
        saveBill = new javax.swing.JButton();
        customerCounterLable = new javax.swing.JLabel();
        Exit = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("مطعم شاورما");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel1.setText("نظام ادارة المطاعم");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("تطوير شركة بشري للبرمجيات نسخة 1.0 ");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "المأكولات", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 20))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel3.setText("شاورمة دجاج");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel4.setText("شاورمة لحم");

        chickenPriceLable.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        chickenPriceLable.setText("0.0 جنيه");

        meatPriceLable.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        meatPriceLable.setText("0.0 جنيه");

        chickenCounter.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        chickenCounter.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        chickenCounter.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                chickenCounterStateChanged(evt);
            }
        });

        meatCounter.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        meatCounter.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        meatCounter.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                meatCounterStateChanged(evt);
            }
        });

        chickenChees.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        chickenChees.setText("بالجبنة");
        chickenChees.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chickenChees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chickenCheesActionPerformed(evt);
            }
        });

        meatChees.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        meatChees.setText("بالجبنة");
        meatChees.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        meatChees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meatCheesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(meatPriceLable)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(meatChees)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(meatCounter, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4))
                    .addComponent(chickenPriceLable)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(chickenChees)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chickenCounter, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)))
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(chickenCounter, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chickenChees))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chickenPriceLable)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(meatCounter, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(meatChees))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(meatPriceLable)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "المشروبات", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 20))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel7.setText("ماء");

        jLabel8.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel8.setText("عصير");

        waterPriceLable.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        waterPriceLable.setText("0.0 جنيه");

        juicePriceLable.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        juicePriceLable.setText("0.0 جنيه");

        waterCounter.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        waterCounter.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        waterCounter.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                waterCounterStateChanged(evt);
            }
        });

        juiceCounter.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        juiceCounter.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        juiceCounter.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                juiceCounterStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(juiceCounter, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8))
                    .addComponent(juicePriceLable))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(waterCounter, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7))
                    .addComponent(waterPriceLable))
                .addGap(33, 33, 33))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(waterCounter, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(juiceCounter, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(waterPriceLable)
                    .addComponent(juicePriceLable))
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "الحساب", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 20))); // NOI18N

        subtotalLable.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        subtotalLable.setText("المجموع: 0.0 جنيه");

        vatLable.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        vatLable.setText("الضريبة: 0.0 جنيه");

        totalLable.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        totalLable.setText("الاجمالي: 0.0 جنيه");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalLable, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(vatLable, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(subtotalLable, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(40, 40, 40))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(subtotalLable)
                .addGap(18, 18, 18)
                .addComponent(vatLable)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(totalLable)
                .addGap(25, 25, 25))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "خيارات", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 20))); // NOI18N

        calculateBill.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        calculateBill.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/accept_page.png"))); // NOI18N
        calculateBill.setText("الحساب");
        calculateBill.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        calculateBill.setMargin(new java.awt.Insets(2, 2, 2, 2));
        calculateBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateBillActionPerformed(evt);
            }
        });

        newBill.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        newBill.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/full_page.png"))); // NOI18N
        newBill.setText("فاتورة جديدة");
        newBill.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        newBill.setMargin(new java.awt.Insets(2, 2, 2, 2));
        newBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newBillActionPerformed(evt);
            }
        });

        saveBill.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        saveBill.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/add_page.png"))); // NOI18N
        saveBill.setText("حفظ الفاتورة");
        saveBill.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        saveBill.setMargin(new java.awt.Insets(2, 2, 2, 2));
        saveBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBillActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(calculateBill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(newBill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(saveBill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(calculateBill, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newBill, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saveBill, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        customerCounterLable.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        customerCounterLable.setText("رقم الفاتورة : 0");

        Exit.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/block.png"))); // NOI18N
        Exit.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Exit.setIconTextGap(2);
        Exit.setMargin(new java.awt.Insets(1, 1, 1, 1));
        Exit.setMaximumSize(new java.awt.Dimension(93, 57));
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/cooker_logo.png"))); // NOI18N

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customerCounterLable, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(jLabel5)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(9, 9, 9)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel2))
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 31, Short.MAX_VALUE)
                .addComponent(customerCounterLable)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void meatCheesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meatCheesActionPerformed
        if(meatChees.isSelected()){
            meatPrice += meatNum;
        } else{
            meatPrice -= meatNum;
        }
    meatPriceLable.setText(meatPrice + " جنيه "); 
    }//GEN-LAST:event_meatCheesActionPerformed

    private JFrame frame;
    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        //System.exit(0);
        // Exit Confirm
        frame = new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame, "\n هــل تـرغــب بــالــخروج؟ \n\n\n سيتم فقدان كل البينات غير المحفوظة.", "نظــــــــام ادارة الـــــمطاعم", 
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION ) {
                        System.exit(0);
                }
    }//GEN-LAST:event_ExitActionPerformed

    private void meatCounterStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_meatCounterStateChanged
        meatNum = (Integer) meatCounter.getValue();
        meatPrice = MEAT_COST * meatNum;
        meatPriceLable.setText(meatPrice + " جنيه ");
    }//GEN-LAST:event_meatCounterStateChanged

    private void waterCounterStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_waterCounterStateChanged
        waterNum = (Integer) waterCounter.getValue();
        waterPrice = WATER_COST * waterNum;
        waterPriceLable.setText(waterPrice + " جنيه ");
    }//GEN-LAST:event_waterCounterStateChanged

    private void juiceCounterStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_juiceCounterStateChanged
        juiceNum = (Integer) juiceCounter.getValue();
        juicePrice = JUICE_COST * juiceNum;
        juicePriceLable.setText(juicePrice + " جنيه ");
    }//GEN-LAST:event_juiceCounterStateChanged

    private void chickenCheesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chickenCheesActionPerformed
       if(chickenChees.isSelected()){
            chickenPrice += chickenNum;
        } else{
            chickenPrice -= chickenNum;
        }
    chickenPriceLable.setText(chickenPrice + " جنيه ");
    }//GEN-LAST:event_chickenCheesActionPerformed

    private void calculateBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateBillActionPerformed
        subtotal = chickenPrice + meatPrice + waterPrice + juicePrice;
        subtotalLable.setText("المجموع:" + subtotal + " جنيه ");
        
        vat = subtotal * 0.05;
        vat = (double)((int) vat);
        vat = vat / 100;
        vatLable.setText("الضريبة:" + vat + " جنيه ");
        
        total = subtotal + vat;
        totalLable.setText("الاجمالي: " + total + " جنيه ");
    }//GEN-LAST:event_calculateBillActionPerformed

    private void saveBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBillActionPerformed
        if(total != 0){
            try {
                output = new PrintWriter("BillNo." + customerCounter + ".txt");
            } catch (FileNotFoundException ex) {
                Logger.getLogger(ResturandWindow.class.getName()).log(Level.SEVERE, null, ex);
            }
            output.println("رقم الفاتورة : " + customerCounter);
            output.println("============");
            
        }
        
        if(chickenNum != 0){
            output.print(chickenNum + " شاورما دجاج ");
            if(chickenChees.isSelected()){
                output.print("بالجبنة");
            }
            output.println(" : " + chickenPrice + " جنيه ");
        }
        
        if(meatNum != 0){
            output.print(meatNum + " شاورما لحم ");
            if(meatChees.isSelected()){
                output.print("بالجبنة");
            }
            output.println(" : " + meatPrice + " جنيه ");
        }
        
        if(waterNum != 0){
            output.print(waterNum + " ماء ");
            output.println(" : " + waterPrice + " جنيه ");
        }
        
        if(juiceNum != 0){
            output.print(juiceNum + " عصير ");
            output.println(" : " + juicePrice + " جنيه ");
        }
        
        output.println("------------------------");
        output.println("المجموع :" + subtotal + " جنيه ");
        output.println("الضريبة :" + vat + " جنيه ");
        output.println("الاجمالي :" + total + " جنيه ");
        output.println("******** شكرا********");
        output.close();
    }//GEN-LAST:event_saveBillActionPerformed

    private void newBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newBillActionPerformed
        if(total != 0){
           
            chickenCounter.setValue(0);
            meatCounter.setValue(0);
            waterCounter.setValue(0);
            juiceCounter.setValue(0);
            
            chickenChees.setSelected(false);
            meatChees.setSelected(false);
            
            subtotalLable.setText("المجموع: 0.0 جنيه");
            vatLable.setText("الضريبة: 0.0 جنيه");
            totalLable.setText("الاجمالي: 0.0 جنيه");
            
            subtotal = 0;
            vat = 0;
            total = 0;
            
            customerCounter++;
            customerCounterLable.setText("رقم الفاتورة : " + customerCounter);
        }
    }//GEN-LAST:event_newBillActionPerformed

    private void chickenCounterStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_chickenCounterStateChanged
        chickenNum = (Integer) chickenCounter.getValue();
        chickenPrice = CHICKEN_COST * chickenNum;
        chickenPriceLable.setText(chickenPrice + " جنيه ");
    }//GEN-LAST:event_chickenCounterStateChanged

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        Image img;
        try {
            img = ImageIO.read(getClass().getResource("cooker_logo.png"));
            this.setIconImage(img);
        } catch (IOException ex) {
            Logger.getLogger(ResturandWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }//GEN-LAST:event_formWindowOpened

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ResturandWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Exit;
    private javax.swing.JButton calculateBill;
    private javax.swing.JCheckBox chickenChees;
    private javax.swing.JSpinner chickenCounter;
    private javax.swing.JLabel chickenPriceLable;
    private javax.swing.JLabel customerCounterLable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSpinner juiceCounter;
    private javax.swing.JLabel juicePriceLable;
    private javax.swing.JCheckBox meatChees;
    private javax.swing.JSpinner meatCounter;
    private javax.swing.JLabel meatPriceLable;
    private javax.swing.JButton newBill;
    private javax.swing.JButton saveBill;
    private javax.swing.JLabel subtotalLable;
    private javax.swing.JLabel totalLable;
    private javax.swing.JLabel vatLable;
    private javax.swing.JSpinner waterCounter;
    private javax.swing.JLabel waterPriceLable;
    // End of variables declaration//GEN-END:variables
}
