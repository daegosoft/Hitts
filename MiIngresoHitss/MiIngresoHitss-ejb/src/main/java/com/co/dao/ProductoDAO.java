package com.co.dao;

import com.co.entities.Productos;
import java.util.List;

/**
 * @author Daegosoft
 */
public interface ProductoDAO {
    
    List<Productos> obtenerProductos();
    
    Productos obtenerProducto(Long idProducto);
    
    boolean crearProducto(Productos p);
    
    boolean modificarProducto(Productos p);
    
    boolean eliminarProducto(Long idProducto);
}
