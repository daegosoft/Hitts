package com.co.dao;

import com.co.entities.Usuarios;

/**
 * @author Daegosoft
 */
public interface UsuarioDAO {
    
    boolean autenticar(String user, String password);
    
    Usuarios obtenerUsuario(Long idUsuario);
}
