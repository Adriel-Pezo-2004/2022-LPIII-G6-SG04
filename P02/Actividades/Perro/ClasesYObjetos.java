/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clases.y.objetos;
import java.util.*;
/**
 *
 * @author Deyner
 */
public class ClasesYObjetos {

   /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
                
        //Creación de dos objetos solo ingresando la raza y el color
        Perro Fido = new Perro ("Chihuaha","Marron");
        Perro Pelusa = new Perro("Pequines"," Blanco");
        
        Fido.increEdad(2);
        Pelusa.increEdad(5);
        
        System.out.println(Fido.toString());
        
        //Verificación del estado de Fido:
        //Se crea un objeto de tipo diagnostico
        Diagnostico Diagnostico = new Diagnostico();
        //Llamamos al metodo pero ingresando como el valor el objeto de tipo perro "Fido"
        Diagnostico.aptoVacunaA(Fido);
        
        
        //Para ingresar datos al objeto de tipo perro
        Scanner s1 = new Scanner (System.in);
        System.out.println("Ingresa una temperatura");
        double miTemp = s1.nextDouble();
        System.out.println("Ingresa un peso");
        double miPeso = s1.nextDouble();
        System.out.println("Ingresa la edad");
        Integer miEdad = s1.nextInt();
        
        //Creación del objeto Usuario de tipo perro
        Perro Usuario = new Perro();
        
        //Asignación de los valores ingresados por el usuario
        Usuario.setTemp(miTemp);
        Usuario.peso = miPeso;
        Usuario.setEdad(miEdad);
        
        Diagnostico.aptoVacunaA(Usuario);
     
    }  
}  
