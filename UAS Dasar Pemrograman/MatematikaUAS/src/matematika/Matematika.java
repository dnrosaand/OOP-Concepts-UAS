/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matematika;

/**
 *
 * @author Dinda Rosa
 */
public class Matematika {
    int mat;
    
    void setPertambahan(int a, int b){
        mat = a + b;
    }
    void setPengurangan(int a, int b){
        mat = a - b;
    }
    void setPerkalian(int a, int b){
        mat = a * b;
    }
    void setPembagian(int a, int b){
        mat = a / b;
    }
    
    int getMat(){
        return mat;
    }
    
}
