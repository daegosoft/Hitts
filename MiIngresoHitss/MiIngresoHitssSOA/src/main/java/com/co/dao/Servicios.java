package com.co.dao;

import javax.inject.Inject;

/**
 *
 * @author Daegosoft
 */
public class Servicios {
    
    @Inject UsuarioDAO servicio;
    
    public boolean autenticar(String user, String pass){
        return servicio.autenticar(user, pass);
    }
}
