   
package edu.uan.fis.jeesample.dao.impl;

import edu.uan.fis.jeesample.dao.DetallecompraDao;
import edu.uan.fis.jeesample.dto.Detallecompra;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Product DAO implementation using JDBC
 */
public class DetallecompraDaoJdbc implements DetallecompraDao {
    
    public Detallecompra create(Detallecompra detallecompra) {
        // Sample code
        Connection conn = null;
        Statement stmt = null;
        try {
            // 1. Register the JDBC driver
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            // 2. Get the connection for the URL jdbc:mysql://address:port/dbname?user=username&password=userpassword
            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/Supermercado","anita","ana");
            // 3. Creates the product in the database
            stmt = conn.createStatement();
            stmt.executeUpdate("INSERT INTO detallecompra VALUES(" +detallecompra.getIddetalle() + "," + detallecompra.getIdfactura() + "," + detallecompra.getIdproducto() + "," + detallecompra.getCantidad() + ")");
        } catch (SQLException ex) {
            Logger.getLogger(DetallecompraDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DetallecompraDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                stmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(DetallecompraDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(DetallecompraDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return detallecompra;
    }
    
    public Detallecompra update(Detallecompra detallecompra) {
        // Sample code
        Connection conn = null;
        Statement stmt = null;
        try {
            // 1. Register the JDBC driver
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            // 2. Get the connection for the URL jdbc:mysql://address:port/dbname?user=username&password=userpassword
            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/Supermercado","anita","ana");
            // 3. Creates the product in the database
            stmt = conn.createStatement();
            stmt.executeUpdate("UPDATE detallecompra set cantidad=" + detallecompra.getCantidad() + " where id_detalle = "+detallecompra.getIddetalle()  );
        } catch (SQLException ex) {
            Logger.getLogger(DetallecompraDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DetallecompraDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                stmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(DetallecompraDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(DetallecompraDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return detallecompra;
    }
    
    public void delete(Detallecompra detallecompra) {
        // Sample code
        Connection conn = null;
        Statement stmt = null;
        try {
            // 1. Register the JDBC driver
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            // 2. Get the connection for the URL jdbc:mysql://address:port/dbname?user=username&password=userpassword
            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/Supermercado","anita","ana");
            // 3. Creates the product in the database
            stmt = conn.createStatement();
            stmt.executeUpdate("DELETE FROM detallecompra where id_detalle = "+detallecompra.getIddetalle()  );
        } catch (SQLException ex) {
            Logger.getLogger(DetallecompraDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DetallecompraDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                stmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(DetallecompraDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(DetallecompraDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public Detallecompra findById(Integer id_detalle) {
        // Sample code
        Detallecompra detallecompra = null;
        Connection conn = null;
        Statement stmt = null;
        try {
            // 1. Register the JDBC driver
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            // 2. Get the connection for the URL jdbc:mysql://address:port/dbname?user=username&password=userpassword
            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/Supermercado","anita","ana");
            // 3. Creates the product in the database
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT id_detalle, id_factura, id_producuto, cantidad FROM ddetallecompra where id_detalle = "+ id_detalle);
            if(rs.next()){
                detallecompra = new Detallecompra();
                detallecompra.setIddetalle(rs.getInt("id_detalle"));
                detallecompra.setIdfactura(rs.getInt("id_factura"));
                detallecompra.setIdproducto(rs.getInt("id_factura"));
                detallecompra.setCantidad(rs.getInt("cantidad"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(DetallecompraDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DetallecompraDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                stmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(DetallecompraDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(DetallecompraDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return detallecompra;
    }
    
    public List<Detallecompra> findAll() {
         // Sample code
        List<Detallecompra> detallecompraList = new ArrayList<Detallecompra>();
        Connection conn = null;
        Statement stmt = null;
        try {
            // 1. Register the JDBC driver
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            // 2. Get the connection for the URL jdbc:mysql://address:port/dbname?user=username&password=userpassword
            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/Supermercado","anita","ana");
            // 3. Creates the product in the database
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT id_detalle, id_factura, id_producuto, cantidad FROM detallecompra");
            while(rs.next()){
                Detallecompra detallecompra = new Detallecompra();
                detallecompra.setIddetalle(rs.getInt("id_detalle"));
                detallecompra.setIdfactura(rs.getInt("id_factura"));
                detallecompra.setIdproducto(rs.getInt("id_producuto"));
                detallecompra.setCantidad(rs.getInt("cantidad"));
                detallecompraList.add(detallecompra);
                
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(DetallecompraDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DetallecompraDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                stmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(DetallecompraDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(DetallecompraDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return detallecompraList;
    }
}



