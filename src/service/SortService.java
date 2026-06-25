/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import model.Tersangka;
/**
 *
 * @author dwife
 */
public class SortService {
    
    public static void sortNama(ArrayList<Tersangka> list) {

        Collections.sort(list, new Comparator<Tersangka>() {
            @Override
            public int compare(Tersangka o1, Tersangka o2) {
                return o1.getNama().compareToIgnoreCase(o2.getNama());
            }
        });

    }
    
}
