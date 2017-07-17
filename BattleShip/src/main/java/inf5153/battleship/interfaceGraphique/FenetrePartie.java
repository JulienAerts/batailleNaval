
package inf5153.battleship.interfaceGraphique;
import javax.swing.JFrame;
import javax.swing.JButton;
import inf5153.battleship.domain.Position;

public class FenetrePartie extends JFrame {
   
    public BoutonCustom mapBoutonsJoueur[];
    public BoutonCustom mapBoutonsAdv[];
    //Boutons d options
    public JButton btnChangerOrientation;
    public JButton btnDemarrerPartie;
    public JButton btnFinPartie;
    public JButton btnReinitialise;
    public JButton btnSauvegarder;
    //Boutons de la grille du joueur
    public BoutonCustom jButton10A;
    public BoutonCustom jButton10B;
    public BoutonCustom jButton10C;
    public BoutonCustom jButton10D;
    public BoutonCustom jButton10E;
    public BoutonCustom jButton10F;
    public BoutonCustom jButton10G;
    public BoutonCustom jButton10H;
    public BoutonCustom jButton10I;
    public BoutonCustom jButton10J;
    public BoutonCustom jButton1A;
    public BoutonCustom jButton1B;
    public BoutonCustom jButton1C;
    public BoutonCustom jButton1D;
    public BoutonCustom jButton1E;
    public BoutonCustom jButton1F;
    public BoutonCustom jButton1G;
    public BoutonCustom jButton1H;
    public BoutonCustom jButton1I;
    public BoutonCustom jButton1J;
    public BoutonCustom jButton2A;
    public BoutonCustom jButton2B;
    public BoutonCustom jButton2C;
    public BoutonCustom jButton2D;
    public BoutonCustom jButton2E;
    public BoutonCustom jButton2F;
    public BoutonCustom jButton2G;
    public BoutonCustom jButton2H;
    public BoutonCustom jButton2I;
    public BoutonCustom jButton2J;
    public BoutonCustom jButton3A;
    public BoutonCustom jButton3B;
    public BoutonCustom jButton3C;
    public BoutonCustom jButton3D;
    public BoutonCustom jButton3E;
    public BoutonCustom jButton3F;
    public BoutonCustom jButton3G;
    public BoutonCustom jButton3H;
    public BoutonCustom jButton3I;
    public BoutonCustom jButton3J;
    public BoutonCustom jButton4A;
    public BoutonCustom jButton4B;
    public BoutonCustom jButton4C;
    public BoutonCustom jButton4D;
    public BoutonCustom jButton4E;
    public BoutonCustom jButton4F;
    public BoutonCustom jButton4G;
    public BoutonCustom jButton4H;
    public BoutonCustom jButton4I;
    public BoutonCustom jButton4J;
    public BoutonCustom jButton5A;
    public BoutonCustom jButton5B;
    public BoutonCustom jButton5C;
    public BoutonCustom jButton5D;
    public BoutonCustom jButton5E;
    public BoutonCustom jButton5F;
    public BoutonCustom jButton5G;
    public BoutonCustom jButton5H;
    public BoutonCustom jButton5I;
    public BoutonCustom jButton5J;
    public BoutonCustom jButton6A;
    public BoutonCustom jButton6B;
    public BoutonCustom jButton6C;
    public BoutonCustom jButton6D;
    public BoutonCustom jButton6E;
    public BoutonCustom jButton6F;
    public BoutonCustom jButton6G;
    public BoutonCustom jButton6H;
    public BoutonCustom jButton6I;
    public BoutonCustom jButton6J;
    public BoutonCustom jButton7A;
    public BoutonCustom jButton7B;
    public BoutonCustom jButton7C;
    public BoutonCustom jButton7D;
    public BoutonCustom jButton7E;
    public BoutonCustom jButton7F;
    public BoutonCustom jButton7G;
    public BoutonCustom jButton7H;
    public BoutonCustom jButton7I;
    public BoutonCustom jButton7J;
    public BoutonCustom jButton8A;
    public BoutonCustom jButton8B;
    public BoutonCustom jButton8C;
    public BoutonCustom jButton8D;
    public BoutonCustom jButton8E;
    public BoutonCustom jButton8F;
    public BoutonCustom jButton8G;
    public BoutonCustom jButton8H;
    public BoutonCustom jButton8I;
    public BoutonCustom jButton8J;
    public BoutonCustom jButton9A;
    public BoutonCustom jButton9B;
    public BoutonCustom jButton9C;
    public BoutonCustom jButton9D;
    public BoutonCustom jButton9E;
    public BoutonCustom jButton9F;
    public BoutonCustom jButton9G;
    public BoutonCustom jButton9H;
    public BoutonCustom jButton9I;
    public BoutonCustom jButton9J;
    //Boutons de la grille de l adversaire
    public BoutonCustom jButtonA1;
    public BoutonCustom jButtonA10;
    public BoutonCustom jButtonA2;
    public BoutonCustom jButtonA3;
    public BoutonCustom jButtonA4;
    public BoutonCustom jButtonA5;
    public BoutonCustom jButtonA6;
    public BoutonCustom jButtonA7;
    public BoutonCustom jButtonA8;
    public BoutonCustom jButtonA9;
    public BoutonCustom jButtonB1;
    public BoutonCustom jButtonB10;
    public BoutonCustom jButtonB2;
    public BoutonCustom jButtonB3;
    public BoutonCustom jButtonB4;
    public BoutonCustom jButtonB5;
    public BoutonCustom jButtonB6;
    public BoutonCustom jButtonB7;
    public BoutonCustom jButtonB8;
    public BoutonCustom jButtonB9;
    public BoutonCustom jButtonC1;
    public BoutonCustom jButtonC10;
    public BoutonCustom jButtonC2;
    public BoutonCustom jButtonC3;
    public BoutonCustom jButtonC4;
    public BoutonCustom jButtonC5;
    public BoutonCustom jButtonC6;
    public BoutonCustom jButtonC7;
    public BoutonCustom jButtonC8;
    public BoutonCustom jButtonC9; 
    public BoutonCustom jButtonD1;
    public BoutonCustom jButtonD10;
    public BoutonCustom jButtonD2;
    public BoutonCustom jButtonD3;
    public BoutonCustom jButtonD4;
    public BoutonCustom jButtonD5;
    public BoutonCustom jButtonD6;
    public BoutonCustom jButtonD7;
    public BoutonCustom jButtonD8;
    public BoutonCustom jButtonD9;
    public BoutonCustom jButtonE1;
    public BoutonCustom jButtonE10;
    public BoutonCustom jButtonE2;
    public BoutonCustom jButtonE3;
    public BoutonCustom jButtonE4;
    public BoutonCustom jButtonE5;
    public BoutonCustom jButtonE6;
    public BoutonCustom jButtonE7;
    public BoutonCustom jButtonE8;
    public BoutonCustom jButtonE9;
    public BoutonCustom jButtonF1;
    public BoutonCustom jButtonF10;
    public BoutonCustom jButtonF2;
    public BoutonCustom jButtonF3;
    public BoutonCustom jButtonF4;
    public BoutonCustom jButtonF5;
    public BoutonCustom jButtonF6;
    public BoutonCustom jButtonF7;
    public BoutonCustom jButtonF8;
    public BoutonCustom jButtonF9;
    public BoutonCustom jButtonG1;
    public BoutonCustom jButtonG10;
    public BoutonCustom jButtonG2;
    public BoutonCustom jButtonG3;
    public BoutonCustom jButtonG4;
    public BoutonCustom jButtonG5;
    public BoutonCustom jButtonG6;
    public BoutonCustom jButtonG7;
    public BoutonCustom jButtonG8;
    public BoutonCustom jButtonG9;
    public BoutonCustom jButtonH1;
    public BoutonCustom jButtonH10;
    public BoutonCustom jButtonH2;
    public BoutonCustom jButtonH3;
    public BoutonCustom jButtonH4;
    public BoutonCustom jButtonH5;
    public BoutonCustom jButtonH6;
    public BoutonCustom jButtonH7;
    public BoutonCustom jButtonH8;
    public BoutonCustom jButtonH9;
    public BoutonCustom jButtonI1;
    public BoutonCustom jButtonI10;
    public BoutonCustom jButtonI2;
    public BoutonCustom jButtonI3;
    public BoutonCustom jButtonI4;
    public BoutonCustom jButtonI5;
    public BoutonCustom jButtonI6;
    public BoutonCustom jButtonI7;
    public BoutonCustom jButtonI8;
    public BoutonCustom jButtonI9;
    public BoutonCustom jButtonJ1;
    public BoutonCustom jButtonJ10;
    public BoutonCustom jButtonJ2;
    public BoutonCustom jButtonJ3;
    public BoutonCustom jButtonJ4;
    public BoutonCustom jButtonJ5;
    public BoutonCustom jButtonJ6;
    public BoutonCustom jButtonJ7;
    public BoutonCustom jButtonJ8;
    public BoutonCustom jButtonJ9;
    //Boutons de la section Mes Navires
    public JButton jButtonContreTorpilleur1;
    public JButton jButtonContreTorpilleur2;
    public JButton jButtonContreTorpilleur3;
    public JButton jButtonCroiseur1;
    public JButton jButtonCroiseur2;
    public JButton jButtonCroiseur3;
    public JButton jButtonCroiseur4;
    public JButton jButtonPorteAvion1;
    public JButton jButtonPorteAvion2;
    public JButton jButtonPorteAvion3;
    public JButton jButtonPorteAvion4;
    public JButton jButtonPorteAvion5;
    public JButton jButtonSousMarin1;
    public JButton jButtonSousMarin2;
    public JButton jButtonSousMarin3;
    public JButton jButtonTorpilleur1;
    public JButton jButtonTorpilleur2;
    //Boutons de la section Mes Navires
    public BoutonCustom jButtonContreTorpilleur1Adv;
    public BoutonCustom jButtonContreTorpilleur2Adv;
    public BoutonCustom jButtonContreTorpilleur3Adv;
    public BoutonCustom jButtonCroiseur1Adv;
    public BoutonCustom jButtonCroiseur2Adv;
    public BoutonCustom jButtonCroiseur3Adv;
    public BoutonCustom jButtonCroiseur4Adv;
    public BoutonCustom jButtonPorteAvion1Adv;
    public BoutonCustom jButtonPorteAvion2Adv;
    public BoutonCustom jButtonPorteAvion3Adv;
    public BoutonCustom jButtonPorteAvion4Adv;
    public BoutonCustom jButtonPorteAvion5Adv;
    public BoutonCustom jButtonSousMarin1Adv;
    public BoutonCustom jButtonSousMarin2Adv;
    public BoutonCustom jButtonSousMarin3Adv;
    public BoutonCustom jButtonTorpilleur1Adv;
    public BoutonCustom jButtonTorpilleur2Adv;
    //Etiquette des lignes et colonnes
    protected javax.swing.JLabel lbl1;
    protected javax.swing.JLabel lbl10;
    protected javax.swing.JLabel lbl2;
    protected javax.swing.JLabel lbl3;
    protected javax.swing.JLabel lbl4;
    protected javax.swing.JLabel lbl5;
    protected javax.swing.JLabel lbl6;
    protected javax.swing.JLabel lbl7;
    protected javax.swing.JLabel lbl8;
    protected javax.swing.JLabel lbl9;
    protected javax.swing.JLabel lblA;
    protected javax.swing.JLabel lblAdv1;
    protected javax.swing.JLabel lblAdv10;
    protected javax.swing.JLabel lblAdv2;
    protected javax.swing.JLabel lblAdv3;
    protected javax.swing.JLabel lblAdv4;
    protected javax.swing.JLabel lblAdv5;
    protected javax.swing.JLabel lblAdv6;
    protected javax.swing.JLabel lblAdv7;
    protected javax.swing.JLabel lblAdv8;
    protected javax.swing.JLabel lblAdv9;
    protected javax.swing.JLabel lblAdvA;
    protected javax.swing.JLabel lblAdvB;
    protected javax.swing.JLabel lblAdvC;
    protected javax.swing.JLabel lblAdvD;
    protected javax.swing.JLabel lblAdvE;
    protected javax.swing.JLabel lblAdvF;
    protected javax.swing.JLabel lblAdvG;
    protected javax.swing.JLabel lblAdvH;
    protected javax.swing.JLabel lblAdvI;
    protected javax.swing.JLabel lblAdvJ;
    protected javax.swing.JLabel lblB;
    protected javax.swing.JLabel lblC;
    protected javax.swing.JLabel lblD;
    protected javax.swing.JLabel lblE;
    protected javax.swing.JLabel lblF;
    protected javax.swing.JLabel lblG;
    protected javax.swing.JLabel lblH;
    protected javax.swing.JLabel lblI;
    protected javax.swing.JLabel lblJ;
    //Panneau contenant les boutons et les etiquettes
    public javax.swing.JPanel pnlCarteAdversaire;
    public javax.swing.JPanel pnlCarteJoueur;
    public javax.swing.JPanel pnlContourAdversaire;
    public javax.swing.JPanel pnlContourCarteJoueur;
    public javax.swing.JPanel pnlContourMesBateaux;
    protected javax.swing.JPanel pnlMesBateaux;
    //Panneau deroulant et zone de texte 
    protected javax.swing.JScrollPane jScrollJournalisation;
    public javax.swing.JTextArea txtJournalisation;
    protected javax.swing.JLabel lblImageFond;
    
