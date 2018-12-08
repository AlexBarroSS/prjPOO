/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.view;

import fatec.poo.control.Conexao;
import fatec.poo.control.DaoCurso;
import fatec.poo.model.Curso;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Arex de Barros
 */
public class GUICurso extends javax.swing.JFrame {

    /**
     * Creates new form GUIcurso
     */
    public GUICurso() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnConsultar = new javax.swing.JButton();
        btnInserir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        labSigCur = new javax.swing.JLabel();
        labNomCur = new javax.swing.JLabel();
        labCarHor = new javax.swing.JLabel();
        labValCur = new javax.swing.JLabel();
        labProgCur = new javax.swing.JLabel();
        labDatVig = new javax.swing.JLabel();
        labValIns = new javax.swing.JLabel();
        txtfSigCur = new javax.swing.JTextField();
        txtfNomCur = new javax.swing.JTextField();
        txtfCarHor = new javax.swing.JTextField();
        txtfValCur = new javax.swing.JTextField();
        txtfProgCur = new javax.swing.JTextField();
        txtfValIns = new javax.swing.JTextField();
        ftfDatVig = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastrar Curso");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        btnConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/pesq.png"))); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnInserir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/add.png"))); // NOI18N
        btnInserir.setText("Inserir");
        btnInserir.setEnabled(false);
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
            }
        });

        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/Alterar.png"))); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.setEnabled(false);
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/Eraser.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.setEnabled(false);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/exit.png"))); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        labSigCur.setText("Sigla Curso");

        labNomCur.setText("Nome Curso");

        labCarHor.setText("Carga horária");

        labValCur.setText("Valor Curso");

        labProgCur.setText("Programa do Curso");

        labDatVig.setText("Data de Vigência");

        labValIns.setText("Valor hora Instrutor");

        txtfNomCur.setEnabled(false);

        txtfCarHor.setEnabled(false);

        txtfValCur.setEnabled(false);

        txtfProgCur.setEnabled(false);
        txtfProgCur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfProgCurActionPerformed(evt);
            }
        });

        txtfValIns.setEnabled(false);

        try {
            ftfDatVig.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftfDatVig.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labSigCur)
                    .addComponent(btnConsultar)
                    .addComponent(labNomCur)
                    .addComponent(labCarHor)
                    .addComponent(labValCur)
                    .addComponent(labProgCur))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtfProgCur)
                            .addComponent(txtfValCur)
                            .addComponent(txtfCarHor)
                            .addComponent(txtfNomCur)
                            .addComponent(txtfSigCur, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(btnInserir)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(btnAlterar)
                        .addGap(18, 18, 18)
                        .addComponent(btnExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addComponent(btnSair)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labDatVig)
                            .addComponent(labValIns))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ftfDatVig, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                            .addComponent(txtfValIns))
                        .addGap(29, 29, 29))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labSigCur)
                            .addComponent(txtfSigCur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labNomCur)
                            .addComponent(txtfNomCur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labDatVig)
                            .addComponent(ftfDatVig, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labValIns)
                            .addComponent(txtfValIns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labCarHor)
                    .addComponent(txtfCarHor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labValCur)
                    .addComponent(txtfValCur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labProgCur)
                    .addComponent(txtfProgCur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConsultar)
                    .addComponent(btnInserir)
                    .addComponent(btnAlterar)
                    .addComponent(btnExcluir)
                    .addComponent(btnSair))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
                  
            curso = new Curso(txtfSigCur.getText(), txtfNomCur.getText());
            curso.setCargaHoraria( Integer.parseInt(txtfCarHor.getText()));
            curso.setValor( Double.parseDouble(txtfValCur.getText()));
            curso.setPrograma(txtfProgCur.getText());
            curso.setDataVigencia( ftfDatVig.getText().replaceAll("[{//}]", ""));
            curso.setValorHoraInstrutor(Double.parseDouble(txtfValIns.getText()));
            
            daoCurso.inserir(curso);
            
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInserirActionPerformed

    private void txtfProgCurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfProgCurActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfProgCurActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        curso = null;
        
        curso = daoCurso.consultar(txtfSigCur.getText());
        
        if (curso == null){
            btnConsultar.setEnabled(false);
            btnInserir.setEnabled(true);
            
            txtfSigCur.setEnabled(false);
                      
            txtfNomCur.requestFocus();
       
        }
        else{
            btnConsultar.setEnabled(false);
            btnAlterar.setEnabled(true);
            btnExcluir.setEnabled(true);
            
            txtfSigCur.setEnabled(false);
            
            txtfSigCur.setText(curso.getSigla());
            
            txtfNomCur.setText( curso.getNome());
            txtfCarHor.setText( String.valueOf(curso.getCargaHoraria()) );
            txtfValCur.setText( String.valueOf(curso.getValor()));
            txtfProgCur.setText(curso.getPrograma());
            
            ftfDatVig.setText(curso.getDataVigencia());
            txtfValIns.setText(String.valueOf(curso.getValorHoraInstrutor()));
            
            txtfNomCur.requestFocus();
        }

        ftfDatVig.setEnabled(true);
        txtfValIns.setEnabled(true);
        txtfNomCur.setEnabled(true);
        txtfCarHor.setEnabled(true);
        txtfValCur.setEnabled(true);
        txtfProgCur.setEnabled(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        conexao = new Conexao("alex","alex1234");
        conexao.setDriver("oracle.jdbc.driver.OracleDriver");
        conexao.setConnectionString("jdbc:oracle:thin:@localhost:1521:xe");
        daoCurso = new DaoCurso(conexao.conectar());
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        // TODO add your handling code here:
        if (JOptionPane.showConfirmDialog(null, "Confirma Alteração?")== 0){
            curso = new Curso(txtfSigCur.getText(), txtfNomCur.getText());
            curso.setCargaHoraria( Integer.parseInt(txtfCarHor.getText()));
            curso.setValor( Double.parseDouble(txtfValCur.getText()));
            curso.setPrograma(txtfProgCur.getText());
            curso.setDataVigencia( ftfDatVig.getText().replaceAll("[{//}]", ""));
            curso.setValorHoraInstrutor(Double.parseDouble(txtfValIns.getText()));

            daoCurso.alterar(curso);
            
            txtfNomCur.setText("");
            txtfCarHor.setText("");
            txtfValCur.setText("");
            txtfProgCur.setText("");
            txtfValIns.setText("");
            ftfDatVig.setText("");
            
            txtfSigCur.setEnabled(true);
        }

    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        // TODO add your handling code here:
        if (JOptionPane.showConfirmDialog(null, "Confirma Alteração?")== 0){
            daoCurso.excluir(curso);
            
            txtfSigCur.setText("");
            txtfNomCur.setText("");
            txtfCarHor.setText("");
            txtfValCur.setText("");
            txtfProgCur.setText("");
            txtfValIns.setText("");
            ftfDatVig.setText("");
        }
    }//GEN-LAST:event_btnExcluirActionPerformed
       
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
            java.util.logging.Logger.getLogger(GUICurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUICurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUICurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUICurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUICurso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnInserir;
    private javax.swing.JButton btnSair;
    private javax.swing.JFormattedTextField ftfDatVig;
    private javax.swing.JLabel labCarHor;
    private javax.swing.JLabel labDatVig;
    private javax.swing.JLabel labNomCur;
    private javax.swing.JLabel labProgCur;
    private javax.swing.JLabel labSigCur;
    private javax.swing.JLabel labValCur;
    private javax.swing.JLabel labValIns;
    private javax.swing.JTextField txtfCarHor;
    private javax.swing.JTextField txtfNomCur;
    private javax.swing.JTextField txtfProgCur;
    private javax.swing.JTextField txtfSigCur;
    private javax.swing.JTextField txtfValCur;
    private javax.swing.JTextField txtfValIns;
    // End of variables declaration//GEN-END:variables
    private Conexao conexao;
    private DaoCurso daoCurso;
    private Curso curso;
}
