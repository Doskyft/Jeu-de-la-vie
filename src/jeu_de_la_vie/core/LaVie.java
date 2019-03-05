/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeu_de_la_vie.core;

/**
 *
 * @author Girard Emilie / Hebert Damien
 */
public class LaVie {
    
    private static LaVie instance = null; 
     
     
    public static LaVie getInstance() {
        if( instance != null )
            return instance;
        else
            return ( instance = new LaVie() );
    }
    
    private final int size = 25;
    private int table[][] = new int[size][size];
    
    public int[][] getTable() { return table; }
    public int getSize() { return size; }
    
    public void display() {
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
    
    public void executionDeLaVie() {
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
        table = tableTmp;
    }
    
    
    public void a() {
        table[8][8] = 1;
        table[7][9] = 1;
        table[7][10] = 1;
        table[7][11] = 1;
        table[9][9] = 1;        
        table[9][10] = 1;
        table[9][11] = 1;
        table[8][12] = 1;
    }
    
    public void b() {
        table[8][8] = 1;
        table[9][8] = 1;
        table[9][9] = 1;
        table[8][9] = 1;
    }
    
    public void c() {
        table[8][8] = 1;
        table[9][8] = 1;
        table[10][8] = 1;
    }
    
    public void d() {
        table[8][8] = 1;
        table[10][8] = 1;
    }
}
