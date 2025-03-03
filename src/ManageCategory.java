/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author JEROME MACASAQUIT
 */
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import java.sql.*;
import dao.ConnectionProvider;
import javax.swing.table.TableModel;  

public class ManageCategory extends javax.swing.JFrame {

    private int categoryPk = 0;

    /**
     * Creates new form ManageCategory
     */
    public ManageCategory() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    public int getCategoryPk() {
        return categoryPk;
    }

    public void setCategoryPk(int categoryPk) {
        this.categoryPk = categoryPk;
    }

    private boolean validateFields() {
        if (!txtName.getText().equals("")) {
            return false;
        } else {
            return true;
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableCategory = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(68, 0, 0));
        jLabel1.setText("Manage Category");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(259, 6, -1, -1));

        tableCategory.setFont(new java.awt.Font("Tw Cen MT", 1, 17)); // NOI18N
        tableCategory.setForeground(new java.awt.Color(68, 0, 0));
        tableCategory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name"
            }
        ));
        tableCategory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableCategoryMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableCategory);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, 434, 491));

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 1, 17)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(68, 0, 0));
        jLabel2.setText("Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 50, -1));

        txtName.setFont(new java.awt.Font("Tw Cen MT", 1, 17)); // NOI18N
        txtName.setForeground(new java.awt.Color(68, 0, 0));
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        getContentPane().add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 329, 40));

        btnSave.setFont(new java.awt.Font("Tw Cen MT", 1, 17)); // NOI18N
        btnSave.setForeground(new java.awt.Color(45, 156, 82));
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, 80, 60));

        btnUpdate.setFont(new java.awt.Font("Tw Cen MT", 1, 17)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(181, 181, 46));
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 80, 60));

        btnReset.setFont(new java.awt.Font("Tw Cen MT", 1, 17)); // NOI18N
        btnReset.setForeground(new java.awt.Color(158, 62, 126));
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        getContentPane().add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, 80, 60));

        btnClose.setFont(new java.awt.Font("Tw Cen MT", 1, 17)); // NOI18N
        btnClose.setForeground(new java.awt.Color(213, 78, 78));
        btnClose.setText("Close");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        getContentPane().add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, 80, 60));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/All_page_Background.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tableCategory.getModel();
        try {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from category");
            while (rs.next()) {
                model.addRow(new Object[]{rs.getString("category_pk"), rs.getString("name")});
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        btnUpdate.setEnabled(false);
    }//GEN-LAST:event_formComponentShown

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new ManageCategory().setVisible(true);
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        String name = txtName.getText();
        if (validateFields()) {
            JOptionPane.showMessageDialog(null, "All fields are required.");
        } else {
            try {
                Connection con = ConnectionProvider.getCon();
                PreparedStatement ps = con.prepareStatement("insert into category (name) values(?)");
                ps.setString(1, name);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Category Added Successfully!");
                setVisible(false);
                new ManageCategory().setVisible(true);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_btnCloseActionPerformed

    private void tableCategoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableCategoryMouseClicked
        // TODO add your handling code here:
        int index = tableCategory.getSelectedRow();
        TableModel model = tableCategory.getModel();
        String id = model.getValueAt(index, 0).toString();
        categoryPk = Integer.parseInt(id);

        String name = model.getValueAt(index, 1).toString();
        txtName.setText(name);
        btnSave.setEnabled(false);
        btnUpdate.setEnabled(true);
    }//GEN-LAST:event_tableCategoryMouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        String name = txtName.getText();
        if (validateFields()) {
            JOptionPane.showMessageDialog(null, "All fields are required.");
        } else {
            try {
                Connection con = ConnectionProvider.getCon();
                PreparedStatement ps = con.prepareStatement("update category set name=? where category_pk=?");
                ps.setString(1, name);
                ps.setInt(2, categoryPk);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Category Updated Successfully!");
                setVisible(false);
                new ManageCategory().setVisible(true);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

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
            java.util.logging.Logger.getLogger(ManageCategory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageCategory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageCategory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageCategory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageCategory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableCategory;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
