/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.p03;

/**
 *
 * @author Alumno
 */
public class TestComposicion {
    public static void main(String[] args) {
        Persona p1 = new Persona(25, "Paolo", "Rivera");
        System.out.println(p1.getCuenta().getNumero());
    }
}
