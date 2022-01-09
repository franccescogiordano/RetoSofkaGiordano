/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CLASES;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author franc
 */
@Entity
public class jugador implements Serializable {

    @OneToMany(mappedBy = "participante")
    private List<participa> participaciones;


   
   
  
    @ManyToMany
    private List<preguntas> preguntas;
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long codjugador;
    private int puntos;
    private String nombre;
    private String usuario;
    private int rondasjugadas;

    public List<participa> getParticipaciones() {
        return participaciones;
    }

    public void setParticipaciones(List<participa> participaciones) {
        this.participaciones = participaciones;
    }

    public List<preguntas> getPreguntas() {
        return preguntas;
    }

    public void setPreguntas(List<preguntas> preguntas) {
        this.preguntas = preguntas;
    }

    public Long getCodjugador() {
        return codjugador;
    }

    public void setCodjugador(Long codjugador) {
        this.codjugador = codjugador;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public int getRondasjugadas() {
        return rondasjugadas;
    }

    public void setRondasjugadas(int rondasjugadas) {
        this.rondasjugadas = rondasjugadas;
    }
    
    public Long getId() {
        return codjugador;
    }

    public void setId(Long id) {
        this.codjugador = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codjugador != null ? codjugador.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof jugador)) {
            return false;
        }
        jugador other = (jugador) object;
        if ((this.codjugador == null && other.codjugador != null) || (this.codjugador != null && !this.codjugador.equals(other.codjugador))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CLASES.jugador[ id=" + codjugador + " ]";
    }
    
}
