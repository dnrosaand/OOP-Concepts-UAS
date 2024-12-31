/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ac;

/**
 *
 * @author Dinda Rosa
 */
public class AcBeraksi {
    public static void main(String[] args){
        
        AC call = new AC();
        
        System.out.println("Status Ac saat ini: Mati");
        
        call.Hidupkan();
        call.Matikan();
        call.Matikan();
        call.Hidupkan();
        call.Hidupkan();
        call.Dinginkan();
        call.Panaskan();
    }
}