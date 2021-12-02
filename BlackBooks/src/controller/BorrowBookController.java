/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import com.opencsv.CSVWriter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import model.Borrow;
import model.Reader;
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
            System.out.println("reader acionado");
        } else if (e.getActionCommand().equals("book")) {
            JComboBox jcbx = (JComboBox) e.getSource();
            this.book = (String)jcbx.getSelectedItem();
            System.out.println("book " +book + " acionado");
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

        JOptionPane.showMessageDialog(null, "Reader id: " + borrow.getIdReader()
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

    public ArrayList<Borrow> getBorrowedBooks() {
        try {
            BufferedReader csvReader = new BufferedReader(new FileReader("src/Data/BORROW_DATA.csv"));
            String row;
            int i = 0;
            while ((row = csvReader.readLine()) != null) {
                String[] data = row.split(",");
                if (i != 0) {
                    String idReader = data[0];
                    String titleBook = data[1];
                    boolean lent = data[2].equalsIgnoreCase("true");
                    borrow = new Borrow(idReader, titleBook, lent);
                    this.listOfBorrowedBooks.add(borrow);
                }
                i++;
            }
            csvReader.close();
            return listOfBorrowedBooks;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Receiving list of borrowed books data failed");
            return null;
        }
    }
}
