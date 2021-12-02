/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import model.Reader;
import view.AddReader;
import view.BlackBooks;
import view.EditReader;
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
    
    public void goEditReader(int index, ArrayList<Reader> readers) {
        EditReader er = new EditReader(index, readers);
        this.view.dispose();
        er.setVisible(true);
    }

    public void goEditReader() {
        EditReader er = new EditReader();
        this.view.dispose();
        er.setVisible(true);
    }

    public int getReader(String id, ArrayList<Reader> readers) {
        for(int i=0; i< readers.size(); i++){
            if(readers.get(i).getIdReader().equalsIgnoreCase('"'+id+'"')){
                System.out.println("returned: "+i);
                return i;
            }
            System.out.println(i);
        }
        return -1;
    }
}
