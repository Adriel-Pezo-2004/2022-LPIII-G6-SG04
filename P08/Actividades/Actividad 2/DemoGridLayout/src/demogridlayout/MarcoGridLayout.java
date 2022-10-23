/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demogridlayout;
import java.awt.GridLayout; 
import java.awt.Container; 
import java.awt.event.ActionListener; 
import java.awt.event.ActionEvent; 
import javax.swing.JFrame; 
import javax.swing.JButton;
/**
 *
 * @author Victus
 */
public class MarcoGridLayout extends JFrame implements ActionListener{
    private final JButton[] botones;
    private static final String[] nombres = { "uno", "dos", "tres", "cuatro", "cinco", "seis" };
    private boolean alternar = true;
    private Container contenedor;
    private GridLayout cuadricula1;
    private GridLayout cuadricula2;
    
    public MarcoGridLayout(){
        super("Demostracion de GridLayout: ADRIEL, DEYNER Y PAOLO");
        cuadricula1 = new GridLayout(2, 3, 5, 5);
        cuadricula2 = new GridLayout(3, 2);
        contenedor = getContentPane();
        setLayout(cuadricula1);
        botones = new JButton[nombres.length];
        
        for (int cuenta = 0; cuenta < nombres.length; cuenta++){
            botones[cuenta] = new JButton(nombres[cuenta]);
            botones[cuenta].addActionListener(this);
            add(botones[cuenta]);
        }
    }
        // maneja eventos de boton, alternando entre los esquemas
        @Override
        public void actionPerformed(ActionEvent evento){
            if (alternar){
                contenedor.setLayout(cuadricula2);
            }
            else {
                contenedor.setLayout(cuadricula1);
            }
            alternar = !alternar;
            contenedor.validate();
        }      
}
