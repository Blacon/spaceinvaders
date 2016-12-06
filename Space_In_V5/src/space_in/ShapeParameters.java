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
public class ShapeParameters {
    int x;
    int y;
    int width;
    int height;
    Color color;

    public ShapeParameters(int x, int y, int width, int height, Color color) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
    }
}

//sides
//g.setColor(Color.LIGHT_GRAY);
//
//        g.fillRect(x-16, y+8, 16, 8);
//        g.fillRect(x+64, y+8, 16, 8);

//tu
//g.fillRect(x+28, y-8, 8, 8);