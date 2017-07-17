package inf5153.battleship.interfaceGraphique;
import inf5153.battleship.domain.Partie;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
public class FenetreFinRecord extends FenetreRecords {
    
        protected Partie partie;
        protected boolean victoire;
        
        public FenetreFinRecord(Partie partie ,boolean victoire ) {
            this.partie = partie;
            this.victoire = victoire;
            initBoutonRevoirPartie();
            initMessageVictoire();
        }
        
	protected void btnRevoirPartieOnClickListener(java.awt.event.ActionEvent evt) throws Exception {
            
            FenetreRevoirPartie fenetrePartie = new FenetreRevoirPartie(partie);
            fenetrePartie.pack();
            fenetrePartie.setLocationRelativeTo(null);
            fenetrePartie.setVisible(true);
            
	}
        
        protected void initBoutonRevoirPartie(){
            
            btnRevoirPartie.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    try {
                        btnRevoirPartieOnClickListener(evt);
                    } catch (Exception ex) {
                        Logger.getLogger(FenetreFinRecord.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            });
            btnRevoirPartie.setVisible(true);
            this.repaint();
            
        }
        
         protected void initMessageVictoire(){
            
            if (victoire){
                lblVictoire.setVisible(true);

            }else lblDefaite.setVisible(true);
            this.repaint();
            
        }
        
   

}