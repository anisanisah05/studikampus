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
public class kasir extends pembeli{
     public String namakasir;
     public int tanggal;
     
 public kasir (int idbarang,String namabarang, String merkbarang, int harga,String namapembeli,int idpembeli, String alamat, int telepon, 
         String namakasir, int tanggal){
     super(namabarang,merkbarang,idbarang,harga,namapembeli,idpembeli,alamat,telepon);
     this.namakasir = namakasir;
     this.tanggal = tanggal;
 }
 public void info(){
     System.out.println("  ----- TOKO BUKU -----");
     System.out.println("nama kasir : "+ this.namakasir);
     System.out.println("tanggal    : "+ this.tanggal);  
 
     
     super.info();
 }
}