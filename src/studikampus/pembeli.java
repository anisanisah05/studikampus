/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studikampus;

/**
 *
 * @author NISAH~05
 */
public class pembeli extends transaksi{
     public String namapembeli;
     public int idpembeli;
     public String alamat;
     public int telepon;
 public pembeli (String namabarang, String merkbarang,int idbarang, int harga,String namapembeli,int idpembeli, String alamat, int telepon){
     super(namabarang,merkbarang,harga,idbarang);
     this.namapembeli = namapembeli;
     this.idpembeli= idpembeli;
    this.alamat = alamat;
    this.telepon = telepon;
 }
 public void info(){
     System.out.println("---------------------------------");
     System.out.println("nama pembeli : "+ this.namapembeli);
     System.out.println("id pembeli   : "+ this.idpembeli);  
     System.out.println("alamat       : "+ this.alamat);
     System.out.println("telepon      : "+ this.telepon);
     
     super.info();
 }
}