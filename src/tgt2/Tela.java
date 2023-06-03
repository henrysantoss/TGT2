package tgt2;

import dijkstra.Grafo;
import java.nio.file.Files;
import java.io.*;
import java.util.*;
import javax.swing.Box;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import tgt2.Estrutura.Conexoes;
import tgt2.Estrutura.Header;
import tgt2.Estrutura.Pesos;
import tgt2.Estrutura.Trailer;

public class Tela extends javax.swing.JFrame {
    String FPastaArquivoBackup = "";

    public Tela() {
        initComponents();
        limpaTabela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        edtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        edtCod1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        edtCidade1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        edtCod2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        edtCidade2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        edtKm = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        btnProcessar = new javax.swing.JButton();
        btnBuscar3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Buscar");

        edtBuscar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        edtBuscar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                edtBuscarFocusLost(evt);
            }
        });

        btnBuscar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarMouseClicked(evt);
            }
        });
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Código:");

        edtCod1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        edtCod1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        edtCod1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                edtCod1FocusLost(evt);
            }
        });
        edtCod1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                edtCod1KeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Cidade");

        edtCidade1.setEditable(false);
        edtCidade1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        edtCidade1.setFocusable(false);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("(ORIGEM)");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Código:");

        edtCod2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        edtCod2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        edtCod2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                edtCod2FocusLost(evt);
            }
        });
        edtCod2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                edtCod2KeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Cidade");

        edtCidade2.setEditable(false);
        edtCidade2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        edtCidade2.setFocusable(false);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("(DESTINO)");

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Código Origem", "Cidade Origem", "Código Destino", "Cidade Destino", "Distância"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tabelaMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tabela);

        edtKm.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        edtKm.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        edtKm.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                edtKmFocusLost(evt);
            }
        });
        edtKm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                edtKmKeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("KM's:");

        btnSalvar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSalvar.setText("SALVAR");
        btnSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalvarMouseClicked(evt);
            }
        });
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnProcessar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnProcessar.setText("PROCESSAR");
        btnProcessar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProcessarMouseClicked(evt);
            }
        });
        btnProcessar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessarActionPerformed(evt);
            }
        });

        btnBuscar3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnBuscar3.setText("+");
        btnBuscar3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscar3MouseClicked(evt);
            }
        });
        btnBuscar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscar3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(edtCod1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(edtCidade1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(edtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(edtKm, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                                            .addComponent(edtCod2))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(edtCidade2)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel7))
                                        .addGap(0, 78, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnBuscar3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(11, 11, 11))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnProcessar, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edtCod1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edtCidade1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edtCod2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edtCidade2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edtKm, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnProcessar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBuscar3)))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnProcessarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnProcessarActionPerformed

    private void btnBuscar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscar3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscar3ActionPerformed

    private void btnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseClicked
        JFileChooser jf = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Aqruivo de Texto (.txt)", "txt", "text");
        jf.setFileFilter(filter);
        jf.showOpenDialog(null);
        String arquivo = jf.getSelectedFile().toString();
        String verificar = verificaArquivo(arquivo);
        try {
            if (verificar.isEmpty()) {
                if (buscaRotas(arquivo, true)) {
                    edtBuscar.setText(arquivo);
                    FPastaArquivoBackup = arquivo;
                }
            } else {
                throw new Exception("Erro: " + verificar);  
            }
        } catch(Exception e) {
           geraErro(e.getMessage());
           geraArquivoNaoProcessado(arquivo);
           edtBuscar.setText(FPastaArquivoBackup);
           if (!FPastaArquivoBackup.isEmpty()) {
               buscaRotas(FPastaArquivoBackup, true);
           }
        }
        
    }//GEN-LAST:event_btnBuscarMouseClicked

    private void edtBuscarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_edtBuscarFocusLost
        String arquivo = edtBuscar.getText();
        if (!edtBuscar.getText().isEmpty()) {
            String verificar = verificaArquivo(arquivo);
            try {
                if (verificar.isEmpty()) {
                    if (buscaRotas(arquivo, true)) {
                        edtBuscar.setText(arquivo);
                        FPastaArquivoBackup = arquivo;
                    }
                } else {
                    throw new Exception("Erro: " + verificar);  
                }
            } catch(Exception e) {
               geraErro(e.getMessage()); 
               geraArquivoNaoProcessado(arquivo);
               edtBuscar.setText(FPastaArquivoBackup);
               if (!FPastaArquivoBackup.isEmpty()) {
                    buscaRotas(FPastaArquivoBackup, true);
               }
            }
        }
    }//GEN-LAST:event_edtBuscarFocusLost

    private void edtCod1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtCod1KeyTyped
        char c = evt.getKeyChar();
        if (!((c >= '0') && (c <= '9') ||
           (c == evt.VK_BACK_SPACE) ||
           (c == evt.VK_DELETE))) {
          evt.consume();
        }
        if (edtCod1.getText().length() >= 2 ) {evt.consume();}        
    }//GEN-LAST:event_edtCod1KeyTyped

    private void edtCod2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtCod2KeyTyped
        char c = evt.getKeyChar();
        if (!((c >= '0') && (c <= '9') ||
           (c == evt.VK_BACK_SPACE) ||
           (c == evt.VK_DELETE))) {
          evt.consume();
        }
        if (edtCod2.getText().length() >= 2 ) {evt.consume();}   
    }//GEN-LAST:event_edtCod2KeyTyped

    private void edtKmKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtKmKeyTyped
        char c = evt.getKeyChar();
        if (!((c >= '0') && (c <= '9') ||
           (c == evt.VK_BACK_SPACE) ||
           (c == evt.VK_DELETE))) {
          evt.consume();
        }
        if (edtKm.getText().length() >= 4 ) {evt.consume();}   
    }//GEN-LAST:event_edtKmKeyTyped

    private void tabelaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseReleased
        if (SwingUtilities.isRightMouseButton(evt)) {
            int r = tabela.rowAtPoint(evt.getPoint());
            tabela.changeSelection(r, 0, false, false);
            int dialogResult = JOptionPane.showConfirmDialog (null, "Deseja excluir esta conexão","Excluir",JOptionPane.YES_NO_OPTION);
            if(dialogResult == JOptionPane.YES_OPTION){
                DefaultTableModel model = (DefaultTableModel) this.tabela.getModel();
                model.removeRow(r);
            }
        } 
    }//GEN-LAST:event_tabelaMouseReleased

    private void edtCod1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_edtCod1FocusLost
        if (!edtCod1.getText().isEmpty()) {
            try {
                int codigo = Integer.parseInt(edtCod1.getText());
                if (codigo < 0 || codigo > 7) {
                    edtCod1.setText("");
                    edtCidade1.setText("");
                    throw new Exception("Codigo 1 não possui um valor válido entre 00 e 07");
                }
                edtCod1.setText(String.format("%02d", codigo));
                edtCidade1.setText(buscaCidade(codigo));
            } catch (Exception e) {
                geraErro(e.getMessage());
            }
        } else {
            edtCidade1.setText("");
        }
    }//GEN-LAST:event_edtCod1FocusLost

    private void edtCod2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_edtCod2FocusLost
        if (!edtCod2.getText().isEmpty()) {
            try {
                int codigo = Integer.parseInt(edtCod2.getText());
                if (codigo < 0 || codigo > 7) {
                    edtCod2.setText("");
                    edtCidade2.setText("");
                    throw new Exception("Codigo 2 não possui um valor válido entre 00 e 07");
                }
                edtCod2.setText(String.format("%02d", codigo));
                edtCidade2.setText(buscaCidade(codigo));
            } catch (Exception e) {
                geraErro(e.getMessage());
            } 
        } else {
            edtCidade1.setText("");
        }
    }//GEN-LAST:event_edtCod2FocusLost

    private void edtKmFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_edtKmFocusLost
        if (!edtKm.getText().isEmpty()) {
            try {
                int codigo = Integer.parseInt(edtKm.getText());
                if (codigo < 0 || codigo > 9999) {
                    edtKm.setText("");
                    throw new Exception("Distância não possui um valor válido entre 0000 e 9999");
                }
                edtKm.setText(String.format("%04d", codigo));
            } catch (Exception e) {
                geraErro(e.getMessage());
            }
        }
    }//GEN-LAST:event_edtKmFocusLost

    private void btnBuscar3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscar3MouseClicked
        try {
            String cod1 = edtCod1.getText();
            String cod2 = edtCod2.getText();
            String distancia = edtKm.getText();
            if (cod1.isEmpty()) {throw new Exception("Código 1 Está Vazio!");}
            if (cod2.isEmpty()) {throw new Exception("Código 2 Está Vazio!");}
            if (distancia.isEmpty()) {throw new Exception("Distância Está Vazio!");}
            int codOrigem = Integer.parseInt(cod1);
            int codDestino = Integer.parseInt(cod2);
            String cidadeOrigem = buscaCidade(codOrigem);
            String cidadeDestino = buscaCidade(codDestino);
            if (!verificaPossuiOD(cod1, cod2)) {throw new Exception("Nó Origem e Destino já existem na tabela");}
            if (cod1.equals(cod2)) {throw new Exception("Neste aplicativo não é possível que haja um loop");}
            DefaultTableModel model = (DefaultTableModel) tabela.getModel();
            model.addRow(new Object[]{cod1, cidadeOrigem, cod2, cidadeDestino, distancia});
        } catch (Exception e) {
            geraErro(e.getMessage());
        }
    }//GEN-LAST:event_btnBuscar3MouseClicked

    private void btnSalvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalvarMouseClicked
        geraArquivoSalvar();
    }//GEN-LAST:event_btnSalvarMouseClicked

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnProcessarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProcessarMouseClicked
        processaArquivoManual();
    }//GEN-LAST:event_btnProcessarMouseClicked

    void processaArquivoManual() {
        JTextField origemField = new JTextField(5);
        JTextField destinoField = new JTextField(5);

        JPanel painel = new JPanel();
        painel.add(new JLabel("Origem:"));
        painel.add(origemField);
        painel.add(Box.createHorizontalStrut(15)); // a spacer
        painel.add(new JLabel("Destino:"));
        painel.add(destinoField);
        try {         
            if (tabela.getRowCount() <= 0) {
                throw new Exception("A Tabela está vazia para ser processada");
            }
            Grafo grafo = new Grafo(tabela.getRowCount());
            for (int i = 0; i < tabela.getRowCount(); i++) {  // Loop through the rows
                String noO = tabela.getValueAt(i, 0).toString();
                String noD = tabela.getValueAt(i, 2).toString();
                String dist = tabela.getValueAt(i, 4).toString();
                int noOrigem = Integer.parseInt(noO);
                int noDestino = Integer.parseInt(noD);
                int distancia = Integer.parseInt(dist);
                
                grafo.criaAresta(noOrigem, noDestino, distancia);
                
            }
            int origem;
            int destino;
            int result = JOptionPane.showConfirmDialog(null, painel, 
               "Coloque o Nó Origem e Nó Destino", JOptionPane.OK_CANCEL_OPTION);
            if (result != JOptionPane.OK_OPTION) {return;}
            if (origemField.getText().isEmpty()) {throw new Exception("Origem está vazia");}
            if (destinoField.getText().isEmpty()) {throw new Exception("Destino está vazia");}
            try{
                origem = Integer.parseInt(origemField.getText());
            }catch(Exception e){throw new Exception("Origem não é um número válido");}
            try{
                destino = Integer.parseInt(destinoField.getText());
            }catch(Exception e){throw new Exception("Destino não é um número válido");}
            
            List<Integer> estacoes = grafo.caminhoMinimo(origem, destino);
            if (estacoes.size() <= 0) {throw new Exception("Não é possível obter um caminho válido");} 
            String menorCaminho = "";
            Integer nosCusto = 0;
            Integer custoTotal = 0;
            int no2 = 0;
            int no1 = 0;
            for (int i = 0; i < tabela.getRowCount(); i++) {
                String noO = tabela.getValueAt(i, 0).toString();
                String noD = tabela.getValueAt(i, 2).toString();
                String dist = tabela.getValueAt(i, 4).toString();
                int noOrigem = Integer.parseInt(noO);
                int noDestino = Integer.parseInt(noD);
                int distancia = Integer.parseInt(dist);
                if (nosCusto >= estacoes.size()) {
                    break;
                }
                no1 = estacoes.get(nosCusto);
                if (nosCusto+1 >= estacoes.size()) {
                    break;
                }
                no2 = estacoes.get(nosCusto+1);
                
                if ((noOrigem == no1) && (noDestino == no2)) {
                    custoTotal += distancia;
                    i = 0;
                    nosCusto++;
                }
            }
            if (custoTotal <= 0) {throw new Exception("Não é possível obter um caminho válido");}
            int est = 0;
            for (Integer e : estacoes) {
                est++;
                if (est == estacoes.size()) {
                  menorCaminho += e.toString();    
                } else {
                  menorCaminho += e.toString() + " -> ";    
                }
	    }
            
            JOptionPane.showMessageDialog(null, "Menor Caminho entre: " + menorCaminho +
                    "\nCusto: " + custoTotal.toString());
            geraArquivoProcessado(edtBuscar.getText());
            
            
        } catch (Exception e) {
            geraErro(e.getMessage());
        }
    }
    
    void processaArquivoAutomatico(String arquivo) {
        JTextField origemField = new JTextField(5);
        JTextField destinoField = new JTextField(5);

        JPanel painel = new JPanel();
        painel.add(new JLabel("Origem:"));
        painel.add(origemField);
        painel.add(Box.createHorizontalStrut(15)); // a spacer
        painel.add(new JLabel("Destino:"));
        painel.add(destinoField);
        List<Integer> nosOrigem = new ArrayList<>();
        List<Integer> nosDestino = new ArrayList<>();
        List<Integer> listDistancia = new ArrayList<>();
        try { 
            File file = new File(arquivo);
            try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                String arquivoLinha;
                String identificador = "";
                while ((arquivoLinha = br.readLine()) != null) {
                    identificador = arquivoLinha.substring(0, 2);
                    if (identificador.equals("02")) {
                        Integer noOrigem = Integer.parseInt(arquivoLinha.substring(2, 4));
                        Integer noDestino = Integer.parseInt(arquivoLinha.substring(5, 7));
                        Integer distancia = Integer.parseInt(arquivoLinha.substring(8, 12));
                        nosOrigem.add(noOrigem);
                        nosDestino.add(noDestino);
                        listDistancia.add(distancia);
                    }
                }
            }
            Grafo grafo = new Grafo(nosOrigem.size());
            for (int i = 0; i< nosOrigem.size(); i++) {
                grafo.criaAresta(nosOrigem.get(i), nosDestino.get(i), listDistancia.get(i));
            }
            int origem;
            int destino;
            int result = JOptionPane.showConfirmDialog(null, painel, 
               "Coloque o Nó Origem e Nó Destino", JOptionPane.OK_CANCEL_OPTION);
            if (result != JOptionPane.OK_OPTION) {return;}
            if (origemField.getText().isEmpty()) {throw new Exception("Origem está vazia");}
            if (destinoField.getText().isEmpty()) {throw new Exception("Destino está vazia");}
            try{
                origem = Integer.parseInt(origemField.getText());
            }catch(Exception e){throw new Exception("Origem não é um número válido");}
            try{
                destino = Integer.parseInt(destinoField.getText());
            }catch(Exception e){throw new Exception("Destino não é um número válido");}
            
            List<Integer> estacoes = grafo.caminhoMinimo(origem, destino);
            if (estacoes.size() <= 0) {throw new Exception("Não é possível obter um caminho válido");} 
            String menorCaminho = "";
            Integer nosCusto = 0;
            Integer custoTotal = 0;
            int no2 = 0;
            int no1 = 0;
            for (int i = 0; i < nosOrigem.size(); i++) {
                int noOrigem = nosOrigem.get(i);
                int noDestino = nosDestino.get(i);
                int distancia = listDistancia.get(i);
                if (nosCusto >= estacoes.size()) {
                    break;
                }
                no1 = estacoes.get(nosCusto);
                if (nosCusto+1 >= estacoes.size()) {
                    break;
                }
                no2 = estacoes.get(nosCusto+1);
                
                if ((noOrigem == no1) && (noDestino == no2)) {
                    custoTotal += distancia;
                    i = 0;
                    nosCusto++;
                }
            }
            if (custoTotal <= 0) {throw new Exception("Não é possível obter um caminho válido");}
            int est = 0;
            for (Integer e : estacoes) {
                est++;
                if (est == estacoes.size()) {
                  menorCaminho += e.toString();    
                } else {
                  menorCaminho += e.toString() + " -> ";    
                }
	    }
            
            JOptionPane.showMessageDialog(null, "Menor Caminho entre: " + menorCaminho +
                    "\nDistância Percorrida: " + custoTotal.toString() + " Km");
            
            
        } catch (Exception e) {
            geraErro(e.getMessage());
        }
    }
    
    String geraArquivoNaoProcessado(String arquivo) {
            try {
                File origem = new File(arquivo);
                String pasta = buscaPastaNaoProcessado();
                File destino = destino = new File(pasta);
                String pastaSave = verificaPastaRotas(pasta);
                FileInputStream fis = new FileInputStream(origem);
                FileOutputStream fos = new FileOutputStream(pastaSave);
                byte[] buffer = new byte[1024];
                int length;
                while ((length = fis.read(buffer)) > 0) {
                    fos.write(buffer, 0, length);
                }
                fis.close();
                fos.close();
                if (arquivo.contains("C:\\Teste")) {
                    origem.delete();
                }
                geraErro("Arquivo movido para Não Processado!");
                return "";
            } catch(Exception e){
                geraErro(e.getMessage());
                return e.getMessage();
            }
    }
    
    String geraArquivoProcessado(String arquivo) {
            try {
                File origem = new File(arquivo);
                String pasta = buscaPastaProcessado();
                File destino = destino = new File(pasta);
                String pastaSave = verificaPastaRotas(pasta);
                FileInputStream fis = new FileInputStream(origem);
                FileOutputStream fos = new FileOutputStream(pastaSave);
                byte[] buffer = new byte[1024];
                int length;
                while ((length = fis.read(buffer)) > 0) {
                    fos.write(buffer, 0, length);
                }
                fis.close();
                fos.close();
                if (arquivo.contains("C:\\Teste")) {
                    origem.delete();
                }
                geraErro("Arquivo movido para Processado!");
                return "";
            } catch(Exception e){
                geraErro(e.getMessage());
                return e.getMessage();
            }
    }
    
    void geraArquivoSalvar() {
        if (tabela.getRowCount() > 0) {
            try {
                String pastaSalvar;
                String np = "C:\\Teste";
                if (edtBuscar.getText().contains(np)){
                   pastaSalvar = edtBuscar.getText(); 
                } else {
                   pastaSalvar = verificaPastaRotas(np);
                }
                if (pastaSalvar.contains("Erro: ")) {throw new Exception(pastaSalvar);}

                List<String> linhasArquivo = new ArrayList<>();
                String verifica = geraLinhasArquivoSalvar(linhasArquivo);
                if (verifica.contains("Erro: ")) {throw new Exception(verifica);}
                if (linhasArquivo.size() <= 0) {throw new Exception("Erro: Gerar Arquivo para Salvar");}

                BufferedWriter writer = new BufferedWriter(new FileWriter(pastaSalvar));
                for (int i = 0; i<linhasArquivo.size(); i++){
                    writer.write(linhasArquivo.get(i) + "\n");
                }
                writer.close();
                File f = new File(pastaSalvar);
                JOptionPane.showMessageDialog(null, f.getName() + " salvo com Sucesso!");
                edtBuscar.setText(pastaSalvar);
                
            } catch(Exception e){
                geraErro(e.getMessage());
            }
        }
    }
    
    String verificaArquivo(String arquivo) {
        try {
            String tipoArquivo = "";
            File f = new File(arquivo);
            
            //Verifica se o arquivo existe
            if(!f.exists()) {
                return "Arquivo não existe";  
            }
            
            //Verifica se é um .txt
            tipoArquivo = Files.probeContentType(f.toPath());
            if (!tipoArquivo.equals("text/plain")) {
               return "Arquivo não é (.txt)"; 
            }
            
            String arquivoSolo = f.getName();
            String nome = arquivoSolo.substring(0, arquivoSolo.lastIndexOf('.'));
            //Verifica o nome do arquivo se é valido
            if ((nome.length() != 6)) {
                return "Arquivo não possui um nome válido";    
            }
            String rota = nome.substring(0, 4);
            if (!rota.toLowerCase().equals("rota")) {
                return "Arquivo não possui o nome começando com 'rota'"; 
            }
           
            try {
                String numero = nome.substring(4,6);
                int numeroInt = Integer.parseInt(numero);
                if (numeroInt < 0 || numeroInt > 99) {
                    return "Arquivo não possui o nome com o número entre 00 e 99";
                }
            } catch (NumberFormatException e) {
                return "Arquivo não possui o nome com número válido"; 
            }
            return "";
        } catch (Exception e) {
            return "Desconhecido: " + e.getMessage();
        }
    }
    
    boolean buscaRotas(String arquivo, boolean adiciona) {
        limpaTabela();
        List<Header> header = new ArrayList<>();
        List<Conexoes> conexoes = new ArrayList<>();
        List<Pesos> pesos = new ArrayList<>();
        List<Trailer> trailer = new ArrayList<>();
        int numeroLinha = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {
            String arquivoLinha;
            String identificador = "";
            while ((arquivoLinha = br.readLine()) != null) {
                identificador = arquivoLinha.substring(0, 2);
                String verifica;
                numeroLinha += 1;
                
                //Verifica se o identificador é um número válido
                verifica = verificaIdentificador(identificador, numeroLinha);
                if (!verifica.isEmpty()) {throw new Exception(verifica);}
                
                //---HEADER---
                //Verifica o Header
                if ((!identificador.equals("00")) && (numeroLinha == 1)){
                    throw new Exception("Não começou com um Header");
                }
                
                if (identificador.equals("00")) {
                    verifica = verificaHeader(arquivoLinha, header); 
                    if (!verifica.isEmpty()) {throw new Exception(verifica);}
                }
                //------------
                //---CONEXOES---
                //Verifica as Conexoes
                if (identificador.equals("01")) {
                    verifica = verificaConexoes(arquivoLinha, conexoes);
                    if (!verifica.isEmpty()) {throw new Exception(verifica);}
                }
                //------------
                //---PESOS---
                //Verifica os Pesos
                if (identificador.equals("02")) {
                    verifica = verificaPesos(arquivoLinha, pesos);
                    if (!verifica.isEmpty()) {throw new Exception(verifica);}
                }    
                //------------
                //---TRAILER---
                //Verifica o Trailer
                if (identificador.equals("09")) {
                     verifica = verificaTrailer(arquivoLinha, trailer);
                    if (!verifica.isEmpty()) {throw new Exception(verifica);}
                }
                //------------
            }
            if (!identificador.equals("09")) {throw new Exception("Não terminou com um Trailer");}
            
        } catch (Exception e) {
            geraErro("Erro Linha "+ numeroLinha +": " + e.getMessage());
            return false;
        }
        
        try {
            if (header.size() <= 0) {throw new Exception("Arquivo não possui uma linha de Header");}
            if (conexoes.size() <= 0) {throw new Exception("Arquivo não possui linha de Conexões");}
            if (pesos.size() <= 0) {throw new Exception("Arquivo não possui linha de Pesos");}
            if (trailer.size() <= 0) {throw new Exception("Arquivo não possui uma linha de Trailer");}
            
            String verifica = validaArquivo(header, conexoes, pesos, trailer);
            if (!verifica.isEmpty()) {throw new Exception(verifica);}
            if (adiciona) {adicionaArquivoTabela(pesos);}
        } catch (Exception e) {
            geraErro(e.getMessage());
            if (adiciona) {
                geraArquivoNaoProcessado(arquivo);
            }
            return false;
        }
        return true;
    }

    String verificaIdentificador(String identificador, int numeroLinha){
        try {
            int intIdentificador = Integer.parseInt(identificador);
            if ((intIdentificador != 0) && (intIdentificador != 1) && (intIdentificador != 2) && (intIdentificador != 9)) {
                throw new NumberFormatException("");
            }
        } catch (NumberFormatException e) {
            return "Identificador da linha não é um número válido";
        }
        return "";
    }
    
    String verificaHeader(String arquivoLinha, List<Header> header) {
        try {
            //Verifica tamanho do Header
            if (arquivoLinha.length() != 8) {throw new Exception("Header - Não possui o número correto de caracteres");}
            
            //Verifca se os nós totais são um número
            String  nosTotais = arquivoLinha.substring(2,4);
            try {int verificaInt = Integer.parseInt(nosTotais);} 
            catch (NumberFormatException e) {throw new Exception("Header - Nós Totais não é um número válido");}
            
            //Verifica se a soma das aresta é um número
            String  somaArestas = arquivoLinha.substring(4,8);
            try {int verificaInt = Integer.parseInt(somaArestas);} 
            catch (NumberFormatException e) {throw new Exception("Header - Soma das Arestas não é um número válido");}
            
            //Adiciona em uma variavel
            Header h = new Header(nosTotais, somaArestas);
            header.add(h);
        } catch(Exception e) {
            return e.getMessage();
        } 
        return "";  
    }
    
    String verificaConexoes(String arquivoLinha, List<Conexoes> conexoes) {
        try {
            //Verifica tamanho da Conexão
            if (arquivoLinha.length() != 7) {throw new Exception("Conexões - Não possui o número correto de caracteres");}
            
            //Verifca se o nó origem é válido
            String  noOrigem = arquivoLinha.substring(2,4);
            try {int verificaInt = Integer.parseInt(noOrigem);} 
            catch (NumberFormatException e) {throw new Exception("Conexões - Nó Origem não é um número válido");}
            
            //Verifica se nó destino é válido
            String  noDestino = arquivoLinha.substring(5,7);
            try {int verificaInt = Integer.parseInt(noDestino);} 
            catch (NumberFormatException e) {throw new Exception("Conexões - Nó Destino não é um número válido");}
            
            //Verifica delimitador
            String delimitador = arquivoLinha.substring(4,5);
            if (!delimitador.equals("=")) {throw new Exception("Conexões - Delimitador não é válido");}
            
            Conexoes conexao = new Conexoes(noOrigem, noDestino);
            conexoes.add(conexao);
        } catch(Exception e) {
            return e.getMessage();
        } 
        return "";  
    }
    
    String verificaPesos(String arquivoLinha, List<Pesos> pesos) {
        try {
            //Verifica tamanho do Peso
            if (arquivoLinha.length() != 12) {throw new Exception("Pesos - Não possui o número correto de caracteres");}
            
            //Verifica se nó origem é válido
            String  noOrigem = arquivoLinha.substring(2,4);
            try {int verificaInt = Integer.parseInt(noOrigem);} 
            catch (NumberFormatException e) {throw new Exception("Pesos - Nó Origem não é um número válido");}
            
            //Verifica se nó destino é válido
            String  noDestino = arquivoLinha.substring(5,7);
            try {int verificaInt = Integer.parseInt(noDestino);} 
            catch (NumberFormatException e) {throw new Exception("Pesos - Nó Destino não é um número válido");}
            
            //Verifica se a distancia é valida
            String  distancia = arquivoLinha.substring(8,12);
            try {int verificaInt = Integer.parseInt(distancia);} 
            catch (NumberFormatException e) {throw new Exception("Pesos - Distância não é um número válido");}
            
            //Verifica delimitador
            String delimitador = arquivoLinha.substring(4,5);
            if (!delimitador.equals(";")) {throw new Exception("Pesos - Delimitador não é não é válido");}
            
            //Verifica o igual
            String igual = arquivoLinha.substring(7,8);
            if (!igual.equals("=")) {throw new Exception("Pesos - Delimitador entre a Distância e o Nó Destino não é válido");}
 
            Pesos peso = new Pesos(noOrigem, noDestino, distancia);
            pesos.add(peso);
        } catch(Exception e) {
            return e.getMessage();
        } 
        return "";  
    }
    
    String verificaTrailer(String arquivoLinha, List<Trailer> trailer) {
        try {
            //Verifica tamanho do Trailer
            if (arquivoLinha.length() != 12) {throw new Exception("Trailer - Não possui o número correto de caracteres");}
            
            //Verifca se o número de linha de conexões é válido
            String  numeroLinhasConexoes = arquivoLinha.substring(2,4);
            try {int verificaInt = Integer.parseInt(numeroLinhasConexoes);} 
            catch (NumberFormatException e) {throw new Exception("Trailer - Número de Linhas de Conexões não é um número válido");}
            
            //Verifica se o número de linha de pesos é válido
            String  numeroLinhaPesos = arquivoLinha.substring(5,7);
            try {int verificaInt = Integer.parseInt(numeroLinhaPesos);} 
            catch (NumberFormatException e) {throw new Exception("Trailer - Número de Linhas de Pesos não é um número válido");}
            
            //Verifica se a soma dos pesos é valida
            String  somaPesos = arquivoLinha.substring(8,12);
            try {int verificaInt = Integer.parseInt(somaPesos);} 
            catch (NumberFormatException e) {throw new Exception("Trailer - Soma de Pesos não é um número válido");}
            
            //Verifica delimitador
            String delimitador = arquivoLinha.substring(4,5);
            if (!delimitador.equals(";")) {throw new Exception("Pesos - Delimitador não é não é válido");}
            
            //Verifica delimitador
            String delimitador2 = arquivoLinha.substring(7,8);
            if (!delimitador2.equals(";")) {throw new Exception("Pesos - Delimitador não é não é válido");}
 
            Trailer t = new Trailer(numeroLinhasConexoes, numeroLinhaPesos, somaPesos);
            trailer.add(t);
        } catch(Exception e) {
            return e.getMessage();
        } 
        return "";  
    }
    
    String validaArquivo(List<Header> header, List<Conexoes> conexoes, List<Pesos> pesos, List<Trailer> trailer) {
        try {
            if (conexoes.size() != pesos.size()) {throw new Exception("Arquivo - Conexões e Pesos não possuem o mesmo número de linhas");}
            
            //Header
            Header h = header.get(0);
            int headerNosTotais = Integer.parseInt(h.getNos());
            int headerSomaPesos = Integer.parseInt(h.getPesos());
            
            //Conexoes
            List<String> listaConexoes = new ArrayList<>();
            List<String> nos = new ArrayList();
            int totalLinhaConexoes = conexoes.size();
            for (int i = 0; i < conexoes.size() ; i++) {
                Conexoes c = conexoes.get(i);
                String noOrigem = c.getOrigem();
                String noDestino = c.getDestino();
                if (!nos.contains(noOrigem)) {nos.add(noOrigem);}
                if (!nos.contains(noDestino)) {nos.add(noDestino);}
                listaConexoes.add(noOrigem+noDestino);
            }
            
            //Pesos
            int pesoTotal = 0;
            int totalLinhaPesos = pesos.size();
            int contadorPeso = 0;
            for (int i = 0; i < pesos.size() ; i++) {
                contadorPeso++;
                Pesos p = pesos.get(i);
                String noOrigem = p.getOrigem();
                String noDestino = p.getDestino();
                String conexao = listaConexoes.get(i);
                if (!conexao.equals(noOrigem+noDestino)) 
                {throw new Exception("Arquivo - Conexões e Pesos não possuem o mesmo nó origem e no Destino" +
                        "\nPeso "+contadorPeso + " - Nós Esperados | Origem: " + conexao.substring(0,2) +
                        " | Destino: "+ conexao.substring(2,4));}
                pesoTotal += Integer.parseInt(p.getDistancia());
            }
            //Trailer
            Trailer t = trailer.get(0);
            int trailerNumeroLinhasConexoes = Integer.parseInt(t.getSomaLinhaConexoes());
            int trailerNumeroLinhasPesos = Integer.parseInt(t.getSomaLinhaPesos()); 
            int trailerSomaPesos = Integer.parseInt(t.getSomaPesos());
            
            //----Validações Header----
            //Número de Nós Totais
            if (nos.size() != headerNosTotais) 
            {throw new Exception("Arquivo - Header não possui o Número de Nós Correto"+
                    "\nValor Esperado: " + String.format("%02d", nos.size()));}
            //Soma das Arestas
            if(pesoTotal != headerSomaPesos)
            {throw new Exception("Arquivo - Header não possui a soma correta das Arestas" +
                    "\nValor Esperado: " + String.format("%04d", pesoTotal));}
            //-------------------------
            
            //----Validações Trailer----
            //Número de Linhas de Conexões
            if (totalLinhaConexoes != trailerNumeroLinhasConexoes)
            {throw new Exception("Arquivo - Trailer não possui o total de linhas de conexões correto"+
                    "\n Valor Esperado: " + String.format("%02d", totalLinhaConexoes));}   
            //Número de Linhas de Pesos
            if (totalLinhaPesos != trailerNumeroLinhasPesos)
            {throw new Exception("Arquivo - Trailer não possui o total de linhas de pesos correto"+
                    "\n Valor Esperado: " + String.format("%02d", totalLinhaPesos));} 
            //Soma dos pesos entre os nós
            if (pesoTotal != trailerSomaPesos)
            {throw new Exception("Arquivo - Trailer não possui a soma de pesos correta"+
                                 "\n Valor Esperado: " + String.format("%04d", pesoTotal));} 
            //--------------------------     
        } catch(Exception e) {
          return e.getMessage();
        } 
        return "";  
    }
    
    void adicionaArquivoTabela(List<Pesos> pesos) {
        limpaTabela();
        for (int i = 0; i< pesos.size(); i++) {
            Pesos p = pesos.get(i);
            DefaultTableModel model = (DefaultTableModel) tabela.getModel();
            String cidadeOrigem = buscaCidade(Integer.parseInt(p.getOrigem()));
            String cidadeDestino = buscaCidade(Integer.parseInt(p.getDestino()));
            model.addRow(new Object[]{p.getOrigem(), cidadeOrigem, p.getDestino(), cidadeDestino, p.getDistancia()});
        }
    }
    
    void geraErro(String erro) {
        JOptionPane.showMessageDialog(null, erro);
    }
    
    void limpaTabela() {
        DefaultTableModel model = (DefaultTableModel) tabela.getModel();
        model.setRowCount(0);
    }
    
    String buscaCidade(int codigo) {
        switch(codigo) {
            case 0: return "Criciúma";
            case 1: return "Urussanga";
            case 2: return "Orleans";
            case 3: return "São Bonifácio";
            case 4: return "Tubarão";
            case 5: return "Imbituba";
            case 6: return "Palhoça";
            case 7: return "Florianópolis";
            default: return "";
        }
    }
    
    boolean verificaPossuiOD(String cod1, String cod2) {
        try {
            for (int i = 0; i < tabela.getRowCount(); i++) {  // Loop through the rows
                String noOrigem = tabela.getValueAt(i, 0).toString();
                String noDestino = tabela.getValueAt(i, 2).toString();
                if (noOrigem.equals(cod1) && noDestino.equals(cod2)) {
                    throw new Exception(""); 
                }
             }
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    String buscaConfig() {
        try {
            // Abertura do arquivo de entrada
            FileInputStream arquivo = new FileInputStream("pastas.dat");
            ObjectInputStream inputStream = new ObjectInputStream(arquivo);

            List<String> pastas = (List<String>) inputStream.readObject();
            if (pastas.size() <= 0) {throw new Exception("");}
            inputStream.close();
            arquivo.close();
            
            return pastas.get(0);
        } catch (Exception e) {
            System.exit(1);
            return "";
        }
    }
    
    String buscaPastaProcessado() {
        try {
            // Abertura do arquivo de entrada
            FileInputStream arquivo = new FileInputStream("pastas.dat");
            ObjectInputStream inputStream = new ObjectInputStream(arquivo);

            List<String> pastas = (List<String>) inputStream.readObject();
            if (pastas.size() <= 0) {throw new Exception("");}
            inputStream.close();
            arquivo.close();
            String pastaProcessado = pastas.get(0);
            if (!pastaProcessado.contains("Processado=")) {throw new Exception("Pasta Processado não encontrada");}
            return pastaProcessado.split("=")[1];
        } catch (Exception e) {
            geraErro(e.getMessage());
            System.exit(1);
            return "";
        }
    }

    String buscaPastaNaoProcessado() {
        try {
            // Abertura do arquivo de entrada
            FileInputStream arquivo = new FileInputStream("pastas.dat");
            ObjectInputStream inputStream = new ObjectInputStream(arquivo);

            List<String> pastas = (List<String>) inputStream.readObject();
            if (pastas.size() <= 0) {throw new Exception("");}
            inputStream.close();
            arquivo.close();
            
            String pastaProcessado = pastas.get(1);
            if (!pastaProcessado.contains("Não Processado=")) {throw new Exception("Pasta Não Processado não encontrada");}
            return pastaProcessado.split("=")[1];
        } catch (Exception e) {
            geraErro(e.getMessage());
            System.exit(1);
            return "";
        }
    }
    
    String verificaPastaRotas(String pasta) {
        //Alterar Depois
        String resultado = "";
        String pastaSalvar = pasta;
        File folder = new File(pasta);
        FileFilter fileFilter = file -> !file.isDirectory() && file.getName().endsWith(".txt");
        File[] listaArquivos = folder.listFiles(fileFilter);
        if (!folder.exists()) {
            new File(pastaSalvar).mkdirs();
        }
        
        if (listaArquivos == null || listaArquivos.length == 0) {
            resultado = pastaSalvar + "\\rota00.txt";
            return resultado;
        }
        //Verifica Arquivos
        for (int i = 0; i < listaArquivos.length; i++) {
          if (listaArquivos[i].isFile()) {
              String verifica = verificaArquivo(listaArquivos[i].getPath());
              if (!verifica.isEmpty()) {return "Erro: " + verifica + "\nArquivo: "+ listaArquivos[i].getName();}    
              
          }
        }
        
        //Verifica pasta com nome para aqruivo
        for (int i = 0; i < listaArquivos.length; i++) {
          if (listaArquivos[i].isFile()) {
              String arquivoAtual = listaArquivos[i].getName();
              try {
                String numero = arquivoAtual.substring(4,6);
                int numeroInt = Integer.parseInt(numero);
                if (i < numeroInt) {return pastaSalvar + "\\rota" + String.format("%02d", i) + ".txt";}
                if (i == numeroInt) {
                    if (i+1 > listaArquivos.length-1) {
                       if (i+1 == 100) {
                           resultado = "Erro: Não é possível salvar uma Rota com número superior a 99";
                           return resultado;
                       } 
                       resultado = pastaSalvar + "\\rota" + String.format("%02d", i+1) + ".txt";
                       return resultado; 
                    }
                }
            } catch (NumberFormatException e) {
                return "Erro: Arquivo não possui o nome com número válido"; 
            }
          }
        }
        resultado = pastaSalvar + "\\rota00.txt";
        return resultado;
    }
    
    String geraLinhasArquivoSalvar(List<String> linhasArquivo) {
        int pesoTotal = 0;
        int numeroLinhas = 0;
        List<String> conexoes = new ArrayList<>();
        List<String> pesos = new ArrayList<>();
        List<String> nos = new ArrayList();
        
        for (int i = 0; i < tabela.getRowCount(); i++) {  // Loop through the rows
            String noOrigem = tabela.getValueAt(i, 0).toString();
            String noDestino = tabela.getValueAt(i, 2).toString();
            String distancia = tabela.getValueAt(i, 4).toString();
            
            if (!nos.contains(noOrigem)) {nos.add(noOrigem);} 
            if (!nos.contains(noDestino)) {nos.add(noDestino);}
            pesoTotal += Integer.parseInt(distancia);
            numeroLinhas ++;
            
            conexoes.add("01"+noOrigem+"="+noDestino);
            pesos.add("02"+noOrigem+";"+noDestino+"="+distancia);
        }
        
        if (nos.size() > 99) {return "Erro: Foi inserido muitos Nós";}
        String numeroNos = String.format("%02d", nos.size());
        if (pesoTotal > 9999) {return "Erro: Peso Total deu acima de 9999";}
        String pesoStr = String.format("%04d", pesoTotal);
        String linhasStr = String.format("%02d", numeroLinhas);
        //Header
        linhasArquivo.add("00"+numeroNos+pesoStr);
        //Conexoes
        for (int i = 0; i<conexoes.size(); i++) {
            linhasArquivo.add(conexoes.get(i));
        }
        //Pesos
        for (int i = 0; i<pesos.size(); i++) {
            linhasArquivo.add(pesos.get(i));
        }
        //Trailer
        linhasArquivo.add("09"+linhasStr+";"+linhasStr+";"+pesoStr);
        return "";
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
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnBuscar3;
    private javax.swing.JButton btnProcessar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JTextField edtBuscar;
    private javax.swing.JTextField edtCidade1;
    private javax.swing.JTextField edtCidade2;
    private javax.swing.JTextField edtCod1;
    private javax.swing.JTextField edtCod2;
    private javax.swing.JTextField edtKm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}


