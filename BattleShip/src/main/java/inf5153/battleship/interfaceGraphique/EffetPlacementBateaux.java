package inf5153.battleship.interfaceGraphique;

import inf5153.battleship.domain.Bateau;
import inf5153.battleship.domain.Case;
import inf5153.battleship.domain.Position;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JOptionPane;


public final class EffetPlacementBateaux {
    

    public JButton listeBateaux[];
    private BoutonCustom boutonsSelectionner[];
    public BoutonCustom boutonsEnMemoire[]=new BoutonCustom[30];
    private FenetreJouerPartie partie;
    private boolean CLICK=false;
    private boolean bateauxPlacer=false;
    private boolean etatBateauxEstPlacer[] = new boolean[5];
    public boolean orientation = false;
    private BoutonCustom mapBoutonsJoueur[];
    private BoutonCustom mapBoutonsAdv[];

    
    
    Color couleurs[]={Color.RED,Color.BLUE,Color.GREEN,Color.YELLOW,Color.WHITE};
    Color pred;
        
    public EffetPlacementBateaux(FenetreJouerPartie partie){
        this.partie=partie;
        mapBoutonsJoueur = partie.mapBoutonsJoueur;
        mapBoutonsAdv = partie.mapBoutonsAdv;
        pred=mapBoutonsJoueur[0].getBackground();
        desactiverBoutonsOption(false);
        initialiserListenerMouse();


    }
    
