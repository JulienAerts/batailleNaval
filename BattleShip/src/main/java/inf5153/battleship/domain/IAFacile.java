package inf5153.battleship.domain;

import java.util.Random;

/**
 *
 * @author Tommy
 */
public class IAFacile extends IA {

    public IAFacile() throws Exception {
    }

    @Override
    public Position genererCoup() throws Exception {
        return positionAleatoireValide();
    }
    
    @Override
    public int getDifficultee() {
        return 0;
    }
}
