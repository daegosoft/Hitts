package com.co.entities;

import com.co.entities.Clientes;
import com.co.entities.Ventadetalle;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-05-16T17:34:17")
@StaticMetamodel(Ventas.class)
public class Ventas_ { 

    public static volatile SingularAttribute<Ventas, Long> idventa;
    public static volatile SingularAttribute<Ventas, Date> fecha;
    public static volatile ListAttribute<Ventas, Ventadetalle> ventadetalleList;
    public static volatile SingularAttribute<Ventas, Integer> valortotal;
    public static volatile SingularAttribute<Ventas, Clientes> idcliente;

}