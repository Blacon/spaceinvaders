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
public abstract class MoveAlgorithm {
    
    protected int moveMargin;
    protected int moveDownMargin;
    protected int tick;
    protected int tickTimes;
    protected long lastSec;
    protected int speed;

    public MoveAlgorithm(int moveMargin, int moveDownMargin, int tickTimes) {
        this.moveMargin = moveMargin;
        this.moveDownMargin = moveDownMargin;
        this.tickTimes = tickTimes;
        this.lastSec = System.currentTimeMillis() / 1000;
        this.tick = 0;
        this.speed = 1000;
    }
    public abstract int move();
    public abstract int moveDown();
    public abstract boolean changeAlgorithm();
    public void changeSpeed()
    {
        switch (speed){
            case 1000:
                speed = 700;
                break;
            case 700:
                speed = 500;
                break;
            case 500:
                speed = 300;
                break;
            case 300:
                speed = 200;
                break;
            case 200:
                speed = 150;
                break;
            case 150:
                speed = 100;
                break;
            case 100:
                speed = 50;
                break;
            default:
                speed = 50;
                break;
        }
    }
}
