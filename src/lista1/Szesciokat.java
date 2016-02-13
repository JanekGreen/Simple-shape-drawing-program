/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

/**
 *
 * @author pawel
 */
public class Szesciokat extends  Figura{

    
   Szesciokat(int _x, int _y, int _szerokosc,int _wysokosc, Color kolor)
    {
        super(_x,_y,_szerokosc,_wysokosc,kolor);
    
    } 
    
    @Override
    public void rysuj(Graphics g) {
            
        
            
        Polygon szesciokat = new Polygon();
                    
            for(int i=0; i<6; i++) {
                 szesciokat.addPoint((int)(x + wysokosc*Math.cos(i*2*Math.PI/6)), (int)(y + wysokosc*Math.sin(i*2*Math.PI/6)));
}
            g.setColor(kolor);
            g.fillPolygon(szesciokat);
       
    }
    
}
