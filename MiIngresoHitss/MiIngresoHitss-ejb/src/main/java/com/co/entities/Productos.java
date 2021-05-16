/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.co.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Daegosoft
 */
@Entity
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Productos.findAll", query = "SELECT p FROM Productos p")
    , @NamedQuery(name = "Productos.findByIdproducto", query = "SELECT p FROM Productos p WHERE p.idproducto = :idproducto")
    , @NamedQuery(name = "Productos.findByNombreproducto", query = "SELECT p FROM Productos p WHERE p.nombreproducto = :nombreproducto")})
public class Productos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    private Long idproducto;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    private String nombreproducto;
    @JoinColumn(name = "IDPRECIO", referencedColumnName = "IDPRECIO")
    @ManyToOne
    private Precio idprecio;
    @OneToMany(mappedBy = "idproducto")
    private List<Ventadetalle> ventadetalleList;

    public Productos() {
    }

    public Productos(Long idproducto) {
        this.idproducto = idproducto;
    }

    public Productos(Long idproducto, String nombreproducto) {
        this.idproducto = idproducto;
        this.nombreproducto = nombreproducto;
    }

    public Long getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(Long idproducto) {
        this.idproducto = idproducto;
    }

    public String getNombreproducto() {
        return nombreproducto;
    }

    public void setNombreproducto(String nombreproducto) {
        this.nombreproducto = nombreproducto;
    }

    public Precio getIdprecio() {
        return idprecio;
    }

    public void setIdprecio(Precio idprecio) {
        this.idprecio = idprecio;
    }

    @XmlTransient
    public List<Ventadetalle> getVentadetalleList() {
        return ventadetalleList;
    }

    public void setVentadetalleList(List<Ventadetalle> ventadetalleList) {
        this.ventadetalleList = ventadetalleList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idproducto != null ? idproducto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Productos)) {
            return false;
        }
        Productos other = (Productos) object;
        if ((this.idproducto == null && other.idproducto != null) || (this.idproducto != null && !this.idproducto.equals(other.idproducto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.co.entities.Productos[ idproducto=" + idproducto + " ]";
    }
    
}
