/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matematika;

/**
 *
 * @author Dinda Rosa
 */
public class MatematikaBeraksi {
    public static void main(String[] args){
        MatematikaCanggih Call = new MatematikaCanggih();
        
        Call.setPertambahan(12.5, 28.7, 14.2);
        System.out.println("Pertambahan : 12.5 + 28.7 + 14.2 = " + Call.MatDouble);
        Call.setPertambahan(12, 28, 14);
        System.out.println("Pertambahan : 12 + 28 + 14 = " + Call.Mat);
        Call.setPertambahan(23, 34);
        System.out.println("Pertambahan : 23 + 34 = " + Call.MatDouble);
        Call.setPertambahan(3.4, 4.9);
        System.out.println("Pertambahan : 3.4 + 4.9 = " + Call.Mat);
    }
}
