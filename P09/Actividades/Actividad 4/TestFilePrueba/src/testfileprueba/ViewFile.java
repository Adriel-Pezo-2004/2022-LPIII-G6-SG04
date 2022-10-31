/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testfileprueba;
import javax.swing.JFrame;
import javax.swing.JTextArea;
/**
 *
 * @author Victus
 */
public class ViewFile extends JFrame{
    private JTextArea areaTexto;
    public ViewFile(String s) {
        super("Mostrando el contenido de un archivo");
        areaTexto = new JTextArea(s,5, 40);
        add(areaTexto);
    }
}