    public void init_mapBoutonsJoueur() {
        mapBoutonsJoueur = new BoutonCustom[100];

        mapBoutonsJoueur[0] = jButtonA1;
        mapBoutonsJoueur[1] = jButtonB1;
        mapBoutonsJoueur[2] = jButtonC1;
        mapBoutonsJoueur[3] = jButtonD1;
        mapBoutonsJoueur[4] = jButtonE1;
        mapBoutonsJoueur[5] = jButtonF1;
        mapBoutonsJoueur[6] = jButtonG1;
        mapBoutonsJoueur[7] = jButtonH1;
        mapBoutonsJoueur[8] = jButtonI1;
        mapBoutonsJoueur[9] = jButtonJ1;

        mapBoutonsJoueur[10] = jButtonA2;
        mapBoutonsJoueur[11] = jButtonB2;
        mapBoutonsJoueur[12] = jButtonC2;
        mapBoutonsJoueur[13] = jButtonD2;
        mapBoutonsJoueur[14] = jButtonE2;
        mapBoutonsJoueur[15] = jButtonF2;
        mapBoutonsJoueur[16] = jButtonG2;
        mapBoutonsJoueur[17] = jButtonH2;
        mapBoutonsJoueur[18] = jButtonI2;
        mapBoutonsJoueur[19] = jButtonJ2;

        mapBoutonsJoueur[20] = jButtonA3;
        mapBoutonsJoueur[21] = jButtonB3;
        mapBoutonsJoueur[22] = jButtonC3;
        mapBoutonsJoueur[23] = jButtonD3;
        mapBoutonsJoueur[24] = jButtonE3;
        mapBoutonsJoueur[25] = jButtonF3;
        mapBoutonsJoueur[26] = jButtonG3;
        mapBoutonsJoueur[27] = jButtonH3;
        mapBoutonsJoueur[28] = jButtonI3;
        mapBoutonsJoueur[29] = jButtonJ3;

        mapBoutonsJoueur[30] = jButtonA4;
        mapBoutonsJoueur[31] = jButtonB4;
        mapBoutonsJoueur[32] = jButtonC4;
        mapBoutonsJoueur[33] = jButtonD4;
        mapBoutonsJoueur[34] = jButtonE4;
        mapBoutonsJoueur[35] = jButtonF4;
        mapBoutonsJoueur[36] = jButtonG4;
        mapBoutonsJoueur[37] = jButtonH4;
        mapBoutonsJoueur[38] = jButtonI4;
        mapBoutonsJoueur[39] = jButtonJ4;

        mapBoutonsJoueur[40] = jButtonA5;
        mapBoutonsJoueur[41] = jButtonB5;
        mapBoutonsJoueur[42] = jButtonC5;
        mapBoutonsJoueur[43] = jButtonD5;
        mapBoutonsJoueur[44] = jButtonE5;
        mapBoutonsJoueur[45] = jButtonF5;
        mapBoutonsJoueur[46] = jButtonG5;
        mapBoutonsJoueur[47] = jButtonH5;
        mapBoutonsJoueur[48] = jButtonI5;
        mapBoutonsJoueur[49] = jButtonJ5;

        mapBoutonsJoueur[50] = jButtonA6;
        mapBoutonsJoueur[51] = jButtonB6;
        mapBoutonsJoueur[52] = jButtonC6;
        mapBoutonsJoueur[53] = jButtonD6;
        mapBoutonsJoueur[54] = jButtonE6;
        mapBoutonsJoueur[55] = jButtonF6;
        mapBoutonsJoueur[56] = jButtonG6;
        mapBoutonsJoueur[57] = jButtonH6;
        mapBoutonsJoueur[58] = jButtonI6;
        mapBoutonsJoueur[59] = jButtonJ6;

        mapBoutonsJoueur[60] = jButtonA7;
        mapBoutonsJoueur[61] = jButtonB7;
        mapBoutonsJoueur[62] = jButtonC7;
        mapBoutonsJoueur[63] = jButtonD7;
        mapBoutonsJoueur[64] = jButtonE7;
        mapBoutonsJoueur[65] = jButtonF7;
        mapBoutonsJoueur[66] = jButtonG7;
        mapBoutonsJoueur[67] = jButtonH7;
        mapBoutonsJoueur[68] = jButtonI7;
        mapBoutonsJoueur[69] = jButtonJ7;

        mapBoutonsJoueur[70] = jButtonA8;
        mapBoutonsJoueur[71] = jButtonB8;
        mapBoutonsJoueur[72] = jButtonC8;
        mapBoutonsJoueur[73] = jButtonD8;
        mapBoutonsJoueur[74] = jButtonE8;
        mapBoutonsJoueur[75] = jButtonF8;
        mapBoutonsJoueur[76] = jButtonG8;
        mapBoutonsJoueur[77] = jButtonH8;
        mapBoutonsJoueur[78] = jButtonI8;
        mapBoutonsJoueur[79] = jButtonJ8;

        mapBoutonsJoueur[80] = jButtonA9;
        mapBoutonsJoueur[81] = jButtonB9;
        mapBoutonsJoueur[82] = jButtonC9;
        mapBoutonsJoueur[83] = jButtonD9;
        mapBoutonsJoueur[84] = jButtonE9;
        mapBoutonsJoueur[85] = jButtonF9;
        mapBoutonsJoueur[86] = jButtonG9;
        mapBoutonsJoueur[87] = jButtonH9;
        mapBoutonsJoueur[88] = jButtonI9;
        mapBoutonsJoueur[89] = jButtonJ9;

        mapBoutonsJoueur[90] = jButtonA10;
        mapBoutonsJoueur[91] = jButtonB10;
        mapBoutonsJoueur[92] = jButtonC10;
        mapBoutonsJoueur[93] = jButtonD10;
        mapBoutonsJoueur[94] = jButtonE10;
        mapBoutonsJoueur[95] = jButtonF10;
        mapBoutonsJoueur[96] = jButtonG10;
        mapBoutonsJoueur[97] = jButtonH10;
        mapBoutonsJoueur[98] = jButtonI10;
        mapBoutonsJoueur[99] = jButtonJ10;

    }

