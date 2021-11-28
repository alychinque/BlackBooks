/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import model.Reader;
import view.AddReader;
import view.BlackBooks;
import view.ListReaders;
import view.Readers;

/**
 *
 * @author alychinque
 */
public class ReadersController {
    
    private final Readers view;

    public ReadersController(Readers view) {
        this.view = view;
    }
    
    public void back() {
        BlackBooks bb = new BlackBooks();
        this.view.dispose();
        bb.setVisible(true);
    }

    public void goAddReader() {
        AddReader ar = new AddReader();
        this.view.dispose();
        ar.setVisible(true);
    }

    public void goListReaders(ArrayList<Reader> readers) {
        ListReaders lr = new ListReaders(readers);
        this.view.dispose();
        lr.setVisible(true);
    }
}
