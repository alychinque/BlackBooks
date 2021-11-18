/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.DAO.BookDAO;
import view.BlackBooks;
import view.ListBooks;

/**
 *
 * @author alychinque
 */
public class ListBooksController implements ActionListener {

    private final ListBooks view;
    private BookDAO bookdao;

    public ListBooksController(ListBooks view) {
        this.view = view;
        bookdao = new BookDAO();
    }

    public void back() {
        BlackBooks bb = new BlackBooks(1);
        this.view.dispose();
        bb.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            bookdao.rentBook(e.getActionCommand());
        } catch (Exception exp) {
            JOptionPane.showMessageDialog(null, "Failed deleting the connection");
        }
    }
    
}
