package inf5153.battleship.controleur;

import inf5153.battleship.interfaceGraphique.FenetreJouerPartie;
import java.awt.Color;

import javax.swing.JButton;


public final class EffetControleur {
    
    public JButton mapBoutonsJoueur[];
    public JButton mapBoutonsAdv[];
    public JButton listeBateaux[];
    private FenetreJouerPartie partie;
    
    private int i=0,j=0;

    
    String temp[];
    int datacolor[][];
    
    
    Color couleurs[]={Color.RED,Color.BLUE,Color.GREEN,Color.YELLOW,Color.WHITE};
    Color pred;
        
    public EffetControleur(FenetreJouerPartie partie){
        this.partie=partie;
        
        init_mapBoutonsJoueur();
        init_mapBoutonsAdv();
        init_listeBateaux();
        
        pred=mapBoutonsJoueur[0].getBackground();
        desactiverBoutonsOption(false);

    }
    
    
    
    private void desactiverBoutonsOption(boolean action){
        this.partie.btnSauvegarder.setEnabled(action);
        this.partie.btnDemarrerPartie.setEnabled(action);
        this.partie.btnReinitialise.setEnabled(action);
        this.partie.btnChangerOrientation.setEnabled(action);
        this.partie.btnFinPartie.setEnabled(action);
    }
    
    
    private void réinitialiserEffets(Color color){
        if(i<100){
            mapBoutonsJoueur[i].setBackground(color);
            mapBoutonsAdv[i].setBackground(color);
            i++;
        }else{
             i=0;
             j++;
        }
    }
    
    
    private void init_listeBateaux(){
        listeBateaux = new JButton[17];
        
        listeBateaux[0]=this.partie.jButtonPorteAvion1;
        listeBateaux[1]=this.partie.jButtonPorteAvion2;
        listeBateaux[2]=this.partie.jButtonPorteAvion3;
        listeBateaux[3]=this.partie.jButtonPorteAvion4;
        listeBateaux[4]=this.partie.jButtonPorteAvion5;
        listeBateaux[5]=this.partie.jButtonCroiseur1;
        listeBateaux[6]=this.partie.jButtonCroiseur2;
        listeBateaux[7]=this.partie.jButtonCroiseur3;
        listeBateaux[8]=this.partie.jButtonCroiseur4;
        listeBateaux[9]=this.partie.jButtonContreTorpilleur1;
        listeBateaux[10]=this.partie.jButtonContreTorpilleur2;
        listeBateaux[11]=this.partie.jButtonContreTorpilleur3;
        listeBateaux[12]=this.partie.jButtonSousMarin1;
        listeBateaux[13]=this.partie.jButtonSousMarin2;
        listeBateaux[14]=this.partie.jButtonSousMarin3;
        listeBateaux[15]=this.partie.jButtonTorpilleur1;
        listeBateaux[16]=this.partie.jButtonTorpilleur2;
    }

