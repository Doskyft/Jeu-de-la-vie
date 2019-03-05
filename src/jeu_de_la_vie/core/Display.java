/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeu_de_la_vie.core;

import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author doskyft
 */
public class Display extends JPanel {
    public void paintComponent(Graphics g, final int[][] table){
        int x = 0; int y = 0;
        for (final int[] cellules: table) {
            for (final int cellule: cellules) {
                if (cellule == 0) {
                    g.drawRect(x * table.length/400, y + table.length/400, table.length/400, table.length/400);
                } 
                else {
                    g.fillRect(x * table.length/400, y * table.length/400, table.length/400, table.length/400);
                }
            }
        }
    }
}
