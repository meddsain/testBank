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
public class CompteBanc {
    private double numero;
    private String proprietaire;
    protected double solde;
    private String dateOuverture;
    
    public CompteBanc(){
    }
    
    public CompteBanc(double numero, String proprio, double solde, String dateOuv){
        this.numero=numero;
        this.proprietaire=proprio;
        this.solde=solde;
        this.dateOuverture=dateOuv;
        }

    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }

    public String getProprietaire() {
        return proprietaire;
    }

    public void setProprietaire(String proprietaire) {
        this.proprietaire = proprietaire;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public String getDateOuverture() {
        return dateOuverture;
    }

    public void setDateOuverture(String dateOuverture) {
        this.dateOuverture = dateOuverture;
    }

    @Override
    public String toString() {
        return "CompteBanc:" + "numero=" + numero + ", proprietaire=" + proprietaire + ", solde=" + solde + ", dateOuverture=" + dateOuverture;
    }
    
    
    
}
