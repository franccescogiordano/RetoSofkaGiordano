/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import CLASES.categorias;
import CLASES.dificultad;
import CLASES.jugador;
import CLASES.preguntas;
import CONTROLADORES.ctrlplayer;
import CONTROLADORES.ctrlquestions;
import PERSISTENCIA.CPrincipal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author franc
 */
public class main extends javax.swing.JFrame {

    /**
     * Creates new form main
     */
    public static List<jugador> jugadores = new ArrayList<jugador>();
    public static List<dificultad> dificultades = new ArrayList<dificultad>();
    public static List<categorias> cats = new ArrayList<categorias>();
    public static jugador usuariologeado = new jugador();
    public static List<preguntas> pregs = new ArrayList<preguntas>();
    ctrlplayer CP = new ctrlplayer();
    ctrlquestions CQ = new ctrlquestions();

    public static jugador player = new jugador();

    public main() {
        initComponents();
        jugadores = CP.cargarjugadores();
        dificultades = CQ.listadodifis();
        cats = CQ.listadocats();
        pregs = CQ.listapreguntas();
    }

    public void cargarBD() {
        List<preguntas> pregGenerales = new ArrayList<preguntas>();
        List<preguntas> pregsDeportes = new ArrayList<preguntas>();
        List<preguntas> pregsBiologia = new ArrayList<preguntas>();
        List<preguntas> pregsMatematica = new ArrayList<preguntas>();
        List<preguntas> pregsCiencia = new ArrayList<preguntas>();
        List<categorias> cat1 = new ArrayList<categorias>();
        List<categorias> cat2 = new ArrayList<categorias>();
        List<categorias> cat3 = new ArrayList<categorias>();
        List<categorias> cat4 = new ArrayList<categorias>();
        List<categorias> cat5 = new ArrayList<categorias>();
        preguntas preg1, preg2, preg3, preg4, preg5, preg6, preg7, preg8, preg9, preg10, preg11, preg12, preg13, preg14, preg15, preg16, preg17, preg18, preg19, preg20, preg21, preg22, preg23, preg24, preg25;
        dificultad MuyFacil, Facil, Normal, Dificil, MuyDificil;
        categorias General, Deportes, Biologia, Matematica, Ciencia;
        //MUY FACILES
        MuyFacil = new dificultad();
        MuyFacil.setNivel("Muy Facil");
        MuyFacil.setDescripcion("preguntas muy faciles");
        CPrincipal.getInstance().persist(MuyFacil);

        Facil = new dificultad();
        Facil.setNivel("Facil");
        Facil.setDescripcion("preguntas faciles");
        CPrincipal.getInstance().persist(Facil);

        Normal = new dificultad();
        Normal.setNivel("Normal");
        Normal.setDescripcion("preguntas Normales");
        CPrincipal.getInstance().persist(Normal);

        Dificil = new dificultad();
        Dificil.setNivel("Dificil");
        Dificil.setDescripcion("preguntas  Dificiles");
        CPrincipal.getInstance().persist(Dificil);

        MuyDificil = new dificultad();
        MuyDificil.setNivel("Muy Dificil");
        MuyDificil.setDescripcion("preguntas muy Dificiles");
        CPrincipal.getInstance().persist(MuyDificil);

        General = new categorias();
        General.setDificultad(MuyFacil);
        General.setDescripcion("Preguntas generales sin ninguna categoria en particular");

        CPrincipal.getInstance().persist(General);
        CPrincipal.getInstance().refresh(MuyFacil);

        preg1 = new preguntas();
        preg1.setPregunta("¿Cuántos minutos tiene una hora? ¿Y un día?");
        preg1.setRespuestac("60 , 1440");
        preg1.setRespuesta1("60 , 1880");
        preg1.setRespuesta2("42, 1440");
        preg1.setRespuesta3("800 , 92");
        pregGenerales.add(preg1);
        CPrincipal.getInstance().persist(preg1);

        preg2 = new preguntas();
        preg2.setPregunta("¿Cuál es el río más caudaloso del mundo?");
        preg2.setRespuestac("Amazonas");
        preg2.setRespuesta1("Nilo");
        preg2.setRespuesta2("Danubio");
        preg2.setRespuesta3("Yellow River");
        pregGenerales.add(preg1);
        CPrincipal.getInstance().persist(preg1);

        preg3 = new preguntas();
        preg3.setPregunta("¿Cada cuántos años tenemos un año bisiesto?");
        preg3.setRespuestac("4");
        preg3.setRespuesta1("2");
        preg3.setRespuesta2("6");
        preg3.setRespuesta3("8");
        pregGenerales.add(preg3);
        CPrincipal.getInstance().persist(preg3);

        preg4 = new preguntas();
        preg4.setPregunta("¿Cuántas patas tiene una araña?");
        preg4.setRespuestac("8");
        preg4.setRespuesta1("9");
        preg4.setRespuesta2("16");
        preg4.setRespuesta3("23");
        pregGenerales.add(preg4);
        CPrincipal.getInstance().persist(preg4);

        preg5 = new preguntas();
        preg5.setPregunta("¿Cuántos meses tienen 28 días?");
        preg5.setRespuestac("12");
        preg5.setRespuesta1("6");
        preg5.setRespuesta2("4");
        preg5.setRespuesta3("8");
        pregGenerales.add(preg5);
        CPrincipal.getInstance().persist(preg5);

        //FACILES
        Deportes = new categorias();
        Deportes.setDificultad(Facil);
        Deportes.setDescripcion("Preguntas sobre deportes");

        CPrincipal.getInstance().persist(Deportes);
        CPrincipal.getInstance().refresh(MuyFacil);

        preg6 = new preguntas();
        preg6.setPregunta("¿Cual es el segundo pais con mas mundiales ganados en el futbol?");
        preg6.setRespuestac("Italia");
        preg6.setRespuesta1("Rusia");
        preg6.setRespuesta2("Argentina");
        preg6.setRespuesta3("Africa");
        pregGenerales.add(preg6);
        CPrincipal.getInstance().persist(preg6);

        preg7 = new preguntas();
        preg7.setPregunta("¿Quien es el maximo anotador de la historia de la NBA?");
        preg7.setRespuestac("Kareem Abdul-Jabbar");
        preg7.setRespuesta1("Wilt Chamberlain");
        preg7.setRespuesta2("Shaquille O'neal");
        preg7.setRespuesta3("LeBron James");
        pregGenerales.add(preg7);
        CPrincipal.getInstance().persist(preg7);

        preg8 = new preguntas();
        preg8.setPregunta("¿Quien es el tenista más ganador en el Roland Garros?");
        preg8.setRespuestac("Rafael Nadal");
        preg8.setRespuesta1("Roger Federer");
        preg8.setRespuesta2("Daniil Medvédev");
        preg8.setRespuesta3("Ivan Lendl");
        pregGenerales.add(preg8);
        CPrincipal.getInstance().persist(preg8);

        preg9 = new preguntas();
        preg9.setPregunta("¿Cual es considerado el mejor jugador en la historia de nueva zelanda en rugby?");
        preg9.setRespuestac("Jonah Lomu");
        preg9.setRespuesta1("Zizan Brooke");
        preg9.setRespuesta2("Gareth Edwars");
        preg9.setRespuesta3("Jonny Wilkinson");
        pregGenerales.add(preg9);
        CPrincipal.getInstance().persist(preg9);

        preg10 = new preguntas();
        preg10.setPregunta("¿Quien es el deportista que más gano medallas de oro en la historia de los juegos olimpicos?");
        preg10.setRespuestac("Michael Phelps");
        preg10.setRespuesta1("Hadia Hosny");
        preg10.setRespuesta2("Charlotte Hym");
        preg10.setRespuesta3("Nadine Apetz");
        pregGenerales.add(preg10);
        CPrincipal.getInstance().persist(preg10);

        //NORMALES ---------------------------------------------------------------------------
        Biologia = new categorias();
        Biologia.setDificultad(Normal);
        Biologia.setDescripcion("Preguntas sobre Biologia");

        CPrincipal.getInstance().persist(Biologia);
        CPrincipal.getInstance().refresh(Normal);

        preg11 = new preguntas();
        preg11.setPregunta("¿Qué es el efecto invernadero?");
        preg11.setRespuestac("Es un fenómeno natural y beneficioso");
        preg11.setRespuesta1("La combustiones y el uso de energía no renovable lo disminuye");
        preg11.setRespuesta2("Gases como CO2 lo disminuye");
        preg11.setRespuesta3("No eleva la temperatura global de la tierra");
        pregsBiologia.add(preg11);
        CPrincipal.getInstance().persist(preg11);

        preg12 = new preguntas();
        preg12.setPregunta("¿Qué sistema interviene en el ingreso y degradación de los alimentos?");
        preg12.setRespuestac("Es fundamental para que las plantas con flores se reproduzcan");
        preg12.setRespuesta1("Empeora la reproduccion de los vegetales en general");
        preg12.setRespuesta2("No requiere de agentes polinizadores");
        preg12.setRespuesta3("Es el traslado de ovulos de una planta a otra");
        pregsBiologia.add(preg12);
        CPrincipal.getInstance().persist(preg12);

        preg13 = new preguntas();
        preg13.setPregunta("¿Qué sistema interviene en el ingreso y degradación de los alimentos?");
        preg13.setRespuestac("El sistema digestivo");
        preg13.setRespuesta1("El sistema circulatorio");
        preg13.setRespuesta2("El sistema inmunologico");
        preg13.setRespuesta3("El sistema locomotor");
        pregsBiologia.add(preg13);
        CPrincipal.getInstance().persist(preg13);

        preg14 = new preguntas();
        preg14.setPregunta("Las arañas par visualizar a sus presas posee:");
        preg14.setRespuestac("4 pares de ojo");
        preg14.setRespuesta1("8 ocelos");
        preg14.setRespuesta2("2 pares de ojos compuesto");
        preg14.setRespuesta3("1 par de antenas");
        pregsBiologia.add(preg14);
        CPrincipal.getInstance().persist(preg14);

        preg15 = new preguntas();
        preg15.setPregunta("La atmosfera terrestre consta es una mezcla de gases que permitan la vida en la tierra. \n ¿Cuales son esos gases?");
        preg15.setRespuestac("79% N2, 21% O2, 1% Ar %0,04 CO2");
        preg15.setRespuesta1("79% CO2, 21% O2, 1% Ar %0,04 N2");
        preg15.setRespuesta2("79% CO2, 21% O2, 1% N2 %0,04 Ar");
        preg15.setRespuesta3("Ninguna de las anteriores");
        pregsBiologia.add(preg15);
        CPrincipal.getInstance().persist(preg15);
        
           //DIFICILES ---------------------------------------------------------------------------
        Matematica = new categorias();
        Matematica.setDificultad(Dificil);
        Matematica.setDescripcion("Preguntas sobre Matematica");

        CPrincipal.getInstance().persist(Matematica);
        CPrincipal.getInstance().refresh(Dificil);

        preg16 = new preguntas();
        preg16.setPregunta("¿Qué es el efecto invernadero?");
        preg16.setRespuestac("Es un fenómeno natural y beneficioso");
        preg16.setRespuesta1("La combustiones y el uso de energía no renovable lo disminuye");
        preg16.setRespuesta2("Gases como CO2 lo disminuye");
        preg16.setRespuesta3("No eleva la temperatura global de la tierra");
        pregsBiologia.add(preg16);
        CPrincipal.getInstance().persist(preg16);
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
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jtxtusername = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("CONCURSO DE PREGUNTAS Y RESPUESTAS");

        jButton1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton1.setText("Iniciar Sesion");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Usuario:");

        jtxtusername.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jButton2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton2.setText("Registrarse");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtxtusername, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(jButton1)
                        .addGap(72, 72, 72)
                        .addComponent(jButton2)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtxtusername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String username = jtxtusername.getText();
        player = CP.getplayer(username);
        if (player == null) {

            System.out.println("no existe fantasma, igual que el Rodro");

        } else {
            menuprincipal menu = new menuprincipal(player);
            menu.setVisible(true);
            //  usuariologeado = player;
            this.setVisible(false);

        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        crearusuario crearusu = new crearusuario();
        crearusu.setVisible(true);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jtxtusername;
    // End of variables declaration//GEN-END:variables
}
