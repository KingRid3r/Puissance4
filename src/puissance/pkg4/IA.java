/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puissance.pkg4;

/**
 *
 * @author simon
 */
public class IA extends Joueur {
    
    Jeton DernierJetonJoue;
    
    public IA (int i, boolean tour){
        super(i,tour);
        DernierJetonJoue = new Jeton(-1,-1,i);
    }
    
    public int MeilleurPlacer(){
        int Placement = 0;
        
        java.util.Random r = new java.util.Random();
            Placement = r.nextInt(7);
        
            // Premier tour de l'ia
//        if(DernierJetonJoue.getLigne() == -1 && DernierJetonJoue.getColonne() == -1){          
//            java.util.Random r = new java.util.Random();
//            Placement = r.nextInt(7);
//        }
//        else{
//            // TODO : Find the best place
//            
//        }
  
        return Placement;
    }
    
    public void SetDernierJetonJoue(int colonne, int ligne){
        this.DernierJetonJoue.setColonne(colonne);
        this.DernierJetonJoue.setLigne(ligne);
    }
}
