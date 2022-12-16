
package nildo.mvn.renderizadores;

import java.awt.Component;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;
import nildo.mvn.engine.DefaultTableCellRender;

public class ImageIconCellRenderer extends DefaultTableCellRender {

JLabel label = new JLabel();
ImageIcon icone;

  
  @Override
	public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) 
         {

            String str = (String) value;
            if ("PAGO".equals(str)) {
             
            label.setHorizontalAlignment(CENTER);
            label.setIcon( new ImageIcon(getClass().getResource("/nildo/mvn/image/button_ok.png")));
             
            } else if ("A PAGAR".equals(str)) {
                 
             label.setHorizontalAlignment(CENTER);   
             label.setIcon( new ImageIcon(getClass().getResource( "/nildo/mvn/image/button_cancel.png")));   
            
            }
                
            return label;
            }
}