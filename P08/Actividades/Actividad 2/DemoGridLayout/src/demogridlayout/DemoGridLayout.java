/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package demogridlayout;
import javax.swing.JFrame;
/**
 *
 * @author Victus
 */
public class DemoGridLayout {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MarcoGridLayout marcoGridLayout = new MarcoGridLayout(); 
        marcoGridLayout.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marcoGridLayout.setSize(300, 200);
        marcoGridLayout.setVisible(true);
    }
}
