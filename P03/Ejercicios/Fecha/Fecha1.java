/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;
import java.time.Duration;
import java.util.*;
import java.time.LocalDate;


public class Fecha1 {
    private int dia;
    private int mes;
    private int año;
    private int diaMes;
    
    public Fecha1(){
        
        this.dia = 1;
        this.mes = 1;
        this.año = 1900;
    }

    public Fecha1(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
        valida();
    }
    
    public void leer(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el dia (1-31)");
        this.dia = teclado.nextInt();
        System.out.println("Ingrese el mes (1-12)");
        this.mes = teclado.nextInt();
        System.out.println("Ingrese el año (1900 - 2050)");
        this.año = teclado.nextInt();  
        valida();
    }
    public boolean bisiesto(){
        if ((this.año % 4 == 0 && this.año % 100 != 0) || (this.año % 100 == 0 && this.año % 400 == 0)) {
            System.out.println("El año " + this.año + " es bisiesto");
            return true;
        } else {
            System.out.println("El año " + this.año + " no es bisiesto");
            return false;
        }
    }
    public int diasMes(int diasMes){
        boolean bisiesto;
        bisiesto = bisiesto();
        if (this.mes == 1 || this.mes == 3|| this.mes == 5|| this.mes == 7|| this.mes == 8|| this.mes == 10|| this.mes == 12){
            this.diaMes = 31;
        }
        if (this.mes == 4|| this.mes == 6|| this.mes == 9|| this.mes == 11){
            this.diaMes = 30;
        }
        if (this.mes ==2){
            if (bisiesto == true){
                this.diaMes = 29;
            }
            else{
                this.diaMes = 28;
            }
        }
        return this.diaMes;
    }
    
    private void valida(){
        if (dia < 0 && dia > 31 )
            dia = 1;
        else if (mes < 0 && mes > 12)
            mes = 1;
        else if (año < 1899 && año > 2050)
            año = 1900;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAño() {
        return año;
    }

    public int getDiaMes() {
        return diaMes;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public void setDiaMes(int diaMes) {
        this.diaMes = diaMes;
    }
    
    public void corta(){
        System.out.println(this.dia+"-"+this.mes+"-"+this.año);
    }
    
    public int diasTranscurridos(){        LocalDate fecha1 = LocalDate.parse("1900-01-01");
        LocalDate fecha2 = LocalDate.of(año, mes, dia);
        Duration dd = Duration.between(fecha1.atStartOfDay(), fecha2.atStartOfDay());
        return (int) dd.toDays();
    }
    
    public String diaSemana(){
        String[] dias = { "domingo", "lunes", "martes", "miercoles", "jueves", "viernes", "sabado" };
        String diaDeLaSemana = dias[this.diasTranscurridos() % 7];
        return diaDeLaSemana;
    }
    
    public String larga(){
        String[] meses = { "enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre" };
        String formato;
        formato = String.format("%s %d de %s de %d", this.diaSemana(), this.dia, meses[this.mes - 1], this.año);
        System.out.println("La fecha de hoy es: "+formato);
        return formato;
    }
    
    public void fechaTras(long dias) {
        this.dia = 1;
        this.mes = 1;
        this.año = 1900;
        while(dias > 0) {
            this.siguiente();
            dias--;
        }
    }
    
    public long diasEntre(String Fecha, String fechaNueva) {
        LocalDate fecha1 = LocalDate.parse(fechaNueva);
        LocalDate fecha2 = LocalDate.parse(Fecha);
        Duration dd = Duration.between(fecha1.atStartOfDay(), fecha2.atStartOfDay());
        return dd.toDays();
    }
    
    public void siguiente() {
        if (this.dia == diasMes(this.mes)) {
            this.dia = 1;
            if (this.mes == 12) {
                this.mes = 1;
                this.año++;
            } else {
                this.mes++;
            }
        } else {
            this.dia++;
        }
    }
    
    public void anterior() {
        if (this.dia == 1) {
            if (this.mes == 1) {
                this.dia = 31;
                this.mes = 12;
                this.año--;
            } else {
                this.dia = 31;
                this.mes--;
            }
        } else {
            this.dia--;
        }
    }
    
    public Fecha1 fechaFutura(int dia, int mes, int año){
        return new Fecha1(dia, mes, año);
    }
    
    public Fecha1 copia() {
	return new Fecha1(this.año, this.mes, this.dia);
    }
    
    public boolean igualQue(String Fecha1, String Fecha2) {
        LocalDate fecha1 = LocalDate.parse(Fecha1);
        LocalDate fecha2 = LocalDate.parse(Fecha2);
        if(fecha1.isEqual(fecha2))
            return true;
        else
            return false;
    }
    
   public boolean menorQue(String Fecha1, String Fecha2) {
        LocalDate fecha1 = LocalDate.parse(Fecha1);
        LocalDate fecha2 = LocalDate.parse(Fecha2);
        if (fecha1.isBefore(fecha2))
            return true;
        else
            return false;
    }
   
   public boolean mayorQue(String Fecha1, String Fecha2) {
        LocalDate fecha1 = LocalDate.parse(Fecha1);
        LocalDate fecha2 = LocalDate.parse(Fecha2);
        if (fecha1.isAfter(fecha2))
            return true;
        else
            return false;
    }
}
