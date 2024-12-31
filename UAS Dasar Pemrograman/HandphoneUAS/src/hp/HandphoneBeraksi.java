/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hp;

/**
 *
 * @author Dinda Rosa
 */
public class HandphoneBeraksi {
    public static void main(String[] args){
        Handphone hp = new Handphone();
        
        hp.hidupkan = "Halo";
        hp.lakukanPanggilan = "Kring, kring, kring... Panggilan dilakukan";
        hp.kirimSMS = "Dung, dung... SMS berhasil terkirim";
        hp.matikan = "Sampai Jumpa lagi";
        
        System.out.println("Handphone hidup: " + hp.hidupkan);
        System.out.println("Lakukan panggilan: " + hp.lakukanPanggilan);
        System.out.println("Kirimkan SMS: " + hp.kirimSMS);
        System.out.println("Matikan Handphone: " + hp.matikan);
    }
}
