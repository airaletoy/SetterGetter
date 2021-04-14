/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nyobaksettergetter;

/**
 *
 * @author USER
 */
public class NyobakSetterGetter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SetGet sc = new SetGet();
        
        //Biodata Aira
        sc.setNama("Mochammad Aira Bintang Andrian");
        sc.setSekolah("SMK Telkom Malang");
        sc.setAlamat("Jalan Wiriaga");
        sc.setUmur(16);
        sc.setTanggalLahir(100305);
        
        //Output Biodata Aira
        System.out.println("Ini merupakan Biodata dari Mochammad Aira Bintang Andrian");
        System.out.println("---------------------------------------");
        System.out.println("Nama            = "+sc.getNama());
        System.out.println("Asal Sekolah    = "+sc.getSekolah());
        System.out.println("Alamat          = "+sc.getAlamat());
        System.out.println("Umur            = "+sc.getUmur());
        System.out.println("Tanggal Lahir   = "+sc.getTanggalLahir());
        
        System.out.println("========================================");
        
        SetGet bg = new SetGet();
      
        //Biodata Kakak
        bg.setNama("Selly");
        bg.setSekolah("SMA 10 Malang");
        bg.setAlamat("Jalan Danau Toba");
        bg.setUmur(17);
        bg.setTanggalLahir(121203);
        
        //Output Biodata Kakak
        System.out.println("Ini merupakan Biodata dari Selly");
        System.out.println("---------------------------------------");
        System.out.println("Nama            = "+bg.getNama());
        System.out.println("Asal Sekolah    = "+bg.getSekolah());
        System.out.println("Alamat          = "+bg.getAlamat());
        System.out.println("Umur            = "+bg.getUmur());
        System.out.println("Tanggal Lahir   = "+bg.getTanggalLahir());
        
    }
    
}
