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
public class Trojkat extends Figura{

    
    Trojkat(int _x, int _y, int _szerokosc,int _wysokosc, Color kolor)
    {
        super(_x,_y,_szerokosc,_wysokosc,kolor);
    
    }
    
    @Override
    public void rysuj(Graphics g) {
        
        g.setColor(kolor);
        Polygon poly = new Polygon();
        poly.addPoint(x, y); 
        poly.addPoint(x-szerokosc/2, y+wysokosc);
        poly.addPoint(x+szerokosc/2, y+wysokosc);
        
        g.setColor(kolor);
        g.fillPolygon(poly);
    }
    
}
