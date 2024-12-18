/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package IGU;

/**
 *
 * @author angeg
 */
public class MenuBaile extends javax.swing.JFrame {

    /**
     * Creates new form MenuBaile
     */
    public MenuBaile() {
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
        bDo = new javax.swing.JRadioButton();
        bDelete = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("¿Que desea hacer?");

        bSee.setForeground(new java.awt.Color(0, 0, 0));
        bSee.setText("Ver reservaciones");

        bDo.setForeground(new java.awt.Color(0, 0, 0));
        bDo.setText("Hacer reservaciones");

        bDelete.setForeground(new java.awt.Color(0, 0, 0));
        bDelete.setText("Borrar reservaciones");

        jButton1.setText("Atras");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Siguiente");
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
                .addGap(134, 134, 134)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bSee, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bDo)
                    .addComponent(bDelete))
                .addContainerGap(136, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(56, 56, 56))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(bSee)
                .addGap(33, 33, 33)
                .addComponent(bDo)
                .addGap(38, 38, 38)
                .addComponent(bDelete)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(58, Short.MAX_VALUE))
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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //creacion de botones
        botones.add(bDo);
        botones.add(bDelete);
        botones.add(bSee);

        //instancia de objetos
        proyectofinal.grupo2.Baile clase = new proyectofinal.grupo2.Baile();
        proyectofinal.grupo2.Trabajador trabajador1[] = new proyectofinal.grupo2.Trabajador[30];
        trabajador1[0] = new proyectofinal.grupo2.Trabajador("Mike", "It", "1");
        trabajador1[1] = new proyectofinal.grupo2.Trabajador("Juan", "It", "2");
        trabajador1[2] = new proyectofinal.grupo2.Trabajador("Hernest", "It", "3");
        trabajador1[3] = new proyectofinal.grupo2.Trabajador("Sofia", "It", "4");
        trabajador1[4] = new proyectofinal.grupo2.Trabajador("Juliana", "It", "5");
        trabajador1[5] = new proyectofinal.grupo2.Trabajador("Fernanda", "It", "6");
        trabajador1[6] = new proyectofinal.grupo2.Trabajador("Bravo", "It", "7");

        //manejo de opciones
        if (bSee.isSelected()) {

            clase.mostrarReservaciones();

        } else if (bDo.isSelected()) {

            clase.reservarBaile(trabajador1);

        } else if (bDelete.isSelected()) {
            clase.eliminarReserva();

        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //boton atras  
        Trabajador menu = new Trabajador();
        menu.setVisible(true);
        this.dispose();
        menu.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton bDelete;
    private javax.swing.JRadioButton bDo;
    private javax.swing.JRadioButton bSee;
    private javax.swing.ButtonGroup botones;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}