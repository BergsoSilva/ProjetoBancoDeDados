/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import dao.ConsultasDAO;
import dao.TablesDAO;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JCheckBox;
import javax.swing.JList;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.ListCellRenderer;
import javax.swing.ListSelectionModel;
import modelo.User;
import javax.swing.JTable;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import modelo.TabelaModelo;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JMenuItem;
import modelo.D;
import modelo.ProcedureTableModel;

/**
 *
 * @author erick
 */
public class TelaInformation_Schema extends javax.swing.JFrame {
    
    
    private static int TOTAL = 2;
    private Vector listaBancos = new Vector();
    private Vector listaTabelas = new Vector();
    private int cont = 0;
    private User user;
    private JTable[] table = new JTable[TOTAL];
     
    private List<D> listaProcedure = new ArrayList<>();
    private  D d =  new D();
    
    /**
     *
     * @param user
     * @throws SQLException
     */
    public TelaInformation_Schema(User user) throws SQLException {
        initComponents();
        this.user = user;
        carregarLabelBanco();
        
        this.setExtendedState(MAXIMIZED_BOTH);
        
        painelBanco.setLayout(new FlowLayout(FlowLayout.CENTER, 30, 20));
        painelBanco.setPreferredSize(new Dimension(800, 700));
        carregarTabela ();
        preencherManuFlutuane ();
    }   

    /**t
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        opcoesPomenu = new javax.swing.JPopupMenu();
        scrollRadio = new javax.swing.JScrollPane();
        JListlBancos = new javax.swing.JList();
        scrollRadio1 = new javax.swing.JScrollPane();
        JListTabelas = new javax.swing.JList();
        painelBanco = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProcedures = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        JListlBancos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Bancos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 14), new java.awt.Color(233, 18, 18))); // NOI18N
        JListlBancos.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        scrollRadio.setViewportView(JListlBancos);

        JListTabelas.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tabelas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 14), new java.awt.Color(233, 23, 23))); // NOI18N
        scrollRadio1.setViewportView(JListTabelas);

        painelBanco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                painelBancoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout painelBancoLayout = new javax.swing.GroupLayout(painelBanco);
        painelBanco.setLayout(painelBancoLayout);
        painelBancoLayout.setHorizontalGroup(
            painelBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 436, Short.MAX_VALUE)
        );
        painelBancoLayout.setVerticalGroup(
            painelBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 333, Short.MAX_VALUE)
        );

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(scrollRadio, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                    .addComponent(scrollRadio1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                        .addComponent(painelBanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(scrollRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(scrollRadio1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(155, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(painelBanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
     
    // abrir menuOpoes no painel 
    private void painelBancoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painelBancoMouseClicked
        if (evt.getButton()==MouseEvent.BUTTON3){
            opcoesPomenu.show(evt.getComponent(), evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_painelBancoMouseClicked

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    
   
    public static void main(String args[]) throws SQLException {
        
         User user = new User();
         user.setHost("localhost");
         user.setPorta("3306");
         user.setUsuario("adson");
         user.setDriver("jdbc:mysql://");
         user.setPassword("123");
        
        TelaInformation_Schema tela = new TelaInformation_Schema(user);
        tela.setVisible(true);       
    }  
    
    // menu flutuante 
    private void preencherManuFlutuane () {
        JMenuItem menusItens [] = {new JMenuItem("questaoD")};
        menusItens[0].addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    consultar();
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(TelaInformation_Schema.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(TelaInformation_Schema.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
         for (JMenuItem iten : menusItens) {
            opcoesPomenu.add(iten);
        }
        
    }
    
    private void carregarTabela () {
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
        this.d.setPar("bairro");
    }
        
    // renderiza a criacão de RadioButtos nas JLists , repesentado os banco e tabelas
    private static class LabelRenderer implements ListCellRenderer{

        @Override
        public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
            
            JLabel label = (JLabel) value; 
            return label;
        }      
    }
    
      
   private void carregarJTable(String nomeCidade) throws SQLException{             
       if (cont > TOTAL - 1)
           JOptionPane.showMessageDialog(null, "O máximo de tabelas selecionadas é 2");
       else{
            table[cont] = new JTable();

            TablesDAO dao = new TablesDAO(this.user);    
            JScrollPane scroll = new JScrollPane(table[cont]);
            table[cont].setModel(new TabelaModelo(dao.selecionarDesc(nomeCidade)));  
                   // scroll.setPreferredSnew Dimension(100, 100));
            table[cont].setPreferredScrollableViewportSize(new Dimension(200, 100));
            painelBanco.add(scroll);
            painelBanco.setVisible(false);
            painelBanco.setVisible(true);
            table[cont].setVisible(true);
            
            scroll.setBorder(BorderFactory.createTitledBorder(BorderFactory.createCompoundBorder()," << "+ nomeCidade+" >> ", 1, 1));

            cont++;
        }       
   }
   
   
    
    private void carregarLabelBanco() throws SQLException{                       
        JListlBancos.setCellRenderer(new LabelRenderer());
                               
        TablesDAO dao = new TablesDAO(user);
                
        for (String col : dao.selecionarDataBase()) {
            JLabel label = new JLabel(col);
            
            listaBancos.add(label);
        }
        JListlBancos.setListData(listaBancos);
        JListlBancos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JListlBancos.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e){
                
               
                int index = JListlBancos.locationToIndex(e.getPoint());
                System.out.println("entrou banco");
                String banco = ((JLabel) JListlBancos.getModel().getElementAt(index)).getText();
                String novoBanco = banco.toUpperCase();
                user.setPrivilegio(banco);
                
                 painelBanco.setBorder(BorderFactory.createTitledBorder(BorderFactory.createCompoundBorder(),"Base de Dados << "+novoBanco+" >>", 1, 1));
               
                    try {
                         if (e.getClickCount()==2){
                        carregarLabelTabela(dao.selecionarBancoETabelas());
                         } if (e.getButton()==MouseEvent.BUTTON3){
                            opcoesPomenu.show(e.getComponent(), e.getX(), e.getY());
                          }
                    } catch (SQLException ex) {
                        Logger.getLogger(TelaInformation_Schema.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                
              // repaint();
            
        
        });        
    }
    private void carregarLabelTabela(List<String> lista) throws SQLException{
        
        JListTabelas.setCellRenderer(new LabelRenderer());
                        
        listaTabelas.clear();
        //System.out.println(lista);        
        for (String col : lista) {
            JLabel label = new JLabel(col);
            
            listaTabelas.add(label);
        }
        JListTabelas.setListData(listaTabelas);
        JListTabelas.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        //removendo listerns
        MouseListener[] events = JListTabelas.getMouseListeners();
        for (MouseListener event : events) {
            JListTabelas.removeMouseListener(event);
        }
        
        
        JListTabelas.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e){
                System.out.println("entrou tabela");
                int index = JListTabelas.locationToIndex(e.getPoint());
                    JLabel label = (JLabel) JListTabelas.getModel().getElementAt(index);
                try {
                    carregarJTable(label.getText());
                    
                    //repaint();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        
        });        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList JListTabelas;
    private javax.swing.JList JListlBancos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableProcedures;
    private javax.swing.JPopupMenu opcoesPomenu;
    private javax.swing.JPanel painelBanco;
    private javax.swing.JScrollPane scrollRadio;
    private javax.swing.JScrollPane scrollRadio1;
    // End of variables declaration//GEN-END:variables
}