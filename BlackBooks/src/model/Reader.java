/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author alychinque
 */
public class Reader {
    private static int idCounter = 1000;
    private String idReader, readerName, readerSurname, readerEmail, readerAddress, phone;

    public Reader(String readerName, String readerSurname, String readerEmail, String readerAddress, String phone) {
        idCounter++;
        this.idReader = "BLK" + idCounter;
        this.readerName = readerName;
        this.readerSurname = readerSurname;
        this.readerEmail = readerEmail;
        this.readerAddress = readerAddress;
        this.phone = phone;
    }
    
    public Reader(String readerId, String readerName, String readerSurname, String readerEmail, String readerAddress, String phone) {
        this.idReader = readerId;
        this.readerName = readerName;
        this.readerSurname = readerSurname;
        this.readerEmail = readerEmail;
        this.readerAddress = readerAddress;
        this.phone = phone;
    }
    
    public static void setIdCounter(String newIdCounter){
        int auxIdCounter = Integer.parseInt(newIdCounter.substring(3, 7));
        idCounter = auxIdCounter;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    @Override
    public String toString(){
        return this.readerName;
    }
    
    
}
