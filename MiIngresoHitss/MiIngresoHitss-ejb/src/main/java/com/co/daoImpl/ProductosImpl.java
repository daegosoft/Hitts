package com.co.daoImpl;

import com.co.dao.ProductoDAO;
import com.co.entities.Precio;
import com.co.entities.Productos;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Daegosoft
 */
public class ProductosImpl extends GenericConnect implements ProductoDAO {

    private static final String TODOS = "SELECT * FROM PRODUCTOS;";
    private static final String INSERTAR = "INSERT INTO PRODUCTOS(NOMBREPRODUCTO, IDPRECIO) VALUES(?, ?);";

    @Override
    public List<Productos> obtenerProductos() {
        List<Productos> productos = new ArrayList();
        try {
            ps = getConection().prepareStatement(TODOS);
            rs = ps.executeQuery();
            Productos p;
            while (rs.next()) {
                p = new Productos();
                p.setIdproducto(rs.getLong("idProducto"));
                p.setNombreproducto(rs.getString("nombreProducto"));
                Precio pr = new Precio();
                pr.setIdprecio(rs.getLong("idPrecio"));
                p.setIdprecio(pr);
                productos.add(p);
            }
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
        return productos;
    }

    @Override
    public boolean crearProducto(Productos p) {
        boolean retorno = false;
        try {
            ps = getConection().prepareStatement(INSERTAR);
            ps.setString(1, p.getNombreproducto());
            ps.setLong(2, p.getIdprecio().getIdprecio());
            retorno = (ps.executeUpdate() > 1);
        } catch (Exception e) {
            System.out.println("Error = " + e.getMessage());
        }
        return retorno;
    }

    @Override
    public boolean modificarProducto(Productos p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminarProducto(Long idProducto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
