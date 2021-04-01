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
public class TestCompteBanc {
    public static void main(String[] args){
        CompteBanc cb=new CompteBanc();
        cb.setNumero(142500000);
        cb.setProprietaire("Nadia CABO");
        cb.setSolde(1300000.00);
        cb.setDateOuverture("17-12-2017");
        
        CompteCourant cc=new CompteCourant(125400051,"Mark Dutroux",800000,"27-04-2015",1750000);
        
        CompteEpargne ce=new CompteEpargne(548210000,"Mousapha GUEYE",2500000,"14-01-2012", (float) 0.05);
        
        System.out.println("===========================================================================");
        System.out.println("===========================================================================");
        System.out.println(cb);
        System.out.println("===========================================================================");
        System.out.println(cc);
        System.out.println("===========================================================================");
        System.out.println(ce);
        System.out.println("L'interet de votre compte epargne est :"+ ce.getSolde());
    
    }
}
