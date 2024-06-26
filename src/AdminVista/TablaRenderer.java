/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdminVista;

import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Dayron
 */
public class TablaRenderer extends DefaultTableCellRenderer{
    
    /***
     * Esta funcion renderiza una tabla para poder agregarle botones
     * @param table
     * @param value
     * @param isSelected
     * @param hasFocus
     * @param row
     * @param column
     * @return 
     */
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        
        if (value instanceof JButton){
            JButton btn = (JButton)value;
            return btn;
            
        }
        else if (value instanceof JSpinner){
            JSpinner btn = (JSpinner)value;
            return btn;
            
        }
       
        return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column); //To change body of generated methods, choose Tools | Templates.
    }
    
}
