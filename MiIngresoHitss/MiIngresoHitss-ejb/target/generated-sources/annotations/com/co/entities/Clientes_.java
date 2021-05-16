package com.co.entities;

import com.co.entities.Ventas;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-05-16T17:34:17")
@StaticMetamodel(Clientes.class)
public class Clientes_ { 

    public static volatile SingularAttribute<Clientes, String> tipo;
    public static volatile SingularAttribute<Clientes, Integer> documento;
    public static volatile ListAttribute<Clientes, Ventas> ventasList;
    public static volatile SingularAttribute<Clientes, Long> idcliente;
    public static volatile SingularAttribute<Clientes, String> nombrecliente;

}