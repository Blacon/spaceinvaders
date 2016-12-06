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
public class TurretDecorator extends Decorator{

    public TurretDecorator(Shape shape) {
        super(shape);
    }
    @Override
    public ArrayList<ShapeParameters> addRect()
    {
        ArrayList<ShapeParameters> s = super.addRect();
        s.add(new ShapeParameters(s.get(0).x+25, s.get(0).y-8, 16, 8, Color.PINK));
        return s;
    }
}
