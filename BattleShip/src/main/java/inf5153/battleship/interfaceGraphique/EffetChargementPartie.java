/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf5153.battleship.interfaceGraphique;

import inf5153.battleship.controleur.Reponse;
import inf5153.battleship.domain.Bateau;
import inf5153.battleship.domain.Case;
import inf5153.battleship.domain.Position;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;

/**
 *
 * @author 0-pc
 */
public class EffetChargementPartie {
    private FenetreJouerPartie partie;
    private BoutonCustom mapBoutonsJoueur[];
    private BoutonCustom mapBoutonsAdv[];
    
    public EffetChargementPartie(FenetreJouerPartie partie){
        this.partie=partie;
        mapBoutonsJoueur = partie.mapBoutonsJoueur;
        mapBoutonsAdv = partie.mapBoutonsAdv;
    }
    
    
    public void placerBateaux(List<Bateau> bateaux) {
        
        // RESET DE LA GRILLE.
        for(int i = 0; i < mapBoutonsJoueur.length; i++) {
            mapBoutonsJoueur[i].setBackground(new JButton().getBackground());
        }
        
        ArrayList<Position> positions = new ArrayList();
        for(Bateau bateau : bateaux) {
            for(Case tCase : bateau.getCases()) {
                positions.add(tCase.getPosition());
            }
            colorierCase(positions,Color.GREEN);
            positions.clear();
        }
    }
    
    public void placerCoupJoueur() {
        
        for (Case tCase : partie.controleur.getListeCoupAI()){
            Reponse rep = tCase.getReponse();
            switch (rep){
                case Touche:
                    colorierCase(tCase.getPosition(),Color.YELLOW,mapBoutonsAdv);
                    break;
                case ToucheCoule:
                    colorierCaseBateau(trouverBateau(tCase.getPosition()),Color.red);
                    break;
                case Eau:
                    colorierCase(tCase.getPosition(),Color.BLUE,mapBoutonsAdv);
                    break;
            }

        }
    }
    
    public void placerCoupAI() {
        
        for (Case tCase : partie.controleur.getListeCoupJoueur()){
            Reponse rep = tCase.getReponse();
            switch (rep){
                case Touche:
                    colorierCase(tCase.getPosition(),Color.YELLOW,mapBoutonsJoueur);
                    break;
                case ToucheCoule:
                    colorierCaseBateauJoueur(trouverBateauJoueur(tCase.getPosition()),Color.red);
                    break;
                case Eau:
                    colorierCase(tCase.getPosition(),Color.BLUE,mapBoutonsJoueur);
                    break;
            }

        }
    }
    
    public Bateau trouverBateau(Position pos) {
        Bateau BateauRechercher = new Bateau();
        for(Bateau bateau : partie.controleur.getBateauxIA()) {
            for(Case tCase : bateau.getCases()) {
               if(tCase.getPosition().equals(pos)){
                   BateauRechercher = bateau;
               }
            }
        }
            
        return BateauRechercher;
    }
    
    public Bateau trouverBateauJoueur(Position pos) {
        Bateau BateauRechercher = new Bateau();
        for(Bateau bateau : partie.controleur.getBateauxJoueur()) {
            for(Case tCase : bateau.getCases()) {
               if(tCase.getPosition().equals(pos)){
                   BateauRechercher = bateau;
               }
            }
        }
            
        return BateauRechercher;
    }
    
    public void colorierCaseBateauJoueur(Bateau bateau, Color color) {
        
        for(Case cas : bateau.getCases()) {
            mapBoutonsJoueur[(cas.getPosition().getCoordonneXToInt()) + (cas.getPosition().getCoordonneY() - 1) *10].setBackground(color);
        }
    }
    
    public void colorierCaseBateau(Bateau bateau, Color color) {
        
        for(Case cas : bateau.getCases()) {
            mapBoutonsAdv[(cas.getPosition().getCoordonneXToInt()) + (cas.getPosition().getCoordonneY() - 1) *10].setBackground(color);
        }
    }
    
    public void colorierCase(List<Position> positions, Color color) {
        
        for(Position position : positions) {
            mapBoutonsJoueur[(position.getCoordonneXToInt()) + (position.getCoordonneY() - 1) *10].setBackground(color);
        }
        
       
        
//        for(int i = 0; i < mapBoutonsAdv.length; i++) {
//            
//            if(positions.contains(mapBoutonsAdv[i].position)) {
//                mapBoutonsAdv[i].setBackground(color);
//            }
//        }
    }
    
    public void colorierCase(Position position, Color color ,BoutonCustom map[]) {

        map[(position.getCoordonneXToInt()) + (position.getCoordonneY() - 1) *10].setBackground(color);

    }
}
