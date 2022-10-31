/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividades_sesion9;

import java.io.BufferedReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


public class ejercicio2_ {

    public static void main(String[] args) {

        JFileChooser fileChooser = new JFileChooser();
        int valor = fileChooser.showOpenDialog(fileChooser);
        if (valor == JFileChooser.APPROVE_OPTION) {
     
            
            String ruta = fileChooser.getSelectedFile().getAbsolutePath();
            int charCount = 0;
            int wordCount = 0;
            int lineCount = 0;

            BufferedReader lector;

            try {
                lector = new BufferedReader(new FileReader(ruta));
                String linea = lector.readLine();

                while (linea != null){
                    lineCount++;

                    String words[] = linea.split(" ");
                    wordCount = wordCount + words.length;

                    for(String word : words){
                        charCount = charCount + word.length();
                    }
                    linea = lector.readLine(); 
                }
                

                JOptionPane.showMessageDialog(null, String.format(
                    "Archivo: " + ruta+ "\n"+
                    "Total de lineas: " + lineCount + "\n"+
                    "Total de palabras: " + wordCount + "\n"+
                    "Total de caracteres: " + charCount + "\n"
            ));

            }catch (FileNotFoundException e){
                System.out.println(e.getMessage());

            }catch (IOException e){
                System.out.println(e.getMessage());
            }
        } else {
            System.out.println("No se ha seleccionado ningún fichero");
        }
    }
}

