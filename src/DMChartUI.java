/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yazhouaaaa
 */
public class DMChartUI extends javax.swing.JFrame {

    /**
     * Creates new form DMChartUI
     */
    public DMChartUI() {
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

        chartDisplayPanel2 = new javax.swing.JPanel();
        dataResourcePanel = new javax.swing.JPanel();
        dataResourceLabel = new javax.swing.JLabel();
        localPanel = new javax.swing.JPanel();
        localLabel = new javax.swing.JLabel();
        localDataResourceAddr = new javax.swing.JTextField();
        localUploadButton = new javax.swing.JButton();
        localCancelButton = new javax.swing.JButton();
        localBrowseButton = new javax.swing.JButton();
        AWSPanel = new javax.swing.JPanel();
        AWSLabel = new javax.swing.JLabel();
        AWSDataResourceAddr = new javax.swing.JTextField();
        AWSOkButton = new javax.swing.JButton();
        AWSCancelButton = new javax.swing.JButton();
        AWSBrowseButton = new javax.swing.JButton();
        chartDisplayPanel3 = new javax.swing.JPanel();
        generatePanel = new javax.swing.JPanel();
        generateButton = new javax.swing.JButton();
        rawDataPanel = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        rawDataTable = new javax.swing.JTable();
        methodPanel = new javax.swing.JPanel();
        methodLabel = new javax.swing.JLabel();
        methodSubpanel1 = new javax.swing.JPanel();
        methodSubpanel2 = new javax.swing.JPanel();

        chartDisplayPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout chartDisplayPanel2Layout = new javax.swing.GroupLayout(chartDisplayPanel2);
        chartDisplayPanel2.setLayout(chartDisplayPanel2Layout);
        chartDisplayPanel2Layout.setHorizontalGroup(
            chartDisplayPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        chartDisplayPanel2Layout.setVerticalGroup(
            chartDisplayPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        dataResourcePanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        dataResourceLabel.setText("Data Resource");

        localLabel.setText("Local");

        localDataResourceAddr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                localDataResourceAddrActionPerformed(evt);
            }
        });

