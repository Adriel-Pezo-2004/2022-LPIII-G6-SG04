/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.p03;

/**
 *
 * @author Alumno
 */
public class Motor {
   private int numMotor;
   private int revPorMin;

    public Motor(int numMotor, int revPorMin) {
        this.numMotor = numMotor;
        this.revPorMin = revPorMin;
    }

    public int getNumMotor() {
        return numMotor;
    }

    public int getRevPorMin() {
        return revPorMin;
    }

    public void setNumMotor(int numMotor) {
        this.numMotor = numMotor;
    }

    public void setRevPorMin(int revPorMin) {
        this.revPorMin = revPorMin;
    }
   
   
}
