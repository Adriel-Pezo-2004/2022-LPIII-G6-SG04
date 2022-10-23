/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicaciontrasnporte;

import javax.swing.JLabel; // muestra texto e imágenes
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.Icon;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


public class Etiquetas extends JFrame
{
    private JTextField campoTexto1; 
    private JTextField campoTexto2; 
    private JTextField campoTexto3;

    private final JLabel etiqueta1;
    private final JLabel etiqueta2;
    private final JLabel etiqueta3;
    private final JLabel etiqueta4;
    private final JLabel etiqueta5;
    private final JLabel etiqueta6;
    private final JLabel etiqueta7;
    private final JLabel etiqueta8;
    
    private final JButton botonBlanquear;
    private final JButton botonDatos;
    
    private JCheckBox audifonos;
    private JCheckBox mantas;
    private JCheckBox revistas;
    private String opcionCheckBox = "Ninguna";
    
    private final JRadioButton piso1;
    private final JRadioButton piso2;
    private ButtonGroup grupoOpciones;
    private String opcionPiso ="1er Piso";
    
    private final JComboBox<String> origen;
    private final JComboBox<String> destino;
    private String opcionOrigen ="Arequipa";
    private String opcionDestino ="Lima";
    private static final String origenNombres[] = {"Arequipa","Cuzco","Ica","Tacna"};
    private static final String destinoNombres[] = {"Lima","Loreto","Cajamarca","Trujillo"};
    
    private final JList<String> calidadServicio;
    private static final String[] servicios= {"Económico","Standard","VIP"};
    private String opcionServicio ="-----";
    
    public Etiquetas()
    {
        setLayout(new FlowLayout());
        
        //Ingresar Nombrea, DNI y fecha de viaje
        etiqueta1 = new JLabel("Nombres");
        add(etiqueta1);
        
        campoTexto1 = new JTextField(10);
        add(campoTexto1); 
        
        etiqueta2 = new JLabel("Documento de identidad");
        add(etiqueta2);
        
        campoTexto2 = new JTextField(10);
        add(campoTexto2); 
        
        etiqueta3 = new JLabel("Fecha viaje");
        add(etiqueta3);
        
        campoTexto3 = new JTextField(10);
        add(campoTexto3); 
        
        //Ingresar Servicios Adicionales
        etiqueta4 = new JLabel("Servicios adicionales");
        add(etiqueta4);
        
        audifonos = new JCheckBox("Audifonos");
        mantas = new JCheckBox("Mantas");
        revistas = new JCheckBox("Revistas");     
        add(audifonos);
        add(mantas);
        add(revistas);
        
        ManejadorCheckBox manejador = new ManejadorCheckBox();
        audifonos.addItemListener(manejador);
        mantas.addItemListener(manejador);
        revistas.addItemListener(manejador);
        
        //Ingresar el piso
        etiqueta5 = new JLabel("Piso");
        add(etiqueta5);
        
        piso1 = new JRadioButton("1er Piso", true);
        piso2 = new JRadioButton("2do Piso", true);
        add(piso1);
        add(piso2);
                
        grupoOpciones = new ButtonGroup();
        grupoOpciones.add(piso1);
        grupoOpciones.add(piso2);
        
        ManejadorBotonOpcion manejadorBotonOpcion = new ManejadorBotonOpcion();
        piso1.addItemListener(manejadorBotonOpcion);
        piso2.addItemListener(manejadorBotonOpcion);
        
        //Para ingresar destino y origen
        etiqueta6 = new JLabel("Origen");
        add(etiqueta6);
        origen = new JComboBox<String>(origenNombres);
        origen.setMaximumRowCount(3);
        origen.addItemListener(
            new ItemListener()
                {
                    @Override
                    public void itemStateChanged(ItemEvent evento)
                    {
                        opcionOrigen = (String)origen.getSelectedItem();
                    }
                }
        );
        add(origen);
        
        etiqueta7 = new JLabel("Destino");
        add(etiqueta7);
        destino = new JComboBox<String>(destinoNombres);
        destino.setMaximumRowCount(3);
        destino.addItemListener(
            new ItemListener()
                {
                    @Override
                    public void itemStateChanged(ItemEvent evento)
                    {
                        opcionDestino = (String)destino.getSelectedItem();
                    }
                }
        );
        add(destino);
        
        //Ingresar Calidad de servicio
        
        etiqueta8 = new JLabel("Calidad de servicio");
        add(etiqueta8);
        calidadServicio = new JList<String>(servicios);
        calidadServicio.setVisibleRowCount(3);
        
        add(new JScrollPane(calidadServicio));
        
        calidadServicio.addListSelectionListener(
                new ListSelectionListener()
                {
                    @Override
                    public void valueChanged(ListSelectionEvent evento)
                    {
                        opcionServicio = (String)calidadServicio.getSelectedValue();
                    }
                }
        );
        
        //Botones para blanquear o mostrar datos
        botonBlanquear = new JButton ("Reiniciar");
        add(botonBlanquear);
        
        botonDatos = new JButton ("Mostrar Datos");
        add(botonDatos);
        
        ManejadorBotonBlanquear blanqueo = new ManejadorBotonBlanquear();
        ManejadorBotonDatos datos = new ManejadorBotonDatos();
        botonBlanquear.addActionListener(blanqueo);
        botonDatos.addActionListener(datos); 
    }
    
    private class ManejadorBotonBlanquear implements ActionListener
    {    
        @Override
        public void actionPerformed(ActionEvent e) {
            campoTexto1.setText(null);
            campoTexto2.setText(null);
            campoTexto3.setText(null);
            opcionCheckBox = "---";
            opcionOrigen = "---";
            opcionDestino = "---";
            opcionServicio = "---";
        }
    }
    
    private class ManejadorBotonDatos implements ActionListener
    {    
        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(Etiquetas.this, String.format(
                    "Nombre: " + campoTexto1.getText() + "\n"+
                    "Documento de Identidad: " + campoTexto2.getText() + "\n"+
                    "Fecha de viaje: " + campoTexto3.getText() + "\n"+
                    "Servicios Adicionales: " + opcionCheckBox + "\n"+
                    "Piso: " + opcionPiso + "\n"+
                    "Origen: " + opcionOrigen + "\n"+
                    "Destino: " + opcionDestino + "\n"+
                    "Servicio: " + opcionServicio + "\n"
            ));
        }
    }
    
     private class ManejadorCheckBox implements ItemListener
    {
        @Override
        public void itemStateChanged(ItemEvent evento)
        {
            if (audifonos.isSelected() && mantas.isSelected() && revistas.isSelected())
            {
                opcionCheckBox = "Audifonos, mantas y revistas";
            }
            else if (audifonos.isSelected() && mantas.isSelected())
            {
                opcionCheckBox = "Audifonos y mantas";
            }
            else if (audifonos.isSelected() && revistas.isSelected())
            {
                opcionCheckBox = "Audifono y revistas";
            }
            else if (mantas.isSelected() && revistas.isSelected())
            {
                opcionCheckBox = "Mantas y revistas";
            }
            else
            {
                opcionCheckBox = "Ninguna";
            }
        }
        
    }
     
     private class ManejadorBotonOpcion implements ItemListener
    {
        @Override
        public void itemStateChanged(ItemEvent e) {
            if (piso1.isSelected())
            {
                opcionPiso = "1er Piso";
            }
            if (piso2.isSelected())
            {
                opcionPiso = "2do Piso";
            }
        }
    }
}
