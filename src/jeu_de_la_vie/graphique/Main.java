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
 * @author doskyft
 */
public class Main {
    
    public static void main(String args[]) throws Exception {
       new FenetrePrincipale();
       while(true) {
           LaVie.getInstance().executionDeLaVie();
           LaVie.getInstance().display();
           sleep(400);
       }

    }

    private static void process() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
