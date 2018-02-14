/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturacion;

import com.mysql.jdbc.Connection;
import java.sql.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author villegasevil
 */
public class RegistroClientes extends javax.swing.JFrame {

    DefaultTableModel modeloCli;
    
    
    /**
     * Creates new form RegistroClientes
     */
    public RegistroClientes() {
        initComponents();
        mostrarRegistros();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        t_nomCli = new javax.swing.JTextField();
        t_apellCli = new javax.swing.JTextField();
        t_idCli = new javax.swing.JTextField();
        t_telfCli = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        t_direcCli = new javax.swing.JTextField();
        BotonRegCli = new javax.swing.JButton();
        BotonSalir3 = new javax.swing.JButton();
        BotonAtrasCli = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaCli = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        t_buscar = new javax.swing.JTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("INGRESO DE DATOS DEL CLIENTE");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Apellido:");

        jLabel4.setText("Identificacion:");

        jLabel5.setText("Nº Celular:");

        t_nomCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_nomCliActionPerformed(evt);
            }
        });

        t_apellCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_apellCliActionPerformed(evt);
            }
        });

        t_idCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_idCliActionPerformed(evt);
            }
        });

        jLabel6.setText("Direccion:");

        t_direcCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_direcCliActionPerformed(evt);
            }
        });

        BotonRegCli.setText("Registrar");
        BotonRegCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRegCliActionPerformed(evt);
            }
        });

        BotonSalir3.setText("Salir");
        BotonSalir3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSalir3ActionPerformed(evt);
            }
        });

        BotonAtrasCli.setText("Atras");
        BotonAtrasCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAtrasCliActionPerformed(evt);
            }
        });

        tablaCli.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tablaCli);

        jLabel7.setText("Registro de Clientes:");

        jLabel8.setText("Buscar por Nombre:");

        t_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_buscarActionPerformed(evt);
            }
        });
        t_buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t_buscarKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(117, 117, 117)
                            .addComponent(jLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(28, 28, 28)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6))
                            .addGap(89, 89, 89)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(BotonRegCli))
                                .addComponent(t_nomCli)
                                .addComponent(t_apellCli)
                                .addComponent(t_idCli)
                                .addComponent(t_telfCli)
                                .addComponent(t_direcCli))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BotonAtrasCli)
                                    .addComponent(BotonSalir3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel7)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(t_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(t_nomCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(t_apellCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(t_idCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(t_telfCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(t_direcCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BotonRegCli)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel7)
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(t_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(BotonAtrasCli)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BotonSalir3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void t_nomCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_nomCliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_nomCliActionPerformed

    private void t_apellCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_apellCliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_apellCliActionPerformed

    private void t_idCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_idCliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_idCliActionPerformed

    private void t_direcCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_direcCliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_direcCliActionPerformed

    private void BotonRegCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegCliActionPerformed
        registroClientes();
        
    }//GEN-LAST:event_BotonRegCliActionPerformed

    private void BotonSalir3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSalir3ActionPerformed
        dispose();
    }//GEN-LAST:event_BotonSalir3ActionPerformed

    private void BotonAtrasCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAtrasCliActionPerformed
       this.setVisible(false);
        Sistema sist= new Sistema();
        sist.setVisible(true);
    }//GEN-LAST:event_BotonAtrasCliActionPerformed

    private void t_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_buscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_buscarActionPerformed

    private void t_buscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_buscarKeyReleased
        buscar(t_buscar.getText());
    }//GEN-LAST:event_t_buscarKeyReleased

    private void buscar(String valor){
       
        try{
          
        String []titulos={"Nombre","Apellido","Identificacion","Telefono","Direccion"};
        String []fila=new String [5];    
        
        String sql= "select *from clientes WHERE CONCAT(nom_Cli,' ',apell_Cli)LIKE '%"+valor+"%'";
        modeloCli= new DefaultTableModel(null,titulos);
        BaseDatos connect= new BaseDatos();
        Connection cnn= (Connection) connect.conexion();
        
        Statement st = cnn.createStatement();
        ResultSet rs= st.executeQuery(sql);
        
        while(rs.next()){
                fila[0]= rs.getString("nom_Cli");
                fila[1]= rs.getString("apell_Cli");
                fila[2]= rs.getString("id_Cli");
                fila[3]= rs.getString("telef_Cli");
                fila[4]= rs.getString("direc_Cli");
                modeloCli.addRow(fila);       
        }  
        tablaCli.setModel(modeloCli);
        }catch(SQLException  e){
            JOptionPane.showMessageDialog(null,e);
        }      
    }
    private void mostrarRegistros(){
       
        try{
          
        String []titulos={"Nombre","Apellido","Identificacion","Telefono","Direccion"};
        String []fila=new String [5];    
        
        String sql= "select *from clientes";
        modeloCli= new DefaultTableModel(null,titulos);
        BaseDatos connect= new BaseDatos();
        Connection cnn= (Connection) connect.conexion();
        
        Statement st = cnn.createStatement();
        ResultSet rs= st.executeQuery(sql);
        
        while(rs.next()){
                fila[0]= rs.getString("nom_Cli");
                fila[1]= rs.getString("apell_Cli");
                fila[2]= rs.getString("id_Cli");
                fila[3]= rs.getString("telef_Cli");
                fila[4]= rs.getString("direc_Cli");
                modeloCli.addRow(fila);       
        }  
        tablaCli.setModel(modeloCli);
        }catch(SQLException  e){
            JOptionPane.showMessageDialog(null,e);
        }       
    }
    private void registroClientes(){
     String nombre =t_nomCli.getText();
     String apellido= t_apellCli.getText();
     String direcc= t_direcCli.getText();
     String id= t_idCli.getText();
     String telef=t_telfCli.getText();
     
     if(nombre.equals("")|| apellido.equals("")||telef.equals("")|| direcc.equals("")||id.equals("")){
        JOptionPane.showMessageDialog(this,"Ingrese los datos");
        }else{
         Clientes c= new Clientes(nombre, apellido,id,telef,direcc);
         
         BaseDatos connect= new BaseDatos();
         Connection cn= (Connection) connect.conexion();
         String sql="";
         sql="INSERT INTO clientes (id_Cli, nom_Cli, apell_Cli, direc_Cli, telef_Cli) VALUES(?,?,?,?,?)";
                 try {
                    PreparedStatement psd= cn.prepareStatement(sql);
                    psd.setString(1,id);
                    psd.setString(2,nombre);
                    psd.setString(3,apellido);
                    psd.setString(4,direcc );
                    psd.setString(5,telef );
                    int n= psd.executeUpdate();
                    
                    if(n>0){
                        JOptionPane.showMessageDialog(null,"Registro Exitoso" );                       
                        t_apellCli.setText("");
                        t_direcCli.setText("");
                        t_idCli.setText("");
                        t_nomCli.setText("");
                        t_telfCli.setText("");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(RegistroProductos.class.getName()).log(Level.SEVERE, null, ex);
                }
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
            java.util.logging.Logger.getLogger(RegistroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAtrasCli;
    private javax.swing.JButton BotonRegCli;
    private javax.swing.JButton BotonSalir3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField t_apellCli;
    private javax.swing.JTextField t_buscar;
    private javax.swing.JTextField t_direcCli;
    private javax.swing.JTextField t_idCli;
    private javax.swing.JTextField t_nomCli;
    private javax.swing.JTextField t_telfCli;
    private javax.swing.JTable tablaCli;
    // End of variables declaration//GEN-END:variables
}