import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Endscreen here.
 * 
 * @author Daniel
 * @version Jan,16,2023
 */
public class Endscreen extends World
{

    /**
     * Constructor for objects of class Endscreen.
     * 
     */
    public Endscreen()
    {   
        //creation of victory & continuation labels
        super(800, 350, 1); 
        Label end = new Label("Victory",100);
        addObject(end,400,150);
        Label continue1 = new Label("press space to continue",60);
        addObject(continue1,400,200);
    }
    public void act()
    {
        //allows the reader to replay
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
}
