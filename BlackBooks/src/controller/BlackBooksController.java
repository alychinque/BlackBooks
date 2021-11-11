/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.BufferedReader;
import java.io.FileReader;
import view.BlackBooks;

/**
 *
 * @author alychinque
 */
public class BlackBooksController {

    private final BlackBooks view;
    public String[][] retriveData;

    public BlackBooksController(BlackBooks view) {
        this.view = view;
    }

    public String[][] retriveData() {
        BufferedReader csvReader = new BufferedReader(new FileReader(pathToCsv));
        while ((row = csvReader.readLine()) != null) {
            String[] data = row.split(",");
            // do something with the data
        }
        csvReader.close();
    }

}
