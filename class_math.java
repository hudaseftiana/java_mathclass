/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matematika;


/**
 *
 * @author acr
 */
public class class_math {
    
    public static void main(String[] args) {
        int a = -8;
        int b = 10;
        int c = a * b;
        System.out.println("Menentukan nilai absolute :");
        System.out.println(Math.abs(c));
        
        int d = 15 ;
        int e = 60;
        System.out.println("nilai MAX");
        System.out.println(Math.max(d, e));
        System.out.println("Nilai MIN");
        System.out.println(Math.min(d, e));
        
        System.out.println("Pengakaran");
        int f = 81;
        System.out.println(Math.sqrt(f));
    }
}
