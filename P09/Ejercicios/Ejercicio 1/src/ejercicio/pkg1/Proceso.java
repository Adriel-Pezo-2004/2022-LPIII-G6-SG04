/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg1;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author David
 */
public class Proceso {
    
    private ArrayList<Object> a = new ArrayList<Object>();
    
    public Proceso(){}
    
    public Proceso(ArrayList<Object> a){
        this.a = a;
    }
    
    public void agregarRegistro(Empleado p){
        this.a.add(p);
    }
    
    public Empleado obtenerRegistro(int i){
        return (Empleado)a.get(i);
    }
    
    public int cantidadRegistro(){
        return this.a.size();
    }
    
}
