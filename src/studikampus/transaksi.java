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
public class transaksi {
      
   
    public String namabarang;
     public String merkbarang;
    public int harga;
    public int idbarang;
    
   
     public transaksi ( String namabarang,String merkbarang, int harga,int idbarang){
        
       this.merkbarang = merkbarang;
         this.namabarang = namabarang;
         this.harga = harga;
         this.idbarang = idbarang;
     }
   public void info(){
        System.out.println("id barang        : "+ this.idbarang);
         System.out.println("nama barang  : "+ this.namabarang);
         System.out.println("merk barang  : "+ this.merkbarang);
                  System.out.println("harga        : "+ this.harga);

     }
}
