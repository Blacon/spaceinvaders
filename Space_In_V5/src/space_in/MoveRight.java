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
public class MoveRight extends MoveAlgorithm {

    public MoveRight(int moveMargin, int moveDownMargin, int tickTimes) {
        super(moveMargin, moveDownMargin, tickTimes);
    }
    
    @Override
    public int move() {
        
        long sec = System.currentTimeMillis() / speed;
        
        if(sec != lastSec && tick <= tickTimes)
        {
            tick++;
            lastSec = sec;
            return moveMargin;
        }
        return 0;
    }

    @Override
    public int moveDown() {
        long sec = System.currentTimeMillis() / speed;
        
        if(sec != lastSec && tick == (tickTimes + 1))
        {
            tick++;
            return moveDownMargin;
        }
        return 0;
    }

    @Override
    public boolean changeAlgorithm() {
        long sec = System.currentTimeMillis() / speed;
        if(sec != lastSec && tick >= (tickTimes + 2))
        {
            tick = 0;
            return true;
        }
        return false;
    }
}
