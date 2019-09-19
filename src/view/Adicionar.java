/**
 * Componente Curricular: Módulo Integrado de Programação
 * Autor: Estéfane Carmo de Souza
 * Data: 04-09-2019
 *
 * Declaro que este código foi elaborado por mim de forma individual e
 * não contém nenhum trecho de código de outro colega ou de outro autor,
 * tais como provindos de livros e apostilas, e páginas ou documentos
 * eletrônicos da Internet. Qualquer trecho de código de outra autoria que
 * uma citação para o  não a minha está destacado com  autor e a fonte do
 * código, e estou ciente que estes trechos não serão considerados para fins
 * de avaliação. Alguns trechos do código podem coincidir com de outros
 * colegas pois estes foram discutidos em sessões tutorias.
 */
package view;

import controller.ControllerAdicionar;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

public class Adicionar extends javax.swing.JFrame {

    private ControllerAdicionar controlador;

    public Adicionar() {
        initComponents();
        controlador = new ControllerAdicionar();
        abas.setEnabledAt(1, false);
        abas.setEnabledAt(2, false);
         ArrayList<String> add= controlador.addPontosComboBox();
        for(int i=0; i< add.size();i++){
            ponto1.addItem(add.get(i));
            ponto2.addItem(add.get(i));
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        abas = new javax.swing.JTabbedPane();
        painel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        abrirAbaLigacao = new javax.swing.JButton();
        abrirAbaPonto = new javax.swing.JButton();
        menu = new javax.swing.JButton();
        painel2 = new javax.swing.JPanel();
        labelPontos = new javax.swing.JLabel();
        adicionarP = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        tipoVertice = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        nomeVertice = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        painel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        addAresta = new javax.swing.JButton();
        ponto2 = new javax.swing.JComboBox<>();
        ponto1 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tempo = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        painel.setBackground(new java.awt.Color(255, 255, 255));
        painel.setPreferredSize(new java.awt.Dimension(600, 400));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("ADICIONAR PONTOS E  LIGAÇÕES");

        abrirAbaLigacao.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        abrirAbaLigacao.setText("Adicionar Ligação");
        abrirAbaLigacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirAbaLigacaoActionPerformed(evt);
            }
        });

        abrirAbaPonto.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        abrirAbaPonto.setText("Adicionar Ponto");
        abrirAbaPonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirAbaPontoActionPerformed(evt);
            }
        });

        menu.setBackground(new java.awt.Color(255, 255, 255));
        menu.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        menu.setText("Voltar ao Menu Principal");
        menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelLayout = new javax.swing.GroupLayout(painel);
        painel.setLayout(painelLayout);
        painelLayout.setHorizontalGroup(
            painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLayout.createSequentialGroup()
                .addContainerGap(93, Short.MAX_VALUE)
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelLayout.createSequentialGroup()
                        .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(abrirAbaLigacao, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(abrirAbaPonto, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(83, 83, 83))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelLayout.createSequentialGroup()
                        .addComponent(menu)
                        .addGap(23, 23, 23))))
        );
        painelLayout.setVerticalGroup(
            painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGap(62, 62, 62)
                .addComponent(abrirAbaPonto)
                .addGap(41, 41, 41)
                .addComponent(abrirAbaLigacao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                .addComponent(menu)
                .addGap(39, 39, 39))
        );

        abas.addTab("", painel);

        painel2.setBackground(new java.awt.Color(255, 255, 255));
        painel2.setEnabled(false);
        painel2.setPreferredSize(new java.awt.Dimension(600, 400));

        labelPontos.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        labelPontos.setText("ADICIONAR PONTOS ");

        adicionarP.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        adicionarP.setText("Adicionar");
        adicionarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarPActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton2.setText("Voltar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        tipoVertice.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tipoVertice.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "coleta", "estacionamento", "banco", "cruzamento" }));
        tipoVertice.setToolTipText("");
        tipoVertice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoVerticeActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel11.setText("Tipo:");

        nomeVertice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeVerticeActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel10.setText("Nome:");

        javax.swing.GroupLayout painel2Layout = new javax.swing.GroupLayout(painel2);
        painel2.setLayout(painel2Layout);
        painel2Layout.setHorizontalGroup(
            painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel2Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomeVertice, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tipoVertice, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(167, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel2Layout.createSequentialGroup()
                        .addComponent(labelPontos)
                        .addGap(161, 161, 161))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel2Layout.createSequentialGroup()
                        .addGroup(painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(adicionarP)
                            .addComponent(jButton2))
                        .addGap(34, 34, 34))))
        );
        painel2Layout.setVerticalGroup(
            painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel2Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(labelPontos)
                .addGap(55, 55, 55)
                .addGroup(painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(nomeVertice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(tipoVertice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(adicionarP)
                .addGap(84, 84, 84)
                .addComponent(jButton2)
                .addContainerGap(76, Short.MAX_VALUE))
        );

        abas.addTab("Adicionar Pontos", painel2);

        painel1.setBackground(new java.awt.Color(255, 255, 255));
        painel1.setEnabled(false);
        painel1.setPreferredSize(new java.awt.Dimension(600, 400));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setText("ADICIONAR  LIGAÇÕES");

        jButton1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton1.setText("Voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        addAresta.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        addAresta.setText("Adicionar");
        addAresta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addArestaActionPerformed(evt);
            }
        });

        ponto2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ponto2ActionPerformed(evt);
            }
        });

        ponto1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ponto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ponto1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel7.setText("Ponto 2:");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel6.setText("Ponto 1:");

        jLabel8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel8.setText("Tempo entre os pontos:");

        tempo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tempo.setModel(new javax.swing.SpinnerNumberModel(1, 1, 999, 1));
        tempo.setValue(1);
        tempo.setVerifyInputWhenFocusTarget(false);

        javax.swing.GroupLayout painel1Layout = new javax.swing.GroupLayout(painel1);
        painel1.setLayout(painel1Layout);
        painel1Layout.setHorizontalGroup(
            painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel1Layout.createSequentialGroup()
                .addGroup(painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton1)
                        .addComponent(addAresta)
                        .addGroup(painel1Layout.createSequentialGroup()
                            .addGap(38, 38, 38)
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ponto1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(26, 26, 26)
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(ponto2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(28, 28, 28)
                            .addComponent(jLabel8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(painel1Layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(jLabel3)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        painel1Layout.setVerticalGroup(
            painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel3)
                .addGap(59, 59, 59)
                .addGroup(painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ponto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ponto2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(tempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(addAresta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(55, 55, 55))
        );

        abas.addTab("Adicionar Ligações", painel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(abas, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(abas, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nomeVerticeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeVerticeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeVerticeActionPerformed

    private void tipoVerticeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoVerticeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipoVerticeActionPerformed

    private void adicionarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarPActionPerformed
        if(!nomeVertice.getText().equals("")){
        controlador.adicionarPonto(nomeVertice.getText(), String.valueOf(tipoVertice.getSelectedItem()));
        ponto1.addItem(nomeVertice.getText());
        ponto2.addItem(nomeVertice.getText());
        JOptionPane.showMessageDialog(null, "O ponto foi adicionado");
        nomeVertice.setText("");
        }
        else{
              JOptionPane.showMessageDialog(null, "Informe o nome do vertice");
        }
    }//GEN-LAST:event_adicionarPActionPerformed

    private void menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_menuActionPerformed

    private void abrirAbaPontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirAbaPontoActionPerformed
     abas.setEnabledAt(1, true);
        abas.setSelectedIndex(1);   
    }//GEN-LAST:event_abrirAbaPontoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    abas.setSelectedIndex(0);
        abas.setEnabledAt(1, false);    // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void abrirAbaLigacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirAbaLigacaoActionPerformed
        abas.setEnabledAt(2, true);
        abas.setSelectedIndex(2);   
    }//GEN-LAST:event_abrirAbaLigacaoActionPerformed

    private void ponto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ponto1ActionPerformed

    }//GEN-LAST:event_ponto1ActionPerformed

    private void ponto2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ponto2ActionPerformed

    }//GEN-LAST:event_ponto2ActionPerformed

    private void addArestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addArestaActionPerformed
        if(ponto1.getSelectedItem()!=null || ponto2.getSelectedItem()!=null){
            controlador.adicionarLigacao(String.valueOf(ponto1.getSelectedItem()), String.valueOf(ponto2.getSelectedItem()), tempo.getComponentCount());
            JOptionPane.showMessageDialog(null, "A ligação foi adicionada");
        }
        else{
            JOptionPane.showMessageDialog(null, "Não foi possivel adicionar a ligação, confira se os dados foram selecionados");
        }
    }//GEN-LAST:event_addArestaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        abas.setSelectedIndex(0);
        abas.setEnabledAt(2, false);
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane abas;
    private javax.swing.JButton abrirAbaLigacao;
    private javax.swing.JButton abrirAbaPonto;
    private javax.swing.JButton addAresta;
    private javax.swing.JButton adicionarP;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel labelPontos;
    private javax.swing.JButton menu;
    private javax.swing.JTextField nomeVertice;
    private javax.swing.JPanel painel;
    private javax.swing.JPanel painel1;
    private javax.swing.JPanel painel2;
    private javax.swing.JComboBox<String> ponto1;
    private javax.swing.JComboBox<String> ponto2;
    private javax.swing.JSpinner tempo;
    private javax.swing.JComboBox<String> tipoVertice;
    // End of variables declaration//GEN-END:variables
}
