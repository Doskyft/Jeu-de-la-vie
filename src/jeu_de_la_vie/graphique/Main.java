/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeu_de_la_vie.graphique;

import static java.lang.Thread.sleep;
import jeu_de_la_vie.core.LaVie;

/**
 *
 * @author Girard Emilie / Hebert Damien
 */
public class Main {
    
    public static void main(String args[]) throws Exception {
       LaVie.getInstance().a();
       //LaVie.getInstance().executionDeLaVie();

       new FenetrePrincipale(LaVie.getInstance());
       
       while(true) {
           LaVie.getInstance().executionDeLaVie();
           sleep(400);
       }

    }
    
}
