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

    public void verificarycargaridifs() {
        List<preguntas> lista = new ArrayList<preguntas>();
        dificultad dif = null;
        int i=0;
        Iterator<dificultad> it = main.dificultades.iterator();
        while (it.hasNext()) {
            dif = it.next();
            if (dif.getNivel().equals("Facil")) {
                i++;
            }else if  ( dif.getNivel().equals("Muy Facil")){
                i++;
            }else  if( dif.getNivel().equals("Normal")){
                i++;
                    }else if ( dif.getNivel().equals("Dificil")){
                        i++;
                    }else if ( dif.getNivel().equals("Muy Dificil")){
                        i++;
                    }

        }
        if(i==5){
            
        }else{
            
        }
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
        General.setNombre("General");
        General.setDescripcion("Preguntas generales sin ninguna categoria en particular");

        CPrincipal.getInstance().persist(General);
        CPrincipal.getInstance().merge(MuyFacil);

        preg1 = new preguntas();
        preg1.setPregunta("¿Cuántos minutos tiene una hora? ¿Y un día?");
        preg1.setRespuestac("60 , 1440");
        preg1.setRespuesta1("60 , 1880");
        preg1.setRespuesta2("42, 1440");
        preg1.setRespuesta3("800 , 92");
        preg1.setCategoria(General);
        pregGenerales.add(preg1);
        CPrincipal.getInstance().persist(preg1);

        preg2 = new preguntas();
        preg2.setPregunta("¿Cuál es el río más caudaloso del mundo?");
        preg2.setRespuestac("Amazonas");
        preg2.setRespuesta1("Nilo");
        preg2.setRespuesta2("Danubio");
        preg2.setRespuesta3("Yellow River");
        preg2.setCategoria(General);
        pregGenerales.add(preg1);
        CPrincipal.getInstance().persist(preg1);

        preg3 = new preguntas();
        preg3.setCategoria(General);
        preg3.setPregunta("¿Cada cuántos años tenemos un año bisiesto?");
        preg3.setRespuestac("4");
        preg3.setRespuesta1("2");
        preg3.setRespuesta2("6");
        preg3.setRespuesta3("8");
        pregGenerales.add(preg3);
        CPrincipal.getInstance().persist(preg3);

        preg4 = new preguntas();
        preg4.setCategoria(General);
        preg4.setPregunta("¿Cuántas patas tiene una araña?");
        preg4.setRespuestac("8");
        preg4.setRespuesta1("9");
        preg4.setRespuesta2("16");
        preg4.setRespuesta3("23");
        pregGenerales.add(preg4);
        CPrincipal.getInstance().persist(preg4);

        preg5 = new preguntas();
        preg5.setCategoria(General);
        preg5.setPregunta("¿Cuántos meses tienen 28 días?");
        preg5.setRespuestac("12");
        preg5.setRespuesta1("6");
        preg5.setRespuesta2("4");
        preg5.setRespuesta3("8");
        pregGenerales.add(preg5);
        CPrincipal.getInstance().persist(preg5);

        //FACILES
        Deportes = new categorias();
        Deportes.setNombre("Deportes");
        Deportes.setDificultad(Facil);
        Deportes.setDescripcion("Preguntas sobre deportes");

        CPrincipal.getInstance().persist(Deportes);
        CPrincipal.getInstance().merge(MuyFacil);

        preg6 = new preguntas();
        preg6.setPregunta("¿Cual es el segundo pais con mas mundiales ganados en el futbol?");
        preg6.setRespuestac("Italia");
        preg6.setRespuesta1("Rusia");
        preg6.setRespuesta2("Argentina");
        preg6.setRespuesta3("Africa");
        preg6.setCategoria(Deportes);
        pregsDeportes.add(preg6);
        CPrincipal.getInstance().persist(preg6);

        preg7 = new preguntas();
        preg7.setPregunta("¿Quien es el maximo anotador de la historia de la NBA?");
        preg7.setRespuestac("Kareem Abdul-Jabbar");
        preg7.setRespuesta1("Wilt Chamberlain");
        preg7.setRespuesta2("Shaquille O'neal");
        preg7.setRespuesta3("LeBron James");
        preg7.setCategoria(Deportes);
        pregsDeportes.add(preg7);
        CPrincipal.getInstance().persist(preg7);

        preg8 = new preguntas();
        preg8.setPregunta("¿Quien es el tenista más ganador en el Roland Garros?");
        preg8.setRespuestac("Rafael Nadal");
        preg8.setRespuesta1("Roger Federer");
        preg8.setRespuesta2("Daniil Medvédev");
        preg8.setRespuesta3("Ivan Lendl");
        preg8.setCategoria(Deportes);
        pregsDeportes.add(preg8);
        CPrincipal.getInstance().persist(preg8);

        preg9 = new preguntas();
        preg9.setPregunta("¿Cual es considerado el mejor jugador en la historia de nueva zelanda en rugby?");
        preg9.setRespuestac("Jonah Lomu");
        preg9.setRespuesta1("Zizan Brooke");
        preg9.setRespuesta2("Gareth Edwars");
        preg9.setRespuesta3("Jonny Wilkinson");
        preg9.setCategoria(Deportes);
        pregsDeportes.add(preg9);
        CPrincipal.getInstance().persist(preg9);

        preg10 = new preguntas();
        preg10.setPregunta("¿Quien es el deportista que más gano medallas de oro en la historia de los juegos olimpicos?");
        preg10.setRespuestac("Michael Phelps");
        preg10.setRespuesta1("Hadia Hosny");
        preg10.setRespuesta2("Charlotte Hym");
        preg10.setRespuesta3("Nadine Apetz");
        preg10.setCategoria(Deportes);
        pregsDeportes.add(preg10);
        CPrincipal.getInstance().persist(preg10);

        //NORMALES ---------------------------------------------------------------------------
        Biologia = new categorias();
        Biologia.setDificultad(Normal);
        Biologia.setDescripcion("Preguntas sobre Biologia");
        Biologia.setNombre("Biologia");
        CPrincipal.getInstance().persist(Biologia);
        CPrincipal.getInstance().refresh(Normal);

        preg11 = new preguntas();
        preg11.setPregunta("¿Qué es el efecto invernadero?");
        preg11.setRespuestac("Es un fenómeno natural y beneficioso");
        preg11.setRespuesta1("La combustiones y el uso de energía no renovable lo disminuye");
        preg11.setRespuesta2("Gases como CO2 lo disminuye");
        preg11.setRespuesta3("No eleva la temperatura global de la tierra");
        preg11.setCategoria(Biologia);
        pregsBiologia.add(preg11);
        CPrincipal.getInstance().persist(preg11);

        preg12 = new preguntas();
        preg12.setCategoria(Biologia);
        preg12.setPregunta("¿Qué sistema interviene en el ingreso y degradación de los alimentos?");
        preg12.setRespuestac("Es fundamental para que las plantas con flores se reproduzcan");
        preg12.setRespuesta1("Empeora la reproduccion de los vegetales en general");
        preg12.setRespuesta2("No requiere de agentes polinizadores");
        preg12.setRespuesta3("Es el traslado de ovulos de una planta a otra");
        pregsBiologia.add(preg12);
        CPrincipal.getInstance().persist(preg12);

        preg13 = new preguntas();
        preg13.setCategoria(Biologia);
        preg13.setPregunta("¿Qué sistema interviene en el ingreso y degradación de los alimentos?");
        preg13.setRespuestac("El sistema digestivo");
        preg13.setRespuesta1("El sistema circulatorio");
        preg13.setRespuesta2("El sistema inmunologico");
        preg13.setRespuesta3("El sistema locomotor");
        pregsBiologia.add(preg13);
        CPrincipal.getInstance().persist(preg13);

        preg14 = new preguntas();
        preg14.setCategoria(Biologia);
        preg14.setPregunta("Las arañas par visualizar a sus presas posee:");
        preg14.setRespuestac("4 pares de ojo");
        preg14.setRespuesta1("8 ocelos");
        preg14.setRespuesta2("2 pares de ojos compuesto");
        preg14.setRespuesta3("1 par de antenas");
        pregsBiologia.add(preg14);
        CPrincipal.getInstance().persist(preg14);

        preg15 = new preguntas();
        preg15.setCategoria(Biologia);
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
        Matematica.setNombre("Matematica");
        CPrincipal.getInstance().persist(Matematica);
        CPrincipal.getInstance().refresh(Dificil);

        preg16 = new preguntas();
        preg16.setCategoria(Matematica);
        preg16.setPregunta("Adivina cuántos años tegno sabiendo que la tercera parte de ellos menos 1 es igual a la sexta parte");
        preg16.setRespuestac("6");
        preg16.setRespuesta1("5");
        preg16.setRespuesta2("7");
        preg16.setRespuesta3("8");
        pregsMatematica.add(preg16);
        CPrincipal.getInstance().persist(preg16);

        preg17 = new preguntas();
        preg17.setCategoria(Matematica);
        preg17.setPregunta("¿A cuánto equivale π?");
        preg17.setRespuestac("3,141592");
        preg17.setRespuesta1("3,149215");
        preg17.setRespuesta2("3,144243");
        preg17.setRespuesta3("3,144123");
        pregsMatematica.add(preg17);
        CPrincipal.getInstance().persist(preg17);

        preg18 = new preguntas();
        preg18.setCategoria(Matematica);
        preg18.setPregunta("7/5 + 2/3 - 1");
        preg18.setRespuestac("16/15");
        preg18.setRespuesta1("17/15");
        preg18.setRespuesta2("8/8");
        preg18.setRespuesta3("1");
        pregsMatematica.add(preg18);
        CPrincipal.getInstance().persist(preg18);

        preg19 = new preguntas();
        preg19.setCategoria(Matematica);
        preg19.setPregunta("¿Que formula es esta? \n S= π x R²");
        preg19.setRespuestac("Superficie de un circulo");
        preg19.setRespuesta1("Diametro de un circulo");
        preg19.setRespuesta2("Volumen de un cilindro");
        preg19.setRespuesta3("Superficie de paralelogramos");
        pregsMatematica.add(preg19);
        CPrincipal.getInstance().persist(preg19);

        preg20 = new preguntas();
        preg20.setCategoria(Matematica);
        preg20.setPregunta("(-3)³ + (-2)³ - (-3)³ + (-1)³ =");
        preg20.setRespuestac("-9");
        preg20.setRespuesta1("10");
        preg20.setRespuesta2("9");
        preg20.setRespuesta3("-10");
        pregsMatematica.add(preg20);
        CPrincipal.getInstance().persist(preg20);

        //MUY DIFICILES ---------------------------------------------------------------------------
        Ciencia = new categorias();
        Ciencia.setDificultad(MuyDificil);
        Ciencia.setDescripcion("Preguntas sobre Ciencia");
        Ciencia.setNombre("Ciencia");
        CPrincipal.getInstance().persist(Ciencia);
        CPrincipal.getInstance().refresh(MuyDificil);

        preg21 = new preguntas();
        preg21.setCategoria(Ciencia);
        preg21.setPregunta("¿Cómo se llama el componente mínimo que forma a los seres vivos?");
        preg21.setRespuestac("Célula");
        preg21.setRespuesta1("Tejido");
        preg21.setRespuesta2("Particula");
        preg21.setRespuesta3("Poros");
        pregsCiencia.add(preg21);
        CPrincipal.getInstance().persist(preg21);

        preg22 = new preguntas();
        preg22.setCategoria(Ciencia);
        preg22.setPregunta("El proceso por el que una célula se divide para formar dos células hijas se llama:");
        preg22.setRespuestac("Mitosis");
        preg22.setRespuesta1("Segregación");
        preg22.setRespuesta2("Meosis");
        preg22.setRespuesta3("Tesis");
        pregsCiencia.add(preg22);
        CPrincipal.getInstance().persist(preg22);

        preg23 = new preguntas();
        preg23.setCategoria(Ciencia);
        preg23.setPregunta("La información genética en las células se localiza:");
        preg23.setRespuestac("Célula");
        preg23.setRespuesta1("Tejido");
        preg23.setRespuesta2("Particula");
        preg23.setRespuesta3("Poros");
        pregsCiencia.add(preg23);
        CPrincipal.getInstance().persist(preg23);

        preg24 = new preguntas();
        preg24.setCategoria(Ciencia);
        preg24.setPregunta("La información genética en las células se localiza:");
        preg24.setRespuestac("En el nucleo");
        preg24.setRespuesta1("En la membrana");
        preg24.setRespuesta2("En el citoplasma");
        preg24.setRespuesta3("En el sistema linfatico");
        pregsCiencia.add(preg24);
        CPrincipal.getInstance().persist(preg24);

        preg25 = new preguntas();
        preg25.setCategoria(Ciencia);
        preg25.setPregunta("¿Con qué respira una ballena?");
        preg25.setRespuestac("Pulmones");
        preg25.setRespuesta1("Por la piel");
        preg25.setRespuesta2("Branquias");
        preg25.setRespuesta3("Por la boca");
        pregsCiencia.add(preg25);
        CPrincipal.getInstance().persist(preg25);

        General.setPreguntass(pregGenerales);
        Deportes.setPreguntass(pregsDeportes);
        Matematica.setPreguntass(pregsMatematica);
        Biologia.setPreguntass(pregsBiologia);
        Ciencia.setPreguntass(pregsCiencia);

        CPrincipal.getInstance().merge(General);
        CPrincipal.getInstance().merge(Deportes);
        CPrincipal.getInstance().merge(Matematica);
        CPrincipal.getInstance().merge(Biologia);
        CPrincipal.getInstance().merge(Ciencia);

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
        jToggleButton1 = new javax.swing.JToggleButton();

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

        jToggleButton1.setText("Cargar BD");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
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
                .addContainerGap(77, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jToggleButton1)
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
            this.dispose();

        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        crearusuario crearusu = new crearusuario();
        crearusu.setVisible(true);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        cargarBD();
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton1ActionPerformed

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
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTextField jtxtusername;
    // End of variables declaration//GEN-END:variables
}
