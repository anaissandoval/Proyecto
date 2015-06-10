package edu.uan.fis.jeesample.dao.impl;

import edu.uan.fis.jeesample.dao.ProductoDao;
import edu.uan.fis.jeesample.dto.Producto;
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
 * Producto DAO implementation using JDBC
 */
public class ProductoDaoJdbc implements ProductoDao {
    
    public Producto create(Producto producto) {
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
            //stmt.executeUpdate("INSERT INTO producto VALUES(5,'nombre',1,100)");
            stmt.executeUpdate("INSERT INTO producto (id_producto, nombre_producto, valor, id_catalogo) VALUES('" + producto.getIdproducto() + "','" + producto.getNombreproducto() + "','" + producto.getValor() + "','" + producto.getIdCatalogo() + "')");
        } catch (SQLException ex) {
            Logger.getLogger(ProductoDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProductoDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                stmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(ProductoDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(ProductoDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return producto;
    }
    
    public Producto update(Producto producto) {
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
            stmt.executeUpdate("UPDATE producto set nombre_producto = '" + producto.getNombreproducto() + "', valor = '" + producto.getValor()+ "', id_catalogo = '" + producto.getIdCatalogo()+ "' where id_producto = '"+producto.getIdproducto()+"'" );
        } catch (SQLException ex) {
            Logger.getLogger(ProductoDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProductoDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                stmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(ProductoDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(ProductoDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return producto;
    }
    
    public void delete(Producto producto) {
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
            stmt.executeUpdate("DELETE FROM producto where id_producto= '"+producto.getIdproducto()+"'"  );
        } catch (SQLException ex) {
            Logger.getLogger(ProductoDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProductoDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                stmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(ProductoDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(ProductoDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public Producto findById(String id_producto) {
        // Sample code
        Producto producto = null;
        Connection conn = null;
        Statement stmt = null;
        try {
            // 1. Register the JDBC driver
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            // 2. Get the connection for the URL jdbc:mysql://address:port/dbname?user=username&password=userpassword
            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/Supermercado","anita","ana");
            // 3. Creates the product in the database
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT id_producto, nombre_producto, valor, id_catalogo FROM producto where id_producto = '"+ id_producto +"'");
            if(rs.next()){
                producto = new Producto();
                producto.setIdproducto(rs.getString("id_producto"));
                producto.setNombreproducto(rs.getString("nombre_producto"));
                producto.setValor(rs.getString("valor"));
                producto.setIdcatalogo(rs.getString("id_catalogo"));
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductoDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProductoDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                stmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(ProductoDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(ProductoDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return producto;
    }
    
    public List<Producto> findAll() {
         // Sample code
        List productList = new ArrayList();
        Connection conn = null;
        Statement stmt = null;
        try {
            // 1. Register the JDBC driver
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            // 2. Get the connection for the URL jdbc:mysql://address:port/dbname?user=username&password=userpassword
            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/Supermercado","anita","ana");
            // 3. Creates the product in the database
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT id_producto, nombre_producto, valor, id_catalogo FROM producto ORDER BY nombre_producto");
            
            while(rs.next()){
                Producto producto = new Producto();
                producto.setIdproducto(rs.getString("id_producto"));
                producto.setNombreproducto(rs.getString("nombre_producto"));
                producto.setValor(rs.getString("valor"));
                producto.setIdcatalogo(rs.getString("id_catalogo"));                
                productList.add(producto);
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(ProductoDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProductoDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                stmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(ProductoDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(ProductoDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return productList;
    }
}
