/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import static java.lang.System.exit;
import modelo.User;

/**
 *
 * @author pc-03
 */
public class TelaInicial extends javax.swing.JFrame {

    
    
    public TelaInicial() {
        super("App gerenciar banco");
        initComponents();
        setResizable(false);
        setLocationRelativeTo(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuItemCriaConexao = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        menuItemConectar = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuItemCatalogo = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        menuItemSair = new javax.swing.JMenuItem();

        jMenu3.setText("jMenu3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menuItemCriaConexao.setText("Conexao");

        jMenuItem1.setText("Criar Usuario");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menuItemCriaConexao.add(jMenuItem1);

        menuItemConectar.setText("Conectar");
        menuItemConectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemConectarActionPerformed(evt);
            }
        });
        menuItemCriaConexao.add(menuItemConectar);

        jMenuBar1.add(menuItemCriaConexao);

        jMenu2.setText("Propriedades");

        menuItemCatalogo.setText("InfCatalogo");
        menuItemCatalogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCatalogoActionPerformed(evt);
            }
        });
        jMenu2.add(menuItemCatalogo);

        jMenuBar1.add(jMenu2);

        jMenu4.setText("Sair");
        jMenu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu4ActionPerformed(evt);
            }
        });

        menuItemSair.setText("Sair");
        menuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemSairActionPerformed(evt);
            }
        });
        jMenu4.add(menuItemSair);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 386, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu4ActionPerformed
     dispose();
    }//GEN-LAST:event_jMenu4ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
           
        TelaCriaUser conexao= new TelaCriaUser();
        conexao.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void menuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSairActionPerformed
        exit(0);
    }//GEN-LAST:event_menuItemSairActionPerformed

    private void menuItemConectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemConectarActionPerformed
       TelaConexao conectar = new TelaConexao();
        conectar.setVisible(true);
    }//GEN-LAST:event_menuItemConectarActionPerformed

    private void menuItemCatalogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCatalogoActionPerformed
       // informacao = new TelaInformation_Schema();
      // informacao.setVisible(true);
    }//GEN-LAST:event_menuItemCatalogoActionPerformed

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
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem menuItemCatalogo;
    private javax.swing.JMenuItem menuItemConectar;
    private javax.swing.JMenu menuItemCriaConexao;
    private javax.swing.JMenuItem menuItemSair;
    // End of variables declaration//GEN-END:variables
}
