
package actividad1;

public class Actividad1 {
    
    public static void main(String[] args) {
        Persona Juan = new Persona ("Juan","Arequipa","12345");
        Persona Pablo = new Persona ("Pablo","Cuzco","54321");
        Persona ArregloPersona[] = {Juan,Pablo};
        String buscador1 = "Juan";
        boolean validador1 = false;
        for (int i=0; i<ArregloPersona.length; i++){
            if ( ArregloPersona[i].contiene(buscador1) == true){
                validador1 = true;
            }
        }
        if (validador1){
            System.out.printf("La persona "+buscador1+" existe%n");
        }
        else{
            System.out.printf("La persona "+buscador1+" no existe%n");            
        }
        
        Goodies Galleta = new Goodies (12,"Oreo",12);
        Goodies Chupetin = new Goodies (10,"Fresa",5);
        Goodies ArregloGoodies[] = {Galleta,Chupetin};
        int buscador2 = 10;
        boolean validador2 = false;
        for (int i=0; i<ArregloGoodies.length; i++){
            if ( ArregloGoodies[i].contiene(buscador2) == true){
                validador2 = true;
            }
        }
        if (validador2){
            System.out.printf("La golosina con id "+buscador2+" existe%n");
        }
        else{
            System.out.printf("La golosina con id "+buscador2+" no existe%n");            
        }
        
    }
    
}
