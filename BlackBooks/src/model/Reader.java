/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author alychinque
 */
public class Reader {
    private static int idCounter = 1001;
    private String idReader, readerName, readerSurname, readerEmail, readerAddress;
    private int phone;

    public Reader(String readerName, String readerSurname, String readerEmail, String readerAddress, int phone) {
        this.idReader = "BLK" + idCounter;
        this.readerName = readerName;
        this.readerSurname = readerSurname;
        this.readerEmail = readerEmail;
        this.readerAddress = readerAddress;
        this.phone = phone;
        idCounter++;
    }

    public String getIdReader() {
        return idReader;
    }

    public String getReaderName() {
        return readerName;
    }

    public void setReaderName(String readerName) {
        this.readerName = readerName;
    }

    public String getReaderSurname() {
        return readerSurname;
    }

    public void setReaderSurname(String readerSurname) {
        this.readerSurname = readerSurname;
    }

    public String getReaderEmail() {
        return readerEmail;
    }

    public void setReaderEmail(String readerEmail) {
        this.readerEmail = readerEmail;
    }

    public String getReaderAddress() {
        return readerAddress;
    }

    public void setReaderAddress(String readerAddress) {
        this.readerAddress = readerAddress;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
    
    
    
}
