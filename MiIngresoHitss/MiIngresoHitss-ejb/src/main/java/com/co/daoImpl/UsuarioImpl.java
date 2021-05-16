/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.co.daoImpl;

import com.co.dao.UsuarioDAO;

/**
 *
 * @author Daegosoft
 */
public class UsuarioImpl extends GenericConnect implements UsuarioDAO{
    
    private static final String AUTENTICA = "SELECT COUNT(*) FROM USUARIOS WHERE NOMBREUSUARIO = ? AND PASSWORD = ?;";
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
        }
        return (cont > 0);
    }
    
}
