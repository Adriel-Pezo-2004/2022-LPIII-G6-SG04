/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.p03;

/**
 *
 * @author Alumno
 */
public class TestAgregacion {
    public static void main(String[] args) {
        Automovil a1 = new Automovil("V23-111", 4, "Toyota", "Corolla");
        Motor m1 = new Motor(20, 100);
        a1.setMotor(m1);
        System.out.println(a1.getMotor().getNumMotor()+" "+ a1.getMotor().getRevPorMin());
    }
}
