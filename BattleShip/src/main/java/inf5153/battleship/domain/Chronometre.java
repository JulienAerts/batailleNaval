/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf5153.battleship.domain;

/**
 *
 * @author P.O
 */
public class Chronometre {
    private long tempsexecution;
    
    public Chronometre(){
        this.tempsexecution = 0;
    }
    
    public void partirChrono() {
        this.tempsexecution = System.nanoTime();
    }
    
    public void arretChrono() {
        this.tempsexecution = System.nanoTime() - tempsexecution;
    }
    
    public long getTempsExecution(){
        return this.tempsexecution;
    }
    
    
}
