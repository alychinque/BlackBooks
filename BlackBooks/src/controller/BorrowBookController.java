/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import com.opencsv.CSVWriter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import model.Borrow;
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
    private Borrow borrow;
    private ArrayList<Borrow> listOfBorrowedBooks = new ArrayList<>();

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
            boolean lent = bookIsLent(book);
            this.view.setButtonEnable(lent);
            
        }
    }

    public void borrowBook(Object selectedReader, Object selectedBook) throws IOException {
        String reader = selectedReader.toString();
        String book = selectedBook.toString();
        borrow = new Borrow(reader, book, true);
        CSVWriter csvWriter = new CSVWriter(new FileWriter("src/Data/BORROW_DATA.csv", true));
        String row[] = new String[3];
        row[0] = borrow.getIdReader();
        row[1] = borrow.getTitleBook();
        row[2] = String.valueOf(borrow.isLent());
        

        csvWriter.writeNext(row, false);

        csvWriter.close();

        JOptionPane.showMessageDialog(null, "Reader: " + borrow.getIdReader()
                + "\nhas borrowed " + borrow.getTitleBook() + " successfully");
        BlackBooks bl = new BlackBooks();
        this.view.dispose();
        bl.setVisible(true);
    }

    private boolean bookIsLent(String book) {
        listOfBorrowedBooks = this.view.getListOfBorrowedBooks();
        
        for(int i=0; i<listOfBorrowedBooks.size(); i++){
            if(listOfBorrowedBooks.get(i).getTitleBook().equalsIgnoreCase(book)){
                return false;
            }
        }
        return true;
    }
}
