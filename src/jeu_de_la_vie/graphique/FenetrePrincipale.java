/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeu_de_la_vie.graphique;
import jeu_de_la_vie.core.*;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.Observable;
import java.util.Observer;
import javax.swing.*;

/**
 *
 * @author doskyft
 */
public class FenetrePrincipale extends JFrame implements Observer {       
    LaVie vie = LaVie.getInstance();
    
    public FenetrePrincipale() {
        super("La vie - the game");
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 500);
        setResizable(false);
        setLocationRelativeTo(null);
        
        vie.a();
        vie.display();
        
        int[][] table = vie.getTable();
        JPanel[][] cells = new JPanel[vie.getSize()][vie.getSize()];
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                
                cells[i][j] = new JPanel();
                
                if (table[i][j] == 0) {
                    cells[i][j].setBackground(Color.WHITE);
                } else {
                    cells[i][j].setBackground(Color.BLACK);
                }
                
                cells[i][j].setPreferredSize(new Dimension(500/vie.getSize(), 500/vie.getSize()));
                

            }
        }
        
        JPanel grid = new JPanel();
        grid.setPreferredSize(new Dimension(500, 500));
        grid.setBackground(Color.YELLOW);
        grid.setLayout(new GridBagLayout());
        
        GridBagConstraints[][] gbcs = new GridBagConstraints[vie.getSize()][vie.getSize()];
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                gbcs[i][j] = new GridBagConstraints();
                
                gbcs[i][j].gridx = i;
                gbcs[i][j].gridy = j;
                
                gbcs[i][j].gridheight = 1;
                gbcs[i][j].gridwidth = 1;
                
                grid.add(cells[i][j], gbcs[i][j]);
            }
        }  
        
        setContentPane(grid);
        setVisible(true);
    
    }
    public void update(Observable o, Object arg) {
        repaint();
    }
}
