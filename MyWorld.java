import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author Daniel 
 * @version 1.00
 */
public class MyWorld extends World
{

    SimpleTimer TargetTimer = new SimpleTimer();
    public MyWorld()
    {    
        super(1000, 1000, 1, false);
        
        TargetTimer.mark();
        
        bow bow = new bow();
        
        addObject(bow, -10, -10);
    }
    public void createTarget()
    {
        Target target = new Target();
        addObject(target,10,10);
        int x=Greenfoot.getRandomNumber(1000);
        int y=Greenfoot.getRandomNumber(1000);
        addObject(target,x,y);
    }
    public void act(){
        if(TargetTimer.millisElapsed() > 1000){
            createTarget();
            createTarget();
            createTarget();
            TargetTimer.mark();
        }
    }


}
