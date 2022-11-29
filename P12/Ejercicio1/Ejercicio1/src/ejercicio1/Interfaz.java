
package ejercicio1;


import java.sql.*; 
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.event.WindowEvent;    
import java.awt.event.WindowListener;  

public class Interfaz extends javax.swing.JFrame {

    Statement stmt; 
    Connection con;
    ResultSet rs;
    
    
    public Interfaz() {
        initComponents();
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/personas","root","root");
            con.setAutoCommit(false);
            Statement stmt=con.createStatement();
            recogerStatement(stmt);
            recogerConnection(con);
            actualizarLista();
        } catch(Exception e){
            mensaje(e.getMessage());
        }
    }
    
    public void recogerStatement(Statement stmt1){
        stmt = stmt1;
    }
    
    public void recogerConnection(Connection con1){
        con = con1;
    }
    
    public void windowClosing (WindowEvent e){
        try{
            con.close();
        }catch(Exception ex){
            mensaje(ex.getMessage());
        }
    };
    
    public void mensaje(String texto){
        JOptionPane.showMessageDialog(null, texto);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        submitQuery = new javax.swing.JButton();
        applyFilter = new javax.swing.JButton();
        campoQuery = new javax.swing.JTextField();
        campoFilter = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        submitQuery.setText("Sumbit Query");
        submitQuery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitQueryActionPerformed(evt);
            }
        });

        applyFilter.setText("Apply Filter");
        applyFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applyFilterActionPerformed(evt);
            }
        });

        campoQuery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoQueryActionPerformed(evt);
            }
        });

        jLabel2.setText("Filter :");

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
            }
        ));
        jScrollPane1.setViewportView(tabla);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(applyFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(campoQuery)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(submitQuery))
                    .addComponent(jScrollPane1))
                .addGap(64, 64, 64))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoQuery, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(submitQuery, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(applyFilter))
                .addContainerGap(117, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoQueryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoQueryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoQueryActionPerformed

    private void applyFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_applyFilterActionPerformed
        this.applytFilter();
    }//GEN-LAST:event_applyFilterActionPerformed

    private void submitQueryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitQueryActionPerformed
        this.submitQuery();
    }//GEN-LAST:event_submitQueryActionPerformed
    
    
    public void actualizarLista(){
        DefaultTableModel dt = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        
        dt.addColumn("Nombre");
        dt.addColumn("Apellido");
        dt.addColumn("Sueldo");
        
        Object fila[] = new Object[dt.getColumnCount()];
        try{
            rs=stmt.executeQuery("select * from empleados");
            while(rs.next()){
                fila[0] = rs.getString(2);
                fila[1] = rs.getString(3);
                fila[2] = "S/. "+rs.getInt(1);
                dt.addRow(fila);
            }
        } catch(Exception e){
            mensaje(e.getMessage());
        }
        
        tabla.setModel(dt);
        tabla.setRowHeight(60);
    }
    
    public void comandoLista(ResultSet rs){
        DefaultTableModel dt = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        
        dt.addColumn("Nombre");
        dt.addColumn("Apellido");
        dt.addColumn("Sueldo");
        
        Object fila[] = new Object[dt.getColumnCount()];
        try{
            while(rs.next()){
                fila[0] = rs.getString(2);
                fila[1] = rs.getString(3);
                fila[2] = "S/. "+rs.getInt(1);
                dt.addRow(fila);
            }
        } catch(Exception e){
            mensaje(e.getMessage());
        }
        
        tabla.setModel(dt);
        tabla.setRowHeight(60);
    }
    
    public void submitQuery(){
        try{
            if(leerQuery() == null) mensaje("Ingresar Query");
            else{
                if(leerQuery().toUpperCase().contains("WHERE")) mensaje("La clausula 'WHERE' se debe poner en el campo de filter");
                else{
                    switch (identificadorClausula()) {
                        case 1:
                            rs=stmt.executeQuery(leerQuery());
                            comandoLista(rs);
                            break;
                        case 2:
                            stmt.executeUpdate(leerQuery());
                            con.commit();
                            actualizarLista();
                            break;
                        case 3:
                            mensaje("El comando no tiene ninguna clausula válida para ejecutar");
                            break;
                        case 0:
                            mensaje("Ocurrio un error al momento de leer las clausulas");
                            break;
                    }
                }
            }
        }catch(Exception e){
            mensaje(e.getMessage());
        }
    }
    
    public void applytFilter(){
        try{
            if(leerQuery() == null) mensaje("Ingresar Query");
            else if (leerFilter() == null) mensaje("Ingresar Filter");
            else{
                if(leerQuery().toUpperCase().contains("WHERE")) mensaje("La clausula 'WHERE' se debe poner solamente en el campo de filter");
                else{
                    if (leerFilter().toUpperCase().contains("SELECT")){
                        mensaje("La clausula 'SELECT' se debe de poner en el campo de Query");
                    }
                    else if (leerFilter().toUpperCase().contains("UPDATE")){
                        mensaje("La clausula 'UPDATE' se debe de poner en el campo de Query");
                    }
                    else if (leerFilter().toUpperCase().contains("DELETE")){
                        mensaje("La clausula 'DELETE' se debe de poner en el campo de Query");
                    }else{
                        if(leerFilter().toUpperCase().contains("WHERE")){
                            switch (identificadorClausula()) {
                            case 1:
                                rs=stmt.executeQuery(leerQuery()+" "+leerFilter());
                                comandoLista(rs);
                                break;
                            case 2:
                                stmt.executeUpdate(leerQuery()+" "+leerFilter());
                                con.commit();
                                actualizarLista();
                                break;
                            case 3:
                                mensaje("El comando no tiene ninguna clausula válida para ejecutar");
                                break;
                            case 0:
                                mensaje("Ocurrio un error al momento de leer las clausulas");
                                break;
                            }
                        }else{
                            mensaje("Falta colocar la clausula 'WHERE'");
                        }
                    }
                }
            }
        }catch(Exception e){
            mensaje(e.getMessage());
        }
    }
    
    public int identificadorClausula(){
        try{
            if (leerQuery().toUpperCase().contains("SELECT")){
                return 1;
            }
            else if (leerQuery().toUpperCase().contains("UPDATE")){
                return 2;
            }
            else if (leerQuery().toUpperCase().contains("DELETE")){
                return 2;
            }else{
                return 3;
            }
        }catch(Exception e){
            return 0;
        }
    }
    
    public String leerQuery(){
        try{
            if(campoQuery.getText().isEmpty()){
                return null;
            }else{
                return campoQuery.getText();
            }
            
        }catch(Exception e){
            return null;
        }
    }
    
    public String leerFilter(){
        try{
            if(campoFilter.getText().isEmpty()){
                return null;
            }else{
                return campoFilter.getText();
            }
            
        }catch(Exception e){
            return null;
        }
    }
        
    public static void main(String args[]) {
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton applyFilter;
    private javax.swing.JTextField campoFilter;
    private javax.swing.JTextField campoQuery;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton submitQuery;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
