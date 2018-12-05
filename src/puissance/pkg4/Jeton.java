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
public class Jeton{
    protected int Ligne;
    protected int Colonne;
    protected int Joueur;       // 1 = Joueur : 2 = IA
    
    public Jeton(){
        this.Ligne = 0;
        this.Colonne = 0;
        this.Joueur = 0;
    }
    
    public Jeton(int _x, int _y, int _joueur){
        this.Ligne = _x;
        this.Colonne = _y;
        this.Joueur = _joueur;
    }

    /**
     * @return the Ligne
     */
    public int getLigne() {
        return Ligne;
    }

    /**
     * @param Ligne the Ligne to set
     */
    public void setLigne(int Ligne) {
        this.Ligne = Ligne;
    }

    /**
     * @return the Colonne
     */
    public int getColonne() {
        return Colonne;
    }

    /**
     * @param Colonne the Colonne to set
     */
    public void setColonne(int Colonne) {
        this.Colonne = Colonne;
    }

    /**
     * @return the Joueur
     */
    public int getJoueur() {
        return Joueur;
    }

    /**
     * @param Joueur the Joueur to set
     */
    public void setJoueur(int Joueur) {
        this.Joueur = Joueur;
    }
    

}
