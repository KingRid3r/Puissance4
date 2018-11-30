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
public class Jeton {
    private int x;
    private int y;
    private int joueur;
    public Jeton(int _x, int _y, int _joueur){
        this.x = _x;
        this.y = _y;
        this.joueur = _joueur;
    }
    int getX(){return this.x;}
    int getY(){return this.y;}
    int getJoueur(){return this.joueur;}
}
