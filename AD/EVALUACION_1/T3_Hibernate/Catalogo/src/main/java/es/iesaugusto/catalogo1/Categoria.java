/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.iesaugusto.catalogo1;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author damt210
 */
@Entity
@Table(name = "categoria")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Categoria.findAll", query = "SELECT c FROM Categoria c"),
    @NamedQuery(name = "Categoria.findByPkcategoria", query = "SELECT c FROM Categoria c WHERE c.pkcategoria = :pkcategoria"),
    @NamedQuery(name = "Categoria.findByNombre", query = "SELECT c FROM Categoria c WHERE c.nombre = :nombre")})
public class Categoria implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "pkcategoria")
    private Integer pkcategoria;
    @Column(name = "nombre")
    private String nombre;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fkcategoria")
    private List<Producto> productoList;

    public Categoria() {
    }

    public Categoria(Integer pkcategoria) {
        this.pkcategoria = pkcategoria;
    }

    public Integer getPkcategoria() {
        return pkcategoria;
    }

    public void setPkcategoria(Integer pkcategoria) {
        this.pkcategoria = pkcategoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @XmlTransient
    public List<Producto> getProductoList() {
        return productoList;
    }

    public void setProductoList(List<Producto> productoList) {
        this.productoList = productoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkcategoria != null ? pkcategoria.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Categoria)) {
            return false;
        }
        Categoria other = (Categoria) object;
        if ((this.pkcategoria == null && other.pkcategoria != null) || (this.pkcategoria != null && !this.pkcategoria.equals(other.pkcategoria))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "es.iesaugusto.catalogo1.Categoria[ pkcategoria=" + pkcategoria + " ]";
    }
    
}
