/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package space_in;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Vilius
 */
public class Bullet extends GameObjectDynamic implements Cloneable{

    public Bullet(int x, int y, ID id, int width, int height) {
        super(x, y, id, width, height);
        velY = 2;
    }

    @Override
    public void tick() {
        y += velY;
    }

    @Override
    public void render(Graphics g) {
        g.setColor(Color.red);
        g.fillRect(x, y, width, height);
    }
    
    public Bullet makeCopy()
    {
        try {
            Bullet newB = (Bullet) super.clone();
            return newB;
        } catch (CloneNotSupportedException e){
            e.printStackTrace();   
        }
        return null;
    }
    
}
