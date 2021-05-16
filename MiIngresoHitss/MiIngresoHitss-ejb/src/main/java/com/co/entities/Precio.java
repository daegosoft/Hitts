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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Daegosoft
 */
@Entity
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Precio.findAll", query = "SELECT p FROM Precio p")
    , @NamedQuery(name = "Precio.findByIdprecio", query = "SELECT p FROM Precio p WHERE p.idprecio = :idprecio")
    , @NamedQuery(name = "Precio.findByValor", query = "SELECT p FROM Precio p WHERE p.valor = :valor")})
public class Precio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    private Long idprecio;
    @Basic(optional = false)
    @NotNull
    private int valor;
    @OneToMany(mappedBy = "idprecio")
    private List<Productos> productosList;
    @OneToMany(mappedBy = "idprecio")
    private List<Ventadetalle> ventadetalleList;

    public Precio() {
    }

    public Precio(Long idprecio) {
        this.idprecio = idprecio;
    }

    public Precio(Long idprecio, int valor) {
        this.idprecio = idprecio;
        this.valor = valor;
    }

    public Long getIdprecio() {
        return idprecio;
    }

    public void setIdprecio(Long idprecio) {
        this.idprecio = idprecio;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    @XmlTransient
    public List<Productos> getProductosList() {
        return productosList;
    }

    public void setProductosList(List<Productos> productosList) {
        this.productosList = productosList;
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
        hash += (idprecio != null ? idprecio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Precio)) {
            return false;
        }
        Precio other = (Precio) object;
        if ((this.idprecio == null && other.idprecio != null) || (this.idprecio != null && !this.idprecio.equals(other.idprecio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.co.entities.Precio[ idprecio=" + idprecio + " ]";
    }
    
}
