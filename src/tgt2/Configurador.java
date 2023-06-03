
package tgt2;

import javax.swing.JOptionPane;
import java.io.*;

public class Configurador extends javax.swing.JFrame {
    public Configurador() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        edtPasta = new javax.swing.JTextField();
        edtSucesso = new javax.swing.JTextField();
        edtErro = new javax.swing.JTextField();
        chkRota = new javax.swing.JCheckBox();
        btnSalvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Sucesso:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Pasta:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Erro:");

        edtPasta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        edtPasta.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                edtPastaFocusLost(evt);
            }
        });

        edtSucesso.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        edtSucesso.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                edtSucessoFocusLost(evt);
            }
        });

        edtErro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        edtErro.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                edtErroFocusLost(evt);
            }
        });

        chkRota.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        chkRota.setText("Rota Automática");

        btnSalvar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalvarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(edtPasta, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(edtErro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                                .addComponent(edtSucesso, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chkRota))
                        .addGap(145, 145, 145))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edtPasta, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edtSucesso, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edtErro, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkRota)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSalvar)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void edtPastaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_edtPastaFocusLost

    }//GEN-LAST:event_edtPastaFocusLost

    private void edtSucessoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_edtSucessoFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_edtSucessoFocusLost

    private void edtErroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_edtErroFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_edtErroFocusLost

    private void btnSalvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalvarMouseClicked
        try {
            if (edtPasta.getText().isEmpty()) {throw new Exception("Pasta está vazia");}          
            if (edtSucesso.getText().isEmpty()) {throw new Exception("Sucesso está vazio");}      
            if (edtErro.getText().isEmpty()) {throw new Exception("Erro está vazio");}
            File pasta = new File(edtPasta.getText());
            if (!pasta.exists()) {throw new Exception("Pasta inserida não existe");}
            if (!pasta.isDirectory()) {throw new Exception("Pasta inserida não é uma pasta");}
            String salvarErro = salvaPastas();
            if (!salvarErro.isEmpty()) {throw new Exception(salvarErro);}
            String rotaErro = ativaRota(chkRota.isSelected());
            if (!rotaErro.isEmpty()) {throw new Exception(rotaErro);}
        } catch (Exception e) {
            geraErro(e.getMessage());
        }
        System.exit(0);
    }//GEN-LAST:event_btnSalvarMouseClicked
    void geraErro(String erro) {
        JOptionPane.showMessageDialog(null, erro);
    }
    
    String ativaRota(boolean rota) {
        try {
            String rotaAutomatica = rota ? "1" : "0";
            String pastaTeste = "C:\\Teste\\Configuracao";
            FileWriter writer = new FileWriter(pastaTeste+"\\rota.txt");
            writer.write(rotaAutomatica);
            writer.close();
            return "";
        } catch (Exception e) {
            return e.getMessage();
        }
    }
    
    String salvaPastas() {
        try {
            String pastaConfig = edtPasta.getText();
            String pastaSucesso = pastaConfig + "\\" + edtSucesso.getText();
            new File(pastaSucesso).mkdirs();
            String pastaErro = pastaConfig + "\\" + edtErro.getText();
            new File(pastaErro).mkdirs();
            
            String pastaTeste = "C:\\Teste\\Configuracao";
            FileWriter writer = new FileWriter(pastaTeste+"\\config.txt");
            writer.write("Processado="+pastaSucesso+"\n");
            writer.write("Não Processado="+pastaErro+"\n");
            writer.close();
            return "";
        } catch (Exception e) {
            return e.getMessage();
        }
    }

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
            java.util.logging.Logger.getLogger(Configurador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Configurador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Configurador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Configurador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Configurador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvar;
    private javax.swing.JCheckBox chkRota;
    private javax.swing.JTextField edtErro;
    private javax.swing.JTextField edtPasta;
    private javax.swing.JTextField edtSucesso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
