package com.co.miingresohitssrest;

import com.co.dao.ProductoDAO;
import com.co.entities.Productos;
import java.util.List;
import javax.inject.Inject;

/**
 *
 * @author Daegosoft
 */
public class Servicios {
    
    @Inject ProductoDAO productoDAO;
    
    public List<Productos> obtenerProductos(){
        return productoDAO.obtenerProductos();
    }
    
}
