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
public class CompteCourant extends CompteBanc{
    private double decouvert;
    
    public CompteCourant(){
        super();
    }
    
    public CompteCourant(double numero, String proprio, double solde, String dateOuv, double decouvert){
        super(numero, proprio, solde, dateOuv);
        this.decouvert=decouvert;
    }
    public void deposer(double dep){
        this.solde+=dep;
    }
    public void retirer(double ret){
        this.solde-=ret;
    }

    public double getDecouvert() {
        return decouvert;
    }

    public void setDecouvert(double decouvert) {
        this.decouvert = decouvert;
    }

    @Override
    public String toString() {
        return super.toString() + "decouvert=" + decouvert;
    }
    
    
    
}
