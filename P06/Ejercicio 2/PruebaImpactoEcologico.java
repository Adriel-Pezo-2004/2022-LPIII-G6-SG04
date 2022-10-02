/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author Usuario
 */
public class PruebaImpactoEcologico {
    public static void main(String[] args) {
        
        ImpactoEcologico[] Impacto;
        Impacto = new ImpactoEcologico[3];

        Impacto[0] = new Auto("Automovil: Minivan", 80, 120, 15);
        Impacto[1] = new Edificio("Edificio: Departamentos", 220, 100);
        Impacto[2] = new Bicicleta("Biclicleta: BMX", 40, 180, 200);
        
        for (ImpactoEcologico ImpactoActual : Impacto){
            System.out.println(ImpactoActual.toString());
            System.out.println("El impacto ecológico es = "+ImpactoActual.impacto_ecologico() + "\n");
        }
    }
}
