/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package Telas;

import Persistencia.HibernateUtil;
import entities.Aposta;
import entities.Cliente;
import entities.Rodada;
import java.awt.Color;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Bruno
 */
public final class Main extends javax.swing.JDialog {

    /**
     * Creates new form Tela
     */
    public Main(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        getContentPane().setBackground(Color.BLACK);
        novoApostador();
        validaTela("inicio");
    }
    int x = 0;
    Double somaRodadas = 0.0;
    List<Double> saldos = new ArrayList<>();
    NumberFormat formatter = new DecimalFormat("0.00");
    
    
    Double soma;
    Rodada rodada;
    Cliente cl = new Cliente();
    Aposta aposta = new Aposta();
    
    public void montaTela() {
        cSaldoTotal.setText("R$ " + formatter.format(cl.getSaldoDaConta()));
        cSaldoDasRodadas.setText("R$ 00,00");
        cNome.setText(cl.getNome());
    }
    
    public void novoApostador(){
        TelaNova tela = new TelaNova(null, true);
        tela.setLocationRelativeTo(null);
        tela.setVisible(true);

        cl = new Cliente();
        cl.setNome(tela.getCliente().getNome());
        cl.setSaldoDaConta(tela.getCliente().getSaldoDaConta());
        aposta.setCliente(cl);
        montaTela();
    }
    
    public void validaTela(String par){
        if(par=="inicio"){
            botaoGanhei.setEnabled(false);
            botaoPerdi.setEnabled(false);
            botaoFinalizarAposta.setEnabled(false);
            botaoNovaAposta.setEnabled(true);
            botaoCancelarAposta.setEnabled(false);
            botaoSair.setEnabled(true);
            botaoNovoApostador.setEnabled(true);
            cValorApostado.setEditable(false);
            
        }else if(par=="apostando"){
            botaoGanhei.setEnabled(true);
            botaoPerdi.setEnabled(true);
            botaoFinalizarAposta.setEnabled(true);
            botaoNovaAposta.setEnabled(false);
            botaoCancelarAposta.setEnabled(true);
            botaoSair.setEnabled(false);
            botaoNovoApostador.setEnabled(false);
            cValorApostado.setEditable(true);
        }
    }
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cSaldoTotal = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        botaoPerdi = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        cSaldoDasRodadas = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        botaoSair = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        cValorApostado = new javax.swing.JTextField();
        cNome = new javax.swing.JTextField();
        botaoFinalizarAposta = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        cValorPraColocar = new javax.swing.JTextField();
        botaoNovoApostador = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        botaoGanhei = new javax.swing.JButton();
        botaoNovaAposta = new javax.swing.JButton();
        botaoCancelarAposta = new javax.swing.JButton();

        jButton5.setText("+ 10");

        jButton6.setText("- 10");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Interface de Apostas");
        setBackground(new java.awt.Color(0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 10)); // NOI18N
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Apostador:");

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Saldo Atual Total:");

        cSaldoTotal.setEditable(false);
        cSaldoTotal.setBackground(new java.awt.Color(51, 51, 51));
        cSaldoTotal.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        cSaldoTotal.setForeground(new java.awt.Color(255, 255, 255));
        cSaldoTotal.setCaretColor(new java.awt.Color(255, 255, 255));
        cSaldoTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cSaldoTotalActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Valor que vou apostar na rodada: ");

