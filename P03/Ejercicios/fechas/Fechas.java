package fechas;

/**
 *
 * @author Deyner
 */
public class Fechas {

    public boolean igualQue(Fecha f1, Fecha f2){
        String fecha1;
        String fecha2;
        fecha1=f1.corta();
        fecha2=f2.corta();
        if (fecha1 == fecha2){
            return true;
        }
        else
            return false;
    }
    
    public static void main(String[] args) {
        
    }
    
}
