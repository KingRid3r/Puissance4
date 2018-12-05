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
    
        
    protected boolean TourJoueur; 
    protected int NumeroJoueur;
    
    
    
    public Joueur(){
        // Constructeur par défaut
        TourJoueur = false;
    }
    
    public Joueur(int i){
        NumeroJoueur = i; 
    }

    /**
     * @return the JoueurReel
     */
    public boolean isTourJoueur() {
        return TourJoueur;
    }

    /**
     * @param TourJoueur the JoueurReel to set
     */
    public void setJoueurReel(boolean TourJoueur) {
        this.TourJoueur = TourJoueur;
    }

    /**
     * @return the NumeroJoueur
     */
    public int getNumeroJoueur() {
        return NumeroJoueur;
    }

    /**
     * @param NumeroJoueur the NumeroJoueur to set
     */
    public void setNumeroJoueur(int NumeroJoueur) {
        this.NumeroJoueur = NumeroJoueur;
    }
    

}


