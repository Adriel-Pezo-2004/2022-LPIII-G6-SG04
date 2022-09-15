/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Alumno
 */
public abstract class FiguraGeometrica {
    private String nombre;
    abstract public double area();

    public FiguraGeometrica(String nombre) {
        this.nombre = nombre;
    }
    
    final public boolean mayorQue(FiguraGeometrica otra){
        return this.area()>otra.area();
    }

    @Override
    public String toString() {
        return this.nombre + " con area " + this.area();
    }
}

