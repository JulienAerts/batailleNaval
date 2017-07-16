/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf5153.battleship.domain;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 0-pc
 */
public class Bateau {
    protected int longueur;
    private List<Case> cases;

    public Bateau() {
        cases = new ArrayList<Case>();
    }
    
    public List<Case> getCases() {
        return cases;
    }
    
    public void setCases(List<Case> cases) throws Exception {
        if(cases.size() != longueur)
            throw new Exception("Le nombre de case assigné au bateau doit être identique à la longueur du bateau.");
        cases = cases;
    }
    public void addCase(Case pCase) throws Exception {
        cases.add(pCase);
        if(cases.size() > longueur)
            throw new Exception("Le nombre de case assigné au bateau doit être identique à la longueur du bateau.");
    }
    
    public boolean estCoule() {
        for(Case casee : cases) {
            if(casee.getTir() == null)
                return false;
        }
        return true;
    }
    
    public int getLongeur(){
        return this.longueur;
    }
    
    public Color getCouleur() {
        return Color.RED;
    }
}