    public void init_mapBoutonsJoueur(){
        mapBoutonsJoueur = new JButton [100];
        
        mapBoutonsJoueur[0]=this.partie.jButtonA1;
        mapBoutonsJoueur[1]=this.partie.jButtonA2;
        mapBoutonsJoueur[2]=this.partie.jButtonA3;
        mapBoutonsJoueur[3]=this.partie.jButtonA4;
        mapBoutonsJoueur[4]=this.partie.jButtonA5;
        mapBoutonsJoueur[5]=this.partie.jButtonA6;
        mapBoutonsJoueur[6]=this.partie.jButtonA7;
        mapBoutonsJoueur[7]=this.partie.jButtonA8;
        mapBoutonsJoueur[8]=this.partie.jButtonA9;
        mapBoutonsJoueur[9]=this.partie.jButtonA10;
        mapBoutonsJoueur[10]=this.partie.jButtonB1;
        mapBoutonsJoueur[11]=this.partie.jButtonB2;
        mapBoutonsJoueur[12]=this.partie.jButtonB3;
        mapBoutonsJoueur[13]=this.partie.jButtonB4;
        mapBoutonsJoueur[14]=this.partie.jButtonB5;
        mapBoutonsJoueur[15]=this.partie.jButtonB6;
        mapBoutonsJoueur[16]=this.partie.jButtonB7;
        mapBoutonsJoueur[17]=this.partie.jButtonB8;
        mapBoutonsJoueur[18]=this.partie.jButtonB9;
        mapBoutonsJoueur[19]=this.partie.jButtonB10;
        mapBoutonsJoueur[20]=this.partie.jButtonC1;
        mapBoutonsJoueur[21]=this.partie.jButtonC2;
        mapBoutonsJoueur[22]=this.partie.jButtonC3;
        mapBoutonsJoueur[23]=this.partie.jButtonC4;
        mapBoutonsJoueur[24]=this.partie.jButtonC5;
        mapBoutonsJoueur[25]=this.partie.jButtonC6;
        mapBoutonsJoueur[26]=this.partie.jButtonC7;
        mapBoutonsJoueur[27]=this.partie.jButtonC8;
        mapBoutonsJoueur[28]=this.partie.jButtonC9;
        mapBoutonsJoueur[29]=this.partie.jButtonC10;
        mapBoutonsJoueur[30]=this.partie.jButtonD1;
        mapBoutonsJoueur[31]=this.partie.jButtonD2;
        mapBoutonsJoueur[32]=this.partie.jButtonD3;
        mapBoutonsJoueur[33]=this.partie.jButtonD4;
        mapBoutonsJoueur[34]=this.partie.jButtonD5;
        mapBoutonsJoueur[35]=this.partie.jButtonD6;
        mapBoutonsJoueur[36]=this.partie.jButtonD7;
        mapBoutonsJoueur[37]=this.partie.jButtonD8;
        mapBoutonsJoueur[38]=this.partie.jButtonD9;
        mapBoutonsJoueur[39]=this.partie.jButtonD10;
        mapBoutonsJoueur[40]=this.partie.jButtonE1;
        mapBoutonsJoueur[41]=this.partie.jButtonE2;
        mapBoutonsJoueur[42]=this.partie.jButtonE3;
        mapBoutonsJoueur[43]=this.partie.jButtonE4;
        mapBoutonsJoueur[44]=this.partie.jButtonE5;
        mapBoutonsJoueur[45]=this.partie.jButtonE6;
        mapBoutonsJoueur[46]=this.partie.jButtonE7;
        mapBoutonsJoueur[47]=this.partie.jButtonE8;
        mapBoutonsJoueur[48]=this.partie.jButtonE9;
        mapBoutonsJoueur[49]=this.partie.jButtonE10;
        mapBoutonsJoueur[50]=this.partie.jButtonF1;
        mapBoutonsJoueur[51]=this.partie.jButtonF2;
        mapBoutonsJoueur[52]=this.partie.jButtonF3;
        mapBoutonsJoueur[53]=this.partie.jButtonF4;
        mapBoutonsJoueur[54]=this.partie.jButtonF5;
        mapBoutonsJoueur[55]=this.partie.jButtonF6;
        mapBoutonsJoueur[56]=this.partie.jButtonF7;
        mapBoutonsJoueur[57]=this.partie.jButtonF8;
        mapBoutonsJoueur[58]=this.partie.jButtonF9;
        mapBoutonsJoueur[59]=this.partie.jButtonF10;
        mapBoutonsJoueur[60]=this.partie.jButtonG1;
        mapBoutonsJoueur[61]=this.partie.jButtonG2;
        mapBoutonsJoueur[62]=this.partie.jButtonG3;
        mapBoutonsJoueur[63]=this.partie.jButtonG4;
        mapBoutonsJoueur[64]=this.partie.jButtonG5;
        mapBoutonsJoueur[65]=this.partie.jButtonG6;
        mapBoutonsJoueur[66]=this.partie.jButtonG7;
        mapBoutonsJoueur[67]=this.partie.jButtonG8;
        mapBoutonsJoueur[68]=this.partie.jButtonG9;
        mapBoutonsJoueur[69]=this.partie.jButtonG10;
        mapBoutonsJoueur[70]=this.partie.jButtonH1;
        mapBoutonsJoueur[71]=this.partie.jButtonH2;
        mapBoutonsJoueur[72]=this.partie.jButtonH3;
        mapBoutonsJoueur[73]=this.partie.jButtonH4;
        mapBoutonsJoueur[74]=this.partie.jButtonH5;
        mapBoutonsJoueur[75]=this.partie.jButtonH6;
        mapBoutonsJoueur[76]=this.partie.jButtonH7;
        mapBoutonsJoueur[77]=this.partie.jButtonH8;
        mapBoutonsJoueur[78]=this.partie.jButtonH9;
        mapBoutonsJoueur[79]=this.partie.jButtonH10;
        mapBoutonsJoueur[80]=this.partie.jButtonI1;
        mapBoutonsJoueur[81]=this.partie.jButtonI2;
        mapBoutonsJoueur[82]=this.partie.jButtonI3;
        mapBoutonsJoueur[83]=this.partie.jButtonI4;
        mapBoutonsJoueur[84]=this.partie.jButtonI5;
        mapBoutonsJoueur[85]=this.partie.jButtonI6;
        mapBoutonsJoueur[86]=this.partie.jButtonI7;
        mapBoutonsJoueur[87]=this.partie.jButtonI8;
        mapBoutonsJoueur[88]=this.partie.jButtonI9;
        mapBoutonsJoueur[89]=this.partie.jButtonI10;
        mapBoutonsJoueur[90]=this.partie.jButtonJ1;
        mapBoutonsJoueur[91]=this.partie.jButtonJ2;
        mapBoutonsJoueur[92]=this.partie.jButtonJ3;
        mapBoutonsJoueur[93]=this.partie.jButtonJ4;
        mapBoutonsJoueur[94]=this.partie.jButtonJ5;
        mapBoutonsJoueur[95]=this.partie.jButtonJ6;
        mapBoutonsJoueur[96]=this.partie.jButtonJ7;
        mapBoutonsJoueur[97]=this.partie.jButtonJ8;
        mapBoutonsJoueur[98]=this.partie.jButtonJ9;        
        mapBoutonsJoueur[99]=this.partie.jButtonJ10;

 
    }
    