        botaoPerdi.setBackground(new java.awt.Color(0, 0, 0));
        botaoPerdi.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 14)); // NOI18N
        botaoPerdi.setForeground(new java.awt.Color(255, 0, 0));
        botaoPerdi.setText("Perdi");
        botaoPerdi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPerdiActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Saldo das Rodadas:");

        cSaldoDasRodadas.setEditable(false);
        cSaldoDasRodadas.setBackground(new java.awt.Color(51, 51, 51));
        cSaldoDasRodadas.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        cSaldoDasRodadas.setForeground(new java.awt.Color(255, 255, 255));
        cSaldoDasRodadas.setCaretColor(new java.awt.Color(255, 255, 255));
        cSaldoDasRodadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cSaldoDasRodadasActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Rodada");

        botaoSair.setBackground(new java.awt.Color(0, 0, 0));
        botaoSair.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 14)); // NOI18N
        botaoSair.setForeground(new java.awt.Color(255, 255, 255));
        botaoSair.setText("Sair");
        botaoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSairActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Quanto devo colocar na rodada:");

        cValorApostado.setBackground(new java.awt.Color(51, 51, 51));
        cValorApostado.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        cValorApostado.setForeground(new java.awt.Color(255, 255, 255));
        cValorApostado.setCaretColor(new java.awt.Color(255, 255, 255));
        cValorApostado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cValorApostadoActionPerformed(evt);
            }
        });

        cNome.setEditable(false);
        cNome.setBackground(new java.awt.Color(51, 51, 51));
        cNome.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        cNome.setForeground(new java.awt.Color(255, 255, 255));
        cNome.setCaretColor(new java.awt.Color(255, 255, 255));
        cNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cNomeActionPerformed(evt);
            }
        });

        botaoFinalizarAposta.setBackground(new java.awt.Color(0, 0, 0));
        botaoFinalizarAposta.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 14)); // NOI18N
        botaoFinalizarAposta.setForeground(new java.awt.Color(255, 255, 255));
        botaoFinalizarAposta.setText("Finalizar Aposta");
        botaoFinalizarAposta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoFinalizarApostaActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Lucida Calligraphy", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Interface de Apostas");

        cValorPraColocar.setEditable(false);
        cValorPraColocar.setBackground(new java.awt.Color(51, 51, 51));
        cValorPraColocar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        cValorPraColocar.setForeground(new java.awt.Color(255, 255, 255));
        cValorPraColocar.setCaretColor(new java.awt.Color(255, 255, 255));
        cValorPraColocar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cValorPraColocarActionPerformed(evt);
            }
        });

        botaoNovoApostador.setBackground(new java.awt.Color(0, 0, 0));
        botaoNovoApostador.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 14)); // NOI18N
        botaoNovoApostador.setForeground(new java.awt.Color(255, 255, 255));
        botaoNovoApostador.setText("Novo Apostador");
        botaoNovoApostador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoNovoApostadorActionPerformed(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("jLabel8");
        jLabel8.setEnabled(false);
        jLabel8.setFocusable(false);
        jLabel8.setMaximumSize(new java.awt.Dimension(0, 0));
        jLabel8.setMinimumSize(new java.awt.Dimension(0, 0));
        jLabel8.setPreferredSize(new java.awt.Dimension(0, 0));

        botaoGanhei.setBackground(new java.awt.Color(0, 0, 0));
        botaoGanhei.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 14)); // NOI18N
        botaoGanhei.setForeground(new java.awt.Color(0, 255, 0));
        botaoGanhei.setText("Ganhei");
        botaoGanhei.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoGanheiActionPerformed(evt);
            }
        });

        botaoNovaAposta.setBackground(new java.awt.Color(0, 0, 0));
        botaoNovaAposta.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 14)); // NOI18N
        botaoNovaAposta.setForeground(new java.awt.Color(255, 255, 255));
        botaoNovaAposta.setText("Nova Aposta");
        botaoNovaAposta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoNovaApostaActionPerformed(evt);
            }
        });

        botaoCancelarAposta.setBackground(new java.awt.Color(0, 0, 0));
        botaoCancelarAposta.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 14)); // NOI18N
        botaoCancelarAposta.setForeground(new java.awt.Color(255, 255, 255));
        botaoCancelarAposta.setText("Cancelar Aposta");
        botaoCancelarAposta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelarApostaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(jLabel7))
            .addGroup(layout.createSequentialGroup()
                .addGap(530, 530, 530)
                .addComponent(jLabel5))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel4)
                .addGap(17, 17, 17)
                .addComponent(cSaldoDasRodadas, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cNome, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel2)
                .addGap(39, 39, 39)
                .addComponent(cSaldoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(157, 157, 157)
                .addComponent(botaoNovoApostador)
                .addGap(13, 13, 13)
                .addComponent(botaoSair))
            .addGroup(layout.createSequentialGroup()
                .addGap(684, 684, 684)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(4, 4, 4)
                        .addComponent(cValorApostado, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(23, 23, 23)
                        .addComponent(cValorPraColocar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botaoGanhei)
                        .addGap(10, 10, 10)
                        .addComponent(botaoPerdi, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(botaoFinalizarAposta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoNovaAposta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoCancelarAposta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel7)
                .addGap(20, 20, 20)
                .addComponent(jLabel5)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cValorApostado, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(botaoGanhei, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoPerdi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cValorPraColocar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jLabel6))))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botaoFinalizarAposta, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoNovaAposta, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoCancelarAposta, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cSaldoDasRodadas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(cNome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cSaldoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(botaoNovoApostador, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoSair, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(5, 5, 5)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void cSaldoTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cSaldoTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cSaldoTotalActionPerformed

    private void cSaldoDasRodadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cSaldoDasRodadasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cSaldoDasRodadasActionPerformed

    private void botaoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_botaoSairActionPerformed

    private void cValorApostadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cValorApostadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cValorApostadoActionPerformed

    private void cNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cNomeActionPerformed

    private void cValorPraColocarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cValorPraColocarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cValorPraColocarActionPerformed

    private void botaoNovoApostadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoNovoApostadorActionPerformed
        novoApostador();
    }//GEN-LAST:event_botaoNovoApostadorActionPerformed

    private void botaoPerdiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPerdiActionPerformed

        
        rodada = new Rodada();

        aposta.setQuantidadeDeRodadas(x+1);
        rodada.setValorApostado(Double.parseDouble(cValorApostado.getText().replace("R$ ", "").replace(",", ".")));
        rodada.setStatusDaRodada(false);
        
        saldos.add(-rodada.getValorApostado());
        
        aposta.adicionarRodada(rodada);
        
        soma = 0.0;

        for (Rodada rodad : aposta.getListaDeRodadas()) {
            soma += rodad.getValorApostado() * 2;
        }
        
        
        somaRodadas += rodada.getValorApostado() * (-1);
        
        cSaldoTotal.setText("R$ " + formatter.format(cl.getSaldoDaConta()+somaRodadas));
        cValorPraColocar.setText("R$ " + formatter.format(soma));
        cValorApostado.setText("R$ " + formatter.format(soma));
        cSaldoDasRodadas.setText("R$ " + formatter.format(somaRodadas));
        x += 1;
    }//GEN-LAST:event_botaoPerdiActionPerformed

    private void botaoFinalizarApostaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoFinalizarApostaActionPerformed
        validaTela("inicio");
        Double somaSaldos = 0.0;
        for(Double saldo : saldos){
            somaSaldos+=saldo;
        }   
        aposta.setSaldoFinalDaAposta(somaSaldos);
        aposta.verificarSeGanhou();
        aposta.getCliente().setSaldoDaConta(aposta.getCliente().getSaldoDaConta()+somaSaldos);
        somaRodadas = 0.0;
        cValorPraColocar.setText("R$ 00,00");
        cValorApostado.setText("R$ 00,00");
        saldos = new ArrayList<>();
        HibernateUtil.beginTransaction();
        HibernateUtil.getSession().merge(aposta);
        HibernateUtil.commitTransaction();
        HibernateUtil.closeSession();
    }//GEN-LAST:event_botaoFinalizarApostaActionPerformed

    private void botaoGanheiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoGanheiActionPerformed
        somaRodadas = 0.0;
        cSaldoDasRodadas.setText("R$ 00,00");
    }//GEN-LAST:event_botaoGanheiActionPerformed

    private void botaoNovaApostaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoNovaApostaActionPerformed
        validaTela("apostando");
        aposta = new Aposta();
        aposta.setCliente(cl);
    }//GEN-LAST:event_botaoNovaApostaActionPerformed

    private void botaoCancelarApostaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarApostaActionPerformed
        validaTela("inicio");
        aposta = new Aposta();
        aposta.setCliente(cl);
    }//GEN-LAST:event_botaoCancelarApostaActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Main dialog = new Main(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCancelarAposta;
    private javax.swing.JButton botaoFinalizarAposta;
    private javax.swing.JButton botaoGanhei;
    private javax.swing.JButton botaoNovaAposta;
    private javax.swing.JButton botaoNovoApostador;
    private javax.swing.JButton botaoPerdi;
    private javax.swing.JButton botaoSair;
    private javax.swing.JTextField cNome;
    private javax.swing.JTextField cSaldoDasRodadas;
    private javax.swing.JTextField cSaldoTotal;
    private javax.swing.JTextField cValorApostado;
    private javax.swing.JTextField cValorPraColocar;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
