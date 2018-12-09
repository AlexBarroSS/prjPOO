/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.view;

import fatec.poo.control.Conexao;
import fatec.poo.control.DaoCurso;
import fatec.poo.control.DaoInstrutor;
import fatec.poo.control.DaoPessoa;
import fatec.poo.control.DaoTurma;
import fatec.poo.model.Curso;
import fatec.poo.model.Instrutor;
import fatec.poo.model.Pessoa;
import fatec.poo.model.Turma;
import java.util.ArrayList;

/**
 *
 * @author Gorom
 */
public class GUIAlocarInstrutor extends javax.swing.JFrame {

    /**
     * Creates new form GUIAlocarInstrutor
     */
    public GUIAlocarInstrutor() {
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

        cboxCursos = new javax.swing.JComboBox<>();
        cboxTurmas = new javax.swing.JComboBox<>();
        cboxInstrutores = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtfSituacao = new javax.swing.JTextField();
        btnSair = new javax.swing.JButton();
        btnLiberar = new javax.swing.JButton();
        btnAlocar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Alocar Instrutor");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        cboxCursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxCursosActionPerformed(evt);
            }
        });

        cboxTurmas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxTurmasActionPerformed(evt);
            }
        });

        cboxInstrutores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxInstrutoresActionPerformed(evt);
            }
        });

        jLabel1.setText("Curso");

        jLabel2.setText("Turma");

        jLabel3.setText("Instrutor");

        jLabel4.setText("Situação");

        txtfSituacao.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtfSituacao.setEnabled(false);
        txtfSituacao.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txtfSituacaoPropertyChange(evt);
            }
        });

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/exit.png"))); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        btnLiberar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/Eraser.png"))); // NOI18N
        btnLiberar.setText("Liberar");
        btnLiberar.setEnabled(false);
        btnLiberar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLiberarActionPerformed(evt);
            }
        });

        btnAlocar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/add.png"))); // NOI18N
        btnAlocar.setText("Alocar");
        btnAlocar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlocarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(txtfSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cboxCursos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cboxTurmas, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cboxInstrutores, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(67, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAlocar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLiberar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAlocar, btnLiberar, btnSair});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboxCursos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboxTurmas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboxInstrutores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtfSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSair)
                    .addComponent(btnLiberar)
                    .addComponent(btnAlocar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void txtfSituacaoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txtfSituacaoPropertyChange
        if("Liberada".equals(txtfSituacao.getText())){
            btnLiberar.setEnabled(true);
            btnAlocar.setEnabled(false);
        }
        else{
            btnLiberar.setEnabled(false);
            btnAlocar.setEnabled(true);
        }
    }//GEN-LAST:event_txtfSituacaoPropertyChange

    private void cboxCursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxCursosActionPerformed
        // TODO add your handling code here:
        turmas = daoTurma.ListarTurmas( String.valueOf(cboxCursos.getSelectedItem()) );
        
        cboxTurmas.removeAllItems();
        
        for (int i = 0; i < turmas.size(); i++){
            if (turmas.get(i) != null){ 
                cboxTurmas.addItem(turmas.get(i).getSiglaTurma());
            }
        }
        
        if ( cboxTurmas.getItemCount() > 0 ){
            turma = turmas.get(cboxTurmas.getSelectedIndex()); 
            if (turma.getInstrutor() == null){
                btnAlocar.setEnabled(true);
                btnLiberar.setEnabled(false);
                txtfSituacao.setText("Liberada");
            }
            else{
                pessoa = daoPessoa.consultar(turma.getInstrutor().getCPF());
                cboxInstrutores.setSelectedItem(pessoa.getNome());
                
                btnAlocar.setEnabled(false);
                btnLiberar.setEnabled(true);
                txtfSituacao.setText("Alocada");                
            } 
        }
        else{
            txtfSituacao.setText("Sem turmas");
            btnAlocar.setEnabled(false);
            btnLiberar.setEnabled(false);
        }
    }//GEN-LAST:event_cboxCursosActionPerformed

    private void cboxTurmasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxTurmasActionPerformed
        // TODO add your handling code here:  
        turmas = daoTurma.ListarTurmas( String.valueOf(cboxCursos.getSelectedItem()) );
        
        if ( cboxTurmas.getItemCount() > 0 ){
            turma = turmas.get(cboxTurmas.getSelectedIndex()); 
            
            if (turma.getInstrutor() == null){
                
                btnAlocar.setEnabled(true);
                btnLiberar.setEnabled(false);
                txtfSituacao.setText("Liberada");
            }
            else{
                pessoa = daoPessoa.consultar(turma.getInstrutor().getCPF());
                cboxInstrutores.setSelectedItem(pessoa.getNome());
                
                btnAlocar.setEnabled(false);
                btnLiberar.setEnabled(true);
                txtfSituacao.setText("Alocada");  
                
            }      
        }
        
    }//GEN-LAST:event_cboxTurmasActionPerformed

    private void cboxInstrutoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxInstrutoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxInstrutoresActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        conexao = new Conexao("alex", "alex1234");
        conexao.setDriver("oracle.jdbc.driver.OracleDriver");
        conexao.setConnectionString("jdbc:oracle:thin:@localhost:1521:xe");
        
        daoTurma = new DaoTurma(conexao.conectar());
        daoCurso = new DaoCurso(conexao.conectar());
        daoInstrutor = new DaoInstrutor(conexao.conectar());
        daoPessoa = new DaoPessoa(conexao.conectar());
        
        cboxCursos.removeAllItems();
        cboxInstrutores.removeAllItems();
        
        cursos = daoCurso.ListarCursos();
        pssoas = daoPessoa.ListarInstrutor();
        turmas = daoTurma.ListarTurmas("COMP");
        
        for (int i = 0; i < cursos.size() ; i++){
            cboxCursos.addItem(cursos.get(i).getSigla());
        }
        for (int i = 0; i < pssoas.size() ; i++){
            cboxInstrutores.addItem(pssoas.get(i).getNome());
        }

        
    }//GEN-LAST:event_formWindowOpened

    private void btnAlocarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlocarActionPerformed
        // TODO add your handling code here:        
        turma = daoTurma.consultar( String.valueOf( cboxTurmas.getSelectedItem()));
        
        System.out.println(turma.getSiglaTurma());
               
        instrutor = daoInstrutor.consultar( pssoas.get(cboxInstrutores.getSelectedIndex()).getCPF());
        
        turma.addInstrutor(instrutor);
        daoTurma.alocarInstrutor(turma);
        
        txtfSituacao.setText("Alocada");
        
        btnAlocar.setEnabled(false);
        btnLiberar.setEnabled(true);
    }//GEN-LAST:event_btnAlocarActionPerformed

    private void btnLiberarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLiberarActionPerformed
        // TODO add your handling code here:
        turma = daoTurma.consultar( String.valueOf( cboxTurmas.getSelectedItem()));
               
        instrutor = daoInstrutor.consultar( pssoas.get(cboxInstrutores.getSelectedIndex()).getCPF());

        daoTurma.desalocarInstrutor(turma);
        
        txtfSituacao.setText("Liberada");
        
        btnAlocar.setEnabled(true);
        btnLiberar.setEnabled(false);       
    }//GEN-LAST:event_btnLiberarActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorcboxInstrutoresg/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUIAlocarInstrutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIAlocarInstrutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIAlocarInstrutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIAlocarInstrutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIAlocarInstrutor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlocar;
    private javax.swing.JButton btnLiberar;
    private javax.swing.JButton btnSair;
    private javax.swing.JComboBox<String> cboxCursos;
    private javax.swing.JComboBox<String> cboxInstrutores;
    private javax.swing.JComboBox<String> cboxTurmas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtfSituacao;
    // End of variables declaration//GEN-END:variables
    private Conexao conexao;
    private DaoCurso daoCurso;
    private DaoInstrutor daoInstrutor;
    private DaoTurma daoTurma;
    private DaoPessoa daoPessoa;
    private Pessoa pessoa;
    private Instrutor instrutor;
    private Curso curso;
    private Turma turma;
    ArrayList<Curso> cursos;
    ArrayList<Pessoa> pssoas;
    ArrayList<Turma> turmas;
}
