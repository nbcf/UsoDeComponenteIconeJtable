
package nildo.mvn.engine;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class VisualLook {
    
      public void lookandfeel(JFrame nomeFrame, String dir_look)
           {
                try
                    {
                    UIManager.setLookAndFeel(dir_look);
                    SwingUtilities.updateComponentTreeUI(nomeFrame);
                    }
                    catch (Exception erro)
                    {
                    JOptionPane.showMessageDialog(null,erro);
                    }
            }
}
