/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases.y.objetos;

/**
 *
 * @author Deyner
 */

public class Perro {
        private String raza;
        private String color;
        private int edad;
        private double temp;
        public double peso;

public Perro() {
    this.raza="Chusco";
    this.color= "gris";
    this.edad= 1;
    this.temp = 37.0;
    this.peso=0.5;
}

public Perro(String raza, String color) {
    this.raza = raza;
    this.color = color;
    this.edad= 1;
    this.temp = 37.0;
    this.peso=0.5;
}

 public String getRaza() {
    return raza;
 }

 public String getColor() {
    return color;
 }

 public int getEdad() {
    return edad;
 }

public double getTemp() {
    return temp;
}

public void setRaza(String raza) {
    this.raza = raza;
}

public void setColor(String color) {
    this.color = color;
}

 public void setEdad(int edad) {
    this.edad = edad;
}

 public void setTemp(double temp) {
    this.temp = temp;
 }

@Override
public String toString() {
return "Perro{" + "raza=" + raza + ", color=" + color + ", edad=" + edad + ", temp=" + temp + ", peso=" + peso + '}';
}

public void ladrar(){
System.out.println("Guau Guau");
}
public void dormir(){
System.out.println("zzz zzzz");
}
public void comer(){
System.out.println("pka pka");
}
public void increEdad(int anios){
this.edad = this.edad + anios;
cambiarPeso(anios);
}
private void cambiarPeso(int anios){
this.peso = this.peso + (anios * 1.5);
}

}

