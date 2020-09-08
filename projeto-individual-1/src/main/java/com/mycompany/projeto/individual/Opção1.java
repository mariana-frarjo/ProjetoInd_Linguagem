
package com.mycompany.projeto.individual;

import java.util.Random;

public class Opção1 extends javax.swing.JFrame {
    
Integer contador = 0;
Integer cpuMax = 0;
Integer cpuMin = 100;
Double cpuMed = 0.0;

Integer contador2 = 0;
Integer discoMax = 0;
Integer discoMin = 100;
Double discoMed = 0.0;

Integer contador3 = 0;
Integer memoriaMax = 0;
Integer memoriaMin = 100;
Double memoriaMed = 0.0;
    
    public Opção1() {
        initComponents();
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        prgCPU = new javax.swing.JProgressBar();
        btn1 = new javax.swing.JButton();
        lbl1 = new javax.swing.JLabel();
        lblAtuC = new javax.swing.JLabel();
        lblMaxC = new javax.swing.JLabel();
        lblMinC = new javax.swing.JLabel();
        lblMedC = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        prgDisco = new javax.swing.JProgressBar();
        prgMemoria = new javax.swing.JProgressBar();
        lb3 = new javax.swing.JLabel();
        lblMaxD = new javax.swing.JLabel();
        lblMinD = new javax.swing.JLabel();
        lblMedD = new javax.swing.JLabel();
        lblAtuD = new javax.swing.JLabel();
        lblMaxM = new javax.swing.JLabel();
        lblMinM = new javax.swing.JLabel();
        lblMedM = new javax.swing.JLabel();
        lblAtuM = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblDadoAtuC = new javax.swing.JLabel();
        lblDadoMedC = new javax.swing.JLabel();
        lblDadoMaxC = new javax.swing.JLabel();
        lblDadoMinC = new javax.swing.JLabel();
        lblDadoMedD = new javax.swing.JLabel();
        lblDadoMaxD = new javax.swing.JLabel();
        lblDadoMinD = new javax.swing.JLabel();
        lblDadoAtuD = new javax.swing.JLabel();
        lblDadoMedM = new javax.swing.JLabel();
        lblDadoMaxM = new javax.swing.JLabel();
        lblDadoMinM = new javax.swing.JLabel();
        lblDadoAtuM = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn1.setText("Fazer leitura dos dados");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        lbl1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl1.setText("CPU");

        lblAtuC.setText("Leitura atual");

        lblMaxC.setText("Máximo");

        lblMinC.setText("Mínimo");

        lblMedC.setText("Média");

        lbl2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl2.setText("Disco");

        lb3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lb3.setText("Memória");

        lblMaxD.setText("Máximo");

        lblMinD.setText("Mínimo");

        lblMedD.setText("Média");

        lblAtuD.setText("Leitura atual");

        lblMaxM.setText("Máximo");

        lblMinM.setText("Mínimo");

        lblMedM.setText("Média");

        lblAtuM.setText("Leitura atual");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabel1.setText("Análise de dados de processamento");

        lblDadoAtuC.setText("%");

        lblDadoMedC.setText("%");

        lblDadoMaxC.setText("%");

        lblDadoMinC.setText("%");

        lblDadoMedD.setText("%");

        lblDadoMaxD.setText("%");

        lblDadoMinD.setText("%");

        lblDadoAtuD.setText("%");

        lblDadoMedM.setText("%");

        lblDadoMaxM.setText("%");

        lblDadoMinM.setText("%");

        lblDadoAtuM.setText("%");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl2)
                    .addComponent(prgDisco, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl1)
                    .addComponent(prgCPU, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb3)
                    .addComponent(prgMemoria, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMedC)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAtuC)
                            .addComponent(lblMaxC)
                            .addComponent(lblMinC))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDadoMinC)
                            .addComponent(lblDadoMedC)
                            .addComponent(lblDadoAtuC)
                            .addComponent(lblDadoMaxC)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMedD)
                            .addComponent(lblMinD)
                            .addComponent(lblMaxD)
                            .addComponent(lblAtuD))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDadoMinD)
                            .addComponent(lblDadoMedD)
                            .addComponent(lblDadoAtuD)
                            .addComponent(lblDadoMaxD)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMedM)
                            .addComponent(lblMinM)
                            .addComponent(lblMaxM)
                            .addComponent(lblAtuM))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDadoMinM)
                            .addComponent(lblDadoMedM)
                            .addComponent(lblDadoAtuM)
                            .addComponent(lblDadoMaxM))))
                .addGap(0, 95, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btn1)
                        .addGap(447, 447, 447))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(287, 287, 287))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(lbl1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(prgCPU, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAtuC)
                    .addComponent(lblDadoAtuC))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMaxC)
                    .addComponent(lblDadoMaxC))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMinC)
                    .addComponent(lblDadoMinC))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMedC)
                    .addComponent(lblDadoMedC))
                .addGap(35, 35, 35)
                .addComponent(lbl2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(prgDisco, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblAtuD)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMaxD)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMinD)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMedD))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblDadoAtuD)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDadoMaxD)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDadoMinD)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDadoMedD)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(lb3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(prgMemoria, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblAtuM)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMaxM)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMinM)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMedM))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblDadoAtuM)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDadoMaxM)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDadoMinM)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDadoMedM)))
                .addGap(18, 18, 18)
                .addComponent(btn1)
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
       
        //CPU
        prgCPU.setStringPainted(true);
        Random cpuDados = new Random();
        Integer cpuDadosInt = cpuDados.nextInt(101);
        String cpuDadosTxt = cpuDadosInt.toString();
        lblDadoAtuC.setText(cpuDadosTxt);
        prgCPU.setValue(cpuDadosInt);
        
         if (cpuDadosInt > cpuMax) {
                
             cpuMax = cpuDadosInt;
             String cpuMaxResult = cpuDadosInt.toString();
             lblDadoMaxC.setText(cpuMaxResult);            
        }
         
         if (cpuDadosInt < cpuMin) {
             
             cpuMin = cpuDadosInt;
             String cpuMinResult = cpuDadosInt.toString();
             lblDadoMinC.setText(cpuMinResult);        
        }
         
         contador++;
         
         cpuMed += cpuDadosInt;
         Double cpuMedDiv = cpuMed / contador; 
         String cpuMedResult = cpuMedDiv.toString();
         lblDadoMedC.setText(String.format("%.2f", cpuMedDiv));
        
         
         //Disco
        prgDisco.setStringPainted(true);
        Random discoDados = new Random();
        Integer discoDadosInt = discoDados.nextInt(101);
        String discoDadosTxt = discoDadosInt.toString();
        lblDadoAtuD.setText(discoDadosTxt);
        prgDisco.setValue(discoDadosInt);
        
         if (discoDadosInt > discoMax) {
                
             discoMax = discoDadosInt;
             String discoMaxResult = discoDadosInt.toString();
             lblDadoMaxD.setText(discoMaxResult);            
        }
         
         if (discoDadosInt < discoMin) {
             
             discoMin = discoDadosInt;
             String discoMinResult = discoDadosInt.toString();
             lblDadoMinD.setText(discoMinResult);        
        }
         
         contador2++;
         
         discoMed += discoDadosInt;
         Double discoMedDiv = discoMed / contador2; 
         String discoMedResult = discoMedDiv.toString();
         lblDadoMedD.setText(String.format("%.2f", discoMedDiv));
         
         //Memória
        prgMemoria.setStringPainted(true);
        Random memoriaDados = new Random();
        Integer memoriaDadosInt = memoriaDados.nextInt(101);
        String memoriaDadosTxt = memoriaDadosInt.toString();
        lblDadoAtuM.setText(memoriaDadosTxt);
        prgMemoria.setValue(memoriaDadosInt);
        
         if (memoriaDadosInt > memoriaMax) {
                
             memoriaMax = memoriaDadosInt;
             String memoriaMaxResult = memoriaDadosInt.toString();
             lblDadoMaxM.setText(memoriaMaxResult);            
        }
         
         if (memoriaDadosInt < memoriaMin) {
             
             memoriaMin = memoriaDadosInt;
             String memoriaMinResult = memoriaDadosInt.toString();
             lblDadoMinM.setText(memoriaMinResult);        
        }
         
         contador3++;
         
         memoriaMed += memoriaDadosInt;
         Double memoriaMedDiv = memoriaMed / contador3; 
         String memoriaMedResult = memoriaMedDiv.toString();
         lblDadoMedM.setText(String.format("%.2f", memoriaMedDiv));
         
         
    }//GEN-LAST:event_btn1ActionPerformed
   
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
            java.util.logging.Logger.getLogger(Opção1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Opção1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Opção1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Opção1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Opção1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lb3;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lblAtuC;
    private javax.swing.JLabel lblAtuD;
    private javax.swing.JLabel lblAtuM;
    private javax.swing.JLabel lblDadoAtuC;
    private javax.swing.JLabel lblDadoAtuD;
    private javax.swing.JLabel lblDadoAtuM;
    private javax.swing.JLabel lblDadoMaxC;
    private javax.swing.JLabel lblDadoMaxD;
    private javax.swing.JLabel lblDadoMaxM;
    private javax.swing.JLabel lblDadoMedC;
    private javax.swing.JLabel lblDadoMedD;
    private javax.swing.JLabel lblDadoMedM;
    private javax.swing.JLabel lblDadoMinC;
    private javax.swing.JLabel lblDadoMinD;
    private javax.swing.JLabel lblDadoMinM;
    private javax.swing.JLabel lblMaxC;
    private javax.swing.JLabel lblMaxD;
    private javax.swing.JLabel lblMaxM;
    private javax.swing.JLabel lblMedC;
    private javax.swing.JLabel lblMedD;
    private javax.swing.JLabel lblMedM;
    private javax.swing.JLabel lblMinC;
    private javax.swing.JLabel lblMinD;
    private javax.swing.JLabel lblMinM;
    private javax.swing.JProgressBar prgCPU;
    private javax.swing.JProgressBar prgDisco;
    private javax.swing.JProgressBar prgMemoria;
    // End of variables declaration//GEN-END:variables
}
