/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.List;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import model.Reader;
import view.BlackBooks;
import view.EditReader;
import view.Readers;

/**
 *
 * @author alychinque
 */
public class EditReaderController {

    private final EditReader view;
    private Reader reader;

    public EditReaderController(EditReader view) {
        this.view = view;
    }

    public void back() {
        Readers rd = new Readers();
        this.view.dispose();
        rd.setVisible(true);
    }

    public void getReader(JTextField idReader, JTextField nameReader) {
        String id = idReader.getText();
        String name = nameReader.getText();

        if (id.equals("") && name.equals("")) {
            JOptionPane.showMessageDialog(nameReader, "Type Reader's id or name");
        } else {

        }

    }

    public void editReader(String id, JTextField readerName, JTextField readerSurname, JTextField readerEmail, JTextField readerAddress, JTextField readerPhone) {
        try {
            File inputFile = new File("src/Data/READER_DATA.csv");
            CSVReader csvReader = new CSVReader(new FileReader(inputFile));
            List<String[]> csvBody = csvReader.readAll();

            // get CSV row column and replace with by using row and column
            for (int i = 0; i < csvBody.size(); i++) {
                String[] strArray = csvBody.get(i);
                if (strArray[0].equalsIgnoreCase(id)) {
                    csvBody.get(i)[1] = readerName.getText();
                    csvBody.get(i)[2] = readerSurname.getText();
                    csvBody.get(i)[3] = readerEmail.getText();
                    csvBody.get(i)[4] = readerAddress.getText();
                    csvBody.get(i)[5] = readerPhone.getText();
                }
            }
            csvReader.close();

            // Write to CSV file which is open
            CSVWriter csvWriter = new CSVWriter(new FileWriter("src/Data/READER_DATA.csv", false));
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

    public boolean checkVariables(JTextField readerName, JTextField readerSurname, JTextField readerEmail, JTextField readerAddress, JTextField readerPhone) {
        return validName(readerName) && valiSurname(readerSurname) && validEmail(readerEmail) && validAddress(readerAddress) && validPhone(readerPhone);
    }

    private boolean validName(JTextField readerName) {
        try {
            String name = readerName.getText();
            if (!name.isEmpty()) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Failed!\nPlease enter name!");
                return false;
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error");
            return false;
        }
    }

    private boolean valiSurname(JTextField readerSurname) {
        try {
            String surname = readerSurname.getText();
            if (!surname.isEmpty()) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Failed!\nPlease enter surname!");
                return false;
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
            if (email == null) {
                JOptionPane.showMessageDialog(null, "Email field is empty!\nPlease enter an email!");
                return false;
            }
            if (pat.matcher(email).matches() == true) {
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
        if (address.length() > 5) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Addresses must have at least 5 characters to be valid");
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
