package com.co.entities;

import com.co.entities.Productos;
import com.co.entities.Ventadetalle;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-05-16T15:47:29")
@StaticMetamodel(Precio.class)
public class Precio_ { 

    public static volatile ListAttribute<Precio, Ventadetalle> ventadetalleList;
    public static volatile SingularAttribute<Precio, Integer> valor;
    public static volatile ListAttribute<Precio, Productos> productosList;
    public static volatile SingularAttribute<Precio, Long> idprecio;

}