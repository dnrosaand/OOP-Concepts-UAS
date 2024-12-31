/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ac;

/**
 *
 * @author Dinda Rosa
 */
public class AC implements InterfaceAC{
    int StatusAc;
    
    public void Hidupkan(){
        if(StatusAc == KEADAAN_MATI){
            StatusAc = KEADAAN_HIDUP;
            System.out.println("Hidupkan Ac! --> Ac Hidup");
        }else{
            System.out.println("Hidupkan Ac! --> Ac Sudah Hidup!");
        }
    }
    public void Matikan(){
        if(StatusAc == KEADAAN_HIDUP){
            StatusAc = KEADAAN_MATI;
            System.out.println("Matikan Ac! --> Ac Mati");
        }else{
            System.out.println("Matikan Ac! --> Ac Sudah Mati!");
        }
    }
    
    public void Dinginkan(){
        if(StatusAc == KEADAAN_HIDUP){
            StatusAc = DINGINKAN;
            System.out.println("Dinginkan Ac! --> Ac Didinginkan");
        }else{
            System.out.println("Dinginkan Ac! --> Ac Sudah Didinginkan!");
        }
    }
    
    public void Panaskan(){
        if(StatusAc == DINGINKAN){
            StatusAc = PANASKAN;
            System.out.println("Panaskan Ac! --> Ac Dipanaskan");
        }else{
            System.out.println("Panaskan Ac! --> Ac Sudah Dipanaskan!");
        }
    }
}
