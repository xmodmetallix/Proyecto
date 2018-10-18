import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author R2D2
 */
public class AplicacionTest extends javax.swing.JFrame {
    ArrayList<Pregunta> preguntas;
    ArrayList<Opcion> opciones;
    ArrayList<JRadioButton> radios;
    
    /**
     * Creates new form AplicacionTest
     */
    public AplicacionTest() {
        initComponents();
        preguntas =  obtenerCuestionario();
        radios = new ArrayList<>();
        radios.add(radioOp1);
        radios.add(radioOp2);
        radios.add(radioOp3);
        radios.add(radioOp4);
        siguiente.setEnabled(false);
        //vamos a llenar estos radio button con las opc de la primer pregunta
        for(int i=0; i<radios.size(); i++){
            radios.get(i).setText(preguntas.get(0).getOpcions().get(i).getTitulo());
        }
        etiquetaPreguntaTitulo.setText(preguntas.get(0).getTitulo());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        etiquetaPreguntaTitulo = new javax.swing.JLabel();
        radioOp1 = new javax.swing.JRadioButton();
        radioOp2 = new javax.swing.JRadioButton();
        radioOp3 = new javax.swing.JRadioButton();
        radioOp4 = new javax.swing.JRadioButton();
        checarRespuesta = new javax.swing.JButton();
        siguiente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        etiquetaPreguntaTitulo.setText("jLabel1");

        buttonGroup1.add(radioOp1);
        radioOp1.setText("jRadioButton1");
        radioOp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioOp1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(radioOp2);
        radioOp2.setText("jRadioButton2");

        buttonGroup1.add(radioOp3);
        radioOp3.setText("jRadioButton3");

        buttonGroup1.add(radioOp4);
        radioOp4.setText("jRadioButton4");

        checarRespuesta.setText("Checar respuesta");
        checarRespuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checarRespuestaActionPerformed(evt);
            }
        });

        siguiente.setText("Siguiente");
        siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radioOp4)
                            .addComponent(radioOp3)
                            .addComponent(radioOp2)
                            .addComponent(radioOp1)
                            .addComponent(etiquetaPreguntaTitulo))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(checarRespuesta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                        .addComponent(siguiente)
                        .addGap(40, 40, 40))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(etiquetaPreguntaTitulo)
                .addGap(27, 27, 27)
                .addComponent(radioOp1)
                .addGap(18, 18, 18)
                .addComponent(radioOp2)
                .addGap(18, 18, 18)
                .addComponent(radioOp3)
                .addGap(18, 18, 18)
                .addComponent(radioOp4)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checarRespuesta)
                    .addComponent(siguiente))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void radioOp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioOp1ActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_radioOp1ActionPerformed

    private void siguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_siguienteActionPerformed

    private void checarRespuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checarRespuestaActionPerformed
        // TODO add your handling code here:
        siguiente.setEnabled(true);
        for(int i=0; i<radios.size(); i++){
            if (radios.isEmpty()){
                JOptionPane.showMessageDialog(null,"Elemento no seleccionado");
            }
        }
        checarRespuesta.setEnabled(false);
    }//GEN-LAST:event_checarRespuestaActionPerformed

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
            java.util.logging.Logger.getLogger(AplicacionTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AplicacionTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AplicacionTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AplicacionTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AplicacionTest().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton checarRespuesta;
    private javax.swing.JLabel etiquetaPreguntaTitulo;
    private javax.swing.JRadioButton radioOp1;
    private javax.swing.JRadioButton radioOp2;
    private javax.swing.JRadioButton radioOp3;
    private javax.swing.JRadioButton radioOp4;
    private javax.swing.JButton siguiente;
    // End of variables declaration//GEN-END:variables
public ArrayList<Pregunta> obtenerCuestionario(){
    
        Opcion op1 = new Opcion("Missisipi", false);
        Opcion op2 = new Opcion("Nilo", false);
        Opcion op3 = new Opcion("Amazonas", true);
        Opcion op4 = new Opcion("Bravo", false);
        ArrayList<Opcion> opciones = new ArrayList<>();
        opciones.add(op1);
        opciones.add(op2);
        opciones.add(op3);
        opciones.add(op4);
        Pregunta p1 = new Pregunta("1) ¿Cuál es el río mas largo del mundo?", opciones);

        Opcion op11 = new Opcion("Estados Unidos", false);
        Opcion op12 = new Opcion("Chile", false);
        Opcion op13 = new Opcion("México", false);
        Opcion op14 = new Opcion("Canadá", true);
        ArrayList<Opcion> opciones1 = new ArrayList<>();
        opciones1.add(op11);
        opciones1.add(op12);
        opciones1.add(op13);
        opciones1.add(op14);
        Pregunta p2 = new Pregunta("2) ¿A qué país pertenece la capital de Ottawa?", opciones1);
        
        Opcion op21 = new Opcion("Franz Kafka", false);
        Opcion op22 = new Opcion("Jorge Luis Borges", false);
        Opcion op23 = new Opcion("Gabriel García Márquez", false);
        Opcion op24 = new Opcion("Miguel de Cervantes", true);
        ArrayList<Opcion> opciones2 = new ArrayList<>();
        opciones2.add(op21);
        opciones2.add(op22);
        opciones2.add(op23);
        opciones2.add(op24);
        Pregunta p3 = new Pregunta("3) ¿Quién es el autor de: Don Quijote de la Mancha?", opciones2);
        
        Opcion op31 = new Opcion("Leonardo da Vinci", true);
        Opcion op32 = new Opcion("Vincent van Gogh", false);
        Opcion op33 = new Opcion("Salvador Dalí", false);
        Opcion op34 = new Opcion("Pablo Picasso", false);
        ArrayList<Opcion> opciones3 = new ArrayList<>();
        opciones3.add(op31);
        opciones3.add(op32);
        opciones3.add(op33);
        opciones3.add(op34);
        Pregunta p4 = new Pregunta("4) ¿Quién creó la pintura mural de La última cena?", opciones3);
        
        Opcion op41 = new Opcion("Desierto Kalahari", false);
        Opcion op42 = new Opcion("Desierto de Lut", true);
        Opcion op43 = new Opcion("Desierto del Sahara", false);
        Opcion op44 = new Opcion("Desierto de los leones", false);
        ArrayList<Opcion> opciones4 = new ArrayList<>();
        opciones4.add(op41);
        opciones4.add(op42);
        opciones4.add(op43);
        opciones4.add(op44);
        Pregunta p5 = new Pregunta("5) ¿Cuál es el lugar más caluroso del planeta?", opciones4);
        
        Opcion op51 = new Opcion("Texas", false);
        Opcion op52 = new Opcion("DF", false);
        Opcion op53 = new Opcion("Tokyo", true);
        Opcion op54 = new Opcion("Ucrania", false);
        ArrayList<Opcion> opciones5 = new ArrayList<>();
        opciones5.add(op51);
        opciones5.add(op52);
        opciones5.add(op53);
        opciones5.add(op54);
        Pregunta p6 = new Pregunta("6) Ciudad mas poblada del mundo", opciones5);
        
        Opcion op61 = new Opcion("Okinawa", false);
        Opcion op62 = new Opcion("Palestina", false);
        Opcion op63 = new Opcion("Pristina", true);
        Opcion op64 = new Opcion("Konoha", false);
        ArrayList<Opcion> opciones6 = new ArrayList<>();
        opciones6.add(op61);
        opciones6.add(op62);
        opciones6.add(op63);
        opciones6.add(op64);
        Pregunta p7 = new Pregunta("7) ¿Cuál es la capital de Kosovo?", opciones6);
        
        Opcion op71 = new Opcion("Adamantium", false);
        Opcion op72 = new Opcion("Plata", false);
        Opcion op73 = new Opcion("Oro", false);
        Opcion op74 = new Opcion("Rodio", true);
        ArrayList<Opcion> opciones7 = new ArrayList<>();
        opciones7.add(op71);
        opciones7.add(op72);
        opciones7.add(op73);
        opciones7.add(op74);
        Pregunta p8 = new Pregunta("8) ¿Cuál es el metal más caro del mundo?", opciones7);
                
        ArrayList<Pregunta> preguntas = new ArrayList<>();
        preguntas.add(p1);
        preguntas.add(p2);
        preguntas.add(p3);
        preguntas.add(p4);
        preguntas.add(p5);
        preguntas.add(p6);
        preguntas.add(p7);
        preguntas.add(p8);
        return preguntas;
    }
}
