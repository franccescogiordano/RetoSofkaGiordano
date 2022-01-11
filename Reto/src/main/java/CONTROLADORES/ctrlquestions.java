/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLADORES;

import CLASES.categorias;
import CLASES.dificultad;
import GUI.crearcategoria;
import static GUI.crearcategoria.jComboBoxDifi;
import GUI.crearpreguntas;
import GUI.main;
import PERSISTENCIA.CPrincipal;
import java.util.Iterator;
import java.util.List;
import javax.persistence.EntityManager;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author franc
 */
public class ctrlquestions {

    EntityManager em = CPrincipal.getInstance().getEntity();

    public List<dificultad> listadodifis() {
        List<dificultad> lista = null;
        em.getTransaction().begin();
        try {
            lista = em.createNativeQuery("SELECT * FROM dificultad", dificultad.class).getResultList();
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }
        return lista;
    }
   public List<categorias> listadocats() {
        List<categorias> lista = null;
        em.getTransaction().begin();
        try {
            lista = em.createNativeQuery("SELECT * FROM categorias", categorias.class).getResultList();
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }
        return lista;
    }
    public dificultad getdif(String difitxt) {
        Iterator<dificultad> it = main.dificultades.iterator();
        while (it.hasNext()) {
            dificultad dif = it.next();
            if (dif.getNivel().equals(difitxt)) {
                return dif;
            }
        }
        return null;
    }

    public void CargarCBoxDificultades() {
        DefaultComboBoxModel mdl = (DefaultComboBoxModel) crearcategoria.jComboBoxDifi.getModel();
        mdl.removeAllElements();
        mdl.addElement("---Seleccionar Dificultad---");
        if (main.dificultades.isEmpty()) {

        } else {
            Iterator<dificultad> it = main.dificultades.iterator();
            while (it.hasNext()) {
                mdl.addElement(it.next());
            }
        }
    }
  public void CargarCBoxCategorias() {
        DefaultComboBoxModel mdl = (DefaultComboBoxModel) crearcategoria.jComboBoxDifi.getModel();
        mdl.removeAllElements();
        mdl.addElement("---Seleccionar Categoria---");
        if (main.dificultades.isEmpty()) {

        } else {
            Iterator<dificultad> it = main.dificultades.iterator();
            while (it.hasNext()) {
                mdl.addElement(it.next());
            }
        }
    }
}