        localUploadButton.setText("Upload");
        localUploadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                localUploadButtonActionPerformed(evt);
            }
        });

        localCancelButton.setText("Cancel");
        localCancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                localCancelButtonActionPerformed(evt);
            }
        });

        localBrowseButton.setText("Browse");
        localBrowseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                localBrowseButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout localPanelLayout = new javax.swing.GroupLayout(localPanel);
        localPanel.setLayout(localPanelLayout);
        localPanelLayout.setHorizontalGroup(
            localPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(localPanelLayout.createSequentialGroup()
                .addComponent(localLabel)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(localPanelLayout.createSequentialGroup()
                .addComponent(localDataResourceAddr)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(localBrowseButton)
                .addContainerGap())
            .addGroup(localPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(localUploadButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(localCancelButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        localPanelLayout.setVerticalGroup(
            localPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(localPanelLayout.createSequentialGroup()
                .addComponent(localLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(localPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(localDataResourceAddr)
                    .addComponent(localBrowseButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(localPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(localUploadButton)
                    .addComponent(localCancelButton))
                .addContainerGap())
        );

        AWSLabel.setText("AWS");

        AWSDataResourceAddr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AWSDataResourceAddrActionPerformed(evt);
            }
        });

        AWSOkButton.setText("OK");
        AWSOkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AWSOkButtonActionPerformed(evt);
            }
        });

        AWSCancelButton.setText("Cancel");
        AWSCancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AWSCancelButtonActionPerformed(evt);
            }
        });

        AWSBrowseButton.setText("Browse");
        AWSBrowseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AWSBrowseButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AWSPanelLayout = new javax.swing.GroupLayout(AWSPanel);
        AWSPanel.setLayout(AWSPanelLayout);
        AWSPanelLayout.setHorizontalGroup(
            AWSPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AWSPanelLayout.createSequentialGroup()
                .addComponent(AWSDataResourceAddr)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AWSBrowseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(AWSPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AWSPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AWSLabel)
                    .addGroup(AWSPanelLayout.createSequentialGroup()
                        .addComponent(AWSOkButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(AWSCancelButton)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        AWSPanelLayout.setVerticalGroup(
            AWSPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AWSPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AWSLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AWSPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AWSDataResourceAddr, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AWSBrowseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(AWSPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(AWSCancelButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AWSOkButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout dataResourcePanelLayout = new javax.swing.GroupLayout(dataResourcePanel);
        dataResourcePanel.setLayout(dataResourcePanelLayout);
        dataResourcePanelLayout.setHorizontalGroup(
            dataResourcePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(localPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(dataResourcePanelLayout.createSequentialGroup()
                .addComponent(dataResourceLabel)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(dataResourcePanelLayout.createSequentialGroup()
                .addComponent(AWSPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        dataResourcePanelLayout.setVerticalGroup(
            dataResourcePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dataResourcePanelLayout.createSequentialGroup()
                .addComponent(dataResourceLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(localPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(AWSPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
        );

        chartDisplayPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout chartDisplayPanel3Layout = new javax.swing.GroupLayout(chartDisplayPanel3);
        chartDisplayPanel3.setLayout(chartDisplayPanel3Layout);
        chartDisplayPanel3Layout.setHorizontalGroup(
            chartDisplayPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        chartDisplayPanel3Layout.setVerticalGroup(
            chartDisplayPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 419, Short.MAX_VALUE)
        );

        generatePanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        generateButton.setText("Generate");
        generateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout generatePanelLayout = new javax.swing.GroupLayout(generatePanel);
        generatePanel.setLayout(generatePanelLayout);
        generatePanelLayout.setHorizontalGroup(
            generatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(generatePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(generateButton, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                .addContainerGap())
        );
        generatePanelLayout.setVerticalGroup(
            generatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(generatePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(generateButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        rawDataPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        rawDataTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(rawDataTable);

        javax.swing.GroupLayout rawDataPanelLayout = new javax.swing.GroupLayout(rawDataPanel);
        rawDataPanel.setLayout(rawDataPanelLayout);
        rawDataPanelLayout.setHorizontalGroup(
            rawDataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rawDataPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE)
                .addGap(55, 55, 55))
        );
        rawDataPanelLayout.setVerticalGroup(
            rawDataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rawDataPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        methodPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        methodLabel.setText("Method");

        methodSubpanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout methodSubpanel1Layout = new javax.swing.GroupLayout(methodSubpanel1);
        methodSubpanel1.setLayout(methodSubpanel1Layout);
        methodSubpanel1Layout.setHorizontalGroup(
            methodSubpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        methodSubpanel1Layout.setVerticalGroup(
            methodSubpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 152, Short.MAX_VALUE)
        );

        methodSubpanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout methodSubpanel2Layout = new javax.swing.GroupLayout(methodSubpanel2);
        methodSubpanel2.setLayout(methodSubpanel2Layout);
        methodSubpanel2Layout.setHorizontalGroup(
            methodSubpanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        methodSubpanel2Layout.setVerticalGroup(
            methodSubpanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 126, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout methodPanelLayout = new javax.swing.GroupLayout(methodPanel);
        methodPanel.setLayout(methodPanelLayout);
        methodPanelLayout.setHorizontalGroup(
            methodPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(methodPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(methodPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(methodSubpanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(methodPanelLayout.createSequentialGroup()
                        .addComponent(methodLabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(methodSubpanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        methodPanelLayout.setVerticalGroup(
            methodPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(methodPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(methodLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(methodSubpanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(methodSubpanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dataResourcePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(generatePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(methodPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(chartDisplayPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rawDataPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(dataResourcePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(methodPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(generatePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(chartDisplayPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rawDataPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void localDataResourceAddrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_localDataResourceAddrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_localDataResourceAddrActionPerformed

    private void localUploadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_localUploadButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_localUploadButtonActionPerformed

    private void localCancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_localCancelButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_localCancelButtonActionPerformed

    private void localBrowseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_localBrowseButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_localBrowseButtonActionPerformed

    private void AWSDataResourceAddrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AWSDataResourceAddrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AWSDataResourceAddrActionPerformed

    private void AWSOkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AWSOkButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AWSOkButtonActionPerformed

    private void AWSCancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AWSCancelButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AWSCancelButtonActionPerformed

    private void AWSBrowseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AWSBrowseButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AWSBrowseButtonActionPerformed

    private void generateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_generateButtonActionPerformed

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
            java.util.logging.Logger.getLogger(DMChartUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DMChartUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DMChartUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DMChartUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DMChartUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AWSBrowseButton;
    private javax.swing.JButton AWSCancelButton;
    private javax.swing.JTextField AWSDataResourceAddr;
    private javax.swing.JLabel AWSLabel;
    private javax.swing.JButton AWSOkButton;
    private javax.swing.JPanel AWSPanel;
    private javax.swing.JPanel chartDisplayPanel;
    private javax.swing.JPanel chartDisplayPanel1;
    private javax.swing.JPanel chartDisplayPanel2;
    private javax.swing.JPanel chartDisplayPanel3;
    private javax.swing.JLabel dataResourceLabel;
    private javax.swing.JPanel dataResourcePanel;
    private javax.swing.JButton generateButton;
    private javax.swing.JPanel generatePanel;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton localBrowseButton;
    private javax.swing.JButton localCancelButton;
    private javax.swing.JTextField localDataResourceAddr;
    private javax.swing.JLabel localLabel;
    private javax.swing.JPanel localPanel;
    private javax.swing.JButton localUploadButton;
    private javax.swing.JLabel methodLabel;
    private javax.swing.JPanel methodPanel;
    private javax.swing.JPanel methodSubpanel1;
    private javax.swing.JPanel methodSubpanel2;
    private javax.swing.JPanel rawDataPanel;
    private javax.swing.JTable rawDataTable;
    // End of variables declaration//GEN-END:variables
}
