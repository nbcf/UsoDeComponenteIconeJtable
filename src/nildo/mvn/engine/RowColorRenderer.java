/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nildo.mvn.engine;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;


public class RowColorRenderer extends DefaultTableCellRenderer {
   protected void setValue(){
   
   
   } 
 public Component getTableCellRendererComponent(JTable table, Object value,boolean isSelected, boolean hasFocus, int row, int column) {
                super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
              
                Object ref = table.getValueAt(row, 4);//Coluna Status
            
                if (ref != null && ref.equals("A PAGAR")) {
                    setBackground(Color.RED);
                    setForeground(Color.WHITE);
                } else {
                    boolean sel = isSelected;
                    if (sel == true) {
                        setBackground(getBackground());
                        setForeground(getForeground());
                    } else {
                       setBackground(row % 2 == 0 ? Color.LIGHT_GRAY : Color.WHITE);

                       setForeground(new Color(51, 51, 51));
                    }
                }
                return this;
            }
        }
