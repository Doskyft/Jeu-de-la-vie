/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeu_de_la_vie;

import java.util.Scanner;


/**
 *
 * @author Girard Emilie / Hebert Damien
 */
public class JeuVie {
  
    private static final int size = 25;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LaVie vie = new LaVie();
        int table[][] = new int[size][size];
        
        table = vie.a(table);
        
        Scanner sc = new Scanner(System.in);
        
        while (true) {  
            vie.display(table); 
            table = vie.executionDeLaVie(size, table);
            sc.next(); // Entrer un caractere puis entrer pour passer a l'étape suivante
        }

    }   
}
