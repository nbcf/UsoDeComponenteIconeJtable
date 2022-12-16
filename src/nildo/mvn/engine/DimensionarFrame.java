
package nildo.mvn.engine;
import java.awt.Dimension;
import java.awt.Toolkit;


public class DimensionarFrame { 
    
    
    public Dimension setSize()
    {
       Toolkit tk;
        tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        return d;
     
    }
 
    
}
