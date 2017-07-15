package inf5153.battleship.interfaceGraphique;
import javax.swing.JButton;
public class FenetreFinRecord extends FenetreRecords {

	public JButton btnRevoirPartie;
        
        public FenetreFinRecord() {
            
            super.initComponents();
            initExtraComponents();
        }
	public void btnRevoirPartieOnClickListener(java.awt.event.ActionEvent evt) {
		
	}
        
        void initExtraComponents(){
            btnRevoirPartie = new javax.swing.JButton();
            btnRevoirPartie.setText("Revoir la partie");
            btnRevoirPartie.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnRevoirPartieOnClickListener(evt);
                }
            });
            getContentPane().add(btnRevoirPartie);
            btnRevoirPartie.setBounds(630, 523, 120, 30);
        }

}