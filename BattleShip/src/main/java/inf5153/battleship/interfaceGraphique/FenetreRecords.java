package inf5153.battleship.interfaceGraphique;
import javax.swing.JButton;
import inf5153.battleship.controleur.RecordControleur;


public class FenetreRecords extends javax.swing.JFrame {

	private RecordControleur controleur;   
        private javax.swing.JButton btnRetourMenu;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JTable tblMeilleureTemps;
        private javax.swing.JLabel lblImageFond;
        
        public FenetreRecords() {
            
            initComponents();
            
        }
        
	public void btnRetourMenuOnClickListener(java.awt.event.ActionEvent evt) {
            
            MenuPrincipal menuPrincipal = new MenuPrincipal();
            menuPrincipal.pack();
            menuPrincipal.setLocationRelativeTo(null);
            menuPrincipal.setVisible(true);
            dispose();
            
	}

	public void informationVersGrid() {
		// TODO - implement FenetreRecords.informationVersGrid
		throw new UnsupportedOperationException();
	}
        
        private void initComponents() {

            jScrollPane1 = new javax.swing.JScrollPane();
            tblMeilleureTemps = new javax.swing.JTable();
            btnRetourMenu = new javax.swing.JButton();
            lblImageFond = new javax.swing.JLabel();

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
            setPreferredSize(new java.awt.Dimension(800, 600));
            setResizable(false);
            getContentPane().setLayout(null);

            tblMeilleureTemps.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                    {null, null, null},
                    {null, null, null},
                    {null, null, null},
                    {null, null, null},
                    {null, null, null},
                    {null, null, null},
                    {null, null, null},
                    {null, null, null},
                    {null, null, null},
                    {null, null, null},
                    {null, null, null},
                    {null, null, null},
                    {null, null, null},
                    {null, null, null},
                    {null, null, null},
                    {null, null, null},
                    {null, null, null},
                    {null, null, null},
                    {null, null, null},
                    {null, null, null}
                },
                new String [] {
                    "Nom du joueur", "Niveau", "Temps"
                }
            ));
            jScrollPane1.setViewportView(tblMeilleureTemps);

            getContentPane().add(jScrollPane1);
            jScrollPane1.setBounds(170, 160, 450, 350);

            btnRetourMenu.setText("Retour");
            btnRetourMenu.setActionCommand("");
            btnRetourMenu.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnRetourMenuOnClickListener(evt);
                }
            });
            getContentPane().add(btnRetourMenu);
            btnRetourMenu.setBounds(40, 520, 140, 30);

            lblImageFond.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fond_Fenetre_Choix.png"))); // NOI18N
            getContentPane().add(lblImageFond);
            lblImageFond.setBounds(0, -20, 810, 620);

            pack();
        }
}