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
    int Mat;
    double MatDouble;
    
    void setPertambahan(int a, int b){
        Mat = a + b;
    }
    void setPertambahan(double a, double b){
        MatDouble = a + b;
    }
    void setPertambahan(int a, int b, int c){
        Mat = a + b + c;
    }
    void setPertambahan(double a, double b, double c){
        MatDouble = a + b + c;
    }
    
    void setPengurangan(int a, int b){
        Mat = a - b;
    }
    void setPengurangan(double a, double b){
        MatDouble = a - b;
    }
    void setPengurangan(int a, int b, int c){
        Mat = a + b - c;
    }
    void setPengurangan(double a, double b, double c){
        MatDouble = a - b - c;
    }
    
    void setPerkalian(int a, int b){
        Mat = a * b;
    }
    void setPerkalian(double a, double b){
        MatDouble = a * b;
    }
    void setPerkalian(int a, int b, int c){
        Mat = a * b * c;
    }
    void setPerkalian(double a, double b, double c){
        MatDouble = a * b * c;
    }
    
    void setPembagian(int a, int b){
        Mat = a / b;
    }
    void setPembagian(double a, double b){
        MatDouble = a / b;
    }
    void setPembagian(int a, int b, int c){
        Mat = a / b / c;
    }
    void setPembagian(double a, double b, double c){
        MatDouble = a / b / c;
    }
    
}
