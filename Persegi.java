/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class Persegi implements BangunDatar {
  private final double sisi;
  public Persegi (double s){
      sisi = s;
  } 
public double getSisi() {
    return sisi;
}
public double HitungLuas() {
    return (sisi*sisi);
}
public double HitungKeliling() {
    return (sisi*sisi*sisi*sisi);
}
public String displayInfo() {
    return ("Persegi"
            + "\no Sisi  : " +(float)getSisi()
            +"\no Luas  : " +(float)HitungLuas()
            +"\no Keliling  : " +(float)HitungKeliling());
}
}

