/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sister.TR2.Restful.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author acer
 */
@Entity
@Table(name = "tb_kamus")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbKamus.findAll", query = "SELECT t FROM TbKamus t")
    , @NamedQuery(name = "TbKamus.findById", query = "SELECT t FROM TbKamus t WHERE t.id = :id")
    , @NamedQuery(name = "TbKamus.findByIndonesia", query = "SELECT t FROM TbKamus t WHERE t.indonesia = :indonesia")
    , @NamedQuery(name = "TbKamus.findByInggris", query = "SELECT t FROM TbKamus t WHERE t.inggris = :inggris")
    , @NamedQuery(name = "TbKamus.findByJawa", query = "SELECT t FROM TbKamus t WHERE t.jawa = :jawa")})
public class TbKamus implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "indonesia")
    private String indonesia;
    @Basic(optional = false)
    @Column(name = "inggris")
    private String inggris;
    @Basic(optional = false)
    @Column(name = "jawa")
    private String jawa;

    public TbKamus() {
    }

    public TbKamus(Integer id) {
        this.id = id;
    }

    public TbKamus(Integer id, String indonesia, String inggris, String jawa) {
        this.id = id;
        this.indonesia = indonesia;
        this.inggris = inggris;
        this.jawa = jawa;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIndonesia() {
        return indonesia;
    }

    public void setIndonesia(String indonesia) {
        this.indonesia = indonesia;
    }

    public String getInggris() {
        return inggris;
    }

    public void setInggris(String inggris) {
        this.inggris = inggris;
    }

    public String getJawa() {
        return jawa;
    }

    public void setJawa(String jawa) {
        this.jawa = jawa;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbKamus)) {
            return false;
        }
        TbKamus other = (TbKamus) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sister.TR2.Restful.entities.TbKamus[ id=" + id + " ]";
    }
    
}
