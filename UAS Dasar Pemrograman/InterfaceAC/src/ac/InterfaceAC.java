/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ac;

/**
 *
 * @author Dinda Rosa
 */
interface InterfaceAC {
    public static final int KEADAAN_HIDUP=2;
    public static final int KEADAAN_MATI=1;
    public static final int DINGINKAN=1;
    public static final int PANASKAN=0;
    
    public abstract void Hidupkan();
    public abstract void Matikan();
    public abstract void Dinginkan();
    public abstract void Panaskan();
}
