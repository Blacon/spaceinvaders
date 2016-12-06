package space_in;

import java.awt.Graphics;


public abstract class GameObject {
    protected int x, y;
    protected ID id;
    protected int velX, velY;
    protected int width, height;
    
    public GameObject(int x, int y, ID id, int width, int height){
        this.x = x;
        this.y = y;
        this.id = id;
        this.width = width;
        this.height = height;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public ID getId() {
        return id;
    }
    public int getVelX() {
        return velX;
    }
    public int getVelY() {
        return velY;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public void setId(ID id) {
        this.id = id;
    }
    public void setVelX(int velX) {
        this.velX = velX;
    }
    public void setVelY(int velY) {
        this.velY = velY;
    }
    
//    @Override
//    public boolean equals(Object obj)
//    {
//        if(!GameObject.class.isAssignableFrom(obj.getClass()))
//        {
//            return false;
//        }
//        final GameObject other = (GameObject) obj;
//        if(this.height != other.height || this.width != other.width)
//        {
//            return false;
//        }
//        if(this.id != other.id)
//        {
//            return false;
//        }
//        if(this.x != other.x || this.y != other.x)
//        {
//            return false;
//        }
//        
//        return true;
//    }
    
    public abstract void tick();
    public abstract void render(Graphics g);
}
