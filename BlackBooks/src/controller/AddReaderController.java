/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import view.AddReader;
import view.Readers;

/**
 *
 * @author alychinque
 */
public class AddReaderController {
    
    private final AddReader view;
    
    public AddReaderController(AddReader view){
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

    public void addReader(JTextField readerName, JTextField readerSurname, JTextField readerEmail, JTextField readerAddress, JTextField readerPhone) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        if (address.length() > 5){
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
