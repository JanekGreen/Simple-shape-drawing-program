/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista1;

import java.awt.Color;
import java.awt.Graphics;
import java.io.Serializable;

/**
 *
 * @author pawel
 */
public abstract class Figura implements Serializable {
      int szerokosc;
      int wysokosc;
      int x;
      int y;
      Color kolor;
      
        public Figura(int _x, int _y, int _szerokosc,int _wysokosc, Color _kolor){
    
        this.x =_x;
        this.y =_y;
        this.szerokosc =_szerokosc;
        this.wysokosc=_wysokosc;
        this.kolor = _kolor;
    
    }
    
    public abstract void rysuj(Graphics g);
    
        
    
}
