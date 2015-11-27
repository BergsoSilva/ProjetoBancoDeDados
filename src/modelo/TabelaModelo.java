/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;
import javax.swing.table.AbstractTableModel;
import java.util.List;
/**
 *
 * @author erick
 */
public class TabelaModelo extends AbstractTableModel{
    
    private List<Desc> lista;
    private String[] colunas = {"Nome", "Tipo"};
    
    public TabelaModelo(List<Desc> lista) {
        this.lista = lista;
    }
    
     
    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Desc desc = lista.get(rowIndex);
        
        switch(columnIndex){
            case 0:
                return desc.getNomeCampo();
            case 1:
                return desc.getTipo();
        }
        return null;           
    }
    
    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }
    
}
