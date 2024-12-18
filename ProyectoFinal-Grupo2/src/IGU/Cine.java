/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package IGU;

import javax.swing.JOptionPane;

/**
 *
 * @author angeg
 */
public class Cine extends javax.swing.JFrame {

    /**
     * Creates new form Cine
     */
    public Cine() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botones = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        bSee = new javax.swing.JRadioButton();
        bChange = new javax.swing.JRadioButton();
        bDelete = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("¿Que desea hacer?");

        bSee.setForeground(new java.awt.Color(0, 0, 0));
        bSee.setText("Ver salas");

        bChange.setForeground(new java.awt.Color(0, 0, 0));
        bChange.setText("Modificar Salas");
        bChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bChangeActionPerformed(evt);
            }
        });

        bDelete.setForeground(new java.awt.Color(0, 0, 0));
        bDelete.setText("Borrar Salas");

        jButton1.setText("Siguiente");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Atras");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(bDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(bSee, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(bChange, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(90, 90, 90))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addComponent(bSee)
                .addGap(18, 18, 18)
                .addComponent(bChange)
                .addGap(18, 18, 18)
                .addComponent(bDelete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(67, 67, 67))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bChangeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bChangeActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //creacion de botones
        botones.add(bSee);
        botones.add(bChange);
        botones.add(bDelete);

        int contadorSalas = 0;
        //instancia de los diferentes objetos
        proyectofinal.grupo2.Cine sala[] = new proyectofinal.grupo2.Cine[100];
        proyectofinal.grupo2.Trabajador trabajador1[] = new proyectofinal.grupo2.Trabajador[30];
        trabajador1[0] = new proyectofinal.grupo2.Trabajador("Mike", "It", "1");
        trabajador1[1] = new proyectofinal.grupo2.Trabajador("Juan", "It", "2");
        trabajador1[2] = new proyectofinal.grupo2.Trabajador("Hernest", "It", "3");
        trabajador1[3] = new proyectofinal.grupo2.Trabajador("Sofia", "It", "4");
        trabajador1[4] = new proyectofinal.grupo2.Trabajador("Juliana", "It", "5");
        trabajador1[5] = new proyectofinal.grupo2.Trabajador("Fernanda", "It", "6");
        trabajador1[6] = new proyectofinal.grupo2.Trabajador("Bravo", "It", "7");
        String mensaje = "";
        String peliculas[] = {"Amistad", "Ángeles", "Ali", "Admitido", "El escape perfecto"};
        //marcador de botones
        if (bSee.isSelected()) {

            if (contadorSalas == 0) {
                JOptionPane.showMessageDialog(null, "No hay salas que se puedan ver");

            } else {
                for (int i = 0; i < contadorSalas; i++) {
                    mensaje += sala[i].getNomPelicula() + "\n" + sala[i].mostrarSalas();
                }
                JOptionPane.showMessageDialog(null, mensaje);
            }

        } else if (bChange.isSelected()) {
            int ciclo1 = Integer.parseInt(JOptionPane.showInputDialog("Cuantas salas va a crear"));
            mensaje = "";
            for (int t = 0; t < peliculas.length; t++) {
                mensaje += peliculas[t] + "\n";

            }
            JOptionPane.showMessageDialog(null, mensaje);
            String nombrePelicula = JOptionPane.showInputDialog("Cual es la pelicula que quiere escoger");

            for (int i = 0; i < ciclo1; i++) {
                int cantidadAsietnos = Integer.parseInt(JOptionPane.showInputDialog("Cuantos asientos va a tener la sala"));
                if (cantidadAsietnos > 31) {
                    JOptionPane.showMessageDialog(null, "No se pueden tener mas de 30 asientos se asigo la cantidad maxima automaticamente");
                    cantidadAsietnos = 30;
                }

                sala[contadorSalas] = new proyectofinal.grupo2.Cine(cantidadAsietnos, trabajador1, nombrePelicula);
                for (int j = 0; j < cantidadAsietnos; j++) {

                    sala[i].ocuparAsientos();

                }
                for (int j = 0; j < cantidadAsietnos; j++) {
                    sala[i].llenarTrabajadores(trabajador1);
                }

                contadorSalas++;

            }

        } else if (bDelete.isSelected()) {

        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton bChange;
    private javax.swing.JRadioButton bDelete;
    private javax.swing.JRadioButton bSee;
    private javax.swing.ButtonGroup botones;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
