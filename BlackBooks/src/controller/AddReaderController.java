/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import com.opencsv.CSVWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import model.Reader;
import view.AddReader;
import view.BlackBooks;
import view.Readers;

/**
 *
 * @author alychinque
 */
public class AddReaderController {

    private final AddReader view;
    private Reader reader;

    public AddReaderController(AddReader view) {
        this.view = view;
    }

    public void back() {
        Readers rd = new Readers();
        this.view.dispose();
        rd.setVisible(true);
    }

    public boolean checkVariables(JTextField readerName, JTextField readerSurname, JTextField readerEmail, JTextField readerAddress, JTextField readerPhone) {
        return validName(readerName) && valiSurname(readerSurname) && validEmail(readerEmail) && validAddress(readerAddress) && validPhone(readerPhone);
    }

    public void addReader(JTextField readerName, JTextField readerSurname, JTextField readerEmail, JTextField readerAddress, JTextField readerPhone) throws IOException {
        reader = new Reader(readerName.getText().trim(), readerSurname.getText().trim(), readerEmail.getText().trim(), readerAddress.getText().trim(), readerPhone.getText().trim());

        CSVWriter csvWriter = new CSVWriter(new FileWriter("src/Data/READER_DATA.csv", true));
        String row[] = new String[6];
        row[0] = reader.getIdReader();
        row[1] = reader.getReaderName();
        row[2] = reader.getReaderSurname();
        row[3] = reader.getReaderEmail();
        row[4] = reader.getReaderAddress();
        row[5] = reader.getPhone();

        csvWriter.writeNext(row, false);

        csvWriter.close();

        JOptionPane.showMessageDialog(null, readerName.getText() + " has been successfully added");
        BlackBooks bl = new BlackBooks();
        this.view.dispose();
        bl.setVisible(true);

    }

    private boolean validName(JTextField readerName) { 
        try {
            String name = readerName.getText();
            System.out.println(name.contains(","));
            if (name.isEmpty() || name.contains(",")) {
                JOptionPane.showMessageDialog(null, "Failed!\nPlease enter name, no commas!");
                return false;
            } else {
                return true;
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error");
            return false;
        }
    }

    private boolean valiSurname(JTextField readerSurname) {
        try {
            String surname = readerSurname.getText();
            if (surname.isEmpty() || surname.contains(",")) {
                JOptionPane.showMessageDialog(null, "Failed!\nPlease enter surname, no commas!");
                return false;
            } else {
                return true;
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error");
            return false;
        }
    }

    private boolean validEmail(JTextField readerEmail) {
        try {
            String email = readerEmail.getText().toLowerCase();
            String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."
                    + "[a-zA-Z0-9_+&*-]+)*@"
                    + "(?:[a-zA-Z0-9-]+\\.)+[a-z"
                    + "A-Z]{2,7}$";

            Pattern pat = Pattern.compile(emailRegex);
            if (email == null || email.contains(",")) {
                JOptionPane.showMessageDialog(null, "Email field is empty or contains comma!\nPlease enter an email!");
                return false;
            } else if (pat.matcher(email).matches() == true) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Email is not valid!\nPlease enter again!");
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Email is not valid!\nPlease enter again!");
            return false;
        }
    }

    private boolean validAddress(JTextField readerAddress) {
        String address = readerAddress.getText();
        if (address.length() > 5 && !address.contains(",")){
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Addresses must have at least 5 characters to be valid and not contain comma");
            return false;
        }
    }

    private boolean validPhone(JTextField readerPhone) {
        try {
            String phoneString = readerPhone.getText();
            int phone = Integer.parseInt(phoneString);
            if (phoneString.length() >= 7 && phoneString.length() <= 11) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Phone is not valid!\nPlease enter again, just numbers between 7 and 10 digits!");
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Phone is not valid!\nPlease enter again, just numbers between 7 and 10 digits!");
            return false;
        }
    }
    
}
