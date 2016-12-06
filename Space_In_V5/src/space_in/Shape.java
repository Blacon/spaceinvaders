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
public abstract class Shape {
    public ArrayList<ShapeParameters> rectList = new ArrayList<>();
    public abstract ArrayList<ShapeParameters> addRect();
}
