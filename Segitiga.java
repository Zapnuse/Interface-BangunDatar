/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class Segitiga implements BangunDatar {
  private final double alas, tinggi;

public Segitiga(double a, double t) {
    alas = a;
    tinggi = t;
}  
public double getAlas() {
    return alas;
}
public double getTinggi() {
    return tinggi;
}
public double HitungLuas() {
    return (alas*tinggi)/2;
}
public double HitungKeliling() {
    double d;
    d = (double)Math.sqrt((alas*tinggi)+(tinggi*tinggi));
    return (alas+tinggi+d);
}
public String displayInfo() {
    return ("Segitiga"
            + "\no Alas  : " +(float)getAlas()
            +"\no Tinggi  : " +(float)getTinggi()
            +"\no Luas  : " +(float)HitungLuas()
            +"\no Keliling  : " +(float)HitungKeliling());
}
}
