/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import CLASES.jugador;
import CLASES.participa;
import CLASES.preguntas;
import CLASES.rondas;
import CONTROLADORES.ctrlquestions;
import PERSISTENCIA.CPrincipal;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import javax.swing.JRadioButton;

/**
 *
 * @author franc
 */
public class jugar extends javax.swing.JFrame {

    /**
     * Creates new form jugar
     */
    private int rondasjugadas;
    public static rondas ronda = null;
    public static participa participacion = null;
    public static preguntas preg = null;
    public static jugador playeractual= new jugador();
    public static List<participa> participacionesdeljugador = new ArrayList<participa>();
    ctrlquestions CQ = new ctrlquestions();
    int puntos;
    public jugar(jugador player) {
        initComponents();
       
        ronda = new rondas();
        ronda.setNumero_rondas(5);
        ronda.setRonda_actual(1);
       
        participacion = new participa();
        preg = new preguntas();
        preg = CQ.pregunta1();
        playeractual=player;
        rellenarcampos(preg);

    }

    public void chekearrespuesta(JRadioButton radiobtm) {
        respuesta1.setEnabled(false);
        respuesta2.setEnabled(false);
        respuesta3.setEnabled(false);
        respuesta4.setEnabled(false);
       CPrincipal.getInstance().persist(ronda);
       CPrincipal.getInstance().persist(participacion);
       
        ronda.setPartipacion(participacion);
        if(radiobtm.getText().equals(preg.getRespuestac())){
         jLabelRespuesta.setText("Correcta");
          participacion.setEstadoronda("Gano");
        }else{
             jLabelRespuesta.setText("Incorrecta, la respuesta correcta era: "+preg.getRespuestac());
              participacion.setEstadoronda("Perdio");
        }
       
        participacion.setPreguntaronda(preg.toString());
        participacion.setRespuestaEelegida(radiobtm.getText());
        if(ronda.getRonda_actual()==1){
        participacion.setPremioronda(100);
        }else if(ronda.getRonda_actual()==2){
              participacion.setPremioronda(200);
        }else  if(ronda.getRonda_actual()==3){
              participacion.setPremioronda(300);
        }else  if(ronda.getRonda_actual()==4){
              participacion.setPremioronda(400);
        } else  if(ronda.getRonda_actual()==5){
              participacion.setPremioronda(500);
        } 
        participacion.setRondajugada(ronda);
        participacion.setParticipante(playeractual);
        puntos=playeractual.getPuntos();
        playeractual.setPuntos(puntos+participacion.getPremioronda());
        if(playeractual.getParticipaciones().isEmpty()){
        playeractual.setParticipaciones(participacionesdeljugador);
    }else{
            participacionesdeljugador=playeractual.getParticipaciones();
            participacionesdeljugador.add(participacion);
            playeractual.setParticipaciones(participacionesdeljugador);
            
        }
       
      
        CPrincipal.getInstance().merge(ronda);
        CPrincipal.getInstance().merge(participacion);
        CPrincipal.getInstance().merge(playeractual);
    
    }
    private jugar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private List desordenadossinrepetir(String[] respuestas) {
        Random random = new Random();
        String[] respuestasdesordenadas = new String[4];
        int i = 0;
        while (i < 4) {
            int pos = random.nextInt(respuestas.length);
            if (!Arrays.asList(respuestasdesordenadas).contains(respuestas[pos])) {
                respuestasdesordenadas[i] = respuestas[pos];
                i++;
            }
        }
        return Arrays.asList(respuestasdesordenadas);
    }

    public void rellenarcampos(preguntas preg1) {
        jLabel1.setText(preg.getPregunta());
        int i = 1;
        String respuesta1x = preg1.getRespuestac();
        String respuesta2x = preg1.getRespuesta1();
        String respuesta3x = preg1.getRespuesta2();
        String respuesta4x = preg1.getRespuesta3();
        String[] x = {respuesta1x, respuesta2x, respuesta3x, respuesta4x};
        List opciones = desordenadossinrepetir(x);
        for (i = 0; i < 4; i = i + 1) {
            switch (i) {
                case 0:
                    respuesta1.setText(opciones.get(i).toString());

                case 1:
                    respuesta2.setText(opciones.get(i).toString());

                case 2:
                    respuesta3.setText(opciones.get(i).toString());

                case 3:
                    respuesta4.setText(opciones.get(i).toString());

                default:

            }

        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        respuesta1 = new javax.swing.JRadioButton();
        respuesta2 = new javax.swing.JRadioButton();
        respuesta3 = new javax.swing.JRadioButton();
        respuesta4 = new javax.swing.JRadioButton();
        labelrespuesta = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabelRespuesta = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("jLabel1");

        respuesta1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        respuesta1.setText("jRadioButton1");
        respuesta1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                respuesta1ItemStateChanged(evt);
            }
        });
        respuesta1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                respuesta1StateChanged(evt);
            }
        });

        respuesta2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        respuesta2.setText("jRadioButton2");

        respuesta3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        respuesta3.setText("jRadioButton3");

        respuesta4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        respuesta4.setText("jRadioButton4");
        respuesta4.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                respuesta4StateChanged(evt);
            }
        });

        labelrespuesta.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelrespuesta.setText("Respuesta:");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Premio Ronda:");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Acumulado:");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setText("Ronda Acual");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setText("1");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setText("/5");

        jLabelRespuesta.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(respuesta2)
                                .addComponent(respuesta1)
                                .addComponent(respuesta3)
                                .addComponent(respuesta4))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelrespuesta)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelRespuesta))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 340, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(93, 93, 93))
            .addGroup(layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(respuesta1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(respuesta2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(respuesta3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(respuesta4)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelrespuesta)
                    .addComponent(jLabelRespuesta))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void respuesta4StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_respuesta4StateChanged

        // TODO add your handling code here:
    }//GEN-LAST:event_respuesta4StateChanged

    private void respuesta1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_respuesta1StateChanged

        // TODO add your handling code here:
    }//GEN-LAST:event_respuesta1StateChanged

    private void respuesta1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_respuesta1ItemStateChanged
      chekearrespuesta(respuesta1);
        // TODO add your handling code here:
    }//GEN-LAST:event_respuesta1ItemStateChanged
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(jugar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jugar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jugar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jugar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jugar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelRespuesta;
    private javax.swing.JLabel labelrespuesta;
    private javax.swing.JRadioButton respuesta1;
    private javax.swing.JRadioButton respuesta2;
    private javax.swing.JRadioButton respuesta3;
    private javax.swing.JRadioButton respuesta4;
    // End of variables declaration//GEN-END:variables
}
