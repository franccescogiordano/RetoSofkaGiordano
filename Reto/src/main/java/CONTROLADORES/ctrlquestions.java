/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLADORES;

import CLASES.categorias;
import CLASES.dificultad;
import CLASES.preguntas;
import GUI.crearcategoria;
import static GUI.crearcategoria.jComboBoxDifi;
import GUI.crearpreguntas;
import GUI.main;
import PERSISTENCIA.CPrincipal;
import java.util.ArrayList;
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
        mdl.addElement("--Seleccionar Dificultad--");
        if (main.dificultades.isEmpty()) {

        } else {
            Iterator<dificultad> it = main.dificultades.iterator();
            while (it.hasNext()) {
                mdl.addElement(it.next());
            }
        }
    }

    public void CargarCBoxCategorias() {
        DefaultComboBoxModel mdl = (DefaultComboBoxModel) crearpreguntas.jComboBoxCategorias.getModel();
        mdl.removeAllElements();
        mdl.addElement("--Seleccionar Categoria--");
        if (main.cats.isEmpty()) {

        } else {
            Iterator<categorias> it = main.cats.iterator();
            while (it.hasNext()) {
                mdl.addElement(it.next());
            }
        }
    }

    public List<preguntas> listapreguntas() {
        
    List<preguntas> lista = new ArrayList<preguntas>();
        em.getTransaction().begin();
        try {
            lista = em.createNativeQuery("SELECT * FROM preguntas", preguntas.class).getResultList();
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }
        return lista;
    }

    public preguntas pregunta1() {

        int cantidadpregs = listapreguntasmuyfacil().size();
        int numero_random=(int) (Math.random() * cantidadpregs + 0);
   //     System.out.println("PREGUNTA 1 NUMERO RANDOMMMM: "+cantidadpregs+" "+numero_random);
        preguntas preguntaelegida = listapreguntasmuyfacil().get(numero_random);
        
        return preguntaelegida;
    }

    public List<preguntas> listapreguntasfaciles() {
        
      List<preguntas> lista = new ArrayList<preguntas>();
      
        preguntas preg = null;
        
        Iterator<preguntas> it = main.pregs.iterator();
        while (it.hasNext()) {
            preg = it.next();
            if (preg.getCategoria().getDificultad().getNivel().equals("Facil")) {
                lista.add(preg);
            }

        }
        return lista;
    }

    public List<preguntas> listapreguntasmedio() {
      List<preguntas> lista = new ArrayList<preguntas>();
        preguntas preg = null;
        Iterator<preguntas> it = main.pregs.iterator();
        while (it.hasNext()) {
            preg = it.next();
            if (preg.getCategoria().getDificultad().getNivel().equals("Normal")) {
                lista.add(preg);
            }

        }
        return lista;
    }

    public List<preguntas> listapreguntasdificil() {
     List<preguntas> lista = new ArrayList<preguntas>();
        preguntas preg = null;
        Iterator<preguntas> it = main.pregs.iterator();
        while (it.hasNext()) {
            preg = it.next();
            if (preg.getCategoria().getDificultad().getNivel().equals("Dificil")) {
                lista.add(preg);
            }

        }
        return lista;
    }
    public List<preguntas> listapreguntasmuydificil() {
       List<preguntas> lista = new ArrayList<preguntas>();
        preguntas preg = null;
        Iterator<preguntas> it = main.pregs.iterator();
        while (it.hasNext()) {
            preg = it.next();
            if (preg.getCategoria().getDificultad().getNivel().equals("Muy Dificil")) {
                lista.add(preg);
            }

        }
        return lista;
    }
    public List<preguntas> listapreguntasmuyfacil() {
        List<preguntas> lista = new ArrayList<preguntas>();
        preguntas preg = null;
        Iterator<preguntas> it = main.pregs.iterator();
        while (it.hasNext()) {
            preg = it.next();
            if (preg.getCategoria().getDificultad().getNivel().equals("Muy Facil")) {
                lista.add(preg);
            }

        }
        return lista;
    }

    public preguntas pregunta2() {

        int cantidadpregs = listapreguntasfaciles().size();
          int numero_random=(int) (Math.random() * cantidadpregs + 0);
        preguntas preguntaelegida = listapreguntasfaciles().get(numero_random);

        return preguntaelegida;
    }
  public preguntas pregunta3() {

        int cantidadpregs = listapreguntasmedio().size();
          int numero_random=(int) (Math.random() * cantidadpregs + 0);
        preguntas preguntaelegida =listapreguntasmedio().get(numero_random);

        return preguntaelegida;
    }
  public preguntas pregunta4() {

        int cantidadpregs = listapreguntasdificil().size();
        int numero_random=(int) (Math.random() * cantidadpregs + 0);
        preguntas preguntaelegida =listapreguntasdificil().get(numero_random);

        return preguntaelegida;
    }
  public preguntas pregunta5() {
        int cantidadpregs = listapreguntasmuydificil().size();
        int numero_random=(int) (Math.random() * cantidadpregs + 0);
        preguntas preguntaelegida =listapreguntasmuydificil().get(numero_random);
        return preguntaelegida;
    }

}
