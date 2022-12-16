/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nildo.mvn.engine;

import java.awt.Color;
import java.awt.Component;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;
import static javax.swing.SwingConstants.CENTER;

/**
 *
 * @author nil_b
 */
public class ImageIconCellRendererEditar  extends DefaultTableCellRender{
    JLabel label1 = new JLabel();

ImageIcon icone;

 
	public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) 
         {
             
             String col = (String) table.getColumnName(column);
        
    if ("EDITAR".equals(col.toString())){
                System.out.println(col);
               label1.setHorizontalAlignment(CENTER);   
               label1.isFocusable();
               label1.setIcon( new ImageIcon(getClass().getResource( "/image/editar_linha.png")));   
            
            }
              else if ("EXCLUIR".equals(col)){
            
             label1.setHorizontalAlignment(CENTER);   
             label1.isFocusable();
             
             label1.setIcon( new ImageIcon(getClass().getResource( "/image/excluir_linha.png")));   
             setBackground(table.getForeground());
            } 
    
    return label1;
         }
}
