/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author LAB-07
 */
public class Procedure3pTableModel extends AbstractTableModel{
    
    private List<D> lista;
    private String[] colunas = {"TABELA" , "TAMANHO","BANCO"};
    
    public Procedure3pTableModel(List<D> lista) {
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
        D d= this.lista.get(rowIndex);
        
        switch(columnIndex){
            case 0:
                return d.getLadon();
            case 1:
                return d.getLado1();
            case 2:
                return d.getPar();
           
        }
        return null;           
    }
    
    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }
    
}
