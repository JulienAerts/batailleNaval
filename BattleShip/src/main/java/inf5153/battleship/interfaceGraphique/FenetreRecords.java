package inf5153.battleship.interfaceGraphique;
import javax.swing.JButton;
import inf5153.battleship.controleur.RecordControleur;
import inf5153.battleship.domain.Record;
import java.awt.Font;
import javax.swing.JTextField;


public class FenetreRecords extends javax.swing.JFrame {
    
        protected javax.swing.JButton btnRevoirPartie;
	protected RecordControleur controleur ;   
        protected javax.swing.JButton btnRetourMenu;
        protected javax.swing.JButton btnSauvegarder;
        protected javax.swing.JScrollPane jScrollPane1;
        protected javax.swing.JTable tblMeilleureTemps;
        protected javax.swing.JLabel lblImageFond;
        protected javax.swing.JLabel lblVictoire;
        protected javax.swing.JLabel lblDefaite;
        protected javax.swing.JLabel lblNouveauRecord;
        protected javax.swing.JLabel lblEntrerNom;
        protected JTextField entrerNom;
        public FenetreRecords() {
            
            initComponents();
            controleur = new RecordControleur();
            controleur.chargerRecordsHistorique();
            informationVersGrid();
        }
        
	public void btnRetourMenuOnClickListener(java.awt.event.ActionEvent evt) {
            
            MenuPrincipal menuPrincipal = new MenuPrincipal();
            menuPrincipal.pack();
            menuPrincipal.setLocationRelativeTo(null);
            menuPrincipal.setVisible(true);
            dispose();
            
	}

        protected void informationVersGrid(){
        int i =0;
        int l =0;
        String niveau;
        for (Record record :controleur.consulterRecords()){
            System.out.println("record");
            if (record.difficulte==0){
                niveau = "facile";
            }else  niveau = "difficile";
            tblMeilleureTemps.setValueAt(record.nom, i, l);
            tblMeilleureTemps.setValueAt(niveau, i, l+1);
            tblMeilleureTemps.setValueAt(((record.temp/1000))+" secondes", i, l+2);
            l =0;
            i =i+1;
        }
 
        
    }
        protected void initComponents() {

            jScrollPane1 = new javax.swing.JScrollPane();
            tblMeilleureTemps = new javax.swing.JTable();
            btnRetourMenu = new javax.swing.JButton();
            btnRevoirPartie = new javax.swing.JButton();
            btnSauvegarder = new javax.swing.JButton();
            
            lblVictoire = new javax.swing.JLabel();
            lblDefaite = new javax.swing.JLabel();
            lblNouveauRecord = new javax.swing.JLabel();
            lblEntrerNom = new javax.swing.JLabel();
            entrerNom = new JTextField();
            lblImageFond = new javax.swing.JLabel();

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
            setPreferredSize(new java.awt.Dimension(800, 600));
            setResizable(false);
            getContentPane().setLayout(null);

            tblMeilleureTemps.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                    {null, null, null},
                    {null, null, null}
                },
                new String [] {
                    "Nom du joueur", "Niveau", "Temps"
                }
            ));
            jScrollPane1.setViewportView(tblMeilleureTemps);

            getContentPane().add(jScrollPane1);
            jScrollPane1.setBounds(170, 210, 460, 60);

            btnRetourMenu.setText("Retour");
            btnRetourMenu.setActionCommand("");
            btnRetourMenu.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnRetourMenuOnClickListener(evt);
                }
            });
            getContentPane().add(btnRetourMenu);
            btnRetourMenu.setBounds(40, 520, 140, 30);

            btnRevoirPartie.setText("Revoir la partie");
            btnRevoirPartie.setActionCommand("");
            btnRevoirPartie.setVisible(false);
            getContentPane().add(btnRevoirPartie);
            btnRevoirPartie.setBounds(610, 520, 140, 30);
            
            btnSauvegarder.setText("Sauvegarder votre record!");
            btnSauvegarder.setActionCommand("");
            btnSauvegarder.setVisible(false);
            getContentPane().add(btnSauvegarder);
            btnSauvegarder.setBounds(300, 300, 190, 30);
            
            
            lblVictoire.setText("Félicitation vous avez gagner!");
            lblVictoire.setFont(new Font("Brush Script MT", Font.ITALIC, 33));
            getContentPane().add(lblVictoire);
            lblVictoire.setBounds(225, 130, 460, 60);
            lblVictoire.setVisible(false);
            
            lblDefaite.setText("Meilleure change la prochaine fois");
            lblDefaite.setFont(new Font("Brush Script MT", Font.ITALIC, 33));
            getContentPane().add(lblDefaite);
            lblDefaite.setBounds(225, 150, 460, 60);
            lblDefaite.setVisible(false);
            
            lblNouveauRecord.setText("Nouveau record!");
            lblNouveauRecord.setFont(new Font("Brush Script MT", Font.ITALIC, 33));
            getContentPane().add(lblNouveauRecord);
            lblNouveauRecord.setBounds(300, 155, 460, 60);
            lblNouveauRecord.setVisible(false);
            
            lblEntrerNom.setText("Entrer votre nom :");
            lblEntrerNom.setFont(new Font("Brush Script MT", Font.ITALIC, 33));
            getContentPane().add(lblEntrerNom);
            lblEntrerNom.setBounds(177, 270, 460, 30);
            lblEntrerNom.setVisible(false);
            
            entrerNom.setFont(new Font("Brush Script MT", Font.ITALIC, 33));
            getContentPane().add(entrerNom);
            entrerNom.setBounds(370, 270, 200, 30);
            entrerNom.setVisible(false);
            
            lblImageFond.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fond_Fenetre_Records.png"))); // NOI18N
            getContentPane().add(lblImageFond);
            lblImageFond.setBounds(0, -20, 810, 620);
            
            pack();
        }
}