    public void init_mapBoutonsAdv() {
        mapBoutonsAdv = new BoutonCustom[100];

        mapBoutonsAdv[0] = jButton1A;
        mapBoutonsAdv[1] = jButton1B;
        mapBoutonsAdv[2] = jButton1C;
        mapBoutonsAdv[3] = jButton1D;
        mapBoutonsAdv[4] = jButton1E;
        mapBoutonsAdv[5] = jButton1F;
        mapBoutonsAdv[6] = jButton1G;
        mapBoutonsAdv[7] = jButton1H;
        mapBoutonsAdv[8] = jButton1I;
        mapBoutonsAdv[9] = jButton1J;

        mapBoutonsAdv[10] = jButton2A;
        mapBoutonsAdv[11] = jButton2B;
        mapBoutonsAdv[12] = jButton2C;
        mapBoutonsAdv[13] = jButton2D;
        mapBoutonsAdv[14] = jButton2E;
        mapBoutonsAdv[15] = jButton2F;
        mapBoutonsAdv[16] = jButton2G;
        mapBoutonsAdv[17] = jButton2H;
        mapBoutonsAdv[18] = jButton2I;
        mapBoutonsAdv[19] = jButton2J;

        mapBoutonsAdv[20] = jButton3A;
        mapBoutonsAdv[21] = jButton3B;
        mapBoutonsAdv[22] = jButton3C;
        mapBoutonsAdv[23] = jButton3D;
        mapBoutonsAdv[24] = jButton3E;
        mapBoutonsAdv[25] = jButton3F;
        mapBoutonsAdv[26] = jButton3G;
        mapBoutonsAdv[27] = jButton3H;
        mapBoutonsAdv[28] = jButton3I;
        mapBoutonsAdv[29] = jButton3J;

        mapBoutonsAdv[30] = jButton4A;
        mapBoutonsAdv[31] = jButton4B;
        mapBoutonsAdv[32] = jButton4C;
        mapBoutonsAdv[33] = jButton4D;
        mapBoutonsAdv[34] = jButton4E;
        mapBoutonsAdv[35] = jButton4F;
        mapBoutonsAdv[36] = jButton4G;
        mapBoutonsAdv[37] = jButton4H;
        mapBoutonsAdv[38] = jButton4I;
        mapBoutonsAdv[39] = jButton4J;

        mapBoutonsAdv[40] = jButton5A;
        mapBoutonsAdv[41] = jButton5B;
        mapBoutonsAdv[42] = jButton5C;
        mapBoutonsAdv[43] = jButton5D;
        mapBoutonsAdv[44] = jButton5E;
        mapBoutonsAdv[45] = jButton5F;
        mapBoutonsAdv[46] = jButton5G;
        mapBoutonsAdv[47] = jButton5H;
        mapBoutonsAdv[48] = jButton5I;
        mapBoutonsAdv[49] = jButton5J;

        mapBoutonsAdv[50] = jButton6A;
        mapBoutonsAdv[51] = jButton6B;
        mapBoutonsAdv[52] = jButton6C;
        mapBoutonsAdv[53] = jButton6D;
        mapBoutonsAdv[54] = jButton6E;
        mapBoutonsAdv[55] = jButton6F;
        mapBoutonsAdv[56] = jButton6G;
        mapBoutonsAdv[57] = jButton6H;
        mapBoutonsAdv[58] = jButton6I;
        mapBoutonsAdv[59] = jButton6J;

        mapBoutonsAdv[60] = jButton7A;
        mapBoutonsAdv[61] = jButton7B;
        mapBoutonsAdv[62] = jButton7C;
        mapBoutonsAdv[63] = jButton7D;
        mapBoutonsAdv[64] = jButton7E;
        mapBoutonsAdv[65] = jButton7F;
        mapBoutonsAdv[66] = jButton7G;
        mapBoutonsAdv[67] = jButton7H;
        mapBoutonsAdv[68] = jButton7I;
        mapBoutonsAdv[69] = jButton7J;

        mapBoutonsAdv[70] = jButton8A;
        mapBoutonsAdv[71] = jButton8B;
        mapBoutonsAdv[72] = jButton8C;
        mapBoutonsAdv[73] = jButton8D;
        mapBoutonsAdv[74] = jButton8E;
        mapBoutonsAdv[75] = jButton8F;
        mapBoutonsAdv[76] = jButton8G;
        mapBoutonsAdv[77] = jButton8H;
        mapBoutonsAdv[78] = jButton8I;
        mapBoutonsAdv[79] = jButton8J;

        mapBoutonsAdv[80] = jButton9A;
        mapBoutonsAdv[81] = jButton9B;
        mapBoutonsAdv[82] = jButton9C;
        mapBoutonsAdv[83] = jButton9D;
        mapBoutonsAdv[84] = jButton9E;
        mapBoutonsAdv[85] = jButton9F;
        mapBoutonsAdv[86] = jButton9G;
        mapBoutonsAdv[87] = jButton9H;
        mapBoutonsAdv[88] = jButton9I;
        mapBoutonsAdv[89] = jButton9J;

        mapBoutonsAdv[90] = jButton10A;
        mapBoutonsAdv[91] = jButton10B;
        mapBoutonsAdv[92] = jButton10C;
        mapBoutonsAdv[93] = jButton10D;
        mapBoutonsAdv[94] = jButton10E;
        mapBoutonsAdv[95] = jButton10F;
        mapBoutonsAdv[96] = jButton10G;
        mapBoutonsAdv[97] = jButton10H;
        mapBoutonsAdv[98] = jButton10I;
        mapBoutonsAdv[99] = jButton10J;

    }
    
