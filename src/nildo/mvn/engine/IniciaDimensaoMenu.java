
package nildo.mvn.engine;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.beans.PropertyVetoException;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;


public class IniciaDimensaoMenu {
    
    public void tamanhoTela (JFrame nomeFrame)
    {
     Toolkit toolkit;
     toolkit = Toolkit.getDefaultToolkit();
     Dimension resolucao = toolkit.getScreenSize();

        nomeFrame.setSize(resolucao.width, resolucao.height);
        nomeFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
            }
    
    
    public Dimension IniciaDimensaoJInternalframe()
    {
       Toolkit tk;
        tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
     return d;
     
    }
}
