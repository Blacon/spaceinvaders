/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package space_in;

import java.awt.Graphics;
import java.util.ArrayList;

/**
 *
 * @author Vilius
 */
public class Wall extends GameObjectStatic{

    private final ArrayList<ShapeParameters> rectList;
    public Wall(int x, int y, ID id, int width, int height, ArrayList<ShapeParameters> rectList) {
        super(x, y, id, width, height);
        this.rectList = rectList;
    }
    
    
    @Override
    public void tick() {
        
    }

    @Override
    public void render(Graphics g) {
        
        
        rectList.stream().map((r) -> {
            g.setColor(r.color);
            return r;
        }).forEach((r) -> {
            g.fillRect(r.x, r.y, r.width, r.height);
        });
    }
}
