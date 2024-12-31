/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matematika;

/**
 *
 * @author Dinda Rosa
 */
public class MatematikaCanggihBeraksi {
    public static void main(String[] args){
        MatematikaCanggih mt = new MatematikaCanggih();
        
        mt.setPertambahan(40, 10);
        System.out.println("Pertambahan : 40 + 10 = " + mt.getMat());
        mt.setPerkalian(21, 14);
        System.out.println("Perkalian : 21 * 14 = " + mt.getMat());
        mt.setModulus(34, 10);
        System.out.println("Modulus : 34 % 10 = " + mt.getMod());
    }
}
