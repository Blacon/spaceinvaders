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
public class BaseRect extends Shape{

    private final ShapeParameters parameters;
    public BaseRect(ShapeParameters parameters)
    {
        //this.parameters = new ShapeParameters();
        this.parameters = parameters;
    }
    
    @Override
    public ArrayList<ShapeParameters> addRect() {
        rectList.add(parameters);
        return rectList;
    }
    
}
