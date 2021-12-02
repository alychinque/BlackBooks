/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Map;
import javax.swing.JOptionPane;
import model.Book;
import model.Reader;
import view.BlackBooks;
import view.BorrowBook;
import view.ListBooks;
import view.Readers;

/**
 *
 * @author alychinque
 */
public class BlackBooksController {

    private final BlackBooks view;
    private ArrayList<Book> library = new ArrayList<>();
    private ArrayList<Reader> readers = new ArrayList<>();
    private Book book;
    private Reader reader;

    public BlackBooksController(BlackBooks view) {
        this.view = view;
    }

    public ArrayList<Book> retriveLibraryData() {

        try {
            BufferedReader csvReader = new BufferedReader(new FileReader("src/Data/MOCK_DATA.csv"));
            String row;
            int i = 0;
            while ((row = csvReader.readLine()) != null) {
                String[] data = row.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1);
                if (i != 0) {
                    String id = data[0];
                    String authorFirstName = data[1];
                    String authorLastName = data[2];

                    String title = data[3];
                    String bookTitle;
                    if (title.contains(",")) {
                        String[] split = data[3].split(",");
                        bookTitle = split[1].substring(1, split[1].length() - 1) + " " + split[0].substring(1);
                    } else {
                        bookTitle = data[3];
                    }
                    String genre = data[4];
                    book = new Book(id, authorFirstName, authorLastName, bookTitle, genre);
                    this.library.add(book);
                }
                i++;
            }
            csvReader.close();
            return library;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Receiving library data failed");
            return null;
        }
    }

    public void listAllBooks(ArrayList<Book> library) {
        int sizeLibrary = library.size();
        ListBooks lisBooks = new ListBooks(library, sizeLibrary);
        this.view.dispose();
        lisBooks.setVisible(true);
    }

    public ArrayList<Reader> retriveReadersData() {
        try {
            BufferedReader csvReader = new BufferedReader(new FileReader("src/Data/READER_DATA.csv"));
            String row;
            int i = 0;
            while ((row = csvReader.readLine()) != null) {
                String[] data = row.split(",");
                if (i != 0) {
                    String idReader = data[0];
                    String readerName = data[1];
                    String readerSurname = data[2];
                    String readerEmail = data[3];
                    String readerAddress = data[4];
                    String phone = data[5];
                    reader = new Reader(idReader, readerName, readerSurname, readerEmail, readerAddress, phone);
                    this.readers.add(reader);
                    Reader.setIdCounter(idReader);
                }
                i++;
            }
            csvReader.close();
            return readers;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Receiving reader data failed");
            return null;
        }
    }

    public void goReaders(ArrayList<Reader> readers) {
        Readers rd = new Readers(readers);
        this.view.dispose();
        rd.setVisible(true);
    }

    public void goBorrowBook(ArrayList<Reader> readers, ArrayList<Book> library) {
        BorrowBook bb = new BorrowBook(readers, library);
        this.view.dispose();
        bb.setVisible(true);
    }
}
