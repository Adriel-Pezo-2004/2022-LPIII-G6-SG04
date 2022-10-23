
package botonescomando;
import java.awt.FlowLayout; 
import java.awt.event.ActionListener; 
import java.awt.event.ActionEvent; 
import javax.swing.JFrame; 
import javax.swing.JButton; 
import javax.swing.Icon; 
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class MarcoBoton extends JFrame
{    
    private final JButton botonJButtonSimple;
    private final JButton botonJButtonElegante;
    
    public MarcoBoton()
    {
        super("Deyner Cuadros-Paolo Rivera-Adriel Pezo");
        setLayout(new FlowLayout());
        
        botonJButtonSimple = new JButton ("Boton Simple");
        add(botonJButtonSimple);
        
        Icon gato = new ImageIcon(getClass().getResource("gato.gif"));
        Icon elmo = new ImageIcon(getClass().getResource("elmo.gif"));
        botonJButtonElegante = new JButton("Boton elegante", gato);
        
        botonJButtonElegante.setRolloverIcon(elmo);
        add(botonJButtonElegante);
        
        ManejadorBoton manejador = new ManejadorBoton();
        botonJButtonElegante.addActionListener(manejador);
        botonJButtonSimple.addActionListener(manejador);        
    }
    
    private class ManejadorBoton implements ActionListener
    {    
        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(MarcoBoton.this, String.format("Usted oprimio: %s", e.getActionCommand()));
        }
    }
}
