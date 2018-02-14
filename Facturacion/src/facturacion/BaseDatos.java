/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturacion;

import java.sql.*;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


/**
 *
 * @author villegasevil
 */
public class BaseDatos {
    
    private Connection con;
    private Statement st;
    private ResultSet rs;
    Connection conect= null;
    
    public Connection conexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/facturacion","root","");
            st= con.createStatement();
            //JOptionPane.showMessageDialog(null,"Conectado");
            
        }catch(Exception ex){
            System.out.println("Error: "+ ex);
        }
        return con;
    }
    public void getData(){
        try{
            String query="select *from persona";
            rs= st.executeQuery(query);
            System.out.println("Records from DataBase");
            while(rs.next()){
                String name= rs.getString("nombre");
                String age= rs.getString("edad");
                System.out.println("Name: "+name+ " Age: "+age);
            }
            
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
    
     
    
}
