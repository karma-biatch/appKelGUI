/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entities;
import java.util.Date;

public class Kelengkeng {
    private int id_kelengkeng;
    private String jenis_kelengkeng;
    private String jenisSearch;
    private double harga;
    private int jumlahBeli;
    private double bayar;
    private double hargaDum;
    private String jenis_kelengkengDum;
    private String username;
    private String password;
    private Date date;
    private int id;
    private String kelengkeng;
    private String tanggal;
    private int quan;
    public Kelengkeng(){

    }

    public Kelengkeng(double bayar, int id, String kelengkeng, String tanggal, int quan) {
        this.bayar = bayar;
        this.id = id;
        this.kelengkeng = kelengkeng;
        this.tanggal = tanggal;
        this.quan = quan;
    }
    
    
    public Kelengkeng(int id_kelengkeng,String jenis_kelengkeng,double harga){
        this.id_kelengkeng = id_kelengkeng;
        this.jenis_kelengkeng=jenis_kelengkeng;
        this.harga=harga;
    }
    public String getJenis_kelengkengDum() {
        return jenis_kelengkengDum;
    }

    public void setJenis_kelengkengDum(String jenis_kelengkengDum) {
        this.jenis_kelengkengDum = jenis_kelengkengDum;
    }

    public Kelengkeng(String jenis_kelengkeng, double harga){
        this.jenis_kelengkeng = jenis_kelengkeng;
        this.harga = harga;
    }

    public Kelengkeng(int id,String username,String password){
        this.id=id;
        this.username = username;
        this.password= password;
    }

   
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKelengkeng() {
        return kelengkeng;
    }

    public void setKelengkeng(String kelengkeng) {
        this.kelengkeng = kelengkeng;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public int getQuan() {
        return quan;
    }

    public void setQuan(int quan) {
        this.quan = quan;
    }



    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public double getHargaDum() {
        return hargaDum;
    }

    public void setHargaDum(double hargaDum) {
        this.hargaDum = hargaDum;
    }

    public Kelengkeng(int jumlahBeli, double bayar,String jenisSearch){
        this.jumlahBeli = jumlahBeli;
        this.bayar = bayar;
        this.jenisSearch = jenisSearch;
    }
    public int getId_kelengkeng() {
        return id_kelengkeng;
    }

    public void setId_kelengkeng(int id_kelengkeng) {
        this.id_kelengkeng = id_kelengkeng;
    }

    public String getJenis_kelengkeng() {
        return jenis_kelengkeng;
    }

    public void setJenis_kelengkeng(String jenis_kelengkeng) {
        this.jenis_kelengkeng = jenis_kelengkeng;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public String getJenisSearch() {
        return jenisSearch;
    }

    public void setJenisSearch(String jenisSearch) {
        this.jenisSearch = jenisSearch;
    }

    public int getJumlahBeli() {
        return jumlahBeli;
    }

    public void setJumlahBeli(int jumlahBeli) {
        this.jumlahBeli = jumlahBeli;
    }

    public double getBayar() {
        return bayar;
    }

    public void setBayar(double bayar) {
        this.bayar = bayar;
    }
}
