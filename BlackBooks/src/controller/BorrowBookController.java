/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import view.BlackBooks;
import view.BorrowBook;

/**
 *
 * @author alychinque
 */
public class BorrowBookController implements ActionListener {
    private final BorrowBook view;
    private String reader;
    private String book;

    public BorrowBookController(BorrowBook view) {
        this.view = view;
    }
    
    public void back() {
        BlackBooks bb = new BlackBooks();
        this.view.dispose();
        bb.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("reader")) {
            JComboBox jcbx = (JComboBox) e.getSource();
            this.reader = (String)jcbx.getSelectedItem();
        } else if (e.getActionCommand().equals("book")) {
            JComboBox jcbx = (JComboBox) e.getSource();
            this.book = (String)jcbx.getSelectedItem();
        }
    }

    public void borrowBook(Object selectedItem, Object selectedItem0) {
        String reader = selectedItem.toString();
        String book = selectedItem0.toString();
        System.out.println(reader+" "+ book);
        
    }
}
