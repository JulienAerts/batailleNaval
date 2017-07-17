/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf5153.battleship.domain;

import java.util.ArrayList;

/**
 *
 * @author Tommy
 */
public class IADifficile extends IA {

    public IADifficile() throws Exception {
    }

    @Override
    public Position genererCoup() throws Exception {
        return positionMiniMax();
    }
    
    @Override
    public int getDifficultee() {
        return 1;
    }

    public Position positionMiniMax() throws Exception {
        Coup dernierCoup = dernierCoupBateauTouche();

        if (dernierCoup == null) {
            return positionAleatoireValide();
        } else {

            Position position = dernierCoup.getCase().getPosition();
            Position adjacente = positionAdjacente(position);

            ArrayList<Coup> coupExclure = new ArrayList();
            while (adjacente == null) {
                // Si on est pas capable de généré une position adjacente, on doit chercher alentour d'un autre coup.
                coupExclure.add(dernierCoup);
                dernierCoup = dernierCoupBateauToucheExclureCoup(coupExclure);

                // Si on ne trouve pas d'autre, coup il a y probablement une erreur, donc on envoi une position aléatoire.
                if (dernierCoup == null) {
                    return positionAleatoireValide();
                }

                adjacente = positionAdjacente(dernierCoup.getCase().getPosition());

            }
            return adjacente;
        }
    }
    
    private Coup dernierCoupBateauTouche() {
        for (Coup coup : adversaire.getCoups()) {
            if (coup.getCase().bateauTouche() && !coup.getCase().getBateau().estCoule()) {
                return coup;
            }
        }
        return null;
    }

    private Coup dernierCoupBateauToucheExclureCoup(ArrayList<Coup> coupExclu) {
        for (Coup coup : adversaire.getCoups()) {
            if (coup.getCase().bateauTouche() && !coupExclu.contains(coup) && !coup.getCase().getBateau().estCoule()) {
                return coup;
            }
        }
        return null;
    }

    private Position positionAdjacente(Position position) throws Exception {
        Position adjacente = null;
        if (position.getCoordonneXToInt() < Position.MAX_X && !coupDejaEffectue(new Position(position.getCoordonneXToInt() + 1, position.getCoordonneY()))) {
            adjacente = new Position(position.getCoordonneXToInt() + 1, position.getCoordonneY());
        } else if (position.getCoordonneY() < Position.MAX_Y && !coupDejaEffectue(new Position(position.getCoordonneXToInt(), position.getCoordonneY() + 1))) {
            adjacente = new Position(position.getCoordonneXToInt(), position.getCoordonneY() + 1);
        } else if (position.getCoordonneXToInt() > Position.MIN_X && !coupDejaEffectue(new Position(position.getCoordonneXToInt() - 1, position.getCoordonneY()))) {
            adjacente = new Position(position.getCoordonneXToInt() - 1, position.getCoordonneY());
        } else if (position.getCoordonneY() > Position.MIN_Y && !coupDejaEffectue(new Position(position.getCoordonneXToInt(), position.getCoordonneY() - 1))) {
            adjacente = new Position(position.getCoordonneXToInt(), position.getCoordonneY() - 1);
        }
        return adjacente;
    }
    
    private boolean coupDejaEffectue(Position position) {
        for (Coup coup : adversaire.getCoups()) {
            if (coup.getCase().getPosition().equals(position)) {
                return true;
            }
        }
        return false;
    }

}
