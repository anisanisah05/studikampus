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
    public int harga;
     public transaksi ( String namabarang, int harga){
        
       
         this.namabarang = namabarang;
         this.harga = harga;
     }
     public void info(){
        
         System.out.println("nama barang : "+ this.namabarang);
                  System.out.println("harga : "+ this.harga);

     }
}
