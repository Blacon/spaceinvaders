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
public class Handler {
    ArrayList<GameObject> objects = new ArrayList<>();
    ArrayList<GameObject> bullets = new ArrayList<>();
    
    public synchronized void tick()
    {
        objects.stream().forEach((obj) -> {
            obj.tick();
        });
        objects.addAll(bullets);
        bullets.clear();
    }
    
    public void render(Graphics g)
    {
        //System.out.println(objects.size());
        objects.stream().forEach((obj) -> {
            obj.render(g);
        });
    }
    
    public void addObject(GameObject object)
    {
        
        objects.add(object);
    }
    public void addBullet(GameObject object)
    {
        
        bullets.add(object);
    }
    
    public void removeObject(GameObject object)
    {
        objects.remove(object);
    }
    
    
}
