/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Book;
import view.BlackBooks;
import view.ListBooks;

/**
 *
 * @author alychinque
 */
public class BlackBooksController {

    private final BlackBooks view;
    private ArrayList<Book> library = new ArrayList<>();
    private Book book;

    public BlackBooksController(BlackBooks view) {
        this.view = view;
    }

    public ArrayList<Book> retriveLibraryData() {

        try {
            BufferedReader csvReader = new BufferedReader(new FileReader("src/Data/MOCK_DATA.csv"));
            String row;
            int i = 0;
            while ((row = csvReader.readLine()) != null) {
                String[] data = row.split(",");
                if (i != 0) {
                    String id = data[0];
                    String authorFirstName = data[1];
                    String authorLastName = data[2];
                    String booTitle = data[3];
                    String genre = data[4];
                    book = new Book(id, authorFirstName, authorLastName, booTitle, genre);
                    this.library.add(book);
                }
                i++;
            }
            csvReader.close();
            return library;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Receiving data failed");
            return null;
        }
    }

    public void listAllBooks() {
        ListBooks lisBooks = new ListBooks();
        this.view.dispose();
        lisBooks.setVisible(true);
    }
 test
}
