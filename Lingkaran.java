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
public class Lingkaran implements BangunDatar {
  private final double radius;
  private final double PI = 3.14;

public Lingkaran(double r) {
    radius = r;
}  
public double getRadius() {
    return radius;
}
public double HitungLuas() {
    return (PI*radius*radius);
}
public double HitungKeliling() {
    return (2*PI*radius);
}
public String displayInfo() {
    return ("Lingkaran"
            + "\no Jari-jari  : " +(float)getRadius()
            +"\no Luas  : " +(float)HitungLuas()
            +"\no Keliling  : " +(float)HitungKeliling());
}
}

