/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.co.miingresohitsssoa;

import com.co.dao.Servicios;
import com.co.entities.Usuarios;
import javax.inject.Inject;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Daegosoft
 */
@WebService(serviceName = "ServiceSOA")
public class ServiceSOA {

    /**
     * This is a sample web service operation
     */
    @Inject Servicios servicios;
    
    @WebMethod(operationName = "autenticar")
    public boolean autenticacion(@WebParam(name = "user") String txt, @WebParam(name = "pass") String pass) {
        return servicios.autenticar(pass, pass);
    }
    
    
    @WebMethod(operationName = "obtener")
    public Usuarios autenticacion(@WebParam(name = "user") Long idUsuario) {
        return servicios.obtenerUsuario(idUsuario);
    }
}
