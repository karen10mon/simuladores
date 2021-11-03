
import javax.swing.JOptionPane;

public class traga_monedas extends javax.swing.JFrame {
    int moneda = 10;
   
    public traga_monedas() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        vuelta1 = new javax.swing.JLabel();
        vuelta2 = new javax.swing.JLabel();
        vuelta3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText(" TRAGA MONEDAS");

        jLabel2.setBackground(new java.awt.Color(153, 153, 153));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Monedas  10");

        vuelta1.setBackground(new java.awt.Color(51, 255, 255));
        vuelta1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        vuelta1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vuelta1.setText("0");

        vuelta2.setBackground(new java.awt.Color(51, 255, 255));
        vuelta2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        vuelta2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vuelta2.setText("0");

        vuelta3.setBackground(new java.awt.Color(0, 255, 255));
        vuelta3.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        vuelta3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vuelta3.setText("0");

        jButton1.setBackground(new java.awt.Color(51, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setText("Jugar");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(vuelta1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(vuelta2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(vuelta3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(62, 62, 62))
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(vuelta1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(vuelta2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(vuelta3, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Felicidades ganador = new Felicidades();
        moneda -= 1;
        int num1 = (int) (Math.random() * 9 + 1);
        int num2 = (int) (Math.random() * 9 + 1);
        int num3 = (int) (Math.random() * 9 + 1);        
        vuelta1.setText(String.valueOf(num1));
        vuelta2.setText(String.valueOf(num2));
        vuelta3.setText(String.valueOf(num3));       
        if (num1 == num2 && num2 == num3) {
            switch (num1) {
                case 7:
                    ganador.setVisible(true);
                    JOptionPane.showMessageDialog(null, "¡¡¡¡¡¡Felicidades, ganaste 70 monedas!!!!!!!!!");
                    moneda += 71;
                    break;
                case 5:
                    ganador.setVisible(true);
                    JOptionPane.showMessageDialog(null, "**********Felicidades, ganaste 50 monedas***********");
                    moneda += 51;
                    break;
                case 3:
                    ganador.setVisible(true);
                    JOptionPane.showMessageDialog(null, "¡¡¡¡¡¡¡¡¡Felicidades, ganaste 30 monedas!!!!!!");
                    moneda += 31;
                    break;
                case 1:
                    ganador.setVisible(true);
                    JOptionPane.showMessageDialog(null, "¡¡¡¡¡¡¡Felicidades, ganaste 10 monedas!!!!!!!");
                    moneda += 11;
                    break;
            }
        }
        jLabel2.setText("Monedas: " + String.valueOf(moneda));
        if (moneda == 0) {
int numero = JOptionPane.showConfirmDialog(null, "¿Desea realizar un siguiente juego?", "Maquina tragamonedas", JOptionPane.YES_NO_OPTION);
            if (numero == 0) {
                moneda = 10;
                jLabel2.setText("Monedas: " + String.valueOf(moneda));
            } else {
                System.exit(0);
            }
        }


    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(traga_monedas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(traga_monedas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(traga_monedas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(traga_monedas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new traga_monedas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel vuelta1;
    private javax.swing.JLabel vuelta2;
    private javax.swing.JLabel vuelta3;
    // End of variables declaration//GEN-END:variables
}