    protected void initComponents() throws Exception {
        
        lblImageFond = new javax.swing.JLabel();
        pnlContourCarteJoueur = new javax.swing.JPanel();
        pnlCarteJoueur = new javax.swing.JPanel();
        jButtonA1 = new BoutonCustom(new Position('a',1));
        jButtonA2 = new BoutonCustom(new Position('a',2));
        jButtonA3 = new BoutonCustom(new Position('a',3));
        jButtonA4 = new BoutonCustom(new Position('a',4));
        jButtonA5 = new BoutonCustom(new Position('a',5));
        jButtonA6 = new BoutonCustom(new Position('a',6));
        jButtonA7 = new BoutonCustom(new Position('a',7));
        jButtonA8 = new BoutonCustom(new Position('a',8));
        jButtonA9 = new BoutonCustom(new Position('a',9));
        jButtonA10 = new BoutonCustom(new Position('a',10));
        jButtonB1 = new BoutonCustom(new Position('b',1));
        jButtonB2 = new BoutonCustom(new Position('b',2));
        jButtonB3 = new BoutonCustom(new Position('b',3));
        jButtonB4 = new BoutonCustom(new Position('b',4));
        jButtonB5 = new BoutonCustom(new Position('b',5));
        jButtonB6 = new BoutonCustom(new Position('b',6));
        jButtonB7 = new BoutonCustom(new Position('b',7));
        jButtonB8 = new BoutonCustom(new Position('b',8));
        jButtonB9 = new BoutonCustom(new Position('b',9));
        jButtonB10 = new BoutonCustom(new Position('b',10));
        jButtonC1 = new BoutonCustom(new Position('c',1));
        jButtonC2 = new BoutonCustom(new Position('c',2));
        jButtonC3 = new BoutonCustom(new Position('c',3));
        jButtonC4 = new BoutonCustom(new Position('c',4));
        jButtonC5 = new BoutonCustom(new Position('c',5));
        jButtonC6 = new BoutonCustom(new Position('c',6));
        jButtonC7 = new BoutonCustom(new Position('c',7));
        jButtonC8 = new BoutonCustom(new Position('c',8));
        jButtonC9 = new BoutonCustom(new Position('c',9));
        jButtonC10 = new BoutonCustom(new Position('c',10));
        jButtonD1 = new BoutonCustom(new Position('d',1));
        jButtonD2 = new BoutonCustom(new Position('d',2));
        jButtonD3 = new BoutonCustom(new Position('d',3));
        jButtonD4 = new BoutonCustom(new Position('d',4));
        jButtonD5 = new BoutonCustom(new Position('d',5));
        jButtonD6 = new BoutonCustom(new Position('d',6));
        jButtonD7 = new BoutonCustom(new Position('d',7));
        jButtonD8 = new BoutonCustom(new Position('d',8));
        jButtonD9 = new BoutonCustom(new Position('d',9));
        jButtonD10 = new BoutonCustom(new Position('d',10));
        jButtonE1 = new BoutonCustom(new Position('e',1));
        jButtonE2 = new BoutonCustom(new Position('e',2));
        jButtonE3 = new BoutonCustom(new Position('e',3));
        jButtonE4 = new BoutonCustom(new Position('e',4));
        jButtonE5 = new BoutonCustom(new Position('e',5));
        jButtonE6 = new BoutonCustom(new Position('e',6));
        jButtonE7 = new BoutonCustom(new Position('e',7));
        jButtonE8 = new BoutonCustom(new Position('e',8));
        jButtonE9 = new BoutonCustom(new Position('e',9));
        jButtonE10 = new BoutonCustom(new Position('e',10));
        jButtonF1 = new BoutonCustom(new Position('f',1));
        jButtonF2 = new BoutonCustom(new Position('f',2));
        jButtonF3 = new BoutonCustom(new Position('f',3));
        jButtonF4 = new BoutonCustom(new Position('f',4));
        jButtonF5 = new BoutonCustom(new Position('f',5));
        jButtonF6 = new BoutonCustom(new Position('f',6));
        jButtonF7 = new BoutonCustom(new Position('f',7));
        jButtonF8 = new BoutonCustom(new Position('f',8));
        jButtonF9 = new BoutonCustom(new Position('f',9));
        jButtonF10 = new BoutonCustom(new Position('f',10));
        jButtonG1 = new BoutonCustom(new Position('g',1));
        jButtonG2 = new BoutonCustom(new Position('g',2));
        jButtonG3 = new BoutonCustom(new Position('g',3));
        jButtonG4 = new BoutonCustom(new Position('g',4));
        jButtonG5 = new BoutonCustom(new Position('g',5));
        jButtonG6 = new BoutonCustom(new Position('g',6));
        jButtonG7 = new BoutonCustom(new Position('g',7));
        jButtonG8 = new BoutonCustom(new Position('g',8));
        jButtonG9 = new BoutonCustom(new Position('g',9));
        jButtonG10 = new BoutonCustom(new Position('g',10));
        jButtonH1 = new BoutonCustom(new Position('h',1));
        jButtonH2 = new BoutonCustom(new Position('h',2));
        jButtonH3 = new BoutonCustom(new Position('h',3));
        jButtonH4 = new BoutonCustom(new Position('h',4));
        jButtonH5 = new BoutonCustom(new Position('h',5));
        jButtonH6 = new BoutonCustom(new Position('h',6));
        jButtonH7 = new BoutonCustom(new Position('h',7));
        jButtonH8 = new BoutonCustom(new Position('h',8));
        jButtonH9 = new BoutonCustom(new Position('h',9));
        jButtonH10 = new BoutonCustom(new Position('h',10));
        jButtonI1 = new BoutonCustom(new Position('i',1));
        jButtonI2 = new BoutonCustom(new Position('i',2));
        jButtonI3 = new BoutonCustom(new Position('i',3));
        jButtonI4 = new BoutonCustom(new Position('i',4));
        jButtonI5 = new BoutonCustom(new Position('i',5));
        jButtonI6 = new BoutonCustom(new Position('i',6));
        jButtonI7 = new BoutonCustom(new Position('i',7));
        jButtonI8 = new BoutonCustom(new Position('i',8));
        jButtonI9 = new BoutonCustom(new Position('i',9));
        jButtonI10 = new BoutonCustom(new Position('i',10));
        jButtonJ1 = new BoutonCustom(new Position('j',1));
        jButtonJ2 = new BoutonCustom(new Position('j',2));
        jButtonJ3 = new BoutonCustom(new Position('j',3));
        jButtonJ4 = new BoutonCustom(new Position('j',4));
        jButtonJ5 = new BoutonCustom(new Position('j',5));
        jButtonJ6 = new BoutonCustom(new Position('j',6));
        jButtonJ7 = new BoutonCustom(new Position('j',7));
        jButtonJ8 = new BoutonCustom(new Position('j',8));
        jButtonJ9 = new BoutonCustom(new Position('j',9));
        jButtonJ10 = new BoutonCustom(new Position('j',10));
        lbl1 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();
        lbl4 = new javax.swing.JLabel();
        lbl5 = new javax.swing.JLabel();
        lbl6 = new javax.swing.JLabel();
        lbl7 = new javax.swing.JLabel();
        lbl8 = new javax.swing.JLabel();
        lbl9 = new javax.swing.JLabel();
        lbl10 = new javax.swing.JLabel();
        lblA = new javax.swing.JLabel();
        lblB = new javax.swing.JLabel();
        lblC = new javax.swing.JLabel();
        lblD = new javax.swing.JLabel();
        lblE = new javax.swing.JLabel();
        lblF = new javax.swing.JLabel();
        lblG = new javax.swing.JLabel();
        lblH = new javax.swing.JLabel();
        lblI = new javax.swing.JLabel();
        lblJ = new javax.swing.JLabel();
        pnlContourAdversaire = new javax.swing.JPanel();
        pnlCarteAdversaire = new javax.swing.JPanel();
        jButton1A = new BoutonCustom(new Position('a',1));
        jButton2A = new BoutonCustom(new Position('a',2));
        jButton3A = new BoutonCustom(new Position('a',3));
        jButton4A = new BoutonCustom(new Position('a',4));
        jButton5A = new BoutonCustom(new Position('a',5));
        jButton6A = new BoutonCustom(new Position('a',6));
        jButton7A = new BoutonCustom(new Position('a',7));
        jButton8A = new BoutonCustom(new Position('a',8));
        jButton9A = new BoutonCustom(new Position('a',9));
        jButton10A = new BoutonCustom(new Position('a',10));
        jButton1B = new BoutonCustom(new Position('b',1));
        jButton2B = new BoutonCustom(new Position('b',2));
        jButton3B = new BoutonCustom(new Position('b',3));
        jButton4B = new BoutonCustom(new Position('b',4));
        jButton5B = new BoutonCustom(new Position('b',5));
        jButton6B = new BoutonCustom(new Position('b',6));
        jButton7B = new BoutonCustom(new Position('b',7));
        jButton8B = new BoutonCustom(new Position('b',8));
        jButton9B = new BoutonCustom(new Position('b',9));
        jButton10B = new BoutonCustom(new Position('b',10));
        jButton1C = new BoutonCustom(new Position('c',1));
        jButton2C = new BoutonCustom(new Position('c',2));
        jButton3C = new BoutonCustom(new Position('c',3));
        jButton4C = new BoutonCustom(new Position('c',4));
        jButton5C = new BoutonCustom(new Position('c',5));
        jButton6C = new BoutonCustom(new Position('c',6));
        jButton7C = new BoutonCustom(new Position('c',7));
        jButton8C = new BoutonCustom(new Position('c',8));
        jButton9C = new BoutonCustom(new Position('c',9));
        jButton10C = new BoutonCustom(new Position('c',10));
        jButton1D = new BoutonCustom(new Position('d',1));
        jButton2D = new BoutonCustom(new Position('d',2));
        jButton3D = new BoutonCustom(new Position('d',3));
        jButton4D = new BoutonCustom(new Position('d',4));
        jButton5D = new BoutonCustom(new Position('d',5));
        jButton6D = new BoutonCustom(new Position('d',6));
        jButton7D = new BoutonCustom(new Position('d',7));
        jButton8D = new BoutonCustom(new Position('d',8));
        jButton9D = new BoutonCustom(new Position('d',9));
        jButton10D = new BoutonCustom(new Position('d',10));
        jButton1E = new BoutonCustom(new Position('e',1));
        jButton2E = new BoutonCustom(new Position('e',2));
        jButton3E = new BoutonCustom(new Position('e',3));
        jButton4E = new BoutonCustom(new Position('e',4));
        jButton5E = new BoutonCustom(new Position('e',5));
        jButton6E = new BoutonCustom(new Position('e',6));
        jButton7E = new BoutonCustom(new Position('e',7));
        jButton8E = new BoutonCustom(new Position('e',8));
        jButton9E = new BoutonCustom(new Position('e',9));
        jButton10E = new BoutonCustom(new Position('e',10));
        jButton1F = new BoutonCustom(new Position('f',1));
        jButton2F = new BoutonCustom(new Position('f',2));
        jButton3F = new BoutonCustom(new Position('f',3));
        jButton4F = new BoutonCustom(new Position('f',4));
        jButton5F = new BoutonCustom(new Position('f',5));
        jButton6F = new BoutonCustom(new Position('f',6));
        jButton7F = new BoutonCustom(new Position('f',7));
        jButton8F = new BoutonCustom(new Position('f',8));
        jButton9F = new BoutonCustom(new Position('f',9));
        jButton10F = new BoutonCustom(new Position('f',10));
        jButton1G = new BoutonCustom(new Position('g',1));
        jButton2G = new BoutonCustom(new Position('g',2));
        jButton3G = new BoutonCustom(new Position('g',3));
        jButton4G = new BoutonCustom(new Position('g',4));
        jButton5G = new BoutonCustom(new Position('g',5));
        jButton6G = new BoutonCustom(new Position('g',6));
        jButton7G = new BoutonCustom(new Position('g',7));
        jButton8G = new BoutonCustom(new Position('g',8));
        jButton9G = new BoutonCustom(new Position('g',9));
        jButton10G = new BoutonCustom(new Position('g',10));
        jButton1H = new BoutonCustom(new Position('h',1));
        jButton2H = new BoutonCustom(new Position('h',2));
        jButton3H = new BoutonCustom(new Position('h',3));
        jButton4H = new BoutonCustom(new Position('h',4));
        jButton5H = new BoutonCustom(new Position('h',5));
        jButton6H = new BoutonCustom(new Position('h',6));
        jButton7H = new BoutonCustom(new Position('h',7));
        jButton8H = new BoutonCustom(new Position('h',8));
        jButton9H = new BoutonCustom(new Position('h',9));
        jButton10H = new BoutonCustom(new Position('h',10));
        jButton1I = new BoutonCustom(new Position('i',1));
        jButton2I = new BoutonCustom(new Position('i',2));
        jButton3I = new BoutonCustom(new Position('i',3));
        jButton4I = new BoutonCustom(new Position('i',4));
        jButton5I = new BoutonCustom(new Position('i',5));
        jButton6I = new BoutonCustom(new Position('i',6));
        jButton7I = new BoutonCustom(new Position('i',7));
        jButton8I = new BoutonCustom(new Position('i',8));
        jButton9I = new BoutonCustom(new Position('i',9));
        jButton10I = new BoutonCustom(new Position('i',10));
        jButton1J = new BoutonCustom(new Position('j',1));
        jButton2J = new BoutonCustom(new Position('j',2));
        jButton3J = new BoutonCustom(new Position('j',3));
        jButton4J = new BoutonCustom(new Position('j',4));
        jButton5J = new BoutonCustom(new Position('j',5));
        jButton6J = new BoutonCustom(new Position('j',6));
        jButton7J = new BoutonCustom(new Position('j',7));
        jButton8J = new BoutonCustom(new Position('j',8));
        jButton9J = new BoutonCustom(new Position('j',9));
        jButton10J = new BoutonCustom(new Position('j',10));
        lblAdv1 = new javax.swing.JLabel();
        lblAdv2 = new javax.swing.JLabel();
        lblAdv3 = new javax.swing.JLabel();
        lblAdv4 = new javax.swing.JLabel();
        lblAdv5 = new javax.swing.JLabel();
        lblAdv6 = new javax.swing.JLabel();
        lblAdv7 = new javax.swing.JLabel();
        lblAdv8 = new javax.swing.JLabel();
        lblAdv9 = new javax.swing.JLabel();
        lblAdv10 = new javax.swing.JLabel();
        lblAdvA = new javax.swing.JLabel();
        lblAdvB = new javax.swing.JLabel();
        lblAdvC = new javax.swing.JLabel();
        lblAdvD = new javax.swing.JLabel();
        lblAdvE = new javax.swing.JLabel();
        lblAdvF = new javax.swing.JLabel();
        lblAdvG = new javax.swing.JLabel();
        lblAdvH = new javax.swing.JLabel();
        lblAdvI = new javax.swing.JLabel();
        lblAdvJ = new javax.swing.JLabel();
        jScrollJournalisation = new javax.swing.JScrollPane();
        txtJournalisation = new javax.swing.JTextArea();
        btnDemarrerPartie = new JButton();
        btnFinPartie = new JButton();
        btnSauvegarder = new JButton();
        btnReinitialise = new JButton();
        btnChangerOrientation = new JButton();
        pnlContourMesBateaux = new javax.swing.JPanel();
        pnlMesBateaux = new javax.swing.JPanel();
        jButtonPorteAvion1 = new JButton();
        jButtonPorteAvion2 = new JButton();
        jButtonPorteAvion3 = new JButton();
        jButtonPorteAvion4 = new JButton();
        jButtonPorteAvion5 = new JButton();
        jButtonCroiseur1 = new JButton();
        jButtonCroiseur2 = new JButton();
        jButtonCroiseur3 = new JButton();
        jButtonCroiseur4 = new JButton();
        jButtonContreTorpilleur1 = new JButton();
        jButtonContreTorpilleur2 = new JButton();
        jButtonContreTorpilleur3 = new JButton();
        jButtonTorpilleur1 = new JButton();
        jButtonTorpilleur2 = new JButton();
        jButtonSousMarin1 = new JButton();
        jButtonSousMarin2 = new JButton();
        jButtonSousMarin3 = new JButton();

        setUndecorated(false); 
        setResizable(false);
        setSize(new java.awt.Dimension(800, 600));

        pnlContourCarteJoueur.setBackground(new java.awt.Color(255, 255, 255));
        pnlContourCarteJoueur.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true), "Base Joueur", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 15))); // NOI18N

        pnlCarteJoueur.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        lbl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl1.setText("A");

        lbl2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl2.setText("B");

        lbl3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl3.setText("C");

        lbl4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl4.setText("D");

        lbl5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl5.setText("E");

        lbl6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl6.setText("F");

        lbl7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl7.setText("G");

        lbl8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl8.setText("H");

        lbl9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl9.setText("I");

        lbl10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl10.setText("J");

        lblA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblA.setText("1");

        lblB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblB.setText("2");

        lblC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblC.setText("3");

        lblD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblD.setText("4");

        lblE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblE.setText("5");

        lblF.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblF.setText("6");

        lblG.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblG.setText("7");

        lblH.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblH.setText("8");

        lblI.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblI.setText("9");

        lblJ.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblJ.setText("10");

        javax.swing.GroupLayout pnlCarteJoueurLayout = new javax.swing.GroupLayout(pnlCarteJoueur);
        pnlCarteJoueur.setLayout(pnlCarteJoueurLayout);
        pnlCarteJoueurLayout.setHorizontalGroup(
            pnlCarteJoueurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCarteJoueurLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCarteJoueurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblA, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblB, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblC, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblD, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblE, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblF, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblG, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblH, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblI, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblJ, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCarteJoueurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCarteJoueurLayout.createSequentialGroup()
                        .addComponent(jButtonA1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButtonB1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButtonC1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButtonD1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButtonE1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButtonF1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButtonG1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButtonH1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButtonI1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButtonJ1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlCarteJoueurLayout.createSequentialGroup()
                        .addComponent(jButtonA2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButtonB2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButtonC2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButtonD2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButtonE2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButtonF2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButtonG2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButtonH2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButtonI2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButtonJ2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlCarteJoueurLayout.createSequentialGroup()
                        .addComponent(jButtonA3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButtonB3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButtonC3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButtonD3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButtonE3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButtonF3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButtonG3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButtonH3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButtonI3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButtonJ3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlCarteJoueurLayout.createSequentialGroup()
                        .addComponent(jButtonA4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButtonB4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButtonC4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButtonD4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButtonE4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButtonF4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButtonG4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButtonH4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButtonI4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButtonJ4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlCarteJoueurLayout.createSequentialGroup()
                        .addComponent(jButtonA5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButtonB5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButtonC5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButtonD5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButtonE5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButtonF5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButtonG5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButtonH5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButtonI5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButtonJ5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlCarteJoueurLayout.createSequentialGroup()
                        .addComponent(jButtonA6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButtonB6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButtonC6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButtonD6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButtonE6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButtonF6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButtonG6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButtonH6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButtonI6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButtonJ6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlCarteJoueurLayout.createSequentialGroup()
                        .addComponent(jButtonA7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButtonB7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButtonC7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButtonD7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButtonE7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButtonF7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButtonG7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButtonH7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButtonI7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButtonJ7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlCarteJoueurLayout.createSequentialGroup()
                        .addComponent(jButtonA8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButtonB8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButtonC8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButtonD8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButtonE8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButtonF8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButtonG8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButtonH8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButtonI8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButtonJ8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlCarteJoueurLayout.createSequentialGroup()
                        .addComponent(jButtonA9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButtonB9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButtonC9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButtonD9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButtonE9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButtonF9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButtonG9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButtonH9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButtonI9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButtonJ9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlCarteJoueurLayout.createSequentialGroup()
                        .addComponent(jButtonA10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButtonB10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButtonC10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButtonD10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButtonE10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButtonF10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButtonG10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButtonH10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButtonI10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButtonJ10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCarteJoueurLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lbl4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lbl5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lbl6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lbl7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lbl8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lbl9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lbl10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlCarteJoueurLayout.setVerticalGroup(
            pnlCarteJoueurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCarteJoueurLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(pnlCarteJoueurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl1)
                    .addComponent(lbl2)
                    .addComponent(lbl3)
                    .addComponent(lbl4)
                    .addComponent(lbl5)
                    .addComponent(lbl6)
                    .addComponent(lbl7)
                    .addComponent(lbl8)
                    .addComponent(lbl9)
                    .addComponent(lbl10))
                .addGap(0, 0, 0)
                .addGroup(pnlCarteJoueurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonB1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonC1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonD1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonE1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonF1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonG1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonH1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonI1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonJ1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblA, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonA1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(pnlCarteJoueurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonA2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonB2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonC2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonD2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonE2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonF2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonG2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonH2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonI2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonJ2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblB, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnlCarteJoueurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonA3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonB3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonC3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonD3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonE3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonF3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonG3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonH3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonI3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonJ3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblC, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnlCarteJoueurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonA4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonB4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonC4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonD4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonE4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonF4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonG4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonH4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonI4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonJ4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblD, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnlCarteJoueurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonA5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonB5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonC5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonD5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonE5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonF5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonG5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonH5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonI5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonJ5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblE, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnlCarteJoueurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonA6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonB6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonC6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonD6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonE6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonF6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonG6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonH6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonI6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonJ6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblF, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnlCarteJoueurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonA7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonB7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonC7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonD7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonE7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonF7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonG7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonH7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonI7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonJ7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblG, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnlCarteJoueurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonA8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonB8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonC8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonD8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonE8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonF8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonG8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonH8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonI8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonJ8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblH, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnlCarteJoueurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonA9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonB9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonC9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonD9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonE9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonF9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonG9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonH9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonI9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonJ9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblI, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnlCarteJoueurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonA10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonB10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonC10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonD10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonE10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonF10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonG10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonH10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonI10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonJ10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblJ, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlContourCarteJoueurLayout = new javax.swing.GroupLayout(pnlContourCarteJoueur);
        pnlContourCarteJoueur.setLayout(pnlContourCarteJoueurLayout);
        pnlContourCarteJoueurLayout.setHorizontalGroup(
            pnlContourCarteJoueurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContourCarteJoueurLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlCarteJoueur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlContourCarteJoueurLayout.setVerticalGroup(
            pnlContourCarteJoueurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContourCarteJoueurLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlCarteJoueur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlContourAdversaire.setBackground(new java.awt.Color(255, 255, 255));
        pnlContourAdversaire.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true), "Base AI", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 15))); // NOI18N

        pnlCarteAdversaire.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jButton1A.setFont(new java.awt.Font("Tahoma", 1, 3)); // NOI18N

        lblAdv1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAdv1.setText("A");

        lblAdv2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAdv2.setText("B");

        lblAdv3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAdv3.setText("C");

        lblAdv4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAdv4.setText("D");

        lblAdv5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAdv5.setText("E");

        lblAdv6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAdv6.setText("F");

        lblAdv7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAdv7.setText("G");

        lblAdv8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAdv8.setText("H");

        lblAdv9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAdv9.setText("I");

        lblAdv10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAdv10.setText("J");

        lblAdvA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAdvA.setText("1");

        lblAdvB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAdvB.setText("2");

        lblAdvC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAdvC.setText("3");

        lblAdvD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAdvD.setText("4");

        lblAdvE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAdvE.setText("5");

        lblAdvF.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAdvF.setText("6");

        lblAdvG.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAdvG.setText("7");

        lblAdvH.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAdvH.setText("8");

        lblAdvI.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAdvI.setText("9");

        lblAdvJ.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAdvJ.setText("10");

        javax.swing.GroupLayout pnlCarteAdversaireLayout = new javax.swing.GroupLayout(pnlCarteAdversaire);
        pnlCarteAdversaire.setLayout(pnlCarteAdversaireLayout);
        pnlCarteAdversaireLayout.setHorizontalGroup(
            pnlCarteAdversaireLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCarteAdversaireLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(pnlCarteAdversaireLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCarteAdversaireLayout.createSequentialGroup()
                        .addComponent(lblAdv1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(lblAdv2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(lblAdv3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(lblAdv4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(lblAdv5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(lblAdv6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(lblAdv7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(lblAdv8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(lblAdv9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(lblAdv10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlCarteAdversaireLayout.createSequentialGroup()
                        .addGroup(pnlCarteAdversaireLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlCarteAdversaireLayout.createSequentialGroup()
                                .addComponent(jButton1A, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton1B, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton1C, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton1D, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton1E, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton1F, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton1G, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton1H, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton1I, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton1J, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlCarteAdversaireLayout.createSequentialGroup()
                                .addComponent(jButton2A, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton2B, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton2C, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton2D, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton2E, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton2F, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton2G, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton2H, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton2I, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton2J, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlCarteAdversaireLayout.createSequentialGroup()
                                .addComponent(jButton3A, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton3B, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton3C, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton3D, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton3E, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton3F, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton3G, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton3H, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton3I, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton3J, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlCarteAdversaireLayout.createSequentialGroup()
                                .addComponent(jButton4A, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton4B, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton4C, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton4D, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton4E, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton4F, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton4G, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton4H, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton4I, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton4J, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlCarteAdversaireLayout.createSequentialGroup()
                                .addComponent(jButton5A, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton5B, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton5C, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton5D, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton5E, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton5F, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton5G, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton5H, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton5I, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton5J, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlCarteAdversaireLayout.createSequentialGroup()
                                .addComponent(jButton6A, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton6B, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton6C, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton6D, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton6E, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton6F, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton6G, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton6H, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton6I, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton6J, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlCarteAdversaireLayout.createSequentialGroup()
                                .addComponent(jButton7A, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton7B, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton7C, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton7D, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton7E, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton7F, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton7G, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton7H, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton7I, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton7J, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlCarteAdversaireLayout.createSequentialGroup()
                                .addComponent(jButton8A, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton8B, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton8C, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton8D, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton8E, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton8F, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton8G, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton8H, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton8I, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton8J, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlCarteAdversaireLayout.createSequentialGroup()
                                .addComponent(jButton9A, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton9B, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton9C, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton9D, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton9E, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton9F, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton9G, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton9H, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton9I, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton9J, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlCarteAdversaireLayout.createSequentialGroup()
                                .addComponent(jButton10A, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton10B, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton10C, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton10D, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton10E, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton10F, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton10G, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton10H, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton10I, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton10J, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlCarteAdversaireLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAdvA, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAdvB, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAdvC, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAdvD, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAdvE, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAdvF, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAdvG, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAdvH, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAdvI, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAdvJ, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlCarteAdversaireLayout.setVerticalGroup(
            pnlCarteAdversaireLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCarteAdversaireLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(pnlCarteAdversaireLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAdv1)
                    .addComponent(lblAdv2)
                    .addComponent(lblAdv3)
                    .addComponent(lblAdv4)
                    .addComponent(lblAdv5)
                    .addComponent(lblAdv6)
                    .addComponent(lblAdv7)
                    .addComponent(lblAdv8)
                    .addComponent(lblAdv9)
                    .addComponent(lblAdv10))
                .addGap(1, 1, 1)
                .addGroup(pnlCarteAdversaireLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1A, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1B, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1C, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1D, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1E, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1F, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1G, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1H, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1I, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1J, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAdvA, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnlCarteAdversaireLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2A, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2B, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2C, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2D, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2E, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2F, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2G, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2H, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2I, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2J, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAdvB, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnlCarteAdversaireLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3A, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3B, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3C, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3D, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3E, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3F, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3G, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3H, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3I, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3J, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAdvC, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnlCarteAdversaireLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4A, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4B, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4C, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4D, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4E, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4F, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4G, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4H, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4I, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4J, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAdvD, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnlCarteAdversaireLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5A, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5B, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5C, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5D, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5E, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5F, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5G, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5H, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5I, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5J, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAdvE, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnlCarteAdversaireLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton6A, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6B, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6C, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6D, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6E, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6F, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6G, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6H, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6I, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6J, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAdvF, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnlCarteAdversaireLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton7A, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7B, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7C, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7D, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7E, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7F, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7G, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7H, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7I, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7J, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAdvG, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnlCarteAdversaireLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton8A, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8B, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8C, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8D, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8E, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8F, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8G, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8H, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8I, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8J, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAdvH, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnlCarteAdversaireLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton9A, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9B, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9C, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9D, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9E, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9F, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9G, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9H, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9I, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9J, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAdvI, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnlCarteAdversaireLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton10A, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10B, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10C, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10D, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10E, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10F, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10G, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10H, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10I, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10J, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAdvJ, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlContourAdversaireLayout = new javax.swing.GroupLayout(pnlContourAdversaire);
        pnlContourAdversaire.setLayout(pnlContourAdversaireLayout);
        pnlContourAdversaireLayout.setHorizontalGroup(
            pnlContourAdversaireLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContourAdversaireLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlCarteAdversaire, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlContourAdversaireLayout.setVerticalGroup(
            pnlContourAdversaireLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContourAdversaireLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlCarteAdversaire, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtJournalisation.setEditable(false);
        txtJournalisation.setColumns(20);
        txtJournalisation.setRows(5);
        jScrollJournalisation.setViewportView(txtJournalisation);

        btnDemarrerPartie.setText("Démarrer");
        
        btnFinPartie.setText("Quitter");

        btnSauvegarder.setText("Sauvegarder");

        btnReinitialise.setText("Réinitialiser");

        btnChangerOrientation.setText("Orientation");
        btnChangerOrientation.setToolTipText("");

        pnlContourMesBateaux.setBackground(new java.awt.Color(255, 255, 255));
        pnlContourMesBateaux.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "Mes Navires", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        javax.swing.GroupLayout pnlMesBateauxLayout = new javax.swing.GroupLayout(pnlMesBateaux);
        pnlMesBateaux.setLayout(pnlMesBateauxLayout);
        pnlMesBateauxLayout.setHorizontalGroup(
            pnlMesBateauxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMesBateauxLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pnlMesBateauxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMesBateauxLayout.createSequentialGroup()
                        .addComponent(jButtonPorteAvion1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButtonPorteAvion2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButtonPorteAvion3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButtonPorteAvion4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButtonPorteAvion5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlMesBateauxLayout.createSequentialGroup()
                        .addComponent(jButtonCroiseur1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButtonCroiseur2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButtonCroiseur3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButtonCroiseur4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlMesBateauxLayout.createSequentialGroup()
                        .addComponent(jButtonContreTorpilleur1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButtonContreTorpilleur2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButtonContreTorpilleur3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlMesBateauxLayout.createSequentialGroup()
                        .addComponent(jButtonTorpilleur1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButtonTorpilleur2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSousMarin1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButtonSousMarin2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButtonSousMarin3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlMesBateauxLayout.setVerticalGroup(
            pnlMesBateauxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMesBateauxLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pnlMesBateauxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonPorteAvion1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPorteAvion2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPorteAvion3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPorteAvion4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPorteAvion5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(pnlMesBateauxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonCroiseur1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCroiseur2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCroiseur3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCroiseur4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(pnlMesBateauxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonContreTorpilleur1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonContreTorpilleur2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonContreTorpilleur3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(pnlMesBateauxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonTorpilleur1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonTorpilleur2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSousMarin1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSousMarin2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSousMarin3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlContourMesBateauxLayout = new javax.swing.GroupLayout(pnlContourMesBateaux);
        pnlContourMesBateaux.setLayout(pnlContourMesBateauxLayout);
        pnlContourMesBateauxLayout.setHorizontalGroup(
            pnlContourMesBateauxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContourMesBateauxLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlMesBateaux, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );
        pnlContourMesBateauxLayout.setVerticalGroup(
            pnlContourMesBateauxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContourMesBateauxLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlMesBateaux, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnChangerOrientation)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnReinitialise)
                        .addGap(364, 364, 364))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlContourMesBateaux, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollJournalisation, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnFinPartie, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDemarrerPartie, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSauvegarder, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(pnlContourCarteJoueur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pnlContourAdversaire, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlContourAdversaire, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlContourCarteJoueur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnChangerOrientation)
                    .addComponent(btnReinitialise))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollJournalisation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnDemarrerPartie)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSauvegarder)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnFinPartie))))
                    .addComponent(pnlContourMesBateaux, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        lblImageFond.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fond_Fenetre_Jouer.png"))); // NOI18N
        getContentPane().add(lblImageFond);
        lblImageFond.setBounds(0, -20, 810, 620);

        pack();
    }
}
