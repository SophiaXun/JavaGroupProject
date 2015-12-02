package GroupProject;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yazhou
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
        buttonGroup1 = new javax.swing.ButtonGroup();
        dataResourcePanel = new javax.swing.JPanel();
        dataResourceLabel = new javax.swing.JLabel();
        localPanel = new javax.swing.JPanel();
        localLabel = new javax.swing.JLabel();
        localDataResourceAddr = new javax.swing.JTextField();
        localUploadButton = new javax.swing.JButton();
        localCancelButton = new javax.swing.JButton();
        localBrowseButton = new javax.swing.JButton();
        localLoadButton = new javax.swing.JButton();
        AWSPanel = new javax.swing.JPanel();
        AWSLabel = new javax.swing.JLabel();
        AWSOkButton = new javax.swing.JButton();
        AWSCancelButton = new javax.swing.JButton();
        AWSBrowseButton = new javax.swing.JButton();
        AWSDataSource = new javax.swing.JComboBox();
        icon = new javax.swing.JLabel();
        generatePanel = new javax.swing.JPanel();
        generateButton = new javax.swing.JButton();
        rawDataPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        methodPanel = new javax.swing.JPanel();
        methodLabel = new javax.swing.JLabel();
        dataSelector = new javax.swing.JComboBox();
        methodPanel1 = new javax.swing.JPanel();
        methodLabel1 = new javax.swing.JLabel();
        methodRadioButton1 = new javax.swing.JRadioButton();
        methodRadioButton3 = new javax.swing.JRadioButton();
        methodRadioButton2 = new javax.swing.JRadioButton();
        equationDisplayPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        equationDisplayArea = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        predictValue = new javax.swing.JTextField();
        predictValueName = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        rawDataTable = new javax.swing.JTable();

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

        localLoadButton.setText("Load Data");
        localLoadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                localLoadButtonActionPerformed(evt);
            }
        });

        AWSLabel.setText("AWS");

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

        AWSDataSource.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AWSDataSourceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AWSPanelLayout = new javax.swing.GroupLayout(AWSPanel);
        AWSPanel.setLayout(AWSPanelLayout);
        AWSPanelLayout.setHorizontalGroup(
            AWSPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AWSPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AWSPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AWSPanelLayout.createSequentialGroup()
                        .addComponent(AWSDataSource, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(AWSBrowseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(AWSPanelLayout.createSequentialGroup()
                        .addGroup(AWSPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AWSLabel)
                            .addGroup(AWSPanelLayout.createSequentialGroup()
                                .addComponent(AWSOkButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(AWSCancelButton)))
                        .addContainerGap(128, Short.MAX_VALUE))))
        );
        AWSPanelLayout.setVerticalGroup(
            AWSPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AWSPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AWSLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AWSPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AWSBrowseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AWSDataSource, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(AWSPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(AWSCancelButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AWSOkButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout localPanelLayout = new javax.swing.GroupLayout(localPanel);
        localPanel.setLayout(localPanelLayout);
        localPanelLayout.setHorizontalGroup(
            localPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(localPanelLayout.createSequentialGroup()
                .addComponent(localLabel)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(localPanelLayout.createSequentialGroup()
                .addGroup(localPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(localPanelLayout.createSequentialGroup()
                        .addComponent(localDataResourceAddr, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(localBrowseButton))
                    .addGroup(localPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(localUploadButton)
                        .addGap(26, 26, 26)
                        .addComponent(localLoadButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(localCancelButton))
                    .addComponent(AWSPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
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
                    .addComponent(localCancelButton)
                    .addComponent(localLoadButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AWSPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GroupProject/DM2.jpg"))); // NOI18N

        javax.swing.GroupLayout dataResourcePanelLayout = new javax.swing.GroupLayout(dataResourcePanel);
        dataResourcePanel.setLayout(dataResourcePanelLayout);
        dataResourcePanelLayout.setHorizontalGroup(
            dataResourcePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(localPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(dataResourcePanelLayout.createSequentialGroup()
                .addComponent(dataResourceLabel)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(dataResourcePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icon)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        dataResourcePanelLayout.setVerticalGroup(
            dataResourcePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dataResourcePanelLayout.createSequentialGroup()
                .addComponent(dataResourceLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(localPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(icon)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(generateButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        generatePanelLayout.setVerticalGroup(
            generatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(generatePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(generateButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        rawDataPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

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

        javax.swing.GroupLayout rawDataPanelLayout = new javax.swing.GroupLayout(rawDataPanel);
        rawDataPanel.setLayout(rawDataPanelLayout);
        rawDataPanelLayout.setHorizontalGroup(
            rawDataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rawDataPanelLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        rawDataPanelLayout.setVerticalGroup(
            rawDataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rawDataPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(319, 319, 319))
        );

        methodPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        methodLabel.setText("Prediction Data");

        dataSelector.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout methodPanelLayout = new javax.swing.GroupLayout(methodPanel);
        methodPanel.setLayout(methodPanelLayout);
        methodPanelLayout.setHorizontalGroup(
            methodPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(methodPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(methodPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dataSelector, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(methodPanelLayout.createSequentialGroup()
                        .addComponent(methodLabel)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        methodPanelLayout.setVerticalGroup(
            methodPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, methodPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(methodLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dataSelector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(290, 290, 290))
        );

        methodPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        methodLabel1.setText("Method");

        buttonGroup1.add(methodRadioButton1);
        methodRadioButton1.setText("Method1");
        methodRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                methodRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(methodRadioButton3);
        methodRadioButton3.setText("Method3");

        buttonGroup1.add(methodRadioButton2);
        methodRadioButton2.setText("Method2");

        javax.swing.GroupLayout methodPanel1Layout = new javax.swing.GroupLayout(methodPanel1);
        methodPanel1.setLayout(methodPanel1Layout);
        methodPanel1Layout.setHorizontalGroup(
            methodPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(methodPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(methodPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(methodLabel1)
                    .addGroup(methodPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(methodPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(methodRadioButton3)
                            .addComponent(methodRadioButton1)
                            .addComponent(methodRadioButton2))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        methodPanel1Layout.setVerticalGroup(
            methodPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, methodPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(methodLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(methodRadioButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(methodRadioButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(methodRadioButton3)
                .addGap(74, 74, 74))
        );

        equationDisplayPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        equationDisplayArea.setColumns(20);
        equationDisplayArea.setRows(5);
        equationDisplayArea.setText("Equation");
        jScrollPane2.setViewportView(equationDisplayArea);

        jLabel2.setText("Result");

        predictValueName.setText("KEY");

        javax.swing.GroupLayout equationDisplayPanelLayout = new javax.swing.GroupLayout(equationDisplayPanel);
        equationDisplayPanel.setLayout(equationDisplayPanelLayout);
        equationDisplayPanelLayout.setHorizontalGroup(
            equationDisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(equationDisplayPanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(equationDisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(equationDisplayPanelLayout.createSequentialGroup()
                        .addComponent(predictValueName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(predictValue, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(equationDisplayPanelLayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        equationDisplayPanelLayout.setVerticalGroup(
            equationDisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(equationDisplayPanelLayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(equationDisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(predictValueName)
                    .addComponent(predictValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        rawDataTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Key", "Value"
            }
        ));
        jScrollPane3.setViewportView(rawDataTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dataResourcePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(methodPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(generatePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(methodPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(equationDisplayPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rawDataPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 426, Short.MAX_VALUE)
                    .addComponent(dataResourcePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(equationDisplayPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(methodPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(methodPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(generatePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(rawDataPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
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
        localDataResourceAddr.setText("");
    }//GEN-LAST:event_localCancelButtonActionPerformed
    File file = null;
    private void localBrowseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_localBrowseButtonActionPerformed
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser();
        FileTypeFilter fileFileter = new FileTypeFilter();
        fileChooser.setFileFilter(fileFileter);
        int returnVal = fileChooser.showOpenDialog(this);

        if (returnVal == JFileChooser.APPROVE_OPTION) {
            file = fileChooser.getSelectedFile();
            localDataResourceAddr.setText(file.getName());
        } else {
            JOptionPane.showMessageDialog(null, "File access cancelled by user.", "Alert", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_localBrowseButtonActionPerformed

    private void AWSOkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AWSOkButtonActionPerformed
        // TODO add your handling code here:
        String selectedFile = (String) AWSDataSource.getSelectedItem();
        try {
            FileDownload.DownloadFile(selectedFile);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }//GEN-LAST:event_AWSOkButtonActionPerformed

    private void AWSCancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AWSCancelButtonActionPerformed
        // TODO add your handling code here:
        AWSDataSource.removeAllItems();

    }//GEN-LAST:event_AWSCancelButtonActionPerformed

    private void AWSBrowseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AWSBrowseButtonActionPerformed
        // TODO add your handling code here:
        ArrayList<String> fileList = FileDownload.FileList();

        for (int i = 0; i < fileList.size(); i++) {
            AWSDataSource.addItem(fileList.get(i));
        }
    }//GEN-LAST:event_AWSBrowseButtonActionPerformed

    private void generateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_generateButtonActionPerformed

    private void methodRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_methodRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_methodRadioButton1ActionPerformed

    private void AWSDataSourceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AWSDataSourceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AWSDataSourceActionPerformed

    private void localLoadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_localLoadButtonActionPerformed

        try {
            // TODO add your handling code here:
            //LocalDataLoad.loadLocalData(file);
            //InputStream input = new FileInputStream(file);
            FileLoad.readLocalFile(file);

        } catch (FileNotFoundException ex) {
            Logger.getLogger(OriginalChartUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(OriginalChartUI.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_localLoadButtonActionPerformed

    /**
     * @param args the command line arguments
     * @throws java.lang.ClassNotFoundException
     * @throws java.lang.InstantiationException
     * @throws javax.swing.UnsupportedLookAndFeelException
     * @throws java.lang.IllegalAccessException
     */
   public static void main(String args[]) throws ClassNotFoundException, InstantiationException, UnsupportedLookAndFeelException, IllegalAccessException {
         UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel"); 
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Sea".equals(info.getName())) {
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
    private javax.swing.JComboBox AWSDataSource;
    private javax.swing.JLabel AWSLabel;
    private javax.swing.JButton AWSOkButton;
    private javax.swing.JPanel AWSPanel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel chartDisplayPanel2;
    private javax.swing.JLabel dataResourceLabel;
    private javax.swing.JPanel dataResourcePanel;
    private javax.swing.JComboBox dataSelector;
    private javax.swing.JTextArea equationDisplayArea;
    private javax.swing.JPanel equationDisplayPanel;
    private javax.swing.JButton generateButton;
    private javax.swing.JPanel generatePanel;
    private javax.swing.JLabel icon;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton localBrowseButton;
    private javax.swing.JButton localCancelButton;
    private javax.swing.JTextField localDataResourceAddr;
    private javax.swing.JLabel localLabel;
    private javax.swing.JButton localLoadButton;
    private javax.swing.JPanel localPanel;
    private javax.swing.JButton localUploadButton;
    private javax.swing.JLabel methodLabel;
    private javax.swing.JLabel methodLabel1;
    private javax.swing.JPanel methodPanel;
    private javax.swing.JPanel methodPanel1;
    private javax.swing.JRadioButton methodRadioButton1;
    private javax.swing.JRadioButton methodRadioButton2;
    private javax.swing.JRadioButton methodRadioButton3;
    private javax.swing.JTextField predictValue;
    private javax.swing.JLabel predictValueName;
    private javax.swing.JPanel rawDataPanel;
    private javax.swing.JTable rawDataTable;
    // End of variables declaration//GEN-END:variables
}
