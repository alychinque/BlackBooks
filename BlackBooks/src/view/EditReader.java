/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.EditReaderController;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Reader;

/**
 *
 * @author alychinque
 */
public class EditReader extends javax.swing.JFrame {

    private EditReaderController controller;
    private int index;
    private ArrayList<Reader> readers;
            
    /**
     * Creates new form AddEditReader
     */
    public EditReader() {
        initComponents();
        controller =  new EditReaderController(this);
        
    }

    public EditReader(int index, ArrayList<Reader> readers) {
        initComponents();
        controller =  new EditReaderController(this);
        this.readers = readers;
        this.index = index;
        setTextFields(index, readers);
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
        logo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        labelName = new javax.swing.JLabel();
        labelSurname = new javax.swing.JLabel();
        labelEmail = new javax.swing.JLabel();
        labelAddress = new javax.swing.JLabel();
        labelPhone = new javax.swing.JLabel();
        readerName = new javax.swing.JTextField();
        readerSurname = new javax.swing.JTextField();
        readerEmail = new javax.swing.JTextField();
        readerAddress = new javax.swing.JTextField();
        readerPhone = new javax.swing.JTextField();
        jButtonEditReader = new javax.swing.JButton();
        back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 500));
        setMinimumSize(new java.awt.Dimension(800, 500));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setMaximumSize(new java.awt.Dimension(800, 500));
        jPanel1.setMinimumSize(new java.awt.Dimension(800, 500));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/blackBooks.png"))); // NOI18N

        labelName.setBackground(new java.awt.Color(204, 204, 204));
        labelName.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelName.setForeground(new java.awt.Color(0, 153, 153));
        labelName.setText("Name:");

        labelSurname.setBackground(new java.awt.Color(204, 204, 204));
        labelSurname.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelSurname.setForeground(new java.awt.Color(0, 153, 153));
        labelSurname.setText("Surname:");

        labelEmail.setBackground(new java.awt.Color(204, 204, 204));
        labelEmail.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelEmail.setForeground(new java.awt.Color(0, 153, 153));
        labelEmail.setText("Email:");

        labelAddress.setBackground(new java.awt.Color(204, 204, 204));
        labelAddress.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelAddress.setForeground(new java.awt.Color(0, 153, 153));
        labelAddress.setText("Address:");

        labelPhone.setBackground(new java.awt.Color(204, 204, 204));
        labelPhone.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelPhone.setForeground(new java.awt.Color(0, 153, 153));
        labelPhone.setText("Phone:");

        readerName.setPreferredSize(new java.awt.Dimension(65, 15));

        readerSurname.setPreferredSize(new java.awt.Dimension(65, 15));

        readerEmail.setPreferredSize(new java.awt.Dimension(65, 15));

        readerAddress.setPreferredSize(new java.awt.Dimension(65, 15));

        readerPhone.setPreferredSize(new java.awt.Dimension(65, 15));

        jButtonEditReader.setBackground(new java.awt.Color(0, 204, 0));
        jButtonEditReader.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButtonEditReader.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEditReader.setText("Save Reader");
        jButtonEditReader.setMaximumSize(new java.awt.Dimension(160, 50));
        jButtonEditReader.setMinimumSize(new java.awt.Dimension(160, 50));
        jButtonEditReader.setPreferredSize(new java.awt.Dimension(160, 50));
        jButtonEditReader.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditReaderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(labelName)
                        .addGap(28, 28, 28)
                        .addComponent(readerName, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(labelSurname)
                        .addGap(28, 28, 28)
                        .addComponent(readerSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(labelEmail)
                        .addGap(28, 28, 28)
                        .addComponent(readerEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(labelAddress)
                        .addGap(28, 28, 28)
                        .addComponent(readerAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(labelPhone)
                        .addGap(28, 28, 28)
                        .addComponent(readerPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(jButtonEditReader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(labelName))
                    .addComponent(readerName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(labelSurname))
                    .addComponent(readerSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(labelEmail))
                    .addComponent(readerEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(labelAddress))
                    .addComponent(readerAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(labelPhone))
                    .addComponent(readerPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(jButtonEditReader, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(logo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(back))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(118, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(back)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEditReaderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditReaderActionPerformed
        if(controller.checkVariables(readerName, readerSurname, readerEmail, readerAddress, readerPhone)){
            controller.editReader(this.readers.get(this.index).getIdReader(), readerName, readerSurname, readerEmail, readerAddress, readerPhone);
        }
    }//GEN-LAST:event_jButtonEditReaderActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        controller.back();
    }//GEN-LAST:event_backActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton jButtonEditReader;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelAddress;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelName;
    private javax.swing.JLabel labelPhone;
    private javax.swing.JLabel labelSurname;
    private javax.swing.JLabel logo;
    private javax.swing.JTextField readerAddress;
    private javax.swing.JTextField readerEmail;
    private javax.swing.JTextField readerName;
    private javax.swing.JTextField readerPhone;
    private javax.swing.JTextField readerSurname;
    // End of variables declaration//GEN-END:variables

    private void setTextFields(int index, ArrayList<Reader> readers) {
        readerName.setText(readers.get(index).getReaderName());
        readerSurname.setText(readers.get(index).getReaderSurname());
        readerEmail.setText(readers.get(index).getReaderEmail());
        readerAddress.setText(readers.get(index).getReaderAddress());
        readerPhone.setText(readers.get(index).getPhone());
    }
}
