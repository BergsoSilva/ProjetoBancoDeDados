/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import dao.ConsultasDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.D;
import modelo.ProcedureTableModel;
import modelo.User;

/**
 *
 * @author LAB-07
 */
public class Consultas extends javax.swing.JFrame {
   User user ;
   
    private List<D> listaProcedure = new ArrayList<>();
    private  D d =  new D();
  
    public Consultas()  {
        initComponents();
       // consultar();
        //carregarTabela ();
      
    }
    
     private void carregarTabela () throws ClassNotFoundException, SQLException {
         consultar();
        ProcedureTableModel modelo = new ProcedureTableModel(listaProcedure);
        jTableProcedures.setModel(modelo);
    }
    
    // seta titulos nas tabelas
    private void  consultar() throws ClassNotFoundException, SQLException{
          ConsultasDAO dao = new ConsultasDAO();
          
          pegarParametro();
          
         this.listaProcedure=dao.consultaD(this.d); 
          
         //System.out.println( );
          
    }
    
     private void pegarParametro () {
        this.d.setPar(jTextFieldTabela.getText());
    }
     
     private void limpartabela (){
         D d = new D();
         d.setLado1("");
         d.setLadon("");
         
         this.listaProcedure.add(d);
     }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        consultE = new javax.swing.JLabel();
        jTextFieldTabela = new javax.swing.JTextField();
        consultaF = new javax.swing.JLabel();
        jTextFieldTabela1 = new javax.swing.JTextField();
        JTextFieldTabela2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProcedures = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButtonNovaConsulta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jDesktopPane1.setBackground(new java.awt.Color(240, 240, 240));

        jInternalFrame1.setVisible(true);

        consultE.setText("Mostrar tabelas Relacionadas");
        consultE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                consultEMouseClicked(evt);
            }
        });

        jTextFieldTabela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTabelaActionPerformed(evt);
            }
        });

        consultaF.setText("Mostrar se as duas tabelas tem relacionamento");
        consultaF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                consultaFMouseClicked(evt);
            }
        });

        jTextFieldTabela1.setText(" ");
        jTextFieldTabela1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTabela1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(consultE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldTabela, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(consultaF)
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jTextFieldTabela1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JTextFieldTabela2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(consultE)
                    .addComponent(jTextFieldTabela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(consultaF)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldTabela1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTextFieldTabela2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(124, Short.MAX_VALUE))
        );

        jDesktopPane1.add(jInternalFrame1);
        jInternalFrame1.setBounds(40, 40, 310, 250);

        jPanel1.add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 270));

        jTableProcedures.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTableProcedures);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 550, 110));

        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 510, 100, -1));

        jButtonNovaConsulta.setText("Nova consulta");
        jButtonNovaConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovaConsultaActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonNovaConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, 120, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 586, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextFieldTabelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTabelaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTabelaActionPerformed

    private void jButtonNovaConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovaConsultaActionPerformed
        jTextFieldTabela.setEditable(true);
        jTableProcedures.setModel(new ProcedureTableModel(listaProcedure));
         limpartabela ();
        
        
    }//GEN-LAST:event_jButtonNovaConsultaActionPerformed

    private void jTextFieldTabela1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTabela1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTabela1ActionPerformed

    private void consultaFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consultaFMouseClicked
       ConsultasDAO dao = new ConsultasDAO ();
            
       try {
            D d = new D();
            d.setLadon(jTextFieldTabela1.getText());
            d.setLado1(JTextFieldTabela2.getText());
           this.listaProcedure=dao.questaoF(d);
           jTableProcedures.setModel(new ProcedureTableModel(listaProcedure));
           
           
       } catch (ClassNotFoundException ex) {
          JOptionPane.showMessageDialog(null, ex.getLocalizedMessage());
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, ex.getLocalizedMessage());
       }
    }//GEN-LAST:event_consultaFMouseClicked

    private void consultEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consultEMouseClicked
       try {
          carregarTabela();
          jTextFieldTabela.setEditable(false);
          jTextFieldTabela.setText("");
       } catch (ClassNotFoundException ex) {
           Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
       } catch (SQLException ex) {
           Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
       }
    }//GEN-LAST:event_consultEMouseClicked

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JTextFieldTabela2;
    private javax.swing.JLabel consultE;
    private javax.swing.JLabel consultaF;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonNovaConsulta;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableProcedures;
    private javax.swing.JTextField jTextFieldTabela;
    private javax.swing.JTextField jTextFieldTabela1;
    // End of variables declaration//GEN-END:variables
}
