/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.co.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Daegosoft
 */
@Entity
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ventadetalle.findAll", query = "SELECT v FROM Ventadetalle v")
    , @NamedQuery(name = "Ventadetalle.findByIdventadetalle", query = "SELECT v FROM Ventadetalle v WHERE v.idventadetalle = :idventadetalle")
    , @NamedQuery(name = "Ventadetalle.findByCantidad", query = "SELECT v FROM Ventadetalle v WHERE v.cantidad = :cantidad")
    , @NamedQuery(name = "Ventadetalle.findByValortotal", query = "SELECT v FROM Ventadetalle v WHERE v.valortotal = :valortotal")})
public class Ventadetalle implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    private Long idventadetalle;
    private Integer cantidad;
    private Integer valortotal;
    @JoinColumn(name = "IDPRECIO", referencedColumnName = "IDPRECIO")
    @ManyToOne
    private Precio idprecio;
    @JoinColumn(name = "IDPRODUCTO", referencedColumnName = "IDPRODUCTO")
    @ManyToOne
    private Productos idproducto;
    @JoinColumn(name = "IDVENTA", referencedColumnName = "IDVENTA")
    @ManyToOne
    private Ventas idventa;

    public Ventadetalle() {
    }

    public Ventadetalle(Long idventadetalle) {
        this.idventadetalle = idventadetalle;
    }

    public Long getIdventadetalle() {
        return idventadetalle;
    }

    public void setIdventadetalle(Long idventadetalle) {
        this.idventadetalle = idventadetalle;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Integer getValortotal() {
        return valortotal;
    }

    public void setValortotal(Integer valortotal) {
        this.valortotal = valortotal;
    }

    public Precio getIdprecio() {
        return idprecio;
    }

    public void setIdprecio(Precio idprecio) {
        this.idprecio = idprecio;
    }

    public Productos getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(Productos idproducto) {
        this.idproducto = idproducto;
    }

    public Ventas getIdventa() {
        return idventa;
    }

    public void setIdventa(Ventas idventa) {
        this.idventa = idventa;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idventadetalle != null ? idventadetalle.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ventadetalle)) {
            return false;
        }
        Ventadetalle other = (Ventadetalle) object;
        if ((this.idventadetalle == null && other.idventadetalle != null) || (this.idventadetalle != null && !this.idventadetalle.equals(other.idventadetalle))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.co.entities.Ventadetalle[ idventadetalle=" + idventadetalle + " ]";
    }
    
}
