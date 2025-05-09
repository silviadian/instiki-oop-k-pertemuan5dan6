/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan5dan6;

/**
 *
 * SILVIA DIAN LESTARI
 * TGL 26 April 2025
 */
public class Pertemuan5dan6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        manusia silvia = new manusia("P");
        silvia.warnakulit="putih";
        silvia.SetWarnaRambut("cranberry");
        silvia.warnamata="coklat";
        
        manusia leo = new manusia("P");
        leo.warnakulit = "putih";
        leo.SetWarnaRambut("hitam");
        leo.warnamata="hitam";
        
        manusia windu = new manusia("L");
        windu.warnakulit="putih";
        windu.SetWarnaRambut("pirang");
        windu.warnamata="coklat";
    }
    
}

class manusia{
    public String warnakulit="";
    private String warnarambut="";
    public String warnamata="";
    private String jeniskelamin="";
    
    //constructor
    public manusia(String jeniskelamin){
        this.jeniskelamin = jeniskelamin;
    }
    
    public void SetWarnaRambut(String warna){
        //menambahkan kode identifikasi
        this.warnarambut = warna;
    }
    
//    public void SetJenisKelamin(String jeniskelamin){
//        this.jeniskelamin = jeniskelamin;
//    }
}