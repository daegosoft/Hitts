package com.co.daoImpl;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Daegosoft
 */
public class GenericConnect {

    private static Connection con;
    ResultSet rs;
    CallableStatement cst;
    PreparedStatement ps;

    public Connection getConection() {
        if (con != null) {
            return con;
        }
        return this.conectarBd();
    }

    private Connection conectarBd() {
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/MiIngresoHitss", "root", "root");
        } catch (Exception e) {
            System.out.println("error = " + e.getMessage());
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
            }
        }
        return con;
    }

    public void cerrarConexiones() {
        try {
            if (rs != null) {
                rs.close();
            }
            if (cst != null) {
                cst.close();
            }
            if(con != null){
                con.close();
            }
        } catch (Exception e) {
        }
    }
}
