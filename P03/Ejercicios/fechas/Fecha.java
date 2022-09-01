
package fechas;
import java.util.*;

/**
 *
 * @author Deyner
 */
public class Fecha {
    private int dia;
    private int mes;
    private int anio;
    Scanner s1 = new Scanner (System.in);
    
    public Fecha() {
     this.dia = 1;
     this.mes = 1;
     this.anio = 1900;
    }

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        valida();
    }
    
    public void leer(){
        int midia;
        int mimes;
        int mianio;
        System.out.println("Introduzca el dia: ");
        midia = s1.nextInt();
        System.out.println("Introduzca el mes: ");
        mimes = s1.nextInt();
        System.out.println("Introduzca el año: ");
        mianio = s1.nextInt();
        valida();
    }
    
    public boolean bisiesto(){
        if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0)))
	return true;
        else
        return false;
    }
    
    public int diaMes(){
        int dia=0;
        boolean bisiesto;
        bisiesto = bisiesto();
        if (mes == 1 || mes == 3|| mes == 5|| mes == 7|| mes == 8|| mes == 10|| mes == 12){
            dia = 31;
        }
        if (mes == 4|| mes == 6|| mes == 9|| mes == 11){
            dia = 30;
        }
        if (mes ==2){
            if (bisiesto == true){
                dia = 29;
            }
            else{
                dia = 28;
            }
        }
        return dia;
    }
    
    private void valida(){
        if(0>dia || dia>31){
            dia=1;
        }
        if (0>mes || mes >12){
            mes=1;
        }
        if (1899>anio || anio>2050){
            anio=1900;
        }
    }
    
    public String corta(){
        return dia+"-"+mes+"-"+anio;
    }
    
    

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    
    
    
}
