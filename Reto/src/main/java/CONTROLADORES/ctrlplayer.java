/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLADORES;

import CLASES.jugador;
import GUI.main;
import PERSISTENCIA.CPrincipal;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author franc
 */
public class ctrlplayer {
  EntityManager em = CPrincipal.getInstance().getEntity();

  public jugador getplayer(String username){
    
        Iterator <jugador> it = main.jugadores.iterator();
        while (it.hasNext()) {
            jugador next = it.next();
            if(next.getUsuario().equals(username)){
                jugador usu = next;
                
                return usu;
            }
        }
        return null;
   
  }
     
       public List<jugador> cargarjugadores(){
     
        List<jugador> lista = null;
        em.getTransaction().begin();
        try {
            lista = em.createNativeQuery("SELECT * FROM jugador", jugador.class).getResultList();
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }
        return lista;
    
}
       

}
