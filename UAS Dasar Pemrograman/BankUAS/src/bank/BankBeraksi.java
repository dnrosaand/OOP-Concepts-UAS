/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank;

/**
 *
 * @author Dinda Rosa
 */
public class BankBeraksi {
    public static void main(String[] args){
        Bank open = new Bank(100000);
        
        open.getSaldo(100000);
        open.simpanUang(500000);
        open.ambilUang(150000);
    }
}
