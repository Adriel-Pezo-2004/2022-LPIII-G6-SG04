/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demoborderlayout;
import java.awt.BorderLayout;
import java.awt.event.ActionListener; 
import java.awt.event.ActionEvent; 
import javax.swing.JFrame; 
import javax.swing.JButton;
/**
 *
 * @author Victus
 */
public class MarcoBorderLayout extends JFrame implements ActionListener {
    private final JButton botones[];
    private static final String nombres[] = {"Ocultar Norte", "Ocultar Sur", "Ocultar Este", "Ocultar Oeste", "Ocultar Centro"};
    private final BorderLayout esquema;
    public MarcoBorderLayout(){
        super("Demostracion de BorderLayout: ADRIEL, DEYNER Y PAOLO");
        esquema = new BorderLayout(5, 5); // espacios de 5 píxeles
        setLayout(esquema);
        botones = new JButton[nombres.length];
        // crea objetos JButton y registra componentes de escucha para ellos
        for (int cuenta = 0; cuenta < nombres.length; cuenta++){
            botones[cuenta] = new JButton(nombres[cuenta]);
            botones[cuenta].addActionListener(this);
        }
        add(botones[0], BorderLayout.NORTH);
        add(botones[1], BorderLayout.SOUTH);
        add(botones[2], BorderLayout.EAST);
        add(botones[3], BorderLayout.WEST);
        add(botones[4], BorderLayout.CENTER);
    }
    @Override
    public void actionPerformed(ActionEvent evento){
    // comprueba el origen del evento y distribuye el panel de contenido de manera acorde
    for (JButton boton : botones){
        if (evento.getSource() == boton){
            boton.setVisible(false);
        }
        else{
            boton.setVisible(true);
        }// muestra los demás botones
    }
    esquema.layoutContainer(getContentPane()); // distribuye el panel de contenido
    }
} // fin de la clase MarcoBorderLayout
