

package inf5153.battleship.interfaceGraphique;
import inf5153.battleship.controleur.MenuPrincipalControleur;
import java.awt.Component;
import java.awt.Container;
import java.io.File;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class MenuPrincipal extends javax.swing.JFrame {
    
    MenuPrincipalControleur controleur = new MenuPrincipalControleur();

    public MenuPrincipal() {
        initComponents();
    }
                        
    private void initComponents() {
        
        selectionneur = new JFileChooser();
        disableNav(selectionneur);
        xmlfilter = new FileNameExtensionFilter("xml files (*.xml)", "xml");

        selectionneur.setDialogTitle("Charger fichier de sauvegarde");
        // set selected filter
        selectionneur.setFileFilter(xmlfilter);
        selectionneur.setCurrentDirectory(new java.io.File("./src/main/resources/sauvegarde/"));
        btnJouerSeul = new javax.swing.JButton();
        btnChargerPartie = new javax.swing.JButton();
        btnVoirRecord = new javax.swing.JButton();
        lblImageFond = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        getContentPane().setLayout(null);

        btnJouerSeul.setText("Nouvelle partie");
        btnJouerSeul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJouerSeulActionPerformed(evt);
            }
        });
        getContentPane().add(btnJouerSeul);
        btnJouerSeul.setBounds(330, 430, 140, 23);

        btnChargerPartie.setText("Charger une partie");
        btnChargerPartie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChargerPartieActionPerformed(evt);
            }
        });
        getContentPane().add(btnChargerPartie);
        btnChargerPartie.setBounds(330, 460, 140, 23);

        btnVoirRecord.setText("Meilleure score");
        btnVoirRecord.setActionCommand("Meilleure record");
        btnVoirRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoirRecordActionPerformed(evt);
            }
        });
        getContentPane().add(btnVoirRecord);
        btnVoirRecord.setBounds(330, 490, 140, 23);

        lblImageFond.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fond_Menu_Principal.png"))); // NOI18N
        lblImageFond.setText("jLabel1");
        getContentPane().add(lblImageFond);
        lblImageFond.setBounds(0, -20, 800, 600);

        pack();
    }                    
    
    private void disableNav(Container c) {
        for (Component x : c.getComponents())
          if (x instanceof JComboBox)
            ((JComboBox)x).setEnabled(false);
          else if (x instanceof JButton) {
            String text = ((JButton)x).getText();
            if (text == null || text.isEmpty())
              ((JButton)x).setEnabled(false);
            }
          else if (x instanceof Container)
            disableNav((Container)x);
    }
    
    private void btnJouerSeulActionPerformed(java.awt.event.ActionEvent evt) {                                             
        FenetreChoisirDifficulte fenetreChoix = new FenetreChoisirDifficulte();
        fenetreChoix.pack();
        fenetreChoix.setLocationRelativeTo(null);
        fenetreChoix.setVisible(true);
        dispose();
    }                                            

    private void btnChargerPartieActionPerformed(java.awt.event.ActionEvent evt) {
        
        selectionneur.showOpenDialog(btnChargerPartie);
        File fichier = selectionneur.getSelectedFile();
        if(fichier != null) {
            FenetreJouerPartie fenetrePartie;
            fenetrePartie = new FenetreJouerPartie();
            fenetrePartie.pack();
            fenetrePartie.setLocationRelativeTo(null);
            fenetrePartie.setVisible(true);
            fenetrePartie.chargementDePartie(fichier);
            dispose();
        }
 

    }                                                

    private void btnVoirRecordActionPerformed(java.awt.event.ActionEvent evt) {                                              
        FenetreRecords fenetreRecords = new FenetreRecords();
        fenetreRecords.pack();
        fenetreRecords.setLocationRelativeTo(null);
        fenetreRecords.setVisible(true);
        dispose();
    }                                             


    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MenuPrincipal menu = new MenuPrincipal();
                menu.pack();
                menu.setLocationRelativeTo(null);
                menu.setVisible(true);
            }
        });
    }
  
    private JFileChooser selectionneur ;
    private FileNameExtensionFilter xmlfilter;
    private javax.swing.JButton btnChargerPartie;
    private javax.swing.JButton btnJouerSeul;
    private javax.swing.JButton btnVoirRecord;
    private javax.swing.JLabel lblImageFond;                 
}
