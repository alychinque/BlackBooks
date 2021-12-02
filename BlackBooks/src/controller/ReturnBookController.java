/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Borrow;
import view.BlackBooks;
import view.ReturnBook;

/**
 *
 * @author alychinque
 */
public class ReturnBookController implements ActionListener {
    
    private ReturnBook view;

    public ReturnBookController(ReturnBook view) {
        this.view = view;
    }
    
    public void back() {
        BlackBooks bb = new BlackBooks();
        this.view.dispose();
        bb.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }

    public void returnBook(Object selectedItem, ArrayList<Borrow> borrow) {
        String book = selectedItem.toString();
        try {
            File inputFile = new File("src/Data/BORROW_DATA.csv");
            CSVReader csvReader = new CSVReader(new FileReader(inputFile));
            List<String[]> csvBody = csvReader.readAll();

            // get CSV row column and replace with by using row and column
            for (int i = 0; i < csvBody.size(); i++) {
                String[] strArray = csvBody.get(i);
                System.out.println(strArray[1]);
                System.out.println(book);
                if (strArray[1].equalsIgnoreCase(book)) {
                    csvBody.get(i)[2] = "false";
                }
            }
            csvReader.close();

            // Write to CSV file which is open
            CSVWriter csvWriter = new CSVWriter(new FileWriter("src/Data/BORROW_DATA.csv", false));
            csvWriter.writeAll(csvBody, false);
            csvWriter.flush();
            csvWriter.close();
            BlackBooks bb = new BlackBooks();
            this.view.dispose();
            bb.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Receiving reader data failed");
        }
    }
    
}
