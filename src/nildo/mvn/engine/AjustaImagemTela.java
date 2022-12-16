/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nildo.mvn.engine;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author nil_b
 */
public class AjustaImagemTela {
    
    public ImageIcon ajustaTela (String dirwall, JLabel nomeJLabel){
    
        ImageIcon imagemAlvo = null;
        try {
            imagemAlvo = new ImageIcon(dirwall); 
            }
            catch (Exception erro)
            {
            JOptionPane.showMessageDialog(null,"Imagem não pode ser econtrada \n\nContate Suporte", "Aviso do Sistema", JOptionPane.WARNING_MESSAGE);
            }
                    Image img_entrada = imagemAlvo.getImage();
                    Image img_alterada = img_entrada.getScaledInstance(nomeJLabel.getWidth(), nomeJLabel.getHeight(),Image.SCALE_SMOOTH);
                    ImageIcon imagem_disponibilizada = new ImageIcon(img_alterada);
                    return imagem_disponibilizada; 
            }    
}