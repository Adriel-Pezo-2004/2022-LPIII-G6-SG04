/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ejercicio.pkg1;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Deyner
 */
public class Interfaz extends javax.swing.JFrame {
    
    private String ruta_txt = "C:\\Users\\Deyner\\Documents\\Universidad\\4 SEMESTRE\\L.P3 - 06\\Practica 9\\Ejercicios\\Ejercicio 1\\src\\ejercicio\\pkg1\\DatosEmpleados.txt"; 

    
    Empleado empleado;
    Proceso proceso;
    
    public Interfaz() {
        initComponents();
        proceso = new Proceso();
        
        try{
            reporteEmpleados();
            listarRegistro();
        }catch(Exception ex){
            mensaje("No existe el archivo txt");
        }
        
    }
    public void mensaje(String texto){
        JOptionPane.showMessageDialog(null, texto);
    }
    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTextField1 = new javax.swing.JTextField();
        txtruta = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        campoNumero = new javax.swing.JTextField();
        campoNombre = new javax.swing.JTextField();
        campoSueldo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        agregarElemento = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jTextField1.setText("jTextField1");

        txtruta.setEditable(false);
        txtruta.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        txtruta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtrutaActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Numero");

        jLabel2.setText("Nombre");

        jLabel3.setText("Sueldo");

        campoNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNumeroActionPerformed(evt);
            }
        });

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "N??mero", "Nombre", "Sueldo"
            }
        ));
        jScrollPane1.setViewportView(tabla);

        agregarElemento.setText("Agregar Empleado");
        agregarElemento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarElementoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(284, 284, 284)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(campoSueldo)
                        .addGap(112, 112, 112))
                    .addComponent(campoNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(agregarElemento, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(182, 182, 182))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 565, Short.MAX_VALUE)
                .addGap(132, 132, 132))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(campoNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(campoSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(agregarElemento)
                .addGap(51, 51, 51)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNumeroActionPerformed

    private void agregarElementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarElementoActionPerformed
        File ruta = new File(txtruta.getText());
        this.ingresarRegistro(ruta);
    }//GEN-LAST:event_agregarElementoActionPerformed

    private void txtrutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtrutaActionPerformed
  // TODO add your handling code here:
    }//GEN-LAST:event_txtrutaActionPerformed
    
    public void reporteEmpleados(){
        File ruta = new File(ruta_txt);
        try{
            
            FileReader fi = new FileReader(ruta);
            BufferedReader bu = new BufferedReader(fi);
            
            
            String linea = null;
            while((linea = bu.readLine())!=null){
                StringTokenizer st = new StringTokenizer(linea, ", ");
                empleado = new Empleado();
                empleado.setNombre(st.nextToken());
                empleado.setNumero(Integer.parseInt(st.nextToken()));
                empleado.setSueldo(Double.parseDouble(st.nextToken()));
                proceso.agregarRegistro(empleado);
            }
            bu.close();
        }catch(Exception ex){
            mensaje("Error al cargar archivo: "+ex.getMessage());
            System.out.println(ex.getMessage());
        }
    }
    
    public void agregarEmpleado(){
        FileWriter fw;
        PrintWriter pw;
        try{
            fw = new FileWriter(ruta_txt);
            pw = new PrintWriter(fw);
            
            for(int i = 0; i < proceso.cantidadRegistro(); i++){
                empleado = proceso.obtenerRegistro(i);
                pw.println(String.valueOf(empleado.getNombre()+", "+empleado.getNumero()+", "+empleado.getSueldo()));
            }
            pw.close();
            
        }catch(Exception ex){
            mensaje("Error al grabar archivo: "+ex.getMessage());
            System.out.println(ex.getMessage());
        }
    }
    
    public void ingresarRegistro(File ruta){
        try{
            if(leerNumero() == 1)mensaje("Ingresar codigo entero");
            else if(leerNombre() == null)mensaje("Ingresar Nombre");
            else if(leerSueldo() == 1) mensaje("Ingresar Precio");
            else{
                empleado = new Empleado(leerNombre(), leerNumero(), leerSueldo());
                proceso.agregarRegistro(empleado);
                
                agregarEmpleado();
                listarRegistro();
                campoNumero.setText(null);
                campoNombre.setText(null);
                campoSueldo.setText(null);
            }
        }catch(Exception ex){
            mensaje(ex.getMessage());
        }
    }
    
    public void listarRegistro(){
        DefaultTableModel dt = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        
        dt.addColumn("Nombre");
        dt.addColumn("N??mero");
        dt.addColumn("Sueldo");
                
        Object fila[] = new Object[dt.getColumnCount()];
        for(int i = 0; i < proceso.cantidadRegistro(); i++){
            empleado = proceso.obtenerRegistro(i);
            fila[0] = empleado.getNombre();
            fila[1] = empleado.getNumero();
            fila[2] = empleado.getSueldo();
            dt.addRow(fila);
        }
        tabla.setModel(dt);
        tabla.setRowHeight(60);
    }
    
    public int leerNumero(){
        try{
            int codigo = Integer.parseInt(campoNumero.getText().trim());
            return codigo;
        }catch(Exception ex){
            return 1;
        }
    }
    
    public String leerNombre(){
        try{
            String nombre = campoNombre.getText().trim().replace(" ", "_");
            return nombre;
        }catch(Exception ex){
            return null;
        }
    }
    
    public double leerSueldo(){
        try{
            double precio = Double.parseDouble(campoSueldo.getText().trim());
            return precio;
        }catch(Exception ex){
            return 1;
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarElemento;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JTextField campoNumero;
    private javax.swing.JTextField campoSueldo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtruta;
    // End of variables declaration//GEN-END:variables




}
