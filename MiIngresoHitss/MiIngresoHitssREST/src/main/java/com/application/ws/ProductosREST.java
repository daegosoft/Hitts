package com.application.ws;

import com.co.entities.Productos;
import com.co.miingresohitssrest.Servicios;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import static javax.ws.rs.HttpMethod.POST;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author Daegosoft
 */
@RequestScoped
@Path("/productos")
public class ProductosREST {

    @Inject
    Servicios servicios;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response obtenerProductos() {
        try {
            List<Productos> productos = servicios.obtenerProductos();
            return Response.ok(productos).build();
        } catch (Exception e) {
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity("Error obteniendo productos.").build();
        }
    }

    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response crearProducto(Productos p) {
        try {
            boolean ret = servicios.crearProducto(p);
            return Response.ok(ret).build();
        } catch (Exception e) {
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity("Error creando producto.").build();
        }
    }
    
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response modificarProducto(Productos p) {
        try {
            boolean ret = servicios.modificarProducto(p);
            return Response.ok(ret).build();
        } catch (Exception e) {
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity("Error modificando producto.").build();
        }
    }
    
    @DELETE
    @Produces(MediaType.APPLICATION_JSON)
    public Response eliminarProducto(@QueryParam("idProducto") Long idProducto) {
        try {
            boolean ret = servicios.eliminarProducto(idProducto);
            return Response.ok(ret).build();
        } catch (Exception e) {
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity("Error eliminado producto.").build();
        }
    }

}
