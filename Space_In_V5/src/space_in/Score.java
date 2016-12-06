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
public class Score extends GameObjectStatic{

    public Score(int x, int y, ID id, int width, int height) {
        super(x, y, id, width, height);
    }

    @Override
    public void tick() {
       
    }

    @Override
    public void render(Graphics g) {
        g.setColor(Color.BLUE);
        g.fillRect(x, y, width, height);
    }
    
}
