/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author 21PROGA005
 */
public class ventana4 extends javax.swing.JFrame {
    alumno objeto = new alumno();
    /**
     * Creates new form ventana4
     */
    public ventana4() {
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

        lblasig = new javax.swing.JLabel();
        lblMateria = new javax.swing.JLabel();
        lblpar1 = new javax.swing.JLabel();
        lblpar2 = new javax.swing.JLabel();
        lblpar3 = new javax.swing.JLabel();
        lblprom = new javax.swing.JLabel();
        txtmateria = new javax.swing.JTextField();
        txtcal1 = new javax.swing.JTextField();
        txtcal2 = new javax.swing.JTextField();
        txtCal3 = new javax.swing.JTextField();
        btnres2 = new javax.swing.JButton();
        txt6 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblasig.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        lblasig.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblasig.setText(" ASIGNATURA");

        lblMateria.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        lblMateria.setText("MATERIA");

        lblpar1.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        lblpar1.setText("CALIFICACION PARCIAL 1");

        lblpar2.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        lblpar2.setText("CALIFICACION PARCIAL 2");

        lblpar3.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        lblpar3.setText("CALIFICACION PARCIAL 3");

        lblprom.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        lblprom.setText("PROMEDIO");

        txtmateria.setBackground(new java.awt.Color(204, 255, 204));
        txtmateria.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtmateria.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtcal1.setBackground(new java.awt.Color(204, 255, 204));
        txtcal1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtcal1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtcal2.setBackground(new java.awt.Color(204, 255, 204));
        txtcal2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtcal2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtCal3.setBackground(new java.awt.Color(204, 255, 204));
        txtCal3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtCal3.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnres2.setBackground(new java.awt.Color(204, 255, 204));
        btnres2.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        btnres2.setText("ACEPTAR");
        btnres2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnres2ActionPerformed(evt);
            }
        });

        txt6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txt6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt6.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt6FocusGained(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblpar2)
                            .addComponent(lblpar1)
                            .addComponent(lblpar3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblMateria)
                        .addGap(48, 48, 48)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtmateria, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtcal2)
                        .addComponent(txtCal3)
                        .addComponent(txtcal1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txt6, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnres2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblasig)
                        .addGap(237, 237, 237))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblprom)
                        .addGap(82, 82, 82))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblasig)
                .addGap(4, 4, 4)
                .addComponent(lblprom)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMateria)
                            .addComponent(txtmateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblpar1)
                            .addComponent(txtcal1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtcal2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblpar2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblpar3)
                            .addComponent(txtCal3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(21, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txt6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnres2)
                        .addGap(34, 34, 34))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt6FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt6FocusGained
        double c1 = Double.parseDouble(txtcal1.getText());
        double c2 = Double.parseDouble(txtcal2.getText());
        double c3 = Double.parseDouble(txtCal3.getText());
        
        double promedio = (c1+c2+c3)/3;
        
        txt6.setText(String.valueOf(promedio));
    }//GEN-LAST:event_txt6FocusGained

    private void btnres2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnres2ActionPerformed
        ventana2 m = new ventana2();
  m.setVisible(true);
  this.setVisible(false);
  
   
    }//GEN-LAST:event_btnres2ActionPerformed

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
            java.util.logging.Logger.getLogger(ventana4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventana4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventana4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventana4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventana4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnres2;
    private javax.swing.JLabel lblMateria;
    private javax.swing.JLabel lblasig;
    private javax.swing.JLabel lblpar1;
    private javax.swing.JLabel lblpar2;
    private javax.swing.JLabel lblpar3;
    private javax.swing.JLabel lblprom;
    private javax.swing.JTextField txt6;
    private javax.swing.JTextField txtCal3;
    private javax.swing.JTextField txtcal1;
    private javax.swing.JTextField txtcal2;
    private javax.swing.JTextField txtmateria;
    // End of variables declaration//GEN-END:variables
}