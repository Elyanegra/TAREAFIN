/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author 21PROGA005
 */
public class ventana2 extends javax.swing.JFrame {

    /**
     * Creates new form ventana2
     */
      
    public ventana2() {
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

        btndatosalum = new javax.swing.JButton();
        btnDasignatura = new javax.swing.JButton();
        lbltoma = new javax.swing.JLabel();
        btnficha = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btndatosalum.setBackground(new java.awt.Color(204, 255, 204));
        btndatosalum.setFont(new java.awt.Font("Constantia", 1, 18)); // NOI18N
        btndatosalum.setText("1.-REGISTRO DE ALUMNO");
        btndatosalum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndatosalumActionPerformed(evt);
            }
        });

        btnDasignatura.setBackground(new java.awt.Color(204, 255, 204));
        btnDasignatura.setFont(new java.awt.Font("Constantia", 1, 18)); // NOI18N
        btnDasignatura.setText("2.-REGISTRO DE ASIGNATURA");
        btnDasignatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDasignaturaActionPerformed(evt);
            }
        });

        lbltoma.setBackground(new java.awt.Color(204, 255, 204));
        lbltoma.setFont(new java.awt.Font("Constantia", 1, 18)); // NOI18N
        lbltoma.setForeground(new java.awt.Color(0, 153, 51));
        lbltoma.setText("TOMA DE DATOS");

        btnficha.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnficha.setText("FICHA");
        btnficha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfichaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btndatosalum, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDasignatura))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                .addComponent(btnficha, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbltoma)
                .addGap(231, 231, 231))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(btndatosalum, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDasignatura, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbltoma)
                        .addGap(52, 52, 52)
                        .addComponent(btnficha, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btndatosalumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndatosalumActionPerformed
        ventana3 m = new ventana3 ();
        m.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btndatosalumActionPerformed

    private void btnDasignaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDasignaturaActionPerformed
       ventana4 w = new ventana4 ();
        w.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnDasignaturaActionPerformed

    private void btnfichaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfichaActionPerformed
      
        
        
        ventana5 v = new ventana5();
  v.setVisible(true);
  this.setVisible(false);
  
     
  
    }//GEN-LAST:event_btnfichaActionPerformed

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
            java.util.logging.Logger.getLogger(ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventana2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDasignatura;
    private javax.swing.JButton btndatosalum;
    private javax.swing.JButton btnficha;
    private javax.swing.JLabel lbltoma;
    // End of variables declaration//GEN-END:variables

    private string String(Object text) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
