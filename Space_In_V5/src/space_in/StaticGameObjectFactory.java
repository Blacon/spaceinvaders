/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package space_in;

import java.awt.Color;

/**
 *
 * @author Vilius
 */
public class StaticGameObjectFactory extends AbstractFactory {

    @Override
    public GameObjectStatic createObject(int x, int y, ID id, int width, int height) {
        GameObjectStatic object = null;
        
        switch (id) {
            case Score:
                
                object = new Score(x, y, id, width, height);
                break;
            case Wall:
                Shape shape = new SideDecorator( new TurretDecorator( new BaseRect(new ShapeParameters(x, y, width, height, Color.YELLOW))));
                object = new Wall(x, y, id, width, height, shape.addRect());
                break;
            default:
                System.err.println("When creating object unimplemented/unexisting id (" + id +  ")was set. Check \"GameObjectFactory.java\" class");
                break;
            
        }
        return object;    
    
    }
    
}
