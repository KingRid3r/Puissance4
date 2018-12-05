/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puissance.pkg4;

/**
 *
 * @author utilisateur
 */
public class Joueur {
    
        
    protected boolean JoueurReel;         // true = Joueur, false = IA
    
    
    public Joueur(){
        // Constructeur par défaut
        JoueurReel = true;
    }
    
    public Joueur(boolean joueur){
        // Constructeur
        JoueurReel = joueur;
    }

    /**
     * @return the JoueurReel
     */
    public boolean isJoueurReel() {
        return JoueurReel;
    }

    /**
     * @param JoueurReel the JoueurReel to set
     */
    public void setJoueurReel(boolean JoueurReel) {
        this.JoueurReel = JoueurReel;
    }
    
        // Use for the AI
    public int Jouer(){
        
        return 1;
    };

}


