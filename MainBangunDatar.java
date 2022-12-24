/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class MainBangunDatar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BangunDatar b[] = new BangunDatar[3];
        Segitiga sg = new Segitiga(3,4);
        Lingkaran lg = new Lingkaran (10);
        Persegi p = new Persegi (5);
        
        b[0] = sg;
        b[1] = lg;
        b[2] = p;
        for (BangunDatar b1 : b){
            System.out.println("\n" + b1.displayInfo());
        }
    }
    
}
