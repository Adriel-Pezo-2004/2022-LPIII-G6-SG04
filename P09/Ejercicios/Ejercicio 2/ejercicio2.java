/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividades_sesion9;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Paolo
 */
public class ejercicio2 {  
    
    public static void main(String[] args) {
        
        String path = "d:/datos.txt";       
        int charCount = 0;
        int wordCount = 0;
        int lineCount = 0;
        
        BufferedReader lector;
        
        try {
            lector = new BufferedReader(new FileReader(path));
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
            System.out.println("Archivo: " + path);
            System.out.println("Total de lineas: " + lineCount);
            System.out.println("Total de palabras: " + wordCount);
            System.out.println("Total de caracteres: " + charCount);
            
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
            
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
    
}
    