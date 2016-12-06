/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package space_in;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;

/**
 *
 * @author Vilius
 */
public class Space_In extends Canvas implements Runnable{

    public static final int WIDTH = 640, HEIGHT = WIDTH / 12 * 9;
    private transient Thread thread;
    private boolean running = false;
    private transient final KeyInput keyInput;
    private transient final Handler handler;
    //private GameObjectFactory factory;
    private transient final DynamicGameObjectFactory factoryDyn;
    private transient final StaticGameObjectFactory factoryStc;
    
    
    public Space_In(){
        
        handler = new Handler();
        this.addKeyListener(keyInput = new KeyInput(handler));
        new Window(WIDTH, HEIGHT, "Space Invaders", this);

        factoryDyn = new DynamicGameObjectFactory(handler, new Bullet(-500, -500, ID.Bullet, 4, 10));
        factoryStc = new StaticGameObjectFactory();
        handler.addObject(factoryDyn.createObject(100, 420, ID.Player, 32, 16));
        keyInput.setPlayerId(handler.objects.size() - 1);
        handler.addObject(factoryStc.createObject(240, 380, ID.Wall, 64, 16));

        loadEnemies();
        
    }
    
    public synchronized void start(){
        thread = new Thread(this);
        thread.start();
        running = true;
    }
    public synchronized void stop(){
        try{
            thread.join();
            running = false;
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new Space_In();
    }

    @Override
    public void run() {
        long lastTime = System.nanoTime();
        double amountOfTicks = 60.0;
        double ns = 1000000000 / amountOfTicks;
        double delta = 0;
        long timer = System.currentTimeMillis();
        int frames = 0;
        synchronized (this)
        {
            while(running){
                long now = System.nanoTime();
                delta += (now - lastTime) / ns;
                lastTime = now;
                while(delta >= 1)
                {
                    tick();
                    delta--;
                }
                if(running)
                    render();
                frames++;

                if(System.currentTimeMillis() - timer > 1000){
                    timer += 1000;
                    //System.out.println("FPS: " + frames);
                    frames = 0;
                }
            }
        }
        stop();
    }
    
    private void tick(){
        handler.tick();
    }
    private void render(){
        BufferStrategy bs = this.getBufferStrategy();
        if(bs == null)
        {
            this.createBufferStrategy(3);
            return;
        }
        
        Graphics g = bs.getDrawGraphics();
        
        g.setColor(Color.black);
        g.fillRect(0, 0, WIDTH, HEIGHT);
        
        handler.render(g);
        
        g.dispose();
        bs.show();
    }
    
    private void loadEnemies(){
        int x = 64;
        int y;
        for(int i = 0; i < 12; i++)
        {
            y = 64;
            for(int j = 0; j < 5; j++)
            {
                handler.addObject(factoryDyn.createObject(x, y, ID.Enemy, 16, 8));
                y = y + 16;
            }
            x = x + 24;
        }
        
       
    }
    
}
