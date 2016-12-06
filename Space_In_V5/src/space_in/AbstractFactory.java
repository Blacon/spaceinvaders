/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package space_in;

/**
 *
 * @author Vilius
 */
public abstract class AbstractFactory {
    AbstractFactory(){}
    
    public abstract GameObject createObject(int x, int y, ID id, int width, int height);
}
