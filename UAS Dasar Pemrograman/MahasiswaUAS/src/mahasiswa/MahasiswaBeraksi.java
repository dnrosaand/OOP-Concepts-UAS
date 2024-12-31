/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mahasiswa;

/**
 *
 * @author Dinda Rosa
 */
public class MahasiswaBeraksi {
    public static void main(String[] args){
        Mahasiswa mhs = new Mahasiswa();
        
        mhs.membaca = "Sebelum memulai UAS, para Mahasiswa membaca Doa";
        mhs.nyontek = "Selama UAS, para Mahasiswa dilarang menyontek!";
        mhs.modifikasi = "Para Mahasiswa sedang memodifikasi jawaban sesuai dengan bahasa mereka";
        mhs.printMahasiswa();
    }
}
