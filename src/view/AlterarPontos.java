/**
 * Componente Curricular: Módulo Integrado de Programação
 * Autor: Estéfane Carmo de Souza
 * Data: 14-09-2019
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

import controller.ControllerAlterarPontos;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class AlterarPontos extends javax.swing.JFrame {

    private ControllerAlterarPontos controlador;

    public AlterarPontos() {
        initComponents();
        controlador = new ControllerAlterarPontos();
        abas.setEnabledAt(1, false);
        abas.setEnabledAt(2, false);
        //Adiciona no ComboBox todos os vertices
        ArrayList<String> add = controlador.addPontosComboBox();
        for (int i = 0; i < add.size(); i++) {
            estacionamento.addItem(add.get(i));
        }
        //Adicionar os bancos ao comboBox
        ArrayList<String> adicionar = controlador.addBancosComboBox();
        for (int i = 0; i < adicionar.size(); i++) {
            chegada.addItem(adicionar.get(i));
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator2 = new javax.swing.JSeparator();
        abas = new javax.swing.JTabbedPane();
        abaPrincipal = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        acessarAba1 = new javax.swing.JButton();
        acessarAba2 = new javax.swing.JButton();
        voltar = new javax.swing.JButton();
        abaEstacionamento = new javax.swing.JPanel();
        estacionamento = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        alterarEst = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        printEst = new javax.swing.JTextArea();
        voltar2 = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        abaBanco = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        alterarBanco = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        printBanco = new javax.swing.JTextArea();
        chegada = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        voltarAba = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        abaPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        abaPrincipal.setPreferredSize(new java.awt.Dimension(600, 400));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setText("ALTERAR PONTOS DA ROTA");

        acessarAba1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        acessarAba1.setText("Alterar Banco");
        acessarAba1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acessarAba1ActionPerformed(evt);
            }
        });

        acessarAba2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        acessarAba2.setText("Alterar Estacionamento");
        acessarAba2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acessarAba2ActionPerformed(evt);
            }
        });

        voltar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        voltar.setText("Voltar ao Menu");
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout abaPrincipalLayout = new javax.swing.GroupLayout(abaPrincipal);
        abaPrincipal.setLayout(abaPrincipalLayout);
        abaPrincipalLayout.setHorizontalGroup(
            abaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaPrincipalLayout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addGroup(abaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addGroup(abaPrincipalLayout.createSequentialGroup()
                        .addGroup(abaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(acessarAba2, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(acessarAba1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)))
                .addContainerGap(139, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, abaPrincipalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(voltar)
                .addGap(33, 33, 33))
        );
        abaPrincipalLayout.setVerticalGroup(
            abaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaPrincipalLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(acessarAba2)
                .addGap(38, 38, 38)
                .addComponent(acessarAba1)
                .addGap(76, 76, 76)
                .addComponent(voltar)
                .addGap(44, 44, 44))
        );

        abas.addTab("", abaPrincipal);

        abaEstacionamento.setBackground(new java.awt.Color(255, 255, 255));
        abaEstacionamento.setEnabled(false);
        abaEstacionamento.setPreferredSize(new java.awt.Dimension(600, 400));

        estacionamento.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        estacionamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estacionamentoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setText("ALTERAR ESTACIONAMENTO");

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setText("Selecione para que local deseja alterar o estacionamento da empresa:");

        alterarEst.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        alterarEst.setText("Alterar estacionamento");
        alterarEst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarEstActionPerformed(evt);
            }
        });

        printEst.setEditable(false);
        printEst.setColumns(20);
        printEst.setRows(5);
        jScrollPane1.setViewportView(printEst);

        voltar2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        voltar2.setText("Voltar");
        voltar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltar2ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("ROTA:");

        javax.swing.GroupLayout abaEstacionamentoLayout = new javax.swing.GroupLayout(abaEstacionamento);
        abaEstacionamento.setLayout(abaEstacionamentoLayout);
        abaEstacionamentoLayout.setHorizontalGroup(
            abaEstacionamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaEstacionamentoLayout.createSequentialGroup()
                .addGroup(abaEstacionamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(abaEstacionamentoLayout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jLabel3))
                    .addGroup(abaEstacionamentoLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(alterarEst)))
                .addGap(31, 31, 31))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, abaEstacionamentoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(voltar2)
                .addGap(33, 33, 33))
            .addGroup(abaEstacionamentoLayout.createSequentialGroup()
                .addGroup(abaEstacionamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(abaEstacionamentoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 583, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(abaEstacionamentoLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(abaEstacionamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(estacionamento, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addGroup(abaEstacionamentoLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(abaEstacionamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        abaEstacionamentoLayout.setVerticalGroup(
            abaEstacionamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, abaEstacionamentoLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGroup(abaEstacionamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(abaEstacionamentoLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(estacionamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(abaEstacionamentoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addComponent(alterarEst)
                        .addGap(18, 18, 18)))
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(voltar2)
                .addGap(22, 22, 22))
        );

        abas.addTab("Alterar Estacionamento", abaEstacionamento);

        abaBanco.setBackground(new java.awt.Color(255, 255, 255));
        abaBanco.setEnabled(false);
        abaBanco.setPreferredSize(new java.awt.Dimension(600, 400));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setText("ALTERAR BANCO");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("Selecione o novo Banco que deseja levar o dinheiro:");

        alterarBanco.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        alterarBanco.setText("Alterar banco");
        alterarBanco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarBancoActionPerformed(evt);
            }
        });

        printBanco.setEditable(false);
        printBanco.setColumns(20);
        printBanco.setRows(5);
        jScrollPane2.setViewportView(printBanco);

        chegada.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        chegada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chegadaActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("ROTA:");

        voltarAba.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        voltarAba.setText("Voltar");
        voltarAba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarAbaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout abaBancoLayout = new javax.swing.GroupLayout(abaBanco);
        abaBanco.setLayout(abaBancoLayout);
        abaBancoLayout.setHorizontalGroup(
            abaBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaBancoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1)
                .addContainerGap())
            .addGroup(abaBancoLayout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addComponent(jLabel4)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(abaBancoLayout.createSequentialGroup()
                .addGroup(abaBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(abaBancoLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(abaBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(chegada, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(abaBancoLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(abaBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(voltarAba)
                            .addGroup(abaBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6)))))
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, abaBancoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(alterarBanco)
                .addGap(40, 40, 40))
        );
        abaBancoLayout.setVerticalGroup(
            abaBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaBancoLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chegada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(alterarBanco)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(voltarAba)
                .addGap(26, 26, 26))
        );

        abas.addTab("Alterar Banco", abaBanco);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(abas, javax.swing.GroupLayout.PREFERRED_SIZE, 593, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(239, 239, 239)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(abas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void alterarEstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarEstActionPerformed
        if (estacionamento.getSelectedItem() != null) {
            String rota = controlador.TrocarEstacionamento(String.valueOf(estacionamento.getSelectedItem()));
            if (!rota.equals("")) {
                JOptionPane.showMessageDialog(null, "A alteração foi realizada, e a rota atual sofreu alteração");
                printEst.setText(rota);
            } else {
                JOptionPane.showMessageDialog(null, "A alteração foi realizada");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Não existe pontos cadastrados");
        }
    }//GEN-LAST:event_alterarEstActionPerformed

    private void estacionamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estacionamentoActionPerformed
        
    }//GEN-LAST:event_estacionamentoActionPerformed

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_voltarActionPerformed

    private void acessarAba1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acessarAba1ActionPerformed
        abas.setEnabledAt(2, true);
        abas.setSelectedIndex(2);    
    }//GEN-LAST:event_acessarAba1ActionPerformed

    private void chegadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chegadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chegadaActionPerformed

    private void alterarBancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarBancoActionPerformed
       if(chegada.getSelectedItem()!=null){
        String rota = controlador.trocarBanco(String.valueOf(chegada.getSelectedItem()));
        if (!rota.equals("")) {
            JOptionPane.showMessageDialog(null, "A alteração foi concluida e a rota sofreu alteração");
            printBanco.setText(rota);
        } else {
            JOptionPane.showMessageDialog(null, "Não existe rota cadastada");
        }
       }
       else{
          JOptionPane.showMessageDialog(null, "Não existe pontos cadastrados");
       }
    }//GEN-LAST:event_alterarBancoActionPerformed

    private void voltar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltar2ActionPerformed
        abas.setSelectedIndex(0);
        abas.setEnabledAt(1, false);
    }//GEN-LAST:event_voltar2ActionPerformed

    private void voltarAbaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarAbaActionPerformed
        abas.setSelectedIndex(0);
        abas.setEnabledAt(2, false); 
    }//GEN-LAST:event_voltarAbaActionPerformed

    private void acessarAba2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acessarAba2ActionPerformed
        abas.setEnabledAt(1, true);
        abas.setSelectedIndex(1); 
    }//GEN-LAST:event_acessarAba2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel abaBanco;
    private javax.swing.JPanel abaEstacionamento;
    private javax.swing.JPanel abaPrincipal;
    private javax.swing.JTabbedPane abas;
    private javax.swing.JButton acessarAba1;
    private javax.swing.JButton acessarAba2;
    private javax.swing.JButton alterarBanco;
    private javax.swing.JButton alterarEst;
    private javax.swing.JComboBox<String> chegada;
    private javax.swing.JComboBox<String> estacionamento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextArea printBanco;
    private javax.swing.JTextArea printEst;
    private javax.swing.JButton voltar;
    private javax.swing.JButton voltar2;
    private javax.swing.JButton voltarAba;
    // End of variables declaration//GEN-END:variables
}
