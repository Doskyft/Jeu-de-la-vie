package jeu_de_la_vie.graphique;
import jeu_de_la_vie.core.*;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.Observable;
import java.util.Observer;
import javax.swing.*;

/**
 *
 * @author Girard Emilie / Hebert Damien
 */
public class FenetrePrincipale extends JFrame implements Observer {       
    
    private LaVie vie;
    
    private JPanel[][] cells = new JPanel[LaVie.getInstance().getSize()][LaVie.getInstance().getSize()];
            
    public FenetrePrincipale(LaVie vie) {
        super("La vie - the game");
              
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 500);
        setResizable(false);
        setLocationRelativeTo(null);
        
        this.vie = vie;
        vie.addObserver(this);
        
        int[][] table = vie.getTable();      
        
        JPanel grid = new JPanel();
        grid.setLayout(new GridBagLayout());
        
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                
                cells[i][j] = new JPanel();
                
                GridBagConstraints gbc = new GridBagConstraints();
                
                gbc.gridx = i;
                gbc.gridy = j;
                
                gbc.gridheight = 1;
                gbc.gridwidth = 1;
                
                grid.add(cells[i][j], gbc);
            }
        }
        
        setContentPane(grid);
        setVisible(true);
    
    }
    
    @Override
    public void update(Observable o, Object arg) {
        int[][] table = vie.getTable();
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                if (table[i][j] == 0) {
                    cells[i][j].setBackground(Color.WHITE);
                } else {
                    cells[i][j].setBackground(Color.BLACK);
                }
            }    
        }
        //repaint();
    }
}
