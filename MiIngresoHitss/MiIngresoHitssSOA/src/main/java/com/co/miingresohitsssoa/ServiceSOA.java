/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.co.miingresohitsssoa;

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
    
    
    @WebMethod(operationName = "autenticar")
    public boolean autenticacion(@WebParam(name = "user") String txt, @WebParam(name = "pass") String pass) {
        return false;
    }
}
