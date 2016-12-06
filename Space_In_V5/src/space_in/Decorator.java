/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package space_in;

import java.util.ArrayList;

/**
 *
 * @author Vilius
 */
public class Decorator extends Shape{
    private final Shape shape;
    
    public Decorator(Shape shape)
    {
        this.shape = shape;
    }
    
    @Override
    public ArrayList<ShapeParameters> addRect() {
        return shape.addRect();
    }
    
}
