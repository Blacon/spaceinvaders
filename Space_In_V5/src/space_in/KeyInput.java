/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package space_in;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 *
 * @author Vilius
 */
public class KeyInput extends KeyAdapter{
    
    private final Handler handler;
    private int playerId;
    
    public KeyInput(Handler handler)
    {
        this.handler = handler;
    }
    
    public void setPlayerId(int id)
    {
        playerId = id;
    }
    
    
    @Override
    public void keyPressed(KeyEvent e)
    {
        int key = e.getKeyCode();
        
        GameObject tempObject = handler.objects.get(playerId);
        
        if(key == KeyEvent.VK_A)
            tempObject.setVelX(-5);  
        if (key == KeyEvent.VK_D)
            tempObject.setVelX(5);
//        if(key == KeyEvent.VK_SPACE)
//        {
//            
//        }
    }
    
    
    @Override
    public void keyReleased(KeyEvent e)
    {
        int key = e.getKeyCode();
        
        GameObject tempObject = handler.objects.get(playerId);
        
        if(key == KeyEvent.VK_A)
            tempObject.setVelX(0);  
        if (key == KeyEvent.VK_D)
            tempObject.setVelX(0);
    }
}
