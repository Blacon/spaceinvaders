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
public class DynamicGameObjectFactory extends AbstractFactory {

    private Handler handler;
    private Bullet bullet;
    
    public DynamicGameObjectFactory() {}
    public DynamicGameObjectFactory(Bullet bullet)
    {
        this.bullet = bullet;
    }
    public DynamicGameObjectFactory(Handler handler, Bullet bullet)
    {
        this.handler = handler;
        this.bullet = bullet;
    }
    
    @Override
    public GameObjectDynamic createObject(int x, int y, ID id, int width, int height) {
        GameObjectDynamic object = null;
        
        switch (id) {
            case Player:
                
                object = new Player(x, y, id, width, height);
                break;
            case Enemy:
                object = new Enemy(x, y, id, width, height, handler, bullet);
                break;
            case Bullet:
                Bullet freshBullet = bullet.makeCopy();
                freshBullet.setId(id);
                freshBullet.setX(x);
                freshBullet.setY(y);
                object = freshBullet;
                break;
            default:
                System.err.println("When creating object unimplemented/unexisting id (" + id +  ")was set. Check \"GameObjectFactory.java\" class");
                break;
            
        }
        return object;    
    }
   
}