    public void init_mapBoutonsAdv(){
        mapBoutonsAdv=new JButton[100];
        
        mapBoutonsAdv[0]=this.partie.jButton1A;
        mapBoutonsAdv[1]=this.partie.jButton2A;
        mapBoutonsAdv[2]=this.partie.jButton3A;
        mapBoutonsAdv[3]=this.partie.jButton4A;
        mapBoutonsAdv[4]=this.partie.jButton5A;
        mapBoutonsAdv[5]=this.partie.jButton6A;
        mapBoutonsAdv[6]=this.partie.jButton7A;
        mapBoutonsAdv[7]=this.partie.jButton8A;
        mapBoutonsAdv[8]=this.partie.jButton9A;
        mapBoutonsAdv[9]=this.partie.jButton10A;
        mapBoutonsAdv[10]=this.partie.jButton1B;
        mapBoutonsAdv[11]=this.partie.jButton2B;
        mapBoutonsAdv[12]=this.partie.jButton3B;
        mapBoutonsAdv[13]=this.partie.jButton4B;
        mapBoutonsAdv[14]=this.partie.jButton5B;
        mapBoutonsAdv[15]=this.partie.jButton6B;
        mapBoutonsAdv[16]=this.partie.jButton7B;
        mapBoutonsAdv[17]=this.partie.jButton8B;
        mapBoutonsAdv[18]=this.partie.jButton9B;
        mapBoutonsAdv[19]=this.partie.jButton10B;
        mapBoutonsAdv[20]=this.partie.jButton1C;
        mapBoutonsAdv[21]=this.partie.jButton2C;
        mapBoutonsAdv[22]=this.partie.jButton3C;
        mapBoutonsAdv[23]=this.partie.jButton4C;
        mapBoutonsAdv[24]=this.partie.jButton5C;
        mapBoutonsAdv[25]=this.partie.jButton6C;
        mapBoutonsAdv[26]=this.partie.jButton7C;
        mapBoutonsAdv[27]=this.partie.jButton8C;
        mapBoutonsAdv[28]=this.partie.jButton9C;
        mapBoutonsAdv[29]=this.partie.jButton10C;
        mapBoutonsAdv[30]=this.partie.jButton1D;
        mapBoutonsAdv[31]=this.partie.jButton2D;
        mapBoutonsAdv[32]=this.partie.jButton3D;
        mapBoutonsAdv[33]=this.partie.jButton4D;
        mapBoutonsAdv[34]=this.partie.jButton5D;
        mapBoutonsAdv[35]=this.partie.jButton6D;
        mapBoutonsAdv[36]=this.partie.jButton7D;
        mapBoutonsAdv[37]=this.partie.jButton8D;
        mapBoutonsAdv[38]=this.partie.jButton9D;
        mapBoutonsAdv[39]=this.partie.jButton10D;
        mapBoutonsAdv[40]=this.partie.jButton1E;
        mapBoutonsAdv[41]=this.partie.jButton2E;
        mapBoutonsAdv[42]=this.partie.jButton3E;
        mapBoutonsAdv[43]=this.partie.jButton4E;
        mapBoutonsAdv[44]=this.partie.jButton5E;
        mapBoutonsAdv[45]=this.partie.jButton6E;
        mapBoutonsAdv[46]=this.partie.jButton7E;
        mapBoutonsAdv[47]=this.partie.jButton8E;
        mapBoutonsAdv[48]=this.partie.jButton9E;
        mapBoutonsAdv[49]=this.partie.jButton10E;
        mapBoutonsAdv[50]=this.partie.jButton1F;
        mapBoutonsAdv[51]=this.partie.jButton2F;
        mapBoutonsAdv[52]=this.partie.jButton3F;
        mapBoutonsAdv[53]=this.partie.jButton4F;
        mapBoutonsAdv[54]=this.partie.jButton5F;
        mapBoutonsAdv[55]=this.partie.jButton6F;
        mapBoutonsAdv[56]=this.partie.jButton7F;
        mapBoutonsAdv[57]=this.partie.jButton8F;
        mapBoutonsAdv[58]=this.partie.jButton9F;
        mapBoutonsAdv[59]=this.partie.jButton10F;
        mapBoutonsAdv[60]=this.partie.jButton1G;
        mapBoutonsAdv[61]=this.partie.jButton2G;
        mapBoutonsAdv[62]=this.partie.jButton3G;
        mapBoutonsAdv[63]=this.partie.jButton4G;
        mapBoutonsAdv[64]=this.partie.jButton5G;
        mapBoutonsAdv[65]=this.partie.jButton6G;
        mapBoutonsAdv[66]=this.partie.jButton7G;
        mapBoutonsAdv[67]=this.partie.jButton8G;
        mapBoutonsAdv[68]=this.partie.jButton9G;
        mapBoutonsAdv[69]=this.partie.jButton10G;
        mapBoutonsAdv[70]=this.partie.jButton1H;
        mapBoutonsAdv[71]=this.partie.jButton2H;
        mapBoutonsAdv[72]=this.partie.jButton3H;
        mapBoutonsAdv[73]=this.partie.jButton4H;
        mapBoutonsAdv[74]=this.partie.jButton5H;
        mapBoutonsAdv[75]=this.partie.jButton6H;
        mapBoutonsAdv[76]=this.partie.jButton7H;
        mapBoutonsAdv[77]=this.partie.jButton8H;
        mapBoutonsAdv[78]=this.partie.jButton9H;
        mapBoutonsAdv[79]=this.partie.jButton10H;
        mapBoutonsAdv[80]=this.partie.jButton1I;
        mapBoutonsAdv[81]=this.partie.jButton2I;
        mapBoutonsAdv[82]=this.partie.jButton3I;
        mapBoutonsAdv[83]=this.partie.jButton4I;
        mapBoutonsAdv[84]=this.partie.jButton5I;
        mapBoutonsAdv[85]=this.partie.jButton6I;
        mapBoutonsAdv[86]=this.partie.jButton7I;
        mapBoutonsAdv[87]=this.partie.jButton8I;
        mapBoutonsAdv[88]=this.partie.jButton9I;
        mapBoutonsAdv[89]=this.partie.jButton10I;
        mapBoutonsAdv[90]=this.partie.jButton1J;
        mapBoutonsAdv[91]=this.partie.jButton2J;
        mapBoutonsAdv[92]=this.partie.jButton3J;
        mapBoutonsAdv[93]=this.partie.jButton4J;
        mapBoutonsAdv[94]=this.partie.jButton5J;
        mapBoutonsAdv[95]=this.partie.jButton6J;
        mapBoutonsAdv[96]=this.partie.jButton7J;
        mapBoutonsAdv[97]=this.partie.jButton8J;
        mapBoutonsAdv[98]=this.partie.jButton9J;       
        mapBoutonsAdv[99]=this.partie.jButton10J;
        
    }

}
