/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturacion;

import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author villegasevil
 */
public class Facturas extends javax.swing.JFrame implements DatosQuemados {

    private Date fechaAct= new Date();
    private DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    
    private static String nomProd;
    private static double precioU;
    private static Double total;
    private static Double cant;
    
    private static String numF;
            
    private static String nomC;
    private static String apellC;
    private static String telfC;
    private static String direcC;
    private static String id_C;
    
    DefaultTableModel modeloFact;
    
    public Facturas() {
        initComponents();
        
        t_nomE.setText(nomEmpresa);
        t_nifE.setText(NIF);
        t_telfE.setText(telef);
        t_direccE.setText(direccion);
        t_correoE.setText(correoE);
        
        fechaF.setText(String.valueOf(dateFormat.format(fechaAct)));
        fechaF.setEnabled(false);
        llenarComboPro();
        llenarComboCli();
        factura_Im.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        t_nomE = new javax.swing.JTextField();
        t_nifE = new javax.swing.JTextField();
        t_direccE = new javax.swing.JTextField();
        t_telfE = new javax.swing.JTextField();
        t_correoE = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        nFact = new javax.swing.JTextField();
        fechaF = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        ComboProd = new javax.swing.JComboBox<>();
        ComboCli = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cantProd = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaFact = new javax.swing.JTable();
        BotonAgregar = new javax.swing.JButton();
        totalF = new javax.swing.JLabel();
        t_total = new javax.swing.JTextField();
        BotonRegistrar = new javax.swing.JButton();
        BotonAtras = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        factura_Im = new javax.swing.JTextArea();

        jLabel10.setText("jLabel10");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("REGISTRO DE FACTURA");

        jLabel2.setText("Datos de la Empresa:");

        jLabel3.setText("Nombre:");

        jLabel4.setText("NIF:");

        jLabel5.setText("Direccion:");

        jLabel6.setText("Telefono:");

        jLabel7.setText("Correo:");

        t_nomE.setEditable(false);
        t_nomE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_nomEActionPerformed(evt);
            }
        });

        t_nifE.setEditable(false);
        t_nifE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_nifEActionPerformed(evt);
            }
        });

        t_direccE.setEditable(false);

        t_telfE.setEditable(false);
        t_telfE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_telfEActionPerformed(evt);
            }
        });

        t_correoE.setEditable(false);

        jLabel8.setText("Datos del Cliente:");

        jLabel15.setText("Datos de la Factura:");

        jLabel16.setText("Nº Factura:");

        jLabel17.setText("Fecha Emision:");

        jLabel18.setText("Detalle de la Factura:");

        jLabel19.setText("Poducto: ");

        ComboProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboProdActionPerformed(evt);
            }
        });

        ComboCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboCliActionPerformed(evt);
            }
        });

        jLabel20.setText("Identificacion:");

        jLabel9.setText("Cantidad:");

        cantProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantProdActionPerformed(evt);
            }
        });

        jLabel11.setText("TOTAL:");

        tablaFact.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaFact);

        BotonAgregar.setText("Agregar");
        BotonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAgregarActionPerformed(evt);
            }
        });

        t_total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_totalActionPerformed(evt);
            }
        });

        BotonRegistrar.setText("Registrar");
        BotonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRegistrarActionPerformed(evt);
            }
        });

        BotonAtras.setText("Atras");
        BotonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAtrasActionPerformed(evt);
            }
        });

        factura_Im.setEditable(false);
        factura_Im.setColumns(20);
        factura_Im.setRows(5);
        jScrollPane2.setViewportView(factura_Im);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(519, 519, 519)
                                .addComponent(totalF, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel7)))
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel15)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel17)
                                            .addComponent(jLabel16)))
                                    .addComponent(jLabel18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel20)
                                        .addComponent(jLabel8))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel11)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel19)))))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(t_correoE)
                                    .addComponent(t_telfE)
                                    .addComponent(t_nifE)
                                    .addComponent(t_direccE)
                                    .addComponent(t_nomE))
                                .addGap(118, 118, 118))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(nFact, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                                        .addComponent(fechaF))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(ComboProd, javax.swing.GroupLayout.Alignment.LEADING, 0, 127, Short.MAX_VALUE)
                                        .addComponent(ComboCli, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cantProd, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(127, 127, 127)
                                        .addComponent(BotonAgregar)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(t_total, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BotonRegistrar, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(BotonAtras, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addGap(23, 23, 23))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BotonRegistrar)
                        .addGap(18, 18, 18)
                        .addComponent(BotonAtras)
                        .addGap(36, 36, 36)
                        .addComponent(totalF, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(382, 382, 382)
                                .addComponent(jLabel14))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel16)
                                    .addComponent(nFact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17)
                                    .addComponent(fechaF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(25, 25, 25)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(t_nomE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(t_nifE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(t_direccE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(t_telfE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(t_correoE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ComboCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel20))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel19)
                                    .addComponent(ComboProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cantProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(BotonAgregar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jLabel11))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(t_total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(52, 52, 52)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void t_nomEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_nomEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_nomEActionPerformed

    private void t_nifEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_nifEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_nifEActionPerformed

    private void t_telfEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_telfEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_telfEActionPerformed

    private void ComboProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboProdActionPerformed
        
    }//GEN-LAST:event_ComboProdActionPerformed

    private void ComboCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboCliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboCliActionPerformed

    private void cantProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantProdActionPerformed

    private void BotonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAgregarActionPerformed
        llenarTabla();
    }//GEN-LAST:event_BotonAgregarActionPerformed

    private void t_totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_totalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_totalActionPerformed

    private void BotonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegistrarActionPerformed
        RegistrarFactura();
        factura_Im.setVisible(true);
        factura_Im.setText(
        "   Datos de la Empresa:"+"\n"
                + nomEmpresa+"\n"+
                NIF+"\n"+
                direccion+"\n"+
                telef+"\n"+
                correoE+"\n"+
        "   Nº Factura: "+ nFact+"\n"+
        "   Fecha Emision: "+fechaF+"\n"+
        "   Datos del Cliente:"+"\n"
                +"Nombre: "+nomC+"\n"+
                "Apellido: "+apellC+"\n"+
                "Identificacion: "+id_C+"\n"+
                "Telefono"+telfC+"\n"+
                "Direccion: "+direcC+"\n"+
        "   Detalle de la Factura:"+"\n"
                +"Cantidad: "+nomProd+"\n"+
                "Cantidad: "+ cant+"\n"+
                "Precio Unitario: "+precioU+"\n"+
                "Total de la Factura: "+ total+"\n"
        );
    }//GEN-LAST:event_BotonRegistrarActionPerformed

    private void BotonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAtrasActionPerformed
        this.setVisible(false);
        Sistema sist= new Sistema();
        sist.setVisible(true);
    }//GEN-LAST:event_BotonAtrasActionPerformed
    
    

    
    private void RegistrarFactura(){
        
        try{
        BaseDatos connect= new BaseDatos();
        Connection cnn= (Connection) connect.conexion();
               
        numF= nFact.getText();
        String fecha=fechaF.getText();
                
        id_C= (String) ComboCli.getSelectedItem();
        String sqlC= "SELECT * FROM clientes WHERE id_Cli LIKE '"+id_C+"'";
        
        nomProd= (String) ComboProd.getSelectedItem();
          
        Statement st = cnn.createStatement();
        ResultSet rs= st.executeQuery(sqlC);
        while(rs.next()){
            nomC=rs.getString("nom_Cli");
            apellC=rs.getString("apell_Cli");
            direcC=rs.getString("direc_Cli");
            telfC=rs.getString("telef_Cli");
        }
        
        String sqlF="INSERT INTO facturas (nFact, fechaFact, nomE, nifE, direcE, telfE, correoE, nomC, apellC, idC, telfC, direcC, nomP, precioUP, totalF) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        
        PreparedStatement psd= cnn.prepareStatement(sqlF);
        psd.setString(1,numF);
        psd.setString(2,fecha);
        psd.setString(3,nomEmpresa);
        psd.setString(4,NIF );
        psd.setString(5,direccion);
        psd.setString(6,telef);
        psd.setString(7,correoE);
        psd.setString(8,nomC);
        psd.setString(9,apellC);
        psd.setString(10,id_C);
        psd.setString(11,telfC);
        psd.setString(12,direcC);
        psd.setString(13,nomProd);
        psd.setString(14,String.valueOf(precioU));
        psd.setString(15,String.valueOf(total));
        
        int n= psd.executeUpdate();
            if(n>0){
                JOptionPane.showMessageDialog(null,"Registro Exitoso" ); 
            }
        }catch(SQLException  e){
            JOptionPane.showMessageDialog(null,e);
        }  
    }
    private void llenarTabla(){
        try{
        BaseDatos connect= new BaseDatos();
        Connection cnn= (Connection) connect.conexion();
        String []titulos={"Cantidad","Nombre","Precio Unitario"};
        String []fila=new String [3];    
        String nomProd= (String) ComboProd.getSelectedItem();
        String sql= "SELECT precio_Prod FROM productos WHERE nom_Prod LIKE '"+nomProd+"'";
        
        modeloFact= new DefaultTableModel(null,titulos);
        
        Statement st = cnn.createStatement();
        ResultSet rs= st.executeQuery(sql);
        
        fila[0]= cantProd.getText();
        fila[1]= (String) ComboProd.getSelectedItem();
        
        while(rs.next()){
            fila[2]= rs.getString("precio_Prod");
            precioU= Double.parseDouble(rs.getString("precio_Prod"));
        }
        
        cant= Double.parseDouble(cantProd.getText());
        total=precioU*cant;
        t_total.setText(String.valueOf(total));
        
        modeloFact.addRow(fila);     
        tablaFact.setModel(modeloFact);
        }catch(SQLException  e){
            JOptionPane.showMessageDialog(null,e);
        }  
    }
    
    private void llenarComboCli(){
        try{
        String sql= "select id_Cli from clientes ";
        
        BaseDatos connect= new BaseDatos();
        Connection cnn= (Connection) connect.conexion();
        
        Statement st = cnn.createStatement();
        ResultSet rs= st.executeQuery(sql);
        
        while(rs.next()){
           
           ComboCli.addItem(rs.getString("id_Cli"));
        }
        }catch(SQLException  e){
            JOptionPane.showMessageDialog(null,e);
        }
    }
    
    private void llenarComboPro(){
        try{
        String sql= "select nom_Prod from productos ";
        
        BaseDatos connect= new BaseDatos();
        Connection cnn= (Connection) connect.conexion();
        
        Statement st = cnn.createStatement();
        ResultSet rs= st.executeQuery(sql);
        
        while(rs.next()){
           
           ComboProd.addItem(rs.getString("nom_Prod"));
        }
        }catch(SQLException  e){
            JOptionPane.showMessageDialog(null,e);
        }   
    }
    
    
      
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
            java.util.logging.Logger.getLogger(Facturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Facturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Facturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Facturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Facturas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAgregar;
    private javax.swing.JButton BotonAtras;
    private javax.swing.JButton BotonRegistrar;
    private javax.swing.JComboBox<String> ComboCli;
    private javax.swing.JComboBox<String> ComboProd;
    private javax.swing.JTextField cantProd;
    private javax.swing.JTextArea factura_Im;
    private javax.swing.JTextField fechaF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField nFact;
    private javax.swing.JTextField t_correoE;
    private javax.swing.JTextField t_direccE;
    private javax.swing.JTextField t_nifE;
    private javax.swing.JTextField t_nomE;
    private javax.swing.JTextField t_telfE;
    private javax.swing.JTextField t_total;
    private javax.swing.JTable tablaFact;
    private javax.swing.JLabel totalF;
    // End of variables declaration//GEN-END:variables
}
