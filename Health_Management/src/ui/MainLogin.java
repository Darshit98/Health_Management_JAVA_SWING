/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import model.DoctorDirectory;
import model.PersonDirectory;

/**
 *
 * @author darsh
 */
public class MainLogin extends javax.swing.JFrame {

    /**
     * Creates new form MainLogin
     */
    PersonDirectory perList;
    DoctorDirectory docDirectory;
    
    public MainLogin(PersonDirectory perList, DoctorDirectory docDirectory) {
        initComponents();
        this.perList=perList;
        this.docDirectory=docDirectory;
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
        lblTitle = new javax.swing.JLabel();
        btnSysAdminLogin = new javax.swing.JButton();
        btnDoctorLogin = new javax.swing.JButton();
        btnPatientLogin = new javax.swing.JButton();
        btnCommunityLogin = new javax.swing.JButton();
        btnHospitalLogin = new javax.swing.JButton();
        lblImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 255));

        lblTitle.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("LOGIN AS");

        btnSysAdminLogin.setText("SYSTEM ADMIN LOGIN");
        btnSysAdminLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSysAdminLoginActionPerformed(evt);
            }
        });

        btnDoctorLogin.setText("DOCTOR LOGIN");
        btnDoctorLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoctorLoginActionPerformed(evt);
            }
        });

        btnPatientLogin.setText("PATIENT LOGIN");
        btnPatientLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPatientLoginActionPerformed(evt);
            }
        });

        btnCommunityLogin.setText("COMMUNITY LOGIN");
        btnCommunityLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCommunityLoginActionPerformed(evt);
            }
        });

        btnHospitalLogin.setText("HOSPITAL LOGIN");
        btnHospitalLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHospitalLoginActionPerformed(evt);
            }
        });

        lblImage.setIcon(new javax.swing.ImageIcon("C:\\Users\\darsh\\OneDrive\\Desktop\\MSIS\\INFO5100\\Assignment 2\\login.jpg")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCommunityLogin)
                    .addComponent(btnDoctorLogin)
                    .addComponent(btnPatientLogin)
                    .addComponent(btnHospitalLogin)
                    .addComponent(btnSysAdminLogin))
                .addContainerGap(131, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCommunityLogin, btnDoctorLogin, btnHospitalLogin, btnPatientLogin, btnSysAdminLogin});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblTitle)
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(btnSysAdminLogin)
                        .addGap(30, 30, 30)
                        .addComponent(btnDoctorLogin)
                        .addGap(30, 30, 30)
                        .addComponent(btnPatientLogin)
                        .addGap(30, 30, 30)
                        .addComponent(btnCommunityLogin)
                        .addGap(30, 30, 30)
                        .addComponent(btnHospitalLogin))
                    .addComponent(lblImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(131, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnCommunityLogin, btnDoctorLogin, btnHospitalLogin, btnPatientLogin, btnSysAdminLogin});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSysAdminLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSysAdminLoginActionPerformed
        // TODO add your handling code here:
        dispose();
        systemAdminLogin sysAdLogin = new systemAdminLogin(perList, docDirectory);
        sysAdLogin.setVisible(true);
        
    }//GEN-LAST:event_btnSysAdminLoginActionPerformed

    private void btnDoctorLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoctorLoginActionPerformed
        // TODO add your handling code here:
        dispose();
        adminDoctor docLogin = new adminDoctor(docDirectory);
        docLogin.setVisible(true);
    }//GEN-LAST:event_btnDoctorLoginActionPerformed

    private void btnPatientLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPatientLoginActionPerformed
        // TODO add your handling code here:
        dispose();
        adminPerson patLogin = new adminPerson(perList);
        patLogin.setVisible(true);
    }//GEN-LAST:event_btnPatientLoginActionPerformed

    private void btnCommunityLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCommunityLoginActionPerformed
        // TODO add your handling code here:
//        adminPerson patLogin = new adminPerson();
//        patLogin.setVisible(true);
//        dispose();
    }//GEN-LAST:event_btnCommunityLoginActionPerformed

    private void btnHospitalLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHospitalLoginActionPerformed
        // TODO add your handling code here:
        dispose();
        adminHospital hosLogin = new adminHospital();
        hosLogin.setVisible(true);
    }//GEN-LAST:event_btnHospitalLoginActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCommunityLogin;
    private javax.swing.JButton btnDoctorLogin;
    private javax.swing.JButton btnHospitalLogin;
    private javax.swing.JButton btnPatientLogin;
    private javax.swing.JButton btnSysAdminLogin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}
