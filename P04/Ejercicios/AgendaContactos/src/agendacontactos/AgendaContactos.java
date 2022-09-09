
package agendacontactos;
import java.util.*;
import java.util.ArrayList;
/**
 *
 * @author Deyner
 */
public class AgendaContactos {
    public static void main(String[] args) {
        ArrayList<Contacto> Lista = new ArrayList<Contacto>();
        Scanner sn = new Scanner(System.in);
        //Variables utilizadas
        boolean salir = false;
        int opcion, telefono;
        String nombre, direccion;
        //Menu
        do {
            //Mensajes del menu
            System.out.println("Menu");
            System.out.println("1. Añadir Contacto");
            System.out.println("2. Buscar Contacto");
            System.out.println("3. Modificar Contacto");
            System.out.println("4. Eliminar Contacto");
            System.out.println("5. Mostrar Contacto");
            System.out.println("6. Salir");
            System.out.println("Elije una opcion");
            opcion = sn.nextInt();
            switch (opcion) {
                //Añadir contacto
                case 1:
                    System.out.println("Ingrese el nombre:");
                    nombre = sn.next();
                    System.out.println("Ingrese el telefono:");
                    telefono = sn.nextInt();
                    System.out.println("Ingrese la direccion:");
                    direccion = sn.next();
                    Contacto Usuario = new Contacto(nombre,telefono,direccion);
                    Lista.add(Usuario);
                    break;
                //Buscar contacto
                case 2:
                    int opcionB;
                    int falla =0;
                    System.out.println("Ingrese el numero de contacto a buscar: ");
                    opcionB = sn.nextInt();
                    opcionB--;
                    for(int i=0;i < Lista.size() ;i++ ){
                        if ( opcionB == i){
                            System.out.println("Contacto N°"+(i+1)+" : ");
                            System.out.println(" -Nombre: "+ Lista.get(i).getNombre());
                            System.out.println(" -Telefono: "+ Lista.get(i).getTelefono());
                            System.out.println(" -Dirrecion: "+ Lista.get(i).getDirrecion());
                            falla++;
                        }
                    }
                    if(falla==0){
                        System.out.println("No existe el contacto con el nombre: "+(opcionB+1));
                    }
                    break;
                //Modificar contacto
                case 3:
                    int opcionM=0, telefonoM;
                    String nombreM, direccionM;
                    System.out.println("Ingrese el numero de contacto a modificar: ");
                    opcionM = sn.nextInt();
                    opcionM--;
                    if (opcionM>=0 && opcionM< Lista.size()){
                        System.out.println("Ingrese el nombre:");
                        nombreM = sn.next();
                        Lista.get(opcionM).setNombre(nombreM);
                        System.out.println("Ingrese el telefono:");
                        telefonoM = sn.nextInt();
                        Lista.get(opcionM).setTelefono(telefonoM);
                        System.out.println("Ingrese la direccion:");
                        direccionM = sn.next();
                        Lista.get(opcionM).setDirrecion(direccionM);
                    }else{
                        System.out.println("No existe el contacto N°"+(opcionM+1)); 
                    }
                    break;
                //Borrar contacto
                case 4:
                    int opcionBo=0;
                    System.out.println("Ingrese el numero de contacto a eliminar: ");
                    opcionBo = sn.nextInt();
                    opcionBo--;
                    if (opcionBo>=0 && opcionBo< Lista.size()){
                        Lista.remove(opcionBo);
                        System.out.println("---- El contacto ha sido eliminado con exito ----");
                    }else{
                        System.out.println("No existe el contacto N°"+(opcionBo+1)); 
                    }
                    break;
                //mostrar contactos
                case 5:
                    if (Lista.size()>0){
                        System.out.println("-----------Lista de contactos-----------");
                        for(int i=0;i < Lista.size() ;i++ ){
                            System.out.println("Contacto N°"+(i+1)+" : ");
                            System.out.println(" -Nombre: "+ Lista.get(i).getNombre());
                            System.out.println(" -Telefono: "+ Lista.get(i).getTelefono());
                            System.out.println(" -Dirrecion: "+ Lista.get(i).getDirrecion());
                        }
                    }else{
                        System.out.println("No hay contactos que mostrar");
                    }
                    break;
                //salir
                case 6:
                    salir = true;
                    break;
                default:
                    System.out.println("Tienes que meter un valor entre 1 y 6");
                }
            } while (!salir);
            System.out.println("FIN");
    }
}
   
