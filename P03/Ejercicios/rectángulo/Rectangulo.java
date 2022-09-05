/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rectángulo;

/**
 *
 * @author Deyner   
 */
public class Rectangulo {
    private Coordenada esquina1;
    private Coordenada esquina2;
    static String color;
    static int contador;

    public Rectangulo(Coordenada c1, Coordenada c2) {
        this.esquina1 = c1;
        this.esquina2 = c2;
        Rectangulo.setcolor();
        contador++;
    }

    public Rectangulo(int altura , int base) {
        this.esquina1 = new Coordenada(0,0);
        this.esquina2 = new Coordenada(base,altura);
        Rectangulo.setcolor();
        contador++;
    }
    
    public static void setcolor(){
        if (Rectangulo.contador == 3){
            Rectangulo.contador = 0;
        }
        switch(Rectangulo.contador){
            case 0:
                Rectangulo.color="Verde";
                break;
            case 1:
                Rectangulo.color="Amarillo";
                break;
            case 2:
                Rectangulo.color="Rojo";
                break;
        }
    }
    
    public String color(){
        return Rectangulo.color;
    }
    
    public Coordenada getEsquina1() {
        return esquina1;
    }

    public Coordenada getEsquina2() {
        return esquina2;
    }

    public void setEsquina1(Coordenada esquina1) {
        this.esquina1 = esquina1;
    }

    public void setEsquina2(Coordenada esquina2) {
        this.esquina2 = esquina2;
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "esquina1=" + esquina1 + ", esquina2=" + esquina2 + ", color=" + color + '}';
    }
    
    
    
    
}
