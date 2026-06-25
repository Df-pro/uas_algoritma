/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author dwife
 */
public class Tersangka {
    private String idTersangka;
    private String nama;
    private int umur;
    private String alamat;
    private String jenisKelamin;

    public Tersangka(String idTersangka, String nama, int umur, String alamat, String jenisKelamin) {
        this.idTersangka = idTersangka;
        this.nama = nama;
        this.umur = umur;
        this.alamat = alamat;
        this.jenisKelamin = jenisKelamin;
    }

    public String getIdTersangka() {
        return idTersangka;
    }

    public void setIdTersangka(String idTersangka) {
        this.idTersangka = idTersangka;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    @Override
    public String toString() {
        return idTersangka + " - " + nama;
    }
}
