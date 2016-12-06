package space_in;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Vilius
 */
public class Player extends GameObjectDynamic{

    public Player(int x, int y, ID id, int width, int height) {
        super(x, y, id, width, height);
        
    }

    @Override
    public void tick() {
        x += velX;
        y += velY;
    }

    @Override
    public void render(Graphics g) {
        g.setColor(Color.red);
        g.fillRect(x, y, width, height);
    }
    
}
