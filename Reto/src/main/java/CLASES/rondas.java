/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CLASES;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author franc
 */
@Entity
public class rondas implements Serializable {

    @OneToOne(mappedBy = "rondajugada")
    private participa partipacion;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int numero_rondas;
    private int ronda_actual;

    public participa getPartipacion() {
        return partipacion;
    }

    public void setPartipacion(participa partipacion) {
        this.partipacion = partipacion;
    }

    public int getNumero_rondas() {
        return numero_rondas;
    }

    public void setNumero_rondas(int numero_rondas) {
        this.numero_rondas = numero_rondas;
    }

    public int getRonda_actual() {
        return ronda_actual;
    }

    public void setRonda_actual(int ronda_actual) {
        this.ronda_actual = ronda_actual;
    }
    
    
            
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
        if (!(object instanceof rondas)) {
            return false;
        }
        rondas other = (rondas) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CLASES.rondas[ id=" + id + " ]";
    }
    
}
