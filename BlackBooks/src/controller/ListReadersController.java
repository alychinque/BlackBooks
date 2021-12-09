/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import com.opencsv.CSVWriter;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import model.Reader;
import view.BlackBooks;
import view.EditReader;
import view.ListReaders;
import view.Readers;

/**
 *
 * @author alychinque
 */
public class ListReadersController {

    private final ListReaders view;
    private javax.swing.JTable table;
    private Scanner s;

    public ListReadersController(ListReaders view) {
        this.view = view;
    }

    public void back() {
        Readers rd = new Readers();
        this.view.dispose();
        rd.setVisible(true);
    }

    public int getReader(String id, ArrayList<Reader> readers) {
        for (int i = 0; i < readers.size(); i++) {
            if (readers.get(i).getIdReader().equalsIgnoreCase(id)) {
                return i;
            }
        }
        return -1;
    }

    public void goEditReader(int index, ArrayList<Reader> readers) {
        EditReader er = new EditReader(index, readers);
        this.view.dispose();
        er.setVisible(true);
    }

    public void deleteReader(String id) {
        String filePath = "src/Data/READER_DATA.csv";
        String idReader = id;
        removeRecord(filePath, idReader);
    }

    private void removeRecord(String filePath, String id) {
        String tempFile = "temp.csv";
        File oldFile = new File(filePath);
        File newFile = new File(tempFile);
        String idReader = "", readerName = "", readerSurname = "", readerEmail = "", readerAddress = "", phone = "";
        try {
            FileWriter fw = new FileWriter(tempFile, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            s = new Scanner(new File(filePath));
            s.useDelimiter("[,\n]");
            int i = 0;
            while (s.hasNext()) {
                if (i != 0) {
                    idReader = s.next();
                    readerName = s.next();
                    readerSurname = s.next();
                    readerEmail = s.next();
                    readerAddress = s.next();
                    phone = s.next();
                    if (!idReader.equalsIgnoreCase(id)) {
                        pw.println(idReader + "," + readerName + "," + readerSurname + "," + readerEmail + "," + readerAddress + "," + phone);
                    }
                }i++;
            }
            s.close();
            pw.flush();
            pw.close();
            oldFile.delete();
            File dump = new File(filePath);
            newFile.renameTo(dump);
            BlackBooks bb = new BlackBooks();
            this.view.dispose();
            bb.setVisible(true);

        } catch (Exception e) {
        }
    }

}
