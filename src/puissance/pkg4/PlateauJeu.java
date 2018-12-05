/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puissance.pkg4;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Image;
import java.awt.Dimension;
import java.awt.Graphics;
/**
 *
 * @author simon
 */
public class PlateauJeu extends javax.swing.JPanel {

    int SizeX =7;
    int SizeY =7;
    Jeton [][] Plateau = new Jeton [SizeX][SizeY];
    
    Joueur j1 = new Joueur(1);
    IA ia = new IA(2);
    
    Image plateau;
    /**
     * Creates new form PlateauJeu
     */
    public PlateauJeu() {
                initComponents();        
        this.plateau = new ImageIcon(getClass().getResource("images/plateau.png")).getImage();
        Dimension size = new Dimension(this.plateau.getWidth(null), this.plateau.getHeight(null));
        setPreferredSize(size);
        setMinimumSize(size);
        setMaximumSize(size);
        setSize(size);
        setLayout(null);
        this.setVisible(true);
        
            // Création des Cases
        for (int i=0; i<SizeX; i++)
	{
            for (int j=0; j<SizeY ; j++)
            {
                Plateau [i] [j] = new Jeton(j,i,0);
            }
	}
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
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
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void paintComponent(Graphics g) {
      g.drawImage(this.plateau, 0, 0, null);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

    void PlacerJeton(int colonne){
       for(int i=0; i<SizeY; i++){
           if(Plateau[i][colonne].getJoueur() != 0){
               // TODO Update the color of the Jeton;
           }
       }
    }
    
    void ChangerJoueur(){
        if(j1.isTourJoueur()){
            j1.setJoueurReel(false);
            ia.setJoueurReel(true);
        }
        else{
            j1.setJoueurReel(true);
            ia.setJoueurReel(false);
        }
    }
    
    boolean FinPartie(Joueur j){
        
        return false;
    }

}
