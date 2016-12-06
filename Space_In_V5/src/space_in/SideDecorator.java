/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package space_in;

import java.awt.Color;
import java.util.ArrayList;

/**
 *
 * @author Vilius
 */
public class SideDecorator extends Decorator{

    public SideDecorator(Shape shape) {
        super(shape);
    }
    
    @Override
    public ArrayList<ShapeParameters> addRect()
    {
        ArrayList<ShapeParameters> s = super.addRect();
        s.add(new ShapeParameters(s.get(0).x-16, s.get(0).y+8, 16, 8, Color.LIGHT_GRAY));
        s.add(new ShapeParameters(s.get(0).x+64, s.get(0).y+8, 16, 8, Color.LIGHT_GRAY));
        return s;
    }
}
