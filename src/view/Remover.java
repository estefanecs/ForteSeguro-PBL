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

import controller.ControllerRemover;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Remover extends javax.swing.JFrame {
    private ControllerRemover controlador;
    
    public Remover() {
        initComponents();
        controlador= new ControllerRemover();
         abas.setEnabledAt(1, false);
        abas.setEnabledAt(2, false);

        ArrayList<String> add= controlador.addPontosComboBox();
        for(int i=0; i< add.size();i++){
            vertice.addItem(add.get(i));
            ponto1.addItem(add.get(i));
            ponto2.addItem(add.get(i));
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        abas = new javax.swing.JTabbedPane();
        tab = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        menu = new javax.swing.JButton();
        AcesarTab1 = new javax.swing.JButton();
        acessarTab2 = new javax.swing.JButton();
        tab2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        vertice = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        printPontos = new javax.swing.JTextArea();
        removerVertice = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        voltar1 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        printLigacao = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        removerAresta1 = new javax.swing.JButton();
        ponto2 = new javax.swing.JComboBox<>();
        ponto1 = new javax.swing.JComboBox<>();
        legendaPonto2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        voltar2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        abas.setPreferredSize(new java.awt.Dimension(600, 400));

        tab.setBackground(new java.awt.Color(255, 255, 255));
        tab.setPreferredSize(new java.awt.Dimension(600, 400));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel9.setText("REMOVER PONTO OU LIGAÇÃO");

        menu.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        menu.setText("Voltar ao menu");
        menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuActionPerformed(evt);
            }
        });

        AcesarTab1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        AcesarTab1.setText("Remover Ponto");
        AcesarTab1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcesarTab1ActionPerformed(evt);
            }
        });

        acessarTab2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        acessarTab2.setText("Remover Ligação");
        acessarTab2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acessarTab2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tabLayout = new javax.swing.GroupLayout(tab);
        tab.setLayout(tabLayout);
        tabLayout.setHorizontalGroup(
            tabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabLayout.createSequentialGroup()
                .addGroup(tabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(menu))
                    .addGroup(tabLayout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addGroup(tabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(AcesarTab1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(acessarTab2, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 109, Short.MAX_VALUE)))
                .addContainerGap())
        );
        tabLayout.setVerticalGroup(
            tabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel9)
                .addGap(51, 51, 51)
                .addComponent(AcesarTab1)
                .addGap(37, 37, 37)
                .addComponent(acessarTab2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addComponent(menu)
                .addGap(35, 35, 35))
        );

        abas.addTab("", tab);

        tab2.setBackground(new java.awt.Color(255, 255, 255));
        tab2.setEnabled(false);
        tab2.setPreferredSize(new java.awt.Dimension(600, 400));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setText("REMOVER PONTO");

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setText("Selecione um ponto que deseja remover:");

        vertice.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        vertice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verticeActionPerformed(evt);
            }
        });

        printPontos.setEditable(false);
        printPontos.setColumns(20);
        printPontos.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        printPontos.setRows(5);
        printPontos.setCaretColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(printPontos);

        removerVertice.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        removerVertice.setText("Remover");
        removerVertice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerVerticeActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("ROTA:");

        voltar1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        voltar1.setText("Voltar");
        voltar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tab2Layout = new javax.swing.GroupLayout(tab2);
        tab2.setLayout(tab2Layout);
        tab2Layout.setHorizontalGroup(
            tab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tab2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(tab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(vertice, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(336, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tab2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator2))
            .addGroup(tab2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(tab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(voltar1)
                    .addGroup(tab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tab2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(tab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tab2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(176, 176, 176))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tab2Layout.createSequentialGroup()
                        .addComponent(removerVertice)
                        .addGap(36, 36, 36))))
        );
        tab2Layout.setVerticalGroup(
            tab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(vertice, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(removerVertice)
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(voltar1)
                .addGap(23, 23, 23))
        );

        abas.addTab("Remover ponto", tab2);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setEnabled(false);
        jPanel4.setPreferredSize(new java.awt.Dimension(600, 400));

        printLigacao.setEditable(false);
        printLigacao.setColumns(20);
        printLigacao.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        printLigacao.setRows(5);
        jScrollPane3.setViewportView(printLigacao);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setText("Selecione os pontos que faz parte da ligação que deseja remover:");

        removerAresta1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        removerAresta1.setText("Remover");
        removerAresta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerAresta1ActionPerformed(evt);
            }
        });

        ponto2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
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

        legendaPonto2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        legendaPonto2.setText("Ponto 1:");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel6.setText("Ponto 2:");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel7.setText("REMOVER  LIGAÇÃO");

        voltar2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        voltar2.setText("Voltar");
        voltar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltar2ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("ROTA:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(voltar2)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(legendaPonto2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(ponto1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(6, 6, 6)
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(ponto2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel8)
                                .addComponent(jLabel4)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(jLabel7)))
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(jSeparator1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(removerAresta1)
                .addGap(29, 29, 29))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(14, 14, 14)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(legendaPonto2)
                    .addComponent(jLabel6)
                    .addComponent(ponto1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ponto2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(removerAresta1)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(voltar2)
                .addGap(39, 39, 39))
        );

        abas.addTab("Remover ligação", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(abas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(abas, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void verticeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verticeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_verticeActionPerformed

    private void menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_menuActionPerformed
    //ESSA FUNÇÃO DO COMBOBOX NÃO REMOVE
    private void removerVerticeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerVerticeActionPerformed
        if (vertice.getSelectedItem()!=null) {
            String rota = controlador.removerPonto(String.valueOf(vertice.getSelectedItem()));
            ponto1.removeItem(String.valueOf(vertice.getSelectedItem()));
            ponto2.removeItem(String.valueOf(vertice.getSelectedItem()));
            vertice.removeItem(String.valueOf(vertice.getSelectedItem()));
            if (rota.equals("")) {
                JOptionPane.showMessageDialog(null, "O ponto foi removido com sucesso");
            } else {
                JOptionPane.showMessageDialog(null, "O ponto foi removido com sucesso e a rota atual sofreu alteração");
                printPontos.setText(rota);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Não existem pontos cadastrados");
        }
    }//GEN-LAST:event_removerVerticeActionPerformed

    private void voltar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltar1ActionPerformed
        abas.setSelectedIndex(0);
        abas.setEnabledAt(1, false); 
    }//GEN-LAST:event_voltar1ActionPerformed

    private void AcesarTab1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AcesarTab1ActionPerformed
        abas.setEnabledAt(1, true);
        abas.setSelectedIndex(1);   
    }//GEN-LAST:event_AcesarTab1ActionPerformed

    private void acessarTab2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acessarTab2ActionPerformed
       abas.setEnabledAt(2, true);
       abas.setSelectedIndex(2);   
    }//GEN-LAST:event_acessarTab2ActionPerformed

    private void voltar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltar2ActionPerformed
        abas.setSelectedIndex(0);
        abas.setEnabledAt(2, false);
    }//GEN-LAST:event_voltar2ActionPerformed

    private void ponto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ponto1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ponto1ActionPerformed

    private void ponto2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ponto2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ponto2ActionPerformed

    private void removerAresta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerAresta1ActionPerformed
        if (ponto1.getSelectedItem()!=null && ponto2.getSelectedItem()!=null) {
            String rota = controlador.removerLigacao(String.valueOf(ponto1.getSelectedItem()), String.valueOf(ponto2.getSelectedItem()));
            if (rota.equals("")) {
                JOptionPane.showMessageDialog(null, "A ligação foi removida com sucesso");
            } else {
                JOptionPane.showMessageDialog(null, "A ligação foi removida com sucesso e a rota atual sofreu alteração");
                printPontos.setText(rota);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Não existem pontos cadastrados");
        }
    }//GEN-LAST:event_removerAresta1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AcesarTab1;
    private javax.swing.JTabbedPane abas;
    private javax.swing.JButton acessarTab2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel legendaPonto2;
    private javax.swing.JButton menu;
    private javax.swing.JComboBox<String> ponto1;
    private javax.swing.JComboBox<String> ponto2;
    private javax.swing.JTextArea printLigacao;
    private javax.swing.JTextArea printPontos;
    private javax.swing.JButton removerAresta1;
    private javax.swing.JButton removerVertice;
    private javax.swing.JPanel tab;
    private javax.swing.JPanel tab2;
    private javax.swing.JComboBox<String> vertice;
    private javax.swing.JButton voltar1;
    private javax.swing.JButton voltar2;
    // End of variables declaration//GEN-END:variables
}
