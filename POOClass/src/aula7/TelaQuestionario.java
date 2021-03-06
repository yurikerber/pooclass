/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package aula7;

import ferramentas.Globais;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import modelos.Questionario;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class TelaQuestionario extends javax.swing.JFrame {

    static Questionario vetorQuestoes[] = new Questionario[3];
    static int indice = -1;
    static char r;
    static int acertos;
    static int erros;

    /**
     * Creates new form TelaQuestionário
     */
    public TelaQuestionario() {
        initComponents();

        Questionario objQuestionario = new Questionario();

        objQuestionario.setPergunta("De que cor é o céu?");
        objQuestionario.setRespostaA("Azul");
        objQuestionario.setRespostaB("Amarelo");
        objQuestionario.setRespostaC("Vermelho");
        objQuestionario.setRespostaCorreta('1');

        vetorQuestoes[0] = objQuestionario;

        Questionario objQuestionario2 = new Questionario();

        objQuestionario2.setPergunta("Raiz quadrada de 64?");
        objQuestionario2.setRespostaA("12");
        objQuestionario2.setRespostaB("6");
        objQuestionario2.setRespostaC("8");
        objQuestionario2.setRespostaCorreta('3');

        vetorQuestoes[1] = objQuestionario2;

        Questionario objQuestionario3 = new Questionario();

        objQuestionario3.setPergunta("Qual é o sentido da vida?");
        objQuestionario3.setRespostaA("Trás");
        objQuestionario3.setRespostaB("42");
        objQuestionario3.setRespostaC("Arriba");
        objQuestionario3.setRespostaCorreta('2');

        vetorQuestoes[2] = objQuestionario3;

        fazerPergunta();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lblPergunta = new javax.swing.JLabel();
        btnAvancar = new javax.swing.JButton();
        rdBtnA = new javax.swing.JRadioButton();
        rdBtnB = new javax.swing.JRadioButton();
        rdBtnC = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Questionário", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Fira Code", 1, 11))); // NOI18N

        lblPergunta.setFont(new java.awt.Font("Fira Code", 0, 11)); // NOI18N
        lblPergunta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPergunta.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pergunta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Fira Code", 1, 11))); // NOI18N

        btnAvancar.setFont(new java.awt.Font("Fira Code", 1, 11)); // NOI18N
        btnAvancar.setText("Avançar");
        btnAvancar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvancarActionPerformed(evt);
            }
        });

        btnGroup.add(rdBtnA);
        rdBtnA.setFont(new java.awt.Font("Fira Code", 0, 11)); // NOI18N
        rdBtnA.setText("A)");

        btnGroup.add(rdBtnB);
        rdBtnB.setFont(new java.awt.Font("Fira Code", 0, 11)); // NOI18N
        rdBtnB.setText("B)");

        btnGroup.add(rdBtnC);
        rdBtnC.setFont(new java.awt.Font("Fira Code", 0, 11)); // NOI18N
        rdBtnC.setText("C)");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblPergunta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 259, Short.MAX_VALUE)
                                .addComponent(btnAvancar)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rdBtnA)
                            .addComponent(rdBtnB)
                            .addComponent(rdBtnC))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPergunta, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(rdBtnA)
                .addGap(22, 22, 22)
                .addComponent(rdBtnB)
                .addGap(22, 22, 22)
                .addComponent(rdBtnC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(btnAvancar)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAvancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvancarActionPerformed

        if (btnGroup.getSelection() == null) {
            Globais.exibirMensagem("Marque uma alternativa!");
        } else {
            fazerPergunta();
            validarResposta();

            if (indice == vetorQuestoes.length) {
                double porcentagem = (((double) acertos / vetorQuestoes.length) * 100);
                DecimalFormat formatarDecimal = new DecimalFormat("0.00");
                Globais.exibirMensagem("Acertos: " + acertos + "\nErros: " + erros + "\nPorcentagem de acerto: " + formatarDecimal.format(porcentagem) + " %");
                System.exit(0);
            }
            btnGroup.clearSelection();
        }

    }//GEN-LAST:event_btnAvancarActionPerformed

    private void fazerPergunta() {
        indice++;
        if (indice < vetorQuestoes.length) {
            lblPergunta.setText(vetorQuestoes[indice].getPergunta());
            rdBtnA.setText(vetorQuestoes[indice].getRespostaA());
            rdBtnB.setText(vetorQuestoes[indice].getRespostaB());
            rdBtnC.setText(vetorQuestoes[indice].getRespostaC());
        }
    }

    private void validarResposta() {
        if (indice <= vetorQuestoes.length) {
            if (rdBtnA.isSelected()) {
                r = '1';
            } else if (rdBtnB.isSelected()) {
                r = '2';
            } else if (rdBtnC.isSelected()) {
                r = '3';
            }

            if (r == vetorQuestoes[indice - 1].getRespostaCorreta()) {
                acertos++;
                System.out.println(acertos);
            } else {
                erros++;
            }
        }

    }

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
            java.util.logging.Logger.getLogger(TelaQuestionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaQuestionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaQuestionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaQuestionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaQuestionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAvancar;
    private javax.swing.ButtonGroup btnGroup;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblPergunta;
    private javax.swing.JRadioButton rdBtnA;
    private javax.swing.JRadioButton rdBtnB;
    private javax.swing.JRadioButton rdBtnC;
    // End of variables declaration//GEN-END:variables
}
