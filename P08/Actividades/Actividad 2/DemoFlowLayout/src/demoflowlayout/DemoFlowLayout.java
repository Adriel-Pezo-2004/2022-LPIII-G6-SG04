/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package demoflowlayout;
import javax.swing.JFrame;
/**
 *
 * @author Victus
 */
public class DemoFlowLayout {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        MarcoFlowLayout marcoFlowLayout = new MarcoFlowLayout();
        marcoFlowLayout.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marcoFlowLayout.setSize(300, 75); 
        marcoFlowLayout.setVisible(true);
    } 
}
