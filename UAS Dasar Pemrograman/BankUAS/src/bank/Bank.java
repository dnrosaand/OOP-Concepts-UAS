/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank;

/**
 *
 * @author Dinda Rosa
 */
public class Bank {
    int saldo; 
    public Bank(int saldo){
        this.saldo = saldo;
    }
    public void getSaldo(int saldo){
        System.out.println("Hallo selamat datang di Bank Nusantara");
        System.out.println("Saldo saat ini = " + saldo);
    }
    public void simpanUang(int simpanUang){
        saldo += simpanUang;
        System.out.println("simpanUang = " + simpanUang);
        System.out.println("Saldo saat ini = " + saldo);
    }
    public void ambilUang(int ambilUang){
        saldo -= ambilUang;
        System.out.println("ambilUang = " + ambilUang);
        System.out.println("Saldo saat ini = " + saldo);
    }
}
