/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nildo.mvn.engine;

import java.awt.AWTException;
import java.awt.CheckboxMenuItem;
import java.awt.Image;
import java.awt.Menu;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.SystemTray;
import java.awt.TrayIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author nil_b
 */
public class MenuTray {
    
    public void MenuTray( JFrame frame, String dirIcone){
 if (!SystemTray.isSupported()) {
            System.out.println("SystemTray is not supported");
            return;
        }
        final PopupMenu popup = new PopupMenu();
        

        final SystemTray tray = SystemTray.getSystemTray();
       
        
         try {
    InputStream inputStream  = ClassLoader.getSystemClassLoader().getResourceAsStream(dirIcone);


  BufferedImage img = ImageIO.read(inputStream);
    final TrayIcon trayIcon = new TrayIcon(img, "Nome da Aplicação", popup);
    
     
        // Create a pop-up menu components
        MenuItem aboutItem = new MenuItem("About");
        CheckboxMenuItem cb1 = new CheckboxMenuItem("Set auto size");
        CheckboxMenuItem cb2 = new CheckboxMenuItem("Set tooltip");
        Menu displayMenu = new Menu("Display");
        MenuItem errorItem = new MenuItem("Error");
        MenuItem warningItem = new MenuItem("Warning");
        MenuItem infoItem = new MenuItem("Info");
        MenuItem noneItem = new MenuItem("None");
        MenuItem exitItem = new MenuItem("Exit");
       
        //Add components to pop-up menu
        popup.add(aboutItem);
        popup.addSeparator();
        popup.add(cb1);
        popup.add(cb2);
        popup.addSeparator();
        popup.add(displayMenu);
        displayMenu.add(errorItem);
        displayMenu.add(warningItem);
        displayMenu.add(infoItem);
        displayMenu.add(noneItem);
        popup.add(exitItem);
       
        trayIcon.setPopupMenu(popup);
        
          popup.add(exitItem).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Teste");
            }
        });
            popup.add(exitItem).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Teste");
            }
        });
            
        
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
       trayIcon.addActionListener(new ActionListener(){

        public void actionPerformed(ActionEvent evt){

      mostraJanela(frame);
    ///  jLabel8.setIcon(ajustaTela.ajustaTela("images/proteinCoverart.jpg",jLabel8));

        }//end actionPerformed

        });//end addActionListener

        }
     catch (AWTException e)
        {
            System.out.println("TrayIcon could not be added.");
            JOptionPane.showMessageDialog(null, "TrayIcon não pode ser adicionado \nInforme ao Suporter", "Aviso do Sistema", JOptionPane.ERROR_MESSAGE);
       //return;
        }
}catch (IOException e) {}
    


        }
    
    
      private void mostraJanela(JFrame frame)
        { 
            if(frame.isVisible())
            {

        frame.setVisible(false);

        }else{

        frame.setVisible(true);

        }
       
    }
}