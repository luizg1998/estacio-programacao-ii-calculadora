/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.programacaoii.ui;

import java.util.List;
import java.util.ArrayList;
import static javax.management.Query.value;

/**
 *
 * @author aluno
 */
public class calculadora extends javax.swing.JFrame {

    private int resultado;

    public calculadora() {
        initComponents();
        this.resultado = 0;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        ac = new javax.swing.JButton();
        porc = new javax.swing.JButton();
        off = new javax.swing.JButton();
        barra = new javax.swing.JButton();
        sete = new javax.swing.JButton();
        huit = new javax.swing.JButton();
        nuit = new javax.swing.JButton();
        vezes = new javax.swing.JButton();
        quatre = new javax.swing.JButton();
        cinc = new javax.swing.JButton();
        six = new javax.swing.JButton();
        menos = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        igual = new javax.swing.JButton();
        mais = new javax.swing.JButton();
        un = new javax.swing.JButton();
        trois = new javax.swing.JButton();
        duix = new javax.swing.JButton();
        input_operacao = new javax.swing.JTextField();

        jTextField1.setText("jTextField1");

        jTextField2.setText("jTextField2");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("CALCULADORA");

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        ac.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        ac.setText("AC");
        ac.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acActionPerformed(evt);
            }
        });

        porc.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        porc.setText("%");
        porc.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        off.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        off.setText("Exit");
        off.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        off.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                offActionPerformed(evt);
            }
        });

        barra.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        barra.setText("/");
        barra.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        barra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barraActionPerformed(evt);
            }
        });

        sete.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        sete.setText("7");
        sete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seteActionPerformed(evt);
            }
        });

        huit.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        huit.setText("8");
        huit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                huitActionPerformed(evt);
            }
        });

        nuit.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        nuit.setText("9");
        nuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuitActionPerformed(evt);
            }
        });

        vezes.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        vezes.setText("X");
        vezes.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        vezes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vezesActionPerformed(evt);
            }
        });

        quatre.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        quatre.setText("4");
        quatre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quatreActionPerformed(evt);
            }
        });

        cinc.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        cinc.setText("5");
        cinc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cincActionPerformed(evt);
            }
        });

        six.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        six.setText("6");
        six.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixActionPerformed(evt);
            }
        });

        menos.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        menos.setText("-");
        menos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        menos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menosActionPerformed(evt);
            }
        });

        jButton13.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        jButton13.setText("0");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        jButton14.setText(",");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        igual.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        igual.setText("=");
        igual.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                igualActionPerformed(evt);
            }
        });

        mais.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        mais.setText("+");
        mais.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        mais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maisActionPerformed(evt);
            }
        });

        un.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        un.setText("1");
        un.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unActionPerformed(evt);
            }
        });

        trois.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        trois.setText("3");
        trois.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                troisActionPerformed(evt);
            }
        });

        duix.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        duix.setText("2");
        duix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                duixActionPerformed(evt);
            }
        });

        input_operacao.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        input_operacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_operacaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(input_operacao, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ac, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(off, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16)
                                .addComponent(porc, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(sete, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(quatre, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(cinc, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(six, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(huit, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(nuit, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(trois, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(duix, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(un, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(vezes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(barra, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(menos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mais, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(igual, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(input_operacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(off)
                            .addComponent(ac)
                            .addComponent(porc))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sete)
                            .addComponent(nuit)
                            .addComponent(huit))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cinc)
                                    .addComponent(six)
                                    .addComponent(quatre)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(trois)
                                    .addComponent(duix)
                                    .addComponent(un))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton14)
                                    .addComponent(jButton13)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(barra)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(vezes)
                        .addGap(11, 11, 11)
                        .addComponent(menos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mais)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(igual, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(117, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(188, 188, 188))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void acActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acActionPerformed
        // TODO add your handling code here:
        this.input_operacao.setText("");
    }//GEN-LAST:event_acActionPerformed

    private void unActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unActionPerformed
        this.addValues("1");
    }//GEN-LAST:event_unActionPerformed

    private void addValues(String value) {
        String btn = this.input_operacao.getText();
        btn += value;
        this.input_operacao.setText(btn);
    }


    private void nuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuitActionPerformed
        // TODO add your handling code here:
        this.addValues("9");
    }//GEN-LAST:event_nuitActionPerformed

    private void offActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_offActionPerformed
        System.exit(0);
    }//GEN-LAST:event_offActionPerformed

    private void input_operacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_operacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_operacaoActionPerformed

    private void duixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_duixActionPerformed
        // TODO add your handling code here:
        this.addValues("2");
    }//GEN-LAST:event_duixActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
        this.addValues("0");
    }//GEN-LAST:event_jButton13ActionPerformed

    private void troisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_troisActionPerformed
        // TODO add your handling code here:
        this.addValues("3");
    }//GEN-LAST:event_troisActionPerformed

    private void quatreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quatreActionPerformed
        // TODO add your handling code here:
        this.addValues("4");
    }//GEN-LAST:event_quatreActionPerformed

    private void cincActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cincActionPerformed
        // TODO add your handling code here:
        this.addValues("5");
    }//GEN-LAST:event_cincActionPerformed

    private void sixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixActionPerformed
        // TODO add your handling code here:
        this.addValues("6");
    }//GEN-LAST:event_sixActionPerformed

    private void seteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seteActionPerformed
        // TODO add your handling code here:
        this.addValues("7");
    }//GEN-LAST:event_seteActionPerformed

    private void huitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_huitActionPerformed
        // TODO add your handling code here:
        this.addValues("8");
    }//GEN-LAST:event_huitActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
        this.addValues(",");
    }//GEN-LAST:event_jButton14ActionPerformed

    private void barraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barraActionPerformed
        // TODO add your handling code here:
        this.addValues("/");
    }//GEN-LAST:event_barraActionPerformed

    private void vezesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vezesActionPerformed
        // TODO add your handling code here:
        this.addValues("*");
    }//GEN-LAST:event_vezesActionPerformed

    private void menosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menosActionPerformed
        // TODO add your handling code here:
        this.addValues("-");
    }//GEN-LAST:event_menosActionPerformed

    private void maisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maisActionPerformed
        // TODO add your handling code here:
        this.addValues("+");
    }//GEN-LAST:event_maisActionPerformed

    private void igualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_igualActionPerformed
        // TODO add your handling code here:
        System.out.println(this.input_operacao.getText());
    }//GEN-LAST:event_igualActionPerformed

    private void calculo() {
        List<Double> valores = new ArrayList<>();
        List<Character> operadores = new ArrayList<>();

        String formula = this.input_operacao.getText();
        
        for(int i=0; i<formula.length(); i++){
            if(this.isOperador(formula.charAt(i))){
                operadores.add(formula.charAt(i));
            }else{
                valores.add(Double.parseDouble(String.valueOf(formula.charAt(i))));
            }
            System.out.println(formula.charAt(i));
        }
    }
    
    private boolean isOperador(char value){
        if(value == '+' || value == '-' || value == '*' || value == '/'){
            return true;
        }
        return false;
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ac;
    private javax.swing.JButton barra;
    private javax.swing.JButton cinc;
    private javax.swing.JButton duix;
    private javax.swing.JButton huit;
    private javax.swing.JButton igual;
    private javax.swing.JTextField input_operacao;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton mais;
    private javax.swing.JButton menos;
    private javax.swing.JButton nuit;
    private javax.swing.JButton off;
    private javax.swing.JButton porc;
    private javax.swing.JButton quatre;
    private javax.swing.JButton sete;
    private javax.swing.JButton six;
    private javax.swing.JButton trois;
    private javax.swing.JButton un;
    private javax.swing.JButton vezes;
    // End of variables declaration//GEN-END:variables
}
