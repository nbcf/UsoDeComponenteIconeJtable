/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nildo.mvn.engine;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author nil_b
 */
public class DimensionaTela {
    
     public Dimension setSize()
    {
     Toolkit toolkit;
     toolkit = Toolkit.getDefaultToolkit();
     Dimension resolucao = toolkit.getScreenSize();
     return resolucao;
     
    }
      
    
}
