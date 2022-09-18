/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lp3;

/**
 *
 * @author Usuario
 */
public class TestAgregacion {
    public static void main(String[] args) {
        Automovil a1 = new Automovil("V4A-111", 4, "Toyota", "Corolla");
        Motor m1 = new Motor(20, 5000);

        a1.setMotor(m1); 
        System.out.println(a1);

        
        Automovil a2 = new Automovil("V1P-112", 4, "Chery", "Beat");
        System.out.println(a2);
    }
}
