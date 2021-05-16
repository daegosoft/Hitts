package com.co.entities;

import com.co.entities.Precio;
import com.co.entities.Productos;
import com.co.entities.Ventas;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-05-16T17:34:17")
@StaticMetamodel(Ventadetalle.class)
public class Ventadetalle_ { 

    public static volatile SingularAttribute<Ventadetalle, Ventas> idventa;
    public static volatile SingularAttribute<Ventadetalle, Long> idventadetalle;
    public static volatile SingularAttribute<Ventadetalle, Integer> valortotal;
    public static volatile SingularAttribute<Ventadetalle, Integer> cantidad;
    public static volatile SingularAttribute<Ventadetalle, Productos> idproducto;
    public static volatile SingularAttribute<Ventadetalle, Precio> idprecio;

}