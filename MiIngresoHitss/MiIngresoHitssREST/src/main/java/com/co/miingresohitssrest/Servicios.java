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

    @Inject
    ProductoDAO productoDAO;

    public List<Productos> obtenerProductos() {
        return productoDAO.obtenerProductos();
    }

    public boolean crearProducto(Productos p) {
        return productoDAO.crearProducto(p);
    }

    public boolean modificarProducto(Productos p) {
        return productoDAO.modificarProducto(p);
    }

    public boolean eliminarProducto(Long idProducto) {
        return productoDAO.eliminarProducto(idProducto);
    }
}
