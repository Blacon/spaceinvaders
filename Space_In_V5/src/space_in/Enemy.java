package space_in;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

/**
 *
 * @author Vilius
 */
public class Enemy extends GameObjectDynamic{
    
    //private Handler handler;
    //private Bullet basicBullet;
    //private DynamicGameObjectFactory factory;
    private final ArrayList<MoveAlgorithm> algrothms;
    int useAlgorithm;
    
    public Enemy(int x, int y, ID id, int width, int height, Handler handler, Bullet bullet) {
        super(x, y, id, width, height);
        

        //this.handler = handler;
        //this.basicBullet = bullet;
        //factory = new DynamicGameObjectFactory(bullet);
        this.algrothms = new ArrayList<>();
        this.algrothms.add(new MoveRight(16, 16, 12));
        this.algrothms.add(new MoveLeft(-16, 16, 12));
        useAlgorithm = 0;
    }

    @Override
    public void tick() {
        x += velX;
        y += velY;
        
        //Logger log = Logger.getInstance();
        
        x += algrothms.get(useAlgorithm).move();
        
        y += algrothms.get(useAlgorithm).moveDown();
        
        if(algrothms.get(useAlgorithm).changeAlgorithm())
        {
            algrothms.get(0).changeSpeed();
            algrothms.get(1).changeSpeed();
            if(useAlgorithm == 0)
                useAlgorithm = 1;
            else
                useAlgorithm = 0;
        }
//            int spawnX = (x + width / 2) - 2;
//            int spawnY = (y + height);
//            handler.addBullet(factory.createObject(spawnX, spawnY, ID.Bullet, 4, 10));
//            //log.logMessage(tick);

    }

    @Override
    public void render(Graphics g) {
        g.setColor(Color.red);
        g.fillRect(x, y, width, height);
    }
    
}
