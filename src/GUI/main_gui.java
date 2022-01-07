/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import java.awt.CardLayout;

/**
 *
 * @author utsav
 */
public class main_gui extends javax.swing.JFrame {

    /**
     * Creates new form main_gui
     */
    public main_gui() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        indexPanel = new javax.swing.JPanel();
        mainHeading = new javax.swing.JLabel();
        viewModeButton = new javax.swing.JButton();
        editModeButton = new javax.swing.JButton();
        viewPanel = new javax.swing.JPanel();
        editPanel = new javax.swing.JPanel();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        editMenu = new javax.swing.JMenu();
        navigateMenu = new javax.swing.JMenu();
        homeMenuItem = new javax.swing.JMenuItem();
        viewModeMenuItem = new javax.swing.JMenuItem();
        editModeMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hamro Cinema");
        setName("mainFrame"); // NOI18N
        setResizable(false);

        mainPanelLayout = new java.awt.CardLayout();
        mainPanel.setLayout(new java.awt.CardLayout());
        //Overriding the default layout.
        mainPanel.setLayout(mainPanelLayout);

        mainHeading.setFont(new java.awt.Font("Segoe UI Black", 0, 64)); // NOI18N
        mainHeading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mainHeading.setText("Hamro Cinema");

        viewModeButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        viewModeButton.setText("View Mode");
        viewModeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewModeButtonActionPerformed(evt);
            }
        });

        editModeButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        editModeButton.setText("Edit Mode");
        editModeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editModeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout indexPanelLayout = new javax.swing.GroupLayout(indexPanel);
        indexPanel.setLayout(indexPanelLayout);
        indexPanelLayout.setHorizontalGroup(
            indexPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(indexPanelLayout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(viewModeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 333, Short.MAX_VALUE)
                .addComponent(editModeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, indexPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(mainHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(172, 172, 172))
        );
        indexPanelLayout.setVerticalGroup(
            indexPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(indexPanelLayout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addComponent(mainHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(indexPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(viewModeButton, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                    .addComponent(editModeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(165, Short.MAX_VALUE))
        );

        mainPanel.add(indexPanel, "indexcard");

        javax.swing.GroupLayout viewPanelLayout = new javax.swing.GroupLayout(viewPanel);
        viewPanel.setLayout(viewPanelLayout);
        viewPanelLayout.setHorizontalGroup(
            viewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 961, Short.MAX_VALUE)
        );
        viewPanelLayout.setVerticalGroup(
            viewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 575, Short.MAX_VALUE)
        );

        mainPanel.add(viewPanel, "viewcard");

        javax.swing.GroupLayout editPanelLayout = new javax.swing.GroupLayout(editPanel);
        editPanel.setLayout(editPanelLayout);
        editPanelLayout.setHorizontalGroup(
            editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 961, Short.MAX_VALUE)
        );
        editPanelLayout.setVerticalGroup(
            editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 575, Short.MAX_VALUE)
        );

        mainPanel.add(editPanel, "editcard");

        fileMenu.setText("File");
        menuBar.add(fileMenu);

        editMenu.setText("Edit");
        menuBar.add(editMenu);

        navigateMenu.setText("Navigate");

        homeMenuItem.setText("Home");
        homeMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeMenuItemActionPerformed(evt);
            }
        });
        navigateMenu.add(homeMenuItem);

        viewModeMenuItem.setText("View Mode");
        viewModeMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewModeMenuItemActionPerformed(evt);
            }
        });
        navigateMenu.add(viewModeMenuItem);

        editModeMenuItem.setText("Edit Mode");
        editModeMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editModeMenuItemActionPerformed(evt);
            }
        });
        navigateMenu.add(editModeMenuItem);

        menuBar.add(navigateMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void viewModeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewModeButtonActionPerformed
        // TODO add your handling code here:
        mainPanelLayout.show(mainPanel, "viewcard");
    }//GEN-LAST:event_viewModeButtonActionPerformed

    private void editModeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editModeButtonActionPerformed
        // TODO add your handling code here:
        mainPanelLayout.show(mainPanel, "editcard");
    }//GEN-LAST:event_editModeButtonActionPerformed

    private void homeMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeMenuItemActionPerformed
        // TODO add your handling code here:
        mainPanelLayout.show(mainPanel, "indexcard");
    }//GEN-LAST:event_homeMenuItemActionPerformed

    private void viewModeMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewModeMenuItemActionPerformed
        // TODO add your handling code here:
        mainPanelLayout.show(mainPanel, "viewcard");
    }//GEN-LAST:event_viewModeMenuItemActionPerformed

    private void editModeMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editModeMenuItemActionPerformed
        // TODO add your handling code here:
        mainPanelLayout.show(mainPanel, "editcard");
    }//GEN-LAST:event_editModeMenuItemActionPerformed

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
            java.util.logging.Logger.getLogger(main_gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main_gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main_gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main_gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main_gui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu editMenu;
    private javax.swing.JButton editModeButton;
    private javax.swing.JMenuItem editModeMenuItem;
    private javax.swing.JPanel editPanel;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenuItem homeMenuItem;
    private javax.swing.JPanel indexPanel;
    private javax.swing.JLabel mainHeading;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu navigateMenu;
    private javax.swing.JButton viewModeButton;
    private javax.swing.JMenuItem viewModeMenuItem;
    private javax.swing.JPanel viewPanel;
    // End of variables declaration//GEN-END:variables
    private java.awt.CardLayout mainPanelLayout;
}