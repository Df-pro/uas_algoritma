/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;
import java.util.ArrayList;
import model.Tersangka;


/**
 *
 * @author dwife
 */
public class SearchService {
    public static Tersangka cariTersangka(ArrayList<Tersangka> list, String nama) {

        for (Tersangka t : list) {
            if (t.getNama().equalsIgnoreCase(nama)) {
                return t;
            }
        }

        return null;
    }
}
