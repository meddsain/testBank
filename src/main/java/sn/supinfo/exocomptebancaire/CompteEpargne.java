/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.supinfo.exocomptebancaire;

/**
 *
 * @author MHDN
 */
public class CompteEpargne extends CompteBanc{
    private float taux;
    
    
    public CompteEpargne(){
        super();
    }
    
    public CompteEpargne(double numero, String proprio, double solde, String dateOuv, float taux){
        super(numero, proprio, solde, dateOuv);
        this.taux=taux;
        
    }
    public void interet(float taux){
        solde=solde+(solde*taux/100);
    }
    
    public float getTaux() {
        return taux;
    }

    public void setTaux(float taux) {
        this.taux = taux;
    }

    @Override
    public String toString() {
        return super.toString() + "taux=" + taux;
    }
    
    
    
}
