/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import model.Reader;
import controller.ListReadersController;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author alychinque
 */
public class ListReaders extends javax.swing.JFrame {

    private final ListReadersController controller;
    private final ArrayList<Reader> readers;
    Object rowInfoData[] = new Object[6];

    /**
     * Creates new form ListReaders
     */
    public ListReaders() {
        initComponents();
        controller = new ListReadersController(this);
        readers = null;
    }

    public ListReaders(ArrayList<Reader> readers) {
        initComponents();
        controller = new ListReadersController(this);
        this.readers = readers;
        this.setTable(this.readers);

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
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        back = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButtonEditrReader = new javax.swing.JButton();
        jButtonDeleteReader = new javax.swing.JButton();
        idReader = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 500));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setMaximumSize(new java.awt.Dimension(800, 500));
        jPanel1.setMinimumSize(new java.awt.Dimension(800, 500));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/blackBooks.png"))); // NOI18N

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "IDReader", "Name", "Surname", "Email", "Address", "Phone"
            }
        )
        {
            public boolean isCellEditable(int row, int column){
                return false;
            }
        }
    );
    jTable.setEnabled(false);
    jScrollPane1.setViewportView(jTable);

    back.setText("Back");
    back.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            backActionPerformed(evt);
        }
    });

    jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
    jLabel2.setForeground(new java.awt.Color(0, 102, 102));
    jLabel2.setText("ID Reader:");

    jButtonEditrReader.setBackground(new java.awt.Color(0, 204, 0));
    jButtonEditrReader.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
    jButtonEditrReader.setForeground(new java.awt.Color(0, 0, 0));
    jButtonEditrReader.setText("Edit");
    jButtonEditrReader.setMaximumSize(new java.awt.Dimension(160, 50));
    jButtonEditrReader.setMinimumSize(new java.awt.Dimension(160, 50));
    jButtonEditrReader.setPreferredSize(new java.awt.Dimension(160, 50));
    jButtonEditrReader.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButtonEditrReaderActionPerformed(evt);
        }
    });

    jButtonDeleteReader.setBackground(new java.awt.Color(255, 0, 0));
    jButtonDeleteReader.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
    jButtonDeleteReader.setForeground(new java.awt.Color(0, 0, 0));
    jButtonDeleteReader.setText("Delete");
    jButtonDeleteReader.setMaximumSize(new java.awt.Dimension(160, 50));
    jButtonDeleteReader.setMinimumSize(new java.awt.Dimension(160, 50));
    jButtonDeleteReader.setPreferredSize(new java.awt.Dimension(160, 50));
    jButtonDeleteReader.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButtonDeleteReaderActionPerformed(evt);
        }
    });

    idReader.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            idReaderActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
            .addContainerGap(34, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(back)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(26, 26, 26))
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(198, 198, 198)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(92, 92, 92)
                    .addComponent(jLabel2)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(idReader, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(27, 27, 27)
                    .addComponent(jButtonEditrReader, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(28, 28, 28)
                    .addComponent(jButtonDeleteReader, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(21, 21, 21)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idReader, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonEditrReader, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonDeleteReader, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(5, 5, 5)
            .addComponent(back)
            .addContainerGap(13, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        controller.back();
    }//GEN-LAST:event_backActionPerformed

    private void jButtonEditrReaderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditrReaderActionPerformed
        if (idReader.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Please enter Reader's ID!");
        } else {
            int index = controller.getReader(idReader.getText(), this.readers);
            controller.goEditReader(index, this.readers);
        }
    }//GEN-LAST:event_jButtonEditrReaderActionPerformed

    private void jButtonDeleteReaderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteReaderActionPerformed
        if (idReader.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Please enter Reader's ID!");
        } else {
            int index = controller.getReader(idReader.getText(), this.readers);
            if (JOptionPane.showConfirmDialog(rootPane, "Reader: " + this.readers.get(index).getReaderName() + " " + this.readers.get(index).getReaderSurname()
                    + "\nID: " + this.readers.get(index).getIdReader()
                    + "\nAre you sure you want delete this reader?", "WARNING",
                    JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                // yes option
                controller.deleteReader(idReader.getText());
                JOptionPane.showMessageDialog(rootPane, "Reader Deleted");

            } else {
                // no option
                JOptionPane.showMessageDialog(rootPane, "Aborted!");
            }
        }
    }//GEN-LAST:event_jButtonDeleteReaderActionPerformed

    private void idReaderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idReaderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idReaderActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JTextField idReader;
    private javax.swing.JButton jButtonDeleteReader;
    private javax.swing.JButton jButtonEditrReader;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    // End of variables declaration//GEN-END:variables

    private void setTable(ArrayList<Reader> readers) {
        DefaultTableModel infoTableModel = (DefaultTableModel) jTable.getModel();
        infoTableModel.setRowCount(0);

        for (int i = 0; i < readers.size(); i++) {
            rowInfoData[0] = readers.get(i).getIdReader();
            rowInfoData[1] = readers.get(i).getReaderName();
            rowInfoData[2] = readers.get(i).getReaderSurname();
            rowInfoData[3] = readers.get(i).getReaderEmail();
            rowInfoData[4] = readers.get(i).getReaderAddress();
            rowInfoData[5] = readers.get(i).getPhone();

            infoTableModel.addRow(rowInfoData);
        }
    }
}
