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
    private static final String UNO = "SELECT * FROM PRODUCTOS WHERE idProducto = ?;";
    private static final String INSERTAR = "INSERT INTO PRODUCTOS(NOMBREPRODUCTO, IDPRECIO) VALUES(?, ?);";
    private static final String MODIFICAR = "UPDATE PRODUCTOS SET NOMBREPRODUCTO = ?, IDPRECIO =  WHERE idProducto = ?;";
    private static final String ELIMINAR = "DELETE PRODUCTOS WHERE idProducto = ?;";

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
            System.out.println("Error Obtener todos " + e.getMessage());
        }
        return productos;
    }

    @Override
    public Productos obtenerProducto(Long idProducto) {
        Productos p = null;
        try {
            ps = getConection().prepareStatement(UNO);
            ps.setLong(1, idProducto);
            rs = ps.executeQuery();
            while (rs.next()) {
                p = new Productos();
                p.setIdproducto(rs.getLong("idProducto"));
                p.setNombreproducto(rs.getString("nombreProducto"));
                Precio pr = new Precio();
                pr.setIdprecio(rs.getLong("idPrecio"));
                p.setIdprecio(pr);
            }
        } catch (Exception e) {
            System.out.println("Error Obtener producto " + e.getMessage());
        }
        return p;
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
            System.out.println("Error creando producto = " + e.getMessage());
        }
        return retorno;
    }

    @Override
    public boolean modificarProducto(Productos p) {
        boolean retorno = false;
        try {
            ps = getConection().prepareStatement(MODIFICAR);
            ps.setString(1, p.getNombreproducto());
            ps.setLong(2, p.getIdprecio().getIdprecio());
            ps.setLong(3, p.getIdproducto());
            retorno = (ps.executeUpdate() > 1);
        } catch (Exception e) {
            System.out.println("Error modificar producto = " + e.getMessage());
        }
        return retorno;
    }

    @Override
    public boolean eliminarProducto(Long idProducto) {
        boolean retorno = false;
        try {
            ps = getConection().prepareStatement(ELIMINAR);
            ps.setLong(1, idProducto);
            retorno = (ps.executeUpdate() > 1);
        } catch (Exception e) {
            System.out.println("Error eliminar producto = " + e.getMessage());
        }
        return retorno;
    }
}
