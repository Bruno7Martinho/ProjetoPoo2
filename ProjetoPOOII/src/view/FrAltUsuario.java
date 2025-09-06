/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Model.Usuario;
import Utils.Util;
import controler.UsuarioControler;
import java.awt.Color;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author aluno.saolucas
 */
public class FrAltUsuario extends javax.swing.JDialog {

    private int pkUsuario;

    /**
     * Creates new form FrAltUsuario
     */
    public FrAltUsuario(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);

    }

    public void setPkUsuario(int pkUsuario) {
        this.pkUsuario = pkUsuario;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        edtEmailAlt = new javax.swing.JTextField();
        edtDataNascAlt = new javax.swing.JFormattedTextField();
        csCasAlt = new javax.swing.JCheckBox();
        btnCancelarCad = new javax.swing.JButton();
        btnSalvarCad = new javax.swing.JButton();
        edtSenhaAlt = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        lblConfirmSenha = new javax.swing.JLabel();
        edtConfirmSenhaAlt = new javax.swing.JPasswordField();
        lblCadastro = new javax.swing.JLabel();
        lblNomeCad = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblSenhaCad = new javax.swing.JLabel();
        lblDataNascCAD = new javax.swing.JLabel();
        edtNomeAlt = new javax.swing.JTextField();
        edtCodigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnAlterSenha = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Alteração de Usuário");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(edtEmailAlt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 364, -1));

        edtDataNascAlt.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.MEDIUM))));
        edtDataNascAlt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtDataNascAltActionPerformed(evt);
            }
        });
        jPanel1.add(edtDataNascAlt, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 325, 196, -1));

        csCasAlt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        csCasAlt.setText("ATIVO");
        csCasAlt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                csCasAltActionPerformed(evt);
            }
        });
        jPanel1.add(csCasAlt, new org.netbeans.lib.awtextra.AbsoluteConstraints(495, 314, -1, -1));

        btnCancelarCad.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnCancelarCad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cadastro.png"))); // NOI18N
        btnCancelarCad.setText("CANCELAR");
        btnCancelarCad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarCadMouseClicked(evt);
            }
        });
        jPanel1.add(btnCancelarCad, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 473, -1, -1));

        btnSalvarCad.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSalvarCad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.png"))); // NOI18N
        btnSalvarCad.setText("SALVAR");
        btnSalvarCad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalvarCadMouseClicked(evt);
            }
        });
        jPanel1.add(btnSalvarCad, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 473, -1, -1));

        edtSenhaAlt.setEditable(false);
        edtSenhaAlt.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(edtSenhaAlt, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 381, 354, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/8665306_circle_user_icon.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 21, -1, -1));

        lblConfirmSenha.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblConfirmSenha.setText("CONFIRMAR SENHA");
        jPanel1.add(lblConfirmSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 407, -1, -1));

        edtConfirmSenhaAlt.setEditable(false);
        edtConfirmSenhaAlt.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(edtConfirmSenhaAlt, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 435, 354, -1));

        lblCadastro.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblCadastro.setText("ALTERAÇÃO DE USUÁRIO");
        jPanel1.add(lblCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 41, -1, -1));

        lblNomeCad.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblNomeCad.setText("NOME:");
        jPanel1.add(lblNomeCad, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 167, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("E-MAIL:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 226, -1, -1));

        lblSenhaCad.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblSenhaCad.setText("SENHA:");
        jPanel1.add(lblSenhaCad, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 351, -1, -1));

        lblDataNascCAD.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblDataNascCAD.setText("DATA DE NASCIMENTO:");
        jPanel1.add(lblDataNascCAD, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 292, -1, -1));
        jPanel1.add(edtNomeAlt, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 195, 364, -1));

        edtCodigo.setEditable(false);
        jPanel1.add(edtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 152, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("CÓDIGO");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 108, -1, -1));

        btnAlterSenha.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAlterSenha.setText("ALTERAR SENHA");
        btnAlterSenha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAlterSenhaMouseClicked(evt);
            }
        });
        jPanel1.add(btnAlterSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 379, -1, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void edtDataNascAltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtDataNascAltActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtDataNascAltActionPerformed

    private void csCasAltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_csCasAltActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_csCasAltActionPerformed

    private void btnCancelarCadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarCadMouseClicked
        this.dispose();
    }//GEN-LAST:event_btnCancelarCadMouseClicked

    private void btnSalvarCadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalvarCadMouseClicked
        gravar();

    }//GEN-LAST:event_btnSalvarCadMouseClicked

    private void btnAlterSenhaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAlterSenhaMouseClicked
        if (edtSenhaAlt.isEditable()) {
            edtSenhaAlt.setEditable(false);
            edtConfirmSenhaAlt.setEditable(false);
            edtSenhaAlt.setBackground(Color.GRAY);
            edtConfirmSenhaAlt.setBackground(Color.GRAY);

            edtSenhaAlt.setText("");
            edtConfirmSenhaAlt.setText("");

            btnAlterSenha.setText("Alterar Senha");
        } else {
            edtSenhaAlt.setEditable(true);
            edtConfirmSenhaAlt.setEditable(true);
            edtSenhaAlt.setBackground(Color.WHITE);
            edtConfirmSenhaAlt.setBackground(Color.WHITE);
            edtSenhaAlt.setText("");
            edtConfirmSenhaAlt.setText("");

            btnAlterSenha.setText("Cancelar");

        }
    }//GEN-LAST:event_btnAlterSenhaMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setIconImage(Util.getIcone());

        //carregar os dados do usuario
        UsuarioControler controler = new UsuarioControler();
        //consultar os usuarios com o codigo igual ao que recebi
        List<Usuario> lista = controler.consultar(0, String.valueOf(pkUsuario));

        Usuario usu = lista.get(0);

        //preencher os campos como a variável usu
        edtCodigo.setText(String.valueOf(usu.getPkUsuario()));
        edtNomeAlt.setText(usu.getNome());
        edtEmailAlt.setText(usu.getEmail());
        edtDataNascAlt.setText(Util.converterDateToString(usu.getDataNascimento()));
        csCasAlt.setSelected(usu.isAtivo());


    }//GEN-LAST:event_formWindowOpened

    private void gravar() {

        //validar os campos
        if (!verificarCampos()) {
            return;
        }

        //ler os campos e guardar um objeto
        Usuario usu = new Usuario();
        usu.setPkUsuario(Integer.parseInt(edtCodigo.getText()));
        usu.setNome(edtNomeAlt.getText());
        usu.setEmail(edtEmailAlt.getText());
        if(edtSenhaAlt.isEditable()){
           usu.setSenha(Util.calcularHash(new String(edtSenhaAlt.getPassword()))); 
        }
        usu.setDataNascimento(Util.converterStringToDate(edtDataNascAlt.getText()));
        usu.setAtivo(csCasAlt.isSelected());

        //enviar para o banco de dados
        UsuarioControler controler = new UsuarioControler();
        if (controler.alterar(usu)) {
            JOptionPane.showMessageDialog(null, "Usuário Inserido");
            this.dispose();
        }

    }

    private boolean verificarCampos() {

        if (edtNomeAlt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Campo E-mail em branco!!!");
            return false;
        }
        if (edtEmailAlt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Campo Nome em branco!!!");
            return false;
        }
        if (edtSenhaAlt.isEditable()) {
            if (new String(edtSenhaAlt.getPassword()).isEmpty()) {
                JOptionPane.showMessageDialog(null, "Campo Senha em branco!!!");

                return false;
            }
        }
        //^ - inicio de linha
        //$ - final de linha
        //[] -  conjunto de caracteres
        //+ - quantidade de vezes que o conjunto apareceer
        //+ - 1 ou mais
        //* - 0 ou mais
        //{5} - 5 vezes
        //{2} - 2 vezes 

        if (!edtNomeAlt.getText().matches("^[\\p{L} ]+$")) {
            JOptionPane.showMessageDialog(null, "O campo Nome possui formato inválido !!!");
            return false;
        }
        if (!edtEmailAlt.getText().matches("^[a-z0-9_.]+@[a-z0-9_.]+.[a-z]+$")) {
            JOptionPane.showMessageDialog(null, "O campo E-mail possui formato inválido  !!!");
            return false;
        }

        if (!edtDataNascAlt.getText().matches("^[0-3]{1}[0-9]{1}/[0-1]{1}[0-9]{1}/[12]{1}[90]{1}[0-9]{1}[0-9]{1}$")) {
            JOptionPane.showMessageDialog(null, "O campo Data de Nascimento possui formato inválido  !!!");
            return false;
        }
        if (edtSenhaAlt.isEditable()) {
            if (new String(edtSenhaAlt.getPassword()).length() < 6) {
                JOptionPane.showMessageDialog(null, "A senha deve ser maior que 6 dígitos");
                return false;
            }

            String senha = new String(edtSenhaAlt.getPassword());
            String confirmaSenha = new String(edtConfirmSenhaAlt.getPassword());
            if (!senha.equals(confirmaSenha)) {
                JOptionPane.showMessageDialog(null, " As senhas devem ser iguais!!!");
                return false;
            }
        }
        return true;
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
            java.util.logging.Logger.getLogger(FrAltUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrAltUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrAltUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrAltUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrAltUsuario dialog = new FrAltUsuario(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnAlterSenha;
    private javax.swing.JButton btnCancelarCad;
    private javax.swing.JButton btnSalvarCad;
    private javax.swing.JCheckBox csCasAlt;
    private javax.swing.JTextField edtCodigo;
    private javax.swing.JPasswordField edtConfirmSenhaAlt;
    private javax.swing.JFormattedTextField edtDataNascAlt;
    private javax.swing.JTextField edtEmailAlt;
    private javax.swing.JTextField edtNomeAlt;
    private javax.swing.JPasswordField edtSenhaAlt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCadastro;
    private javax.swing.JLabel lblConfirmSenha;
    private javax.swing.JLabel lblDataNascCAD;
    private javax.swing.JLabel lblNomeCad;
    private javax.swing.JLabel lblSenhaCad;
    // End of variables declaration//GEN-END:variables
}
