/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.co.daoImpl;

import com.co.dao.UsuarioDAO;
import com.co.entities.Usuarios;

/**
 *
 * @author Daegosoft
 */
public class UsuarioImpl extends GenericConnect implements UsuarioDAO{
    
    private static final String AUTENTICA = "SELECT COUNT(*) FROM USUARIOS WHERE NOMBREUSUARIO = ? AND PASSWORD = ?;";
    private static final String UNO = "SELECT * FROM USUARIOS WHERE IDUSUARIO = ?;";
    
    @Override
    public boolean autenticar(String user, String password) {
        int cont = -1;
        try {
            ps = getConection().prepareStatement(AUTENTICA);
            ps.setString(1, user);
            ps.setString(2, password);
            rs = ps.executeQuery();
            while(rs.next()){
                cont = rs.getInt(1);
            }
        } catch (Exception e) {
            System.out.println("Error autenticando " + e.getMessage());
        }
        return (cont > 0);
    }

    @Override
    public Usuarios obtenerUsuario(Long idUsuario) {
        Usuarios user = null;
        try {
            ps = getConection().prepareStatement(UNO);
            ps.setLong(1, idUsuario);
            rs = ps.executeQuery();
            user = new Usuarios();
            while(rs.next()){
                user.setIdusuario(rs.getLong("idUsuario"));
                user.setNombreusuario(rs.getString("nombreUsuario"));
            }
        } catch (Exception e) {
            System.out.println("Error autenticando " + e.getMessage());
        }
        return user;
    }
    
}
