
package nildo.mvn.engine;


import java.awt.AWTException;
import java.awt.CheckboxMenuItem;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Menu;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.SystemTray;
import java.awt.Toolkit;
import java.awt.TrayIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import nildo.mvn.engine.MenuTray;
//import sislab.proteomica.view.SobreView;

public class ParametrosGraficos  {
public int stMenu ;

 

        public Dimension setSize()
    {
     Toolkit toolkit;
     toolkit = Toolkit.getDefaultToolkit();
   Dimension resolucao = toolkit.getScreenSize();
     return resolucao;
     
    }
      
 public  MenuTray menuTray(String dir){
      
 if (!SystemTray.isSupported()) 
 {
       // System.out.println("SystemTray is not supported");
        JOptionPane.showMessageDialog(null, "Componente Icone de bandeja, não é Suportado Nesta Versão, de Sistema Operacional", "Aviso do Sistema", JOptionPane.ERROR_MESSAGE);
       //return;
 }
        final PopupMenu popup = new PopupMenu();
        final SystemTray tray = SystemTray.getSystemTray();
            try 
            {
            InputStream inputStream= ClassLoader.getSystemClassLoader().getResourceAsStream(dir);
            //or getResourceAsStream("/images/Graph.png"); also returns inputstream
            BufferedImage img = ImageIO.read(inputStream);
            final TrayIcon trayIcon = new TrayIcon(img, "Sistema do LPBP", popup);
            // Create a pop-up menu components
            
            MenuItem aboutItem = new MenuItem("Sobre");
            MenuItem opt1 = new MenuItem("Maximizar Tela");
            CheckboxMenuItem cb2 = new CheckboxMenuItem("Set tooltip");
            Menu displayMenu = new Menu("Funções");
            MenuItem errorItem = new MenuItem("Error");
            MenuItem warningItem = new MenuItem("Warning");
            MenuItem infoItem = new MenuItem("Info");
            MenuItem noneItem = new MenuItem("None");
            MenuItem exitItem = new MenuItem("Exit");
            

            //Add components to pop-up menu
            popup.add(aboutItem);
              popup.add(aboutItem).addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                     String args[] = new String[1];
                     args[0] = "Informações de Desenvolvimento e Propiedade";
               //     SobreView.main(args);  
                }
            });
//            
            popup.addSeparator();
           popup.add(opt1);
                popup.add(opt1).addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                     String args[] = new String[1];
                     args[0] = "Informações de Desenvolvimento e Propiedade";
                //    SobreView.main(args);  
                }
            });
//            
            popup.add(cb2);
            
            popup.addSeparator();
            popup.add(displayMenu);
            
            displayMenu.add(errorItem);
            displayMenu.add(warningItem);
            displayMenu.add(infoItem);
            displayMenu.add(noneItem);
            popup.add(exitItem);
            trayIcon.setPopupMenu(popup);
            
//              popup.add(aboutItem).addActionListener(new ActionListener() {
//                @Override
//                public void actionPerformed(ActionEvent e) {
//                    JOptionPane.showMessageDialog(null, "Teste");
//                }
//            });
//                popup.add(cb2).addActionListener(new ActionListener() {
//                @Override
//                public void actionPerformed(ActionEvent e) {
//                    JOptionPane.showMessageDialog(null, "Teste");
//                }
//            });


           displayMenu.add(exitItem).addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JOptionPane.showMessageDialog(null, "Teste");
                }
            });


            displayMenu.add(errorItem).addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JOptionPane.showMessageDialog(null, "Teste");
                }
            });

             displayMenu.add(warningItem).addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JOptionPane.showMessageDialog(null, "Teste");
                }
            });

              displayMenu.add(infoItem).addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JOptionPane.showMessageDialog(null, "Teste");
                }
            });


               displayMenu.add(noneItem).addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JOptionPane.showMessageDialog(null, "Teste");
                }
            });
      
     try {
            tray.add(trayIcon);
        }
     catch (AWTException e)
        {
            System.out.println("TrayIcon could not be added.");
            JOptionPane.showMessageDialog(null, "TrayIcon não pode ser adicionado \nInforme ao Suporter", "Aviso do Sistema", JOptionPane.ERROR_MESSAGE);
       //return;
        }
}catch (IOException e) {


}
            
            
            return null;

}

 
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
  
  
    public  void mostraJanela(JFrame nomeFrame1)
        {  
            if(nomeFrame1.isVisible())
            {
            nomeFrame1.setVisible(false);
            }
            else
            {
            nomeFrame1.setVisible(true);
            }

        }


    public void modBegins(JFrame nomeFrame2)
    {

  
     Toolkit toolkit;
     toolkit = Toolkit.getDefaultToolkit();
   Dimension resolucao2 = toolkit.getScreenSize();
     //return resolucao;
     
//    
//       int opcao;
//        Object[] botoes = {" Tela Maximizada", " Tela Retraida"};
//        opcao = JOptionPane.showOptionDialog(null, "Opções de Tela", "CONFIGURAÇÃO CLEAN DESKTOP", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE,null,botoes,botoes[0]);
//        if (opcao ==  JOptionPane.YES_OPTION)
//        {
        nomeFrame2.setSize(resolucao2.width, resolucao2.height);
        nomeFrame2.setExtendedState(JFrame.MAXIMIZED_BOTH);
        stMenu = 1;
//       // jPanel6.setVisible(false);
//        }else if (opcao ==  JOptionPane.NO_OPTION)
//        {
//        //nomeFrame2.setVisible(false)
//      //  nomeFrame2.setSize(resolucao2.width, 0);
////         nomeFrame2.setExtendedState(JFrame.MAXIMIZED_BOTH);
//       
//         nomeFrame2.setLocationRelativeTo(null);
//         nomeFrame2.pack();
//         nomeFrame2.setVisible(true);
//      ///  jPanel6.setVisible(false);
//       stMenu = 0;
//        }

    }
    
    
    public ImageIcon ajustaTela (String dirwall, JLabel nomeJLabel){
    
        ImageIcon myimage = null;
        try  {
         myimage = new ImageIcon(dirwall); 
                    }catch (Exception erro)
                    {
                    JOptionPane.showMessageDialog(null,"Imagem não pode ser econtrada \n\nContate Suporte", "Aviso do Sistema", JOptionPane.WARNING_MESSAGE);
                    }
         Image img1 = myimage.getImage();
        Image img2 = img1.getScaledInstance(nomeJLabel.getWidth(), nomeJLabel.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon i = new ImageIcon(img2);
    return i; 
            }
        
    
}
