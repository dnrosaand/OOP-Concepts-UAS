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
        Matematika mtk = new Matematika();
        
        mtk.setPertambahan(20, 20);
        System.out.println("Pertambahan: 20 + 20 = " + mtk.getMat());
        mtk.setPengurangan(10, 5);
        System.out.println("Pengurangan: 10 - 5 = " + mtk.getMat());
        mtk.setPerkalian(10, 20);
        System.out.println("Perkalian: 10 * 20 = " + mtk.getMat());
        mtk.setPembagian(21, 2);
        System.out.println("pembagian: 21 / 2 = " + mtk.getMat());
    }
}
