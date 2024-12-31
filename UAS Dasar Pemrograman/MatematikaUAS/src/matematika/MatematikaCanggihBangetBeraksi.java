/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matematika;

/**
 *
 * @author Dinda Rosa
 */
public class MatematikaCanggihBangetBeraksi {
    public static void main(String[] args){
        MatematikaCanggihBanget mcb = new MatematikaCanggihBanget();
        
        mcb.setPertambahan(10, 2);
        System.out.println("Pertambahan : 10 + 2 = " + mcb.getMat());
        mcb.setPerkalian(30, 19);
        System.out.println("Perkalian : 30 * 19 = " + mcb.getMat());
        mcb.setModulus(30, 20);
        System.out.println("Modulus : 30 % 20 = " + mcb.getMod());
        mcb.setPertambahanTiga(40, 100, 13);
        System.out.println("Pertambahan Tiga : 40 + 100 + 13 = " + mcb.getPertiga());
    }
}
