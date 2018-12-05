/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puissance.pkg4;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import java.awt.Image;

/**
 *
 * @author utilisateur
 */
public class Jeton extends javax.swing.JPanel{
    protected int Ligne;
    protected int Colonne;
    protected int Joueur;       // 1 = Joueur : 2 = IA : 0 = rien
    
    Image jetonimg = new ImageIcon(getClass().getResource("images/PionVide.png")).getImage();
    public static final int Hauteur = -2;
    public static final int Largeur = 0;

    
    public Jeton(){
        initComponents();
        Dimension size = new Dimension(71 + 8, 71 + 8);
        setPreferredSize(size);
        setMinimumSize(size);
        setMaximumSize(size);
        setSize(size);
        setLayout(null);
        this.setVisible(true);
        
        
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
    
    private void initComponents() {

        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }
    
     public void ChangerCouleur(int joueur) {
         if(joueur == 1){
             this.jetonimg = new ImageIcon(getClass().getResource("images/PionRouge.png")).getImage();
         }else if(joueur == 2){
             this.jetonimg = new ImageIcon(getClass().getResource("images/PionJaune.png")).getImage();
         }
         
     }
    
    @Override
    public void paintComponent(Graphics g) {
      g.drawImage(this.jetonimg, 10 + this.Hauteur, 10 + this.Largeur, null);
    }
    

}