    private void initialiserListenerMouse(){
        for (int i=0;i<100;i++){
            mapBoutonsJoueur[i].addMouseListener(new java.awt.event.MouseAdapter() {
                @Override
                public void mouseEntered(java.awt.event.MouseEvent evt){
                    mapBoutonsJoueurMouseEntered(evt);                   
                }
                @Override
                public void mouseExited(java.awt.event.MouseEvent evt){
                    mapBoutonsJoueurMouseExited(evt);
                };
            });
            mapBoutonsJoueur[i].addActionListener((ActionEvent evt) -> {
                mapBoutonsJoueurActionPerformed(evt);
            });
        }
    }
    private void mapBoutonsJoueurMouseEntered(java.awt.event.MouseEvent evt) {
        try{
            int x=partie.pnlCarteJoueur.getMousePosition().getLocation().x;
            int y=partie.pnlCarteJoueur.getMousePosition().getLocation().y;
            if (!bateauxPlacer){
                if(!etatBateauxEstPlacer[0]){
                    dessinerGrille("porte-avion", x, y);
                }else if(!etatBateauxEstPlacer[1]){
                    dessinerGrille("croiseur", x, y);
                }else if(!etatBateauxEstPlacer[2]){
                    dessinerGrille("contre-torpilleurs", x, y);
                }else if(!etatBateauxEstPlacer[3]){
                    dessinerGrille("sous-marin", x, y);
                }else if(!etatBateauxEstPlacer[4]){
                    dessinerGrille("torpilleur", x, y);
                }
            }
        }catch(NullPointerException e){}
    }
    private void mapBoutonsJoueurActionPerformed(java.awt.event.ActionEvent evt){
        if (!bateauxPlacer){
            if(pasDeRepetition(boutonsSelectionner)){
                CLICK=true;
                if(!etatBateauxEstPlacer[0]){
                    enregistrerBoutonMem("porte-avion");
                    etatBateauxEstPlacer[0]=true;
                }else if(!etatBateauxEstPlacer[1]){
                    enregistrerBoutonMem("croiseur");
                    etatBateauxEstPlacer[1]=true;
                }else if(!etatBateauxEstPlacer[2]){
                    enregistrerBoutonMem("contre-torpilleurs");
                    etatBateauxEstPlacer[2]=true;
                }else if(!etatBateauxEstPlacer[3]){
                    enregistrerBoutonMem("sous-marin");
                    etatBateauxEstPlacer[3]=true;
                }else if(!etatBateauxEstPlacer[4]){
                    enregistrerBoutonMem("torpilleur");
                    etatBateauxEstPlacer[4]=true;
                    bateauxPlacer = true;
                    partie.txtJournalisation.append("Parfait clique sur Démarrrer pour commencer la partie !\n");
                    desactiverBouton(partie.btnDemarrerPartie,true);
                    desactiverBouton(partie.btnReinitialise,true);

                }
            }else{
                JOptionPane.showMessageDialog(null, "Pas plus qu'un bateau sur les mêmes cases","Message Avertissement",JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    private JButton [] getboutonsSelectionner(){
        return boutonsSelectionner;
    }
    
    private void setboutonsSelectionner(BoutonCustom boutons[]){
        boutonsSelectionner=boutons;
        for(int i=0;i<boutons.length;i++){
            boutons[i].setBackground(getColor());
        }
    }
    
    private Color getColor(){
        Color c=(Color.GREEN);
        return c;
    }
    
     private void verificationRepetition (JButton bouton){
        for(int i=0;i<30;i++){
            if(boutonsEnMemoire[i]==bouton){
                bouton.setBackground(getColor());
                break;
            }else{
                bouton.setBackground(pred);
            }
        }
    }
    
    private boolean pasDeRepetition(JButton bouton[]){
        boolean OK=true;
        for(int i=0;i<bouton.length;i++){
            for(int j=0;j<30;j++){
                if(bouton[i]==boutonsEnMemoire[j]){
                    OK=false;
                    break;
                }
            }
        }
        return OK;
    }
    
    private void mapBoutonsJoueurMouseExited(java.awt.event.MouseEvent evt) {
        if(!bateauxPlacer){
            JButton cap[]=getboutonsSelectionner();
            if(!CLICK){
                for(int i=0;i<cap.length;i++){
                verificationRepetition(cap[i]);
                }
            }else{
                CLICK=false;
            }
        }
    }
    private void desactiverBoutonsOption(boolean action){
        this.partie.btnSauvegarder.setEnabled(action);
        this.partie.btnDemarrerPartie.setEnabled(action);
        this.partie.btnReinitialise.setEnabled(action);
        this.partie.btnFinPartie.setEnabled(action);
    }
    
    private void desactiverBouton(JButton bouton ,boolean action){
        bouton.setEnabled(action);
    }
    
    
    public void réinitialiserEffets(){

        for(int i=0;i<100;i++){
            mapBoutonsJoueur[i].setBackground(pred);
        }
        
        desactiverBouton(partie.btnDemarrerPartie,false);
        desactiverBouton(partie.btnReinitialise,false);
        etatBateauxEstPlacer = new boolean[5];
        boutonsEnMemoire = new BoutonCustom[30];
        bateauxPlacer = false;
        CLICK=false;
        partie.txtJournalisation.append("Place les bateaux sur ta grille !\n");
    }
    
    private void dessinerGrille(String typeBateau, int x, int y){
        for(int i=0;i<10;i++){
            switch (typeBateau){
                case "porte-avion":
                    if (orientation){
                        if(x>=10 && y>=148 && x<=384 && y<398){
                            BoutonCustom cap[]={mapBoutonsJoueur[identifierLesBoutons(x, 148)],mapBoutonsJoueur[identifierLesBoutons(x, 148)+10],mapBoutonsJoueur[identifierLesBoutons(x, 148)+20],mapBoutonsJoueur[identifierLesBoutons(x, 148)+30],mapBoutonsJoueur[identifierLesBoutons(x, 148)+40]};
                            setboutonsSelectionner(cap);
                        }else if(x>=10 && y>=22 && x<384 && y<148){
                            BoutonCustom cap[]={mapBoutonsJoueur[identifierLesBoutons(x, y)], mapBoutonsJoueur[identifierLesBoutons(x, y)+10],mapBoutonsJoueur[identifierLesBoutons(x, y)+20],mapBoutonsJoueur[identifierLesBoutons(x, y)+30],mapBoutonsJoueur[identifierLesBoutons(x, y)+40]};
                            setboutonsSelectionner(cap);
                        }
                    }else {
                        if(x>=153 && y>=((i*25)+23) && x<=384 && y<((i*25)+48)){
                            BoutonCustom cap[]={mapBoutonsJoueur[(i*10)+5],mapBoutonsJoueur[(i*10)+6],mapBoutonsJoueur[(i*10)+7],mapBoutonsJoueur[(i*10)+8],mapBoutonsJoueur[(i*10)+9]};
                            setboutonsSelectionner(cap);
                        }else if(x>=10 && y>=22 && x<153 && y<=398){
                            BoutonCustom cap[]={mapBoutonsJoueur[identifierLesBoutons(x, y)], mapBoutonsJoueur[identifierLesBoutons(x, y)+1],mapBoutonsJoueur[identifierLesBoutons(x, y)+2],mapBoutonsJoueur[identifierLesBoutons(x, y)+3],mapBoutonsJoueur[identifierLesBoutons(x, y)+4]};
                            setboutonsSelectionner(cap);
                        }
                    }
                    break;
                case "croiseur":
                    if (orientation){
                        if(x>=10 && y>=179 && x<=384 && y<398){
                            BoutonCustom cap[]={mapBoutonsJoueur[identifierLesBoutons(x, 179)],mapBoutonsJoueur[identifierLesBoutons(x, 179)+10],mapBoutonsJoueur[identifierLesBoutons(x, 179)+20],mapBoutonsJoueur[identifierLesBoutons(x, 179)+30]};
                            setboutonsSelectionner(cap);
                        }else if(x>=10 && y>=22 && x<384 && y<179){
                            BoutonCustom cap[]={mapBoutonsJoueur[identifierLesBoutons(x, y)], mapBoutonsJoueur[identifierLesBoutons(x, y)+10], mapBoutonsJoueur[identifierLesBoutons(x, y)+20], mapBoutonsJoueur[identifierLesBoutons(x, y)+30]};
                            setboutonsSelectionner(cap);
                        }
                    }else {
                        
                        if(x>=178 && y>=((i*25)+23) && x<=384 && y<((i*25)+48)){
                            BoutonCustom cap[]={mapBoutonsJoueur[(i*10)+6],mapBoutonsJoueur[(i*10)+7],mapBoutonsJoueur[(i*10)+8],mapBoutonsJoueur[(i*10)+9]};
                            setboutonsSelectionner(cap);
                        }else if(x>=10 && y>=22 && x<178 && y<=398){
                            BoutonCustom cap[]={mapBoutonsJoueur[identifierLesBoutons(x, y)], mapBoutonsJoueur[identifierLesBoutons(x, y)+1], mapBoutonsJoueur[identifierLesBoutons(x, y)+2], mapBoutonsJoueur[identifierLesBoutons(x, y)+3]};
                            setboutonsSelectionner(cap);
                        }
                    }
                    break;
                case "contre-torpilleurs":
                    if (orientation){
                        if(x>=10 && y>=198 && x<=384 && y<398){
                            BoutonCustom cap[]={mapBoutonsJoueur[identifierLesBoutons(x, 198)],mapBoutonsJoueur[identifierLesBoutons(x, 198)+10],mapBoutonsJoueur[identifierLesBoutons(x, 198)+20]};
                            setboutonsSelectionner(cap);
                        }else if(x>=10 && y>=22 && x<384 && y<198){
                            BoutonCustom cap[]={mapBoutonsJoueur[identifierLesBoutons(x, y)], mapBoutonsJoueur[identifierLesBoutons(x, y)+10],mapBoutonsJoueur[identifierLesBoutons(x, y)+20]};
                            setboutonsSelectionner(cap);
                        }
                    }else{
                        if(x>=227 && y>=((i*25)+23) && x<=384 && y<((i*25)+48)){
                            BoutonCustom cap[]={mapBoutonsJoueur[(i*10)+7],mapBoutonsJoueur[(i*10)+8],mapBoutonsJoueur[(i*10)+9]};
                            setboutonsSelectionner(cap);
                        }else if(x>=10 && y>=22 && x<227 && y<=398){
                            BoutonCustom cap[]={mapBoutonsJoueur[identifierLesBoutons(x, y)], mapBoutonsJoueur[identifierLesBoutons(x, y)+1],mapBoutonsJoueur[identifierLesBoutons(x, y)+2]};
                            setboutonsSelectionner(cap);
                        }
                    }
                    break;
                case "sous-marin":
                     if (orientation){
                        if(x>=10 && y>=198 && x<=384 && y<398){
                            BoutonCustom cap[]={mapBoutonsJoueur[identifierLesBoutons(x, 198)],mapBoutonsJoueur[identifierLesBoutons(x, 198)+10],mapBoutonsJoueur[identifierLesBoutons(x, 198)+20]};
                            setboutonsSelectionner(cap);
                        }else if(x>=10 && y>=22 && x<384 && y<198){
                            BoutonCustom cap[]={mapBoutonsJoueur[identifierLesBoutons(x, y)], mapBoutonsJoueur[identifierLesBoutons(x, y)+10],mapBoutonsJoueur[identifierLesBoutons(x, y)+20]};
                            setboutonsSelectionner(cap);
                        }
                    }else{
                        if(x>=227 && y>=((i*25)+23) && x<=384 && y<((i*25)+48)){
                            BoutonCustom cap[]={mapBoutonsJoueur[(i*10)+7],mapBoutonsJoueur[(i*10)+8],mapBoutonsJoueur[(i*10)+9]};
                            setboutonsSelectionner(cap);
                        }else if(x>=10 && y>=22 && x<227 && y<=398){
                            BoutonCustom cap[]={mapBoutonsJoueur[identifierLesBoutons(x, y)], mapBoutonsJoueur[identifierLesBoutons(x, y)+1],mapBoutonsJoueur[identifierLesBoutons(x, y)+2]};
                            setboutonsSelectionner(cap);
                        }
                    }
                    break;
                case "torpilleur":
                    if (orientation){
                        if(x>=10 && y>=224 && x<=384 && y<398){
                            BoutonCustom cap[]={mapBoutonsJoueur[identifierLesBoutons(x, 224)],mapBoutonsJoueur[identifierLesBoutons(x, 224)+10]};
                            setboutonsSelectionner(cap);
                        }else if(x>=10 && y>=22 && x<384 && y<224){
                            BoutonCustom cap[]={mapBoutonsJoueur[identifierLesBoutons(x, y)],mapBoutonsJoueur[identifierLesBoutons(x, y)+10]};
                            setboutonsSelectionner(cap);
                        }
                    }else{
                        if(x>=252 && y>=((i*25)+23) && x<=384 && y<((i*25)+48)){
                            BoutonCustom cap[]={mapBoutonsJoueur[(i*10)+8],mapBoutonsJoueur[(i*10)+9]};
                            setboutonsSelectionner(cap);
                        }else if(x>=10 && y>=22 && x<252 && y<=398){
                            BoutonCustom cap[]={mapBoutonsJoueur[identifierLesBoutons(x, y)],mapBoutonsJoueur[identifierLesBoutons(x, y)+1]};
                            setboutonsSelectionner(cap);
                        } 
                    }
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Placer le bateau sur votre carte!","Message avertissement",JOptionPane.ERROR_MESSAGE);
                    break;
            }
        }
    }
    
    private int identifierLesBoutons(int x, int y){
        int numero=0;
        for(int i=0;i<10;i++){
            
            if(x>=10 && y>=(i*25)+23 && x<53 && y<(i*25)+48){
                numero=(i*10);
            }else if (x>=53 && y>=(i*25)+23 && x<78 && y<(i*25)+48){
                numero=(i*10)+1;
            }else if (x>=78 && y>=(i*25)+23 && x<103 && y<(i*25)+48){
                numero=(i*10)+2;
            }else if (x>=103 && y>=(i*25)+23 && x<128 && y<(i*25)+48){
                numero=(i*10)+3;
            }else if (x>=128 && y>=(i*25)+23 && x<153 && y<(i*25)+48){
                numero=(i*10)+4;
            }else if (x>=153 && y>=(i*25)+23 && x<178 && y<(i*25)+48){
                numero=(i*10)+5;
            }else if (x>=178 && y>=(i*25)+23 && x<203 && y<(i*25)+48){
                numero=(i*10)+6;
            }else if (x>=203 && y>=(i*25)+23 && x<228 && y<(i*25)+48){
                numero=(i*10)+7;
            }else if (x>=228 && y>=(i*25)+23 && x<253 && y<(i*25)+48){
                numero=(i*10)+8;
            }else if (x>=253 && y>=(i*25)+23 && x<279 && y<(i*25)+48){
                numero=(i*10)+9;
            }
        }
        return numero;
    }
    
    private void enregistrerBoutonMem(String cmd){
        switch (cmd){
            case "porte-avion":
                System.arraycopy(boutonsSelectionner, 0, boutonsEnMemoire, 0, 5);  
                break;
            case "croiseur":
                System.arraycopy(boutonsSelectionner, 0, boutonsEnMemoire, 5, 4);  
                break;
            case "contre-torpilleurs":
                System.arraycopy(boutonsSelectionner, 0, boutonsEnMemoire, 9, 3); 
                break;
            case "sous-marin":
                System.arraycopy(boutonsSelectionner, 0, boutonsEnMemoire, 12, 3); 
                break;
            case "torpilleur":
                System.arraycopy(boutonsSelectionner, 0, boutonsEnMemoire, 15, 2);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Erreur de sauvegarde des positions des bateaux","Message avertissement",JOptionPane.ERROR_MESSAGE);
                break;
        }
    }
    
    public void placerBateaux(List<Bateau> bateaux) {
        
        // RESET DE LA GRILLE.
        for(int i = 0; i < mapBoutonsAdv.length; i++) {
            mapBoutonsAdv[i].setBackground(new JButton().getBackground());
        }
        
        ArrayList<Position> positions = new ArrayList();
        for(Bateau bateau : bateaux) {
            for(Case tCase : bateau.getCases()) {
                positions.add(tCase.getPosition());
            }
            colorierCase(positions, bateau.getCouleur());
            positions.clear();
        }
    }
    public void colorierCase(List<Position> positions, Color color) {
        
        for(Position position : positions) {
            mapBoutonsAdv[(position.getCoordonneXToInt()) + (position.getCoordonneY() - 1) *10].setBackground(color);
        }
        
       
        
//        for(int i = 0; i < mapBoutonsAdv.length; i++) {
//            
//            if(positions.contains(mapBoutonsAdv[i].position)) {
//                mapBoutonsAdv[i].setBackground(color);
//            }
//        }
    }
    
    

}
