/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author dwife
 */
public class Kasus {
  private String idKasus;
    private String namaKasus;
    private String lokasi;
    private String tanggal;
    private String status;

    public Kasus(String idKasus, String namaKasus, String lokasi, String tanggal, String status) {
        this.idKasus = idKasus;
        this.namaKasus = namaKasus;
        this.lokasi = lokasi;
        this.tanggal = tanggal;
        this.status = status;
    }

    public String getIdKasus() {
        return idKasus;
    }

    public void setIdKasus(String idKasus) {
        this.idKasus = idKasus;
    }

    public String getNamaKasus() {
        return namaKasus;
    }

    public void setNamaKasus(String namaKasus) {
        this.namaKasus = namaKasus;
    }

    public String getLokasi() {
        return lokasi;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return idKasus + " - " + namaKasus;
    }
}
