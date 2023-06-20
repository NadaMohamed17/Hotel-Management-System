/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Frames;

import Classes.*;
import java.awt.GridBagLayout;
import UI.*;
import UI.Frames.Panels.*;
import java.awt.GridBagConstraints;

/**
 *
 * @author Administrator
 */
public class EmployeeFrame extends javax.swing.JInternalFrame {

    /**
     * Creates new form EmployeeFrame
     */
    GridBagLayout layout = new GridBagLayout();

    Emp_add p1;
    Emp_update p2;
    Emp_delete p3;

    Employee employee;

    public EmployeeFrame() {
        initComponents();
        p1 = new Emp_add();
        p2 = new Emp_update();
        p3 = new Emp_delete();
        DynamicPanel.setLayout(layout);

        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;

        DynamicPanel.add(p1, c);
        DynamicPanel.add(p2, c);
        DynamicPanel.add(p3, c);

        p1.setVisible(true);
        p2.setVisible(false);
        p3.setVisible(false);
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
        jButtonInsert3 = new javax.swing.JButton();
        DynamicPanel = new javax.swing.JPanel();
        jButtonUpdate4 = new javax.swing.JButton();
        jButtonDelete5 = new javax.swing.JButton();

        setBackground(new java.awt.Color(14, 2, 16));
        setBorder(null);
        setClosable(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(1166, 813));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(14, 2, 16));
        jPanel1.setPreferredSize(new java.awt.Dimension(1166, 813));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonInsert3.setBackground(new java.awt.Color(203, 200, 206));
        jButtonInsert3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButtonInsert3.setForeground(new java.awt.Color(14, 2, 16));
        jButtonInsert3.setText("Add");
        jButtonInsert3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInsert3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonInsert3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 35, 140, 43));

        DynamicPanel.setBackground(new java.awt.Color(14, 2, 16));
        DynamicPanel.setPreferredSize(new java.awt.Dimension(860, 510));

        javax.swing.GroupLayout DynamicPanelLayout = new javax.swing.GroupLayout(DynamicPanel);
        DynamicPanel.setLayout(DynamicPanelLayout);
        DynamicPanelLayout.setHorizontalGroup(
            DynamicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 870, Short.MAX_VALUE)
        );
        DynamicPanelLayout.setVerticalGroup(
            DynamicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 530, Short.MAX_VALUE)
        );

        jPanel1.add(DynamicPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 870, 530));

        jButtonUpdate4.setBackground(new java.awt.Color(203, 200, 206));
        jButtonUpdate4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButtonUpdate4.setForeground(new java.awt.Color(14, 2, 16));
        jButtonUpdate4.setText("Update");
        jButtonUpdate4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdate4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonUpdate4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 96, 140, 43));

        jButtonDelete5.setBackground(new java.awt.Color(203, 200, 206));
        jButtonDelete5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButtonDelete5.setForeground(new java.awt.Color(14, 2, 16));
        jButtonDelete5.setText("Delete");
        jButtonDelete5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDelete5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonDelete5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 157, 140, 43));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        jPanel1.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonInsert3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInsert3ActionPerformed
        p1.setVisible(true);
        p2.setVisible(false);
        p3.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_jButtonInsert3ActionPerformed

    private void jButtonUpdate4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdate4ActionPerformed
        p1.setVisible(false);
        p2.setVisible(true);
        p3.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_jButtonUpdate4ActionPerformed

    private void jButtonDelete5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDelete5ActionPerformed
        p1.setVisible(false);
        p2.setVisible(false);
        p3.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonDelete5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DynamicPanel;
    private javax.swing.JButton jButtonDelete5;
    private javax.swing.JButton jButtonInsert3;
    private javax.swing.JButton jButtonUpdate4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
