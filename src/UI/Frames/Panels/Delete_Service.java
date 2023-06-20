/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Frames.Panels;
import Connection.Service_CRUD;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrator
 */
public class Delete_Service extends javax.swing.JPanel {

    /**
     * Creates new form Delete_Service
     */
    DefaultTableModel tableModel = new DefaultTableModel();

    public Delete_Service() {
        initComponents();
        tableModel.addColumn("Name");
        tableModel.addColumn("price");
        tableModel.addColumn("code");
        tableModel.addColumn("description");
        service_table.setModel(tableModel);
        try {
            String ConnectionSql = "jdbc:sqlserver://localhost:1433;Database=finaldb;integratedSecurity=true;";
            try (Connection conn = DriverManager.getConnection(ConnectionSql); java.sql.Statement st = conn.createStatement()) {
                String sql = "select * from service1";
                ResultSet res = st.executeQuery(sql);

                while (res.next()) {

                    tableModel.addRow(new String[]{
                        res.getString(1),
                        String.valueOf(res.getInt(2)),
                        String.valueOf(res.getInt(3)),
                        res.getString(4),});
                }

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_code = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        service_table = new javax.swing.JTable();

        setBackground(new java.awt.Color(14, 2, 16));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_code.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_codeActionPerformed(evt);
            }
        });
        add(txt_code, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 380, 250, 29));

        jLabel11.setFont(new java.awt.Font("Century", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Code");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 380, -1, -1));

        jButton11.setBackground(new java.awt.Color(255, 255, 255));
        jButton11.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        jButton11.setText("Delete");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(605, 472, 140, 60));

        jLabel12.setFont(new java.awt.Font("Century", 1, 30)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Delete Service");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, -1, -1));

        service_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        service_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                service_tableMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(service_table);

        add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 80, 707, 284));
    }// </editor-fold>//GEN-END:initComponents

    private void txt_codeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_codeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_codeActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        try {
            int service_code = 0;
            try {
                service_code = Integer.parseInt(txt_code.getText());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Service code should be numbers", "ERROR", JOptionPane.ERROR_MESSAGE);
            }

            Service_CRUD.deleteServiceData(service_code);
            JOptionPane.showMessageDialog(null, "Deleted Successfully", "delete", JOptionPane.INFORMATION_MESSAGE);

        } catch (SQLException ex) {
            Logger.getLogger(Delete_Service.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.toString());

        }


    }//GEN-LAST:event_jButton11ActionPerformed

    private void service_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_service_tableMouseClicked

        DefaultTableModel tableModel = new DefaultTableModel();
        // get the selected row index
        int selectedRowIndex = service_table.getSelectedRow();
        // set the selected row data into jtextfields
        txt_code.setText(this.tableModel.getValueAt(selectedRowIndex, 2).toString());

        // TODO add your handling code here:
    }//GEN-LAST:event_service_tableMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton11;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable service_table;
    private javax.swing.JTextField txt_code;
    // End of variables declaration//GEN-END:variables
}
