/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeu_de_la_vie;

/**
 *
 * @author Girard Emilie / Hebert Damien
 */
public class LaVie {
      
    public void display(final int table[][]) {
        for (final int[] cellules: table) {
            System.out.print("   ");
            for (final int cellule: cellules) {
                if (cellule == 0) {
                    System.out.print("   ");
                } 
                else {
                    System.out.print(" * ");
                }
            }
            System.out.println("");
        }
    }
    
    public int[][] executionDeLaVie(final int size, final int[][] table) {
        int tableTmp[][] = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int pixelOn = 0;
                for (int x = i-1; x <= i+1; x++) {
                    for (int y = j-1; y <= j+1; y++) {
                        if (x >= 0 && x < size && y >= 0 && y < size) {
                            if (table[x][y] == 1) {
                                pixelOn++;
                            }
                        }
                    }
                }
                if (pixelOn < 3 || pixelOn > 4) {
                    tableTmp[i][j] = 0;
                } else {
                    tableTmp[i][j] = 1;
                }
            }
        }
        return tableTmp;
    }
    
    
    public int[][] a(int[][] table) {
        table[8][8] = 1;
        table[7][9] = 1;
        table[7][10] = 1;
        table[7][11] = 1;
        table[9][9] = 1;        
        table[9][10] = 1;
        table[9][11] = 1;
        table[8][12] = 1;
        return table;
    }
    
    public int[][] b(int[][] table) {
        table[8][8] = 1;
        table[9][8] = 1;
        table[9][9] = 1;
        table[8][9] = 1;
        return table;
    }
    
    public int[][] c(int[][] table) {
        table[8][8] = 1;
        table[9][8] = 1;
        table[10][8] = 1;
        return table;
    }
    
    public int[][] d(int[][] table) {
        table[8][8] = 1;
        table[10][8] = 1;
        return table;
    }
}
