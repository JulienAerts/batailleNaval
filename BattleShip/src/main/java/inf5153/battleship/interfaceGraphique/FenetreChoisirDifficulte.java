
package inf5153.battleship.interfaceGraphique;

public class FenetreChoisirDifficulte extends javax.swing.JFrame {
    
    private int niveauDif;
   
    public FenetreChoisirDifficulte() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCommencerPartie = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        getContentPane().setLayout(null);

        btnCommencerPartie.setText("Lancer la partie");
        btnCommencerPartie.setActionCommand("");
        btnCommencerPartie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCommencerPartieActionPerformed(evt);
            }
        });
        getContentPane().add(btnCommencerPartie);
        btnCommencerPartie.setBounds(320, 430, 140, 30);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "facile", "difficile" }));
        jComboBox1.setMaximumSize(new java.awt.Dimension(105, 23));
        jComboBox1.setMinimumSize(new java.awt.Dimension(105, 23));
        jComboBox1.setName(""); // NOI18N
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(350, 400, 80, 26);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fond_Fenetre_Choix.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -20, 810, 620);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCommencerPartieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCommencerPartieActionPerformed

        FenetreJouerPartie fenetrePartie;
        fenetrePartie = new FenetreJouerPartie(niveauDif);
        fenetrePartie.pack();
        fenetrePartie.setLocationRelativeTo(null);
        fenetrePartie.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCommencerPartieActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed

        if(jComboBox1.getSelectedItem().toString() == "facile"){
            niveauDif = 0;
        }else niveauDif = 1;
        
    }//GEN-LAST:event_jComboBox1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCommencerPartie;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
