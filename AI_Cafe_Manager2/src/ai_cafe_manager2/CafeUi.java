/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ai_cafe_manager2;

import java.awt.Label;
import java.awt.TextField;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author javan_000
 */
public class CafeUi extends javax.swing.JFrame {

    /**
     * Creates new form CafeUi
     */
    public CafeUi() {
        initComponents();
        setUi();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jButton15 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jButton27 = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jButton31 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jButton34 = new javax.swing.JButton();
        jButton35 = new javax.swing.JButton();
        jButton36 = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton37 = new javax.swing.JButton();
        jButton38 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBackground(new java.awt.Color(204, 204, 255));

        jPanel2.setLayout(new java.awt.GridLayout(2, 2, 20, 20));

        jPanel4.setPreferredSize(new java.awt.Dimension(300, 230));
        jPanel4.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Ice_Americano.jpg"))); // NOI18N
        jPanel4.add(jLabel1);
        jLabel1.setBounds(0, 0, 220, 230);

        jTextField1.setText("0");
        jPanel4.add(jTextField1);
        jTextField1.setBounds(237, 117, 30, 30);

        jButton1.setText("+");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1);
        jButton1.setBounds(270, 120, 50, 23);

        jButton2.setText("-");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2);
        jButton2.setBounds(320, 120, 39, 23);

        jLabel9.setText("아이스 아메리카노");
        jPanel4.add(jLabel9);
        jLabel9.setBounds(240, 90, 110, 15);

        jButton9.setText("장바구니 담기");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton9);
        jButton9.setBounds(240, 160, 120, 23);

        jPanel2.add(jPanel4);

        jPanel5.setPreferredSize(new java.awt.Dimension(300, 230));
        jPanel5.setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Hot_Americano.jpg"))); // NOI18N
        jPanel5.add(jLabel2);
        jLabel2.setBounds(0, 0, 240, 240);

        jLabel10.setText("핫 아메리카노");
        jPanel5.add(jLabel10);
        jLabel10.setBounds(240, 90, 110, 15);

        jTextField2.setText("0");
        jPanel5.add(jTextField2);
        jTextField2.setBounds(237, 117, 30, 30);

        jButton3.setText("+");
        jPanel5.add(jButton3);
        jButton3.setBounds(270, 120, 50, 23);

        jButton4.setText("-");
        jPanel5.add(jButton4);
        jButton4.setBounds(320, 120, 39, 23);

        jButton10.setText("장바구니 담기");
        jPanel5.add(jButton10);
        jButton10.setBounds(240, 160, 120, 23);

        jPanel2.add(jPanel5);

        jPanel6.setPreferredSize(new java.awt.Dimension(300, 230));
        jPanel6.setLayout(null);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Ice_Latte.jpg"))); // NOI18N
        jPanel6.add(jLabel3);
        jLabel3.setBounds(0, 0, 230, 230);

        jLabel11.setText("아이스 라떼");
        jPanel6.add(jLabel11);
        jLabel11.setBounds(240, 90, 110, 15);

        jTextField3.setText("0");
        jPanel6.add(jTextField3);
        jTextField3.setBounds(237, 117, 30, 30);

        jButton5.setText("+");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton5);
        jButton5.setBounds(270, 120, 50, 23);

        jButton6.setText("-");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton6);
        jButton6.setBounds(320, 120, 39, 23);

        jButton11.setText("장바구니 담기");
        jPanel6.add(jButton11);
        jButton11.setBounds(240, 160, 120, 23);

        jPanel2.add(jPanel6);

        jPanel7.setPreferredSize(new java.awt.Dimension(300, 230));
        jPanel7.setLayout(null);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Hot_Latte.jpg"))); // NOI18N
        jPanel7.add(jLabel4);
        jLabel4.setBounds(0, 0, 220, 210);

        jLabel12.setText("핫 라떼");
        jPanel7.add(jLabel12);
        jLabel12.setBounds(240, 90, 110, 15);

        jTextField4.setText("0");
        jPanel7.add(jTextField4);
        jTextField4.setBounds(237, 117, 30, 30);

        jButton7.setText("+");
        jPanel7.add(jButton7);
        jButton7.setBounds(270, 120, 50, 23);

        jButton8.setText("-");
        jPanel7.add(jButton8);
        jButton8.setBounds(320, 120, 39, 23);

        jButton12.setText("장바구니 담기");
        jPanel7.add(jButton12);
        jButton12.setBounds(240, 160, 120, 23);

        jPanel2.add(jPanel7);

        jTabbedPane1.addTab("coffee", jPanel2);

        jPanel3.setLayout(new java.awt.GridLayout(2, 2, 20, 20));

        jPanel8.setPreferredSize(new java.awt.Dimension(300, 230));
        jPanel8.setLayout(null);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/blackTea.jpg"))); // NOI18N
        jPanel8.add(jLabel13);
        jLabel13.setBounds(0, 0, 220, 230);

        jTextField5.setText("0");
        jPanel8.add(jTextField5);
        jTextField5.setBounds(237, 117, 30, 30);

        jButton13.setText("+");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton13);
        jButton13.setBounds(270, 120, 50, 23);

        jButton14.setText("-");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton14);
        jButton14.setBounds(320, 120, 39, 23);

        jLabel14.setText("홍차");
        jPanel8.add(jLabel14);
        jLabel14.setBounds(240, 90, 110, 15);

        jButton15.setText("장바구니 담기");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton15);
        jButton15.setBounds(240, 160, 120, 23);

        jPanel3.add(jPanel8);

        jPanel9.setPreferredSize(new java.awt.Dimension(300, 230));
        jPanel9.setLayout(null);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/greenTea.jpg"))); // NOI18N
        jPanel9.add(jLabel15);
        jLabel15.setBounds(0, 0, 230, 230);

        jLabel16.setText("녹차");
        jPanel9.add(jLabel16);
        jLabel16.setBounds(240, 90, 110, 15);

        jTextField6.setText("0");
        jPanel9.add(jTextField6);
        jTextField6.setBounds(237, 117, 30, 30);

        jButton16.setText("+");
        jPanel9.add(jButton16);
        jButton16.setBounds(270, 120, 50, 23);

        jButton17.setText("-");
        jPanel9.add(jButton17);
        jButton17.setBounds(320, 120, 39, 23);

        jButton18.setText("장바구니 담기");
        jPanel9.add(jButton18);
        jButton18.setBounds(240, 160, 120, 23);

        jPanel3.add(jPanel9);

        jPanel10.setPreferredSize(new java.awt.Dimension(300, 230));
        jPanel10.setLayout(null);

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/peppermint.jpg"))); // NOI18N
        jPanel10.add(jLabel17);
        jLabel17.setBounds(0, 0, 230, 230);

        jLabel18.setText("페퍼민트");
        jPanel10.add(jLabel18);
        jLabel18.setBounds(240, 90, 110, 15);

        jTextField7.setText("0");
        jPanel10.add(jTextField7);
        jTextField7.setBounds(237, 117, 30, 30);

        jButton19.setText("+");
        jPanel10.add(jButton19);
        jButton19.setBounds(270, 120, 50, 23);

        jButton20.setText("-");
        jPanel10.add(jButton20);
        jButton20.setBounds(320, 120, 39, 23);

        jButton21.setText("장바구니 담기");
        jPanel10.add(jButton21);
        jButton21.setBounds(240, 160, 120, 23);

        jPanel3.add(jPanel10);

        jPanel11.setPreferredSize(new java.awt.Dimension(300, 230));
        jPanel11.setLayout(null);

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/chamomile.jpg"))); // NOI18N
        jPanel11.add(jLabel19);
        jLabel19.setBounds(0, 0, 220, 210);

        jLabel20.setText("캐모마일");
        jPanel11.add(jLabel20);
        jLabel20.setBounds(240, 90, 110, 15);

        jTextField8.setText("0");
        jPanel11.add(jTextField8);
        jTextField8.setBounds(237, 117, 30, 30);

        jButton22.setText("+");
        jPanel11.add(jButton22);
        jButton22.setBounds(270, 120, 50, 23);

        jButton23.setText("-");
        jPanel11.add(jButton23);
        jButton23.setBounds(320, 120, 39, 23);

        jButton24.setText("장바구니 담기");
        jPanel11.add(jButton24);
        jButton24.setBounds(240, 160, 120, 23);

        jPanel3.add(jPanel11);

        jTabbedPane1.addTab("tea", jPanel3);

        jPanel12.setLayout(new java.awt.GridLayout(2, 2, 20, 20));

        jPanel13.setPreferredSize(new java.awt.Dimension(300, 230));
        jPanel13.setLayout(null);

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/cola.jpg"))); // NOI18N
        jPanel13.add(jLabel21);
        jLabel21.setBounds(0, 0, 220, 230);

        jTextField9.setText("0");
        jPanel13.add(jTextField9);
        jTextField9.setBounds(237, 117, 30, 30);

        jButton25.setText("+");
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });
        jPanel13.add(jButton25);
        jButton25.setBounds(270, 120, 50, 23);

        jButton26.setText("-");
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });
        jPanel13.add(jButton26);
        jButton26.setBounds(320, 120, 39, 23);

        jLabel22.setText("콜라");
        jPanel13.add(jLabel22);
        jLabel22.setBounds(240, 90, 110, 15);

        jButton27.setText("장바구니 담기");
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });
        jPanel13.add(jButton27);
        jButton27.setBounds(240, 160, 120, 23);

        jPanel12.add(jPanel13);

        jPanel14.setPreferredSize(new java.awt.Dimension(300, 230));
        jPanel14.setLayout(null);

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/cider.jpg"))); // NOI18N
        jPanel14.add(jLabel23);
        jLabel23.setBounds(0, 0, 230, 230);

        jLabel24.setText("사이다");
        jPanel14.add(jLabel24);
        jLabel24.setBounds(240, 90, 110, 15);

        jTextField10.setText("0");
        jPanel14.add(jTextField10);
        jTextField10.setBounds(237, 117, 30, 30);

        jButton28.setText("+");
        jPanel14.add(jButton28);
        jButton28.setBounds(270, 120, 50, 23);

        jButton29.setText("-");
        jPanel14.add(jButton29);
        jButton29.setBounds(320, 120, 39, 23);

        jButton30.setText("장바구니 담기");
        jPanel14.add(jButton30);
        jButton30.setBounds(240, 160, 120, 23);

        jPanel12.add(jPanel14);

        jPanel15.setPreferredSize(new java.awt.Dimension(300, 230));
        jPanel15.setLayout(null);

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/orengeJuice.jpg"))); // NOI18N
        jPanel15.add(jLabel25);
        jLabel25.setBounds(0, 0, 230, 230);

        jLabel26.setText("오렌지쥬스");
        jPanel15.add(jLabel26);
        jLabel26.setBounds(240, 90, 110, 15);

        jTextField11.setText("0");
        jPanel15.add(jTextField11);
        jTextField11.setBounds(237, 117, 30, 30);

        jButton31.setText("+");
        jPanel15.add(jButton31);
        jButton31.setBounds(270, 120, 50, 23);

        jButton32.setText("-");
        jPanel15.add(jButton32);
        jButton32.setBounds(320, 120, 39, 23);

        jButton33.setText("장바구니 담기");
        jPanel15.add(jButton33);
        jButton33.setBounds(240, 160, 120, 23);

        jPanel12.add(jPanel15);

        jPanel16.setPreferredSize(new java.awt.Dimension(300, 230));
        jPanel16.setLayout(null);

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Grapefruit.jpg"))); // NOI18N
        jPanel16.add(jLabel27);
        jLabel27.setBounds(0, 0, 220, 210);

        jLabel28.setText("자몽쥬스");
        jPanel16.add(jLabel28);
        jLabel28.setBounds(240, 90, 110, 15);

        jTextField12.setText("0");
        jPanel16.add(jTextField12);
        jTextField12.setBounds(237, 117, 30, 30);

        jButton34.setText("+");
        jPanel16.add(jButton34);
        jButton34.setBounds(270, 120, 50, 23);

        jButton35.setText("-");
        jPanel16.add(jButton35);
        jButton35.setBounds(320, 120, 39, 23);

        jButton36.setText("장바구니 담기");
        jPanel16.add(jButton36);
        jButton36.setBounds(240, 160, 120, 23);

        jPanel12.add(jPanel16);

        jTabbedPane1.addTab("juice", jPanel12);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 866, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        jPanel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel17.setLayout(null);

        jLabel6.setFont(new java.awt.Font("굴림", 1, 14)); // NOI18N
        jLabel6.setText("고객님의 주문 내역");
        jPanel17.add(jLabel6);
        jLabel6.setBounds(30, 30, 190, 17);

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

        jPanel17.add(jScrollPane1);
        jScrollPane1.setBounds(20, 60, 290, 370);

        jButton37.setText("주문");
        jButton37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton37ActionPerformed(evt);
            }
        });
        jPanel17.add(jButton37);
        jButton37.setBounds(53, 440, 110, 23);

        jButton38.setText("취소");
        jPanel17.add(jButton38);
        jButton38.setBounds(170, 440, 100, 23);

        jLabel5.setFont(new java.awt.Font("휴먼옛체", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 51, 0));
        jLabel5.setText("AI Cafe");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(524, 524, 524)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // 아이스 아메리카노 수량 +
        jTextField1.setText(Integer.parseInt(jTextField1.getText())+1+"");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // 아이스 아메리카노 수량 -
        if(Integer.parseInt(jTextField1.getText())>0){
            jTextField1.setText(Integer.parseInt(jTextField1.getText())-1+"");
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // 아이스 아메리카노 담기
        if(Integer.parseInt(jTextField1.getText())>0){
            Integer amount=basket.get("아이스 아메리카노");
            if(amount==null){
              amount=Integer.parseInt(jTextField1.getText());  
            }else{
               amount+=Integer.parseInt(jTextField1.getText());
            }
           
            basket.put("아이스 아메리카노", amount);
            Enumeration<String> keys=basket.keys();
            data=new String[basket.size()][2];
            int i=0;
            while(keys.hasMoreElements()){
                String key=keys.nextElement();
                Integer value=basket.get(key);
                data[i][0]=key;
                data[i][1]=value+"";                
                i++;
            }
            dataModel=new DefaultTableModel(data, COLUMN_NAMES);
            jTable1.setModel(dataModel);
        }else{
            JOptionPane.showMessageDialog(this, "수량을 입력하세요");
        }
    }//GEN-LAST:event_jButton9ActionPerformed
public void setUi(){   
   dataModel=new DefaultTableModel(data, COLUMN_NAMES);
   jTable1.setModel(dataModel);   
}

final String [] COLUMN_NAMES={"품명","수량"};
String [][]data={{"",""}};
TableModel dataModel=null;
Hashtable<String,Integer> basket=new Hashtable();

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jButton37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton37ActionPerformed
        // 주문 버튼
        String msg="";
        Enumeration<String> keys=basket.keys();
        
        int i=0;
        while(keys.hasMoreElements()){
            String key=keys.nextElement();
            Integer value=basket.get(key);          
            msg+=key+" : "+value+"개\n";
            i++;
        }
        msg += "\n위와 같이 주문하시겠습니까?";
        JOptionPane.showMessageDialog(this, msg);
    }//GEN-LAST:event_jButton37ActionPerformed

    int i=0;
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jTextField3.setText(++i+"");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       if (i>0) {
        jTextField3.setText(--i+""); 
       }
    }//GEN-LAST:event_jButton6ActionPerformed

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables





}
