package com.co.entities;

import com.co.entities.Precio;
import com.co.entities.Ventadetalle;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-05-16T17:34:17")
@StaticMetamodel(Productos.class)
public class Productos_ { 

    public static volatile ListAttribute<Productos, Ventadetalle> ventadetalleList;
    public static volatile SingularAttribute<Productos, String> nombreproducto;
    public static volatile SingularAttribute<Productos, Long> idproducto;
    public static volatile SingularAttribute<Productos, Precio> idprecio;

}